package enums;

import com.sun.source.doctree.StartElementTree;

public enum Salutation {
    MR("Mr."),
    MS("Ms."),
    MRS("Mrs."),
    DR("Dr."),
    PROF("Prof.");;

    private String salutation;

    Salutation(String salutation){
        this.salutation=salutation;
    }
    public String getSalutation() {
        return salutation;
    }
    public String getChosenSalutation() {
        return this.salutation;
    }

    public static Salutation fromString(String value) {
        for (Salutation contactSalutation : Salutation.values()) {
            if (contactSalutation.getChosenSalutation().equals(value)) {
                return contactSalutation;
            }
        }
        return null;
    }
}


