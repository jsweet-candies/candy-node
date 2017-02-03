package def.node.os;
/** This class holds all the global functions and variables of the os package. */
public final class Globals {
    private Globals(){}
    native public static String hostname();
    native public static double[] loadavg();
    native public static double uptime();
    native public static double freemem();
    native public static double totalmem();
    native public static CpuInfo[] cpus();
    native public static String type();
    native public static String release();
    native public static NetworkInterfaces networkInterfaces();
    native public static String homedir();
    native public static UserInfo userInfo(Options options);
    public static Constants constants;
    native public static String arch();
    native public static Object platform();
    native public static String tmpdir();
    public static String EOL;
    native public static jsweet.util.union.Union<def.node.StringTypes.BE,def.node.StringTypes.LE> endianness();
    native public static UserInfo userInfo();
}

