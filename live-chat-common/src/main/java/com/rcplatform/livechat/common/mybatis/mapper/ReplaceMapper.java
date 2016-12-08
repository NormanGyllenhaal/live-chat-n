package com.rcplatform.livechat.common.mybatis.mapper;

import org.apache.ibatis.annotations.InsertProvider;

/**
 * Created by Administrator on 2016/4/12.
 */
public interface ReplaceMapper<T> {


	@InsertProvider( type = ReplaceProvider.class, method = "dynamicSQL" )
	Integer replace(T record);


	@InsertProvider( type = ReplaceProvider.class, method = "dynamicSQL" )
	Integer insertIgnore(T record);

}
