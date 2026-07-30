package com.example.ComputerShopping.demo.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import com.example.ComputerShopping.demo.Service.FileService;

import java.io.IOException;

@RestController
@RequestMapping("/files")
public class FileController {

    @Autowired
    private FileService fileService;

    @PostMapping("/upload")
    public ResponseEntity<String> upload(
            @RequestParam("file") MultipartFile file)
            throws IOException {

        String name = fileService.uploadFile(file);

        return ResponseEntity.ok("Uploaded: " + name);
    }

    @GetMapping("/download/{fileName}")
    public ResponseEntity<Resource> download(
            @PathVariable String fileName)
            throws IOException {

        Resource resource = fileService.downloadFile(fileName);

        return ResponseEntity.ok()
                .contentType(MediaType.APPLICATION_OCTET_STREAM)
                .header(HttpHeaders.CONTENT_DISPOSITION,
                        "attachment; filename=\"" + fileName + "\"")
                .body(resource);
    }
}