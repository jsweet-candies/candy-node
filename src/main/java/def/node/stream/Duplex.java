package def.node.stream;
import def.node.Buffer;
import def.node.nodejs.ReadWriteStream;
import def.js.Function;
@jsweet.lang.Extends({def.node.nodejs.ReadWriteStream.class})
public class Duplex extends Readable {
    public Boolean writable;
    public Duplex(DuplexOptions opts){}
    native public void _write(Object chunk, String encoding, Function callback);
    native public Boolean write(Object chunk, Function cb);
    native public Boolean write(Object chunk, String encoding, Function cb);
    native public void end(Object chunk, Function cb);
    native public void end(Object chunk, String encoding, Function cb);
    native public ReadWriteStream pause();
    native public ReadWriteStream resume();
    @jsweet.lang.Optional
    public Boolean isTTY;
    native public Boolean write(Buffer buffer, Function cb);
    native public Boolean write(String str, String encoding, Function cb);
    native public void end();
    native public void end(Buffer buffer, Function cb);
    native public void end(String str, Function cb);
    native public void end(String str, String encoding, Function cb);
    public Duplex(){}
    native public Boolean write(Object chunk);
    native public Boolean write(Object chunk, String encoding);
    native public void end(Object chunk);
    native public void end(Object chunk, String encoding);
    native public Boolean write(Buffer buffer);
    native public Boolean write(String str, String encoding);
    native public void end(Buffer buffer);
    native public void end(String str);
    native public void end(String str, String encoding);
    native public Boolean write(String buffer, Function cb);
    native public Boolean write(String buffer);
}

