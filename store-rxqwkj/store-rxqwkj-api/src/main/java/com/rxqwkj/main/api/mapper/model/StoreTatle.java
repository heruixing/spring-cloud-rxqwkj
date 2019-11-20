package com.rxqwkj.main.api.mapper.model;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 * Created by Administrator on 2019/10/16.
 */
@Table(name = "store_titel")
public class StoreTatle {

    /**店铺名称**/
    @Column(name = "storename")
    private String storeName;

    /**店铺地址**/
    private String address;

    /**联系电话**/
    /**店铺名称**/
    @Column(name = "linkPhone")
    private String linkPhone;

    /**营业时间**/
    @Column(name = "openingHours")
    private String openingHours;

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLinkPhone() {
        return linkPhone;
    }

    public String getOpeningHours() {
        return openingHours;
    }

    public void setLinkPhone(String linkPhone) {
        this.linkPhone = linkPhone;
    }

    public void setOpeningHours(String openingHours) {
        this.openingHours = openingHours;
    }
}
