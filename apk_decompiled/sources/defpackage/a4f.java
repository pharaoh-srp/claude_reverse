package defpackage;

import android.util.SparseArray;
import java.io.EOFException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class a4f implements y3i {
    public boolean A;
    public jw7 B;
    public boolean C;
    public boolean D;
    public final y3f a;
    public final s20 c;
    public final xg6 d;
    public final tg6 e;
    public ekd f;
    public jw7 g;
    public ax5 h;
    public int p;
    public int q;
    public int r;
    public int s;
    public long t;
    public long u;
    public long v;
    public long w;
    public int x;
    public boolean y;
    public boolean z;
    public final oo0 b = new oo0();
    public int i = 1000;
    public long[] j = new long[1000];
    public long[] k = new long[1000];
    public long[] n = new long[1000];
    public int[] m = new int[1000];
    public int[] l = new int[1000];
    public x3i[] o = new x3i[1000];

    public a4f(xv8 xv8Var, xg6 xg6Var, tg6 tg6Var) {
        this.d = xg6Var;
        this.e = tg6Var;
        this.a = new y3f(xv8Var);
        poc pocVar = new poc(6);
        s20 s20Var = new s20();
        s20Var.F = new SparseArray();
        s20Var.G = pocVar;
        s20Var.E = -1;
        this.c = s20Var;
        this.t = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.w = Long.MIN_VALUE;
        this.A = true;
        this.z = true;
        this.C = true;
        this.u = Long.MIN_VALUE;
        this.x = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00dc A[Catch: all -> 0x0063, TryCatch #0 {all -> 0x0063, blocks: (B:23:0x0045, B:25:0x0049, B:29:0x005f, B:32:0x0066, B:36:0x006e, B:38:0x0081, B:42:0x0089, B:43:0x0090, B:48:0x00c1, B:71:0x0138, B:73:0x0141, B:50:0x00dc, B:52:0x00e5, B:54:0x00ea, B:56:0x00fe, B:60:0x0107, B:61:0x010c, B:63:0x0112, B:67:0x0120, B:69:0x0125, B:70:0x0135, B:53:0x00e8), top: B:78:0x0045 }] */
    @Override // defpackage.y3i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(long r10, int r12, int r13, int r14, defpackage.x3i r15) {
        /*
            Method dump skipped, instruction units count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a4f.a(long, int, int, int, x3i):void");
    }

    @Override // defpackage.y3i
    public final void b(ssc sscVar, int i, int i2) {
        while (true) {
            y3f y3fVar = this.a;
            if (i <= 0) {
                y3fVar.getClass();
                return;
            }
            int iB = y3fVar.b(i);
            hw1 hw1Var = y3fVar.f;
            ow owVar = (ow) hw1Var.G;
            sscVar.k(owVar.a, ((int) (y3fVar.g - hw1Var.E)) + owVar.b, iB);
            i -= iB;
            long j = y3fVar.g + ((long) iB);
            y3fVar.g = j;
            hw1 hw1Var2 = y3fVar.f;
            if (j == hw1Var2.F) {
                y3fVar.f = (hw1) hw1Var2.H;
            }
        }
    }

    @Override // defpackage.y3i
    public final int f(og5 og5Var, int i, boolean z) throws EOFException {
        y3f y3fVar = this.a;
        int iB = y3fVar.b(i);
        hw1 hw1Var = y3fVar.f;
        ow owVar = (ow) hw1Var.G;
        int i2 = og5Var.read(owVar.a, ((int) (y3fVar.g - hw1Var.E)) + owVar.b, iB);
        if (i2 == -1) {
            if (z) {
                return -1;
            }
            sz6.n();
            return 0;
        }
        long j = y3fVar.g + ((long) i2);
        y3fVar.g = j;
        hw1 hw1Var2 = y3fVar.f;
        if (j == hw1Var2.F) {
            y3fVar.f = (hw1) hw1Var2.H;
        }
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0051 A[Catch: all -> 0x004f, TryCatch #0 {all -> 0x004f, blocks: (B:4:0x0002, B:8:0x000e, B:13:0x0020, B:15:0x0039, B:19:0x0053, B:21:0x0061, B:25:0x006a, B:18:0x0051), top: B:35:0x0002 }] */
    @Override // defpackage.y3i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(defpackage.jw7 r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            r0 = 0
            r5.A = r0     // Catch: java.lang.Throwable -> L4f
            jw7 r1 = r5.B     // Catch: java.lang.Throwable -> L4f
            boolean r1 = java.util.Objects.equals(r6, r1)     // Catch: java.lang.Throwable -> L4f
            if (r1 == 0) goto Le
            monitor-exit(r5)
            goto L71
        Le:
            s20 r1 = r5.c     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r1 = r1.F     // Catch: java.lang.Throwable -> L4f
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch: java.lang.Throwable -> L4f
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L4f
            r2 = 1
            if (r1 != 0) goto L1d
            r1 = r2
            goto L1e
        L1d:
            r1 = r0
        L1e:
            if (r1 != 0) goto L51
            s20 r1 = r5.c     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r1 = r1.F     // Catch: java.lang.Throwable -> L4f
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch: java.lang.Throwable -> L4f
            int r3 = r1.size()     // Catch: java.lang.Throwable -> L4f
            int r3 = r3 - r2
            java.lang.Object r1 = r1.valueAt(r3)     // Catch: java.lang.Throwable -> L4f
            z3f r1 = (defpackage.z3f) r1     // Catch: java.lang.Throwable -> L4f
            jw7 r1 = r1.a     // Catch: java.lang.Throwable -> L4f
            boolean r1 = r1.equals(r6)     // Catch: java.lang.Throwable -> L4f
            if (r1 == 0) goto L51
            s20 r6 = r5.c     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r6 = r6.F     // Catch: java.lang.Throwable -> L4f
            android.util.SparseArray r6 = (android.util.SparseArray) r6     // Catch: java.lang.Throwable -> L4f
            int r1 = r6.size()     // Catch: java.lang.Throwable -> L4f
            int r1 = r1 - r2
            java.lang.Object r6 = r6.valueAt(r1)     // Catch: java.lang.Throwable -> L4f
            z3f r6 = (defpackage.z3f) r6     // Catch: java.lang.Throwable -> L4f
            jw7 r6 = r6.a     // Catch: java.lang.Throwable -> L4f
            r5.B = r6     // Catch: java.lang.Throwable -> L4f
            goto L53
        L4f:
            r6 = move-exception
            goto L7f
        L51:
            r5.B = r6     // Catch: java.lang.Throwable -> L4f
        L53:
            boolean r6 = r5.C     // Catch: java.lang.Throwable -> L4f
            jw7 r1 = r5.B     // Catch: java.lang.Throwable -> L4f
            java.lang.String r3 = r1.o     // Catch: java.lang.Throwable -> L4f
            java.lang.String r1 = r1.k     // Catch: java.lang.Throwable -> L4f
            int r4 = defpackage.gkb.f(r3)     // Catch: java.lang.Throwable -> L4f
            if (r4 != r2) goto L69
            boolean r1 = defpackage.gkb.a(r3, r1)     // Catch: java.lang.Throwable -> L4f
            if (r1 == 0) goto L69
            r1 = r2
            goto L6a
        L69:
            r1 = r0
        L6a:
            r6 = r6 & r1
            r5.C = r6     // Catch: java.lang.Throwable -> L4f
            r5.D = r0     // Catch: java.lang.Throwable -> L4f
            monitor-exit(r5)
            r0 = r2
        L71:
            ekd r5 = r5.f
            if (r5 == 0) goto L7e
            if (r0 == 0) goto L7e
            android.os.Handler r6 = r5.U
            xjd r5 = r5.S
            r6.post(r5)
        L7e:
            return
        L7f:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L4f
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a4f.g(jw7):void");
    }

    public final long h(int i) {
        long j = this.v;
        int i2 = 0;
        long jMax = Long.MIN_VALUE;
        if (i != 0) {
            int iL = l(i - 1);
            for (int i3 = 0; i3 < i; i3++) {
                jMax = Math.max(jMax, this.n[iL]);
                if ((this.m[iL] & 1) != 0) {
                    break;
                }
                iL--;
                if (iL == -1) {
                    iL = this.i - 1;
                }
            }
        }
        this.v = Math.max(j, jMax);
        this.p -= i;
        int i4 = this.q + i;
        this.q = i4;
        int i5 = this.r + i;
        this.r = i5;
        int i6 = this.i;
        if (i5 >= i6) {
            this.r = i5 - i6;
        }
        int i7 = this.s - i;
        this.s = i7;
        if (i7 < 0) {
            this.s = 0;
        }
        s20 s20Var = this.c;
        SparseArray sparseArray = (SparseArray) s20Var.F;
        while (i2 < sparseArray.size() - 1) {
            int i8 = i2 + 1;
            if (i4 < sparseArray.keyAt(i8)) {
                break;
            }
            ((poc) s20Var.G).accept(sparseArray.valueAt(i2));
            sparseArray.removeAt(i2);
            int i9 = s20Var.E;
            if (i9 > 0) {
                s20Var.E = i9 - 1;
            }
            i2 = i8;
        }
        if (this.p != 0) {
            return this.k[this.r];
        }
        int i10 = this.r;
        if (i10 == 0) {
            i10 = this.i;
        }
        int i11 = i10 - 1;
        return this.k[i11] + ((long) this.l[i11]);
    }

    public final void i() {
        long jH;
        y3f y3fVar = this.a;
        synchronized (this) {
            int i = this.p;
            jH = i == 0 ? -1L : h(i);
        }
        y3fVar.a(jH);
    }

    public final int j(int i, int i2, long j, boolean z) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.n[i] >= j) {
                return i3;
            }
            i++;
            if (i == this.i) {
                i = 0;
            }
        }
        if (z) {
            return i2;
        }
        return -1;
    }

    public final int k(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.n[i];
            if (j2 > j) {
                break;
            }
            if (!z || (this.m[i] & 1) != 0) {
                if (j2 == j) {
                    return i4;
                }
                i3 = i4;
            }
            i++;
            if (i == this.i) {
                i = 0;
            }
        }
        return i3;
    }

    public final int l(int i) {
        int i2 = this.r + i;
        int i3 = this.i;
        return i2 < i3 ? i2 : i2 - i3;
    }

    public final synchronized jw7 m() {
        return this.A ? null : this.B;
    }

    public final synchronized boolean n(boolean z) {
        jw7 jw7Var;
        int i = this.q;
        int i2 = this.s;
        int i3 = i + i2;
        int i4 = this.x;
        boolean z2 = true;
        if (i4 != -1 && i3 >= i4) {
            return true;
        }
        if (i2 != this.p) {
            if (((z3f) this.c.e(i3)).a != this.g) {
                return true;
            }
            return o(l(this.s));
        }
        if (!z && !this.y && ((jw7Var = this.B) == null || jw7Var == this.g)) {
            z2 = false;
        }
        return z2;
    }

    public final boolean o(int i) {
        ax5 ax5Var = this.h;
        if (ax5Var == null || ax5Var.z() == 4) {
            return true;
        }
        if ((this.m[i] & 1073741824) != 0) {
            return false;
        }
        this.h.getClass();
        return false;
    }

    public final void p(jw7 jw7Var, qb5 qb5Var) {
        jw7 jw7Var2;
        jw7 jw7Var3 = this.g;
        boolean z = jw7Var3 == null;
        rg6 rg6Var = jw7Var3 == null ? null : jw7Var3.s;
        this.g = jw7Var;
        rg6 rg6Var2 = jw7Var.s;
        xg6 xg6Var = this.d;
        if (xg6Var != null) {
            int iE = xg6Var.e(jw7Var);
            iw7 iw7VarA = jw7Var.a();
            iw7VarA.O = iE;
            jw7Var2 = new jw7(iw7VarA);
        } else {
            jw7Var2 = jw7Var;
        }
        qb5Var.F = jw7Var2;
        qb5Var.E = this.h;
        if (xg6Var == null) {
            return;
        }
        if (z || !Objects.equals(rg6Var, rg6Var2)) {
            ax5 ax5Var = this.h;
            tg6 tg6Var = this.e;
            ax5 ax5VarB = xg6Var.b(tg6Var, jw7Var);
            this.h = ax5VarB;
            qb5Var.E = ax5VarB;
            if (ax5Var != null) {
                ax5Var.D(tg6Var);
            }
        }
    }

    public final void q(boolean z) {
        y3f y3fVar = this.a;
        xv8 xv8Var = y3fVar.a;
        hw1 hw1Var = y3fVar.d;
        if (((ow) hw1Var.G) != null) {
            synchronized (xv8Var) {
                ((es5) xv8Var.H).c.b(hw1Var);
                hw1 hw1Var2 = hw1Var;
                while (hw1Var2 != null) {
                    ow owVar = (ow) hw1Var2.G;
                    owVar.getClass();
                    xv8Var.y(owVar);
                    hw1Var2 = (hw1) hw1Var2.H;
                    if (hw1Var2 == null || ((ow) hw1Var2.G) == null) {
                        hw1Var2 = null;
                    }
                }
            }
            hw1Var.G = null;
            hw1Var.H = null;
        }
        hw1 hw1Var3 = y3fVar.d;
        int i = y3fVar.b;
        fd9.M(((ow) hw1Var3.G) == null);
        hw1Var3.E = 0L;
        hw1Var3.F = i;
        hw1 hw1Var4 = y3fVar.d;
        y3fVar.e = hw1Var4;
        y3fVar.f = hw1Var4;
        y3fVar.g = 0L;
        synchronized (xv8Var) {
            ((es5) xv8Var.H).c.d();
        }
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.x = -1;
        this.z = true;
        this.t = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.w = Long.MIN_VALUE;
        this.y = false;
        s20 s20Var = this.c;
        SparseArray sparseArray = (SparseArray) s20Var.F;
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            ((poc) s20Var.G).accept(sparseArray.valueAt(i2));
        }
        s20Var.E = -1;
        sparseArray.clear();
        if (z) {
            this.B = null;
            this.A = true;
            this.C = true;
        }
    }

    public final synchronized boolean r(long j, boolean z) throws Throwable {
        Throwable th;
        a4f a4fVar;
        a4f a4fVar2;
        long j2;
        int iK;
        try {
            synchronized (this) {
                try {
                    try {
                        synchronized (this) {
                            try {
                                this.s = 0;
                                y3f y3fVar = this.a;
                                y3fVar.e = y3fVar.d;
                                try {
                                } catch (Throwable th2) {
                                    th = th2;
                                    a4fVar = this;
                                    th = th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                a4fVar = this;
                                while (true) {
                                    try {
                                        try {
                                            throw th;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            th = th;
                                            throw th;
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                    }
                                }
                            }
                        }
                        return false;
                    } catch (Throwable th6) {
                        th = th6;
                        a4fVar = this;
                    }
                } catch (Throwable th7) {
                    th = th7;
                }
            }
            int iL = l(0);
            long j3 = this.u;
            long jMin = this.w;
            if (j3 != Long.MIN_VALUE) {
                try {
                    jMin = Math.min(jMin, j3);
                } catch (Throwable th8) {
                    th = th8;
                    a4fVar = this;
                }
            }
            int i = this.s;
            int i2 = this.p;
            if (!(i != i2) || j < this.n[iL] || (j > jMin && !z)) {
                return false;
            }
            if (this.C) {
                a4fVar2 = this;
                j2 = j;
                iK = a4fVar2.j(iL, i2 - i, j2, z);
            } else {
                a4fVar2 = this;
                j2 = j;
                iK = a4fVar2.k(iL, i2 - i, j2, true);
            }
            if (iK == -1) {
                return false;
            }
            a4fVar2.t = j2;
            a4fVar2.s += iK;
            return true;
        } catch (Throwable th9) {
            th = th9;
            a4fVar = this;
            th = th;
        }
        throw th;
    }
}
