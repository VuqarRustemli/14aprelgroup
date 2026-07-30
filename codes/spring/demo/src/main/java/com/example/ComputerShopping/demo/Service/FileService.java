package com.example.ComputerShopping.demo.Service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.*;

@Service
public class FileService {

    @Value("${file.upload-dir}")
    private String uploadDir;

    public String uploadFile(MultipartFile file) throws IOException {

        Path path = Paths.get(uploadDir);

        if (!Files.exists(path)) {
            Files.createDirectories(path);
        }

        Path filePath = path.resolve(file.getOriginalFilename());

        Files.copy(file.getInputStream(), filePath, StandardCopyOption.REPLACE_EXISTING);

        return file.getOriginalFilename();
    }

    
    public Resource downloadFile(String fileName) throws IOException {

        Path filePath = Paths.get(uploadDir).resolve(fileName);

        Resource resource = new UrlResource(filePath.toUri());

        if (resource.exists()) {
            return resource;
        }

        throw new RuntimeException("File not found.");
    }

}