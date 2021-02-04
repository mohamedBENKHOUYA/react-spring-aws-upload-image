package com.spring.demo.config.bucket;

public enum BucketName {
    PROFILE_IMAGE("spring-image-upload-mohamed");


    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
