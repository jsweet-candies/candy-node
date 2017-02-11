package def.node;
import def.js.Uint8Array;
/**
 * @deprecated
 */
@jsweet.lang.Interface
public abstract class NodeBuffer extends Uint8Array {
    native public double write(String string, double offset, double length, String encoding);
    native public String toString(String encoding, double start, double end);
    native public ToJSON toJSON();
    @jsweet.lang.Name("equals")
    native public Boolean Equals(Buffer otherBuffer);
    native public double compare(Buffer otherBuffer, double targetStart, double targetEnd, double sourceStart, double sourceEnd);
    native public double copy(Buffer targetBuffer, double targetStart, double sourceStart, double sourceEnd);
    native public Buffer slice(double start, double end);
    native public double writeUIntLE(double value, double offset, double byteLength, Boolean noAssert);
    native public double writeUIntBE(double value, double offset, double byteLength, Boolean noAssert);
    native public double writeIntLE(double value, double offset, double byteLength, Boolean noAssert);
    native public double writeIntBE(double value, double offset, double byteLength, Boolean noAssert);
    native public double readUIntLE(double offset, double byteLength, Boolean noAssert);
    native public double readUIntBE(double offset, double byteLength, Boolean noAssert);
    native public double readIntLE(double offset, double byteLength, Boolean noAssert);
    native public double readIntBE(double offset, double byteLength, Boolean noAssert);
    native public double readUInt8(double offset, Boolean noAssert);
    native public double readUInt16LE(double offset, Boolean noAssert);
    native public double readUInt16BE(double offset, Boolean noAssert);
    native public double readUInt32LE(double offset, Boolean noAssert);
    native public double readUInt32BE(double offset, Boolean noAssert);
    native public double readInt8(double offset, Boolean noAssert);
    native public double readInt16LE(double offset, Boolean noAssert);
    native public double readInt16BE(double offset, Boolean noAssert);
    native public double readInt32LE(double offset, Boolean noAssert);
    native public double readInt32BE(double offset, Boolean noAssert);
    native public double readFloatLE(double offset, Boolean noAssert);
    native public double readFloatBE(double offset, Boolean noAssert);
    native public double readDoubleLE(double offset, Boolean noAssert);
    native public double readDoubleBE(double offset, Boolean noAssert);
    native public Buffer swap16();
    native public Buffer swap32();
    native public Buffer swap64();
    native public double writeUInt8(double value, double offset, Boolean noAssert);
    native public double writeUInt16LE(double value, double offset, Boolean noAssert);
    native public double writeUInt16BE(double value, double offset, Boolean noAssert);
    native public double writeUInt32LE(double value, double offset, Boolean noAssert);
    native public double writeUInt32BE(double value, double offset, Boolean noAssert);
    native public double writeInt8(double value, double offset, Boolean noAssert);
    native public double writeInt16LE(double value, double offset, Boolean noAssert);
    native public double writeInt16BE(double value, double offset, Boolean noAssert);
    native public double writeInt32LE(double value, double offset, Boolean noAssert);
    native public double writeInt32BE(double value, double offset, Boolean noAssert);
    native public double writeFloatLE(double value, double offset, Boolean noAssert);
    native public double writeFloatBE(double value, double offset, Boolean noAssert);
    native public double writeDoubleLE(double value, double offset, Boolean noAssert);
    native public double writeDoubleBE(double value, double offset, Boolean noAssert);
    native public NodeBuffer fill(Object value, double offset, double end);
    native public double indexOf(String value, double byteOffset, String encoding);
    native public double lastIndexOf(String value, double byteOffset, String encoding);
    
    // TODO : ES6 IterableIterator how to 
//    native public IterableIterator<jsweet.util.tuple.Tuple2<Double,Double>> entries();
    native public Boolean includes(String value, double byteOffset, String encoding);
//    native public IterableIterator<Double> keys();
//    native public IterableIterator<Double> values();
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class ToJSON extends def.js.Object {
        public def.node.StringTypes.Buffer type;
        public Object[] data;
    }
    native public double write(String string, double offset, double length);
    native public double write(String string, double offset);
    native public double write(String string);
    native public String toString(String encoding, double start);
    native public String toString(String encoding);
    native public String toString();
    native public double compare(Buffer otherBuffer, double targetStart, double targetEnd, double sourceStart);
    native public double compare(Buffer otherBuffer, double targetStart, double targetEnd);
    native public double compare(Buffer otherBuffer, double targetStart);
    native public double compare(Buffer otherBuffer);
    native public double copy(Buffer targetBuffer, double targetStart, double sourceStart);
    native public double copy(Buffer targetBuffer, double targetStart);
    native public double copy(Buffer targetBuffer);
    native public Buffer slice(double start);
    native public Buffer slice();
    native public double writeUIntLE(double value, double offset, double byteLength);
    native public double writeUIntBE(double value, double offset, double byteLength);
    native public double writeIntLE(double value, double offset, double byteLength);
    native public double writeIntBE(double value, double offset, double byteLength);
    native public double readUIntLE(double offset, double byteLength);
    native public double readUIntBE(double offset, double byteLength);
    native public double readIntLE(double offset, double byteLength);
    native public double readIntBE(double offset, double byteLength);
    native public double readUInt8(double offset);
    native public double readUInt16LE(double offset);
    native public double readUInt16BE(double offset);
    native public double readUInt32LE(double offset);
    native public double readUInt32BE(double offset);
    native public double readInt8(double offset);
    native public double readInt16LE(double offset);
    native public double readInt16BE(double offset);
    native public double readInt32LE(double offset);
    native public double readInt32BE(double offset);
    native public double readFloatLE(double offset);
    native public double readFloatBE(double offset);
    native public double readDoubleLE(double offset);
    native public double readDoubleBE(double offset);
    native public double writeUInt8(double value, double offset);
    native public double writeUInt16LE(double value, double offset);
    native public double writeUInt16BE(double value, double offset);
    native public double writeUInt32LE(double value, double offset);
    native public double writeUInt32BE(double value, double offset);
    native public double writeInt8(double value, double offset);
    native public double writeInt16LE(double value, double offset);
    native public double writeInt16BE(double value, double offset);
    native public double writeInt32LE(double value, double offset);
    native public double writeInt32BE(double value, double offset);
    native public double writeFloatLE(double value, double offset);
    native public double writeFloatBE(double value, double offset);
    native public double writeDoubleLE(double value, double offset);
    native public double writeDoubleBE(double value, double offset);
    native public NodeBuffer fill(Object value, double offset);
    native public NodeBuffer fill(Object value);
    native public double indexOf(String value, double byteOffset);
    native public double indexOf(String value);
    native public double lastIndexOf(String value, double byteOffset);
    native public double lastIndexOf(String value);
    native public Boolean includes(String value, double byteOffset);
    native public Boolean includes(String value);
    native public double indexOf(double value, double byteOffset, String encoding);
    native public double indexOf(Buffer value, double byteOffset, String encoding);
    native public double lastIndexOf(Buffer value, double byteOffset, String encoding);
    native public double lastIndexOf(double value, double byteOffset, String encoding);
    native public Boolean includes(Buffer value, double byteOffset, String encoding);
    native public Boolean includes(double value, double byteOffset, String encoding);
    native public double indexOf(double value, double byteOffset);
    native public double indexOf(Buffer value, double byteOffset);
    native public double indexOf(Buffer value);
    native public double indexOf(double value);
    native public double lastIndexOf(Buffer value, double byteOffset);
    native public double lastIndexOf(double value, double byteOffset);
    native public double lastIndexOf(Buffer value);
    native public double lastIndexOf(double value);
    native public Boolean includes(Buffer value, double byteOffset);
    native public Boolean includes(double value, double byteOffset);
    native public Boolean includes(Buffer value);
    native public Boolean includes(double value);
}

