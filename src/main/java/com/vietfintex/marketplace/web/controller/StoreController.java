package com.vietfintex.marketplace.web.controller;

import com.querydsl.core.types.Predicate;
import com.vietfintex.marketplace.persistence.model.Product;
import com.vietfintex.marketplace.persistence.repo.ImageRepo;
import com.vietfintex.marketplace.web.dto.*;
import com.vietfintex.marketplace.web.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.querydsl.binding.QuerydslPredicate;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/store")
public class StoreController {
    @Autowired
    StoreService storeService;
    @Autowired
    ImageRepo repo;

    @RequestMapping(value = "/getStoreList", method = RequestMethod.POST)
    @ResponseBody
    public ResponseDTO getStoreList(@RequestBody final StoreWrapDTO storeWrapDTO){
        ResponseDTO response = new ResponseDTO(false);
        try {
            if(storeWrapDTO != null){
                StoreDTO storeDTO = storeWrapDTO.getStoreDTO();
                if(storeDTO!= null){
                    List<StoreDTO> storeDTOList = storeService.getStoreList(storeDTO.getStoreId(),
                            storeDTO.getOwnerId(),storeDTO.getStoreName(),storeDTO.getAddress(),storeWrapDTO.getPage());
                    List<StoreDTO> returnObject = new ArrayList<>();
                    if(storeDTOList != null){
                        for (StoreDTO item : storeDTOList){
                            List<ImageLinkDTO> imageLinkDTOList = repo.getImageLinkByObject(item.getStoreId(),"STO");
                            item.setImageLinkDTOList(imageLinkDTOList);
                            returnObject.add(item);
                        }
                        response.setSuccess(true);
                        response.setObjectReturn(returnObject);
                        return response;
                    }
                }
            }
        }catch (Exception e){
            response.setErrorMessage("Có lỗi xảy ra: "+e.getMessage());
        }
        response.setErrorMessage("Không có quyền truy vấn");
        return response;
    }

    @RequestMapping(value = "/insertOrUpdateStore", method = RequestMethod.POST)
    @ResponseBody
    public ResponseDTO insertOrUpdateStore(@RequestBody final StoreDTO storeDTO){
        ResponseDTO response = new ResponseDTO(false);
        try {
            if(storeDTO != null){
                StoreDTO storeDTOReturn = storeService.insertOrUpdateStore(storeDTO);
                if(storeDTOReturn != null){
                    response.setSuccess(true);
                    response.setObjectReturn(storeDTOReturn);
                    return response;
                }
            }
        }catch (Exception e){
            response.setErrorMessage("Có lỗi xảy ra");
        }
        response.setErrorMessage("Không có quyền thêm/cập nhật cửa hàng");
        return response;
    }

    @RequestMapping(value = "/deleteStore")
    @ResponseBody
    public ResponseDTO deleteStore(@RequestBody final StoreDTO storeDTO){
        ResponseDTO response = new ResponseDTO(false);
        try {
            StoreDTO deleteObject = storeService.findOne(storeDTO.getStoreId());
            if(deleteObject != null){
                storeService.deleteStore(deleteObject);
                if(storeService.findOne(storeDTO.getStoreId()) == null){
                    response.setSuccess(true);
                    response.setErrorMessage("Xoá thành công");
                    return response;
                }
            }
        }catch (Exception e){
            response.setErrorMessage("Có lỗi xảy ra: "+e.getMessage());
        }
        response.setErrorMessage("Không có quyền xoá club");
        return response;
    }
    @GetMapping
    @ResponseBody
    public Iterable<StoreDTO> findAll(@QuerydslPredicate(root = Product.class) Predicate predicate, Pageable pageable) {
        return storeService.findAll(predicate, pageable);
    }
    @RequestMapping(value = "/getById/{storeId}" , method = RequestMethod.GET)
    @ResponseBody
    public ResponseDTO getById(@PathVariable final Long storeId){
        ResponseDTO responseDTO = new ResponseDTO(false);
        responseDTO.setErrorMessage("Bad request");
        try{
            StoreDTO storeDTO = storeService.getByStoreId(storeId);
            if (storeDTO != null){
                responseDTO.setObjectReturn(storeDTO);
                responseDTO.setSuccess(true);
                responseDTO.setErrorMessage("");
                return responseDTO;
            }
        }catch (Exception e){
            responseDTO.setErrorMessage("Co loi xay ra "+e.toString());
        }
        return responseDTO;
    }
}
