package defpackage;

import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class ckd implements b4f {
    public final int E;
    public final /* synthetic */ ekd F;

    public ckd(ekd ekdVar, int i) {
        this.F = ekdVar;
        this.E = i;
    }

    @Override // defpackage.b4f
    public final boolean a() {
        ekd ekdVar = this.F;
        return !ekdVar.C() && ekdVar.Y[this.E].n(ekdVar.t0);
    }

    @Override // defpackage.b4f
    public final int b(qb5 qb5Var, ro5 ro5Var, int i) {
        int i2;
        ekd ekdVar = this.F;
        int i3 = this.E;
        if (ekdVar.C()) {
            return -3;
        }
        ekdVar.v(i3);
        a4f a4fVar = ekdVar.Y[i3];
        boolean z = ekdVar.t0;
        a4fVar.getClass();
        boolean z2 = (i & 2) != 0;
        oo0 oo0Var = a4fVar.b;
        synchronized (a4fVar) {
            ro5Var.J = false;
            int i4 = a4fVar.q;
            int i5 = a4fVar.s;
            int i6 = i4 + i5;
            int i7 = a4fVar.x;
            boolean z3 = i7 != -1 && i6 >= i7;
            if (!(i5 != a4fVar.p) || z3) {
                if (!z && !a4fVar.y && !z3) {
                    jw7 jw7Var = a4fVar.B;
                    if (jw7Var == null || (!z2 && jw7Var == a4fVar.g)) {
                        i2 = -3;
                    } else {
                        a4fVar.p(jw7Var, qb5Var);
                        i2 = -5;
                    }
                }
                ro5Var.F = 4;
                ro5Var.K = Long.MIN_VALUE;
                i2 = -4;
            } else {
                jw7 jw7Var2 = ((z3f) a4fVar.c.e(i6)).a;
                if (!z2 && jw7Var2 == a4fVar.g) {
                    int iL = a4fVar.l(a4fVar.s);
                    if (a4fVar.o(iL)) {
                        ro5Var.F = a4fVar.m[iL];
                        if (a4fVar.s == a4fVar.p - 1 && (z || a4fVar.y)) {
                            ro5Var.a(536870912);
                        }
                        ro5Var.K = a4fVar.n[iL];
                        oo0Var.a = a4fVar.l[iL];
                        oo0Var.b = a4fVar.k[iL];
                        oo0Var.c = a4fVar.o[iL];
                        i2 = -4;
                    } else {
                        ro5Var.J = true;
                        i2 = -3;
                    }
                }
                a4fVar.p(jw7Var2, qb5Var);
                i2 = -5;
            }
        }
        if (i2 == -4 && !ro5Var.c(4)) {
            boolean z4 = (i & 1) != 0;
            if ((i & 4) == 0) {
                y3f y3fVar = a4fVar.a;
                oo0 oo0Var2 = a4fVar.b;
                if (z4) {
                    y3f.e(y3fVar.e, ro5Var, oo0Var2, y3fVar.c);
                } else {
                    y3fVar.e = y3f.e(y3fVar.e, ro5Var, oo0Var2, y3fVar.c);
                }
            }
            if (!z4) {
                a4fVar.s++;
            }
        }
        if (i2 == -3) {
            ekdVar.w(i3);
        }
        return i2;
    }

    @Override // defpackage.b4f
    public final void g() throws IOException {
        int i = this.E;
        ekd ekdVar = this.F;
        a4f a4fVar = ekdVar.Y[i];
        ax5 ax5Var = a4fVar.h;
        if (ax5Var != null && ax5Var.z() == 1) {
            DrmSession$DrmSessionException drmSession$DrmSessionExceptionT = a4fVar.h.t();
            drmSession$DrmSessionExceptionT.getClass();
            throw drmSession$DrmSessionExceptionT;
        }
        xv8 xv8Var = ekdVar.P;
        int iT = ekdVar.H.t(ekdVar.i0);
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
    }

    @Override // defpackage.b4f
    public final int h(long j) {
        int iK;
        ekd ekdVar = this.F;
        int i = this.E;
        boolean z = false;
        if (ekdVar.C()) {
            return 0;
        }
        ekdVar.v(i);
        a4f a4fVar = ekdVar.Y[i];
        boolean z2 = ekdVar.t0;
        synchronized (a4fVar) {
            int iL = a4fVar.l(a4fVar.s);
            int i2 = a4fVar.s;
            int i3 = a4fVar.p;
            if ((i2 != i3) && j >= a4fVar.n[iL]) {
                if (j <= a4fVar.w || !z2) {
                    iK = a4fVar.k(iL, i3 - i2, j, true);
                    if (iK == -1) {
                    }
                } else {
                    iK = i3 - i2;
                }
            }
            iK = 0;
        }
        synchronized (a4fVar) {
            if (iK >= 0) {
                try {
                    if (a4fVar.s + iK <= a4fVar.p) {
                        z = true;
                    }
                } finally {
                }
            }
            fd9.E(z);
            a4fVar.s += iK;
        }
        if (iK == 0) {
            ekdVar.w(i);
        }
        return iK;
    }
}
