package com.fwy.quzuche.generator;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import lombok.Value;
import org.springframework.validation.annotation.Validated;

import java.util.Collections;

//代码生成器，执行代码生成的操作
public class CodeGenerator {
    public static void main(String[] args) {

        FastAutoGenerator.create("jdbc:mysql://127.0.0.1:3306/fwy_quzuche?useUnicode=true&characterEncoding=utf8&autoReconnect=true&zeroDateTimeBehavior=convertToNull"
                , "root", "123456")
                .globalConfig(builder -> {
                    builder.author("fwy") // 设置作者
                            .enableSwagger() // 开启 swagger 模式
                            .fileOverride() // 覆盖已生成文件
                            .outputDir("D://"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.fwy.quzuche.generator") // 设置父包名
                            .moduleName("quzuche") // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.xml, "D://")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude("t_simple") // 设置需要生成的表名
                            .addTablePrefix("t_", "c_"); // 设置过滤表前缀
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }
}
