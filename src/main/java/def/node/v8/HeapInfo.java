package def.node.v8;
@jsweet.lang.Interface
public abstract class HeapInfo extends def.js.Object {
    public double total_heap_size;
    public double total_heap_size_executable;
    public double total_physical_size;
    public double total_available_size;
    public double used_heap_size;
    public double heap_size_limit;
    public double malloced_memory;
    public double peak_malloced_memory;
    
    /**
     * 0 or 1
     */
    public int does_zap_garbage;
}

