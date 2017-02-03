package def.node.net;
import def.js.Error;
import def.js.Function;
@jsweet.lang.Interface
public abstract class Server extends def.node.events.EventEmitter {
    native public Server listen(double port, String hostname, double backlog, Function listeningListener);
    native public Server listen(double port, String hostname, Function listeningListener);
    native public Server listen(double port, double backlog, Function listeningListener);
    native public Server listen(double port, Function listeningListener);
    native public Server listen(String path, double backlog, Function listeningListener);
    native public Server listen(String path, Function listeningListener);
    native public Server listen(ListenOptions options, Function listeningListener);
    native public Server listen(Object handle, double backlog, Function listeningListener);
    native public Server listen(Object handle, Function listeningListener);
    native public Server close(Function callback);
    native public Address address();
    native public void getConnections(java.util.function.BiConsumer<Error,Double> cb);
    native public Server ref();
    native public Server unref();
    public double maxConnections;
    public double connections;
    /**
         * events.EventEmitter
         *   1. close
         *   2. connection
         *   3. error
         *   4. listening
         */
    native public Server addListener(String event, Function listener);
    native public Server addListener(def.node.StringTypes.close event, java.lang.Runnable listener);
    native public Server addListener(def.node.StringTypes.connection event, java.util.function.Consumer<Socket> listener);
    native public Server addListener(def.node.StringTypes.error event, java.util.function.Consumer<Error> listener);
    native public Server addListener(def.node.StringTypes.listening event, java.lang.Runnable listener);
    native public Boolean emit(String event, Object... args);
    native public Boolean emit(def.node.StringTypes.close event);
    native public Boolean emit(def.node.StringTypes.connection event, Socket socket);
    native public Boolean emit(def.node.StringTypes.error event, Error err);
    native public Boolean emit(def.node.StringTypes.listening event);
    native public Server on(String event, Function listener);
    native public Server on(def.node.StringTypes.close event, java.lang.Runnable listener);
    native public Server on(def.node.StringTypes.connection event, java.util.function.Consumer<Socket> listener);
    native public Server on(def.node.StringTypes.error event, java.util.function.Consumer<Error> listener);
    native public Server on(def.node.StringTypes.listening event, java.lang.Runnable listener);
    native public Server once(String event, Function listener);
    native public Server once(def.node.StringTypes.close event, java.lang.Runnable listener);
    native public Server once(def.node.StringTypes.connection event, java.util.function.Consumer<Socket> listener);
    native public Server once(def.node.StringTypes.error event, java.util.function.Consumer<Error> listener);
    native public Server once(def.node.StringTypes.listening event, java.lang.Runnable listener);
    native public Server prependListener(String event, Function listener);
    native public Server prependListener(def.node.StringTypes.close event, java.lang.Runnable listener);
    native public Server prependListener(def.node.StringTypes.connection event, java.util.function.Consumer<Socket> listener);
    native public Server prependListener(def.node.StringTypes.error event, java.util.function.Consumer<Error> listener);
    native public Server prependListener(def.node.StringTypes.listening event, java.lang.Runnable listener);
    native public Server prependOnceListener(String event, Function listener);
    native public Server prependOnceListener(def.node.StringTypes.close event, java.lang.Runnable listener);
    native public Server prependOnceListener(def.node.StringTypes.connection event, java.util.function.Consumer<Socket> listener);
    native public Server prependOnceListener(def.node.StringTypes.error event, java.util.function.Consumer<Error> listener);
    native public Server prependOnceListener(def.node.StringTypes.listening event, java.lang.Runnable listener);
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Address extends def.js.Object {
        public double port;
        public String family;
        public String address;
    }
    native public Server listen(double port, String hostname, double backlog);
    native public Server listen(double port, String hostname);
    native public Server listen(double port);
    native public Server listen(double port, double backlog);
    native public Server listen(String path, double backlog);
    native public Server listen(String path);
    native public Server listen(ListenOptions options);
    native public Server listen(Object handle, double backlog);
    native public Server listen(Object handle);
    native public Server close();
}

