/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace buffer {
    export var INSPECT_MAX_BYTES : number;

    export var BuffType : Buffer;

    export var SlowBuffType : any;

}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare class Buffer implements NodeBuffer {
    /**
     * Allocates a new buffer containing the given {str}.
     * 
     * @param {string} str String to store in buffer.
     * @param {string} encoding encoding to use, optional.  Default is 'utf8'
     * @constructor
     */
    public constructor(str? : any, encoding? : any);

    public static prototype : Buffer;

    

    /**
     * When passed a reference to the .buffer property of a TypedArray instance,
     * the newly created Buffer will share the same allocated memory as the TypedArray.
     * The optional {byteOffset} and {length} arguments specify a memory range
     * within the {arrayBuffer} that will be shared by the Buffer.
     * 
     * @param {ArrayBuffer} arrayBuffer The .buffer property of a TypedArray or a new ArrayBuffer()
     * @param {number} byteOffset
     * @param {number} length
     * @return {Buffer}
     */
    public static from(arrayBuffer? : any, byteOffset? : any, length? : any) : any;

    /**
     * Returns true if {obj} is a Buffer
     * 
     * @param {any} obj object to test.
     * @return {boolean}
     */
    public static isBuffer(obj : any) : boolean;

    /**
     * Returns true if {encoding} is a valid encoding argument.
     * Valid string encodings in Node 0.12: 'ascii'|'utf8'|'utf16le'|'ucs2'(alias of 'utf16le')|'base64'|'binary'(deprecated)|'hex'
     * 
     * @param {string} encoding string to test.
     * @return {boolean}
     */
    public static isEncoding(encoding : string) : boolean;

    

    

    

    /**
     * Returns a buffer which is the result of concatenating all the buffers in the list together.
     * 
     * If the list has no items, or if the totalLength is 0, then it returns a zero-length buffer.
     * If the list has exactly one item, then the first item of the list is returned.
     * If the list has more than one item, then a new Buffer is created.
     * 
     * @param {Array} list An array of Buffer objects to concatenate
     * @param {number} totalLength Total length of the buffers when concatenated.
     * If totalLength is not provided, it is read from the buffers in the list. However, this adds an additional loop to the function, so it is faster to provide the length explicitly.
     * @return {Buffer}
     */
    public static concat(list? : any, totalLength? : any) : any;

    /**
     * The same as buf1.compare(buf2).
     * @param {Buffer} buf1
     * @param {Buffer} buf2
     * @return {number}
     */
    public static compare(buf1 : Buffer, buf2 : Buffer) : number;

    

    /**
     * Allocates a new buffer of {size} octets.
     * 
     * @param {number} size count of octets to allocate.
     * @param {string} fill if specified, buffer will be initialized by calling buf.fill(fill).
     * If parameter is omitted, buffer will be filled with zeros.
     * @param {string} encoding encoding used for call to buf.fill while initalizing
     * @return {Buffer}
     */
    public static alloc(size? : any, fill? : any, encoding? : any) : any;

    /**
     * Allocates a new buffer of {size} octets, leaving memory not initialized, so the contents
     * of the newly created Buffer are unknown and may contain sensitive data.
     * 
     * @param {number} size count of octets to allocate
     * @return {Buffer}
     */
    public static allocUnsafe(size : number) : Buffer;

    /**
     * Allocates a new non-pooled buffer of {size} octets, leaving memory not initialized, so the contents
     * of the newly created Buffer are unknown and may contain sensitive data.
     * 
     * @param {number} size count of octets to allocate
     * @return {Buffer}
     */
    public static allocUnsafeSlow(size : number) : Buffer;
}

/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace child_process {
    export interface ChildProcess extends events.EventEmitter {
        stdin : stream.Writable;

        stdout : stream.Readable;

        stderr : stream.Readable;

        stdio : [stream.Writable,stream.Readable,stream.Readable];

        pid : number;

        kill(signal? : any) : any;

        send(message? : any, sendHandle? : any) : any;

        connected : boolean;

        disconnect();

        unref();

        ref();

        addListener(event? : any, listener? : any) : any;

        addListener(event : "message", listener : (p1: any, p2: net.Socket) => void) : ChildProcess;

        emit(event? : any, code? : any, signal? : any) : any;

        on(event? : any, listener? : any) : any;

        on(event : "message", listener : (p1: any, p2: net.Socket) => void) : ChildProcess;

        once(event? : any, listener? : any) : any;

        once(event : "message", listener : (p1: any, p2: net.Socket) => void) : ChildProcess;

        prependListener(event? : any, listener? : any) : any;

        prependListener(event : "message", listener : (p1: any, p2: net.Socket) => void) : ChildProcess;

        prependOnceListener(event? : any, listener? : any) : any;

        prependOnceListener(event : "message", listener : (p1: any, p2: net.Socket) => void) : ChildProcess;

        addListener(event : "message", listener : (p1: any, p2: net.Server) => void) : ChildProcess;

        on(event : "message", listener : (p1: any, p2: net.Server) => void) : ChildProcess;

        once(event : "message", listener : (p1: any, p2: net.Server) => void) : ChildProcess;

        prependListener(event : "message", listener : (p1: any, p2: net.Server) => void) : ChildProcess;

        prependOnceListener(event : "message", listener : (p1: any, p2: net.Server) => void) : ChildProcess;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace child_process {
    export interface ExecFileOptions {
        cwd? : string;

        env? : any;

        timeout? : number;

        maxBuffer? : number;

        killSignal? : string;

        uid? : number;

        gid? : number;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace child_process {
    export interface ExecFileOptionsWithBufferEncoding extends child_process.ExecFileOptions {
        encoding : string;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace child_process {
    export interface ExecFileOptionsWithStringEncoding extends child_process.ExecFileOptions {
        encoding : any;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace child_process {
    export interface ExecFileSyncOptions {
        cwd? : string;

        input? : ((string)|(Buffer));

        stdio? : any;

        env? : any;

        uid? : number;

        gid? : number;

        timeout? : number;

        killSignal? : string;

        maxBuffer? : number;

        encoding? : string;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace child_process {
    export interface ExecFileSyncOptionsWithBufferEncoding extends child_process.ExecFileSyncOptions {
        encoding : string;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace child_process {
    export interface ExecFileSyncOptionsWithStringEncoding extends child_process.ExecFileSyncOptions {
        encoding : any;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace child_process {
    export interface ExecOptions {
        cwd? : string;

        env? : any;

        shell? : string;

        timeout? : number;

        maxBuffer? : number;

        killSignal? : string;

        uid? : number;

        gid? : number;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace child_process {
    export interface ExecOptionsWithBufferEncoding extends child_process.ExecOptions {
        encoding : string;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace child_process {
    export interface ExecOptionsWithStringEncoding extends child_process.ExecOptions {
        encoding : any;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace child_process {
    export interface ExecSyncOptions {
        cwd? : string;

        input? : ((string)|(Buffer));

        stdio? : any;

        env? : any;

        shell? : string;

        uid? : number;

        gid? : number;

        timeout? : number;

        killSignal? : string;

        maxBuffer? : number;

        encoding? : string;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace child_process {
    export interface ExecSyncOptionsWithBufferEncoding extends child_process.ExecSyncOptions {
        encoding : string;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace child_process {
    export interface ExecSyncOptionsWithStringEncoding extends child_process.ExecSyncOptions {
        encoding : any;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace child_process {
    export interface ForkOptions {
        cwd? : string;

        env? : any;

        execPath? : string;

        execArgv? : string[];

        silent? : boolean;

        uid? : number;

        gid? : number;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace child_process {
    

    export function spawn(command? : any, args? : any, options? : any) : any;

    

    export function exec(command? : any, options? : any, callback? : any) : any;

    

    export function execFile(file? : any, args? : any, options? : any, callback? : any) : any;

    

    export function fork(modulePath? : any, args? : any, options? : any) : any;

    

    export function spawnSync(command? : any, args? : any, options? : any) : any;

    

    export function execSync(command? : any, options? : any) : any;

    

    export function execFileSync(command? : any, args? : any, options? : any) : any;

}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace child_process {
    export interface SpawnOptions {
        cwd? : string;

        env? : any;

        stdio? : any;

        detached? : boolean;

        uid? : number;

        gid? : number;

        shell? : ((boolean)|(string));
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace child_process {
    export interface SpawnSyncOptions {
        cwd? : string;

        input? : ((string)|(Buffer));

        stdio? : any;

        env? : any;

        uid? : number;

        gid? : number;

        timeout? : number;

        killSignal? : string;

        maxBuffer? : number;

        encoding? : string;

        shell? : ((boolean)|(string));
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace child_process {
    export interface SpawnSyncOptionsWithBufferEncoding extends child_process.SpawnSyncOptions {
        encoding : string;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace child_process {
    export interface SpawnSyncOptionsWithStringEncoding extends child_process.SpawnSyncOptions {
        encoding : any;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace child_process {
    export interface SpawnSyncReturns<T> {
        pid : number;

        output : string[];

        stdout : T;

        stderr : T;

        status : number;

        signal : string;

        error : Error;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace cluster {
    export interface Address {
        address : string;

        port : number;

        addressType : ((number)|("udp4")|("udp6"));
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace cluster {
    export interface Cluster extends events.EventEmitter {
        Worker : cluster.Worker;

        disconnect(callback? : any) : any;

        fork(env? : any) : any;

        isMaster : boolean;

        isWorker : boolean;

        settings : cluster.ClusterSettings;

        setupMaster(settings? : any) : any;

        worker : cluster.Worker;

        workers : any;

        /**
         * events.EventEmitter
         * 1. disconnect
         * 2. exit
         * 3. fork
         * 4. listening
         * 5. message
         * 6. online
         * 7. setup
         * @param {string} event
         * @param {Function} listener
         * @return {cluster.Cluster}
         */
        addListener(event? : any, listener? : any) : any;

        addListener(event : "message", listener : (p1: cluster.Worker, p2: any, p3: net.Socket) => void) : Cluster;

        emit(event? : any, code? : any, signal? : any) : any;

        emit(event : "message", listener : (p1: cluster.Worker, p2: any, p3: net.Socket) => void) : boolean;

        on(event? : any, listener? : any) : any;

        on(event : "message", listener : (p1: cluster.Worker, p2: any, p3: net.Socket) => void) : Cluster;

        once(event? : any, listener? : any) : any;

        once(event : "message", listener : (p1: cluster.Worker, p2: any, p3: net.Socket) => void) : Cluster;

        prependListener(event? : any, listener? : any) : any;

        prependListener(event : "message", listener : (p1: cluster.Worker, p2: any, p3: net.Socket) => void) : Cluster;

        prependOnceListener(event? : any, listener? : any) : any;

        prependOnceListener(event : "message", listener : (p1: cluster.Worker, p2: any, p3: net.Socket) => void) : Cluster;

        addListener(event : "message", listener : (p1: cluster.Worker, p2: any, p3: net.Server) => void) : Cluster;

        emit(event : "message", listener : (p1: cluster.Worker, p2: any, p3: net.Server) => void) : boolean;

        on(event : "message", listener : (p1: cluster.Worker, p2: any, p3: net.Server) => void) : Cluster;

        once(event : "message", listener : (p1: cluster.Worker, p2: any, p3: net.Server) => void) : Cluster;

        prependListener(event : "message", listener : (p1: cluster.Worker, p2: any, p3: net.Server) => void) : Cluster;

        prependOnceListener(event : "message", listener : (p1: cluster.Worker, p2: any, p3: net.Server) => void) : Cluster;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace cluster {
    export interface ClusterSettings {
        execArgv? : string[];

        exec? : string;

        args? : string[];

        silent? : boolean;

        stdio? : any[];

        uid? : number;

        gid? : number;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace cluster {
    export interface ClusterSetupMasterSettings {
        exec? : string;

        args? : string[];

        silent? : boolean;

        stdio? : any[];
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace cluster {
    

    export function disconnect(callback? : any) : any;

    

    export function fork(env? : any) : any;

    export var isMaster : boolean;

    export var isWorker : boolean;

    export var settings : cluster.ClusterSettings;

    

    export function setupMaster(settings? : any) : any;

    export var worker : cluster.Worker;

    export var workers : any;

    

    /**
     * events.EventEmitter
     * 1. disconnect
     * 2. exit
     * 3. fork
     * 4. listening
     * 5. message
     * 6. online
     * 7. setup
     * @param {string} event
     * @param {Function} listener
     * @return {cluster.Cluster}
     */
    export function addListener(event? : any, listener? : any) : any;

    export function addListener(event : "message", listener : (p1: cluster.Worker, p2: any, p3: net.Socket) => void) : cluster.Cluster;

    

    export function emit(event? : any, listener? : any) : any;

    export function emit(event : "message", listener : (p1: cluster.Worker, p2: any, p3: net.Socket) => void) : boolean;

    

    export function on(event? : any, listener? : any) : any;

    export function on(event : "message", listener : (p1: cluster.Worker, p2: any, p3: net.Socket) => void) : cluster.Cluster;

    

    export function once(event? : any, listener? : any) : any;

    export function once(event : "message", listener : (p1: cluster.Worker, p2: any, p3: net.Socket) => void) : cluster.Cluster;

    export function removeListener(event : string, listener : Function) : cluster.Cluster;

    

    export function removeAllListeners(event? : any) : any;

    export function setMaxListeners(n : number) : cluster.Cluster;

    export function getMaxListeners() : number;

    export function listeners(event : string) : Function[];

    export function listenerCount(type : string) : number;

    

    export function prependListener(event? : any, listener? : any) : any;

    export function prependListener(event : "message", listener : (p1: cluster.Worker, p2: any, p3: net.Socket) => void) : cluster.Cluster;

    

    export function prependOnceListener(event? : any, listener? : any) : any;

    export function prependOnceListener(event : "message", listener : (p1: cluster.Worker, p2: any, p3: net.Socket) => void) : cluster.Cluster;

    export function eventNames() : string[];

    export function addListener(event : "message", listener : (p1: cluster.Worker, p2: any, p3: net.Server) => void) : cluster.Cluster;

    export function emit(event : "message", listener : (p1: cluster.Worker, p2: any, p3: net.Server) => void) : boolean;

    export function on(event : "message", listener : (p1: cluster.Worker, p2: any, p3: net.Server) => void) : cluster.Cluster;

    export function once(event : "message", listener : (p1: cluster.Worker, p2: any, p3: net.Server) => void) : cluster.Cluster;

    export function prependListener(event : "message", listener : (p1: cluster.Worker, p2: any, p3: net.Server) => void) : cluster.Cluster;

    export function prependOnceListener(event : "message", listener : (p1: cluster.Worker, p2: any, p3: net.Server) => void) : cluster.Cluster;

}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace cluster {
    export class Worker extends events.EventEmitter {
        public id : string;

        public process : child_process.ChildProcess;

        public suicide : boolean;

        

        public send(message? : any, sendHandle? : any) : any;

        

        public kill(signal? : any) : any;

        

        public destroy(signal? : any) : any;

        public disconnect();

        public isConnected() : boolean;

        public isDead() : boolean;

        public exitedAfterDisconnect : boolean;

        

        /**
         * events.EventEmitter
         * 1. disconnect
         * 2. error
         * 3. exit
         * 4. listening
         * 5. message
         * 6. online
         * @param {string} event
         * @param {Function} listener
         * @return {cluster.Worker}
         */
        public addListener(event? : any, listener? : any) : any;

        public addListener(event : "message", listener : (p1: any, p2: net.Socket) => void) : Worker;

        public emit(event? : any, code? : any, signal? : any) : any;

        

        public emit(event : "message", listener : (p1: any, p2: net.Socket) => void) : boolean;

        

        public on(event? : any, listener? : any) : any;

        public on(event : "message", listener : (p1: any, p2: net.Socket) => void) : Worker;

        

        public once(event? : any, listener? : any) : any;

        public once(event : "message", listener : (p1: any, p2: net.Socket) => void) : Worker;

        

        public prependListener(event? : any, listener? : any) : any;

        public prependListener(event : "message", listener : (p1: any, p2: net.Socket) => void) : Worker;

        

        public prependOnceListener(event? : any, listener? : any) : any;

        public prependOnceListener(event : "message", listener : (p1: any, p2: net.Socket) => void) : Worker;

        public addListener(event : "message", listener : (p1: any, p2: net.Server) => void) : Worker;

        public emit(event : "message", listener : (p1: any, p2: net.Server) => void) : boolean;

        public on(event : "message", listener : (p1: any, p2: net.Server) => void) : Worker;

        public once(event : "message", listener : (p1: any, p2: net.Server) => void) : Worker;

        public prependListener(event : "message", listener : (p1: any, p2: net.Server) => void) : Worker;

        public prependOnceListener(event : "message", listener : (p1: any, p2: net.Server) => void) : Worker;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
interface Console {
    Console : Console;

    assert(value? : any, message? : any, ...optionalParams : any[]) : any;

    dir(obj? : any, options? : any) : any;

    error(message? : any, ...optionalParams : any[]) : any;

    info(message? : any, ...optionalParams : any[]) : any;

    log(message? : any, ...optionalParams : any[]) : any;

    time(label : string);

    timeEnd(label : string);

    trace(message? : any, ...optionalParams : any[]) : any;

    warn(message? : any, ...optionalParams : any[]) : any;
}

/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace constants {
    export var E2BIG : number;

    export var EACCES : number;

    export var EADDRINUSE : number;

    export var EADDRNOTAVAIL : number;

    export var EAFNOSUPPORT : number;

    export var EAGAIN : number;

    export var EALREADY : number;

    export var EBADF : number;

    export var EBADMSG : number;

    export var EBUSY : number;

    export var ECANCELED : number;

    export var ECHILD : number;

    export var ECONNABORTED : number;

    export var ECONNREFUSED : number;

    export var ECONNRESET : number;

    export var EDEADLK : number;

    export var EDESTADDRREQ : number;

    export var EDOM : number;

    export var EEXIST : number;

    export var EFAULT : number;

    export var EFBIG : number;

    export var EHOSTUNREACH : number;

    export var EIDRM : number;

    export var EILSEQ : number;

    export var EINPROGRESS : number;

    export var EINTR : number;

    export var EINVAL : number;

    export var EIO : number;

    export var EISCONN : number;

    export var EISDIR : number;

    export var ELOOP : number;

    export var EMFILE : number;

    export var EMLINK : number;

    export var EMSGSIZE : number;

    export var ENAMETOOLONG : number;

    export var ENETDOWN : number;

    export var ENETRESET : number;

    export var ENETUNREACH : number;

    export var ENFILE : number;

    export var ENOBUFS : number;

    export var ENODATA : number;

    export var ENODEV : number;

    export var ENOENT : number;

    export var ENOEXEC : number;

    export var ENOLCK : number;

    export var ENOLINK : number;

    export var ENOMEM : number;

    export var ENOMSG : number;

    export var ENOPROTOOPT : number;

    export var ENOSPC : number;

    export var ENOSR : number;

    export var ENOSTR : number;

    export var ENOSYS : number;

    export var ENOTCONN : number;

    export var ENOTDIR : number;

    export var ENOTEMPTY : number;

    export var ENOTSOCK : number;

    export var ENOTSUP : number;

    export var ENOTTY : number;

    export var ENXIO : number;

    export var EOPNOTSUPP : number;

    export var EOVERFLOW : number;

    export var EPERM : number;

    export var EPIPE : number;

    export var EPROTO : number;

    export var EPROTONOSUPPORT : number;

    export var EPROTOTYPE : number;

    export var ERANGE : number;

    export var EROFS : number;

    export var ESPIPE : number;

    export var ESRCH : number;

    export var ETIME : number;

    export var ETIMEDOUT : number;

    export var ETXTBSY : number;

    export var EWOULDBLOCK : number;

    export var EXDEV : number;

    export var WSAEINTR : number;

    export var WSAEBADF : number;

    export var WSAEACCES : number;

    export var WSAEFAULT : number;

    export var WSAEINVAL : number;

    export var WSAEMFILE : number;

    export var WSAEWOULDBLOCK : number;

    export var WSAEINPROGRESS : number;

    export var WSAEALREADY : number;

    export var WSAENOTSOCK : number;

    export var WSAEDESTADDRREQ : number;

    export var WSAEMSGSIZE : number;

    export var WSAEPROTOTYPE : number;

    export var WSAENOPROTOOPT : number;

    export var WSAEPROTONOSUPPORT : number;

    export var WSAESOCKTNOSUPPORT : number;

    export var WSAEOPNOTSUPP : number;

    export var WSAEPFNOSUPPORT : number;

    export var WSAEAFNOSUPPORT : number;

    export var WSAEADDRINUSE : number;

    export var WSAEADDRNOTAVAIL : number;

    export var WSAENETDOWN : number;

    export var WSAENETUNREACH : number;

    export var WSAENETRESET : number;

    export var WSAECONNABORTED : number;

    export var WSAECONNRESET : number;

    export var WSAENOBUFS : number;

    export var WSAEISCONN : number;

    export var WSAENOTCONN : number;

    export var WSAESHUTDOWN : number;

    export var WSAETOOMANYREFS : number;

    export var WSAETIMEDOUT : number;

    export var WSAECONNREFUSED : number;

    export var WSAELOOP : number;

    export var WSAENAMETOOLONG : number;

    export var WSAEHOSTDOWN : number;

    export var WSAEHOSTUNREACH : number;

    export var WSAENOTEMPTY : number;

    export var WSAEPROCLIM : number;

    export var WSAEUSERS : number;

    export var WSAEDQUOT : number;

    export var WSAESTALE : number;

    export var WSAEREMOTE : number;

    export var WSASYSNOTREADY : number;

    export var WSAVERNOTSUPPORTED : number;

    export var WSANOTINITIALISED : number;

    export var WSAEDISCON : number;

    export var WSAENOMORE : number;

    export var WSAECANCELLED : number;

    export var WSAEINVALIDPROCTABLE : number;

    export var WSAEINVALIDPROVIDER : number;

    export var WSAEPROVIDERFAILEDINIT : number;

    export var WSASYSCALLFAILURE : number;

    export var WSASERVICE_NOT_FOUND : number;

    export var WSATYPE_NOT_FOUND : number;

    export var WSA_E_NO_MORE : number;

    export var WSA_E_CANCELLED : number;

    export var WSAEREFUSED : number;

    export var SIGHUP : number;

    export var SIGINT : number;

    export var SIGILL : number;

    export var SIGABRT : number;

    export var SIGFPE : number;

    export var SIGKILL : number;

    export var SIGSEGV : number;

    export var SIGTERM : number;

    export var SIGBREAK : number;

    export var SIGWINCH : number;

    export var SSL_OP_ALL : number;

    export var SSL_OP_ALLOW_UNSAFE_LEGACY_RENEGOTIATION : number;

    export var SSL_OP_CIPHER_SERVER_PREFERENCE : number;

    export var SSL_OP_CISCO_ANYCONNECT : number;

    export var SSL_OP_COOKIE_EXCHANGE : number;

    export var SSL_OP_CRYPTOPRO_TLSEXT_BUG : number;

    export var SSL_OP_DONT_INSERT_EMPTY_FRAGMENTS : number;

    export var SSL_OP_EPHEMERAL_RSA : number;

    export var SSL_OP_LEGACY_SERVER_CONNECT : number;

    export var SSL_OP_MICROSOFT_BIG_SSLV3_BUFFER : number;

    export var SSL_OP_MICROSOFT_SESS_ID_BUG : number;

    export var SSL_OP_MSIE_SSLV2_RSA_PADDING : number;

    export var SSL_OP_NETSCAPE_CA_DN_BUG : number;

    export var SSL_OP_NETSCAPE_CHALLENGE_BUG : number;

    export var SSL_OP_NETSCAPE_DEMO_CIPHER_CHANGE_BUG : number;

    export var SSL_OP_NETSCAPE_REUSE_CIPHER_CHANGE_BUG : number;

    export var SSL_OP_NO_COMPRESSION : number;

    export var SSL_OP_NO_QUERY_MTU : number;

    export var SSL_OP_NO_SESSION_RESUMPTION_ON_RENEGOTIATION : number;

    export var SSL_OP_NO_SSLv2 : number;

    export var SSL_OP_NO_SSLv3 : number;

    export var SSL_OP_NO_TICKET : number;

    export var SSL_OP_NO_TLSv1 : number;

    export var SSL_OP_NO_TLSv1_1 : number;

    export var SSL_OP_NO_TLSv1_2 : number;

    export var SSL_OP_PKCS1_CHECK_1 : number;

    export var SSL_OP_PKCS1_CHECK_2 : number;

    export var SSL_OP_SINGLE_DH_USE : number;

    export var SSL_OP_SINGLE_ECDH_USE : number;

    export var SSL_OP_SSLEAY_080_CLIENT_DH_BUG : number;

    export var SSL_OP_SSLREF2_REUSE_CERT_TYPE_BUG : number;

    export var SSL_OP_TLS_BLOCK_PADDING_BUG : number;

    export var SSL_OP_TLS_D5_BUG : number;

    export var SSL_OP_TLS_ROLLBACK_BUG : number;

    export var ENGINE_METHOD_DSA : number;

    export var ENGINE_METHOD_DH : number;

    export var ENGINE_METHOD_RAND : number;

    export var ENGINE_METHOD_ECDH : number;

    export var ENGINE_METHOD_ECDSA : number;

    export var ENGINE_METHOD_CIPHERS : number;

    export var ENGINE_METHOD_DIGESTS : number;

    export var ENGINE_METHOD_STORE : number;

    export var ENGINE_METHOD_PKEY_METHS : number;

    export var ENGINE_METHOD_PKEY_ASN1_METHS : number;

    export var ENGINE_METHOD_ALL : number;

    export var ENGINE_METHOD_NONE : number;

    export var DH_CHECK_P_NOT_SAFE_PRIME : number;

    export var DH_CHECK_P_NOT_PRIME : number;

    export var DH_UNABLE_TO_CHECK_GENERATOR : number;

    export var DH_NOT_SUITABLE_GENERATOR : number;

    export var NPN_ENABLED : number;

    export var RSA_PKCS1_PADDING : number;

    export var RSA_SSLV23_PADDING : number;

    export var RSA_NO_PADDING : number;

    export var RSA_PKCS1_OAEP_PADDING : number;

    export var RSA_X931_PADDING : number;

    export var RSA_PKCS1_PSS_PADDING : number;

    export var POINT_CONVERSION_COMPRESSED : number;

    export var POINT_CONVERSION_UNCOMPRESSED : number;

    export var POINT_CONVERSION_HYBRID : number;

    export var O_RDONLY : number;

    export var O_WRONLY : number;

    export var O_RDWR : number;

    export var S_IFMT : number;

    export var S_IFREG : number;

    export var S_IFDIR : number;

    export var S_IFCHR : number;

    export var S_IFBLK : number;

    export var S_IFIFO : number;

    export var S_IFSOCK : number;

    export var S_IRWXU : number;

    export var S_IRUSR : number;

    export var S_IWUSR : number;

    export var S_IXUSR : number;

    export var S_IRWXG : number;

    export var S_IRGRP : number;

    export var S_IWGRP : number;

    export var S_IXGRP : number;

    export var S_IRWXO : number;

    export var S_IROTH : number;

    export var S_IWOTH : number;

    export var S_IXOTH : number;

    export var S_IFLNK : number;

    export var O_CREAT : number;

    export var O_EXCL : number;

    export var O_NOCTTY : number;

    export var O_DIRECTORY : number;

    export var O_NOATIME : number;

    export var O_NOFOLLOW : number;

    export var O_SYNC : number;

    export var O_SYMLINK : number;

    export var O_DIRECT : number;

    export var O_NONBLOCK : number;

    export var O_TRUNC : number;

    export var O_APPEND : number;

    export var F_OK : number;

    export var R_OK : number;

    export var W_OK : number;

    export var X_OK : number;

    export var UV_UDP_REUSEADDR : number;

    export var SIGQUIT : number;

    export var SIGTRAP : number;

    export var SIGIOT : number;

    export var SIGBUS : number;

    export var SIGUSR1 : number;

    export var SIGUSR2 : number;

    export var SIGPIPE : number;

    export var SIGALRM : number;

    export var SIGCHLD : number;

    export var SIGSTKFLT : number;

    export var SIGCONT : number;

    export var SIGSTOP : number;

    export var SIGTSTP : number;

    export var SIGTTIN : number;

    export var SIGTTOU : number;

    export var SIGURG : number;

    export var SIGXCPU : number;

    export var SIGXFSZ : number;

    export var SIGVTALRM : number;

    export var SIGPROF : number;

    export var SIGIO : number;

    export var SIGPOLL : number;

    export var SIGPWR : number;

    export var SIGSYS : number;

    export var SIGUNUSED : number;

    export var defaultCoreCipherList : string;

    export var defaultCipherList : string;

    export var ENGINE_METHOD_RSA : number;

    export var ALPN_ENABLED : number;

}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace crypto {
    export class Certificate {
        

        public exportChallenge(spkac? : any) : any;

        

        public exportPublicKey(spkac? : any) : any;

        public verifySpkac(spkac : Buffer) : boolean;

        public constructor();

        public static () : Certificate;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace crypto {
    export interface Cipher extends NodeJS.ReadWriteStream {
        update(data? : any, input_encoding? : any, output_encoding? : any) : any;

        final(output_encoding? : any) : any;

        setAutoPadding(auto_padding? : any) : any;

        getAuthTag() : Buffer;

        setAAD(buffer : Buffer);
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace crypto {
    export interface CredentialDetails {
        pfx : string;

        key : string;

        passphrase : string;

        cert : string;

        ca : ((string)|(string[]));

        crl : ((string)|(string[]));

        ciphers : string;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace crypto {
    export interface Credentials {
        context? : any;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace crypto {
    export interface Decipher extends NodeJS.ReadWriteStream {
        update(data? : any, input_encoding? : any, output_encoding? : any) : any;

        final(output_encoding? : any) : any;

        setAutoPadding(auto_padding? : any) : any;

        setAuthTag(tag : Buffer);

        setAAD(buffer : Buffer);
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace crypto {
    export interface DiffieHellman {
        generateKeys(encoding? : any) : any;

        computeSecret(other_public_key? : any, input_encoding? : any, output_encoding? : any) : any;

        getPrime(encoding? : any) : any;

        getGenerator(encoding? : any) : any;

        getPublicKey(encoding? : any) : any;

        getPrivateKey(encoding? : any) : any;

        setPublicKey(public_key? : any, encoding? : any) : any;

        setPrivateKey(private_key? : any, encoding? : any) : any;

        verifyError : number;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace crypto {
    export interface ECDH {
        generateKeys(encoding? : any, format? : any) : any;

        computeSecret(other_public_key? : any, input_encoding? : any, output_encoding? : any) : any;

        getPrivateKey(encoding? : any) : any;

        getPublicKey(encoding? : any, format? : any) : any;

        setPrivateKey(private_key? : any, encoding? : any) : any;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace crypto {
    export var fips : boolean;

    export function createCredentials(details : crypto.CredentialDetails) : crypto.Credentials;

    export function createHash(algorithm : string) : crypto.Hash;

    

    export function createHmac(algorithm? : any, key? : any) : any;

    export function createCipher(algorithm : string, password : any) : crypto.Cipher;

    export function createCipheriv(algorithm : string, key : any, iv : any) : crypto.Cipher;

    export function createDecipher(algorithm : string, password : any) : crypto.Decipher;

    export function createDecipheriv(algorithm : string, key : any, iv : any) : crypto.Decipher;

    export function createSign(algorithm : string) : crypto.Signer;

    export function createVerify(algorith : string) : crypto.Verify;

    

    export function createDiffieHellman(prime? : any, prime_encoding? : any, generator? : any, generator_encoding? : any) : any;

    export function getDiffieHellman(group_name : string) : crypto.DiffieHellman;

    

    export function pbkdf2(password? : any, salt? : any, iterations? : any, keylen? : any, digest? : any, callback? : any) : any;

    

    export function pbkdf2Sync(password? : any, salt? : any, iterations? : any, keylen? : any, digest? : any) : any;

    

    export function randomBytes(size? : any, callback? : any) : any;

    

    export function pseudoRandomBytes(size? : any, callback? : any) : any;

    

    export function publicEncrypt(public_key? : any, buffer? : any) : any;

    

    export function privateDecrypt(private_key? : any, buffer? : any) : any;

    

    export function privateEncrypt(private_key? : any, buffer? : any) : any;

    

    export function publicDecrypt(public_key? : any, buffer? : any) : any;

    export function getCiphers() : string[];

    export function getCurves() : string[];

    export function getHashes() : string[];

    export function createECDH(curve_name : string) : crypto.ECDH;

    export function timingSafeEqual(a : Buffer, b : Buffer) : boolean;

    export var DEFAULT_ENCODING : string;

}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace crypto {
    export interface Hash extends NodeJS.ReadWriteStream {
        update(data? : any, input_encoding? : any) : any;

        digest(encoding? : any) : any;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace crypto {
    export interface Hmac extends NodeJS.ReadWriteStream {
        update(data? : any, input_encoding? : any) : any;

        digest(encoding? : any) : any;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace crypto {
    export interface RsaPrivateKey {
        key : string;

        passphrase? : string;

        padding? : number;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace crypto {
    export interface RsaPublicKey {
        key : string;

        padding? : number;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace crypto {
    export interface Signer extends NodeJS.WritableStream {
        update(data? : any, input_encoding? : any) : any;

        sign(private_key? : any, output_format? : any) : any;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace crypto {
    export interface Verify extends NodeJS.WritableStream {
        update(data? : any, input_encoding? : any) : any;

        verify(object? : any, signature? : any, signature_format? : any) : any;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace dgram {
    export interface AddressInfo {
        address : string;

        family : string;

        port : number;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace dgram {
    export interface BindOptions {
        port : number;

        address? : string;

        exclusive? : boolean;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace dgram {
    

    export function createSocket(type? : any, callback? : any) : any;

}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace dgram {
    export interface RemoteInfo {
        address : string;

        family : string;

        port : number;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace dgram {
    export interface Socket extends events.EventEmitter {
        send(msg? : any, offset? : any, length? : any, port? : any, address? : any, callback? : any) : any;

        bind(port? : any, address? : any, callback? : any) : any;

        close(callback? : any) : any;

        address() : dgram.AddressInfo;

        setBroadcast(flag : boolean);

        setTTL(ttl : number);

        setMulticastTTL(ttl : number);

        setMulticastLoopback(flag : boolean);

        addMembership(multicastAddress? : any, multicastInterface? : any) : any;

        dropMembership(multicastAddress? : any, multicastInterface? : any) : any;

        ref() : Socket;

        unref() : Socket;

        addListener(event? : any, listener? : any) : any;

        emit(event? : any, msg? : any, rinfo? : any) : any;

        on(event? : any, listener? : any) : any;

        once(event? : any, listener? : any) : any;

        prependListener(event? : any, listener? : any) : any;

        prependOnceListener(event? : any, listener? : any) : any;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace dgram {
    export interface SocketOptions {
        type : (("udp4")|("udp6"));

        reuseAddr? : boolean;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace dns {
    

    export function lookup(domain? : any, family? : any, callback? : any) : any;

    

    export function resolve(domain? : any, rrtype? : any, callback? : any) : any;

    export function resolve4(domain : string, callback : (p1: Error, p2: string[]) => void) : string[];

    export function resolve6(domain : string, callback : (p1: Error, p2: string[]) => void) : string[];

    export function resolveMx(domain : string, callback : (p1: Error, p2: dns.MxRecord[]) => void) : string[];

    export function resolveTxt(domain : string, callback : (p1: Error, p2: string[]) => void) : string[];

    export function resolveSrv(domain : string, callback : (p1: Error, p2: string[]) => void) : string[];

    export function resolveNs(domain : string, callback : (p1: Error, p2: string[]) => void) : string[];

    export function resolveCname(domain : string, callback : (p1: Error, p2: string[]) => void) : string[];

    export function reverse(ip : string, callback : (p1: Error, p2: string[]) => void) : string[];

    export function setServers(servers : string[]);

    export var NODATA : string;

    export var FORMERR : string;

    export var SERVFAIL : string;

    export var NOTFOUND : string;

    export var NOTIMP : string;

    export var REFUSED : string;

    export var BADQUERY : string;

    export var BADNAME : string;

    export var BADFAMILY : string;

    export var BADRESP : string;

    export var CONNREFUSED : string;

    export var TIMEOUT : string;

    export var EOF : string;

    export var FILE : string;

    export var NOMEM : string;

    export var DESTRUCTION : string;

    export var BADSTR : string;

    export var BADFLAGS : string;

    export var NONAME : string;

    export var BADHINTS : string;

    export var NOTINITIALIZED : string;

    export var LOADIPHLPAPI : string;

    export var ADDRGETNETWORKPARAMS : string;

    export var CANCELLED : string;

}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace dns {
    export interface MxRecord {
        exchange : string;

        priority : number;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace domain {
    export class Domain extends events.EventEmitter {
        

        public add(emitter? : any) : any;

        

        public remove(emitter? : any) : any;

        public members : any[];

        public enter();

        public exit();

        public run(fn : Function);

        public bind(cb : (p1: Error, p2: any) => any) : any;

        public intercept(cb : (p1: any) => any) : any;

        public dispose();

        

        public addListener(event? : any, listener? : any) : any;

        

        public on(event? : any, listener? : any) : any;

        

        public once(event? : any, listener? : any) : any;

        public removeListener(event : string, listener : Function) : Domain;

        

        public removeAllListeners(event? : any) : any;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace domain {
    export function create() : domain.Domain;

}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
interface Error {
    stack? : string;
}

/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace events {
    export class EventEmitter extends events.internal {
        public static listenerCount(emitter : EventEmitter, event : string) : number;

        public static defaultMaxListeners : number;

        

        public addListener(event? : any, listener? : any) : any;

        

        public on(event? : any, listener? : any) : any;

        

        public once(event? : any, listener? : any) : any;

        

        public prependListener(event? : any, listener? : any) : any;

        

        public prependOnceListener(event? : any, listener? : any) : any;

        

        public removeListener(event? : any, listener? : any) : any;

        

        public removeAllListeners(event? : any) : any;

        public setMaxListeners(n : number) : EventEmitter;

        public getMaxListeners() : number;

        public listeners(event : string) : Function[];

        public emit(event? : any, err? : any, address? : any, family? : any, host? : any) : any;

        

        public eventNames() : ((string)|(string))[];

        public listenerCount(type : string) : number;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace events {
    export class internal extends NodeJS.EventEmitter {    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace fs.constants {
    /**
     * Constant for fs.access(). File is visible to the calling process.
     */
    export var F_OK : number = 0;

    /**
     * Constant for fs.access(). File can be read by the calling process.
     */
    export var R_OK : number = 0;

    /**
     * Constant for fs.access(). File can be written by the calling process.
     */
    export var W_OK : number = 0;

    /**
     * Constant for fs.access(). File can be executed by the calling process.
     */
    export var X_OK : number = 0;

    /**
     * Constant for fs.open(). Flag indicating to open a file for read-only access.
     */
    export var O_RDONLY : number = 0;

    /**
     * Constant for fs.open(). Flag indicating to open a file for write-only access.
     */
    export var O_WRONLY : number = 0;

    /**
     * Constant for fs.open(). Flag indicating to open a file for read-write access.
     */
    export var O_RDWR : number = 0;

    /**
     * Constant for fs.open(). Flag indicating to create the file if it does not already exist.
     */
    export var O_CREAT : number = 0;

    /**
     * Constant for fs.open(). Flag indicating that opening a file should fail if the O_CREAT flag is set and the file already exists.
     */
    export var O_EXCL : number = 0;

    /**
     * Constant for fs.open(). Flag indicating that if path identifies a terminal device, opening the path shall not cause that terminal to become the controlling terminal for the process (if the process does not already have one).
     */
    export var O_NOCTTY : number = 0;

    /**
     * Constant for fs.open(). Flag indicating that if the file exists and is a regular file, and the file is opened successfully for write access, its length shall be truncated to zero.
     */
    export var O_TRUNC : number = 0;

    /**
     * Constant for fs.open(). Flag indicating that data will be appended to the end of the file.
     */
    export var O_APPEND : number = 0;

    /**
     * Constant for fs.open(). Flag indicating that the open should fail if the path is not a directory.
     */
    export var O_DIRECTORY : number = 0;

    /**
     * Constant for fs.open(). Flag indicating reading accesses to the file system will no longer result in an update to the atime information associated with the file. This flag is available on Linux operating systems only.
     */
    export var O_NOATIME : number = 0;

    /**
     * Constant for fs.open(). Flag indicating that the open should fail if the path is a symbolic link.
     */
    export var O_NOFOLLOW : number = 0;

    /**
     * Constant for fs.open(). Flag indicating that the file is opened for synchronous I/O.
     */
    export var O_SYNC : number = 0;

    /**
     * Constant for fs.open(). Flag indicating to open the symbolic link itself rather than the resource it is pointing to.
     */
    export var O_SYMLINK : number = 0;

    /**
     * Constant for fs.open(). When set, an attempt will be made to minimize caching effects of file I/O.
     */
    export var O_DIRECT : number = 0;

    /**
     * Constant for fs.open(). Flag indicating to open the file in nonblocking mode when possible.
     */
    export var O_NONBLOCK : number = 0;

    /**
     * Constant for fs.Stats mode property for determining a file's type. Bit mask used to extract the file type code.
     */
    export var S_IFMT : number = 0;

    /**
     * Constant for fs.Stats mode property for determining a file's type. File type constant for a regular file.
     */
    export var S_IFREG : number = 0;

    /**
     * Constant for fs.Stats mode property for determining a file's type. File type constant for a directory.
     */
    export var S_IFDIR : number = 0;

    /**
     * Constant for fs.Stats mode property for determining a file's type. File type constant for a character-oriented device file.
     */
    export var S_IFCHR : number = 0;

    /**
     * Constant for fs.Stats mode property for determining a file's type. File type constant for a block-oriented device file.
     */
    export var S_IFBLK : number = 0;

    /**
     * Constant for fs.Stats mode property for determining a file's type. File type constant for a FIFO/pipe.
     */
    export var S_IFIFO : number = 0;

    /**
     * Constant for fs.Stats mode property for determining a file's type. File type constant for a symbolic link.
     */
    export var S_IFLNK : number = 0;

    /**
     * Constant for fs.Stats mode property for determining a file's type. File type constant for a socket.
     */
    export var S_IFSOCK : number = 0;

    /**
     * Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable, writable and executable by owner.
     */
    export var S_IRWXU : number = 0;

    /**
     * Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable by owner.
     */
    export var S_IRUSR : number = 0;

    /**
     * Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating writable by owner.
     */
    export var S_IWUSR : number = 0;

    /**
     * Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating executable by owner.
     */
    export var S_IXUSR : number = 0;

    /**
     * Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable, writable and executable by group.
     */
    export var S_IRWXG : number = 0;

    /**
     * Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable by group.
     */
    export var S_IRGRP : number = 0;

    /**
     * Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating writable by group.
     */
    export var S_IWGRP : number = 0;

    /**
     * Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating executable by group.
     */
    export var S_IXGRP : number = 0;

    /**
     * Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable, writable and executable by others.
     */
    export var S_IRWXO : number = 0;

    /**
     * Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable by others.
     */
    export var S_IROTH : number = 0;

    /**
     * Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating writable by others.
     */
    export var S_IWOTH : number = 0;

    /**
     * Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating executable by others.
     */
    export var S_IXOTH : number = 0;

}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace fs {
    export interface FSWatcher extends events.EventEmitter {
        close();

        /**
         * events.EventEmitter
         * 1. change
         * 2. error
         * @param {string} event
         * @param {Function} listener
         * @return {fs.FSWatcher}
         */
        addListener(event? : any, listener? : any) : any;

        addListener(event : "change", listener : (p1: string, p2: string) => void) : FSWatcher;

        on(event? : any, listener? : any) : any;

        on(event : "change", listener : (p1: string, p2: string) => void) : FSWatcher;

        once(event? : any, listener? : any) : any;

        once(event : "change", listener : (p1: string, p2: string) => void) : FSWatcher;

        prependListener(event? : any, listener? : any) : any;

        prependListener(event : "change", listener : (p1: string, p2: string) => void) : FSWatcher;

        prependOnceListener(event? : any, listener? : any) : any;

        prependOnceListener(event : "change", listener : (p1: string, p2: string) => void) : FSWatcher;

        addListener(event : "change", listener : (p1: string, p2: Buffer) => void) : FSWatcher;

        on(event : "change", listener : (p1: string, p2: Buffer) => void) : FSWatcher;

        once(event : "change", listener : (p1: string, p2: Buffer) => void) : FSWatcher;

        prependListener(event : "change", listener : (p1: string, p2: Buffer) => void) : FSWatcher;

        prependOnceListener(event : "change", listener : (p1: string, p2: Buffer) => void) : FSWatcher;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace fs {
    

    /**
     * Asynchronous rename.
     * @param {string} oldPath
     * @param {string} newPath
     * @param {java.util.function.Consumer} callback No arguments other than a possible exception are given to the completion callback.
     */
    export function rename(oldPath? : any, newPath? : any, callback? : any) : any;

    /**
     * Synchronous rename
     * @param {string} oldPath
     * @param {string} newPath
     */
    export function renameSync(oldPath : string, newPath : string);

    

    export function truncate(path? : any, len? : any, callback? : any) : any;

    

    export function truncateSync(path? : any, len? : any) : any;

    

    export function ftruncate(fd? : any, len? : any, callback? : any) : any;

    

    export function ftruncateSync(fd? : any, len? : any) : any;

    

    export function chown(path? : any, uid? : any, gid? : any, callback? : any) : any;

    

    export function chownSync(path? : any, uid? : any, gid? : any) : any;

    

    export function fchown(fd? : any, uid? : any, gid? : any, callback? : any) : any;

    export function fchownSync(fd : number, uid : number, gid : number);

    

    export function lchown(path? : any, uid? : any, gid? : any, callback? : any) : any;

    

    export function lchownSync(path? : any, uid? : any, gid? : any) : any;

    

    export function chmod(path? : any, mode? : any, callback? : any) : any;

    

    export function chmodSync(path? : any, mode? : any) : any;

    

    export function fchmod(fd? : any, mode? : any, callback? : any) : any;

    

    export function fchmodSync(fd? : any, mode? : any) : any;

    

    export function lchmod(path? : any, mode? : any, callback? : any) : any;

    

    export function lchmodSync(path? : any, mode? : any) : any;

    

    export function stat(path? : any, callback? : any) : any;

    

    export function lstat(path? : any, callback? : any) : any;

    

    export function fstat(fd? : any, callback? : any) : any;

    

    export function statSync(path? : any) : any;

    

    export function lstatSync(path? : any) : any;

    export function fstatSync(fd : number) : fs.Stats;

    

    export function link(srcpath? : any, dstpath? : any, callback? : any) : any;

    

    export function linkSync(srcpath? : any, dstpath? : any) : any;

    

    export function symlink(srcpath? : any, dstpath? : any, type? : any, callback? : any) : any;

    

    export function symlinkSync(srcpath? : any, dstpath? : any, type? : any) : any;

    

    export function readlink(path? : any, callback? : any) : any;

    

    export function readlinkSync(path? : any) : any;

    

    export function realpath(path? : any, cache? : any, callback? : any) : any;

    

    export function realpathSync(path? : any, cache? : any) : any;

    

    export function unlink(path? : any, callback? : any) : any;

    

    export function unlinkSync(path? : any) : any;

    

    export function rmdir(path? : any, callback? : any) : any;

    

    export function rmdirSync(path? : any) : any;

    

    export function mkdir(path? : any, mode? : any, callback? : any) : any;

    

    export function mkdirSync(path? : any, mode? : any) : any;

    

    export function mkdtemp(prefix? : any, callback? : any) : any;

    export function mkdtempSync(prefix : string) : string;

    

    export function readdir(path? : any, callback? : any) : any;

    

    export function readdirSync(path? : any) : any;

    

    export function close(fd? : any, callback? : any) : any;

    export function closeSync(fd : number);

    

    export function open(path? : any, flags? : any, mode? : any, callback? : any) : any;

    

    export function openSync(path? : any, flags? : any, mode? : any) : any;

    

    export function utimes(path? : any, atime? : any, mtime? : any, callback? : any) : any;

    

    export function utimesSync(path? : any, atime? : any, mtime? : any) : any;

    

    export function futimes(fd? : any, atime? : any, mtime? : any, callback? : any) : any;

    

    export function futimesSync(fd? : any, atime? : any, mtime? : any) : any;

    

    export function fsync(fd? : any, callback? : any) : any;

    export function fsyncSync(fd : number);

    

    export function write(fd? : any, buffer? : any, offset? : any, length? : any, position? : any, callback? : any) : any;

    

    export function writeSync(fd? : any, buffer? : any, offset? : any, length? : any, position? : any) : any;

    

    export function read(fd? : any, buffer? : any, offset? : any, length? : any, position? : any, callback? : any) : any;

    export function readSync(fd : number, buffer : Buffer, offset : number, length : number, position : number) : number;

    

    export function readFile(filename? : any, encoding? : any, callback? : any) : any;

    export function readFile(filename : string, options : any, callback : (p1: NodeJS.ErrnoException, p2: string) => void);

    export function readFile(filename : string, options : any, callback : (p1: NodeJS.ErrnoException, p2: Buffer) => void);

    

    export function readFileSync(filename? : any, encoding? : any) : any;

    

    export function writeFile(filename? : any, data? : any, options? : any, callback? : any) : any;

    

    export function writeFileSync(filename? : any, data? : any, options? : any) : any;

    

    export function appendFile(filename? : any, data? : any, options? : any, callback? : any) : any;

    

    export function appendFileSync(filename? : any, data? : any, options? : any) : any;

    

    export function watchFile(filename? : any, options? : any, listener? : any) : any;

    

    export function unwatchFile(filename? : any, listener? : any) : any;

    

    export function watch(filename? : any, listener? : any) : any;

    

    export function watch(filename? : any, encoding? : any, listener? : any) : any;

    

    export function exists(path? : any, callback? : any) : any;

    

    export function existsSync(path? : any) : any;

    

    export function access(path? : any, mode? : any, callback? : any) : any;

    

    /**
     * Synchronous version of fs.access. This throws if any accessibility checks fail, and does nothing otherwise.
     * @param {string} path
     * @param {number} mode
     */
    export function accessSync(path? : any, mode? : any) : any;

    

    export function createReadStream(path? : any, options? : any) : any;

    

    export function createWriteStream(path? : any, options? : any) : any;

    export function fdatasync(fd : number, callback : Function);

    export function fdatasyncSync(fd : number);

    

    export function watch(filename? : any, encoding? : any, listener? : any) : any;

}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace fs {
    export interface ReadStream extends stream.Readable {
        close();

        destroy();

        bytesRead : number;

        path : ((string)|(Buffer));

        /**
         * events.EventEmitter
         * 1. open
         * 2. close
         * @param {string} event
         * @param {Function} listener
         * @return {fs.ReadStream}
         */
        addListener(event? : any, listener? : any) : any;

        on(event? : any, listener? : any) : any;

        once(event? : any, listener? : any) : any;

        prependListener(event? : any, listener? : any) : any;

        prependOnceListener(event? : any, listener? : any) : any;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace fs {
    export interface Stats {
        isFile() : boolean;

        isDirectory() : boolean;

        isBlockDevice() : boolean;

        isCharacterDevice() : boolean;

        isSymbolicLink() : boolean;

        isFIFO() : boolean;

        isSocket() : boolean;

        dev : number;

        ino : number;

        mode : number;

        nlink : number;

        uid : number;

        gid : number;

        rdev : number;

        size : number;

        blksize : number;

        blocks : number;

        atime : Date;

        mtime : Date;

        ctime : Date;

        birthtime : Date;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace fs {
    export interface WriteStream extends stream.Writable {
        close();

        bytesWritten : number;

        path : ((string)|(Buffer));

        /**
         * events.EventEmitter
         * 1. open
         * 2. close
         * @param {string} event
         * @param {Function} listener
         * @return {fs.WriteStream}
         */
        addListener(event? : any, listener? : any) : any;

        on(event? : any, listener? : any) : any;

        once(event? : any, listener? : any) : any;

        prependListener(event? : any, listener? : any) : any;

        prependOnceListener(event? : any, listener? : any) : any;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare var process : NodeJS.Process;

declare var global : NodeJS.Global;

declare var console : Console;

declare var __filename : string;

declare var __dirname : string;

declare function setTimeout(callback : (p1: any) => void, ms : number, ...args : any[]) : NodeJS.Timer;

declare function clearTimeout(timeoutId : NodeJS.Timer);

declare function setInterval(callback : (p1: any) => void, ms : number, ...args : any[]) : NodeJS.Timer;

declare function clearInterval(intervalId : NodeJS.Timer);

declare function setImmediate(callback : (p1: any) => void, ...args : any[]) : any;

declare function clearImmediate(immediateId : any);

declare var require : NodeRequire;

declare var module : NodeModule;

declare var exports : any;

declare var SlowBuffer : any;



declare function Assert(value? : any, message? : any) : any;


/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace http {
    export class Agent {
        public maxSockets : number;

        public sockets : any;

        public requests : any;

        public constructor(opts? : any);

        /**
         * Destroy any sockets that are currently in use by the agent.
         * It is usually not necessary to do this. However, if you are using an agent with KeepAlive enabled,
         * then it is best to explicitly shut down the agent when you know that it will no longer be used. Otherwise,
         * sockets may hang open for quite a long time before the server terminates them.
         */
        public destroy();
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace http {
    export interface AgentOptions {
        /**
         * Keep sockets around in a pool to be used by other requests in the future. Default = false
         */
        keepAlive? : boolean;

        /**
         * When using HTTP KeepAlive, how often to send TCP KeepAlive packets over sockets being kept alive. Default = 1000.
         * Only relevant if keepAlive is set to true.
         */
        keepAliveMsecs? : number;

        /**
         * Maximum number of sockets to allow per host. Default for Node 0.10 is 5, default for Node 0.12 is Infinity
         */
        maxSockets? : number;

        /**
         * Maximum number of sockets to leave open in a free state. Only relevant if keepAlive is set to true. Default = 256.
         */
        maxFreeSockets? : number;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace http {
    export interface ClientRequest extends stream.Writable {
        write(str? : any, encoding? : any, cb? : any) : any;

        abort();

        setTimeout(timeout? : any, callback? : any) : any;

        setNoDelay(noDelay? : any) : any;

        setSocketKeepAlive(enable? : any, initialDelay? : any) : any;

        setHeader(name? : any, value? : any) : any;

        getHeader(name : string) : string;

        removeHeader(name : string);

        addTrailers(headers : any);

        end(str? : any, encoding? : any, cb? : any) : any;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace http {
    /**
     * @deprecated Use IncomingMessage
     * @extends http.IncomingMessage
     */
    export interface ClientResponse extends http.IncomingMessage {    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace http {
    export var METHODS : string[];

    

    export function createServer(requestListener? : any) : any;

    

    export function createClient(port? : any, host? : any) : any;

    

    export function request(options? : any, callback? : any) : any;

    

    export function get(options? : any, callback? : any) : any;

    export var globalAgent : http.Agent;

}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace http {
    export interface IncomingMessage extends stream.Readable {
        httpVersion : string;

        httpVersionMajor : number;

        httpVersionMinor : number;

        connection : net.Socket;

        headers : any;

        rawHeaders : string[];

        trailers : any;

        rawTrailers : any;

        setTimeout(msecs : number, callback : Function) : NodeJS.Timer;

        /**
         * Only valid for request obtained from http.Server.
         */
        method? : string;

        /**
         * Only valid for request obtained from http.Server.
         */
        url? : string;

        /**
         * Only valid for response obtained from http.ClientRequest.
         */
        statusCode? : number;

        /**
         * Only valid for response obtained from http.ClientRequest.
         */
        statusMessage? : string;

        socket : net.Socket;

        destroy(error? : any) : any;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace http {
    export interface RequestOptions {
        protocol? : string;

        host? : string;

        hostname? : string;

        family? : number;

        port? : number;

        localAddress? : string;

        socketPath? : string;

        method? : string;

        path? : string;

        headers? : any;

        auth? : string;

        agent? : ((http.Agent)|(boolean));

        timeout? : number;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace http {
    export interface Server extends net.Server {
        setTimeout(msecs : number, callback : Function);

        maxHeadersCount : number;

        timeout : number;

        listening : boolean;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace http {
    /**
     * @deprecated Use IncomingMessage
     * @extends http.IncomingMessage
     */
    export interface ServerRequest extends http.IncomingMessage {
        connection : net.Socket;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace http {
    export interface ServerResponse extends stream.Writable {
        write(str? : any, encoding? : any, cb? : any) : any;

        writeContinue();

        writeHead(statusCode? : any, reasonPhrase? : any, headers? : any) : any;

        statusCode : number;

        statusMessage : string;

        headersSent : boolean;

        setHeader(name? : any, value? : any) : any;

        setTimeout(msecs : number, callback : Function) : ServerResponse;

        sendDate : boolean;

        getHeader(name : string) : string;

        removeHeader(name : string);

        addTrailers(headers : any);

        finished : boolean;

        end(str? : any, encoding? : any, cb? : any) : any;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace http {
    /**
     * This is an automatically generated object type (see the source definition).
     * @extends Object
     */
    export class STATUS_CODES {
        

        public static $getStatic(errorCode? : any) : any;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace https {
    export class Agent extends http.Agent {
        public constructor(options? : any);
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace https {
    export interface AgentOptions extends http.AgentOptions {
        pfx? : any;

        key? : any;

        passphrase? : string;

        cert? : any;

        ca? : any;

        ciphers? : string;

        rejectUnauthorized? : boolean;

        secureProtocol? : string;

        maxCachedSessions? : number;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace https {
    

    export function createServer(options? : any, requestListener? : any) : any;

    

    export function request(options? : any, callback? : any) : any;

    

    export function get(options? : any, callback? : any) : any;

    export var globalAgent : https.Agent;

}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace https {
    export interface RequestOptions extends http.RequestOptions {
        pfx? : any;

        key? : any;

        passphrase? : string;

        cert? : any;

        ca? : any;

        ciphers? : string;

        rejectUnauthorized? : boolean;

        secureProtocol? : string;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace https {
    export interface Server extends tls.Server {    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace https {
    export interface ServerOptions {
        pfx? : any;

        key? : any;

        passphrase? : string;

        cert? : any;

        ca? : any;

        crl? : any;

        ciphers? : string;

        honorCipherOrder? : boolean;

        requestCert? : boolean;

        rejectUnauthorized? : boolean;

        NPNProtocols? : any;

        SNICallback? : (p1: string, p2: (p1: Error, p2: tls.SecureContext) => any) => any;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
interface MapConstructor {}

/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace net {
    

    export function createServer(options? : any, connectionListener? : any) : any;

    

    export function connect(port? : any, host? : any, connectionListener? : any) : any;

    

    export function createConnection(port? : any, host? : any, connectionListener? : any) : any;

    export function isIP(input : string) : number;

    export function isIPv4(input : string) : boolean;

    export function isIPv6(input : string) : boolean;

}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace net {
    export interface ListenOptions {
        port? : number;

        host? : string;

        backlog? : number;

        path? : string;

        exclusive? : boolean;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace net {
    export interface Server extends events.EventEmitter {
        listen(port? : any, hostname? : any, backlog? : any, listeningListener? : any) : any;

        close(callback? : any) : any;

        address() : any;

        getConnections(cb : (p1: Error, p2: number) => void);

        ref() : Server;

        unref() : Server;

        maxConnections : number;

        connections : number;

        /**
         * events.EventEmitter
         * 1. close
         * 2. connection
         * 3. error
         * 4. listening
         * @param {string} event
         * @param {Function} listener
         * @return {net.Server}
         */
        addListener(event? : any, listener? : any) : any;

        emit(event? : any, err? : any, address? : any, family? : any, host? : any) : any;

        on(event? : any, listener? : any) : any;

        once(event? : any, listener? : any) : any;

        prependListener(event? : any, listener? : any) : any;

        prependOnceListener(event? : any, listener? : any) : any;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace net {
    export class Socket extends stream.Duplex {
        

        public write(str? : any, encoding? : any, cb? : any) : any;

        

        public connect(port? : any, host? : any, connectionListener? : any) : any;

        public bufferSize : number;

        

        public setEncoding(encoding? : any) : any;

        public destroy();

        

        public setTimeout(timeout? : any, callback? : any) : any;

        

        public setNoDelay(noDelay? : any) : any;

        

        public setKeepAlive(enable? : any, initialDelay? : any) : any;

        public address() : any;

        public unref();

        public ref();

        public remoteAddress : string;

        public remoteFamily : string;

        public remotePort : number;

        public localAddress : string;

        public localPort : number;

        public bytesRead : number;

        public bytesWritten : number;

        public destroyed : boolean;

        

        public end(str? : any, encoding? : any, cb? : any) : any;

        

        /**
         * events.EventEmitter
         * 1. close
         * 2. connect
         * 3. data
         * 4. drain
         * 5. end
         * 6. error
         * 7. lookup
         * 8. timeout
         * @param {string} event
         * @param {Function} listener
         * @return {net.Socket}
         */
        public addListener(event? : any, listener? : any) : any;

        public addListener(event : "lookup", listener : (p1: Error, p2: string, p3: string, p4: string) => void) : Socket;

        

        public emit(event? : any, err? : any, address? : any, family? : any, host? : any) : any;

        

        public on(event? : any, listener? : any) : any;

        public on(event : "lookup", listener : (p1: Error, p2: string, p3: string, p4: string) => void) : Socket;

        

        public once(event? : any, listener? : any) : any;

        public once(event : "lookup", listener : (p1: Error, p2: string, p3: string, p4: string) => void) : Socket;

        

        public prependListener(event? : any, listener? : any) : any;

        public prependListener(event : "lookup", listener : (p1: Error, p2: string, p3: string, p4: string) => void) : Socket;

        

        public prependOnceListener(event? : any, listener? : any) : any;

        public prependOnceListener(event : "lookup", listener : (p1: Error, p2: string, p3: string, p4: string) => void) : Socket;

        public constructor(options? : any);

        public addListener(event : "lookup", listener : (p1: Error, p2: string, p3: number, p4: string) => void) : Socket;

        public on(event : "lookup", listener : (p1: Error, p2: string, p3: number, p4: string) => void) : Socket;

        public once(event : "lookup", listener : (p1: Error, p2: string, p3: number, p4: string) => void) : Socket;

        public prependListener(event : "lookup", listener : (p1: Error, p2: string, p3: number, p4: string) => void) : Socket;

        public prependOnceListener(event : "lookup", listener : (p1: Error, p2: string, p3: number, p4: string) => void) : Socket;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
/**
 * @deprecated
 * @extends Uint8Array
 */
interface NodeBuffer extends Uint8Array {
    write(string? : any, offset? : any, length? : any, encoding? : any) : any;

    toString(encoding? : any, start? : any, end? : any) : any;

    toJSON() : any;

    equals(otherBuffer : Buffer) : boolean;

    compare(otherBuffer? : any, targetStart? : any, targetEnd? : any, sourceStart? : any, sourceEnd? : any) : any;

    copy(targetBuffer? : any, targetStart? : any, sourceStart? : any, sourceEnd? : any) : any;

    slice(start? : any, end? : any) : any;

    writeUIntLE(value? : any, offset? : any, byteLength? : any, noAssert? : any) : any;

    writeUIntBE(value? : any, offset? : any, byteLength? : any, noAssert? : any) : any;

    writeIntLE(value? : any, offset? : any, byteLength? : any, noAssert? : any) : any;

    writeIntBE(value? : any, offset? : any, byteLength? : any, noAssert? : any) : any;

    readUIntLE(offset? : any, byteLength? : any, noAssert? : any) : any;

    readUIntBE(offset? : any, byteLength? : any, noAssert? : any) : any;

    readIntLE(offset? : any, byteLength? : any, noAssert? : any) : any;

    readIntBE(offset? : any, byteLength? : any, noAssert? : any) : any;

    readUInt8(offset? : any, noAssert? : any) : any;

    readUInt16LE(offset? : any, noAssert? : any) : any;

    readUInt16BE(offset? : any, noAssert? : any) : any;

    readUInt32LE(offset? : any, noAssert? : any) : any;

    readUInt32BE(offset? : any, noAssert? : any) : any;

    readInt8(offset? : any, noAssert? : any) : any;

    readInt16LE(offset? : any, noAssert? : any) : any;

    readInt16BE(offset? : any, noAssert? : any) : any;

    readInt32LE(offset? : any, noAssert? : any) : any;

    readInt32BE(offset? : any, noAssert? : any) : any;

    readFloatLE(offset? : any, noAssert? : any) : any;

    readFloatBE(offset? : any, noAssert? : any) : any;

    readDoubleLE(offset? : any, noAssert? : any) : any;

    readDoubleBE(offset? : any, noAssert? : any) : any;

    swap16() : Buffer;

    swap32() : Buffer;

    swap64() : Buffer;

    writeUInt8(value? : any, offset? : any, noAssert? : any) : any;

    writeUInt16LE(value? : any, offset? : any, noAssert? : any) : any;

    writeUInt16BE(value? : any, offset? : any, noAssert? : any) : any;

    writeUInt32LE(value? : any, offset? : any, noAssert? : any) : any;

    writeUInt32BE(value? : any, offset? : any, noAssert? : any) : any;

    writeInt8(value? : any, offset? : any, noAssert? : any) : any;

    writeInt16LE(value? : any, offset? : any, noAssert? : any) : any;

    writeInt16BE(value? : any, offset? : any, noAssert? : any) : any;

    writeInt32LE(value? : any, offset? : any, noAssert? : any) : any;

    writeInt32BE(value? : any, offset? : any, noAssert? : any) : any;

    writeFloatLE(value? : any, offset? : any, noAssert? : any) : any;

    writeFloatBE(value? : any, offset? : any, noAssert? : any) : any;

    writeDoubleLE(value? : any, offset? : any, noAssert? : any) : any;

    writeDoubleBE(value? : any, offset? : any, noAssert? : any) : any;

    fill(value? : any, offset? : any, end? : any) : any;

    indexOf(value? : any, byteOffset? : any, encoding? : any) : any;

    lastIndexOf(value? : any, byteOffset? : any, encoding? : any) : any;

    entries() : IterableIterator<[number,number]>;

    includes(value? : any, byteOffset? : any, encoding? : any) : any;

    keys() : IterableIterator<number>;

    values() : IterableIterator<number>;
}

/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace NodeJS {
    export interface CpuUsage {
        user : number;

        system : number;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace NodeJS {
    export interface Domain extends NodeJS.Events {
        run(fn : Function);

        add(emitter : NodeJS.Events);

        remove(emitter : NodeJS.Events);

        bind(cb : (p1: Error, p2: any) => any) : any;

        intercept(cb : (p1: any) => any) : any;

        dispose();

        addListener(event? : any, listener? : any) : any;

        on(event? : any, listener? : any) : any;

        once(event? : any, listener? : any) : any;

        removeListener(event : string, listener : Function) : Domain;

        removeAllListeners(event? : any) : any;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace NodeJS {
    export interface ErrnoException extends Error {
        errno? : number;

        code? : string;

        path? : string;

        syscall? : string;

        stack? : string;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace NodeJS {
    export class EventEmitter {
        

        public addListener(event? : any, listener? : any) : any;

        

        public on(event? : any, listener? : any) : any;

        

        public once(event? : any, listener? : any) : any;

        

        public removeListener(event? : any, listener? : any) : any;

        

        public removeAllListeners(event? : any) : any;

        public setMaxListeners(n : number) : EventEmitter;

        public getMaxListeners() : number;

        public listeners(event : string) : Function[];

        public emit(event? : any, err? : any, address? : any, family? : any, host? : any) : any;

        

        public listenerCount(type : string) : number;

        

        public prependListener(event? : any, listener? : any) : any;

        

        public prependOnceListener(event? : any, listener? : any) : any;

        public eventNames() : ((string)|(string))[];
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace NodeJS {
    export interface Events extends NodeJS.EventEmitter {    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace NodeJS {
    export interface Global {
        GLOBAL : Global;

        Uint8ClampedArray : any;

        clearImmediate : (p1: any) => void;

        clearInterval : (p1: NodeJS.Timer) => void;

        clearTimeout : (p1: NodeJS.Timer) => void;

        escape : (p1: string) => string;

        global : Global;

        process : NodeJS.Process;

        root : Global;

        setImmediate : (p1: (p1: any) => void, p2: any) => any;

        setInterval : (p1: (p1: any) => void, p2: number, p3: any) => NodeJS.Timer;

        setTimeout : (p1: (p1: any) => void, p2: number, p3: any) => NodeJS.Timer;

        undefined : any;

        unescape : (p1: string) => string;

        gc : () => void;

        v8debug? : any;

        /**
         * Gets the unencoded version of an encoded Uniform Resource Identifier (URI).
         * @param {string} encodedURI A value representing an encoded URI.
         * @return {string}
         */
        decodeURI(encodedURI : string) : string;

        /**
         * Gets the unencoded version of an encoded component of a Uniform Resource Identifier (URI).
         * @param {string} encodedURIComponent A value representing an encoded URI component.
         * @return {string}
         */
        decodeURIComponent(encodedURIComponent : string) : string;

        /**
         * 
         * Encodes a text string as a valid Uniform Resource Identifier (URI)
         * @param {string} uri A value representing an encoded URI.
         * @return {string}
         */
        encodeURI(uri : string) : string;

        /**
         * Encodes a text string as a valid component of a Uniform Resource Identifier (URI).
         * @param {string} uriComponent A value representing an encoded URI component.
         * @return {string}
         */
        encodeURIComponent(uriComponent : string) : string;

        /**
         * Evaluates JavaScript code and executes it.
         * @param {string} x A String value that contains valid JavaScript code.
         * @return {any}
         */
        eval(x : string) : any;

        /**
         * 
         * Determines whether a supplied number is finite.
         * @param {number} number Any numeric value.
         * @return {boolean}
         */
        isFinite(number : number) : boolean;

        /**
         * Returns a Boolean value that indicates whether a value is the reserved value NaN (not a number).
         * @param {number} number A numeric value.
         * @return {boolean}
         */
        isNaN(number : number) : boolean;

        /**
         * Converts a string to a floating-point number.
         * @param {string} string A string that contains a floating-point number.
         * @return {number}
         */
        parseFloat(string : string) : number;

        /**
         * Converts A string to an integer.
         * @param {string} s A string to convert into a number.
         * @param {number} radix A value between 2 and 36 that specifies the base of the number in numString.
         * If this argument is not supplied, strings with a prefix of '0x' are considered hexadecimal.
         * All other strings are considered decimal.
         * @return {number}
         */
        parseInt(s? : any, radix? : any) : any;

        Promise(...args : any[]) : any;

        Symbol(...args : any[]) : any;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace NodeJS {
    export var Console : any;

}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace NodeJS {
    export interface MemoryUsage {
        rss : number;

        heapTotal : number;

        heapUsed : number;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace NodeJS {
    export interface Process extends NodeJS.EventEmitter {
        stdout : NodeJS.WritableStream;

        stderr : NodeJS.WritableStream;

        stdin : NodeJS.ReadableStream;

        argv : string[];

        argv0 : string;

        execArgv : string[];

        execPath : string;

        abort();

        chdir(directory : string);

        cwd() : string;

        env : any;

        exit(code? : any) : any;

        exitCode : number;

        getgid() : number;

        setgid(id? : any) : any;

        getuid() : number;

        setuid(id? : any) : any;

        version : string;

        versions : NodeJS.ProcessVersions;

        config : any;

        kill(pid? : any, signal? : any) : any;

        pid : number;

        title : string;

        arch : string;

        platform : any;

        mainModule? : NodeModule;

        memoryUsage() : NodeJS.MemoryUsage;

        cpuUsage(previousValue? : any) : any;

        nextTick(callback : Function, ...args : any[]);

        umask(mask? : any) : any;

        uptime() : number;

        hrtime(time? : any) : any;

        domain : NodeJS.Domain;

        send(message? : any, sendHandle? : any) : any;

        disconnect();

        connected : boolean;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace NodeJS {
    export interface ProcessVersions {
        http_parser : string;

        node : string;

        v8 : string;

        ares : string;

        uv : string;

        zlib : string;

        modules : string;

        openssl : string;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace NodeJS {
    export interface ReadableStream extends NodeJS.EventEmitter {
        readable : boolean;

        isTTY? : boolean;

        read(size? : any) : any;

        setEncoding(encoding? : any) : any;

        pause() : ReadableStream;

        resume() : ReadableStream;

        isPaused() : boolean;

        pipe<T extends NodeJS.WritableStream>(destination? : any, options? : any) : any;

        unpipe<T extends NodeJS.WritableStream>(destination? : any) : any;

        unshift(chunk? : any) : any;

        wrap(oldStream : ReadableStream) : ReadableStream;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace NodeJS {
    export interface ReadWriteStream extends NodeJS.ReadableStream {
        pause() : ReadWriteStream;

        resume() : ReadWriteStream;

        writable : boolean;

        isTTY? : boolean;

        write(str? : any, encoding? : any, cb? : any) : any;

        end(str? : any, encoding? : any, cb? : any) : any;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace NodeJS {
    export interface Timer {
        ref();

        unref();
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace NodeJS {
    export interface WritableStream extends NodeJS.EventEmitter {
        writable : boolean;

        isTTY? : boolean;

        write(str? : any, encoding? : any, cb? : any) : any;

        end(str? : any, encoding? : any, cb? : any) : any;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
interface NodeModule {
    exports : any;

    require : any;

    id : string;

    filename : string;

    loaded : boolean;

    parent : NodeModule;

    children : NodeModule[];
}

/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
interface NodeRequire extends NodeRequireFunction {
    resolve(id : string) : string;

    cache : any;

    extensions : any;

    main : NodeModule;
}

/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
interface NodeRequireFunction {
    (id : string) : any;
}

/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace os {
    export interface CpuInfo {
        model : string;

        speed : number;

        times : any;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace os {
    export function hostname() : string;

    export function loadavg() : number[];

    export function uptime() : number;

    export function freemem() : number;

    export function totalmem() : number;

    export function cpus() : os.CpuInfo[];

    export function type() : string;

    export function release() : string;

    export function networkInterfaces() : any;

    export function homedir() : string;

    

    export function userInfo(options? : any) : any;

    export var constants : any;

    export function arch() : string;

    export function platform() : any;

    export function tmpdir() : string;

    export var EOL : string;

    export function endianness() : (("BE")|("LE"));

}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace os {
    export interface NetworkInterfaceInfo {
        address : string;

        netmask : string;

        family : string;

        mac : string;

        internal : boolean;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace path {
    /**
     * Normalize a string path, reducing '..' and '.' parts.
     * When multiple slashes are found, they're replaced by a single one; when the path contains a trailing slash, it is preserved. On Windows backslashes are used.
     * 
     * @param {string} p string path to normalize.
     * @return {string}
     */
    export function normalize(p : string) : string;

    /**
     * Join all arguments together and normalize the resulting path.
     * Arguments must be strings. In v0.8, non-string arguments were silently ignored. In v0.10 and up, an exception is thrown.
     * 
     * @param {Array} paths paths to join.
     * @return {string}
     */
    export function join(...paths : string[]) : string;

    /**
     * The right-most parameter is considered {to}.  Other parameters are considered an array of {from}.
     * 
     * Starting from leftmost {from} paramter, resolves {to} to an absolute path.
     * 
     * If {to} isn't already absolute, {from} arguments are prepended in right to left order, until an absolute path is found. If after using all {from} paths still no absolute path is found, the current working directory is used as well. The resulting path is normalized, and trailing slashes are removed unless the path gets resolved to the root directory.
     * 
     * @param {Array} pathSegments string paths to join.  Non-string arguments are ignored.
     * @return {string}
     */
    export function resolve(...pathSegments : any[]) : string;

    /**
     * Determines whether {path} is an absolute path. An absolute path will always resolve to the same location, regardless of the working directory.
     * 
     * @param {string} path path to test.
     * @return {boolean}
     */
    export function isAbsolute(path : string) : boolean;

    /**
     * Solve the relative path from {from} to {to}.
     * At times we have two absolute paths, and we need to derive the relative path from one to the other. This is actually the reverse transform of path.resolve.
     * 
     * @param {string} from
     * @param {string} to
     * @return {string}
     */
    export function relative(from : string, to : string) : string;

    /**
     * Return the directory name of a path. Similar to the Unix dirname command.
     * 
     * @param {string} p the path to evaluate.
     * @return {string}
     */
    export function dirname(p : string) : string;

    

    /**
     * Return the last portion of a path. Similar to the Unix basename command.
     * Often used to extract the file name from a fully qualified path.
     * 
     * @param {string} p the path to evaluate.
     * @param {string} ext optionally, an extension to remove from the result.
     * @return {string}
     */
    export function basename(p? : any, ext? : any) : any;

    /**
     * Return the extension of the path, from the last '.' to end of string in the last portion of the path.
     * If there is no '.' in the last portion of the path or the first character of it is '.', then it returns an empty string
     * 
     * @param {string} p the path to evaluate.
     * @return {string}
     */
    export function extname(p : string) : string;

    /**
     * The platform-specific file separator. '\\' or '/'.
     */
    export var sep : string;

    /**
     * The platform-specific file delimiter. ';' or ':'.
     */
    export var delimiter : string;

    /**
     * Returns an object from a path string - the opposite of format().
     * 
     * @param {string} pathString path to evaluate.
     * @return {path.ParsedPath}
     */
    export function parse(pathString : string) : path.ParsedPath;

    /**
     * Returns a path string from an object - the opposite of parse().
     * 
     * @param pathString path to evaluate.
     * @param {path.ParsedPath} pathObject
     * @return {string}
     */
    export function format(pathObject : path.ParsedPath) : string;

}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace path {
    /**
     * A parsed path object generated by path.parse() or consumed by path.format().
     * @extends Object
     */
    export interface ParsedPath {
        /**
         * The root of the path such as '/' or 'c:\'
         */
        root : string;

        /**
         * The full directory path such as '/home/user/dir' or 'c:\path\dir'
         */
        dir : string;

        /**
         * The file name including extension (if any) such as 'index.html'
         */
        base : string;

        /**
         * The file extension (if any) such as '.html'
         */
        ext : string;

        /**
         * The file name without extension (if any) such as 'index'
         */
        name : string;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace path.posix {
    export function normalize(p : string) : string;

    export function join(...paths : any[]) : string;

    export function resolve(...pathSegments : any[]) : string;

    export function isAbsolute(p : string) : boolean;

    export function relative(from : string, to : string) : string;

    export function dirname(p : string) : string;

    

    export function basename(p? : any, ext? : any) : any;

    export function extname(p : string) : string;

    export var sep : string;

    export var delimiter : string;

    export function parse(p : string) : path.ParsedPath;

    export function format(pP : path.ParsedPath) : string;

}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace path.win32 {
    export function normalize(p : string) : string;

    export function join(...paths : any[]) : string;

    export function resolve(...pathSegments : any[]) : string;

    export function isAbsolute(p : string) : boolean;

    export function relative(from : string, to : string) : string;

    export function dirname(p : string) : string;

    

    export function basename(p? : any, ext? : any) : any;

    export function extname(p : string) : string;

    export var sep : string;

    export var delimiter : string;

    export function parse(p : string) : path.ParsedPath;

    export function format(pP : path.ParsedPath) : string;

}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace punycode {
    export function decode(string : string) : string;

    export function encode(string : string) : string;

    export function toUnicode(domain : string) : string;

    export function toASCII(domain : string) : string;

    export var version : any;

}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace punycode {
    export interface ucs2 {    }

    export namespace ucs2 {

        export function decode(string : string) : number[];

        export function encode(codePoints : number[]) : string;
    }

}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace querystring {
    

    export function stringify<T>(obj? : any, sep? : any, eq? : any, options? : any) : any;

    

    export function parse<T extends any>(str? : any, sep? : any, eq? : any, options? : any) : any;

    export function escape(str : string) : string;

    export function unescape(str : string) : string;

}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace querystring {
    export interface ParseOptions {
        maxKeys? : number;

        decodeURIComponent? : any;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace querystring {
    export interface StringifyOptions {
        encodeURIComponent? : any;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace readline {
    export interface Completer {
        (line? : any, callback? : any) : any;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace readline {
    

    export function createInterface(input? : any, output? : any, completer? : any, terminal? : any) : any;

    export function cursorTo(stream : NodeJS.WritableStream, x : number, y : number);

    export function clearLine(stream : NodeJS.WritableStream, dir : number);

    export function clearScreenDown(stream : NodeJS.WritableStream);

    

    export function moveCursor(stream? : any, dx? : any, dy? : any) : any;

}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace readline {
    export interface Key {
        sequence? : string;

        name? : string;

        ctrl? : boolean;

        meta? : boolean;

        shift? : boolean;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace readline {
    export interface ReadLine extends events.EventEmitter {
        setPrompt(prompt : string);

        prompt(preserveCursor? : any) : any;

        question(query : string, callback : (p1: string) => void);

        pause() : ReadLine;

        resume() : ReadLine;

        close();

        write(data? : any, key? : any) : any;

        addListener(event? : any, listener? : any) : any;

        emit(event? : any, err? : any, address? : any, family? : any, host? : any) : any;

        on(event? : any, listener? : any) : any;

        once(event? : any, listener? : any) : any;

        prependListener(event? : any, listener? : any) : any;

        prependOnceListener(event? : any, listener? : any) : any;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace readline {
    export interface ReadLineOptions {
        input : NodeJS.ReadableStream;

        output? : NodeJS.WritableStream;

        completer? : any;

        terminal? : boolean;

        historySize? : number;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace repl {
    export function start(options : repl.ReplOptions) : repl.REPLServer;

}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace repl {
    export interface ReplOptions {
        prompt? : string;

        input? : NodeJS.ReadableStream;

        output? : NodeJS.WritableStream;

        terminal? : boolean;

        eval? : any;

        useColors? : boolean;

        useGlobal? : boolean;

        ignoreUndefined? : boolean;

        writer? : any;

        completer? : any;

        replMode? : any;

        breakEvalOnSigint? : any;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace repl {
    export interface REPLServer extends readline.ReadLine {
        defineCommand(keyword? : any, cmd? : any) : any;

        displayPrompt(preserveCursor? : any) : any;

        addListener(event? : any, listener? : any) : any;

        emit(event? : any, err? : any, address? : any, family? : any, host? : any) : any;

        on(event? : any, listener? : any) : any;

        once(event? : any, listener? : any) : any;

        prependListener(event? : any, listener? : any) : any;

        prependOnceListener(event? : any, listener? : any) : any;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
interface SetConstructor {}

/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace stream {
    export class Duplex extends stream.Readable {
        public writable : boolean;

        public constructor(opts? : any);

        public _write(chunk : any, encoding : string, callback : Function);

        public pause() : NodeJS.ReadWriteStream;

        public resume() : NodeJS.ReadWriteStream;

        public isTTY : boolean;

        

        public write(str? : any, encoding? : any, cb? : any) : any;

        

        public end(str? : any, encoding? : any, cb? : any) : any;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace stream {
    export interface DuplexOptions extends stream.ReadableOptions {
        allowHalfOpen? : boolean;

        readableObjectMode? : boolean;

        writableObjectMode? : boolean;

        highWaterMark? : number;

        decodeStrings? : boolean;

        objectMode? : boolean;

        write? : (p1: ((string)|(Buffer)), p2: string, p3: Function) => any;

        writev? : (p1: any[], p2: Function) => any;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace stream {
    export class internal extends events.EventEmitter {
        

        public pipe<T extends NodeJS.WritableStream>(destination? : any, options? : any) : any;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace stream {
    export class PassThrough extends stream.Transform {    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace stream {
    export class Readable extends events.EventEmitter {
        public readable : boolean;

        public constructor(opts? : any);

        public _read(size : number);

        

        public pipe<T extends NodeJS.WritableStream>(destination? : any, options? : any) : any;

        

        public push(chunk? : any, encoding? : any) : any;

        

        public addListener(event? : any, listener? : any) : any;

        public addListener(event : "data", listener : (p1: Buffer) => void) : Readable;

        public emit(event? : any, err? : any, address? : any, family? : any, host? : any) : any;

        

        

        public on(event? : any, listener? : any) : any;

        public on(event : "data", listener : (p1: Buffer) => void) : Readable;

        

        public once(event? : any, listener? : any) : any;

        public once(event : "data", listener : (p1: Buffer) => void) : Readable;

        

        public prependListener(event? : any, listener? : any) : any;

        public prependListener(event : "data", listener : (p1: Buffer) => void) : Readable;

        

        public prependOnceListener(event? : any, listener? : any) : any;

        public prependOnceListener(event : "data", listener : (p1: Buffer) => void) : Readable;

        

        public removeListener(event? : any, listener? : any) : any;

        public removeListener(event : "data", listener : (p1: Buffer) => void) : Readable;

        public isTTY : boolean;

        

        public read(size? : any) : any;

        

        public setEncoding(encoding? : any) : any;

        public pause() : NodeJS.ReadableStream;

        public resume() : NodeJS.ReadableStream;

        public isPaused() : boolean;

        

        public unpipe<T extends NodeJS.WritableStream>(destination? : any) : any;

        

        public unshift(chunk? : any) : any;

        public wrap(oldStream : NodeJS.ReadableStream) : NodeJS.ReadableStream;

        public addListener(event : "data", listener : (p1: string) => void) : Readable;

        public on(event : "data", listener : (p1: string) => void) : Readable;

        public once(event : "data", listener : (p1: string) => void) : Readable;

        public prependListener(event : "data", listener : (p1: string) => void) : Readable;

        public prependOnceListener(event : "data", listener : (p1: string) => void) : Readable;

        public removeListener(event : "data", listener : (p1: string) => void) : Readable;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace stream {
    export interface ReadableOptions {
        highWaterMark? : number;

        encoding? : string;

        objectMode? : boolean;

        read? : (p1: number) => any;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace stream {
    export class Stream extends stream.internal {    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace stream {
    export class Transform extends events.EventEmitter {
        public readable : boolean;

        public writable : boolean;

        public constructor(opts? : any);

        public _transform(chunk : any, encoding : string, callback : Function);

        public _flush(callback : Function);

        

        public read(size? : any) : any;

        public setEncoding(encoding : string);

        public isPaused() : boolean;

        

        public pipe<T extends NodeJS.WritableStream>(destination? : any, options? : any) : any;

        

        public unpipe<T extends NodeJS.WritableStream>(destination? : any) : any;

        public unshift(chunk : any);

        public wrap(oldStream : NodeJS.ReadableStream) : NodeJS.ReadableStream;

        

        public push(chunk? : any, encoding? : any) : any;

        public pause() : NodeJS.ReadWriteStream;

        public resume() : NodeJS.ReadWriteStream;

        public isTTY : boolean;

        

        public write(str? : any, encoding? : any, cb? : any) : any;

        

        public end(str? : any, encoding? : any, cb? : any) : any;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace stream {
    export interface TransformOptions extends stream.DuplexOptions {
        transform? : (p1: ((string)|(Buffer)), p2: string, p3: Function) => any;

        flush? : (p1: Function) => any;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace stream {
    export class Writable extends events.EventEmitter {
        public writable : boolean;

        public constructor(opts? : any);

        public _write(chunk : any, encoding : string, callback : Function);

        

        public addListener(event? : any, listener? : any) : any;

        public emit(event? : any, err? : any, address? : any, family? : any, host? : any) : any;

        

        

        public on(event? : any, listener? : any) : any;

        

        public once(event? : any, listener? : any) : any;

        

        public prependListener(event? : any, listener? : any) : any;

        

        public prependOnceListener(event? : any, listener? : any) : any;

        

        public removeListener(event? : any, listener? : any) : any;

        public isTTY : boolean;

        

        public write(str? : any, encoding? : any, cb? : any) : any;

        

        public end(str? : any, encoding? : any, cb? : any) : any;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace stream {
    export interface WritableOptions {
        highWaterMark? : number;

        decodeStrings? : boolean;

        objectMode? : boolean;

        write? : (p1: ((string)|(Buffer)), p2: string, p3: Function) => any;

        writev? : (p1: any[], p2: Function) => any;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
interface StringTypes {}

declare namespace StringTypes {

    /**
     * Generated to type the string "Buffer".
     * @exclude
     */
    export interface Buffer {    }

    /**
     * Generated to type the string "udp4".
     * @exclude
     */
    export interface udp4 {    }

    /**
     * Generated to type the string "udp6".
     * @exclude
     */
    export interface udp6 {    }

    /**
     * Generated to type the string "disconnect".
     * @exclude
     */
    export interface disconnect {    }

    /**
     * Generated to type the string "error".
     * @exclude
     */
    export interface error {    }

    /**
     * Generated to type the string "exit".
     * @exclude
     */
    export interface exit {    }

    /**
     * Generated to type the string "listening".
     * @exclude
     */
    export interface listening {    }

    /**
     * Generated to type the string "message".
     * @exclude
     */
    export interface message {    }

    /**
     * Generated to type the string "online".
     * @exclude
     */
    export interface online {    }

    /**
     * Generated to type the string "fork".
     * @exclude
     */
    export interface fork {    }

    /**
     * Generated to type the string "setup".
     * @exclude
     */
    export interface setup {    }

    /**
     * Generated to type the string "BE".
     * @exclude
     */
    export interface BE {    }

    /**
     * Generated to type the string "LE".
     * @exclude
     */
    export interface LE {    }

    /**
     * Generated to type the string "reset".
     * @exclude
     */
    export interface reset {    }

    /**
     * Generated to type the string "close".
     * @exclude
     */
    export interface close {    }

    /**
     * Generated to type the string "line".
     * @exclude
     */
    export interface line {    }

    /**
     * Generated to type the string "pause".
     * @exclude
     */
    export interface pause {    }

    /**
     * Generated to type the string "resume".
     * @exclude
     */
    export interface resume {    }

    /**
     * Generated to type the string "SIGCONT".
     * @exclude
     */
    export interface SIGCONT {    }

    /**
     * Generated to type the string "SIGINT".
     * @exclude
     */
    export interface SIGINT {    }

    /**
     * Generated to type the string "SIGTSTP".
     * @exclude
     */
    export interface SIGTSTP {    }

    /**
     * Generated to type the string "disconnet".
     * @exclude
     */
    export interface disconnet {    }

    /**
     * Generated to type the string "connect".
     * @exclude
     */
    export interface connect {    }

    /**
     * Generated to type the string "data".
     * @exclude
     */
    export interface data {    }

    /**
     * Generated to type the string "drain".
     * @exclude
     */
    export interface drain {    }

    /**
     * Generated to type the string "lookup".
     * @exclude
     */
    export interface lookup {    }

    /**
     * Generated to type the string "timeout".
     * @exclude
     */
    export interface timeout {    }

    /**
     * Generated to type the string "connection".
     * @exclude
     */
    export interface connection {    }

    /**
     * Generated to type the string "change".
     * @exclude
     */
    export interface change {    }

    /**
     * Generated to type the string "open".
     * @exclude
     */
    export interface open {    }

    /**
     * Generated to type the string "OCSPResponse".
     * @exclude
     */
    export interface OCSPResponse {    }

    /**
     * Generated to type the string "secureConnect".
     * @exclude
     */
    export interface secureConnect {    }

    /**
     * Generated to type the string "tlsClientError".
     * @exclude
     */
    export interface tlsClientError {    }

    /**
     * Generated to type the string "newSession".
     * @exclude
     */
    export interface newSession {    }

    /**
     * Generated to type the string "OCSPRequest".
     * @exclude
     */
    export interface OCSPRequest {    }

    /**
     * Generated to type the string "resumeSession".
     * @exclude
     */
    export interface resumeSession {    }

    /**
     * Generated to type the string "secureConnection".
     * @exclude
     */
    export interface secureConnection {    }

    /**
     * Generated to type the string "utf8".
     * @exclude
     */
    export interface utf8 {    }

    /**
     * Generated to type the string "ascii".
     * @exclude
     */
    export interface ascii {    }

    /**
     * Generated to type the string "latin1".
     * @exclude
     */
    export interface latin1 {    }

    /**
     * Generated to type the string "hex".
     * @exclude
     */
    export interface hex {    }

    /**
     * Generated to type the string "base64".
     * @exclude
     */
    export interface base64 {    }

    /**
     * Generated to type the string "binary".
     * @exclude
     */
    export interface binary {    }

    /**
     * Generated to type the string "compressed".
     * @exclude
     */
    export interface compressed {    }

    /**
     * Generated to type the string "uncompressed".
     * @exclude
     */
    export interface uncompressed {    }

    /**
     * Generated to type the string "hybrid".
     * @exclude
     */
    export interface hybrid {    }

    /**
     * Generated to type the string "end".
     * @exclude
     */
    export interface end {    }

    /**
     * Generated to type the string "readable".
     * @exclude
     */
    export interface readable {    }

    /**
     * Generated to type the string "finish".
     * @exclude
     */
    export interface finish {    }

    /**
     * Generated to type the string "pipe".
     * @exclude
     */
    export interface pipe {    }

    /**
     * Generated to type the string "unpipe".
     * @exclude
     */
    export interface unpipe {    }
}


/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace string_decoder {
    export var StringDecoder : any;

}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace string_decoder {
    export interface NodeStringDecoder {
        write(buffer : Buffer) : string;

        end(buffer? : any) : any;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace timers {
    export function setTimeout(callback : (p1: any) => void, ms : number, ...args : any[]) : NodeJS.Timer;

    export function clearTimeout(timeoutId : NodeJS.Timer);

    export function setInterval(callback : (p1: any) => void, ms : number, ...args : any[]) : NodeJS.Timer;

    export function clearInterval(intervalId : NodeJS.Timer);

    export function setImmediate(callback : (p1: any) => void, ...args : any[]) : any;

    export function clearImmediate(immediateId : any);

}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace tls {
    export interface Certificate {
        /**
         * Country code.
         */
        C : string;

        /**
         * Street.
         */
        ST : string;

        /**
         * Locality.
         */
        L : string;

        /**
         * Organization.
         */
        O : string;

        /**
         * Organizational unit.
         */
        OU : string;

        /**
         * Common name.
         */
        CN : string;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace tls {
    export interface CipherNameAndProtocol {
        /**
         * The cipher name.
         */
        name : string;

        /**
         * SSL/TLS protocol version.
         */
        version : string;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace tls {
    export interface ClearTextStream extends stream.Duplex {
        authorized : boolean;

        authorizationError : Error;

        getPeerCertificate() : any;

        getCipher : any;

        address : any;

        remoteAddress : string;

        remotePort : number;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace tls {
    export interface ConnectionOptions {
        host? : string;

        port? : number;

        socket? : net.Socket;

        pfx? : ((string)|(Buffer));

        key? : any;

        passphrase? : string;

        cert? : any;

        ca? : ((string)|(Buffer)|(((string)|(Buffer))[]));

        rejectUnauthorized? : boolean;

        NPNProtocols? : ((string)|(Buffer))[];

        servername? : string;

        path? : string;

        ALPNProtocols? : ((string)|(Buffer))[];

        checkServerIdentity? : (p1: string, p2: ((string)|(Buffer)|(((string)|(Buffer))[]))) => any;

        secureProtocol? : string;

        secureContext? : any;

        session? : Buffer;

        minDHSize? : number;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace tls {
    export var CLIENT_RENEG_LIMIT : number;

    export var CLIENT_RENEG_WINDOW : number;

    

    export function createServer(options? : any, secureConnectionListener? : any) : any;

    

    export function connect(port? : any, host? : any, options? : any, secureConnectListener? : any) : any;

    

    export function createSecurePair(credentials? : any, isServer? : any, requestCert? : any, rejectUnauthorized? : any) : any;

    export function createSecureContext(details : tls.SecureContextOptions) : tls.SecureContext;

}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace tls {
    export interface SecureContext {
        context : any;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace tls {
    export interface SecureContextOptions {
        pfx? : ((string)|(Buffer));

        key? : ((string)|(Buffer));

        passphrase? : string;

        cert? : ((string)|(Buffer));

        ca? : ((string)|(Buffer));

        crl? : ((string)|(string[]));

        ciphers? : string;

        honorCipherOrder? : boolean;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace tls {
    export interface SecurePair {
        encrypted : any;

        cleartext : any;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace tls {
    export interface Server extends net.Server {
        close(callback? : any) : any;

        address() : any;

        addContext(hostName : string, credentials : any);

        maxConnections : number;

        connections : number;

        addListener(event? : any, listener? : any) : any;

        emit(event? : any, err? : any, address? : any, family? : any, host? : any) : any;

        on(event? : any, listener? : any) : any;

        once(event? : any, listener? : any) : any;

        prependListener(event? : any, listener? : any) : any;

        prependOnceListener(event? : any, listener? : any) : any;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace tls {
    export interface TlsOptions {
        host? : string;

        port? : number;

        pfx? : ((string)|(Buffer[]));

        key? : any;

        passphrase? : string;

        cert? : any;

        ca? : any;

        crl? : ((string)|(string[]));

        ciphers? : string;

        honorCipherOrder? : boolean;

        requestCert? : boolean;

        rejectUnauthorized? : boolean;

        NPNProtocols? : ((string[])|(Buffer));

        SNICallback? : (p1: string, p2: (p1: Error, p2: tls.SecureContext) => any) => any;

        ecdhCurve? : string;

        dhparam? : ((string)|(Buffer));

        handshakeTimeout? : number;

        ALPNProtocols? : ((string[])|(Buffer));

        sessionTimeout? : number;

        ticketKeys? : any;

        sessionIdContext? : string;

        secureProtocol? : string;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace tls {
    export class TLSSocket extends stream.Duplex {
        /**
         * Construct a new tls.TLSSocket object from an existing TCP socket.
         * @param {net.Socket} socket
         * @param {tls.TLSSocket.Options} options
         * @constructor
         */
        public constructor(socket? : any, options? : any);

        /**
         * Returns the bound address, the address family name and port of the underlying socket as reported by
         * the operating system.
         * @returns {any} - An object with three properties, e.g. { port: 12346, family: 'IPv4', address: '127.0.0.1' }.
         * @return {tls.TLSSocket.Address}
         */
        public address() : any;

        /**
         * A boolean that is true if the peer certificate was signed by one of the specified CAs, otherwise false.
         */
        public authorized : boolean;

        /**
         * The reason why the peer's certificate has not been verified.
         * This property becomes available only when tlsSocket.authorized === false.
         */
        public authorizationError : Error;

        /**
         * Static boolean value, always true.
         * May be used to distinguish TLS sockets from regular ones.
         */
        public encrypted : boolean;

        /**
         * Returns an object representing the cipher name and the SSL/TLS protocol version of the current connection.
         * @returns {CipherNameAndProtocol} - Returns an object representing the cipher name
         * and the SSL/TLS protocol version of the current connection.
         * @return {tls.CipherNameAndProtocol}
         */
        public getCipher() : tls.CipherNameAndProtocol;

        

        /**
         * Returns an object representing the peer's certificate.
         * The returned object has some properties corresponding to the field of the certificate.
         * If detailed argument is true the full chain with issuer property will be returned,
         * if false only the top certificate without issuer property.
         * If the peer does not provide a certificate, it returns null or an empty object.
         * @param {boolean} detailed - If true; the full chain with issuer property will be returned.
         * @returns {any} - An object representing the peer's certificate.
         * @param {boolean} detailed
         * @return {tls.TLSSocket.GetPeerCertificate}
         */
        public getPeerCertificate(detailed? : any) : any;

        /**
         * Could be used to speed up handshake establishment when reconnecting to the server.
         * @returns {any} - ASN.1 encoded TLS session or undefined if none was negotiated.
         * @return {any}
         */
        public getSession() : any;

        /**
         * NOTE: Works only with client TLS sockets.
         * Useful only for debugging, for session reuse provide session option to tls.connect().
         * @returns {any} - TLS session ticket or undefined if none was negotiated.
         * @return {any}
         */
        public getTLSTicket() : any;

        /**
         * The string representation of the local IP address.
         */
        public localAddress : string;

        /**
         * The numeric representation of the local port.
         */
        public localPort : string;

        /**
         * The string representation of the remote IP address.
         * For example, '74.125.127.100' or '2001:4860:a005::68'.
         */
        public remoteAddress : string;

        /**
         * The string representation of the remote IP family. 'IPv4' or 'IPv6'.
         */
        public remoteFamily : string;

        /**
         * The numeric representation of the remote port. For example, 443.
         */
        public remotePort : number;

        /**
         * Initiate TLS renegotiation process.
         * 
         * NOTE: Can be used to request peer's certificate after the secure connection has been established.
         * ANOTHER NOTE: When running as the server, socket will be destroyed with an error after handshakeTimeout timeout.
         * @param {TlsOptions} options - The options may contain the following fields: rejectUnauthorized,
         * requestCert (See tls.createServer() for details).
         * @param {Function} callback - callback(err) will be executed with null as err, once the renegotiation
         * is successfully completed.
         * @param {tls.TlsOptions} options
         * @param {java.util.function.Function} callback
         * @return {any}
         */
        public renegotiate(options : tls.TlsOptions, callback : (p1: Error) => any) : any;

        /**
         * Set maximum TLS fragment size (default and maximum value is: 16384, minimum is: 512).
         * Smaller fragment size decreases buffering latency on the client: large fragments are buffered by
         * the TLS layer until the entire fragment is received and its integrity is verified;
         * large fragments can span multiple roundtrips, and their processing can be delayed due to packet
         * loss or reordering. However, smaller fragments add extra TLS framing bytes and CPU overhead,
         * which may decrease overall server throughput.
         * @param {number} size - TLS fragment size (default and maximum value is: 16384, minimum is: 512).
         * @returns {boolean} - Returns true on success, false otherwise.
         * @param {number} size
         * @return {boolean}
         */
        public setMaxSendFragment(size : number) : boolean;

        

        public addListener(event? : any, listener? : any) : any;

        public emit(event? : any, err? : any, address? : any, family? : any, host? : any) : any;

        

        

        public on(event? : any, listener? : any) : any;

        

        public once(event? : any, listener? : any) : any;

        

        public prependListener(event? : any, listener? : any) : any;

        

        public prependOnceListener(event? : any, listener? : any) : any;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace tty {
    export function isatty(fd : number) : boolean;

}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace tty {
    export interface ReadStream extends net.Socket {
        isRaw : boolean;

        setRawMode(mode : boolean);

        isTTY : boolean;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace tty {
    export interface WriteStream extends net.Socket {
        columns : number;

        rows : number;

        isTTY : boolean;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace url {
    

    export function parse(urlStr? : any, parseQueryString? : any, slashesDenoteHost? : any) : any;

    export function format(url : url.Url) : string;

    export function resolve(from : string, to : string) : string;

}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace url {
    export interface Url {
        href? : string;

        protocol? : string;

        auth? : string;

        hostname? : string;

        port? : string;

        host? : string;

        pathname? : string;

        search? : string;

        query? : ((string)|(any));

        slashes? : boolean;

        hash? : string;

        path? : string;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace util {
    export function format(format : any, ...param : any[]) : string;

    export function debug(string : string);

    export function error(...param : any[]);

    export function puts(...param : any[]);

    export function print(...param : any[]);

    export function log(string : string);

    

    export function inspect(object? : any, showHidden? : any, depth? : any, color? : any) : any;

    export function isArray(object : any) : boolean;

    export function isRegExp(object : any) : boolean;

    export function isDate(object : any) : boolean;

    export function isError(object : any) : boolean;

    export function inherits(constructor : any, superConstructor : any);

    export function debuglog(key : string) : (p1: string, p2: any) => void;

    export function isBoolean(object : any) : boolean;

    export function isBuffer(object : any) : boolean;

    export function isFunction(object : any) : boolean;

    export function isNull(object : any) : boolean;

    export function isNullOrUndefined(object : any) : boolean;

    export function isNumber(object : any) : boolean;

    export function isObject(object : any) : boolean;

    export function isPrimitive(object : any) : boolean;

    export function isString(object : any) : boolean;

    export function isSymbol(object : any) : boolean;

    export function isUndefined(object : any) : boolean;

    export function deprecate(fn : Function, message : string) : Function;

}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace util {
    export interface InspectOptions {
        showHidden? : boolean;

        depth? : number;

        colors? : boolean;

        customInspect? : boolean;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace v8 {
    export function getHeapStatistics() : v8.HeapInfo;

    export function getHeapSpaceStatistics() : v8.HeapSpaceInfo[];

    export function setFlagsFromString(flags : string);

}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace v8 {
    export interface HeapInfo {
        total_heap_size : number;

        total_heap_size_executable : number;

        total_physical_size : number;

        total_available_size : number;

        used_heap_size : number;

        heap_size_limit : number;

        malloced_memory : number;

        peak_malloced_memory : number;

        /**
         * 0 or 1
         */
        does_zap_garbage : number;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace v8 {
    export interface HeapSpaceInfo {
        space_name : string;

        space_size : number;

        space_used_size : number;

        space_available_size : number;

        physical_space_size : number;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace vm {
    export interface Context {    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace vm {
    

    export function createContext(sandbox? : any) : any;

    export function isContext(sandbox : vm.Context) : boolean;

    

    export function runInContext(code? : any, contextifiedSandbox? : any, options? : any) : any;

    export function runInDebugContext(code : string) : any;

    

    export function runInNewContext(code? : any, sandbox? : any, options? : any) : any;

    

    export function runInThisContext(code? : any, options? : any) : any;

}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace vm {
    export interface RunningScriptOptions {
        filename? : string;

        lineOffset? : number;

        columnOffset? : number;

        displayErrors? : boolean;

        timeout? : number;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace vm {
    export class Script {
        public constructor(code? : any, options? : any);

        

        public runInContext(contextifiedSandbox? : any, options? : any) : any;

        

        public runInNewContext(sandbox? : any, options? : any) : any;

        

        public runInThisContext(options? : any) : any;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace vm {
    export interface ScriptOptions {
        filename? : string;

        lineOffset? : number;

        columnOffset? : number;

        displayErrors? : boolean;

        timeout? : number;

        cachedData? : Buffer;

        produceCachedData? : boolean;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
interface WeakMapConstructor {}

/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
interface WeakSetConstructor {}

/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace zlib.constants {
    export var Z_NO_FLUSH : number = 0;

    export var Z_PARTIAL_FLUSH : number = 0;

    export var Z_SYNC_FLUSH : number = 0;

    export var Z_FULL_FLUSH : number = 0;

    export var Z_FINISH : number = 0;

    export var Z_BLOCK : number = 0;

    export var Z_TREES : number = 0;

    export var Z_OK : number = 0;

    export var Z_STREAM_END : number = 0;

    export var Z_NEED_DICT : number = 0;

    export var Z_ERRNO : number = 0;

    export var Z_STREAM_ERROR : number = 0;

    export var Z_DATA_ERROR : number = 0;

    export var Z_MEM_ERROR : number = 0;

    export var Z_BUF_ERROR : number = 0;

    export var Z_VERSION_ERROR : number = 0;

    export var Z_NO_COMPRESSION : number = 0;

    export var Z_BEST_SPEED : number = 0;

    export var Z_BEST_COMPRESSION : number = 0;

    export var Z_DEFAULT_COMPRESSION : number = 0;

    export var Z_FILTERED : number = 0;

    export var Z_HUFFMAN_ONLY : number = 0;

    export var Z_RLE : number = 0;

    export var Z_FIXED : number = 0;

    export var Z_DEFAULT_STRATEGY : number = 0;

}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace zlib {
    export interface Deflate extends stream.Transform {    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace zlib {
    export interface DeflateRaw extends stream.Transform {    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace zlib {
    

    export function createGzip(options? : any) : any;

    

    export function createGunzip(options? : any) : any;

    

    export function createDeflate(options? : any) : any;

    

    export function createInflate(options? : any) : any;

    

    export function createDeflateRaw(options? : any) : any;

    

    export function createInflateRaw(options? : any) : any;

    

    export function createUnzip(options? : any) : any;

    

    export function deflate(buf? : any, callback? : any) : any;

    

    export function deflateSync(buf? : any, options? : any) : any;

    

    export function deflateRaw(buf? : any, callback? : any) : any;

    

    export function deflateRawSync(buf? : any, options? : any) : any;

    export function gzip(buf : Buffer, callback : (p1: Error, p2: Buffer) => void);

    

    export function gzipSync(buf? : any, options? : any) : any;

    export function gunzip(buf : Buffer, callback : (p1: Error, p2: Buffer) => void);

    

    export function gunzipSync(buf? : any, options? : any) : any;

    export function inflate(buf : Buffer, callback : (p1: Error, p2: Buffer) => void);

    

    export function inflateSync(buf? : any, options? : any) : any;

    export function inflateRaw(buf : Buffer, callback : (p1: Error, p2: Buffer) => void);

    

    export function inflateRawSync(buf? : any, options? : any) : any;

    export function unzip(buf : Buffer, callback : (p1: Error, p2: Buffer) => void);

    

    export function unzipSync(buf? : any, options? : any) : any;

    export var Z_NO_FLUSH : number;

    export var Z_PARTIAL_FLUSH : number;

    export var Z_SYNC_FLUSH : number;

    export var Z_FULL_FLUSH : number;

    export var Z_FINISH : number;

    export var Z_BLOCK : number;

    export var Z_TREES : number;

    export var Z_OK : number;

    export var Z_STREAM_END : number;

    export var Z_NEED_DICT : number;

    export var Z_ERRNO : number;

    export var Z_STREAM_ERROR : number;

    export var Z_DATA_ERROR : number;

    export var Z_MEM_ERROR : number;

    export var Z_BUF_ERROR : number;

    export var Z_VERSION_ERROR : number;

    export var Z_NO_COMPRESSION : number;

    export var Z_BEST_SPEED : number;

    export var Z_BEST_COMPRESSION : number;

    export var Z_DEFAULT_COMPRESSION : number;

    export var Z_FILTERED : number;

    export var Z_HUFFMAN_ONLY : number;

    export var Z_RLE : number;

    export var Z_FIXED : number;

    export var Z_DEFAULT_STRATEGY : number;

    export var Z_BINARY : number;

    export var Z_TEXT : number;

    export var Z_ASCII : number;

    export var Z_UNKNOWN : number;

    export var Z_DEFLATED : number;

}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace zlib {
    export interface Gunzip extends stream.Transform {    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace zlib {
    export interface Gzip extends stream.Transform {    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace zlib {
    export interface Inflate extends stream.Transform {    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace zlib {
    export interface InflateRaw extends stream.Transform {    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace zlib {
    export interface Unzip extends stream.Transform {    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace zlib {
    export interface ZlibOptions {
        flush? : number;

        finishFlush? : number;

        chunkSize? : number;

        windowBits? : number;

        level? : number;

        memLevel? : number;

        strategy? : number;

        dictionary? : any;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace Assert {
    export class AssertionError extends Error {
        public name : string;

        public message : string;

        public actual : any;

        public expected : any;

        public operator : string;

        public generatedMessage : boolean;

        public constructor(options? : any);
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace Assert {
    export function fail(actual : any, expected : any, message : string, operator : string);

    

    export function ok(value? : any, message? : any) : any;

    

    export function equal(actual? : any, expected? : any, message? : any) : any;

    

    export function notEqual(actual? : any, expected? : any, message? : any) : any;

    

    export function deepEqual(actual? : any, expected? : any, message? : any) : any;

    

    export function notDeepEqual(acutal? : any, expected? : any, message? : any) : any;

    

    export function strictEqual(actual? : any, expected? : any, message? : any) : any;

    

    export function notStrictEqual(actual? : any, expected? : any, message? : any) : any;

    

    export function deepStrictEqual(actual? : any, expected? : any, message? : any) : any;

    

    export function notDeepStrictEqual(actual? : any, expected? : any, message? : any) : any;

    export var doesNotThrow : any;

    export function ifError(value : any);

    

    

}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace Assert {
    /**
     * This is an automatically generated object type (see the source definition).
     * @extends Object
     */
    export class Throws {
        

        public static (block? : any, error? : any, message? : any) : any;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace _debugger {
    export interface Breakpoint {
        id : number;

        scriptId : number;

        script : _debugger.ScriptDesc;

        line : number;

        condition? : string;

        scriptReq? : string;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace _debugger {
    export interface BreakpointMessageBody {
        type : string;

        target : number;

        line : number;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace _debugger {
    export interface BreakResponse {
        script? : _debugger.ScriptDesc;

        exception? : _debugger.ExceptionInfo;

        sourceLine : number;

        sourceLineText : string;

        sourceColumn : number;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace _debugger {
    export interface ClientInstance extends NodeJS.EventEmitter {
        protocol : _debugger.Protocol;

        scripts : _debugger.ScriptDesc[];

        handles : _debugger.ScriptDesc[];

        breakpoints : _debugger.Breakpoint[];

        currentSourceLine : number;

        currentSourceColumn : number;

        currentSourceLineText : string;

        currentFrame : number;

        currentScript : string;

        connect(port : number, host : string);

        req(req : any, cb : _debugger.RequestHandler);

        reqFrameEval(code : string, frame : number, cb : _debugger.RequestHandler);

        mirrorObject(obj : any, depth : number, cb : _debugger.ResponseBodyHandler);

        setBreakpoint(rq : _debugger.BreakpointMessageBody, cb : _debugger.RequestHandler);

        clearBreakpoint(rq : _debugger.Request, cb : _debugger.RequestHandler);

        listbreakpoints(cb : _debugger.RequestHandler);

        reqSource(from : number, to : number, cb : _debugger.RequestHandler);

        reqScripts(cb : any);

        reqContinue(cb : _debugger.RequestHandler);
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace _debugger {
    export interface Event extends _debugger.Message {
        event : string;

        body? : any;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace _debugger {
    export interface ExceptionInfo {
        text : string;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace _debugger {
    export var NO_FRAME : number;

    export var port : number;

    export function SourceInfo(body : _debugger.BreakResponse) : string;

    export var Client : any;

}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace _debugger {
    export interface Message {
        seq : number;

        type : string;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace _debugger {
    export interface Packet {
        raw : string;

        headers : string[];

        body : _debugger.Message;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace _debugger {
    export class Protocol {
        public res : _debugger.Packet;

        public state : string;

        public execute(data : string);

        public serialize(rq : _debugger.Request) : string;

        public onResponse : (p1: _debugger.Packet) => void;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace _debugger {
    export interface Request extends _debugger.Message {
        command : string;

        arguments : any;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace _debugger {
    export interface RequestHandler {
        (err : boolean, body : _debugger.Message, res : _debugger.Packet);

        request_seq? : number;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace _debugger {
    export interface RequestInfo {
        command : string;

        arguments : any;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace _debugger {
    export interface Response extends _debugger.Message {
        request_seq : number;

        success : boolean;

        /**
         * Contains error message if success === false.
         */
        message? : string;

        /**
         * Contains message body if success === true.
         */
        body? : any;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace _debugger {
    export interface ResponseBodyHandler {
        (err? : any, body? : any) : any;

        request_seq? : number;
    }
}
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare namespace _debugger {
    export interface ScriptDesc {
        name : string;

        id : number;

        isNative? : boolean;

        handle? : number;

        type : string;

        lineOffset? : number;

        columnOffset? : number;

        lineCount? : number;
    }
}


declare module "cluster" {
    export = cluster;
}

declare module "v8" {
    export = v8;
}

declare module "dgram" {
    export = dgram;
}

declare module "_debugger" {
    export = _debugger;
}

declare module "fs" {
    export = fs;
}

declare module "path" {
    export = path;
}

declare module "Assert" {
    export = Assert;
}

declare module "stream" {
    export = stream;
}

declare module "assert";

declare module "string_decoder" {
    export = string_decoder;
}

declare module "repl" {
    export = repl;
}

declare module "buffer" {
    export = buffer;
}

declare module "constants" {
    export = constants;
}

declare module "https" {
    export = https;
}

declare module "net" {
    export = net;
}

declare module "events" {
    export = events;
}

declare module "readline" {
    export = readline;
}

declare module "console";

declare module "process";

declare module "timers" {
    export = timers;
}

declare module "os" {
    export = os;
}

declare module "dns" {
    export = dns;
}

declare module "querystring" {
    export = querystring;
}

declare module "url" {
    export = url;
}

declare module "crypto" {
    export = crypto;
}

declare module "zlib" {
    export = zlib;
}

declare module "punycode" {
    export = punycode;
}

declare module "util" {
    export = util;
}

declare module "domain" {
    export = domain;
}

declare module "vm" {
    export = vm;
}

declare module "tty" {
    export = tty;
}

declare module "http" {
    export = http;
}

declare module "tls" {
    export = tls;
}

declare module "child_process" {
    export = child_process;
}
