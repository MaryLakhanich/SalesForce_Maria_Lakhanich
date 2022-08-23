package utils;

import com.github.javafaker.Faker;
import enums.LeadSource;
import enums.Salutation;
import models.Contact;

public class ContactFactory {
    static Faker faker = new Faker();

    public static Contact createCompletelyFilledContact() {
        return Contact.builder()
                .lastName(faker.name().lastName()).accountName("madelyn.stamm")
                .firstName(faker.name().firstName())
                .salutation(Salutation.MRS)
                .phone(faker.phoneNumber().phoneNumber())
                .mobile(faker.phoneNumber().phoneNumber())
                .email(faker.internet().emailAddress())
                .title(faker.name().title())
                .mailingStreet(faker.name().username())
                .mailingCity(faker.name().username())
                .mailingState(faker.name().username())
                .mailingZip(faker.address().zipCode())
                .mailingCountry(faker.name().username())
                .otherStreet(faker.name().username())
                .otherCity(faker.name().username())
                .otherState(faker.name().username())
                .otherZip(faker.address().zipCode())
                .otherCountry(faker.name().username())
                .fax(faker.phoneNumber().phoneNumber())
                .homePhone(faker.phoneNumber().phoneNumber())
                .otherPhone(faker.phoneNumber().phoneNumber())
                .asstPhone(faker.phoneNumber().phoneNumber())
                .assistant(faker.name().username())
                .department(faker.name().username())
                .leadSource(LeadSource.ADVERTISEMENT)
                .birthdate("01/05/1990")
                .build();
    }
    public static Contact createContactWithMinimumItems(){
        return Contact.builder()
                .salutation(Salutation.MR)
                .firstName(faker.name().firstName())
                .lastName(faker.name().lastName())
                .build();
        }


}
