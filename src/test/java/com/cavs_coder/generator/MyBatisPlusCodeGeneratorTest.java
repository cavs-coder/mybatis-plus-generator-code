package com.cavs_coder.generator;

import com.cavs_coder.generator.util.MyBatisPlusCodeGeneratorUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class MyBatisPlusCodeGeneratorTest {

    @Resource
    MyBatisPlusCodeGeneratorUtil codeGenerator;

    @Test
    public void myBatisPlusCodeGenerator() {
        String moduleName = "temp";
        String tablePrefix = "";
        String[] includes = { "report_plan_stage_record"};
        codeGenerator.codeGenerator(moduleName, tablePrefix, includes);
    }
}
