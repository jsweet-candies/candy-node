package def.node.dns;
import def.js.Error;
/** This class holds all the global functions and variables of the dns package. */
public final class Globals {
    private Globals(){}
    native public static String lookup(String domain, double family, jsweet.util.function.TriConsumer<Error,String,Double> callback);
    native public static String lookup(String domain, jsweet.util.function.TriConsumer<Error,String,Double> callback);
    native public static String[] resolve(String domain, String rrtype, java.util.function.BiConsumer<Error,String[]> callback);
    native public static String[] resolve(String domain, java.util.function.BiConsumer<Error,String[]> callback);
    native public static String[] resolve4(String domain, java.util.function.BiConsumer<Error,String[]> callback);
    native public static String[] resolve6(String domain, java.util.function.BiConsumer<Error,String[]> callback);
    native public static String[] resolveMx(String domain, java.util.function.BiConsumer<Error,MxRecord[]> callback);
    native public static String[] resolveTxt(String domain, java.util.function.BiConsumer<Error,String[]> callback);
    native public static String[] resolveSrv(String domain, java.util.function.BiConsumer<Error,String[]> callback);
    native public static String[] resolveNs(String domain, java.util.function.BiConsumer<Error,String[]> callback);
    native public static String[] resolveCname(String domain, java.util.function.BiConsumer<Error,String[]> callback);
    native public static String[] reverse(String ip, java.util.function.BiConsumer<Error,String[]> callback);
    native public static void setServers(String[] servers);
    public static String NODATA;
    public static String FORMERR;
    public static String SERVFAIL;
    public static String NOTFOUND;
    public static String NOTIMP;
    public static String REFUSED;
    public static String BADQUERY;
    public static String BADNAME;
    public static String BADFAMILY;
    public static String BADRESP;
    public static String CONNREFUSED;
    public static String TIMEOUT;
    public static String EOF;
    public static String FILE;
    public static String NOMEM;
    public static String DESTRUCTION;
    public static String BADSTR;
    public static String BADFLAGS;
    public static String NONAME;
    public static String BADHINTS;
    public static String NOTINITIALIZED;
    public static String LOADIPHLPAPI;
    public static String ADDRGETNETWORKPARAMS;
    public static String CANCELLED;
}

