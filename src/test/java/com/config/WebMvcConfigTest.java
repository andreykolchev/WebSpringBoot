package com.config;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes=WebMvcConfig.class)
@Ignore
public class WebMvcConfigTest {

    @Test
    public void test() throws Exception {

    }

}