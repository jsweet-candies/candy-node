package def.node.https;
import def.js.Error;
@jsweet.lang.Interface
public abstract class ServerOptions extends def.js.Object {
    @jsweet.lang.Optional
    public Object pfx;
    @jsweet.lang.Optional
    public Object key;
    @jsweet.lang.Optional
    public String passphrase;
    @jsweet.lang.Optional
    public Object cert;
    @jsweet.lang.Optional
    public Object ca;
    @jsweet.lang.Optional
    public Object crl;
    @jsweet.lang.Optional
    public String ciphers;
    @jsweet.lang.Optional
    public Boolean honorCipherOrder;
    @jsweet.lang.Optional
    public Boolean requestCert;
    @jsweet.lang.Optional
    public Boolean rejectUnauthorized;
    @jsweet.lang.Optional
    public Object NPNProtocols;
    @jsweet.lang.Optional
    public java.util.function.BiFunction<String,java.util.function.BiFunction<Error,def.node.tls.SecureContext,Object>,Object> SNICallback;
}

