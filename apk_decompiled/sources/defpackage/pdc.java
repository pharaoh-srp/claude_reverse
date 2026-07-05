package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pdc extends jzb {
    public final qdc d;
    public boolean e;

    public pdc(qdc qdcVar, rdc rdcVar) {
        boolean z = qdcVar.b;
        this.a = rdcVar;
        this.b = z;
        this.d = qdcVar;
        this.e = true;
    }

    @Override // defpackage.jzb
    public final void a() {
        this.d.a();
    }

    @Override // defpackage.jzb
    public final void b() {
        this.d.b();
    }

    @Override // defpackage.jzb
    public final void c(hzb hzbVar) {
        this.d.c(new ab1(hzbVar));
    }

    @Override // defpackage.jzb
    public final void d(hzb hzbVar) {
        hzbVar.getClass();
        this.d.d(new ab1(hzbVar));
    }

    public final void g(boolean z) {
        this.e = z;
        f(z && this.d.b);
    }
}
