package com.example.library.publishcompany;

public record PublishCompanyResponseDTO(Long id ,String name, String country, String address, String contact, String website) {
    public PublishCompanyResponseDTO(PublishCompany publishCompany) {
        this(publishCompany.getId() ,publishCompany.getName(), publishCompany.getCountry(), publishCompany.getAddress(), publishCompany.getContact(), publishCompany.getWebsite());
    }
}
