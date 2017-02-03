package def.node.string_decoder;
import def.node.Buffer;
@jsweet.lang.Interface
public abstract class NodeStringDecoder extends def.js.Object {
    native public String write(Buffer buffer);
    native public String end(Buffer buffer);
    native public String end();
}

