package def.node.path.posix;
import def.node.path.ParsedPath;
/** This class holds all the global functions and variables of the posix package. */
public final class Globals {
    private Globals(){}
    native public static String normalize(String p);
    native public static String join(Object... paths);
    native public static String resolve(Object... pathSegments);
    native public static Boolean isAbsolute(String p);
    native public static String relative(String from, String to);
    native public static String dirname(String p);
    native public static String basename(String p, String ext);
    native public static String extname(String p);
    public static String sep;
    public static String delimiter;
    native public static ParsedPath parse(String p);
    native public static String format(ParsedPath pP);
    native public static String basename(String p);
}

