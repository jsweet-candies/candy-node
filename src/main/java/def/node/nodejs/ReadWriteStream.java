package def.node.nodejs;
import def.node.Buffer;
import def.js.Function;
@jsweet.lang.Interface
@jsweet.lang.Extends({WritableStream.class})
public abstract class ReadWriteStream extends ReadableStream {
    native public ReadWriteStream pause();
    native public ReadWriteStream resume();
    public Boolean writable;
    @jsweet.lang.Optional
    public Boolean isTTY;
    native public Boolean write(Buffer buffer, Function cb);
    native public Boolean write(String str, String encoding, Function cb);
    native public void end();
    native public void end(Buffer buffer, Function cb);
    native public void end(String str, Function cb);
    native public void end(String str, String encoding, Function cb);
    native public Boolean write(Buffer buffer);
    native public Boolean write(String str, String encoding);
    native public void end(Buffer buffer);
    native public void end(String str);
    native public void end(String str, String encoding);
    native public Boolean write(String buffer, Function cb);
    native public Boolean write(String buffer);
}

