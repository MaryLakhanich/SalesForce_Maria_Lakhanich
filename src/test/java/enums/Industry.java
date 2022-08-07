package enums;

public enum Industry {
    AGRICULTURE("Agriculture"),
    APPAREL("Apparel"),
    BANKING("Banking"),
    BIOTECHNOLOGY("Biotechnology"),
    CHEMICALS("Chemicals"),
    COMMUNICATIONS("Communications"),
    CONSTRUCTION("Construction"),
    CONSULTING("Consulting"),
    EDUCATION("Education"),
    ELECTRONICS("Electronics"),
    ENERGY("Energy"),
    ENGINEERING("Engineering"),
    ENTERTAINMENT("Entertainment"),
    ENVIRONMENTAL("Environmental"),
    FINANCE("Finance"),
    FOODANDBEVERAGE("Food & Beverage"),
    GOVERNMENT("Government"),
    HEALTHCARE("Healthcare"),
    HOSPITALITY("Hospitality"),
    INSURANCE("Insurance"),
    MACHINERY("Machinery"),
    MANUFACTURING("Manufacturing"),
    MEDIA("Media"),
    NOTFORPROFIT("Not For Profit"),
    RECREATION("Recreation"),
    RETAIL("Retail"),
    SHIPPING("Shipping"),
    TECHNOLOGY("Technology"),
    TELECOMMUNICATIONS("Telecommunications"),
    TRANSPORTATION("Transportation"),
    UTILITIES("Utilities"),
    OTHER("Other");

    private String industry;

    Industry(String industry) {
        this.industry=industry;
    }

    public String getIndustry() {
        return industry;
    }
    public static Industry fromString(String value) {
        for (Industry contactIndustry : Industry.values()) {
            if (contactIndustry.getIndustry().equals(value)) {
                return contactIndustry;
            }
        }
        return null;
    }
}
