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
}
