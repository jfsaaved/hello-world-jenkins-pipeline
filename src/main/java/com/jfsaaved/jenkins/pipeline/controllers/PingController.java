package com.jfsaaved.jenkins.pipeline.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jfsaaved.jenkins.pipeline.models.Image;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.io.IOException;
import java.util.Base64;

@RestController
@RequestMapping("/")
public class PingController {

    @GetMapping
    public ResponseEntity<byte[]> ping() throws IOException {
        Image pojo = new ObjectMapper().readValue(new ClassPathResource("./payload.json").getFile(), Image.class);
        String prescriptionImage = pojo.getPrescriptionImage().split(",")[0];
        byte[] image = Base64.getDecoder().decode(prescriptionImage);

        return ResponseEntity.ok().contentType(MediaType.IMAGE_PNG).body(image);
    }

}
