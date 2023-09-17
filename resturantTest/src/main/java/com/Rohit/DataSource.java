package com.Rohit;

import com.Rohit.Entity.Resturant;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class DataSource {

    @Bean
    public List<Resturant> getRest(){
        return new ArrayList<>();
    }
}
