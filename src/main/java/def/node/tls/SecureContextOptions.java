package def.node.tls;
import def.node.Buffer;
@jsweet.lang.Interface
public abstract class SecureContextOptions extends def.js.Object {
    @jsweet.lang.Optional
    public jsweet.util.union.Union<String,Buffer> pfx;
    @jsweet.lang.Optional
    public jsweet.util.union.Union<String,Buffer> key;
    @jsweet.lang.Optional
    public String passphrase;
    @jsweet.lang.Optional
    public jsweet.util.union.Union<String,Buffer> cert;
    @jsweet.lang.Optional
    public jsweet.util.union.Union<String,Buffer> ca;
    @jsweet.lang.Optional
    public jsweet.util.union.Union<String,String[]> crl;
    @jsweet.lang.Optional
    public String ciphers;
    @jsweet.lang.Optional
    public Boolean honorCipherOrder;
}

