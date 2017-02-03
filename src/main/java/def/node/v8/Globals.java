package def.node.v8;
/** This class holds all the global functions and variables of the v8 package. */
public final class Globals {
    private Globals(){}
    native public static HeapInfo getHeapStatistics();
    native public static HeapSpaceInfo[] getHeapSpaceStatistics();
    native public static void setFlagsFromString(String flags);
}

