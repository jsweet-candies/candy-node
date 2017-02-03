package def.node.os;
@jsweet.lang.Interface
public abstract class CpuInfo extends def.js.Object {
    public String model;
    public double speed;
    public Times times;
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Times extends def.js.Object {
        public double user;
        public double nice;
        public double sys;
        public double idle;
        public double irq;
    }
}

