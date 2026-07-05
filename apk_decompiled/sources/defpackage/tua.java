package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class tua implements s7b, r7b {
    public final z7b E;
    public final long F;
    public final xv8 G;
    public me1 H;
    public s7b I;
    public r7b J;
    public long K = -9223372036854775807L;

    public tua(z7b z7bVar, xv8 xv8Var, long j) {
        this.E = z7bVar;
        this.G = xv8Var;
        this.F = j;
    }

    @Override // defpackage.r7b
    public final void a(s7b s7bVar) {
        r7b r7bVar = this.J;
        String str = tpi.a;
        r7bVar.a(this);
    }

    @Override // defpackage.anf
    public final boolean b() {
        s7b s7bVar = this.I;
        return s7bVar != null && s7bVar.b();
    }

    @Override // defpackage.s7b
    public final long c(f87[] f87VarArr, boolean[] zArr, b4f[] b4fVarArr, boolean[] zArr2, long j) {
        long j2 = this.K;
        if (j2 != -9223372036854775807L && j == this.F) {
            j = j2;
        }
        this.K = -9223372036854775807L;
        s7b s7bVar = this.I;
        String str = tpi.a;
        return s7bVar.c(f87VarArr, zArr, b4fVarArr, zArr2, j);
    }

    @Override // defpackage.anf
    public final long d() {
        s7b s7bVar = this.I;
        String str = tpi.a;
        return s7bVar.d();
    }

    @Override // defpackage.s7b
    public final long e(long j, wef wefVar) {
        s7b s7bVar = this.I;
        String str = tpi.a;
        return s7bVar.e(j, wefVar);
    }

    @Override // defpackage.s7b
    public final void f() {
        s7b s7bVar = this.I;
        if (s7bVar != null) {
            s7bVar.f();
            return;
        }
        me1 me1Var = this.H;
        if (me1Var != null) {
            me1Var.i();
        }
    }

    @Override // defpackage.s7b
    public final long g(long j) {
        s7b s7bVar = this.I;
        String str = tpi.a;
        return s7bVar.g(j);
    }

    @Override // defpackage.s7b
    public final void h(long j) {
        s7b s7bVar = this.I;
        String str = tpi.a;
        s7bVar.h(j);
    }

    @Override // defpackage.r7b
    public final void i(anf anfVar) {
        r7b r7bVar = this.J;
        String str = tpi.a;
        r7bVar.i(this);
    }

    public final void j(z7b z7bVar) {
        long j = this.K;
        if (j == -9223372036854775807L) {
            j = this.F;
        }
        me1 me1Var = this.H;
        me1Var.getClass();
        s7b s7bVarA = me1Var.a(z7bVar, this.G, j);
        this.I = s7bVarA;
        if (this.J != null) {
            s7bVarA.l(this, j);
        }
    }

    @Override // defpackage.s7b
    public final long k() {
        s7b s7bVar = this.I;
        String str = tpi.a;
        return s7bVar.k();
    }

    @Override // defpackage.s7b
    public final void l(r7b r7bVar, long j) {
        this.J = r7bVar;
        s7b s7bVar = this.I;
        if (s7bVar != null) {
            long j2 = this.K;
            if (j2 == -9223372036854775807L) {
                j2 = this.F;
            }
            s7bVar.l(this, j2);
        }
    }

    @Override // defpackage.s7b
    public final w3i m() {
        s7b s7bVar = this.I;
        String str = tpi.a;
        return s7bVar.m();
    }

    @Override // defpackage.anf
    public final boolean o(oca ocaVar) {
        s7b s7bVar = this.I;
        return s7bVar != null && s7bVar.o(ocaVar);
    }

    @Override // defpackage.anf
    public final long p() {
        s7b s7bVar = this.I;
        String str = tpi.a;
        return s7bVar.p();
    }

    @Override // defpackage.anf
    public final void r(long j) {
        s7b s7bVar = this.I;
        String str = tpi.a;
        s7bVar.r(j);
    }
}
