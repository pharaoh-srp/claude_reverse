package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class kc2 extends bbi {
    public final /* synthetic */ int b;
    public final bbi c;

    public /* synthetic */ kc2(bbi bbiVar, int i) {
        this.b = i;
        this.c = bbiVar;
    }

    @Override // defpackage.bbi
    public boolean a() {
        switch (this.b) {
            case 0:
                return this.c.a();
            default:
                return super.a();
        }
    }

    @Override // defpackage.bbi
    public boolean b() {
        switch (this.b) {
            case 0:
                return true;
            default:
                return super.b();
        }
    }

    @Override // defpackage.bbi
    public final wc0 d(wc0 wc0Var) {
        int i = this.b;
        bbi bbiVar = this.c;
        wc0Var.getClass();
        switch (i) {
        }
        return bbiVar.d(wc0Var);
    }

    @Override // defpackage.bbi
    public final vai e(yr9 yr9Var) {
        int i = this.b;
        bbi bbiVar = this.c;
        switch (i) {
            case 0:
                vai vaiVarE = bbiVar.e(yr9Var);
                if (vaiVarE == null) {
                    return null;
                }
                xh3 xh3VarA = yr9Var.O().a();
                return qwj.d(vaiVarE, xh3VarA instanceof qai ? (qai) xh3VarA : null);
            default:
                return bbiVar.e(yr9Var);
        }
    }

    @Override // defpackage.bbi
    public final boolean f() {
        int i = this.b;
        bbi bbiVar = this.c;
        switch (i) {
        }
        return bbiVar.f();
    }

    @Override // defpackage.bbi
    public final yr9 g(int i, yr9 yr9Var) {
        int i2 = this.b;
        bbi bbiVar = this.c;
        yr9Var.getClass();
        switch (i2) {
            case 0:
                if (i != 0) {
                    return bbiVar.g(i, yr9Var);
                }
                throw null;
            default:
                if (i != 0) {
                    return bbiVar.g(i, yr9Var);
                }
                throw null;
        }
    }
}
