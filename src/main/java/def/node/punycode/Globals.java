package def.node.punycode;
/** This class holds all the global functions and variables of the punycode package. */
public final class Globals {
    private Globals(){}
    native public static String decode(String string);
    native public static String encode(String string);
    native public static String toUnicode(String domain);
    native public static String toASCII(String domain);
    public static Object version;
}

