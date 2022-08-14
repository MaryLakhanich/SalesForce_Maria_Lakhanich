package utils;

import com.github.javafaker.Faker;
import enums.AccountType;
import enums.Industry;
import models.Account;

public class AccountFactory {
    Faker faker = new Faker();

    public Account createCompletelyFilledAccount() {
        return Account.builder()
                .accountName(faker.name().username())
                .phone(faker.phoneNumber().phoneNumber())
                .website(faker.internet().url())
                .employees("35")
                .accountType(AccountType.CUSTOMER)
                .industry(Industry.APPAREL)
                .description(faker.name().username())
                .billingStreet(faker.name().username())
                .billingCity(faker.name().username())
                .billingState(faker.name().username())
                .billingZip(faker.address().zipCode())
                .billingCountry(faker.name().username())
                .shippingStreet(faker.name().username())
                .shippingCity(faker.name().username())
                .shippingState(faker.name().username())
                .shippingZip(faker.address().zipCode())
                .shippingCountry(faker.name().username())
                .build();
    }
    public Account createAccountWithMinimumItems() {
        return Account.builder()
                .accountName(faker.name().username())
                .accountType(AccountType.ANALYST)
                .industry(Industry.AGRICULTURE)
                .build();
    }

}
