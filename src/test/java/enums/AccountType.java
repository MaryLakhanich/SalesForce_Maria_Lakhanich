package enums;

public enum AccountType {
    ANALYST("Analyst"),
    COMPETITOR("Competitor"),
    CUSTOMER("Customer"),
    INTEGRATOR("Integrator"),
    INVESTOR("Investor"),
    PARTNER("Partner"),
    PRESS("Press"),
    PROSPECT("Prospect"),
    RESELLER("Reseller"),
    OTHER("Other");

    private String typeOfAccount;

    AccountType(String typeOfAccount) {
        this.typeOfAccount = typeOfAccount;
    }

    public String getTypeOfAccount() {
        return typeOfAccount;
    }

    public static AccountType fromString(String value) {
        for (AccountType contactAccountType : AccountType.values()) {
            if (contactAccountType.getTypeOfAccount().equals(value)) {
                return contactAccountType;
            }
        }
        return null;
    }
}
