package models;

import enums.Industry;
import enums.LeadSource;
import enums.Rating;
import enums.Salutation;
import java.util.Objects;

public class Lead {
    private final Salutation salutation;
    private final String firstName;
    private final String middleName;
    private final String lastName;
    private final String website;
    private final String title;
    private final String email;
    private final String company;
    private final Industry industry;
    private final String phone;
    private final int numberOfEmployees;
    private final String mobile;
    private final LeadSource leadSource;
    private final Rating rating;
    private final String searchAddress;
    private final String street;
    private final String city;
    private final String state;
    private final String leadStatus;
    private final String zipCode;
    private final String country;
    private final String fullName;

    private Lead(LeadBuilder leadBuilder) {
        this.salutation = leadBuilder.salutation;
        this.firstName = leadBuilder.firstName;
        this.middleName = leadBuilder.middleName;
        this.lastName = leadBuilder.lastName;
        this.website = leadBuilder.website;
        this.title = leadBuilder.title;
        this.email = leadBuilder.email;
        this.company = leadBuilder.company;
        this.industry = leadBuilder.industry;
        this.phone = leadBuilder.phone;
        this.numberOfEmployees = leadBuilder.numberOfEmployees;
        this.mobile = leadBuilder.mobile;
        this.leadSource = leadBuilder.leadSource;
        this.rating = leadBuilder.rating;
        this.searchAddress = leadBuilder.searchAddress;
        this.street = leadBuilder.street;
        this.city = leadBuilder.city;
        this.state = leadBuilder.state;
        this.leadStatus = leadBuilder.leadStatus;
        this.zipCode = leadBuilder.zipCode;
        this.country = leadBuilder.country;
        this.fullName = leadBuilder.fullName;
    }

    public Salutation getSalutation() {
        return salutation;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getWebsite() {
        return website;
    }

    public String getTitle() {
        return title;
    }

    public String getEmail() {
        return email;
    }

    public String getCompany() {
        return company;
    }

    public Industry getIndustry() {
        return industry;
    }

    public String getPhone() {
        return phone;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public String getMobile() {
        return mobile;
    }

    public LeadSource getLeadSource() {
        return leadSource;
    }

    public Rating getRating() {
        return rating;
    }

    public String getSearchAddress() {
        return searchAddress;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getLeadStatus() {
        return leadStatus;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getCountry() {
        return country;
    }

    public String getFullName() {
        if (this.fullName != null) {
            return this.fullName;
        } else {
            return (this.salutation.getName() + " " + this.firstName + " " + this.lastName).trim();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lead lead = (Lead) o;
        return salutation == lead.salutation && Objects.equals(firstName, lead.firstName) && Objects.equals(middleName, lead.middleName) && Objects.equals(lastName, lead.lastName) && Objects.equals(website, lead.website) && Objects.equals(title, lead.title) && Objects.equals(email, lead.email) && Objects.equals(company, lead.company) && industry == lead.industry && Objects.equals(phone, lead.phone) && Objects.equals(numberOfEmployees, lead.numberOfEmployees) && Objects.equals(mobile, lead.mobile) && leadSource == lead.leadSource && rating == lead.rating && Objects.equals(searchAddress, lead.searchAddress) && Objects.equals(street, lead.street) && Objects.equals(city, lead.city) && Objects.equals(state, lead.state) && Objects.equals(leadStatus, lead.leadStatus) && Objects.equals(zipCode, lead.zipCode) && Objects.equals(country, lead.country) && Objects.equals(fullName, lead.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(salutation, firstName, middleName, lastName, website, title, email, company, industry, phone, numberOfEmployees, mobile, leadSource, rating, searchAddress, street, city, state, leadStatus, zipCode, country, fullName);
    }

    @Override
    public String toString() {
        return "Lead{" +
                "salutation=" + salutation +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", website='" + website + '\'' +
                ", title='" + title + '\'' +
                ", email='" + email + '\'' +
                ", company='" + company + '\'' +
                ", industry=" + industry +
                ", phone='" + phone + '\'' +
                ", numberOfEmployees='" + numberOfEmployees + '\'' +
                ", mobile='" + mobile + '\'' +
                ", leadSource=" + leadSource +
                ", rating=" + rating +
                ", searchAddress='" + searchAddress + '\'' +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", status='" + leadStatus + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", country='" + country + '\'' +
                ", fullName='" + fullName + '\'' +
                '}';
    }

    public static class LeadBuilder {
        private final String company;
        private final String leadStatus;
        private Salutation salutation;
        private String firstName;
        private String middleName;
        private String lastName;
        private String website;
        private String title;
        private String email;
        private Industry industry;
        private String phone;
        private int numberOfEmployees;
        private String mobile;
        private LeadSource leadSource;
        private Rating rating;
        private String searchAddress;
        private String street;
        private String city;
        private String state;
        private String zipCode;
        private String country;
        private String fullName;

        public LeadBuilder(String leadStatus, String company) {
            this.leadStatus = leadStatus;
            this.company = company;

        }

        public Lead build() {
            return new Lead(this);
        }

        public LeadBuilder salutation(Salutation salutation) {
            this.salutation = salutation;
            return this;
        }

        public LeadBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public LeadBuilder middleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public LeadBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public LeadBuilder website(String website) {
            this.website = website;
            return this;
        }

        public LeadBuilder title(String title) {
            this.title = title;
            return this;
        }

        public LeadBuilder email(String email) {
            this.email = email;
            return this;
        }

        public LeadBuilder industry(Industry industry) {
            this.industry = industry;
            return this;
        }

        public LeadBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public LeadBuilder numberOfEmployees(int numberOfEmployees) {
            this.numberOfEmployees = numberOfEmployees;
            return this;
        }

        public LeadBuilder mobile(String mobile) {
            this.mobile = mobile;
            return this;
        }

        public LeadBuilder leadSource(LeadSource leadSource) {
            this.leadSource = leadSource;
            return this;
        }

        public LeadBuilder rating(Rating rating) {
            this.rating = rating;
            return this;
        }

        public LeadBuilder searchAddress(String searchAddress) {
            this.searchAddress = searchAddress;
            return this;
        }

        public LeadBuilder street(String street) {
            this.street = street;
            return this;
        }

        public LeadBuilder city(String city) {
            this.city = city;
            return this;
        }

        public LeadBuilder state(String state) {
            this.state = state;
            return this;
        }

        public LeadBuilder zipCode(String zipCode) {
            this.zipCode = zipCode;
            return this;
        }

        public LeadBuilder country(String country) {
            this.country = country;
            return this;
        }

        public LeadBuilder fullName(String fullName) {
            this.fullName = fullName;
            return this;
        }

    }

}
