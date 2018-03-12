package com.taotao.admin.controller;

import com.taotao.admin.pojo.Student;
import freemarker.template.Configuration;
import freemarker.template.Template;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import java.io.FileWriter;
import java.io.Writer;
import java.util.*;

@Controller
public class HtmlFileController {
    @Autowired
    private FreeMarkerConfigurer freeMarkerConfigurer;

    @RequestMapping("/html/make")
    @ResponseBody
    public String MakeStaticFile() throws Exception {
        Student student = new Student(1, "zhangsan", 11, new Date());
        List<Student> studentlist = new ArrayList<>();
        studentlist.add(new Student(1, "zhangsan", 11, new Date()));
        studentlist.add(new Student(2, "zhangsan2", 12, new Date()));
        studentlist.add(new Student(3, "zhangsan3", 13, new Date()));
        studentlist.add(new Student(4, "zhangsan4", 14, new Date()));
        studentlist.add(new Student(5, "zhangsan5", 15, new Date()));
        studentlist.add(new Student(6, "zhangsan6", 16, new Date()));
        Configuration configuration = freeMarkerConfigurer.getConfiguration();
        Template template = configuration.getTemplate("hello.ftl");
        Map data = new HashMap();
        data.put("hello", "Hello World");//普通字符串类型
        data.put("student", student);
        data.put("stulist", studentlist);
        Writer writer = new FileWriter("E:/tempfile/hello.txt");
        template.process(data, writer);
        writer.close();
        return "OK";
    }

}
