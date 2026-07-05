package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class yph implements s7b, r7b {
    public final s7b E;
    public final long F;
    public r7b G;

    public yph(s7b s7bVar, long j) {
        this.E = s7bVar;
        this.F = j;
    }

    @Override // defpackage.r7b
    public final void a(s7b s7bVar) {
        r7b r7bVar = this.G;
        r7bVar.getClass();
        r7bVar.a(this);
    }

    @Override // defpackage.anf
    public final boolean b() {
        return this.E.b();
    }

    @Override // defpackage.s7b
    public final long c(f87[] f87VarArr, boolean[] zArr, b4f[] b4fVarArr, boolean[] zArr2, long j) {
        b4f[] b4fVarArr2 = new b4f[b4fVarArr.length];
        int i = 0;
        while (true) {
            b4f b4fVar = null;
            if (i >= b4fVarArr.length) {
                break;
            }
            xph xphVar = (xph) b4fVarArr[i];
            if (xphVar != null) {
                b4fVar = xphVar.E;
            }
            b4fVarArr2[i] = b4fVar;
            i++;
        }
        s7b s7bVar = this.E;
        long j2 = this.F;
        long jC = s7bVar.c(f87VarArr, zArr, b4fVarArr2, zArr2, j - j2);
        for (int i2 = 0; i2 < b4fVarArr.length; i2++) {
            b4f b4fVar2 = b4fVarArr2[i2];
            if (b4fVar2 == null) {
                b4fVarArr[i2] = null;
            } else {
                b4f b4fVar3 = b4fVarArr[i2];
                if (b4fVar3 == null || ((xph) b4fVar3).E != b4fVar2) {
                    b4fVarArr[i2] = new xph(b4fVar2, j2);
                }
            }
        }
        return jC + j2;
    }

    @Override // defpackage.anf
    public final long d() {
        long jD = this.E.d();
        if (jD == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jD + this.F;
    }

    @Override // defpackage.s7b
    public final long e(long j, wef wefVar) {
        long j2 = this.F;
        return this.E.e(j - j2, wefVar) + j2;
    }

    @Override // defpackage.s7b
    public final void f() {
        this.E.f();
    }

    @Override // defpackage.s7b
    public final long g(long j) {
        long j2 = this.F;
        return this.E.g(j - j2) + j2;
    }

    @Override // defpackage.s7b
    public final void h(long j) {
        this.E.h(j - this.F);
    }

    @Override // defpackage.r7b
    public final void i(anf anfVar) {
        r7b r7bVar = this.G;
        r7bVar.getClass();
        r7bVar.i(this);
    }

    @Override // defpackage.s7b
    public final long k() {
        long jK = this.E.k();
        if (jK == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return jK + this.F;
    }

    @Override // defpackage.s7b
    public final void l(r7b r7bVar, long j) {
        this.G = r7bVar;
        this.E.l(this, j - this.F);
    }

    @Override // defpackage.s7b
    public final w3i m() {
        return this.E.m();
    }

    @Override // defpackage.anf
    public final boolean o(oca ocaVar) {
        nca ncaVar = new nca();
        long j = ocaVar.a;
        ncaVar.b = ocaVar.b;
        ncaVar.c = ocaVar.c;
        ncaVar.a = j - this.F;
        return this.E.o(new oca(ncaVar));
    }

    @Override // defpackage.anf
    public final long p() {
        long jP = this.E.p();
        if (jP == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jP + this.F;
    }

    @Override // defpackage.anf
    public final void r(long j) {
        this.E.r(j - this.F);
    }
}
