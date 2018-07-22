package com.vietfintex.marketplace.web.controller;

import com.vietfintex.marketplace.web.dto.ProductDTO;
import com.vietfintex.marketplace.web.dto.ProductOptionMDTO;
import com.vietfintex.marketplace.web.dto.ProductWrapDTO;
import com.vietfintex.marketplace.web.dto.ResponseDTO;
import com.vietfintex.marketplace.web.service.ProductOptionMService;
import com.vietfintex.marketplace.web.service.ProductOptionService;
import com.vietfintex.marketplace.web.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping(value = "/product")
public class ProductController {
    @Autowired
    ProductService productService;

    @Autowired
    ProductOptionMService productOptionMService;
//    @GetMapping
//    @ResponseBody
//    public Iterable<ProductDTO> findAll(@QuerydslPredicate(root = Product.class) Predicate predicate, Pageable pageable) {
//        return productService.findAll(predicate, pageable);
//    }

    @GetMapping
    @ResponseBody
    public ResponseDTO search(ProductDTO searchDTO, Pageable pageable) {
        ResponseDTO response = new ResponseDTO(false);
        try {
            List<ProductDTO> productDTOList = productService.search(searchDTO, pageable);
            response.setSuccess(true);
            response.setObjectReturn(productDTOList);
        } catch (Exception e) {
            response.setErrorMessage("Co loi xay ra: " + e.getMessage());
        }
        return response;
    }


    @RequestMapping(value = "/count", method = RequestMethod.POST)
    @ResponseBody
    public ResponseDTO count(@RequestBody ProductDTO param) {
        ResponseDTO response = new ResponseDTO(false);
        try {
            Long count = productService.count(param);
            response.setSuccess(true);
            response.setObjectReturn(count);
        } catch (Exception e) {
            response.setErrorMessage("Có lỗi xảy ra: " + e.getMessage());
        }
        return response;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    @ResponseBody
    @Transactional
    public ResponseDTO createProduct(@RequestBody ProductWrapDTO productWrapDTO) {
        ResponseDTO response = new ResponseDTO(false);
        try {
            Objects.requireNonNull(productWrapDTO, "Not found productWrapDTO param");
            ProductDTO productDTO = productWrapDTO.getProductDTO();
            Objects.requireNonNull(productDTO, "Not found product param");
            List<ProductOptionMDTO> productOptionMDTOList = productWrapDTO.getProductOptionDTOList();
            productDTO = productService.save(productDTO);
            productWrapDTO.setProductDTO(productDTO);

            ProductOptionMDTO item;
            if (productOptionMDTOList != null){
                for (int i =0; i< productOptionMDTOList.size() ;i ++){
                    item = productOptionMDTOList.get(i);
                    item.setProductId(productDTO.getProductId());
                    productOptionMDTOList.set(i,item);
                }
                productOptionMDTOList =productOptionMService.insertOrUpdate(productOptionMDTOList);
                productWrapDTO.setProductOptionDTOList(productOptionMDTOList);
            }
            response.setSuccess(true);
            response.setObjectReturn(productWrapDTO);
        } catch (Exception e) {
            response.setErrorMessage("Có lỗi xảy ra: " + e.getMessage());
        }
        return response;
    }


}
