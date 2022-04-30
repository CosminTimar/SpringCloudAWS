package com.coman.SpringCloudAWS.config;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AmazonConfig {


    @Bean
    public AmazonS3 s3(){

        AWSCredentials credentials =
                new BasicAWSCredentials("AKIAWMBQM6SPS7BRJOAN",
                        "Yf1yJewYQxAdKQECJUaSO6q1q9hvt/ypYu3+bK5T");

        return AmazonS3ClientBuilder
                .standard()
                .withCredentials(new AWSStaticCredentialsProvider(credentials))
                .withRegion(Regions.EU_CENTRAL_1)
                .build();

    }

}
