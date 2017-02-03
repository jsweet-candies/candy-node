package def.node.tls;
/** This class holds all the global functions and variables of the tls package. */
public final class Globals {
    private Globals(){}
    public static double CLIENT_RENEG_LIMIT;
    public static double CLIENT_RENEG_WINDOW;
    native public static Server createServer(TlsOptions options, java.util.function.Consumer<ClearTextStream> secureConnectionListener);
    native public static ClearTextStream connect(ConnectionOptions options, java.lang.Runnable secureConnectionListener);
    native public static ClearTextStream connect(double port, String host, ConnectionOptions options, java.lang.Runnable secureConnectListener);
    native public static ClearTextStream connect(double port, ConnectionOptions options, java.lang.Runnable secureConnectListener);
    native public static SecurePair createSecurePair(def.node.crypto.Credentials credentials, Boolean isServer, Boolean requestCert, Boolean rejectUnauthorized);
    native public static SecureContext createSecureContext(SecureContextOptions details);
    native public static Server createServer(TlsOptions options);
    native public static ClearTextStream connect(ConnectionOptions options);
    native public static ClearTextStream connect(double port, String host, ConnectionOptions options);
    native public static ClearTextStream connect(double port, String host);
    native public static ClearTextStream connect(double port);
    native public static ClearTextStream connect(double port, ConnectionOptions options);
    native public static SecurePair createSecurePair(def.node.crypto.Credentials credentials, Boolean isServer, Boolean requestCert);
    native public static SecurePair createSecurePair(def.node.crypto.Credentials credentials, Boolean isServer);
    native public static SecurePair createSecurePair(def.node.crypto.Credentials credentials);
    native public static SecurePair createSecurePair();
}

