package def.node.http;
import def.js.Error;
import def.js.Function;
@jsweet.lang.Interface
public abstract class IncomingMessage extends def.node.stream.Readable {
    public String httpVersion;
    public double httpVersionMajor;
    public double httpVersionMinor;
    public def.node.net.Socket connection;
    public Object headers;
    public String[] rawHeaders;
    public Object trailers;
    public Object rawTrailers;
    native public def.node.nodejs.Timer setTimeout(double msecs, Function callback);
    /**
         * Only valid for request obtained from http.Server.
         */
    @jsweet.lang.Optional
    public String method;
    /**
         * Only valid for request obtained from http.Server.
         */
    @jsweet.lang.Optional
    public String url;
    /**
         * Only valid for response obtained from http.ClientRequest.
         */
    @jsweet.lang.Optional
    public double statusCode;
    /**
         * Only valid for response obtained from http.ClientRequest.
         */
    @jsweet.lang.Optional
    public String statusMessage;
    public def.node.net.Socket socket;
    native public void destroy(Error error);
    native public void destroy();
}

