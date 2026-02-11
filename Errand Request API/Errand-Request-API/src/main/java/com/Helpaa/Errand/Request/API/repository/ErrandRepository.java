package com.Helpaa.Errand.Request.API.repository;

import com.Helpaa.Errand.Request.API.entity.Errand;
import jakarta.validation.constraints.NotBlank;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ErrandRepository extends JpaRepository<Errand, Long> {


    boolean existsByTitle(@NotBlank(message = "Title must not be blank") String title);
}
