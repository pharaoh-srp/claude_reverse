package defpackage;

import java.io.Closeable;
import okio.BufferedSource;
import okio.FileSystem;
import okio.Okio;
import okio.Path;
import okio.RealBufferedSource;

/* JADX INFO: loaded from: classes2.dex */
public final class ri7 extends ky8 {
    public final Path E;
    public final FileSystem F;
    public final String G;
    public final Closeable H;
    public boolean I;
    public RealBufferedSource J;

    public ri7(Path path, FileSystem fileSystem, String str, Closeable closeable) {
        this.E = path;
        this.F = fileSystem;
        this.G = str;
        this.H = closeable;
    }

    @Override // defpackage.ky8
    public final synchronized BufferedSource G0() {
        if (this.I) {
            throw new IllegalStateException("closed");
        }
        RealBufferedSource realBufferedSource = this.J;
        if (realBufferedSource != null) {
            return realBufferedSource;
        }
        RealBufferedSource realBufferedSourceC = Okio.c(this.F.T(this.E));
        this.J = realBufferedSourceC;
        return realBufferedSourceC;
    }

    @Override // defpackage.ky8
    public final nuk c() {
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            this.I = true;
            RealBufferedSource realBufferedSource = this.J;
            if (realBufferedSource != null) {
                l.a(realBufferedSource);
            }
            Closeable closeable = this.H;
            if (closeable != null) {
                l.a(closeable);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
