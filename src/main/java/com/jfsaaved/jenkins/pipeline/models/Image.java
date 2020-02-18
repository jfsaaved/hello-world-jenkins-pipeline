package com.jfsaaved.jenkins.pipeline.models;

import lombok.Data;

@Data
public class Image {

    private String storeId;
    private String province;
    private String rxId;
    private String txId;
    private String sourceSystem;
    private String method;
    private String language;
    private String intake;
    private String prescriptionImage;
    private String prescriptionImageId;
    private String correlationId;


}
