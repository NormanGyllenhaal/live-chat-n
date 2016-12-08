/**
 * IEnum.java cn.vko.core.common.enums Copyright (c) 2014, 北京微课九天教育科技有限公司版权所有.
 */

package com.rcplatform.livechat.common.enums;


/**
 * 定义所有枚举类的接口类型
 * <p>
 * 所有枚举类必须实现此接口
 * 
 * @author yangpeng
 * @version 1.0.0
 */
public interface IEnum {

	/**
	 * 定义枚举值
	 */
	int key();


	/**
	 * 定义枚举描述
	 */
	String desc();

}
