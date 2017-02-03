package def.node.crypto;
import def.node.Buffer;
@jsweet.lang.Interface
public abstract class Hmac extends def.node.nodejs.ReadWriteStream {
    native public Hmac update(String data);
    native public Hmac update(String data, def.node.StringTypes.utf8 input_encoding);
    native public Buffer digest();
    native public String digest(def.node.StringTypes.latin1 encoding);
    native public Hmac update(Buffer data);
    native public Hmac update(Buffer data, def.node.StringTypes.latin1 input_encoding);
    native public Hmac update(String data, def.node.StringTypes.ascii input_encoding);
    native public Hmac update(String data, def.node.StringTypes.latin1 input_encoding);
    native public Hmac update(Buffer data, def.node.StringTypes.ascii input_encoding);
    native public Hmac update(Buffer data, def.node.StringTypes.utf8 input_encoding);
    native public String digest(def.node.StringTypes.hex encoding);
    native public String digest(def.node.StringTypes.base64 encoding);
}

