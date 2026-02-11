package com.Helpaa.Errand.Request.API.service;

import com.Helpaa.Errand.Request.API.entity.Errand;
import com.Helpaa.Errand.Request.API.repository.ErrandRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ErrandService {
    private final ErrandRepository errandRepository;

    public Errand createErrand(Errand errand) {
        if(errandRepository.existsByTitle(errand.getTitle())){
            throw new RuntimeException("Errand with this title already exists");
        }
        return errandRepository.save(errand);
    }

    public List<Errand> getAllErrands() {
        return errandRepository.findAll();
    }
}


