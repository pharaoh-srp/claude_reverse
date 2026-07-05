package okio;

import defpackage.grc;
import defpackage.mdj;
import defpackage.qo0;
import defpackage.qpe;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import okio.Path;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lokio/FileSystem;", "Ljava/io/Closeable;", "Lokio/Closeable;", "Companion", "okio"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public abstract class FileSystem implements Closeable {
    public static final JvmSystemFileSystem E;
    public static final Path F;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\t"}, d2 = {"Lokio/FileSystem$Companion;", "", "Lokio/FileSystem;", "SYSTEM", "Lokio/FileSystem;", "Lokio/Path;", "SYSTEM_TEMPORARY_DIRECTORY", "Lokio/Path;", "RESOURCES", "okio"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
    public static final class Companion {
    }

    static {
        JvmSystemFileSystem jvmSystemFileSystem;
        try {
            Class.forName("java.nio.file.Files");
            jvmSystemFileSystem = new NioSystemFileSystem();
        } catch (ClassNotFoundException unused) {
            jvmSystemFileSystem = new JvmSystemFileSystem();
        }
        E = jvmSystemFileSystem;
        String str = Path.F;
        String property = System.getProperty("java.io.tmpdir");
        property.getClass();
        F = Path.Companion.a(property);
        ClassLoader classLoader = qpe.class.getClassLoader();
        classLoader.getClass();
        new qpe(classLoader);
    }

    public abstract List H(Path path);

    public final FileMetadata K(Path path) throws FileNotFoundException {
        path.getClass();
        FileMetadata fileMetadataP = P(path);
        if (fileMetadataP != null) {
            return fileMetadataP;
        }
        throw new FileNotFoundException(grc.v("no such file: ", path));
    }

    public abstract FileMetadata P(Path path);

    public abstract FileHandle R(Path path);

    public abstract Sink S(Path path, boolean z);

    public abstract Source T(Path path);

    public abstract Sink c(Path path);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public abstract void d(Path path, Path path2);

    public final void e(Path path) {
        qo0 qo0Var = new qo0();
        while (path != null && !n(path)) {
            qo0Var.addFirst(path);
            path = path.c();
        }
        Iterator<E> it = qo0Var.iterator();
        while (it.hasNext()) {
            f((Path) it.next());
        }
    }

    public abstract void f(Path path);

    public final void i(Path path) {
        path.getClass();
        j(path, false);
    }

    public abstract void j(Path path, boolean z);

    public final boolean n(Path path) {
        path.getClass();
        return P(path) != null;
    }

    public abstract List x(Path path);
}
