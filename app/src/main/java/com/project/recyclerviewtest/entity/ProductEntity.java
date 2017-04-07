package com.project.recyclerviewtest.entity;

/**
 * @author shaomiao
 * @Date 2017/4/6
 * @Time 15:22
 * 商品实体类
 */

public class ProductEntity {

    // 商品图片
    private String productImage;

    // 商品名称
    private String productName;

    // 商品价格
    private String productPrice;

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }
}
