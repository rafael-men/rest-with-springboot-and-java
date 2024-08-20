package br.com.erudio.services;

import br.com.erudio.config.FileStorageConfig;
import br.com.erudio.exceptions.FileStorageException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@Service
public class FileStorageService {
    private final Path fileStorageLocation;

    @Autowired
    public FileStorageService(FileStorageConfig FileStorageConfig, Path fileStorageLocation, Path fileStorageLocation1) {
        Path path = Paths.get(FileStorageConfig.getUploadDir()).toAbsolutePath().normalize();
        this.fileStorageLocation = path;

        try{
            Files.createDirectory(this.fileStorageLocation);
        }
        catch (Exception e) {
            throw new FileStorageException("Could not create the directory...",e);
        }
    }

    public String storeFile(MultipartFile file) {
        String filename = StringUtils.cleanPath(file.getOriginalFilename());
        try {
            if(filename.contains("..")) {
                throw new FileStorageException("Filename contains invalid characters...");
            }
            Path targetLocation = this.fileStorageLocation.resolve(filename);
            Files.copy(file.getInputStream(),targetLocation, StandardCopyOption.REPLACE_EXISTING);
            return null;
        }catch (Exception e) {
            throw new FileStorageException("Could not store the directory where the uploaded files will be stored...",e);
        }
    }
}
