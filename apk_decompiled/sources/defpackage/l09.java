package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class l09 implements hl5, oph, l25 {
    public final k09 a;
    public final m09 b;

    public l09(k09 k09Var, m09 m09Var) {
        this.a = k09Var;
        this.b = m09Var;
    }

    @Override // defpackage.l25
    public final Object a() {
        k09 k09Var = this.a;
        q09 q09Var = k09Var.a;
        k09 k09Var2 = new k09(new q09(q09Var.a, q09Var.b), k09Var.b, k09Var.c, k09Var.d);
        m09 m09Var = this.b;
        return new l09(k09Var2, new m09(m09Var.a, m09Var.b, m09Var.c, m09Var.d, m09Var.e, m09Var.f));
    }

    @Override // defpackage.oph
    public final void b(ao5 ao5Var) {
        this.b.b(ao5Var);
    }

    @Override // defpackage.oph
    public final qw c() {
        return this.b.c;
    }

    @Override // defpackage.oph
    public final void d(Integer num) {
        this.b.b = num;
    }

    @Override // defpackage.oph
    public final void e(Integer num) {
        this.b.f = num;
    }

    @Override // defpackage.ejj
    public final void f(Integer num) {
        this.a.a.b = num;
    }

    @Override // defpackage.oph
    public final Integer g() {
        return this.b.d;
    }

    @Override // defpackage.oph
    public final void h(Integer num) {
        this.b.d = num;
    }

    @Override // defpackage.ejj
    public final Integer i() {
        return this.a.a.a;
    }

    @Override // defpackage.hl5
    public final Integer j() {
        return this.a.c;
    }

    @Override // defpackage.oph
    public final ao5 k() {
        return this.b.k();
    }

    @Override // defpackage.oph
    public final Integer l() {
        return this.b.f;
    }

    @Override // defpackage.oph
    public final Integer m() {
        return this.b.b;
    }

    @Override // defpackage.hl5
    public final Integer n() {
        return this.a.b;
    }

    @Override // defpackage.hl5
    public final void o(Integer num) {
        this.a.b = num;
    }

    @Override // defpackage.oph
    public final void p(qw qwVar) {
        this.b.c = qwVar;
    }

    @Override // defpackage.hl5
    public final Integer q() {
        return this.a.d;
    }

    @Override // defpackage.ejj
    public final void r(Integer num) {
        this.a.a.a = num;
    }

    @Override // defpackage.ejj
    public final Integer s() {
        return this.a.a.b;
    }

    @Override // defpackage.hl5
    public final void t(Integer num) {
        this.a.c = num;
    }

    @Override // defpackage.oph
    public final void u(Integer num) {
        this.b.a = num;
    }

    @Override // defpackage.oph
    public final Integer v() {
        return this.b.a;
    }

    @Override // defpackage.oph
    public final Integer w() {
        return this.b.e;
    }

    @Override // defpackage.oph
    public final void x(Integer num) {
        this.b.e = num;
    }

    @Override // defpackage.hl5
    public final void y(Integer num) {
        this.a.d = num;
    }
}
