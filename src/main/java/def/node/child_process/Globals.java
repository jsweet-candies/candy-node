package def.node.child_process;
import def.node.Buffer;
import def.js.Error;
/** This class holds all the global functions and variables of the child_process package. */
public final class Globals {
    private Globals(){}
    native public static ChildProcess spawn(String command, String[] args, SpawnOptions options);
    native public static ChildProcess exec(String command, jsweet.util.function.TriConsumer<Error,String,String> callback);
    native public static ChildProcess exec(String command, ExecOptionsWithStringEncoding options, jsweet.util.function.TriConsumer<Error,String,String> callback);
    native public static ChildProcess exec(String command, ExecOptionsWithBufferEncoding options, jsweet.util.function.TriConsumer<Error,Buffer,Buffer> callback);
    native public static ChildProcess exec(String command, ExecOptions options, jsweet.util.function.TriConsumer<Error,String,String> callback);
    native public static ChildProcess execFile(String file, jsweet.util.function.TriConsumer<Error,String,String> callback);
    native public static ChildProcess execFile(String file, ExecFileOptionsWithStringEncoding options, jsweet.util.function.TriConsumer<Error,String,String> callback);
    native public static ChildProcess execFile(String file, ExecFileOptionsWithBufferEncoding options, jsweet.util.function.TriConsumer<Error,Buffer,Buffer> callback);
    native public static ChildProcess execFile(String file, ExecFileOptions options, jsweet.util.function.TriConsumer<Error,String,String> callback);
    native public static ChildProcess execFile(String file, String[] args, jsweet.util.function.TriConsumer<Error,String,String> callback);
    native public static ChildProcess execFile(String file, String[] args, ExecFileOptionsWithStringEncoding options, jsweet.util.function.TriConsumer<Error,String,String> callback);
    native public static ChildProcess execFile(String file, String[] args, ExecFileOptionsWithBufferEncoding options, jsweet.util.function.TriConsumer<Error,Buffer,Buffer> callback);
    native public static ChildProcess execFile(String file, String[] args, ExecFileOptions options, jsweet.util.function.TriConsumer<Error,String,String> callback);
    native public static ChildProcess fork(String modulePath, String[] args, ForkOptions options);
    native public static SpawnSyncReturns<Buffer> spawnSync(String command);
    native public static SpawnSyncReturns<String> spawnSync(String command, SpawnSyncOptionsWithStringEncoding options);
    native public static SpawnSyncReturns<Buffer> spawnSync(String command, SpawnSyncOptionsWithBufferEncoding options);
    native public static SpawnSyncReturns<Buffer> spawnSync(String command, SpawnSyncOptions options);
    native public static SpawnSyncReturns<String> spawnSync(String command, String[] args, SpawnSyncOptionsWithStringEncoding options);
    native public static SpawnSyncReturns<Buffer> spawnSync(String command, String[] args, SpawnSyncOptionsWithBufferEncoding options);
    native public static SpawnSyncReturns<Buffer> spawnSync(String command, String[] args, SpawnSyncOptions options);
    native public static Buffer execSync(String command);
    native public static String execSync(String command, ExecSyncOptionsWithStringEncoding options);
    native public static Buffer execSync(String command, ExecSyncOptionsWithBufferEncoding options);
    native public static Buffer execSync(String command, ExecSyncOptions options);
    native public static Buffer execFileSync(String command);
    native public static String execFileSync(String command, ExecFileSyncOptionsWithStringEncoding options);
    native public static Buffer execFileSync(String command, ExecFileSyncOptionsWithBufferEncoding options);
    native public static Buffer execFileSync(String command, ExecFileSyncOptions options);
    native public static String execFileSync(String command, String[] args, ExecFileSyncOptionsWithStringEncoding options);
    native public static Buffer execFileSync(String command, String[] args, ExecFileSyncOptionsWithBufferEncoding options);
    native public static Buffer execFileSync(String command, String[] args, ExecFileSyncOptions options);
    native public static ChildProcess spawn(String command, String[] args);
    native public static ChildProcess spawn(String command);
    native public static ChildProcess exec(String command);
    native public static ChildProcess exec(String command, ExecOptionsWithStringEncoding options);
    native public static ChildProcess exec(String command, ExecOptionsWithBufferEncoding options);
    native public static ChildProcess exec(String command, ExecOptions options);
    native public static ChildProcess execFile(String file);
    native public static ChildProcess execFile(String file, ExecFileOptionsWithStringEncoding options);
    native public static ChildProcess execFile(String file, ExecFileOptionsWithBufferEncoding options);
    native public static ChildProcess execFile(String file, ExecFileOptions options);
    native public static ChildProcess execFile(String file, String[] args);
    native public static ChildProcess execFile(String file, String[] args, ExecFileOptionsWithStringEncoding options);
    native public static ChildProcess execFile(String file, String[] args, ExecFileOptionsWithBufferEncoding options);
    native public static ChildProcess execFile(String file, String[] args, ExecFileOptions options);
    native public static ChildProcess fork(String modulePath, String[] args);
    native public static ChildProcess fork(String modulePath);
    native public static SpawnSyncReturns<String> spawnSync(String command, String[] args);
    native public static String execFileSync(String command, String[] args);
}

