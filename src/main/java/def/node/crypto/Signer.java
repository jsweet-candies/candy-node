package def.node.crypto;
import def.node.Buffer;
@jsweet.lang.Interface
public abstract class Signer extends def.node.nodejs.WritableStream {
    native public Signer update(String data);
    native public Signer update(String data, def.node.StringTypes.utf8 input_encoding);
    native public Buffer sign(String private_key);
    native public String sign(String private_key, def.node.StringTypes.latin1 output_format);
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Private_key extends def.js.Object {
        public String key;
        public String passphrase;
    }
    native public Signer update(Buffer data);
    native public Signer update(Buffer data, def.node.StringTypes.ascii input_encoding);
    native public Signer update(Buffer data, def.node.StringTypes.latin1 input_encoding);
    native public Signer update(String data, def.node.StringTypes.ascii input_encoding);
    native public Signer update(String data, def.node.StringTypes.latin1 input_encoding);
    native public Signer update(Buffer data, def.node.StringTypes.utf8 input_encoding);
    native public Buffer sign(Private_key private_key);
    native public String sign(Private_key private_key, def.node.StringTypes.latin1 output_format);
    native public String sign(String private_key, def.node.StringTypes.hex output_format);
    native public String sign(Private_key private_key, def.node.StringTypes.base64 output_format);
    native public String sign(Private_key private_key, def.node.StringTypes.hex output_format);
    native public String sign(String private_key, def.node.StringTypes.base64 output_format);
}

