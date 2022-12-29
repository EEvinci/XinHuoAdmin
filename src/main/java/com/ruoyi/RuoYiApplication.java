package com.ruoyi;

import org.directwebremoting.spring.DwrSpringServlet;
import org.python.util.PythonInterpreter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 启动程序
 *
 * @author ruoyi
 */


@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })

public class RuoYiApplication
{
    public static void main(String[] args)
    {

        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(RuoYiApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  若依启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
                " .-------.       ____     __        \n" +
                " |  _ _   \\      \\   \\   /  /    \n" +
                " | ( ' )  |       \\  _. /  '       \n" +
                " |(_ o _) /        _( )_ .'         \n" +
                " | (_,_).' __  ___(_ o _)'          \n" +
                " |  |\\ \\  |  ||   |(_,_)'         \n" +
                " |  | \\ `'   /|   `-'  /           \n" +
                " |  |  \\    /  \\      /           \n" +
                " ''-'   `'-'    `-..-'              ");

        //首先调用python的解释器
//        PythonInterpreter interpreter = new PythonInterpreter();
//        //选择执行的的Python语句
//        try {
//            String[] args1 = new String[] { "python", "D:\\scrapy_project\\Service outsourcing\\homework\\createExamSheet.py"};
//            Process proc = Runtime.getRuntime().exec(args1);// 执行py文件
//            BufferedReader in = new BufferedReader(new InputStreamReader(proc.getInputStream(),"gbk"));
//            String line = null;
//            while ((line = in.readLine()) != null) {
//                System.out.println(line);
//            }
//            in.close();
//            proc.waitFor();
//        } catch (IOException | InterruptedException e) {
//            e.printStackTrace();
//        }



    }
    @RequestMapping
    public String index() {
        return "index";
    }

    @Bean
    public ServletRegistrationBean servletRegistrationBean() {
        DwrSpringServlet servlet = new DwrSpringServlet();
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(servlet, "/dwr/*");
        registrationBean.addInitParameter("debug", "true");
        return registrationBean;
    }


}