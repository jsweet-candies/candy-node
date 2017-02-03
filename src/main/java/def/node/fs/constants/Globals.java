package def.node.fs.constants;
/** This class holds all the global functions and variables of the constants package. */
public final class Globals {
    private Globals(){}
    /** Constant for fs.access(). File is visible to the calling process. */
    public static final double F_OK=0;
    /** Constant for fs.access(). File can be read by the calling process. */
    public static final double R_OK=0;
    /** Constant for fs.access(). File can be written by the calling process. */
    public static final double W_OK=0;
    /** Constant for fs.access(). File can be executed by the calling process. */
    public static final double X_OK=0;
    /** Constant for fs.open(). Flag indicating to open a file for read-only access. */
    public static final double O_RDONLY=0;
    /** Constant for fs.open(). Flag indicating to open a file for write-only access. */
    public static final double O_WRONLY=0;
    /** Constant for fs.open(). Flag indicating to open a file for read-write access. */
    public static final double O_RDWR=0;
    /** Constant for fs.open(). Flag indicating to create the file if it does not already exist. */
    public static final double O_CREAT=0;
    /** Constant for fs.open(). Flag indicating that opening a file should fail if the O_CREAT flag is set and the file already exists. */
    public static final double O_EXCL=0;
    /** Constant for fs.open(). Flag indicating that if path identifies a terminal device, opening the path shall not cause that terminal to become the controlling terminal for the process (if the process does not already have one). */
    public static final double O_NOCTTY=0;
    /** Constant for fs.open(). Flag indicating that if the file exists and is a regular file, and the file is opened successfully for write access, its length shall be truncated to zero. */
    public static final double O_TRUNC=0;
    /** Constant for fs.open(). Flag indicating that data will be appended to the end of the file. */
    public static final double O_APPEND=0;
    /** Constant for fs.open(). Flag indicating that the open should fail if the path is not a directory. */
    public static final double O_DIRECTORY=0;
    /** Constant for fs.open(). Flag indicating reading accesses to the file system will no longer result in an update to the atime information associated with the file. This flag is available on Linux operating systems only. */
    public static final double O_NOATIME=0;
    /** Constant for fs.open(). Flag indicating that the open should fail if the path is a symbolic link. */
    public static final double O_NOFOLLOW=0;
    /** Constant for fs.open(). Flag indicating that the file is opened for synchronous I/O. */
    public static final double O_SYNC=0;
    /** Constant for fs.open(). Flag indicating to open the symbolic link itself rather than the resource it is pointing to. */
    public static final double O_SYMLINK=0;
    /** Constant for fs.open(). When set, an attempt will be made to minimize caching effects of file I/O. */
    public static final double O_DIRECT=0;
    /** Constant for fs.open(). Flag indicating to open the file in nonblocking mode when possible. */
    public static final double O_NONBLOCK=0;
    /** Constant for fs.Stats mode property for determining a file's type. Bit mask used to extract the file type code. */
    public static final double S_IFMT=0;
    /** Constant for fs.Stats mode property for determining a file's type. File type constant for a regular file. */
    public static final double S_IFREG=0;
    /** Constant for fs.Stats mode property for determining a file's type. File type constant for a directory. */
    public static final double S_IFDIR=0;
    /** Constant for fs.Stats mode property for determining a file's type. File type constant for a character-oriented device file. */
    public static final double S_IFCHR=0;
    /** Constant for fs.Stats mode property for determining a file's type. File type constant for a block-oriented device file. */
    public static final double S_IFBLK=0;
    /** Constant for fs.Stats mode property for determining a file's type. File type constant for a FIFO/pipe. */
    public static final double S_IFIFO=0;
    /** Constant for fs.Stats mode property for determining a file's type. File type constant for a symbolic link. */
    public static final double S_IFLNK=0;
    /** Constant for fs.Stats mode property for determining a file's type. File type constant for a socket. */
    public static final double S_IFSOCK=0;
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable, writable and executable by owner. */
    public static final double S_IRWXU=0;
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable by owner. */
    public static final double S_IRUSR=0;
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating writable by owner. */
    public static final double S_IWUSR=0;
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating executable by owner. */
    public static final double S_IXUSR=0;
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable, writable and executable by group. */
    public static final double S_IRWXG=0;
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable by group. */
    public static final double S_IRGRP=0;
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating writable by group. */
    public static final double S_IWGRP=0;
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating executable by group. */
    public static final double S_IXGRP=0;
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable, writable and executable by others. */
    public static final double S_IRWXO=0;
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable by others. */
    public static final double S_IROTH=0;
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating writable by others. */
    public static final double S_IWOTH=0;
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating executable by others. */
    public static final double S_IXOTH=0;
}

