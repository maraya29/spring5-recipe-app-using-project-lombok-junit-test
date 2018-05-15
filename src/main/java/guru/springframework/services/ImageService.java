package guru.springframework.services;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by Machin on 4/3/18.
 */
public interface ImageService {

    void saveImageFile(Long recipeId, MultipartFile file);
}
