package def.node;
import def.js.Uint8Array;
/** This is an automatically generated object type (see the source definition). */
@jsweet.lang.ObjectType
public class SlowBufferData extends def.js.Object {
    public SlowBufferData(String str, String encoding){}
    public SlowBufferData(double size){}
    public SlowBufferData(Uint8Array size){}
    public SlowBufferData(Object[] array){}
    public Buffer prototype;
    native public Boolean isBuffer(Object obj);
    native public double byteLength(String string, String encoding);
    native public Buffer concat(Buffer[] list, double totalLength);
    public SlowBufferData(String str){}
    native public double byteLength(String string);
    native public Buffer concat(Buffer[] list);
    protected SlowBufferData(){}
}

