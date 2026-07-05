package defpackage;

import okio.BufferedSource;
import okio.FileSystem;
import okio.Okio;
import okio.Path;
import okio.RealBufferedSource;

/* JADX INFO: loaded from: classes2.dex */
public final class peg implements jy8 {
    public final FileSystem E;
    public final huk F;
    public final Object G = new Object();
    public boolean H;
    public BufferedSource I;
    public Path J;

    public peg(BufferedSource bufferedSource, FileSystem fileSystem, huk hukVar) {
        this.E = fileSystem;
        this.F = hukVar;
        this.I = bufferedSource;
    }

    @Override // defpackage.jy8
    public final BufferedSource G0() {
        synchronized (this.G) {
            if (this.H) {
                throw new IllegalStateException("closed");
            }
            BufferedSource bufferedSource = this.I;
            if (bufferedSource != null) {
                return bufferedSource;
            }
            FileSystem fileSystem = this.E;
            Path path = this.J;
            path.getClass();
            RealBufferedSource realBufferedSourceC = Okio.c(fileSystem.T(path));
            this.I = realBufferedSourceC;
            return realBufferedSourceC;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0065, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0066, code lost:
    
        throw r6;
     */
    @Override // defpackage.jy8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final okio.Path V() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.G
            monitor-enter(r0)
            boolean r1 = r6.H     // Catch: java.lang.Throwable -> L62
            if (r1 != 0) goto L67
            okio.Path r1 = r6.J     // Catch: java.lang.Throwable -> L62
            if (r1 == 0) goto Ld
            monitor-exit(r0)
            return r1
        Ld:
            okio.FileSystem r1 = r6.E     // Catch: java.lang.Throwable -> L62
            java.lang.String r2 = "tmp_"
        L11:
            okio.Path r3 = okio.FileSystem.F     // Catch: java.lang.Throwable -> L62
            g1e r4 = defpackage.h1e.E     // Catch: java.lang.Throwable -> L62
            m3 r4 = defpackage.h1e.F     // Catch: java.lang.Throwable -> L62
            long r4 = r4.i()     // Catch: java.lang.Throwable -> L62
            java.lang.String r4 = defpackage.qci.a(r4)     // Catch: java.lang.Throwable -> L62
            java.lang.String r4 = r2.concat(r4)     // Catch: java.lang.Throwable -> L62
            okio.Path r3 = r3.e(r4)     // Catch: java.lang.Throwable -> L62
            boolean r4 = r1.n(r3)     // Catch: java.lang.Throwable -> L62
            if (r4 != 0) goto L11
            r2 = 1
            okio.Sink r1 = r1.S(r3, r2)     // Catch: java.lang.Throwable -> L62
            r1.close()     // Catch: java.lang.Exception -> L35 java.lang.Throwable -> L62 java.lang.RuntimeException -> L65
        L35:
            okio.FileSystem r1 = r6.E     // Catch: java.lang.Throwable -> L62
            r2 = 0
            okio.Sink r1 = r1.S(r3, r2)     // Catch: java.lang.Throwable -> L62
            okio.RealBufferedSink r1 = okio.Okio.b(r1)     // Catch: java.lang.Throwable -> L62
            r2 = 0
            okio.BufferedSource r4 = r6.I     // Catch: java.lang.Throwable -> L50
            r4.getClass()     // Catch: java.lang.Throwable -> L50
            r1.f0(r4)     // Catch: java.lang.Throwable -> L50
            r1.close()     // Catch: java.lang.Throwable -> L4e
            r1 = r2
            goto L5a
        L4e:
            r1 = move-exception
            goto L5a
        L50:
            r4 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L55
            goto L59
        L55:
            r1 = move-exception
            defpackage.mwa.p(r4, r1)     // Catch: java.lang.Throwable -> L62
        L59:
            r1 = r4
        L5a:
            if (r1 != 0) goto L64
            r6.I = r2     // Catch: java.lang.Throwable -> L62
            r6.J = r3     // Catch: java.lang.Throwable -> L62
            monitor-exit(r0)
            return r3
        L62:
            r6 = move-exception
            goto L6f
        L64:
            throw r1     // Catch: java.lang.Throwable -> L62
        L65:
            r6 = move-exception
            throw r6     // Catch: java.lang.Throwable -> L62
        L67:
            java.lang.String r6 = "closed"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L62
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L62
            throw r1     // Catch: java.lang.Throwable -> L62
        L6f:
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.peg.V():okio.Path");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.G) {
            this.H = true;
            BufferedSource bufferedSource = this.I;
            if (bufferedSource != null) {
                try {
                    bufferedSource.close();
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception unused) {
                }
            }
            Path path = this.J;
            if (path != null) {
                FileSystem fileSystem = this.E;
                fileSystem.getClass();
                fileSystem.j(path, false);
            }
        }
    }

    @Override // defpackage.jy8
    public final FileSystem getFileSystem() {
        return this.E;
    }

    @Override // defpackage.jy8
    public final huk m() {
        return this.F;
    }

    @Override // defpackage.jy8
    public final Path w0() {
        Path path;
        synchronized (this.G) {
            if (this.H) {
                throw new IllegalStateException("closed");
            }
            path = this.J;
        }
        return path;
    }
}
