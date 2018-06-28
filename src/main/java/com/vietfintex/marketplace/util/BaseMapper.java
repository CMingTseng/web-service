package com.vietfintex.marketplace.util;

import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import ma.glasnost.orika.metadata.ClassMapBuilder;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.domain.Page;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class BaseMapper<Model, DTO> {

    private final static MapperFactory mapperDTOFactory = new DefaultMapperFactory.Builder().build();
    private final static MapperFactory mapperModelFactory = new DefaultMapperFactory.Builder().build();

    private Class<Model> model;
    private Class<DTO> dto;

    public BaseMapper(Class<Model> model, Class<DTO> dto) {
        ClassMapBuilder<Model, DTO> classMapDTOBuilder = mapperDTOFactory.classMap(model, dto);
        for (Field field: dto.getDeclaredFields()) {
            field.setAccessible(true);
            if (field.isAnnotationPresent(ExcludeFieldMapper.class)) {
                classMapDTOBuilder.exclude(field.getName());
            }
        }
        classMapDTOBuilder.constructorA()
                .constructorB()
                .byDefault()
                .register();

        ClassMapBuilder<Model, DTO> classMapModelBuilder = mapperModelFactory.classMap(model, dto);
        for (Field field: model.getDeclaredFields()) {
            field.setAccessible(true);
            if (field.isAnnotationPresent(ExcludeFieldMapper.class)) {
                classMapDTOBuilder.exclude(field.getName());
            }
        }
        classMapModelBuilder.constructorA()
                .constructorB()
                .byDefault()
                .register();
        this.dto = dto;
        this.model = model;
    }

    public DTO toDtoBean(Model model) {
        MapperFacade mapper = mapperDTOFactory.getMapperFacade();
        return mapper.map(model, dto);
    }

    public Model toPersistenceBean(DTO dtoBean) {
        MapperFacade mapper = mapperModelFactory.getMapperFacade();
        return mapper.map(dtoBean, model);
    }


    public List<DTO> toDtoBean(Iterable<Model> models) {
        List<DTO> dtoBeans = new ArrayList<>();
        if (models == null) return dtoBeans;
        for (Model model: models) {
            dtoBeans.add(toDtoBean(model));
        }
        return dtoBeans;
    }

    public List<DTO> toDtoBean(List<Model> models) {
        List<DTO> dtoBeans = new ArrayList<>();

        if (models == null) return dtoBeans;
        for (Model model: models) {
            dtoBeans.add(toDtoBean(model));
        }
        return dtoBeans;
    }

    public List<Model> toPersistenceBean(List<DTO> dtoBeans) {
        List<Model> models = new ArrayList<>();
        if (dtoBeans == null || dtoBeans.isEmpty()) return models;
        for (DTO dtoBean: dtoBeans) {
            models.add(toPersistenceBean(dtoBean));
        }
        return models;
    }


}
