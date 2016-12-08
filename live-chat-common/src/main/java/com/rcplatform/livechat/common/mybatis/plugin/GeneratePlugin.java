package com.rcplatform.livechat.common.mybatis.plugin;

import org.mybatis.generator.api.ShellRunner;

public class GeneratePlugin  {


	public static void generate() {
		String config = GeneratePlugin.class.getClassLoader().getResource("mybatis-generator.xml").getFile();
		String[] arg = { "-configfile", config, "-overwrite" };
		ShellRunner.main(arg);
	}


	public static void main(String[] args){
		generate();
	}


}
