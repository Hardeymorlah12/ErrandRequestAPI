package com.Helpaa.Errand.Request.API.controller;

import com.Helpaa.Errand.Request.API.entity.Errand;
import com.Helpaa.Errand.Request.API.payload.ApiResponse;
import com.Helpaa.Errand.Request.API.service.ErrandService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/errands")
@RequiredArgsConstructor
public class ErrandController {

    private final ErrandService errandService;

    @PostMapping
    public ResponseEntity<ApiResponse<Errand>> createErrand(@Valid @RequestBody Errand errand) {
        Errand savedErrand = errandService.createErrand(errand);

        ApiResponse<Errand> response = ApiResponse.<Errand>builder()
                .success(true)
                .message("Errand created successfully")
                .data(savedErrand)
                .status(HttpStatus.CREATED.value())
                .build();

        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<ApiResponse<List<Errand>>> getAllErrands() {
        List<Errand> errands = errandService.getAllErrands();

        ApiResponse<List<Errand>> response = ApiResponse.<List<Errand>>builder()
                .success(true)
                .message("Errands retrieved successfully")
                .data(errands)
                .status(HttpStatus.OK.value())
                .build();

        return ResponseEntity.ok(response);
    }


}

