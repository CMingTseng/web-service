package com.vietfintex.marketplace.persistence.repo.impl;

import com.vietfintex.marketplace.persistence.repo.ImageCustomRepo;
import com.vietfintex.marketplace.util.DataUtil;
import com.vietfintex.marketplace.web.dto.ImageDTO;
import com.vietfintex.marketplace.web.dto.ImageLinkDTO;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

import static com.vietfintex.marketplace.util.DataUtil.nonNullOrEmpty;

public class ImageLinkRepoImpl implements ImageCustomRepo {
    @PersistenceContext
    private EntityManager em;
    @Override
    public List<ImageLinkDTO> getImageLinkByObject(Long objectId, String objectType) {
        String sql = "select * from images_link a, image b\n" +
                "where a.image_id = b.image_id and a.object_id = :objectId";
        Query query = em.createNativeQuery(sql);
        query.setParameter("objectId", objectId);
        List<Object[]> lst = query.getResultList();
        if (nonNullOrEmpty(lst)){
            int i;
            List<ImageDTO> result = new ArrayList<>();
            for (Object[] obj: lst){
                ImageDTO imageDTO = new ImageDTO();
            }
        }
    }
}
