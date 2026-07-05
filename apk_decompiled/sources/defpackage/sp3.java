package defpackage;

import androidx.media3.exoplayer.source.ClippingMediaSource$IllegalClippingException;

/* JADX INFO: loaded from: classes2.dex */
public final class sp3 implements s7b, r7b {
    public final s7b E;
    public r7b F;
    public rp3[] G = new rp3[0];
    public long H;
    public long I;
    public long J;
    public long K;
    public ClippingMediaSource$IllegalClippingException L;

    public sp3(s7b s7bVar, boolean z, long j, long j2, int i) {
        this.E = s7bVar;
        this.H = z ? j : -9223372036854775807L;
        this.I = -9223372036854775807L;
        this.J = j;
        this.K = j2;
    }

    @Override // defpackage.r7b
    public final void a(s7b s7bVar) {
        if (this.L != null) {
            return;
        }
        r7b r7bVar = this.F;
        r7bVar.getClass();
        r7bVar.a(this);
    }

    @Override // defpackage.anf
    public final boolean b() {
        return this.E.b();
    }

    @Override // defpackage.s7b
    public final long c(f87[] f87VarArr, boolean[] zArr, b4f[] b4fVarArr, boolean[] zArr2, long j) {
        long j2;
        this.G = new rp3[b4fVarArr.length];
        b4f[] b4fVarArr2 = new b4f[b4fVarArr.length];
        for (int i = 0; i < b4fVarArr.length; i++) {
            rp3[] rp3VarArr = this.G;
            rp3 rp3Var = (rp3) b4fVarArr[i];
            rp3VarArr[i] = rp3Var;
            b4fVarArr2[i] = rp3Var != null ? rp3Var.E : null;
        }
        long jC = this.E.c(f87VarArr, zArr, b4fVarArr2, zArr2, j);
        long j3 = this.K;
        long jMax = Math.max(jC, j);
        if (j3 != Long.MIN_VALUE) {
            jMax = Math.min(jMax, j3);
        }
        if (j()) {
            if (jC >= j) {
                if (jC != 0) {
                    for (f87 f87Var : f87VarArr) {
                        if (f87Var != null) {
                            jw7 jw7VarH = f87Var.h();
                            if (!gkb.a(jw7VarH.o, jw7VarH.k)) {
                            }
                        }
                    }
                }
                j2 = -9223372036854775807L;
            }
            j2 = jMax;
            break;
        } else {
            j2 = -9223372036854775807L;
        }
        this.H = j2;
        for (int i2 = 0; i2 < b4fVarArr.length; i2++) {
            b4f b4fVar = b4fVarArr2[i2];
            rp3[] rp3VarArr2 = this.G;
            if (b4fVar == null) {
                rp3VarArr2[i2] = null;
            } else {
                rp3 rp3Var2 = rp3VarArr2[i2];
                if (rp3Var2 == null || rp3Var2.E != b4fVar) {
                    rp3VarArr2[i2] = new rp3(this, b4fVar);
                }
            }
            b4fVarArr[i2] = rp3VarArr2[i2];
        }
        return jMax;
    }

    @Override // defpackage.anf
    public final long d() {
        long jD = this.E.d();
        if (jD != Long.MIN_VALUE) {
            long j = this.K;
            if (j == Long.MIN_VALUE || jD < j) {
                return jD;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.s7b
    public final long e(long j, wef wefVar) {
        long j2 = this.J;
        if (j == j2) {
            return j2;
        }
        long jH = tpi.h(wefVar.a, 0L, j - j2);
        long j3 = wefVar.b;
        long j4 = this.K;
        long jH2 = tpi.h(j3, 0L, j4 == Long.MIN_VALUE ? Long.MAX_VALUE : j4 - j);
        if (jH != wefVar.a || jH2 != wefVar.b) {
            wefVar = new wef(jH, jH2);
        }
        return this.E.e(j, wefVar);
    }

    @Override // defpackage.s7b
    public final void f() throws ClippingMediaSource$IllegalClippingException {
        ClippingMediaSource$IllegalClippingException clippingMediaSource$IllegalClippingException = this.L;
        if (clippingMediaSource$IllegalClippingException != null) {
            throw clippingMediaSource$IllegalClippingException;
        }
        this.E.f();
    }

    @Override // defpackage.s7b
    public final long g(long j) {
        this.H = -9223372036854775807L;
        for (rp3 rp3Var : this.G) {
            if (rp3Var != null) {
                rp3Var.F = false;
            }
        }
        long jG = this.E.g(j);
        long j2 = this.J;
        long j3 = this.K;
        long jMax = Math.max(jG, j2);
        return j3 != Long.MIN_VALUE ? Math.min(jMax, j3) : jMax;
    }

    @Override // defpackage.s7b
    public final void h(long j) {
        this.E.h(j);
    }

    @Override // defpackage.r7b
    public final void i(anf anfVar) {
        r7b r7bVar = this.F;
        r7bVar.getClass();
        r7bVar.i(this);
    }

    public final boolean j() {
        return this.H != -9223372036854775807L;
    }

    @Override // defpackage.s7b
    public final long k() {
        if (j()) {
            long j = this.H;
            this.H = -9223372036854775807L;
            this.I = j;
            long jK = k();
            return jK != -9223372036854775807L ? jK : j;
        }
        long jK2 = this.E.k();
        if (jK2 != -9223372036854775807L) {
            long j2 = this.J;
            long j3 = this.K;
            long jMax = Math.max(jK2, j2);
            if (j3 != Long.MIN_VALUE) {
                jMax = Math.min(jMax, j3);
            }
            if (jMax != this.I) {
                this.I = jMax;
                return jMax;
            }
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.s7b
    public final void l(r7b r7bVar, long j) {
        this.F = r7bVar;
        this.E.l(this, j);
    }

    @Override // defpackage.s7b
    public final w3i m() {
        return this.E.m();
    }

    @Override // defpackage.anf
    public final boolean o(oca ocaVar) {
        return this.E.o(ocaVar);
    }

    @Override // defpackage.anf
    public final long p() {
        long jP = this.E.p();
        if (jP != Long.MIN_VALUE) {
            long j = this.K;
            if (j == Long.MIN_VALUE || jP < j) {
                return jP;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.anf
    public final void r(long j) {
        this.E.r(j);
    }
}
