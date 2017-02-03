package def.node.nodejs;
import def.node.NodeModule;
import def.js.Function;
@jsweet.lang.Interface
public abstract class Process extends EventEmitter {
    public WritableStream stdout;
    public WritableStream stderr;
    public ReadableStream stdin;
    public String[] argv;
    public String argv0;
    public String[] execArgv;
    public String execPath;
    native public void abort();
    native public void chdir(String directory);
    native public String cwd();
    public Object env;
    native public void exit(double code);
    public double exitCode;
    native public double getgid();
    native public void setgid(double id);
    native public void setgid(String id);
    native public double getuid();
    native public void setuid(double id);
    native public void setuid(String id);
    public String version;
    public ProcessVersions versions;
    public Config config;
    native public void kill(double pid, String signal);
    public double pid;
    public String title;
    public String arch;
    public Object platform;
    @jsweet.lang.Optional
    public NodeModule mainModule;
    native public MemoryUsage memoryUsage();
    native public CpuUsage cpuUsage(CpuUsage previousValue);
    native public void nextTick(Function callback, Object... args);
    native public double umask(double mask);
    native public double uptime();
    native public jsweet.util.tuple.Tuple2<Double,Double> hrtime(jsweet.util.tuple.Tuple2<Double,Double> time);
    public Domain domain;
    native public void send(Object message, Object sendHandle);
    native public void disconnect();
    public Boolean connected;
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Config extends def.js.Object {
        public Target_defaults target_defaults;
        public Variables variables;
        /** This is an automatically generated object type (see the source definition). */
        @jsweet.lang.ObjectType
        public static class Target_defaults extends def.js.Object {
            public Object[] cflags;
            public String default_configuration;
            public String[] defines;
            public String[] include_dirs;
            public String[] libraries;
        }
        /** This is an automatically generated object type (see the source definition). */
        @jsweet.lang.ObjectType
        public static class Variables extends def.js.Object {
            public double clang;
            public String host_arch;
            public Boolean node_install_npm;
            public Boolean node_install_waf;
            public String node_prefix;
            public Boolean node_shared_openssl;
            public Boolean node_shared_v8;
            public Boolean node_shared_zlib;
            public Boolean node_use_dtrace;
            public Boolean node_use_etw;
            public Boolean node_use_openssl;
            public String target_arch;
            public double v8_no_strict_aliasing;
            public Boolean v8_use_snapshot;
            public String visibility;
        }
    }
    native public void exit();
    native public void kill(double pid);
    native public CpuUsage cpuUsage();
    native public double umask();
    native public jsweet.util.tuple.Tuple2<Double,Double> hrtime();
    native public void send(Object message);
    native public void kill(double pid, double signal);
}

