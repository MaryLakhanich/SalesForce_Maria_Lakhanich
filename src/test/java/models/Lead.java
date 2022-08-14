package models;

import enums.*;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class Lead {
    private Salutation salutation;
    private String firstName;
    private String middleName;
    @NonNull
    private String lastName;
    private String website;
    private String title;
    private String email;
    @NonNull
    private String company;
    private Industry industry;
    private String phone;
    private String numberOfEmployees;
    private String mobile;
    private LeadSource leadSource;
    private Rating rating;
    private String searchAddress;
    private String street;
    private String city;
    private String state;
    @NonNull
    private LeadStatus leadStatus;
    private String zipCode;
    private String country;
    private String description;
    private String fullAddress;
    private String fullName;

}