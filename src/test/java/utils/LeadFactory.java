package utils;

import com.github.javafaker.Faker;
import enums.*;
import models.Lead;

public class LeadFactory {
    static Faker faker = new Faker();

    public static Lead createCompletelyFilledLead() {
        return Lead.builder()
                .lastName(faker.name().lastName())
                .company(faker.company().name())
                .leadStatus(LeadStatus.QUALIFIED)
                .salutation(Salutation.MR)
                .firstName(faker.name().firstName())
                .phone(faker.phoneNumber().phoneNumber())
                .email(faker.internet().emailAddress())
                .title(faker.name().title())
                .rating(Rating.HOT)
                .website(faker.internet().url())
                .street(faker.name().firstName())
                .state(faker.name().lastName())
                .city(faker.name().firstName())
                .zipCode(faker.address().zipCode())
                .country(faker.name().username())
                .numberOfEmployees("15")
                .leadSource(LeadSource.ADVERTISEMENT)
                .industry(Industry.BIOTECHNOLOGY)
                .build();
    }
    public static Lead createLeadWithMinimItems() {
        return Lead.builder()
                .firstName(faker.name().firstName())
                .lastName(faker.name().lastName())
                .company(faker.company().name())
                .leadStatus(LeadStatus.QUALIFIED)
                .salutation(Salutation.MR)
                .leadSource(LeadSource.ADVERTISEMENT)
                .build();
    }
}

