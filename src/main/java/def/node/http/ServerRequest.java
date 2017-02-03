package def.node.http;
/**
     * @deprecated Use IncomingMessage
     */
@jsweet.lang.Interface
public abstract class ServerRequest extends IncomingMessage {
    public def.node.net.Socket connection;
}

