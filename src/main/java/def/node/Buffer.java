package def.node;
import def.js.ArrayBuffer;
import def.js.Uint8Array;
public class Buffer extends NodeBuffer {
    /**
     * Allocates a new buffer containing the given {str}.
     *
     * @param str String to store in buffer.
     * @param encoding encoding to use, optional.  Default is 'utf8'
     */
    public Buffer(String str, String encoding){}
    /**
     * Allocates a new buffer of {size} octets.
     *
     * @param size count of octets to allocate.
     */
    public Buffer(double size){}
    /**
     * Allocates a new buffer containing the given {array} of octets.
     *
     * @param array The octets to store.
     */
    public Buffer(Uint8Array array){}
    /**
     * Produces a Buffer backed by the same allocated memory as
     * the given {ArrayBuffer}.
     *
     *
     * @param arrayBuffer The ArrayBuffer with which to share memory.
     */
    public Buffer(ArrayBuffer arrayBuffer){}
    /**
     * Allocates a new buffer containing the given {array} of octets.
     *
     * @param array The octets to store.
     */
    public Buffer(Object[] array){}
    /**
     * Copies the passed {buffer} data onto a new {Buffer} instance.
     *
     * @param buffer The buffer to copy.
     */
    public Buffer(Buffer buffer){}
    public static Buffer prototype;
    /**
     * Allocates a new Buffer using an {array} of octets.
     *
     * @param array
     */
    native public static Buffer from(Object[] array);
    /**
     * When passed a reference to the .buffer property of a TypedArray instance,
     * the newly created Buffer will share the same allocated memory as the TypedArray.
     * The optional {byteOffset} and {length} arguments specify a memory range
     * within the {arrayBuffer} that will be shared by the Buffer.
     *
     * @param arrayBuffer The .buffer property of a TypedArray or a new ArrayBuffer()
     * @param byteOffset
     * @param length
     */
    native public static Buffer from(ArrayBuffer arrayBuffer, double byteOffset, double length);
    /**
     * Copies the passed {buffer} data onto a new Buffer instance.
     *
     * @param buffer
     */
    native public static Buffer from(Buffer buffer);
    /**
     * Creates a new Buffer containing the given JavaScript string {str}.
     * If provided, the {encoding} parameter identifies the character encoding.
     * If not provided, {encoding} defaults to 'utf8'.
     *
     * @param str
     */
    native public static Buffer from(String str, String encoding);
    /**
     * Returns true if {obj} is a Buffer
     *
     * @param obj object to test.
     */
    native public static Boolean isBuffer(Object obj);
    /**
     * Returns true if {encoding} is a valid encoding argument.
     * Valid string encodings in Node 0.12: 'ascii'|'utf8'|'utf16le'|'ucs2'(alias of 'utf16le')|'base64'|'binary'(deprecated)|'hex'
     *
     * @param encoding string to test.
     */
    native public static Boolean isEncoding(String encoding);
    /**
     * Gives the actual byte length of a string. encoding defaults to 'utf8'.
     * This is not the same as String.prototype.length since that returns the number of characters in a string.
     *
     * @param string string to test.
     * @param encoding encoding used to evaluate (defaults to 'utf8')
     */
    native public static double byteLength(String string, String encoding);
    /**
     * Returns a buffer which is the result of concatenating all the buffers in the list together.
     *
     * If the list has no items, or if the totalLength is 0, then it returns a zero-length buffer.
     * If the list has exactly one item, then the first item of the list is returned.
     * If the list has more than one item, then a new Buffer is created.
     *
     * @param list An array of Buffer objects to concatenate
     * @param totalLength Total length of the buffers when concatenated.
     *   If totalLength is not provided, it is read from the buffers in the list. However, this adds an additional loop to the function, so it is faster to provide the length explicitly.
     */
    native public static Buffer concat(Buffer[] list, double totalLength);
    /**
     * The same as buf1.compare(buf2).
     */
    native public static double compare(Buffer buf1, Buffer buf2);
    /**
     * Allocates a new buffer of {size} octets.
     *
     * @param size count of octets to allocate.
     * @param fill if specified, buffer will be initialized by calling buf.fill(fill).
     *    If parameter is omitted, buffer will be filled with zeros.
     * @param encoding encoding used for call to buf.fill while initalizing
     */
    native public static Buffer alloc(double size, String fill, String encoding);
    /**
     * Allocates a new buffer of {size} octets, leaving memory not initialized, so the contents
     * of the newly created Buffer are unknown and may contain sensitive data.
     *
     * @param size count of octets to allocate
     */
    native public static Buffer allocUnsafe(double size);
    /**
     * Allocates a new non-pooled buffer of {size} octets, leaving memory not initialized, so the contents
     * of the newly created Buffer are unknown and may contain sensitive data.
     *
     * @param size count of octets to allocate
     */
    native public static Buffer allocUnsafeSlow(double size);
    /**
     * Allocates a new buffer containing the given {str}.
     *
     * @param str String to store in buffer.
     * @param encoding encoding to use, optional.  Default is 'utf8'
     */
    public Buffer(String str){}
    /**
     * When passed a reference to the .buffer property of a TypedArray instance,
     * the newly created Buffer will share the same allocated memory as the TypedArray.
     * The optional {byteOffset} and {length} arguments specify a memory range
     * within the {arrayBuffer} that will be shared by the Buffer.
     *
     * @param arrayBuffer The .buffer property of a TypedArray or a new ArrayBuffer()
     * @param byteOffset
     * @param length
     */
    native public static Buffer from(ArrayBuffer arrayBuffer, double byteOffset);
    /**
     * When passed a reference to the .buffer property of a TypedArray instance,
     * the newly created Buffer will share the same allocated memory as the TypedArray.
     * The optional {byteOffset} and {length} arguments specify a memory range
     * within the {arrayBuffer} that will be shared by the Buffer.
     *
     * @param arrayBuffer The .buffer property of a TypedArray or a new ArrayBuffer()
     * @param byteOffset
     * @param length
     */
    native public static Buffer from(ArrayBuffer arrayBuffer);
    /**
     * Creates a new Buffer containing the given JavaScript string {str}.
     * If provided, the {encoding} parameter identifies the character encoding.
     * If not provided, {encoding} defaults to 'utf8'.
     *
     * @param str
     */
    native public static Buffer from(String str);
    /**
     * Gives the actual byte length of a string. encoding defaults to 'utf8'.
     * This is not the same as String.prototype.length since that returns the number of characters in a string.
     *
     * @param string string to test.
     * @param encoding encoding used to evaluate (defaults to 'utf8')
     */
    native public static double byteLength(String string);
    /**
     * Returns a buffer which is the result of concatenating all the buffers in the list together.
     *
     * If the list has no items, or if the totalLength is 0, then it returns a zero-length buffer.
     * If the list has exactly one item, then the first item of the list is returned.
     * If the list has more than one item, then a new Buffer is created.
     *
     * @param list An array of Buffer objects to concatenate
     * @param totalLength Total length of the buffers when concatenated.
     *   If totalLength is not provided, it is read from the buffers in the list. However, this adds an additional loop to the function, so it is faster to provide the length explicitly.
     */
    native public static Buffer concat(Buffer[] list);
    /**
     * Allocates a new buffer of {size} octets.
     *
     * @param size count of octets to allocate.
     * @param fill if specified, buffer will be initialized by calling buf.fill(fill).
     *    If parameter is omitted, buffer will be filled with zeros.
     * @param encoding encoding used for call to buf.fill while initalizing
     */
    native public static Buffer alloc(double size, String fill);
    /**
     * Allocates a new buffer of {size} octets.
     *
     * @param size count of octets to allocate.
     * @param fill if specified, buffer will be initialized by calling buf.fill(fill).
     *    If parameter is omitted, buffer will be filled with zeros.
     * @param encoding encoding used for call to buf.fill while initalizing
     */
    native public static Buffer alloc(double size);
    /**
     * Allocates a new buffer of {size} octets.
     *
     * @param size count of octets to allocate.
     * @param fill if specified, buffer will be initialized by calling buf.fill(fill).
     *    If parameter is omitted, buffer will be filled with zeros.
     * @param encoding encoding used for call to buf.fill while initalizing
     */
    native public static Buffer alloc(double size, Buffer fill, String encoding);
    /**
     * Allocates a new buffer of {size} octets.
     *
     * @param size count of octets to allocate.
     * @param fill if specified, buffer will be initialized by calling buf.fill(fill).
     *    If parameter is omitted, buffer will be filled with zeros.
     * @param encoding encoding used for call to buf.fill while initalizing
     */
    native public static Buffer alloc(double size, double fill, String encoding);
    /**
     * Allocates a new buffer of {size} octets.
     *
     * @param size count of octets to allocate.
     * @param fill if specified, buffer will be initialized by calling buf.fill(fill).
     *    If parameter is omitted, buffer will be filled with zeros.
     * @param encoding encoding used for call to buf.fill while initalizing
     */
    native public static Buffer alloc(double size, double fill);
    /**
     * Allocates a new buffer of {size} octets.
     *
     * @param size count of octets to allocate.
     * @param fill if specified, buffer will be initialized by calling buf.fill(fill).
     *    If parameter is omitted, buffer will be filled with zeros.
     * @param encoding encoding used for call to buf.fill while initalizing
     */
    native public static Buffer alloc(double size, Buffer fill);
    protected Buffer(){}
}

