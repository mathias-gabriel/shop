package com.mg.shop.product.infra.api;

import com.mg.shop.product.domain.model.Product;
import com.mg.shop.product.domain.useCase.ViewProduct;
import com.mg.shop.product.infra.dto.ProductDto;
import com.mg.shop.product.infra.mapper.ProductDtoMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private ViewProduct viewProduct;
    private ProductDtoMapper productDtoMapper;

    public ProductController(ViewProduct viewProduct, ProductDtoMapper productDtoMapper) {
        this.viewProduct = viewProduct;
        this.productDtoMapper = productDtoMapper;
    }

    @GetMapping()
    public List<ProductDto> getProducts() {
        return mapToDto(this.viewProduct.getProducts());
    }

    private List<ProductDto> mapToDto(List<Product> products) {
        return products.stream().map(product->new ProductDto().setId(product.getId())).collect(Collectors.toList());
    }

}
