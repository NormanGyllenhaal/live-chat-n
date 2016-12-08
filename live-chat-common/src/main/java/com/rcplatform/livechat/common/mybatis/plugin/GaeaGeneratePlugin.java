package com.rcplatform.livechat.common.mybatis.plugin;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.TopLevelClass;

import java.util.List;

/**
 * Created by yang peng on 2016/7/25.
 */
public class GaeaGeneratePlugin extends PluginAdapter {


    @Override
    public boolean validate(List<String> warnings) {
        return true;
    }

    public GaeaGeneratePlugin() {
    }



    private void addFiled(TopLevelClass topLevelClass,IntrospectedTable intropspectedTable){
        topLevelClass.addImportedType("com.bj58.spat.gaea.serializer.component.annotation.GaeaMember");
        List<Field> fields = topLevelClass.getFields();
        for(Field field:fields){
            if(!field.getName().equals("serialVersionUID")){
                field.addAnnotation("");
            }
        }
    }

    private void processEntityClass(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
            topLevelClass.addImportedType("com.bj58.spat.gaea.serializer.component.annotation.GaeaSerializable");
            topLevelClass.addAnnotation("@GaeaSerializable");
    }


    public boolean modelBaseRecordClassGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        this.processEntityClass(topLevelClass, introspectedTable);
        this.addFiled(topLevelClass,introspectedTable);
        return true;
    }

    public boolean modelPrimaryKeyClassGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        this.processEntityClass(topLevelClass, introspectedTable);
        this.addFiled(topLevelClass,introspectedTable);
        return true;
    }

    public boolean modelRecordWithBLOBsClassGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        this.processEntityClass(topLevelClass, introspectedTable);
        this.addFiled(topLevelClass,introspectedTable);
        return false;
    }




}
