package def.node.crypto;
import def.node.Buffer;
@jsweet.lang.Interface
public abstract class Hash extends def.node.nodejs.ReadWriteStream {
    native public Hash update(String data);
    native public Hash update(String data, def.node.StringTypes.utf8 input_encoding);
    native public Buffer digest();
    native public String digest(def.node.StringTypes.latin1 encoding);
    native public Hash update(Buffer data);
    native public Hash update(Buffer data, def.node.StringTypes.latin1 input_encoding);
    native public Hash update(String data, def.node.StringTypes.ascii input_encoding);
    native public Hash update(String data, def.node.StringTypes.latin1 input_encoding);
    native public Hash update(Buffer data, def.node.StringTypes.utf8 input_encoding);
    native public Hash update(Buffer data, def.node.StringTypes.ascii input_encoding);
    native public String digest(def.node.StringTypes.base64 encoding);
    native public String digest(def.node.StringTypes.hex encoding);
}

