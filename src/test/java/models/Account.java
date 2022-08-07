package models;

import enums.AccountType;
import enums.Industry;
import java.util.Objects;

public class Account {
    private final String accountName;
    private final AccountType accountType;
    private final String website;
    private final String description;
    private final String phone;
    private final Industry industry;
    private final int employees;
    private final String billingStreet;
    private final String billingCity;
    private final String billingZip;
    private final String billingState;
    private final String billingCountry;
    private final String shippingStreet;
    private final String shippingCity;
    private final String shippingZip;
    private final String shippingCountry;


    private Account(AccountBuilder accountBuilder) {
        this.accountName = accountBuilder.accountName;
        this.accountType=accountBuilder.accountType;
        this.website = accountBuilder.website;
        this.description = accountBuilder.description;
        this.phone = accountBuilder.phone;
        this.industry = accountBuilder.industry;
        this.employees = accountBuilder.employees;
        this.billingStreet = accountBuilder.billingStreet;
        this.billingCity = accountBuilder.billingCity;
        this.billingZip = accountBuilder.billingZip;
        this.billingState = accountBuilder.billingState;
        this.billingCountry = accountBuilder.billingCountry;
        this.shippingStreet = accountBuilder.shippingStreet;
        this.shippingCity = accountBuilder.shippingCity;
        this.shippingZip = accountBuilder.shippingZip;
        this.shippingCountry = accountBuilder.shippingCountry;

    }

    public String getAccountName() {
        return accountName;
    }

    public AccountType getAccountType () {
        return accountType;
    }

    public String getWebsite() {
        return website;
    }

    public String getDescription() {
        return description;
    }

    public String getPhone() {
        return phone;
    }

    public Industry getIndustry() {
        return industry;
    }

    public int getEmployees() {
        return employees;
    }

    public String getBillingStreet() {
        return billingStreet;
    }

    public String getBillingCity() {
        return billingCity;
    }

    public String getBillingZip() {
        return billingZip;
    }

    public String getBillingState() {
        return billingState;
    }

    public String getBillingCountry() {
        return billingCountry;
    }

    public String getShippingStreet() {
        return shippingStreet;
    }

    public String getShippingCity() {
        return shippingCity;
    }

    public String getShippingZip() {
        return shippingZip;
    }

    public String getShippingCountry() {
        return shippingCountry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return employees == account.employees && Objects.equals(accountName, account.accountName) && accountType == account.accountType && Objects.equals(website, account.website) && Objects.equals(description, account.description) && Objects.equals(phone, account.phone) && industry == account.industry && Objects.equals(billingStreet, account.billingStreet) && Objects.equals(billingCity, account.billingCity) && Objects.equals(billingZip, account.billingZip) && Objects.equals(billingState, account.billingState) && Objects.equals(billingCountry, account.billingCountry) && Objects.equals(shippingStreet, account.shippingStreet) && Objects.equals(shippingCity, account.shippingCity) && Objects.equals(shippingZip, account.shippingZip) && Objects.equals(shippingCountry, account.shippingCountry);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountName, accountType, website, description, phone, industry, employees, billingStreet, billingCity, billingZip, billingState, billingCountry, shippingStreet, shippingCity, shippingZip, shippingCountry);
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountName='" + accountName + '\'' +
                ", accountType=" + accountType +
                ", website='" + website + '\'' +
                ", description='" + description + '\'' +
                ", phone='" + phone + '\'' +
                ", industry=" + industry +
                ", employees=" + employees +
                ", billingStreet='" + billingStreet + '\'' +
                ", billingCity='" + billingCity + '\'' +
                ", billingZip='" + billingZip + '\'' +
                ", billingState='" + billingState + '\'' +
                ", billingCountry='" + billingCountry + '\'' +
                ", shippingStreet='" + shippingStreet + '\'' +
                ", shippingCity='" + shippingCity + '\'' +
                ", shippingZip='" + shippingZip + '\'' +
                ", shippingCountry='" + shippingCountry + '\'' +
                '}';
    }

    public static class AccountBuilder {
        private String accountName;
        private AccountType accountType;
        private String website;
        private String description;
        private String phone;
        private Industry industry;
        private int employees;
        private String billingStreet;
        private String billingCity;
        private String billingZip;
        private String billingState;
        private String billingCountry;
        private String shippingStreet;
        private String shippingCity;
        private String shippingZip;
        private String shippingCountry;

        public AccountBuilder(String accountName) {
            this.accountName = accountName;

        }

        public Account build() {
            return new Account(this);
        }

        public AccountBuilder accountName(String accountName) {
            this.accountName = accountName;
            return this;
        }

        public AccountBuilder accountType(AccountType accountType) {
            this.accountType = accountType;
            return this;
        }

        public AccountBuilder website(String website) {
            this.website = website;
            return this;
        }

        public AccountBuilder вescription(String description) {
            this.description = description;
            return this;
        }

        public AccountBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public AccountBuilder industry(Industry industry) {
            this.industry = industry;
            return this;
        }

        public AccountBuilder employees(int employees) {
            this.employees = employees;
            return this;
        }

        public AccountBuilder billingStreet(String billingStreet) {
            this.billingStreet = billingStreet;
            return this;
        }

        public AccountBuilder billingCity(String billingCity) {
            this.billingCity = billingCity;
            return this;
        }

        public AccountBuilder billingZip(String billingZip) {
            this.billingZip = billingZip;
            return this;
        }

        public AccountBuilder billingState(String billingState) {
            this.billingState = billingState;
            return this;
        }

        public AccountBuilder billingCountry(String billingCountry) {
            this.billingCountry = billingCountry;
            return this;
        }

        public AccountBuilder shippingStreet(String shippingStreet) {
            this.shippingStreet = shippingStreet;
            return this;
        }

        public AccountBuilder shippingCity(String shippingCity) {
            this.shippingCity = shippingCity;
            return this;
        }

        public AccountBuilder shippingZip(String shippingZip) {
            this.shippingZip = shippingZip;
            return this;
        }

        public AccountBuilder shippingCountry(String shippingCountry) {
            this.shippingCountry = shippingCountry;
            return this;
        }
    }

}
