package com.biz.platform.web.mapper;

import com.biz.platform.web.pojo.Shop;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface ShopMapper extends Mapper<Shop> {

    public int checkShopName(@Param(value = "shopName") String shopName);
}
