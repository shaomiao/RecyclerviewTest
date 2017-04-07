package com.project.recyclerviewtest.entity;

import java.util.List;

/**
 * @author shaomiao
 * @Date 2017/4/6
 * @Time 15:32
 * 商家实体类
 */

public class BusinessEntity {

    // 商家名称
    private String businessName;

    // 商家图片
    private String businessImage;

    // 是否收藏
    private boolean isCollection = false;

    // 商品列表
    private List<ProductEntity> products;

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getBusinessImage() {
        return businessImage;
    }

    public void setBusinessImage(String businessImage) {
        this.businessImage = businessImage;
    }

    public List<ProductEntity> getProducts() {
        return products;
    }

    public void setProducts(List<ProductEntity> products) {
        this.products = products;
    }

    public boolean isCollection() {
        return isCollection;
    }

    public void setCollection(boolean collection) {
        isCollection = collection;
    }
}
