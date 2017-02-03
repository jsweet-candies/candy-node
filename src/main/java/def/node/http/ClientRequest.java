package def.node.http;
import def.node.Buffer;
import def.js.Function;
@jsweet.lang.Interface
public abstract class ClientRequest extends def.node.stream.Writable {
    native public Boolean write(Buffer buffer);
    native public Boolean write(Buffer buffer, Function cb);
    native public Boolean write(String str, Function cb);
    native public Boolean write(String str, String encoding, Function cb);
    native public Boolean write(String str, String encoding, String fd);
    native public void abort();
    native public void setTimeout(double timeout, Function callback);
    native public void setNoDelay(Boolean noDelay);
    native public void setSocketKeepAlive(Boolean enable, double initialDelay);
    native public void setHeader(String name, String value);
    native public String getHeader(String name);
    native public void removeHeader(String name);
    native public void addTrailers(Object headers);
    native public void end();
    native public void end(Buffer buffer, Function cb);
    native public void end(String str, Function cb);
    native public void end(String str, String encoding, Function cb);
    native public void end(Object data, String encoding);
    native public Boolean write(String str);
    native public Boolean write(String str, String encoding);
    native public void setTimeout(double timeout);
    native public void setNoDelay();
    native public void setSocketKeepAlive(Boolean enable);
    native public void setSocketKeepAlive();
    native public void end(Buffer buffer);
    native public void end(String str);
    native public void end(String str, String encoding);
    native public void end(Object data);
    native public void setHeader(String name, String[] value);
}

