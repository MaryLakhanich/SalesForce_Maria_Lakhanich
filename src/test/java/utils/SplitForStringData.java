package utils;

public class SplitForStringData {
    public static String[] fullNameSplit(String fullName) {
        String[] fullNameSplit = fullName.split("\\s");
        return fullNameSplit;
    }

    public static String textSplit(String text) {
        String splitText;
        splitText = text.replace("Open", "");
        splitText = splitText.replace("Preview", "");
        splitText = splitText.replace(" ", "");
        return splitText;
    }

    public static String dollarSplit(String annualRevenue) {
        String annualRevenueSplit = annualRevenue.replace("$", "");
        return annualRevenueSplit;
    }
}
