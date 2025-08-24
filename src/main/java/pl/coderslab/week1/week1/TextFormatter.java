package pl.coderslab.week1.week1;

public class TextFormatter {
    public static String format(String text) {
        if (text == null) {
            return null;
        }
        return text.replace("\\t", "\t")
                .replace("\\n", "\n")
                .replaceAll("\\s+", " ")
                .trim();
    }
}
