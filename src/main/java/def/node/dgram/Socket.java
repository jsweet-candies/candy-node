package def.node.dgram;
import def.js.Error;
import def.node.Buffer;
import def.js.Function;
@jsweet.lang.Interface
public abstract class Socket extends def.node.events.EventEmitter {
    native public void send(Buffer msg, double port, String address, java.util.function.BiConsumer<Error,Double> callback);
    native public void send(Buffer msg, double offset, double length, double port, String address, java.util.function.BiConsumer<Error,Double> callback);
    native public void bind(double port, String address, java.lang.Runnable callback);
    native public void bind(BindOptions options, Function callback);
    native public void close(java.lang.Runnable callback);
    native public AddressInfo address();
    native public void setBroadcast(Boolean flag);
    native public void setTTL(double ttl);
    native public void setMulticastTTL(double ttl);
    native public void setMulticastLoopback(Boolean flag);
    native public void addMembership(String multicastAddress, String multicastInterface);
    native public void dropMembership(String multicastAddress, String multicastInterface);
    native public Socket ref();
    native public Socket unref();
    native public Socket addListener(String event, Function listener);
    native public Socket addListener(def.node.StringTypes.close event, java.lang.Runnable listener);
    native public Socket addListener(def.node.StringTypes.error event, java.util.function.Consumer<Error> listener);
    native public Socket addListener(def.node.StringTypes.listening event, java.lang.Runnable listener);
    native public Socket addListener(def.node.StringTypes.message event, java.util.function.BiConsumer<Buffer,AddressInfo> listener);
    native public Boolean emit(String event, Object... args);
    native public Boolean emit(def.node.StringTypes.close event);
    native public Boolean emit(def.node.StringTypes.error event, Error err);
    native public Boolean emit(def.node.StringTypes.listening event);
    native public Boolean emit(def.node.StringTypes.message event, Buffer msg, AddressInfo rinfo);
    native public Socket on(String event, Function listener);
    native public Socket on(def.node.StringTypes.close event, java.lang.Runnable listener);
    native public Socket on(def.node.StringTypes.error event, java.util.function.Consumer<Error> listener);
    native public Socket on(def.node.StringTypes.listening event, java.lang.Runnable listener);
    native public Socket on(def.node.StringTypes.message event, java.util.function.BiConsumer<Buffer,AddressInfo> listener);
    native public Socket once(String event, Function listener);
    native public Socket once(def.node.StringTypes.close event, java.lang.Runnable listener);
    native public Socket once(def.node.StringTypes.error event, java.util.function.Consumer<Error> listener);
    native public Socket once(def.node.StringTypes.listening event, java.lang.Runnable listener);
    native public Socket once(def.node.StringTypes.message event, java.util.function.BiConsumer<Buffer,AddressInfo> listener);
    native public Socket prependListener(String event, Function listener);
    native public Socket prependListener(def.node.StringTypes.close event, java.lang.Runnable listener);
    native public Socket prependListener(def.node.StringTypes.error event, java.util.function.Consumer<Error> listener);
    native public Socket prependListener(def.node.StringTypes.listening event, java.lang.Runnable listener);
    native public Socket prependListener(def.node.StringTypes.message event, java.util.function.BiConsumer<Buffer,AddressInfo> listener);
    native public Socket prependOnceListener(String event, Function listener);
    native public Socket prependOnceListener(def.node.StringTypes.close event, java.lang.Runnable listener);
    native public Socket prependOnceListener(def.node.StringTypes.error event, java.util.function.Consumer<Error> listener);
    native public Socket prependOnceListener(def.node.StringTypes.listening event, java.lang.Runnable listener);
    native public Socket prependOnceListener(def.node.StringTypes.message event, java.util.function.BiConsumer<Buffer,AddressInfo> listener);
    native public void send(Buffer msg, double port, String address);
    native public void send(Buffer msg, double offset, double length, double port, String address);
    native public void bind(double port, String address);
    native public void bind(double port);
    native public void bind();
    native public void bind(BindOptions options);
    native public void close();
    native public void addMembership(String multicastAddress);
    native public void dropMembership(String multicastAddress);
    native public void send(String msg, double port, String address, java.util.function.BiConsumer<Error,Double> callback);
    native public void send(Object[] msg, double port, String address, java.util.function.BiConsumer<Error,Double> callback);
    native public void send(Object[] msg, double offset, double length, double port, String address, java.util.function.BiConsumer<Error,Double> callback);
    native public void send(String msg, double offset, double length, double port, String address, java.util.function.BiConsumer<Error,Double> callback);
    native public void send(String msg, double port, String address);
    native public void send(Object[] msg, double port, String address);
    native public void send(String msg, double offset, double length, double port, String address);
    native public void send(Object[] msg, double offset, double length, double port, String address);
}
