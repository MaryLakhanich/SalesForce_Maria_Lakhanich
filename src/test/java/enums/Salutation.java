package enums;

import com.sun.source.doctree.StartElementTree;

public enum Salutation {
    MR("Mr."),
    MS("Ms."),
    MRS("Mrs."),
    DR("Dr."),
    PROF("Prof.");;

    private String name;

    Salutation(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }
    public static Salutation fromString(String value) {
        for (Salutation contactSalutation : Salutation.values()) {
            if (contactSalutation.getName().equals(value)) {
                return contactSalutation;
            }
        }
        return null;
    }
}


