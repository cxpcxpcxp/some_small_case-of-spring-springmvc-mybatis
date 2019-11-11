package com.param.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Controller
@RequestMapping("/file")
public class FileLoadServlet {
    @RequestMapping("/unload")
    public String unload(MultipartFile iconLoad) throws IOException {
        String originalFilename = iconLoad.getOriginalFilename();

        String replace = UUID.randomUUID().toString().replace("-", "");
        originalFilename = replace+"_"+originalFilename;

        iconLoad.transferTo(new File("D:\\upload\\"+originalFilename));
        return "success";
    }
}
