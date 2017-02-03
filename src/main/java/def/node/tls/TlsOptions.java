package def.node.tls;
import def.js.Error;
import def.node.Buffer;
@jsweet.lang.Interface
public abstract class TlsOptions extends def.js.Object {
    @jsweet.lang.Optional
    public String host;
    @jsweet.lang.Optional
    public double port;
    @jsweet.lang.Optional
    public jsweet.util.union.Union<String,Buffer[]> pfx;
    @jsweet.lang.Optional
    public Object key;
    @jsweet.lang.Optional
    public String passphrase;
    @jsweet.lang.Optional
    public Object cert;
    @jsweet.lang.Optional
    public Object ca;
    @jsweet.lang.Optional
    public jsweet.util.union.Union<String,String[]> crl;
    @jsweet.lang.Optional
    public String ciphers;
    @jsweet.lang.Optional
    public Boolean honorCipherOrder;
    @jsweet.lang.Optional
    public Boolean requestCert;
    @jsweet.lang.Optional
    public Boolean rejectUnauthorized;
    @jsweet.lang.Optional
    public jsweet.util.union.Union<String[],Buffer> NPNProtocols;
    @jsweet.lang.Optional
    public java.util.function.BiFunction<String,java.util.function.BiFunction<Error,SecureContext,Object>,Object> SNICallback;
    @jsweet.lang.Optional
    public String ecdhCurve;
    @jsweet.lang.Optional
    public jsweet.util.union.Union<String,Buffer> dhparam;
    @jsweet.lang.Optional
    public double handshakeTimeout;
    @jsweet.lang.Optional
    public jsweet.util.union.Union<String[],Buffer> ALPNProtocols;
    @jsweet.lang.Optional
    public double sessionTimeout;
    @jsweet.lang.Optional
    public Object ticketKeys;
    @jsweet.lang.Optional
    public String sessionIdContext;
    @jsweet.lang.Optional
    public String secureProtocol;
}

