package io.github.joaquimventura.imageliteapi.infra.repository;

import io.github.joaquimventura.imageliteapi.domain.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, String> {
}
