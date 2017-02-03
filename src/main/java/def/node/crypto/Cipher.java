package def.node.crypto;
import def.node.Buffer;
@jsweet.lang.Interface
public abstract class Cipher extends def.node.nodejs.ReadWriteStream {
    native public Buffer update(Buffer data);
    native public Buffer update(String data, def.node.StringTypes.utf8 input_encoding);
    native public String update(Buffer data, Object input_encoding, def.node.StringTypes.binary output_encoding);
    native public String update(String data, def.node.StringTypes.utf8 input_encoding, def.node.StringTypes.binary output_encoding);
    @jsweet.lang.Name("final")
    native public Buffer Final();
    @jsweet.lang.Name("final")
    native public String Final(String output_encoding);
    native public void setAutoPadding(Boolean auto_padding);
    native public Buffer getAuthTag();
    native public void setAAD(Buffer buffer);
    native public void setAutoPadding();
    native public Buffer update(String data, def.node.StringTypes.binary input_encoding);
    native public Buffer update(String data, def.node.StringTypes.ascii input_encoding);
    native public String update(Buffer data, Object input_encoding, def.node.StringTypes.base64 output_encoding);
    native public String update(Buffer data, Object input_encoding, def.node.StringTypes.hex output_encoding);
    native public String update(String data, def.node.StringTypes.ascii input_encoding, def.node.StringTypes.hex output_encoding);
    native public String update(String data, def.node.StringTypes.utf8 input_encoding, def.node.StringTypes.hex output_encoding);
    native public String update(String data, def.node.StringTypes.ascii input_encoding, def.node.StringTypes.base64 output_encoding);
    native public String update(String data, def.node.StringTypes.binary input_encoding, def.node.StringTypes.hex output_encoding);
    native public String update(String data, def.node.StringTypes.binary input_encoding, def.node.StringTypes.base64 output_encoding);
    native public String update(String data, def.node.StringTypes.utf8 input_encoding, def.node.StringTypes.base64 output_encoding);
    native public String update(String data, def.node.StringTypes.binary input_encoding, def.node.StringTypes.binary output_encoding);
    native public String update(String data, def.node.StringTypes.ascii input_encoding, def.node.StringTypes.binary output_encoding);
}

