package def.node.dgram;
import def.node.Buffer;
/** This class holds all the global functions and variables of the dgram package. */
public final class Globals {
    private Globals(){}
    native public static Socket createSocket(String type, java.util.function.BiConsumer<Buffer,RemoteInfo> callback);
    native public static Socket createSocket(SocketOptions options, java.util.function.BiConsumer<Buffer,RemoteInfo> callback);
    native public static Socket createSocket(String type);
    native public static Socket createSocket(SocketOptions options);
}

