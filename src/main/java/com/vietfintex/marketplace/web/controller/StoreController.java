package com.vietfintex.marketplace.web.controller;

import com.vietfintex.marketplace.web.dto.ResponseDTO;
import com.vietfintex.marketplace.web.dto.StoreDTO;
import com.vietfintex.marketplace.web.dto.StoreWrapDTO;
import com.vietfintex.marketplace.web.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/store")
public class StoreController {
    @Autowired
    StoreService storeService;

    @RequestMapping(value = "/getStoreList", method = RequestMethod.POST)
    @ResponseBody
    public ResponseDTO getStoreList(@RequestBody final StoreWrapDTO storeWrapDTO){
        ResponseDTO response = new ResponseDTO(false);
        try {
            if(storeWrapDTO != null){
                StoreDTO storeDTO = storeWrapDTO.getStoreDTO();
                if(storeDTO!= null){
                    List<StoreDTO> returnObject = storeService.getStoreList(storeDTO.getStoreId(),
                            storeDTO.getOwnerId(),storeDTO.getStoreName(),storeDTO.getAddress(),storeWrapDTO.getPage());
                    if(returnObject != null){
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

}
