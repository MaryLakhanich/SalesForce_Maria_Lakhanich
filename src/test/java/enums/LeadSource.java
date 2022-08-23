package enums;

public enum LeadSource {
    ADVERTISEMENT("Advertisement"),
    CUSTOMEREVENT("Customer event"),
    EMPLOYEEREFERRAL("Employee Referral"),
    EXTERNALREFERRAL("External Referral"),
    PARTNER("Partner"),
    GOOGLEADWORDS("Coogle adWords"),
    OTHER("Other"),
    SOCIAL("Social"),
    TRADESHOW("Trade Show"),
    WEBINAR("Webinar"),
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
    public String getChosenLeadSource(){
        return this.leadSource;
    }


}
