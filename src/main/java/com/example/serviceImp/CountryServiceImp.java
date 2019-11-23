package com.example.serviceImp;


import com.example.dao.countryMapper;
import com.example.entity.country;
import com.example.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryServiceImp implements CountryService {
    @Autowired
    private countryMapper mapper;

    @Override
    public country selectByPrimaryKey(String id) {
        return mapper.selectByPrimaryKey(id);
    }
}
