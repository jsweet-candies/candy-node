package def.node.https;
@jsweet.lang.Interface
public abstract class RequestOptions extends def.node.http.RequestOptions {
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
    public String ciphers;
    @jsweet.lang.Optional
    public Boolean rejectUnauthorized;
    @jsweet.lang.Optional
    public String secureProtocol;
}

