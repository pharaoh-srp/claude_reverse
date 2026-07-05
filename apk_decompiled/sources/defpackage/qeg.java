package defpackage;

import okio.BufferedSource;
import okio.FileSystem;
import okio.JvmSystemFileSystem;

/* JADX INFO: loaded from: classes2.dex */
public final class qeg extends ky8 {
    public final nuk E;
    public boolean F;
    public final BufferedSource G;

    public qeg(BufferedSource bufferedSource, nuk nukVar) {
        this.E = nukVar;
        this.G = bufferedSource;
    }

    @Override // defpackage.ky8
    public final synchronized BufferedSource G0() {
        BufferedSource bufferedSource;
        try {
            if (this.F) {
                throw new IllegalStateException("closed");
            }
            bufferedSource = this.G;
            if (bufferedSource == null) {
                JvmSystemFileSystem jvmSystemFileSystem = FileSystem.E;
                throw null;
            }
        } catch (Throwable th) {
            throw th;
        }
        return bufferedSource;
    }

    @Override // defpackage.ky8
    public final nuk c() {
        return this.E;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.F = true;
        BufferedSource bufferedSource = this.G;
        if (bufferedSource != null) {
            l.a(bufferedSource);
        }
    }
}
