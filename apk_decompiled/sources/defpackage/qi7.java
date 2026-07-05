package defpackage;

import okio.BufferedSource;
import okio.FileSystem;
import okio.Okio;
import okio.Path;
import okio.RealBufferedSource;

/* JADX INFO: loaded from: classes2.dex */
public final class qi7 implements jy8 {
    public final Path E;
    public final FileSystem F;
    public final String G;
    public final AutoCloseable H;
    public final Object I = new Object();
    public boolean J;
    public RealBufferedSource K;

    public qi7(Path path, FileSystem fileSystem, String str, AutoCloseable autoCloseable) {
        this.E = path;
        this.F = fileSystem;
        this.G = str;
        this.H = autoCloseable;
    }

    @Override // defpackage.jy8
    public final BufferedSource G0() {
        synchronized (this.I) {
            if (this.J) {
                throw new IllegalStateException("closed");
            }
            RealBufferedSource realBufferedSource = this.K;
            if (realBufferedSource != null) {
                return realBufferedSource;
            }
            RealBufferedSource realBufferedSourceC = Okio.c(this.F.T(this.E));
            this.K = realBufferedSourceC;
            return realBufferedSourceC;
        }
    }

    @Override // defpackage.jy8
    public final Path V() {
        Path path;
        synchronized (this.I) {
            if (this.J) {
                throw new IllegalStateException("closed");
            }
            path = this.E;
        }
        return path;
    }

    public final String c() {
        return this.G;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0014 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.I
            monitor-enter(r0)
            r1 = 1
            r2.J = r1     // Catch: java.lang.Throwable -> L1c
            okio.RealBufferedSource r1 = r2.K     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L10
            r1.close()     // Catch: java.lang.RuntimeException -> Le java.lang.Exception -> L10 java.lang.Throwable -> L1c
            goto L10
        Le:
            r2 = move-exception
            throw r2     // Catch: java.lang.Throwable -> L1c
        L10:
            java.lang.AutoCloseable r2 = r2.H     // Catch: java.lang.Throwable -> L1c
            if (r2 == 0) goto L1a
            defpackage.vb7.C(r2)     // Catch: java.lang.RuntimeException -> L18 java.lang.Exception -> L1a java.lang.Throwable -> L1c
            goto L1a
        L18:
            r2 = move-exception
            throw r2     // Catch: java.lang.Throwable -> L1c
        L1a:
            monitor-exit(r0)
            return
        L1c:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qi7.close():void");
    }

    @Override // defpackage.jy8
    public final FileSystem getFileSystem() {
        return this.F;
    }

    @Override // defpackage.jy8
    public final huk m() {
        return null;
    }

    @Override // defpackage.jy8
    public final Path w0() {
        return V();
    }
}
