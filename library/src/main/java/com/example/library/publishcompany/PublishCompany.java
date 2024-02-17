package com.example.library.publishcompany;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "publishcompanies")
@Table(name = "publishcompanies")
@Getter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class PublishCompany {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String country;
    private String address;
    private String contact;
    private String website;

    public PublishCompany(PublishCompanyRequestDTO request) {
        this.name = request.name();
        this.country = request.country();
        this.address = request.address();
        this.contact = request.contact();
        this.website = request.website();
    }
}
