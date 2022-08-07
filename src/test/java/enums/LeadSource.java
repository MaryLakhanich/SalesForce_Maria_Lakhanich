package enums;

public enum LeadSource {
    ADVERTISEMENT("Advertisement"),
    EMPLOYEErEFERRAL("Employee Referral"),
    EXTERNALREFERRAL("External Referral"),
    INSTORE("In - Store"),
    ONSITE("On Site"),
    OTHER("Other"),
    SOCIAL("Social"),
    TRADESHOW("Trade Show"),
    WEB("Web"),
    WORDOFMOUTH("Word of mouth");

    private String leadSource;

    LeadSource(String leadSource) {
        this.leadSource = leadSource;
    }

    public String getLeadSource() {
        return leadSource;
    }
    public static LeadSource fromString(String value) {
        for (LeadSource contactLeadSource : LeadSource.values()) {
            if (contactLeadSource.getLeadSource().equals(value)) {
                return contactLeadSource;
            }
        }
        return null;
    }


}
