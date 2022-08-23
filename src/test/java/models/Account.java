package models;

import enums.AccountType;
import enums.Industry;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class Account {
    @NonNull
    private String accountName;
    private String parentAccount;
    private AccountType accountType;
    private String website;
    private String description;
    private String phone;
    private Industry industry;
    private String employees;
    private String billingStreet;
    private String billingCity;
    private String billingZip;
    private String billingState;
    private String billingCountry;
    private String billingAddress;
    private String shippingStreet;
    private String shippingCity;
    private String shippingZip;
    private String shippingCountry;
    private String shippingState;
    private String shippingAddress;


}