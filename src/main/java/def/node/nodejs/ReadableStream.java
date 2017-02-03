package def.node.nodejs;
import def.node.Buffer;
@jsweet.lang.Interface
public abstract class ReadableStream extends EventEmitter {
    public Boolean readable;
    @jsweet.lang.Optional
    public Boolean isTTY;
    native public jsweet.util.union.Union<String,Buffer> read(double size);
    native public void setEncoding(String encoding);
    native public ReadableStream pause();
    native public ReadableStream resume();
    native public Boolean isPaused();
    native public <T extends WritableStream> T pipe(T destination, Options options);
    native public <T extends WritableStream> void unpipe(T destination);
    native public void unshift(String chunk);
    native public void unshift(Buffer chunk);
    native public ReadableStream wrap(ReadableStream oldStream);
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Options extends def.js.Object {
        @jsweet.lang.Optional
        public Boolean end;
    }
    native public jsweet.util.union.Union<String,Buffer> read();
    native public <T extends WritableStream> T pipe(T destination);
    native public <T extends WritableStream> void unpipe();
    native public void setEncoding(Object encoding);
}

