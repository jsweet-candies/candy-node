package def.node.net;
import def.js.Function;
/** This class holds all the global functions and variables of the net package. */
public final class Globals {
    private Globals(){}
    native public static Server createServer(java.util.function.Consumer<Socket> connectionListener);
    native public static Server createServer(OptionsData options, java.util.function.Consumer<Socket> connectionListener);
    native public static Socket connect(OptionsDto options, Function connectionListener);
    native public static Socket connect(double port, String host, Function connectionListener);
    native public static Socket connect(String path, Function connectionListener);
    native public static Socket createConnection(OptionsDto options, Function connectionListener);
    native public static Socket createConnection(double port, String host, Function connectionListener);
    native public static Socket createConnection(String path, Function connectionListener);
    native public static double isIP(String input);
    native public static Boolean isIPv4(String input);
    native public static Boolean isIPv6(String input);
    native public static Server createServer();
    native public static Server createServer(OptionsData options);
    native public static Socket connect(OptionsDto options);
    native public static Socket connect(double port, String host);
    native public static Socket connect(double port);
    native public static Socket connect(String path);
    native public static Socket createConnection(OptionsDto options);
    native public static Socket createConnection(double port, String host);
    native public static Socket createConnection(double port);
    native public static Socket createConnection(String path);
}

