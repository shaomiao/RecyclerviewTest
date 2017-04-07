package com.project.recyclerviewtest.entity;

import java.util.List;

/**
 * @author shaomiao
 * @Date 2017/4/6
 * @Time 9:52
 * 专题实体类
 */

public class SpecialEntity {

    // 专题图片
    private String specialImage;

    // 商家列表
    private List<BusinessEntity> businessEntitys;

    public String getSpecialImage() {
        return specialImage;
    }

    public void setSpecialImage(String specialImage) {
        this.specialImage = specialImage;
    }

    public List<BusinessEntity> getBusinessEntitys() {
        return businessEntitys;
    }

    public void setBusinessEntitys(List<BusinessEntity> businessEntitys) {
        this.businessEntitys = businessEntitys;
    }
}
