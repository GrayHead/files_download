package com.example.files_download.controllers;

import com.example.files_download.controllers.dao.UserDAO;
import com.example.files_download.controllers.models.User;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RestController
@AllArgsConstructor
public class MainController {


    private UserDAO userDAO;

    @PostMapping("/saveUser")
    public void saveUser(@RequestParam String name,
                         @RequestParam MultipartFile image
    ) throws IOException {
        User s = new User(name, image.getOriginalFilename());
        userDAO.save(s);
        String home = System.getProperty("user.home");
        String path = home + File.separator + "imagesLad" + File.separator + image.getOriginalFilename();
        image.transferTo(new File(path));

    }
    
    


}
