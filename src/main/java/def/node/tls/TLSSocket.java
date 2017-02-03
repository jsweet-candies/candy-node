package def.node.tls;
import def.js.Error;
import def.node.Buffer;
import def.js.Function;
public class TLSSocket extends def.node.stream.Duplex {
    /**
         * Construct a new tls.TLSSocket object from an existing TCP socket.
         */
    public TLSSocket(def.node.net.Socket socket, Options options){}
    /**
         * Returns the bound address, the address family name and port of the underlying socket as reported by
         * the operating system.
         * @returns {any} - An object with three properties, e.g. { port: 12346, family: 'IPv4', address: '127.0.0.1' }.
         */
    native public Address address();
    /**
         * A boolean that is true if the peer certificate was signed by one of the specified CAs, otherwise false.
         */
    public Boolean authorized;
    /**
         * The reason why the peer's certificate has not been verified.
         * This property becomes available only when tlsSocket.authorized === false.
         */
    public Error authorizationError;
    /**
         * Static boolean value, always true.
         * May be used to distinguish TLS sockets from regular ones.
         */
    public Boolean encrypted;
    /**
         * Returns an object representing the cipher name and the SSL/TLS protocol version of the current connection.
         * @returns {CipherNameAndProtocol} - Returns an object representing the cipher name
         * and the SSL/TLS protocol version of the current connection.
         */
    native public CipherNameAndProtocol getCipher();
    /**
         * Returns an object representing the peer's certificate.
         * The returned object has some properties corresponding to the field of the certificate.
         * If detailed argument is true the full chain with issuer property will be returned,
         * if false only the top certificate without issuer property.
         * If the peer does not provide a certificate, it returns null or an empty object.
         * @param {boolean} detailed - If true; the full chain with issuer property will be returned.
         * @returns {any} - An object representing the peer's certificate.
         */
    native public GetPeerCertificate getPeerCertificate(Boolean detailed);
    /**
         * Could be used to speed up handshake establishment when reconnecting to the server.
         * @returns {any} - ASN.1 encoded TLS session or undefined if none was negotiated.
         */
    native public Object getSession();
    /**
         * NOTE: Works only with client TLS sockets.
         * Useful only for debugging, for session reuse provide session option to tls.connect().
         * @returns {any} - TLS session ticket or undefined if none was negotiated.
         */
    native public Object getTLSTicket();
    /**
         * The string representation of the local IP address.
         */
    public String localAddress;
    /**
         * The numeric representation of the local port.
         */
    public String localPort;
    /**
         * The string representation of the remote IP address.
         * For example, '74.125.127.100' or '2001:4860:a005::68'.
         */
    public String remoteAddress;
    /**
         * The string representation of the remote IP family. 'IPv4' or 'IPv6'.
         */
    public String remoteFamily;
    /**
         * The numeric representation of the remote port. For example, 443.
         */
    public double remotePort;
    /**
         * Initiate TLS renegotiation process.
         *
         * NOTE: Can be used to request peer's certificate after the secure connection has been established.
         * ANOTHER NOTE: When running as the server, socket will be destroyed with an error after handshakeTimeout timeout.
         * @param {TlsOptions} options - The options may contain the following fields: rejectUnauthorized,
         * requestCert (See tls.createServer() for details).
         * @param {Function} callback - callback(err) will be executed with null as err, once the renegotiation
         * is successfully completed.
         */
    native public Object renegotiate(TlsOptions options, java.util.function.Function<Error,Object> callback);
    /**
         * Set maximum TLS fragment size (default and maximum value is: 16384, minimum is: 512).
         * Smaller fragment size decreases buffering latency on the client: large fragments are buffered by
         * the TLS layer until the entire fragment is received and its integrity is verified;
         * large fragments can span multiple roundtrips, and their processing can be delayed due to packet
         * loss or reordering. However, smaller fragments add extra TLS framing bytes and CPU overhead,
         * which may decrease overall server throughput.
         * @param {number} size - TLS fragment size (default and maximum value is: 16384, minimum is: 512).
         * @returns {boolean} - Returns true on success, false otherwise.
         */
    native public Boolean setMaxSendFragment(double size);
    native public TLSSocket addListener(String event, Function listener);
    native public TLSSocket addListener(def.node.StringTypes.OCSPResponse event, java.util.function.Consumer<Buffer> listener);
    native public TLSSocket addListener(def.node.StringTypes.secureConnect event, java.lang.Runnable listener);
    native public Boolean emit(String event, Object... args);
    native public Boolean emit(def.node.StringTypes.OCSPResponse event, Buffer response);
    native public Boolean emit(def.node.StringTypes.secureConnect event);
    native public TLSSocket on(String event, Function listener);
    native public TLSSocket on(def.node.StringTypes.OCSPResponse event, java.util.function.Consumer<Buffer> listener);
    native public TLSSocket on(def.node.StringTypes.secureConnect event, java.lang.Runnable listener);
    native public TLSSocket once(String event, Function listener);
    native public TLSSocket once(def.node.StringTypes.OCSPResponse event, java.util.function.Consumer<Buffer> listener);
    native public TLSSocket once(def.node.StringTypes.secureConnect event, java.lang.Runnable listener);
    native public TLSSocket prependListener(String event, Function listener);
    native public TLSSocket prependListener(def.node.StringTypes.OCSPResponse event, java.util.function.Consumer<Buffer> listener);
    native public TLSSocket prependListener(def.node.StringTypes.secureConnect event, java.lang.Runnable listener);
    native public TLSSocket prependOnceListener(String event, Function listener);
    native public TLSSocket prependOnceListener(def.node.StringTypes.OCSPResponse event, java.util.function.Consumer<Buffer> listener);
    native public TLSSocket prependOnceListener(def.node.StringTypes.secureConnect event, java.lang.Runnable listener);
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Options extends def.js.Object {
        /**
           * An optional TLS context object from tls.createSecureContext()
           */
        @jsweet.lang.Optional
        public SecureContext secureContext;
        /**
           * If true the TLS socket will be instantiated in server-mode.
           * Defaults to false.
           */
        @jsweet.lang.Optional
        public Boolean isServer;
        /**
           * An optional net.Server instance.
           */
        @jsweet.lang.Optional
        public def.node.net.Server server;
        /**
           * If true the server will request a certificate from clients that
           * connect and attempt to verify that certificate. Defaults to
           * false.
           */
        @jsweet.lang.Optional
        public Boolean requestCert;
        /**
           * If true the server will reject any connection which is not
           * authorized with the list of supplied CAs. This option only has an
           * effect if requestCert is true. Defaults to false.
           */
        @jsweet.lang.Optional
        public Boolean rejectUnauthorized;
        /**
           * An array of strings or a Buffer naming possible NPN protocols.
           * (Protocols should be ordered by their priority.)
           */
        @jsweet.lang.Optional
        public jsweet.util.union.Union<String[],Buffer> NPNProtocols;
        /**
           * An array of strings or a Buffer naming possible ALPN protocols.
           * (Protocols should be ordered by their priority.) When the server
           * receives both NPN and ALPN extensions from the client, ALPN takes
           * precedence over NPN and the server does not send an NPN extension
           * to the client.
           */
        @jsweet.lang.Optional
        public jsweet.util.union.Union<String[],Buffer> ALPNProtocols;
        /**
           * SNICallback(servername, cb) <Function> A function that will be
           * called if the client supports SNI TLS extension. Two arguments
           * will be passed when called: servername and cb. SNICallback should
           * invoke cb(null, ctx), where ctx is a SecureContext instance.
           * (tls.createSecureContext(...) can be used to get a proper
           * SecureContext.) If SNICallback wasn't provided the default callback
           * with high-level API will be used (see below).
           */
        @jsweet.lang.Optional
        public Function SNICallback;
        /**
           * An optional Buffer instance containing a TLS session.
           */
        @jsweet.lang.Optional
        public Buffer session;
        /**
           * If true, specifies that the OCSP status request extension will be
           * added to the client hello and an 'OCSPResponse' event will be
           * emitted on the socket before establishing a secure communication
           */
        @jsweet.lang.Optional
        public Boolean requestOCSP;
        native public java.lang.Object SNICallback(java.lang.Object... args);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Address extends def.js.Object {
        public double port;
        public String family;
        public String address;
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class GetPeerCertificate extends def.js.Object {
        public Certificate subject;
        public Certificate issuerInfo;
        public Certificate issuer;
        public Object raw;
        public String valid_from;
        public String valid_to;
        public String fingerprint;
        public String serialNumber;
    }
    /**
         * Construct a new tls.TLSSocket object from an existing TCP socket.
         */
    public TLSSocket(def.node.net.Socket socket){}
    /**
         * Returns an object representing the peer's certificate.
         * The returned object has some properties corresponding to the field of the certificate.
         * If detailed argument is true the full chain with issuer property will be returned,
         * if false only the top certificate without issuer property.
         * If the peer does not provide a certificate, it returns null or an empty object.
         * @param {boolean} detailed - If true; the full chain with issuer property will be returned.
         * @returns {any} - An object representing the peer's certificate.
         */
    native public GetPeerCertificate getPeerCertificate();
    protected TLSSocket(){}
}

