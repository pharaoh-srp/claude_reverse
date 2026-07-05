package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class oij extends ae4 {
    public final me1 k;

    public oij(me1 me1Var) {
        this.k = me1Var;
    }

    public void A() {
        z();
    }

    @Override // defpackage.me1
    public final mqh f() {
        return this.k.f();
    }

    @Override // defpackage.me1
    public final j7b g() {
        return this.k.g();
    }

    @Override // defpackage.me1
    public final boolean h() {
        return this.k.h();
    }

    @Override // defpackage.me1
    public final void k(yp5 yp5Var) {
        this.j = yp5Var;
        this.i = tpi.k(null);
        A();
    }

    @Override // defpackage.me1
    public void r(j7b j7bVar) {
        this.k.r(j7bVar);
    }

    @Override // defpackage.ae4
    public final z7b s(Object obj, z7b z7bVar) {
        return x(z7bVar);
    }

    @Override // defpackage.ae4
    public final long t(long j, Object obj) {
        return j;
    }

    @Override // defpackage.ae4
    public final int u(int i, Object obj) {
        return i;
    }

    @Override // defpackage.ae4
    public final void v(Object obj, me1 me1Var, mqh mqhVar) {
        y(mqhVar);
    }

    public z7b x(z7b z7bVar) {
        return z7bVar;
    }

    public abstract void y(mqh mqhVar);

    public final void z() {
        w(null, this.k);
    }
}
