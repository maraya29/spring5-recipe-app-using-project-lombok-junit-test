package guru.springframework.services;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by Machin on 7/3/17.
 */
public interface ImageService {

    void saveImageFile(Long recipeId, MultipartFile file);
}