package def.node.stream;
import def.node.nodejs.WritableStream;
import def.js.Error;
import def.node.Buffer;
import def.node.nodejs.ReadableStream;
import def.js.Function;
@jsweet.lang.Extends({def.node.nodejs.ReadableStream.class})
public class Readable extends def.node.events.EventEmitter {
    public Boolean readable;
    public Readable(ReadableOptions opts){}
    native public void _read(double size);
    native public <T extends def.node.nodejs.WritableStream> T pipe(T destination, def.node.nodejs.ReadableStream.Options options);
    native public void unshift(Object chunk);
    native public Boolean push(Object chunk, String encoding);
    native public Readable addListener(String event, Function listener);
    native public Readable addListener(def.node.StringTypes.close event, java.lang.Runnable listener);
    @jsweet.lang.Name("addListener")
    native public Readable addListenerListenerConsumer(def.node.StringTypes.data event, java.util.function.Consumer<Buffer> listener);
    native public Readable addListener(def.node.StringTypes.end event, java.lang.Runnable listener);
    native public Readable addListener(def.node.StringTypes.readable event, java.lang.Runnable listener);
    native public Readable addListener(def.node.StringTypes.error event, java.util.function.Consumer<Error> listener);
    native public Boolean emit(String event, Object... args);
    native public Boolean emit(def.node.StringTypes.close event);
    native public Boolean emit(def.node.StringTypes.data event, Buffer chunk);
    native public Boolean emit(def.node.StringTypes.end event);
    native public Boolean emit(def.node.StringTypes.readable event);
    native public Boolean emit(def.node.StringTypes.error event, Error err);
    native public Readable on(String event, Function listener);
    native public Readable on(def.node.StringTypes.close event, java.lang.Runnable listener);
    @jsweet.lang.Name("on")
    native public Readable onListenerConsumer(def.node.StringTypes.data event, java.util.function.Consumer<Buffer> listener);
    native public Readable on(def.node.StringTypes.end event, java.lang.Runnable listener);
    native public Readable on(def.node.StringTypes.readable event, java.lang.Runnable listener);
    native public Readable on(def.node.StringTypes.error event, java.util.function.Consumer<Error> listener);
    native public Readable once(String event, Function listener);
    native public Readable once(def.node.StringTypes.close event, java.lang.Runnable listener);
    @jsweet.lang.Name("once")
    native public Readable onceListenerConsumer(def.node.StringTypes.data event, java.util.function.Consumer<Buffer> listener);
    native public Readable once(def.node.StringTypes.end event, java.lang.Runnable listener);
    native public Readable once(def.node.StringTypes.readable event, java.lang.Runnable listener);
    native public Readable once(def.node.StringTypes.error event, java.util.function.Consumer<Error> listener);
    native public Readable prependListener(String event, Function listener);
    native public Readable prependListener(def.node.StringTypes.close event, java.lang.Runnable listener);
    @jsweet.lang.Name("prependListener")
    native public Readable prependListenerListenerConsumer(def.node.StringTypes.data event, java.util.function.Consumer<Buffer> listener);
    native public Readable prependListener(def.node.StringTypes.end event, java.lang.Runnable listener);
    native public Readable prependListener(def.node.StringTypes.readable event, java.lang.Runnable listener);
    native public Readable prependListener(def.node.StringTypes.error event, java.util.function.Consumer<Error> listener);
    native public Readable prependOnceListener(String event, Function listener);
    native public Readable prependOnceListener(def.node.StringTypes.close event, java.lang.Runnable listener);
    @jsweet.lang.Name("prependOnceListener")
    native public Readable prependOnceListenerListenerConsumer(def.node.StringTypes.data event, java.util.function.Consumer<Buffer> listener);
    native public Readable prependOnceListener(def.node.StringTypes.end event, java.lang.Runnable listener);
    native public Readable prependOnceListener(def.node.StringTypes.readable event, java.lang.Runnable listener);
    native public Readable prependOnceListener(def.node.StringTypes.error event, java.util.function.Consumer<Error> listener);
    native public Readable removeListener(String event, Function listener);
    native public Readable removeListener(def.node.StringTypes.close event, java.lang.Runnable listener);
    @jsweet.lang.Name("removeListener")
    native public Readable removeListenerListenerConsumer(def.node.StringTypes.data event, java.util.function.Consumer<Buffer> listener);
    native public Readable removeListener(def.node.StringTypes.end event, java.lang.Runnable listener);
    native public Readable removeListener(def.node.StringTypes.readable event, java.lang.Runnable listener);
    native public Readable removeListener(def.node.StringTypes.error event, java.util.function.Consumer<Error> listener);
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
    public Readable(){}
    native public Object read();
    native public <T extends def.node.nodejs.WritableStream> T pipe(T destination);
    native public <T extends def.node.nodejs.WritableStream> void unpipe();
    native public Boolean push(Object chunk);
    @jsweet.lang.Name("addListener")
    native public Readable addListenerListenerStringConsumer(def.node.StringTypes.data event, java.util.function.Consumer<String> listener);
    native public Boolean emit(def.node.StringTypes.data event, String chunk);
    @jsweet.lang.Name("on")
    native public Readable onListenerStringConsumer(def.node.StringTypes.data event, java.util.function.Consumer<String> listener);
    @jsweet.lang.Name("once")
    native public Readable onceListenerStringConsumer(def.node.StringTypes.data event, java.util.function.Consumer<String> listener);
    @jsweet.lang.Name("prependListener")
    native public Readable prependListenerListenerStringConsumer(def.node.StringTypes.data event, java.util.function.Consumer<String> listener);
    @jsweet.lang.Name("prependOnceListener")
    native public Readable prependOnceListenerListenerStringConsumer(def.node.StringTypes.data event, java.util.function.Consumer<String> listener);
    @jsweet.lang.Name("removeListener")
    native public Readable removeListenerListenerStringConsumer(def.node.StringTypes.data event, java.util.function.Consumer<String> listener);
    native public void setEncoding(Object encoding);
}

