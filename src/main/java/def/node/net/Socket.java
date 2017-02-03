package def.node.net;
import def.js.Error;
import def.node.Buffer;
import jsweet.util.function.Consumer4;
import def.js.Function;
public class Socket extends def.node.stream.Duplex {
    native public Boolean write(Buffer buffer);
    native public Boolean write(Buffer buffer, Function cb);
    native public Boolean write(String str, Function cb);
    native public Boolean write(String str, String encoding, Function cb);
    native public Boolean write(String str, String encoding, String fd);
    native public void connect(double port, String host, Function connectionListener);
    native public void connect(String path, Function connectionListener);
    public double bufferSize;
    native public void setEncoding(String encoding);
    native public void destroy();
    native public void setTimeout(double timeout, Function callback);
    native public void setNoDelay(Boolean noDelay);
    native public void setKeepAlive(Boolean enable, double initialDelay);
    native public Address address();
    native public void unref();
    native public void ref();
    public String remoteAddress;
    public String remoteFamily;
    public double remotePort;
    public String localAddress;
    public double localPort;
    public double bytesRead;
    public double bytesWritten;
    public Boolean destroyed;
    native public void end();
    native public void end(Buffer buffer, Function cb);
    native public void end(String str, Function cb);
    native public void end(String str, String encoding, Function cb);
    native public void end(Object data, String encoding);
    /**
         * events.EventEmitter
         *   1. close
         *   2. connect
         *   3. data
         *   4. drain
         *   5. end
         *   6. error
         *   7. lookup
         *   8. timeout
         */
    native public Socket addListener(String event, Function listener);
    native public Socket addListener(def.node.StringTypes.close event, java.util.function.Consumer<Boolean> listener);
    native public Socket addListener(def.node.StringTypes.connect event, java.lang.Runnable listener);
    native public Socket addListener(def.node.StringTypes.data event, java.util.function.Consumer<Buffer> listener);
    native public Socket addListener(def.node.StringTypes.drain event, java.lang.Runnable listener);
    native public Socket addListener(String event, java.lang.Runnable listener);
    native public Socket addListener(String event, java.util.function.Consumer<Error> listener);
    @jsweet.lang.Name("addListener")
    native public Socket addListenerListenerStringConsumer4(def.node.StringTypes.lookup event, Consumer4<Error,String,String,String> listener);
    native public Socket addListener(def.node.StringTypes.timeout event, java.lang.Runnable listener);
    native public Boolean emit(String event, Object... args);
    native public Boolean emit(def.node.StringTypes.close event, Boolean had_error);
    native public Boolean emit(def.node.StringTypes.connect event);
    native public Boolean emit(def.node.StringTypes.data event, Buffer data);
    native public Boolean emit(def.node.StringTypes.drain event);
    native public Boolean emit(String event);
    native public Boolean emit(String event, Error err);
    native public Boolean emit(def.node.StringTypes.lookup event, Error err, String address, String family, String host);
    native public Boolean emit(def.node.StringTypes.timeout event);
    native public Socket on(String event, Function listener);
    native public Socket on(def.node.StringTypes.close event, java.util.function.Consumer<Boolean> listener);
    native public Socket on(def.node.StringTypes.connect event, java.lang.Runnable listener);
    native public Socket on(def.node.StringTypes.data event, java.util.function.Consumer<Buffer> listener);
    native public Socket on(def.node.StringTypes.drain event, java.lang.Runnable listener);
    native public Socket on(String event, java.lang.Runnable listener);
    native public Socket on(String event, java.util.function.Consumer<Error> listener);
    @jsweet.lang.Name("on")
    native public Socket onListenerStringConsumer4(def.node.StringTypes.lookup event, Consumer4<Error,String,String,String> listener);
    native public Socket on(def.node.StringTypes.timeout event, java.lang.Runnable listener);
    native public Socket once(String event, Function listener);
    native public Socket once(def.node.StringTypes.close event, java.util.function.Consumer<Boolean> listener);
    native public Socket once(def.node.StringTypes.connect event, java.lang.Runnable listener);
    native public Socket once(def.node.StringTypes.data event, java.util.function.Consumer<Buffer> listener);
    native public Socket once(def.node.StringTypes.drain event, java.lang.Runnable listener);
    native public Socket once(String event, java.lang.Runnable listener);
    native public Socket once(String event, java.util.function.Consumer<Error> listener);
    @jsweet.lang.Name("once")
    native public Socket onceListenerStringConsumer4(def.node.StringTypes.lookup event, Consumer4<Error,String,String,String> listener);
    native public Socket once(def.node.StringTypes.timeout event, java.lang.Runnable listener);
    native public Socket prependListener(String event, Function listener);
    native public Socket prependListener(def.node.StringTypes.close event, java.util.function.Consumer<Boolean> listener);
    native public Socket prependListener(def.node.StringTypes.connect event, java.lang.Runnable listener);
    native public Socket prependListener(def.node.StringTypes.data event, java.util.function.Consumer<Buffer> listener);
    native public Socket prependListener(def.node.StringTypes.drain event, java.lang.Runnable listener);
    native public Socket prependListener(String event, java.lang.Runnable listener);
    native public Socket prependListener(String event, java.util.function.Consumer<Error> listener);
    @jsweet.lang.Name("prependListener")
    native public Socket prependListenerListenerStringConsumer4(def.node.StringTypes.lookup event, Consumer4<Error,String,String,String> listener);
    native public Socket prependListener(def.node.StringTypes.timeout event, java.lang.Runnable listener);
    native public Socket prependOnceListener(String event, Function listener);
    native public Socket prependOnceListener(def.node.StringTypes.close event, java.util.function.Consumer<Boolean> listener);
    native public Socket prependOnceListener(def.node.StringTypes.connect event, java.lang.Runnable listener);
    native public Socket prependOnceListener(def.node.StringTypes.data event, java.util.function.Consumer<Buffer> listener);
    native public Socket prependOnceListener(def.node.StringTypes.drain event, java.lang.Runnable listener);
    native public Socket prependOnceListener(String event, java.lang.Runnable listener);
    native public Socket prependOnceListener(String event, java.util.function.Consumer<Error> listener);
    @jsweet.lang.Name("prependOnceListener")
    native public Socket prependOnceListenerListenerStringConsumer4(def.node.StringTypes.lookup event, Consumer4<Error,String,String,String> listener);
    native public Socket prependOnceListener(def.node.StringTypes.timeout event, java.lang.Runnable listener);
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Address extends def.js.Object {
        public double port;
        public String family;
        public String address;
    }
    public Socket(Options options){}
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Options extends def.js.Object {
        @jsweet.lang.Optional
        public String fd;
        @jsweet.lang.Optional
        public String type;
        @jsweet.lang.Optional
        public Boolean allowHalfOpen;
    }
    native public Boolean write(String str);
    native public Boolean write(String str, String encoding);
    native public void connect(double port, String host);
    native public void connect(double port);
    native public void connect(String path);
    native public void setEncoding();
    native public void setTimeout(double timeout);
    native public void setNoDelay();
    native public void setKeepAlive(Boolean enable);
    native public void setKeepAlive();
    native public void end(Buffer buffer);
    native public void end(String str);
    native public void end(String str, String encoding);
    native public void end(Object data);
    public Socket(){}
    @jsweet.lang.Name("addListener")
    native public Socket addListenerListenerConsumer4(def.node.StringTypes.lookup event, Consumer4<Error,String,Double,String> listener);
    native public Boolean emit(def.node.StringTypes.lookup event, Error err, String address, double family, String host);
    @jsweet.lang.Name("on")
    native public Socket onListenerConsumer4(def.node.StringTypes.lookup event, Consumer4<Error,String,Double,String> listener);
    @jsweet.lang.Name("once")
    native public Socket onceListenerConsumer4(def.node.StringTypes.lookup event, Consumer4<Error,String,Double,String> listener);
    @jsweet.lang.Name("prependListener")
    native public Socket prependListenerListenerConsumer4(def.node.StringTypes.lookup event, Consumer4<Error,String,Double,String> listener);
    @jsweet.lang.Name("prependOnceListener")
    native public Socket prependOnceListenerListenerConsumer4(def.node.StringTypes.lookup event, Consumer4<Error,String,Double,String> listener);
}

