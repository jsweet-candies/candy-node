package def.node.url;
/** This class holds all the global functions and variables of the url package. */
public final class Globals {
    private Globals(){}
    native public static Url parse(String urlStr, Boolean parseQueryString, Boolean slashesDenoteHost);
    native public static String format(Url url);
    native public static String resolve(String from, String to);
    native public static Url parse(String urlStr, Boolean parseQueryString);
    native public static Url parse(String urlStr);
}

