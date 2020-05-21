package com.biz.platform.web.mapper;

import com.biz.platform.web.pojo.User;
import tk.mybatis.mapper.common.Mapper;

public interface UserMapper extends Mapper<User>{

    public int checkUserCode(String userCode);
}
