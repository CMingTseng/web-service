package com.vietfintex.marketplace.web.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.querydsl.core.types.Predicate;
import com.vietfintex.marketplace.persistence.model.Product;
import com.vietfintex.marketplace.web.dto.ProductDTO;
import com.vietfintex.marketplace.web.dto.ResponseDTO;
import com.vietfintex.marketplace.web.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.querydsl.binding.QuerydslPredicate;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping(value = "/product")
public class ProductController {
    @Autowired
    ProductService productService;

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
    public ResponseDTO createProduct(@RequestBody ProductDTO productDTO) {
        ResponseDTO response = new ResponseDTO(false);
        try {
            Objects.requireNonNull(productDTO, "Not found product param");
            productDTO = productService.save(productDTO);
            response.setSuccess(true);
            response.setObjectReturn(productDTO);
        } catch (Exception e) {
            response.setErrorMessage("Có lỗi xảy ra: " + e.getMessage());
        }
        return response;
    }


}
