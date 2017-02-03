package def.node.stream;
import def.node.nodejs.ReadableStream.Options;
import def.node.Buffer;
import def.node.nodejs.ReadWriteStream;
import def.js.Function;
@jsweet.lang.Extends({def.node.nodejs.ReadWriteStream.class})
public class Transform extends def.node.events.EventEmitter {
    public Boolean readable;
    public Boolean writable;
    public Transform(TransformOptions opts){}
    native public void _transform(Object chunk, String encoding, Function callback);
    native public void _flush(Function callback);
    native public Object read(double size);
    native public void setEncoding(String encoding);
    native public Boolean isPaused();
    native public <T extends def.node.nodejs.WritableStream> T pipe(T destination, Options options);
    native public <T extends def.node.nodejs.WritableStream> void unpipe(T destination);
    native public void unshift(Object chunk);
    native public def.node.nodejs.ReadableStream wrap(def.node.nodejs.ReadableStream oldStream);
    native public Boolean push(Object chunk, String encoding);
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
    public Transform(){}
    native public Object read();
    native public <T extends def.node.nodejs.WritableStream> T pipe(T destination);
    native public <T extends def.node.nodejs.WritableStream> void unpipe();
    native public Boolean push(Object chunk);
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

