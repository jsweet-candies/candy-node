package def.node.tls;
import jsweet.util.union.Union3;
import def.node.Buffer;
@jsweet.lang.Interface
public abstract class ConnectionOptions extends def.js.Object {
    @jsweet.lang.Optional
    public String host;
    @jsweet.lang.Optional
    public double port;
    @jsweet.lang.Optional
    public def.node.net.Socket socket;
    @jsweet.lang.Optional
    public jsweet.util.union.Union<String,Buffer> pfx;
    @jsweet.lang.Optional
    public Object key;
    @jsweet.lang.Optional
    public String passphrase;
    @jsweet.lang.Optional
    public Object cert;
    @jsweet.lang.Optional
    public Union3<String,Buffer,jsweet.util.union.Union<String,Buffer>[]> ca;
    @jsweet.lang.Optional
    public Boolean rejectUnauthorized;
    @jsweet.lang.Optional
    public jsweet.util.union.Union<String,Buffer>[] NPNProtocols;
    @jsweet.lang.Optional
    public String servername;
    @jsweet.lang.Optional
    public String path;
    @jsweet.lang.Optional
    public jsweet.util.union.Union<String,Buffer>[] ALPNProtocols;
    @jsweet.lang.Optional
    public java.util.function.BiFunction<String,Union3<String,Buffer,jsweet.util.union.Union<String,Buffer>[]>,Object> checkServerIdentity;
    @jsweet.lang.Optional
    public String secureProtocol;
    @jsweet.lang.Optional
    public Object secureContext;
    @jsweet.lang.Optional
    public Buffer session;
    @jsweet.lang.Optional
    public double minDHSize;
}

