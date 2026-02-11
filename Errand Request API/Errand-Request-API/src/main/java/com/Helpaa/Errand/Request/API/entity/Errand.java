package com.Helpaa.Errand.Request.API.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Entity
@Table(name = "errands")
@Getter@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Errand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Title must not be blank")
    @Column(nullable = false, unique = true)
    private String title;
    @Column(columnDefinition = "TEXT")
    private String description;

}
