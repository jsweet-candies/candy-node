package def.node.http;
import def.node.Buffer;
import def.js.Function;
@jsweet.lang.Interface
public abstract class ServerResponse extends def.node.stream.Writable {
    native public Boolean write(Buffer buffer);
    native public Boolean write(Buffer buffer, Function cb);
    native public Boolean write(String str, Function cb);
    native public Boolean write(String str, String encoding, Function cb);
    native public Boolean write(String str, String encoding, String fd);
    native public void writeContinue();
    native public void writeHead(double statusCode, String reasonPhrase, Object headers);
    native public void writeHead(double statusCode, Object headers);
    public double statusCode;
    public String statusMessage;
    public Boolean headersSent;
    native public void setHeader(String name, String value);
    native public ServerResponse setTimeout(double msecs, Function callback);
    public Boolean sendDate;
    native public String getHeader(String name);
    native public void removeHeader(String name);
    native public void addTrailers(Object headers);
    public Boolean finished;
    native public void end();
    native public void end(Buffer buffer, Function cb);
    native public void end(String str, Function cb);
    native public void end(String str, String encoding, Function cb);
    native public void end(Object data, String encoding);
    native public Boolean write(String str);
    native public Boolean write(String str, String encoding);
    native public void writeHead(double statusCode, String reasonPhrase);
    native public void writeHead(double statusCode);
    native public void end(Buffer buffer);
    native public void end(String str);
    native public void end(String str, String encoding);
    native public void end(Object data);
    native public void setHeader(String name, String[] value);
}

