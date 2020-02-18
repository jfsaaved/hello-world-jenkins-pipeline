package com.jfsaaved.jenkins.pipeline.components;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jfsaaved.jenkins.pipeline.models.Image;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import java.io.IOException;
import java.util.Base64;

@Component
public class ImagePrescriptionDecoder {

    @PostConstruct
    public void decode() throws IOException {

    }

}
