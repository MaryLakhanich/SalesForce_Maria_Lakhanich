package enums;

public enum LeadStatus {
    NONE("--None--"),
    NEW("New"),
    CONTACTED("Contacted"),
    WORKING("Working"),
    QUALIFIED("Qualified"),
    UNQUALIFIED("Unqualified");
    private final String leadStatus;

    LeadStatus(String leadStatus) {
        this.leadStatus = leadStatus;
    }
    public String getChosenLeadStatus() {
        return this.leadStatus;
    }
    public static LeadStatus fromString(String value) {
        for (LeadStatus contactLeadStatus : LeadStatus.values()) {
            if (contactLeadStatus.getChosenLeadStatus().equals(value)) {
                return contactLeadStatus;
            }
        }
        return null;
    }


}