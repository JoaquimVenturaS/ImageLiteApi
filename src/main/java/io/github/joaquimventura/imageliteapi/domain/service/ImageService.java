package io.github.joaquimventura.imageliteapi.domain.service;

import io.github.joaquimventura.imageliteapi.domain.entity.Image;
import io.github.joaquimventura.imageliteapi.domain.enums.ImageExtension;

import java.util.List;
import java.util.Optional;

public interface ImageService {

    Image save(Image image);

    Optional<Image> getById(String id);

    List<Image> search(ImageExtension extension, String query);
}
