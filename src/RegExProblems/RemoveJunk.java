package RegExProblems;

public class RemoveJunk {
    public static String removeJunkChars(String s)
    {
        s = s.replaceAll("[^a-zA-Z0-9]","");
        return s;
    }
}
