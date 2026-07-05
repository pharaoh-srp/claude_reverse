package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.media3.common.ParserException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ekd implements s7b, yd7 {
    public static final Map v0;
    public static final jw7 w0;
    public final Uri E;
    public final tg5 F;
    public final xg6 G;
    public final am4 H;
    public final tg6 I;
    public final tg6 J;
    public final hkd K;
    public final xv8 L;
    public final long M;
    public final jw7 N;
    public final long O;
    public final xv8 P;
    public final xv8 Q;
    public final hf4 R;
    public final xjd S;
    public final xjd T;
    public final Handler U;
    public r7b V;
    public gv8 W;
    public akd[] X;
    public a4f[] Y;
    public dkd[] Z;
    public boolean a0;
    public boolean b0;
    public boolean c0;
    public boolean d0;
    public c61 e0;
    public vef f0;
    public long g0;
    public boolean h0;
    public int i0;
    public final long j0 = Long.MIN_VALUE;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public int n0;
    public boolean o0;
    public long p0;
    public long q0;
    public boolean r0;
    public int s0;
    public boolean t0;
    public boolean u0;

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        v0 = Collections.unmodifiableMap(map);
        iw7 iw7Var = new iw7();
        iw7Var.a = "icy";
        iw7Var.n = gkb.k("application/x-icy");
        w0 = new jw7(iw7Var);
    }

    public ekd(Uri uri, tg5 tg5Var, xv8 xv8Var, xg6 xg6Var, tg6 tg6Var, am4 am4Var, tg6 tg6Var2, hkd hkdVar, xv8 xv8Var2, int i, jw7 jw7Var, long j, hee heeVar) {
        this.E = uri;
        this.F = tg5Var;
        this.G = xg6Var;
        this.J = tg6Var;
        this.H = am4Var;
        this.I = tg6Var2;
        this.K = hkdVar;
        this.L = xv8Var2;
        this.M = i;
        this.N = jw7Var;
        this.P = heeVar != null ? new xv8(1, heeVar) : new xv8("ProgressiveMediaPeriod");
        this.Q = xv8Var;
        this.O = j;
        this.R = new hf4();
        this.S = new xjd(this, 1);
        this.T = new xjd(this, 2);
        this.U = tpi.k(null);
        this.Z = new dkd[0];
        this.Y = new a4f[0];
        this.X = new akd[0];
        this.q0 = -9223372036854775807L;
        this.i0 = 1;
    }

    public final void A(vef vefVar) {
        this.f0 = this.W == null ? vefVar : new z91(-9223372036854775807L);
        this.g0 = vefVar.g();
        boolean z = !this.o0 && vefVar.g() == -9223372036854775807L;
        this.h0 = z;
        this.i0 = z ? 7 : 1;
        if (this.b0) {
            this.K.t(this.g0, vefVar, z);
        } else {
            u();
        }
    }

    public final void B() {
        bkd bkdVar = new bkd(this, this.E, this.F, this.Q, this, this.R);
        if (this.b0) {
            fd9.M(t());
            long j = this.j0;
            if (j == Long.MIN_VALUE) {
                j = this.g0;
            }
            if (j != -9223372036854775807L && this.q0 > j) {
                this.t0 = true;
                this.q0 = -9223372036854775807L;
                return;
            }
            vef vefVar = this.f0;
            vefVar.getClass();
            long j2 = vefVar.e(this.q0).a.b;
            long j3 = this.q0;
            bkdVar.f.a = j2;
            bkdVar.i = j3;
            bkdVar.h = true;
            bkdVar.l = false;
            for (a4f a4fVar : this.Y) {
                a4fVar.t = this.q0;
            }
            this.q0 = -9223372036854775807L;
        }
        this.s0 = i();
        int iT = this.H.t(this.i0);
        xv8 xv8Var = this.P;
        xv8Var.getClass();
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        xv8Var.H = null;
        xba xbaVar = new xba(xv8Var, looperMyLooper, bkdVar, this, iT, SystemClock.elapsedRealtime());
        fd9.M(((xba) xv8Var.G) == null);
        xv8Var.G = xbaVar;
        xbaVar.b();
    }

    public final boolean C() {
        return this.l0 || t();
    }

    public final void a() {
        fd9.M(this.b0);
        this.e0.getClass();
        this.f0.getClass();
    }

    @Override // defpackage.anf
    public final boolean b() {
        boolean z;
        if (this.t0 || !this.P.u()) {
            return false;
        }
        hf4 hf4Var = this.R;
        synchronized (hf4Var) {
            z = hf4Var.b;
        }
        return z;
    }

    @Override // defpackage.s7b
    public final long c(f87[] f87VarArr, boolean[] zArr, b4f[] b4fVarArr, boolean[] zArr2, long j) throws Throwable {
        f87 f87Var;
        a();
        c61 c61Var = this.e0;
        w3i w3iVar = (w3i) c61Var.F;
        boolean[] zArr3 = (boolean[]) c61Var.H;
        int i = this.n0;
        for (int i2 = 0; i2 < f87VarArr.length; i2++) {
            b4f b4fVar = b4fVarArr[i2];
            if (b4fVar != null && (f87VarArr[i2] == null || !zArr[i2])) {
                int i3 = ((ckd) b4fVar).E;
                fd9.M(zArr3[i3]);
                this.n0--;
                zArr3[i3] = false;
                b4fVarArr[i2] = null;
            }
        }
        boolean z = !this.k0 ? j == 0 || this.d0 : i != 0;
        for (int i4 = 0; i4 < f87VarArr.length; i4++) {
            if (b4fVarArr[i4] == null && (f87Var = f87VarArr[i4]) != null) {
                fd9.M(f87Var.length() == 1);
                fd9.M(f87Var.e(0) == 0);
                int iIndexOf = w3iVar.b.indexOf(f87Var.a());
                if (iIndexOf < 0) {
                    iIndexOf = -1;
                }
                fd9.M(!zArr3[iIndexOf]);
                this.n0++;
                zArr3[iIndexOf] = true;
                this.m0 = f87Var.h().u | this.m0;
                b4fVarArr[i4] = new ckd(this, iIndexOf);
                zArr2[i4] = true;
                if (!z) {
                    a4f a4fVar = this.Y[iIndexOf];
                    z = (a4fVar.q + a4fVar.s == 0 || a4fVar.r(j, true)) ? false : true;
                }
            }
        }
        if (this.n0 == 0) {
            this.r0 = false;
            this.l0 = false;
            this.m0 = false;
            xv8 xv8Var = this.P;
            if (xv8Var.u()) {
                for (a4f a4fVar2 : this.Y) {
                    a4fVar2.i();
                }
                xba xbaVar = (xba) xv8Var.G;
                xbaVar.getClass();
                xbaVar.a(false);
            } else {
                this.t0 = false;
                for (a4f a4fVar3 : this.Y) {
                    a4fVar3.q(false);
                }
            }
        } else if (z) {
            j = g(j);
            for (int i5 = 0; i5 < b4fVarArr.length; i5++) {
                if (b4fVarArr[i5] != null) {
                    zArr2[i5] = true;
                }
            }
        }
        this.k0 = true;
        return j;
    }

    @Override // defpackage.anf
    public final long d() {
        return p();
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x00ce A[RETURN] */
    @Override // defpackage.s7b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long e(long r25, defpackage.wef r27) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ekd.e(long, wef):long");
    }

    @Override // defpackage.s7b
    public final void f() throws IOException {
        int iT = this.H.t(this.i0);
        xv8 xv8Var = this.P;
        IOException iOException = (IOException) xv8Var.H;
        if (iOException != null) {
            throw iOException;
        }
        xba xbaVar = (xba) xv8Var.G;
        if (xbaVar != null) {
            if (iT == Integer.MIN_VALUE) {
                iT = xbaVar.E;
            }
            IOException iOException2 = xbaVar.I;
            if (iOException2 != null && xbaVar.J > iT) {
                throw iOException2;
            }
        }
        if (this.t0 && !this.b0) {
            throw ParserException.a(null, "Loading finished before preparation is complete.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d4  */
    @Override // defpackage.s7b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long g(long r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ekd.g(long):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    @Override // defpackage.s7b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(long r14) {
        /*
            r13 = this;
            boolean r0 = r13.d0
            if (r0 == 0) goto L6
            goto L61
        L6:
            r13.a()
            boolean r0 = r13.t()
            if (r0 == 0) goto L10
            goto L61
        L10:
            c61 r0 = r13.e0
            java.lang.Object r0 = r0.H
            boolean[] r0 = (boolean[]) r0
            a4f[] r1 = r13.Y
            int r1 = r1.length
            r2 = 0
        L1a:
            if (r2 >= r1) goto L61
            a4f[] r3 = r13.Y
            r4 = r3[r2]
            boolean r3 = r0[r2]
            y3f r10 = r4.a
            monitor-enter(r4)
            int r5 = r4.p     // Catch: java.lang.Throwable -> L42
            r11 = -1
            if (r5 == 0) goto L36
            long[] r6 = r4.n     // Catch: java.lang.Throwable -> L42
            r7 = r5
            int r5 = r4.r     // Catch: java.lang.Throwable -> L42
            r8 = r6[r5]     // Catch: java.lang.Throwable -> L42
            int r6 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r6 >= 0) goto L38
        L36:
            r7 = r14
            goto L57
        L38:
            if (r3 == 0) goto L45
            int r3 = r4.s     // Catch: java.lang.Throwable -> L42
            if (r3 == r7) goto L45
            int r3 = r3 + 1
            r6 = r3
            goto L46
        L42:
            r0 = move-exception
            r13 = r0
            goto L5f
        L45:
            r6 = r7
        L46:
            r9 = 0
            r7 = r14
            int r14 = r4.k(r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L42
            r15 = -1
            if (r14 != r15) goto L51
            monitor-exit(r4)
            goto L58
        L51:
            long r11 = r4.h(r14)     // Catch: java.lang.Throwable -> L42
            monitor-exit(r4)
            goto L58
        L57:
            monitor-exit(r4)
        L58:
            r10.a(r11)
            int r2 = r2 + 1
            r14 = r7
            goto L1a
        L5f:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L42
            throw r13
        L61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ekd.h(long):void");
    }

    public final int i() {
        int i = 0;
        for (a4f a4fVar : this.Y) {
            i += a4fVar.q + a4fVar.p;
        }
        return i;
    }

    @Override // defpackage.yd7
    public final void j() {
        this.a0 = true;
        this.U.post(this.S);
    }

    @Override // defpackage.s7b
    public final long k() {
        if (this.m0) {
            this.m0 = false;
            return this.p0;
        }
        if (!this.l0) {
            return -9223372036854775807L;
        }
        if (!this.t0 && i() <= this.s0) {
            return -9223372036854775807L;
        }
        this.l0 = false;
        return this.p0;
    }

    @Override // defpackage.s7b
    public final void l(r7b r7bVar, long j) {
        this.V = r7bVar;
        jw7 jw7Var = this.N;
        if (jw7Var == null) {
            this.R.c();
            B();
        } else {
            n(0, 3).g(jw7Var);
            A(new w09(-9223372036854775807L, new long[]{0}, new long[]{0}));
            j();
            this.q0 = j;
        }
    }

    @Override // defpackage.s7b
    public final w3i m() {
        a();
        return (w3i) this.e0.F;
    }

    @Override // defpackage.yd7
    public final y3i n(int i, int i2) {
        return z(new dkd(i, false));
    }

    @Override // defpackage.anf
    public final boolean o(oca ocaVar) {
        if (this.t0) {
            return false;
        }
        xv8 xv8Var = this.P;
        if (((IOException) xv8Var.H) != null || this.r0) {
            return false;
        }
        if ((this.b0 || this.N != null) && this.n0 == 0) {
            return false;
        }
        boolean zC = this.R.c();
        if (xv8Var.u()) {
            return zC;
        }
        B();
        return true;
    }

    @Override // defpackage.anf
    public final long p() {
        long jS;
        boolean z;
        long j;
        a();
        if (this.t0 || this.n0 == 0) {
            return Long.MIN_VALUE;
        }
        if (t()) {
            return this.q0;
        }
        if (this.c0) {
            int length = this.Y.length;
            jS = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                c61 c61Var = this.e0;
                if (((boolean[]) c61Var.G)[i] && ((boolean[]) c61Var.H)[i]) {
                    a4f a4fVar = this.Y[i];
                    synchronized (a4fVar) {
                        z = a4fVar.y;
                    }
                    if (z) {
                        continue;
                    } else {
                        a4f a4fVar2 = this.Y[i];
                        synchronized (a4fVar2) {
                            j = a4fVar2.w;
                        }
                        jS = Math.min(jS, j);
                    }
                }
            }
        } else {
            jS = Long.MAX_VALUE;
        }
        if (jS == Long.MAX_VALUE) {
            jS = s(false);
        }
        return jS == Long.MIN_VALUE ? this.p0 : jS;
    }

    @Override // defpackage.yd7
    public final void q(vef vefVar) {
        this.U.post(new yw5(this, 22, vefVar));
    }

    @Override // defpackage.anf
    public final void r(long j) {
        boolean z;
        if (this.n0 <= 0 || t()) {
            return;
        }
        boolean z2 = false;
        if (this.j0 != Long.MIN_VALUE) {
            a();
            boolean z3 = true;
            int i = 0;
            while (true) {
                a4f[] a4fVarArr = this.Y;
                if (i >= a4fVarArr.length) {
                    break;
                }
                c61 c61Var = this.e0;
                if (((boolean[]) c61Var.H)[i] && (((boolean[]) c61Var.G)[i] || !this.c0)) {
                    a4f a4fVar = a4fVarArr[i];
                    synchronized (a4fVar) {
                        z = a4fVar.x != -1;
                    }
                    z3 &= z;
                }
                i++;
            }
            z2 = z3;
        }
        if (z2) {
            this.t0 = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long s(boolean r7) {
        /*
            r6 = this;
            r0 = -9223372036854775808
            r2 = 0
        L3:
            a4f[] r3 = r6.Y
            int r3 = r3.length
            if (r2 >= r3) goto L29
            if (r7 != 0) goto L17
            c61 r3 = r6.e0
            r3.getClass()
            java.lang.Object r3 = r3.H
            boolean[] r3 = (boolean[]) r3
            boolean r3 = r3[r2]
            if (r3 == 0) goto L23
        L17:
            a4f[] r3 = r6.Y
            r3 = r3[r2]
            monitor-enter(r3)
            long r4 = r3.w     // Catch: java.lang.Throwable -> L26
            monitor-exit(r3)
            long r0 = java.lang.Math.max(r0, r4)
        L23:
            int r2 = r2 + 1
            goto L3
        L26:
            r6 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L26
            throw r6
        L29:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ekd.s(boolean):long");
    }

    public final boolean t() {
        return this.q0 != -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:126:? -> B:107:0x017f). Please report as a decompilation issue!!! */
    public final void u() {
        a4f a4fVar;
        int iJ;
        int i;
        gjb gjbVarA;
        long j = this.O;
        if (this.u0 || this.b0 || !this.a0 || this.f0 == null) {
            return;
        }
        char c = 0;
        for (a4f a4fVar2 : this.Y) {
            if (a4fVar2.m() == null) {
                return;
            }
        }
        hf4 hf4Var = this.R;
        synchronized (hf4Var) {
            hf4Var.b = false;
        }
        int length = this.Y.length;
        int i2 = -1;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            char c2 = 1;
            if (i3 >= length) {
                break;
            }
            jw7 jw7VarM = this.Y[i3].m();
            jw7VarM.getClass();
            int iF = gkb.f(jw7VarM.o);
            char c3 = iF != 1 ? iF != 2 ? iF != 3 ? iF != 4 ? (char) 0 : (char) 2 : (char) 1 : (char) 4 : (char) 3;
            if (i2 == 1) {
                c2 = 3;
            } else if (i2 == 2) {
                c2 = 4;
            } else if (i2 != 3) {
                c2 = i2 != 4 ? (char) 0 : (char) 2;
            }
            if (c3 > c2) {
                i4 = i3;
                i2 = iF;
            }
            i3++;
        }
        v3i[] v3iVarArr = new v3i[length];
        boolean[] zArr = new boolean[length];
        int i5 = 0;
        while (i5 < length) {
            jw7 jw7VarM2 = this.Y[i5].m();
            jw7VarM2.getClass();
            String str = jw7VarM2.o;
            boolean zG = gkb.g(str);
            boolean z = (zG || gkb.j(str)) ? true : c;
            zArr[i5] = z;
            char c4 = c;
            this.c0 = (this.c0 ? 1 : 0) | (z ? 1 : 0);
            this.d0 = (j != -9223372036854775807L && length == 1 && gkb.h(str)) ? 1 : c4;
            gv8 gv8Var = this.W;
            if (gv8Var != null) {
                int i6 = gv8Var.a;
                if (zG || this.Z[i5].b) {
                    gjb gjbVar = jw7VarM2.l;
                    if (gjbVar == null) {
                        fjb[] fjbVarArr = new fjb[1];
                        fjbVarArr[c4] = gv8Var;
                        gjbVarA = new gjb(fjbVarArr);
                    } else {
                        fjb[] fjbVarArr2 = new fjb[1];
                        fjbVarArr2[c4] = gv8Var;
                        gjbVarA = gjbVar.a(fjbVarArr2);
                    }
                    iw7 iw7VarA = jw7VarM2.a();
                    iw7VarA.k = gjbVarA;
                    jw7VarM2 = new jw7(iw7VarA);
                }
                if (zG && jw7VarM2.h == -1 && jw7VarM2.i == -1 && i6 != -1) {
                    iw7 iw7VarA2 = jw7VarM2.a();
                    iw7VarA2.h = i6;
                    jw7VarM2 = new jw7(iw7VarA2);
                }
            }
            int iE = this.G.e(jw7VarM2);
            iw7 iw7VarA3 = jw7VarM2.a();
            iw7VarA3.O = iE;
            jw7 jw7Var = new jw7(iw7VarA3);
            if (i5 != i4) {
                iw7 iw7VarA4 = jw7Var.a();
                iw7VarA4.l = Integer.toString(i4);
                jw7Var = new jw7(iw7VarA4);
            }
            v3iVarArr[i5] = new v3i(Integer.toString(i5), jw7Var);
            this.m0 = jw7Var.u | this.m0;
            a4f a4fVar3 = this.Y[i5];
            long j2 = this.j0;
            synchronized (a4fVar3) {
                try {
                    if (j2 != a4fVar3.u) {
                        if (j2 == Long.MIN_VALUE) {
                            a4fVar3.x = -1;
                        } else {
                            if (j2 <= a4fVar3.w) {
                                iJ = a4fVar3.j(a4fVar3.r, a4fVar3.p, j2, false);
                                a4fVar = a4fVar3;
                            } else {
                                a4fVar = a4fVar3;
                                iJ = -1;
                            }
                            if (iJ == -1) {
                                i = -1;
                            } else {
                                try {
                                    i = a4fVar.q + iJ;
                                } catch (Throwable th) {
                                    th = th;
                                    throw th;
                                }
                            }
                            a4fVar.x = i;
                            a4fVar.u = j2;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    a4fVar = a4fVar3;
                    throw th;
                }
            }
            i5++;
            c = c4;
        }
        this.e0 = new c61(new w3i(v3iVarArr), zArr);
        if (this.d0 && this.g0 == -9223372036854775807L) {
            this.g0 = j;
            this.f0 = new yjd(this, this.f0);
        }
        this.K.t(this.g0, this.f0, this.h0);
        this.b0 = true;
        r7b r7bVar = this.V;
        r7bVar.getClass();
        r7bVar.a(this);
    }

    public final void v(int i) {
        a();
        c61 c61Var = this.e0;
        boolean[] zArr = (boolean[]) c61Var.I;
        if (zArr[i]) {
            return;
        }
        jw7 jw7Var = ((w3i) c61Var.F).a(i).d[0];
        l7b l7bVar = new l7b(gkb.f(jw7Var.o), jw7Var, tpi.M(this.p0), -9223372036854775807L);
        tg6 tg6Var = this.I;
        tg6Var.a(new u95(tg6Var, 9, l7bVar));
        zArr[i] = true;
    }

    public final void w(int i) {
        a();
        if (this.r0) {
            if ((!this.c0 || ((boolean[]) this.e0.G)[i]) && !this.Y[i].n(false)) {
                this.q0 = 0L;
                this.r0 = false;
                this.l0 = true;
                this.p0 = 0L;
                this.s0 = 0;
                for (a4f a4fVar : this.Y) {
                    a4fVar.q(false);
                }
                r7b r7bVar = this.V;
                r7bVar.getClass();
                r7bVar.i(this);
            }
        }
    }

    public final void x(bkd bkdVar, long j, long j2, boolean z) {
        ymg ymgVar = bkdVar.b;
        uba ubaVar = new uba(bkdVar.j, ymgVar.G, ymgVar.H, j, ymgVar.F);
        this.H.getClass();
        l7b l7bVar = new l7b(-1, null, tpi.M(bkdVar.i), tpi.M(this.g0));
        tg6 tg6Var = this.I;
        tg6Var.a(new c8b(tg6Var, ubaVar, l7bVar, 1));
        if (z) {
            return;
        }
        for (a4f a4fVar : this.Y) {
            a4fVar.q(false);
        }
        if (this.n0 > 0) {
            r7b r7bVar = this.V;
            r7bVar.getClass();
            r7bVar.i(this);
        }
    }

    public final void y(bkd bkdVar, long j, long j2) {
        if (this.g0 == -9223372036854775807L && this.f0 != null) {
            long jS = s(true);
            long j3 = jS == Long.MIN_VALUE ? 0L : jS + 10000;
            this.g0 = j3;
            this.K.t(j3, this.f0, this.h0);
        }
        ymg ymgVar = bkdVar.b;
        uba ubaVar = new uba(bkdVar.j, ymgVar.G, ymgVar.H, j, ymgVar.F);
        this.H.getClass();
        l7b l7bVar = new l7b(-1, null, tpi.M(bkdVar.i), tpi.M(this.g0));
        tg6 tg6Var = this.I;
        tg6Var.a(new c8b(tg6Var, ubaVar, l7bVar, 0));
        this.t0 = true;
        r7b r7bVar = this.V;
        r7bVar.getClass();
        r7bVar.i(this);
    }

    public final y3i z(dkd dkdVar) {
        int length = this.Y.length;
        for (int i = 0; i < length; i++) {
            if (dkdVar.equals(this.Z[i])) {
                return this.Y[i];
            }
        }
        if (this.a0) {
            ysj.u("ProgressiveMediaPeriod", "Extractor added new track (id=" + dkdVar.a + ") after finishing tracks.");
            return new r56();
        }
        xg6 xg6Var = this.G;
        xg6Var.getClass();
        a4f a4fVar = new a4f(this.L, xg6Var, this.J);
        akd akdVar = new akd(a4fVar);
        a4fVar.f = this;
        int i2 = length + 1;
        dkd[] dkdVarArr = (dkd[]) Arrays.copyOf(this.Z, i2);
        dkdVarArr[length] = dkdVar;
        this.Z = dkdVarArr;
        a4f[] a4fVarArr = (a4f[]) Arrays.copyOf(this.Y, i2);
        a4fVarArr[length] = a4fVar;
        this.Y = a4fVarArr;
        akd[] akdVarArr = (akd[]) Arrays.copyOf(this.X, i2);
        akdVarArr[length] = akdVar;
        this.X = akdVarArr;
        return akdVar;
    }
}
