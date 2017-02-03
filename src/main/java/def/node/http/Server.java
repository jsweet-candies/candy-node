package def.node.http;
import def.js.Function;
@jsweet.lang.Interface
public abstract class Server extends def.node.net.Server {
    native public void setTimeout(double msecs, Function callback);
    public double maxHeadersCount;
    public double timeout;
    public Boolean listening;
}

