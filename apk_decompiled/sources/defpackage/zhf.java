package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class zhf implements zeh {
    public long a = 0;
    public long b = 0;
    public phf c = unb.M;
    public final /* synthetic */ xhf d;
    public final /* synthetic */ sif e;
    public final /* synthetic */ long f;

    public zhf(xhf xhfVar, sif sifVar, long j) {
        this.d = xhfVar;
        this.e = sifVar;
        this.f = j;
    }

    @Override // defpackage.zeh
    public final void a(long j, phf phfVar) {
        this.c = phfVar;
        cu9 cu9Var = (cu9) this.d.a();
        sif sifVar = this.e;
        if (cu9Var != null) {
            if (!cu9Var.n()) {
                return;
            }
            phf phfVar2 = this.c;
            ci ciVar = ((tif) sifVar).f;
            if (ciVar != null) {
                ciVar.i(Boolean.TRUE, cu9Var, new fcc(j), phfVar2);
            }
            this.a = j;
        }
        if (uif.a(sifVar, this.f)) {
            this.b = 0L;
        }
    }

    @Override // defpackage.zeh
    public final void b() {
        rhf rhfVar;
        long j = this.f;
        sif sifVar = this.e;
        if (!uif.a(sifVar, j) || (rhfVar = ((tif) sifVar).h) == null) {
            return;
        }
        rhfVar.a();
    }

    @Override // defpackage.zeh
    public final void c() {
    }

    @Override // defpackage.zeh
    public final void d() {
    }

    @Override // defpackage.zeh
    public final void e(long j) {
        cu9 cu9Var = (cu9) this.d.a();
        if (cu9Var == null || !cu9Var.n()) {
            return;
        }
        sif sifVar = this.e;
        if (uif.a(sifVar, this.f)) {
            long jI = fcc.i(this.b, j);
            this.b = jI;
            long jI2 = fcc.i(this.a, jI);
            if (((tif) sifVar).c(cu9Var, jI2, this.a, this.c, true)) {
                this.a = jI2;
                this.b = 0L;
            }
        }
    }

    @Override // defpackage.zeh
    public final void onCancel() {
        rhf rhfVar;
        long j = this.f;
        sif sifVar = this.e;
        if (!uif.a(sifVar, j) || (rhfVar = ((tif) sifVar).h) == null) {
            return;
        }
        rhfVar.a();
    }
}
