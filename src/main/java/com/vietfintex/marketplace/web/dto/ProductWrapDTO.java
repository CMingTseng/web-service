package com.vietfintex.marketplace.web.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ProductWrapDTO  implements Serializable {
    private static final long serialVersionUID = 1L;
    private ProductDTO productDTO;
    private List<ProductOptionMDTO> productOptionDTOList;

    public ProductDTO getProductDTO() {
        return productDTO;
    }

    public void setProductDTO(ProductDTO productDTO) {
        this.productDTO = productDTO;
    }

    public List<ProductOptionMDTO> getProductOptionDTOList() {
        return productOptionDTOList;
    }

    public void setProductOptionDTOList(List<ProductOptionMDTO> productOptionDTOList) {
        this.productOptionDTOList = productOptionDTOList;
    }
}
