package defpackage;

import java.io.EOFException;
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
public final class u66 implements AutoCloseable {
    public static final ide V = new ide("[a-z0-9_-]{1,120}");
    public final Path E;
    public final long F;
    public final Path G;
    public final Path H;
    public final Path I;
    public final LinkedHashMap J;
    public final mp4 K;
    public final Object L;
    public long M;
    public int N;
    public RealBufferedSink O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public final s66 U;

    public u66(long j, FileSystem fileSystem, Path path) {
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
        myg mygVarG = iuj.g();
        ft5 ft5Var = g86.a;
        vr5 vr5Var = vr5.G;
        d45 d45Var = e45.F;
        this.K = fd9.c(nai.Z(mygVarG, vr5Var.R0(1, null)));
        this.L = new Object();
        this.U = new s66(fileSystem);
    }

    public static void P(String str) {
        if (V.f(str)) {
            return;
        }
        mr9.q(ij0.j("keys must match regex [a-z0-9_-]{1,120}: \"", str, "\""));
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x011c A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0003, B:8:0x0013, B:12:0x001a, B:14:0x0022, B:16:0x0032, B:24:0x0040, B:27:0x005a, B:35:0x0076, B:37:0x0084, B:39:0x008b, B:28:0x005e, B:30:0x006c, B:31:0x0070, B:34:0x0075, B:43:0x00ab, B:45:0x00b2, B:48:0x00b7, B:50:0x00c8, B:53:0x00cd, B:58:0x0108, B:60:0x0113, B:64:0x011c, B:54:0x00e5, B:56:0x00fa, B:57:0x0105, B:42:0x009b, B:67:0x0121, B:68:0x0128), top: B:72:0x0003, inners: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(defpackage.u66 r10, defpackage.s31 r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u66.c(u66, s31, boolean):void");
    }

    public final void H(o66 o66Var) {
        RealBufferedSink realBufferedSink;
        int i = o66Var.h;
        String str = o66Var.a;
        if (i > 0 && (realBufferedSink = this.O) != null) {
            realBufferedSink.W("DIRTY");
            realBufferedSink.writeByte(32);
            realBufferedSink.W(str);
            realBufferedSink.writeByte(10);
            realBufferedSink.flush();
        }
        if (o66Var.h > 0 || o66Var.g != null) {
            o66Var.f = true;
            return;
        }
        for (int i2 = 0; i2 < 2; i2++) {
            this.U.i((Path) o66Var.c.get(i2));
            long j = this.M;
            long[] jArr = o66Var.b;
            this.M = j - jArr[i2];
            jArr[i2] = 0;
        }
        this.N++;
        RealBufferedSink realBufferedSink2 = this.O;
        if (realBufferedSink2 != null) {
            realBufferedSink2.W("REMOVE");
            realBufferedSink2.writeByte(32);
            realBufferedSink2.W(str);
            realBufferedSink2.writeByte(10);
            realBufferedSink2.flush();
        }
        this.J.remove(str);
        if (this.N >= 2000) {
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
            long r0 = r4.M
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
            o66 r1 = (defpackage.o66) r1
            boolean r2 = r1.f
            if (r2 != 0) goto L12
            r4.H(r1)
            goto L0
        L26:
            return
        L27:
            r0 = 0
            r4.S = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u66.K():void");
    }

    public final void R() {
        Throwable th;
        synchronized (this.L) {
            try {
                RealBufferedSink realBufferedSink = this.O;
                if (realBufferedSink != null) {
                    realBufferedSink.close();
                }
                RealBufferedSink realBufferedSinkB = Okio.b(this.U.S(this.H, false));
                try {
                    realBufferedSinkB.W("libcore.io.DiskLruCache");
                    realBufferedSinkB.writeByte(10);
                    realBufferedSinkB.W("1");
                    realBufferedSinkB.writeByte(10);
                    realBufferedSinkB.d(3L);
                    realBufferedSinkB.writeByte(10);
                    realBufferedSinkB.d(2L);
                    realBufferedSinkB.writeByte(10);
                    realBufferedSinkB.writeByte(10);
                    for (o66 o66Var : this.J.values()) {
                        if (o66Var.g != null) {
                            realBufferedSinkB.W("DIRTY");
                            realBufferedSinkB.writeByte(32);
                            realBufferedSinkB.W(o66Var.a);
                            realBufferedSinkB.writeByte(10);
                        } else {
                            realBufferedSinkB.W("CLEAN");
                            realBufferedSinkB.writeByte(32);
                            realBufferedSinkB.W(o66Var.a);
                            for (long j : o66Var.b) {
                                realBufferedSinkB.writeByte(32);
                                realBufferedSinkB.d(j);
                            }
                            realBufferedSinkB.writeByte(10);
                        }
                    }
                    try {
                        realBufferedSinkB.close();
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    try {
                        realBufferedSinkB.close();
                    } catch (Throwable th4) {
                        mwa.p(th3, th4);
                    }
                    th = th3;
                }
                if (th != null) {
                    throw th;
                }
                boolean zN = this.U.n(this.G);
                s66 s66Var = this.U;
                if (zN) {
                    s66Var.d(this.G, this.I);
                    this.U.d(this.H, this.G);
                    this.U.i(this.I);
                } else {
                    s66Var.d(this.H, this.G);
                }
                s66 s66Var2 = this.U;
                Path path = this.G;
                s66Var2.getClass();
                path.getClass();
                this.O = new RealBufferedSink(new xe7(s66Var2.c(path), new py3(16, this)));
                this.N = 0;
                this.P = false;
                this.T = false;
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.L) {
            try {
                if (this.Q && !this.R) {
                    for (o66 o66Var : (o66[]) this.J.values().toArray(new o66[0])) {
                        s31 s31Var = o66Var.g;
                        if (s31Var != null) {
                            o66 o66Var2 = (o66) s31Var.G;
                            if (x44.r(o66Var2.g, s31Var)) {
                                o66Var2.f = true;
                            }
                        }
                    }
                    K();
                    fd9.z(this.K, null);
                    RealBufferedSink realBufferedSink = this.O;
                    realBufferedSink.getClass();
                    realBufferedSink.close();
                    this.O = null;
                    this.R = true;
                    return;
                }
                this.R = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final s31 d(String str) {
        synchronized (this.L) {
            if (this.R) {
                throw new IllegalStateException("cache is closed");
            }
            P(str);
            f();
            o66 o66Var = (o66) this.J.get(str);
            if ((o66Var != null ? o66Var.g : null) != null) {
                return null;
            }
            if (o66Var != null && o66Var.h != 0) {
                return null;
            }
            if (!this.S && !this.T) {
                RealBufferedSink realBufferedSink = this.O;
                realBufferedSink.getClass();
                realBufferedSink.W("DIRTY");
                realBufferedSink.writeByte(32);
                realBufferedSink.W(str);
                realBufferedSink.writeByte(10);
                realBufferedSink.flush();
                if (this.P) {
                    return null;
                }
                if (o66Var == null) {
                    o66Var = new o66(this, str);
                    this.J.put(str, o66Var);
                }
                s31 s31Var = new s31(this, o66Var);
                o66Var.g = s31Var;
                return s31Var;
            }
            i();
            return null;
        }
    }

    public final q66 e(String str) {
        q66 q66VarA;
        synchronized (this.L) {
            if (this.R) {
                throw new IllegalStateException("cache is closed");
            }
            P(str);
            f();
            o66 o66Var = (o66) this.J.get(str);
            if (o66Var != null && (q66VarA = o66Var.a()) != null) {
                boolean z = true;
                this.N++;
                RealBufferedSink realBufferedSink = this.O;
                realBufferedSink.getClass();
                realBufferedSink.W("READ");
                realBufferedSink.writeByte(32);
                realBufferedSink.W(str);
                realBufferedSink.writeByte(10);
                realBufferedSink.flush();
                if (this.N < 2000) {
                    z = false;
                }
                if (z) {
                    i();
                }
                return q66VarA;
            }
            return null;
        }
    }

    public final void f() {
        synchronized (this.L) {
            try {
                if (this.Q) {
                    return;
                }
                this.U.i(this.H);
                if (this.U.n(this.I)) {
                    boolean zN = this.U.n(this.G);
                    s66 s66Var = this.U;
                    Path path = this.I;
                    if (zN) {
                        s66Var.i(path);
                    } else {
                        s66Var.d(path, this.G);
                    }
                }
                if (this.U.n(this.G)) {
                    try {
                        n();
                        j();
                        this.Q = true;
                        return;
                    } catch (IOException unused) {
                        try {
                            close();
                            vlk.e(this.U, this.E);
                            this.R = false;
                            R();
                            this.Q = true;
                        } catch (Throwable th) {
                            this.R = false;
                            throw th;
                        }
                    }
                }
                R();
                this.Q = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void i() {
        gb9.D(this.K, null, null, new kk0(this, null, 24), 3);
    }

    public final void j() {
        Iterator it = this.J.values().iterator();
        long j = 0;
        while (it.hasNext()) {
            o66 o66Var = (o66) it.next();
            int i = 0;
            if (o66Var.g == null) {
                while (i < 2) {
                    j += o66Var.b[i];
                    i++;
                }
            } else {
                o66Var.g = null;
                while (i < 2) {
                    Path path = (Path) o66Var.c.get(i);
                    s66 s66Var = this.U;
                    s66Var.i(path);
                    s66Var.i((Path) o66Var.d.get(i));
                    i++;
                }
                it.remove();
            }
        }
        this.M = j;
    }

    public final void n() throws Throwable {
        s66 s66Var = this.U;
        Path path = this.G;
        RealBufferedSource realBufferedSourceC = Okio.c(s66Var.T(path));
        try {
            String strO = realBufferedSourceC.O(Long.MAX_VALUE);
            String strO2 = realBufferedSourceC.O(Long.MAX_VALUE);
            String strO3 = realBufferedSourceC.O(Long.MAX_VALUE);
            String strO4 = realBufferedSourceC.O(Long.MAX_VALUE);
            String strO5 = realBufferedSourceC.O(Long.MAX_VALUE);
            if (!"libcore.io.DiskLruCache".equals(strO) || !"1".equals(strO2) || !x44.r(String.valueOf(3), strO3) || !x44.r(String.valueOf(2), strO4) || strO5.length() > 0) {
                throw new IOException("unexpected journal header: [" + strO + ", " + strO2 + ", " + strO3 + ", " + strO4 + ", " + strO5 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    x(realBufferedSourceC.O(Long.MAX_VALUE));
                    i++;
                } catch (EOFException unused) {
                    this.N = i - this.J.size();
                    if (realBufferedSourceC.F()) {
                        s66Var.getClass();
                        path.getClass();
                        this.O = new RealBufferedSink(new xe7(s66Var.c(path), new py3(16, this)));
                    } else {
                        R();
                    }
                    try {
                        realBufferedSourceC.close();
                        th = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            try {
                realBufferedSourceC.close();
            } catch (Throwable th3) {
                mwa.p(th, th3);
            }
        }
        if (th != null) {
            throw th;
        }
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
        Object o66Var = linkedHashMap.get(strSubstring);
        if (o66Var == null) {
            o66Var = new o66(this, strSubstring);
            linkedHashMap.put(strSubstring, o66Var);
        }
        o66 o66Var2 = (o66) o66Var;
        if (iF02 == -1 || iF0 != 5 || !isg.q0(str, "CLEAN", false)) {
            if (iF02 == -1 && iF0 == 5 && isg.q0(str, "DIRTY", false)) {
                o66Var2.g = new s31(this, o66Var2);
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
        o66Var2.e = true;
        o66Var2.g = null;
        if (listX0.size() != 2) {
            sz6.q("unexpected journal line: ", listX0);
            return;
        }
        try {
            int size = listX0.size();
            for (int i2 = 0; i2 < size; i2++) {
                o66Var2.b[i2] = Long.parseLong((String) listX0.get(i2));
            }
        } catch (NumberFormatException unused) {
            sz6.q("unexpected journal line: ", listX0);
        }
    }
}
