package def.node.crypto;
import def.node.Buffer;
@jsweet.lang.Interface
public abstract class Verify extends def.node.nodejs.WritableStream {
    native public Verify update(String data);
    native public Verify update(String data, def.node.StringTypes.utf8 input_encoding);
    native public Boolean verify(String object, Buffer signature);
    native public Boolean verify(String object, String signature, def.node.StringTypes.latin1 signature_format);
    native public Verify update(Buffer data);
    native public Verify update(String data, def.node.StringTypes.latin1 input_encoding);
    native public Verify update(String data, def.node.StringTypes.ascii input_encoding);
    native public Verify update(Buffer data, def.node.StringTypes.latin1 input_encoding);
    native public Verify update(Buffer data, def.node.StringTypes.utf8 input_encoding);
    native public Verify update(Buffer data, def.node.StringTypes.ascii input_encoding);
    native public Boolean verify(String object, String signature, def.node.StringTypes.hex signature_format);
    native public Boolean verify(String object, String signature, def.node.StringTypes.base64 signature_format);
}

