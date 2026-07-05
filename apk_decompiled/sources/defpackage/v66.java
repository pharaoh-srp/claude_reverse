package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.io.Flushable;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import okio.FileSystem;
import okio.Okio;
import okio.Path;
import okio.RealBufferedSink;
import okio.RealBufferedSource;

/* JADX INFO: loaded from: classes2.dex */
public final class v66 implements Closeable, Flushable {
    public static final ide U = new ide("[a-z0-9_-]{1,120}");
    public final Path E;
    public final long F;
    public final Path G;
    public final Path H;
    public final Path I;
    public final LinkedHashMap J;
    public final mp4 K;
    public long L;
    public int M;
    public RealBufferedSink N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public final t66 T;

    public v66(long j, e45 e45Var, FileSystem fileSystem, Path path) {
        this.E = path;
        this.F = j;
        if (j <= 0) {
            sz6.p("maxSize <= 0");
            throw null;
        }
        this.G = path.e("journal");
        this.H = path.e("journal.tmp");
        this.I = path.e("journal.bkp");
        this.J = new LinkedHashMap(0, 0.75f, true);
        this.K = fd9.c(nai.Z(iuj.g(), e45Var.R0(1, null)));
        this.T = new t66(fileSystem);
    }

    public static void P(String str) {
        if (U.f(str)) {
            return;
        }
        mr9.q(grc.n('\"', "keys must match regex [a-z0-9_-]{1,120}: \"", str));
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0117 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0011, B:11:0x0018, B:13:0x0020, B:15:0x0030, B:23:0x003e, B:26:0x0058, B:30:0x0071, B:32:0x007f, B:34:0x0086, B:27:0x005c, B:29:0x006a, B:38:0x00a6, B:40:0x00ad, B:43:0x00b2, B:45:0x00c3, B:48:0x00c8, B:53:0x0103, B:55:0x010e, B:59:0x0117, B:49:0x00e0, B:51:0x00f5, B:52:0x0100, B:37:0x0096, B:62:0x011c, B:63:0x0123), top: B:66:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(defpackage.v66 r9, defpackage.s31 r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v66.c(v66, s31, boolean):void");
    }

    public final void H(p66 p66Var) {
        RealBufferedSink realBufferedSink;
        int i = p66Var.h;
        String str = p66Var.a;
        if (i > 0 && (realBufferedSink = this.N) != null) {
            realBufferedSink.W("DIRTY");
            realBufferedSink.writeByte(32);
            realBufferedSink.W(str);
            realBufferedSink.writeByte(10);
            realBufferedSink.flush();
        }
        if (p66Var.h > 0 || p66Var.g != null) {
            p66Var.f = true;
            return;
        }
        for (int i2 = 0; i2 < 2; i2++) {
            this.T.i((Path) p66Var.c.get(i2));
            long j = this.L;
            long[] jArr = p66Var.b;
            this.L = j - jArr[i2];
            jArr[i2] = 0;
        }
        this.M++;
        RealBufferedSink realBufferedSink2 = this.N;
        if (realBufferedSink2 != null) {
            realBufferedSink2.W("REMOVE");
            realBufferedSink2.writeByte(32);
            realBufferedSink2.W(str);
            realBufferedSink2.writeByte(10);
        }
        this.J.remove(str);
        if (this.M >= 2000) {
            i();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        H(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void K() {
        /*
            r4 = this;
        L0:
            long r0 = r4.L
            long r2 = r4.F
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L27
            java.util.LinkedHashMap r0 = r4.J
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            p66 r1 = (defpackage.p66) r1
            boolean r2 = r1.f
            if (r2 != 0) goto L12
            r4.H(r1)
            goto L0
        L26:
            return
        L27:
            r0 = 0
            r4.R = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v66.K():void");
    }

    public final synchronized void R() {
        iei ieiVar;
        try {
            RealBufferedSink realBufferedSink = this.N;
            if (realBufferedSink != null) {
                realBufferedSink.close();
            }
            RealBufferedSink realBufferedSinkB = Okio.b(this.T.S(this.H, false));
            Throwable th = null;
            try {
                realBufferedSinkB.W("libcore.io.DiskLruCache");
                realBufferedSinkB.writeByte(10);
                realBufferedSinkB.W("1");
                realBufferedSinkB.writeByte(10);
                realBufferedSinkB.d(1L);
                realBufferedSinkB.writeByte(10);
                realBufferedSinkB.d(2L);
                realBufferedSinkB.writeByte(10);
                realBufferedSinkB.writeByte(10);
                for (p66 p66Var : this.J.values()) {
                    if (p66Var.g != null) {
                        realBufferedSinkB.W("DIRTY");
                        realBufferedSinkB.writeByte(32);
                        realBufferedSinkB.W(p66Var.a);
                        realBufferedSinkB.writeByte(10);
                    } else {
                        realBufferedSinkB.W("CLEAN");
                        realBufferedSinkB.writeByte(32);
                        realBufferedSinkB.W(p66Var.a);
                        for (long j : p66Var.b) {
                            realBufferedSinkB.writeByte(32);
                            realBufferedSinkB.d(j);
                        }
                        realBufferedSinkB.writeByte(10);
                    }
                }
                ieiVar = iei.a;
                try {
                    realBufferedSinkB.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                try {
                    realBufferedSinkB.close();
                } catch (Throwable th4) {
                    mwa.p(th3, th4);
                }
                ieiVar = null;
                th = th3;
            }
            if (th != null) {
                throw th;
            }
            ieiVar.getClass();
            boolean zN = this.T.n(this.G);
            t66 t66Var = this.T;
            if (zN) {
                t66Var.d(this.G, this.I);
                this.T.d(this.H, this.G);
                this.T.i(this.I);
            } else {
                t66Var.d(this.H, this.G);
            }
            t66 t66Var2 = this.T;
            Path path = this.G;
            t66Var2.getClass();
            path.getClass();
            this.N = new RealBufferedSink(new ye7(t66Var2.c(path), new h4(15, this)));
            this.M = 0;
            this.O = false;
            this.S = false;
        } catch (Throwable th5) {
            throw th5;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.P && !this.Q) {
                for (p66 p66Var : (p66[]) this.J.values().toArray(new p66[0])) {
                    s31 s31Var = p66Var.g;
                    if (s31Var != null) {
                        p66 p66Var2 = (p66) s31Var.G;
                        if (x44.r(p66Var2.g, s31Var)) {
                            p66Var2.f = true;
                        }
                    }
                }
                K();
                fd9.z(this.K, null);
                RealBufferedSink realBufferedSink = this.N;
                realBufferedSink.getClass();
                realBufferedSink.close();
                this.N = null;
                this.Q = true;
                return;
            }
            this.Q = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized s31 d(String str) {
        if (this.Q) {
            throw new IllegalStateException("cache is closed");
        }
        P(str);
        f();
        p66 p66Var = (p66) this.J.get(str);
        if ((p66Var != null ? p66Var.g : null) != null) {
            return null;
        }
        if (p66Var != null && p66Var.h != 0) {
            return null;
        }
        if (!this.R && !this.S) {
            RealBufferedSink realBufferedSink = this.N;
            realBufferedSink.getClass();
            realBufferedSink.W("DIRTY");
            realBufferedSink.writeByte(32);
            realBufferedSink.W(str);
            realBufferedSink.writeByte(10);
            realBufferedSink.flush();
            if (this.O) {
                return null;
            }
            if (p66Var == null) {
                p66Var = new p66(this, str);
                this.J.put(str, p66Var);
            }
            s31 s31Var = new s31(this, p66Var);
            p66Var.g = s31Var;
            return s31Var;
        }
        i();
        return null;
    }

    public final synchronized r66 e(String str) {
        r66 r66VarA;
        if (this.Q) {
            throw new IllegalStateException("cache is closed");
        }
        P(str);
        f();
        p66 p66Var = (p66) this.J.get(str);
        if (p66Var != null && (r66VarA = p66Var.a()) != null) {
            boolean z = true;
            this.M++;
            RealBufferedSink realBufferedSink = this.N;
            realBufferedSink.getClass();
            realBufferedSink.W("READ");
            realBufferedSink.writeByte(32);
            realBufferedSink.W(str);
            realBufferedSink.writeByte(10);
            if (this.M < 2000) {
                z = false;
            }
            if (z) {
                i();
            }
            return r66VarA;
        }
        return null;
    }

    public final synchronized void f() {
        try {
            if (this.P) {
                return;
            }
            this.T.i(this.H);
            if (this.T.n(this.I)) {
                boolean zN = this.T.n(this.G);
                t66 t66Var = this.T;
                Path path = this.I;
                if (zN) {
                    t66Var.i(path);
                } else {
                    t66Var.d(path, this.G);
                }
            }
            if (this.T.n(this.G)) {
                try {
                    n();
                    j();
                    this.P = true;
                    return;
                } catch (IOException unused) {
                    try {
                        close();
                        bjk.c(this.T, this.E);
                        this.Q = false;
                        R();
                        this.P = true;
                    } catch (Throwable th) {
                        this.Q = false;
                        throw th;
                    }
                }
            }
            R();
            this.P = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (this.P) {
            if (this.Q) {
                throw new IllegalStateException("cache is closed");
            }
            K();
            RealBufferedSink realBufferedSink = this.N;
            realBufferedSink.getClass();
            realBufferedSink.flush();
        }
    }

    public final void i() {
        gb9.D(this.K, null, null, new kk0(this, null, 25), 3);
    }

    public final void j() {
        Iterator it = this.J.values().iterator();
        long j = 0;
        while (it.hasNext()) {
            p66 p66Var = (p66) it.next();
            int i = 0;
            if (p66Var.g == null) {
                while (i < 2) {
                    j += p66Var.b[i];
                    i++;
                }
            } else {
                p66Var.g = null;
                while (i < 2) {
                    Path path = (Path) p66Var.c.get(i);
                    t66 t66Var = this.T;
                    t66Var.i(path);
                    t66Var.i((Path) p66Var.d.get(i));
                    i++;
                }
                it.remove();
            }
        }
        this.L = j;
    }

    public final void n() throws Throwable {
        iei ieiVar;
        t66 t66Var = this.T;
        Path path = this.G;
        RealBufferedSource realBufferedSourceC = Okio.c(t66Var.T(path));
        Throwable th = null;
        try {
            String strO = realBufferedSourceC.O(Long.MAX_VALUE);
            String strO2 = realBufferedSourceC.O(Long.MAX_VALUE);
            String strO3 = realBufferedSourceC.O(Long.MAX_VALUE);
            String strO4 = realBufferedSourceC.O(Long.MAX_VALUE);
            String strO5 = realBufferedSourceC.O(Long.MAX_VALUE);
            if (!"libcore.io.DiskLruCache".equals(strO) || !"1".equals(strO2) || !x44.r(String.valueOf(1), strO3) || !x44.r(String.valueOf(2), strO4) || strO5.length() > 0) {
                throw new IOException("unexpected journal header: [" + strO + ", " + strO2 + ", " + strO3 + ", " + strO4 + ", " + strO5 + ']');
            }
            int i = 0;
            while (true) {
                try {
                    x(realBufferedSourceC.O(Long.MAX_VALUE));
                    i++;
                } catch (EOFException unused) {
                    this.M = i - this.J.size();
                    if (realBufferedSourceC.F()) {
                        t66Var.getClass();
                        path.getClass();
                        this.N = new RealBufferedSink(new ye7(t66Var.c(path), new h4(15, this)));
                    } else {
                        R();
                    }
                    ieiVar = iei.a;
                    try {
                        realBufferedSourceC.close();
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            }
        } catch (Throwable th3) {
            try {
                realBufferedSourceC.close();
            } catch (Throwable th4) {
                mwa.p(th3, th4);
            }
            th = th3;
            ieiVar = null;
        }
        if (th != null) {
            throw th;
        }
        ieiVar.getClass();
    }

    public final void x(String str) throws IOException {
        String strSubstring;
        int iF0 = bsg.F0(str, ' ', 0, 6);
        if (iF0 == -1) {
            xh6.c("unexpected journal line: ".concat(str));
            return;
        }
        int i = iF0 + 1;
        int iF02 = bsg.F0(str, ' ', i, 4);
        LinkedHashMap linkedHashMap = this.J;
        if (iF02 == -1) {
            strSubstring = str.substring(i);
            if (iF0 == 6 && isg.q0(str, "REMOVE", false)) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iF02);
        }
        Object p66Var = linkedHashMap.get(strSubstring);
        if (p66Var == null) {
            p66Var = new p66(this, strSubstring);
            linkedHashMap.put(strSubstring, p66Var);
        }
        p66 p66Var2 = (p66) p66Var;
        if (iF02 == -1 || iF0 != 5 || !isg.q0(str, "CLEAN", false)) {
            if (iF02 == -1 && iF0 == 5 && isg.q0(str, "DIRTY", false)) {
                p66Var2.g = new s31(this, p66Var2);
                return;
            } else {
                if (iF02 == -1 && iF0 == 4 && isg.q0(str, "READ", false)) {
                    return;
                }
                xh6.c("unexpected journal line: ".concat(str));
                return;
            }
        }
        List listX0 = bsg.X0(str.substring(iF02 + 1), new char[]{' '}, 6);
        p66Var2.e = true;
        p66Var2.g = null;
        if (listX0.size() != 2) {
            sz6.q("unexpected journal line: ", listX0);
            return;
        }
        try {
            int size = listX0.size();
            for (int i2 = 0; i2 < size; i2++) {
                p66Var2.b[i2] = Long.parseLong((String) listX0.get(i2));
            }
        } catch (NumberFormatException unused) {
            sz6.q("unexpected journal line: ", listX0);
        }
    }
}
