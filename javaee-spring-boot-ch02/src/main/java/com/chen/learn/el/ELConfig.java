package com.chen.learn.el;

import com.chen.learn.scope.DemoPrototypeService;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

import java.io.IOException;

@Configuration
@ComponentScan("com.chen.learn.el")
@PropertySource(value = "t.properties")
public class ELConfig {
    @Value("I Love You!")
    private String normal;

    @Value("#{systemProperties['os.name']}")
    private String osName;

    @Value("#{systemProperties['os.arch']}")
    private String osArch;

    @Value("test.txt")
    private Resource testFile;

    @Value("http://www.baidu.com")
    private Resource testUrl;

    @Value("${book.name}")
    private String bookName;

    @Autowired
    private Environment environment;

    @Autowired
    DemoService demoService;

    public void outputResource(){
        try {
            System.out.println(normal);
            System.out.println(osName);
            System.out.println(osArch);

            System.out.println(IOUtils.toString(testFile.getInputStream()));
            System.out.println(IOUtils.toString(testUrl.getInputStream()));
            System.out.println(bookName);
            System.out.println(environment.getProperty("book.author"));
            System.out.println(demoService.getAuthor());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
