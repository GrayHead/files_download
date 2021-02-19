package com.example.files_download.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.io.File;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {


        String home = System.getProperty("user.home");
        String path = "File:" + home + File.separator + "imagesLad" + File.separator;
        String pathPdf = "File:" + home + File.separator + "pdfLad" + File.separator;
        System.out.println(path);

        registry
                // src='/image/girl.webp'
                .addResourceHandler("/image/**")
                .addResourceLocations(path);
        registry
                .addResourceHandler("/pdf/**")
                .addResourceLocations(pathPdf);

    }
}
