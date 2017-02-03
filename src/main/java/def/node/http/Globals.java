package def.node.http;
/** This class holds all the global functions and variables of the http package. */
public final class Globals {
    private Globals(){}
    public static String[] METHODS;
    native public static Server createServer(java.util.function.BiConsumer<IncomingMessage,ServerResponse> requestListener);
    native public static Object createClient(double port, String host);
    native public static ClientRequest request(RequestOptions options, java.util.function.Consumer<IncomingMessage> callback);
    native public static ClientRequest get(Object options, java.util.function.Consumer<IncomingMessage> callback);
    public static Agent globalAgent;
    native public static Server createServer();
    native public static Object createClient(double port);
    native public static Object createClient();
    native public static ClientRequest request(RequestOptions options);
    native public static ClientRequest get(Object options);
}

