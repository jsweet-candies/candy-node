package def.node.tls;
import def.js.Error;
import def.node.Buffer;
import def.node.net.Server.Address;
import def.js.Function;
@jsweet.lang.Interface
public abstract class Server extends def.node.net.Server {
    native public Server close(Function callback);
    native public Address address();
    native public void addContext(String hostName, Credentials credentials);
    public double maxConnections;
    public double connections;
    native public Server addListener(String event, Function listener);
    native public Server addListener(def.node.StringTypes.tlsClientError event, java.util.function.BiConsumer<Error,TLSSocket> listener);
    native public Server addListener(def.node.StringTypes.newSession event, jsweet.util.function.TriConsumer<Object,Object,java.util.function.BiConsumer<Error,Buffer>> listener);
    native public Server addListener(def.node.StringTypes.OCSPRequest event, jsweet.util.function.TriConsumer<Buffer,Buffer,Function> listener);
    native public Server addListener(def.node.StringTypes.resumeSession event, java.util.function.BiConsumer<Object,java.util.function.BiConsumer<Error,Object>> listener);
    native public Server addListener(def.node.StringTypes.secureConnection event, java.util.function.Consumer<TLSSocket> listener);
    native public Boolean emit(String event, Object... args);
    native public Boolean emit(def.node.StringTypes.tlsClientError event, Error err, TLSSocket tlsSocket);
    native public Boolean emit(def.node.StringTypes.newSession event, Object sessionId, Object sessionData, java.util.function.BiConsumer<Error,Buffer> callback);
    native public Boolean emit(def.node.StringTypes.OCSPRequest event, Buffer certificate, Buffer issuer, Function callback);
    native public Boolean emit(def.node.StringTypes.resumeSession event, Object sessionId, java.util.function.BiConsumer<Error,Object> callback);
    native public Boolean emit(def.node.StringTypes.secureConnection event, TLSSocket tlsSocket);
    native public Server on(String event, Function listener);
    native public Server on(def.node.StringTypes.tlsClientError event, java.util.function.BiConsumer<Error,TLSSocket> listener);
    native public Server on(def.node.StringTypes.newSession event, jsweet.util.function.TriConsumer<Object,Object,java.util.function.BiConsumer<Error,Buffer>> listener);
    native public Server on(def.node.StringTypes.OCSPRequest event, jsweet.util.function.TriConsumer<Buffer,Buffer,Function> listener);
    native public Server on(def.node.StringTypes.resumeSession event, java.util.function.BiConsumer<Object,java.util.function.BiConsumer<Error,Object>> listener);
    native public Server on(def.node.StringTypes.secureConnection event, java.util.function.Consumer<TLSSocket> listener);
    native public Server once(String event, Function listener);
    native public Server once(def.node.StringTypes.tlsClientError event, java.util.function.BiConsumer<Error,TLSSocket> listener);
    native public Server once(def.node.StringTypes.newSession event, jsweet.util.function.TriConsumer<Object,Object,java.util.function.BiConsumer<Error,Buffer>> listener);
    native public Server once(def.node.StringTypes.OCSPRequest event, jsweet.util.function.TriConsumer<Buffer,Buffer,Function> listener);
    native public Server once(def.node.StringTypes.resumeSession event, java.util.function.BiConsumer<Object,java.util.function.BiConsumer<Error,Object>> listener);
    native public Server once(def.node.StringTypes.secureConnection event, java.util.function.Consumer<TLSSocket> listener);
    native public Server prependListener(String event, Function listener);
    native public Server prependListener(def.node.StringTypes.tlsClientError event, java.util.function.BiConsumer<Error,TLSSocket> listener);
    native public Server prependListener(def.node.StringTypes.newSession event, jsweet.util.function.TriConsumer<Object,Object,java.util.function.BiConsumer<Error,Buffer>> listener);
    native public Server prependListener(def.node.StringTypes.OCSPRequest event, jsweet.util.function.TriConsumer<Buffer,Buffer,Function> listener);
    native public Server prependListener(def.node.StringTypes.resumeSession event, java.util.function.BiConsumer<Object,java.util.function.BiConsumer<Error,Object>> listener);
    native public Server prependListener(def.node.StringTypes.secureConnection event, java.util.function.Consumer<TLSSocket> listener);
    native public Server prependOnceListener(String event, Function listener);
    native public Server prependOnceListener(def.node.StringTypes.tlsClientError event, java.util.function.BiConsumer<Error,TLSSocket> listener);
    native public Server prependOnceListener(def.node.StringTypes.newSession event, jsweet.util.function.TriConsumer<Object,Object,java.util.function.BiConsumer<Error,Buffer>> listener);
    native public Server prependOnceListener(def.node.StringTypes.OCSPRequest event, jsweet.util.function.TriConsumer<Buffer,Buffer,Function> listener);
    native public Server prependOnceListener(def.node.StringTypes.resumeSession event, java.util.function.BiConsumer<Object,java.util.function.BiConsumer<Error,Object>> listener);
    native public Server prependOnceListener(def.node.StringTypes.secureConnection event, java.util.function.Consumer<TLSSocket> listener);
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Credentials extends def.js.Object {
        public String key;
        public String cert;
        public String ca;
    }
    native public Server close();
}

