package com.rcplatform.livechat.common.mybatis.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;


/**
 * Created by Administrator on 2016/4/12.
 */
public interface CommonMapper<T> extends Mapper<T>, ReplaceMapper<T>,MySqlMapper<T>,BatchMapper<T> {}
