package com.vietfintex.marketplace.persistence.repo.impl;

import com.vietfintex.marketplace.persistence.repo.ImageCustomRepo;
import com.vietfintex.marketplace.util.GlobalUtil;
import com.vietfintex.marketplace.util.NumberUtils;
import com.vietfintex.marketplace.web.dto.CategoryDTO;
import com.vietfintex.marketplace.web.dto.ImageLinkDTO;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

import static java.util.Objects.isNull;

public class ImageCustomRepoImpl implements ImageCustomRepo {
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<ImageLinkDTO> getImageLinkByObject(Long objectId, String objectType) {
        String sql = "SELECT imgl.pair_id pairId, imgl.object_id objectId, imgl.object_type objectType, imgl.image_id imageId, img.image_path imagePath FROM images_link imgl INNER JOIN image img ON imgl.image_id = img.image_id WHERE 1 =1 ";
        if (objectId != null) {
            sql += " AND imgl.object_id = " + objectId;
        }
        if (objectType != null) {
            sql += " AND imgl.object_type ='" + objectType + "'";
        }
        Query query = em.createNativeQuery(sql);
        List<Object[]> lst = query.getResultList();
        List<ImageLinkDTO> returnList = new ArrayList<>();
        if(isNull(lst)){
            return null;
        }
        int i;
        for (Object[] obj: lst) {
            i = 0;
            ImageLinkDTO imageLinkDTO = new ImageLinkDTO();
            imageLinkDTO.setPairId(NumberUtils.convertToLong(obj[i++]));
            imageLinkDTO.setObjectId(NumberUtils.convertToLong(obj[i++]));
            imageLinkDTO.setObjectType(NumberUtils.convertToString(obj[i++]));
            imageLinkDTO.setImageId(NumberUtils.convertToLong(obj[i++]));
            imageLinkDTO.setImagePath(NumberUtils.convertToString(obj[i++]));
            returnList.add(imageLinkDTO);
        }
        return returnList;
    }
}
