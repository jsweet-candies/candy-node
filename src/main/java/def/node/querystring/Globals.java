package def.node.querystring;
/** This class holds all the global functions and variables of the querystring package. */
public final class Globals {
    private Globals(){}
    native public static <T> String stringify(T obj, String sep, String eq, StringifyOptions options);
    native public static <T extends java.lang.Object> T parse(String str, String sep, String eq, ParseOptions options);
    native public static String escape(String str);
    native public static String unescape(String str);
    native public static <T> String stringify(T obj, String sep, String eq);
    native public static <T> String stringify(T obj, String sep);
    native public static <T> String stringify(T obj);
    native public static Object parse(String str, String sep, String eq);
    native public static Object parse(String str, String sep);
    native public static Object parse(String str);
}

