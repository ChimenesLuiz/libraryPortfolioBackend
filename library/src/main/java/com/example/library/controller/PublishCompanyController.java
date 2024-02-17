package com.example.library.controller;


import com.example.library.publishcompany.PublishCompany;
import com.example.library.publishcompany.PublishCompanyRepository;
import com.example.library.publishcompany.PublishCompanyRequestDTO;
import com.example.library.publishcompany.PublishCompanyResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("publish-company")
public class PublishCompanyController {
    @Autowired
    private PublishCompanyRepository repository;

    @PostMapping
    public void savePublishCompany(@RequestBody PublishCompanyRequestDTO request) {
        PublishCompany publishCompany = new PublishCompany(request);
        repository.save(publishCompany);
    }

    @GetMapping
    public List<PublishCompanyResponseDTO> getAll() {
        return repository.findAll().stream().map(PublishCompanyResponseDTO::new).toList();
    }

}
