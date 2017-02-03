package def.node.crypto;
@jsweet.lang.Interface
public abstract class CredentialDetails extends def.js.Object {
    public String pfx;
    public String key;
    public String passphrase;
    public String cert;
    public jsweet.util.union.Union<String,String[]> ca;
    public jsweet.util.union.Union<String,String[]> crl;
    public String ciphers;
}

