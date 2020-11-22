package io.vehicles.vehiclesIO.files;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;
@Service
public class StorageServiceImpl {
    @Autowired
    private FileDBRepository fileDBRepository;
    public FileDB store(MultipartFile file) throws IOException {
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        FileDB FileDB = new FileDB(fileName, file.getContentType(), file.getBytes());
        return fileDBRepository.save(FileDB);
    }
    public FileDB getFile(Long id) {
        return fileDBRepository.findById(id).get();
    }
    public Stream<FileDB> getAllFiles() {
        return fileDBRepository.findAll().stream();
    }
    public List<FileDB> getAllFilesV2() {
        return fileDBRepository.findAll();
    }
}
