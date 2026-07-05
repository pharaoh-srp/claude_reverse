package okio;

import defpackage.d8a;
import defpackage.grc;
import defpackage.mdj;
import defpackage.x44;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.nio.file.NoSuchFileException;
import java.nio.file.StandardOpenOption;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/NioFileSystemWrappingFileSystem;", "Lokio/NioSystemFileSystem;", "okio"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final class NioFileSystemWrappingFileSystem extends NioSystemFileSystem {
    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public final List H(Path path) {
        path.getClass();
        path.toString();
        throw null;
    }

    @Override // okio.NioSystemFileSystem, okio.JvmSystemFileSystem, okio.FileSystem
    public final FileMetadata P(Path path) {
        path.getClass();
        path.toString();
        throw null;
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public final FileHandle R(Path path) throws FileNotFoundException {
        path.getClass();
        try {
            path.toString();
            throw null;
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException(grc.v("no such file: ", path));
        }
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public final Sink S(Path path, boolean z) throws FileNotFoundException {
        path.getClass();
        d8a d8aVarE = x44.E();
        if (z) {
            d8aVarE.add(StandardOpenOption.CREATE_NEW);
        }
        x44.v(d8aVarE);
        try {
            path.toString();
            throw null;
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException(grc.v("no such file: ", path));
        }
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public final Source T(Path path) throws FileNotFoundException {
        path.getClass();
        try {
            path.toString();
            throw null;
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException(grc.v("no such file: ", path));
        }
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public final Sink c(Path path) {
        path.getClass();
        d8a d8aVarE = x44.E();
        d8aVarE.add(StandardOpenOption.APPEND);
        d8aVarE.add(StandardOpenOption.CREATE);
        x44.v(d8aVarE);
        path.toString();
        throw null;
    }

    @Override // okio.FileSystem, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw null;
    }

    @Override // okio.NioSystemFileSystem, okio.JvmSystemFileSystem, okio.FileSystem
    public final void d(Path path, Path path2) throws IOException {
        path.getClass();
        path2.getClass();
        try {
            path.toString();
            throw null;
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        } catch (NoSuchFileException e) {
            throw new FileNotFoundException(e.getMessage());
        }
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public final void f(Path path) {
        path.getClass();
        path.toString();
        throw null;
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public final void j(Path path, boolean z) throws InterruptedIOException {
        path.getClass();
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        path.toString();
        throw null;
    }

    @Override // okio.NioSystemFileSystem, okio.JvmSystemFileSystem
    public final String toString() {
        throw null;
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public final List x(Path path) {
        path.toString();
        throw null;
    }
}
