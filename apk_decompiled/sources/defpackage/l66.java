package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class l66 extends bbi {
    public final bbi b;
    public final bbi c;

    public l66(bbi bbiVar, bbi bbiVar2) {
        this.b = bbiVar;
        this.c = bbiVar2;
    }

    @Override // defpackage.bbi
    public final boolean a() {
        return this.b.a() || this.c.a();
    }

    @Override // defpackage.bbi
    public final boolean b() {
        return this.b.b() || this.c.b();
    }

    @Override // defpackage.bbi
    public final wc0 d(wc0 wc0Var) {
        wc0Var.getClass();
        return this.c.d(this.b.d(wc0Var));
    }

    @Override // defpackage.bbi
    public final vai e(yr9 yr9Var) {
        vai vaiVarE = this.b.e(yr9Var);
        return vaiVarE == null ? this.c.e(yr9Var) : vaiVarE;
    }

    @Override // defpackage.bbi
    public final yr9 g(int i, yr9 yr9Var) {
        yr9Var.getClass();
        if (i == 0) {
            throw null;
        }
        return this.c.g(i, this.b.g(i, yr9Var));
    }
}
