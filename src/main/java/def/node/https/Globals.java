package def.node.https;
import def.js.Function;
/** This class holds all the global functions and variables of the https package. */
public final class Globals {
    private Globals(){}
    native public static Server createServer(ServerOptions options, Function requestListener);
    native public static def.node.http.ClientRequest request(RequestOptions options, java.util.function.Consumer<def.node.http.IncomingMessage> callback);
    native public static def.node.http.ClientRequest get(RequestOptions options, java.util.function.Consumer<def.node.http.IncomingMessage> callback);
    public static Agent globalAgent;
    native public static Server createServer(ServerOptions options);
    native public static def.node.http.ClientRequest request(RequestOptions options);
    native public static def.node.http.ClientRequest get(RequestOptions options);
}

