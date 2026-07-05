package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class l9a extends f0 {
    public final i9a a = new i9a();
    public final int b;
    public boolean c;

    public l9a(int i) {
        this.b = i;
    }

    @Override // defpackage.f0
    public final boolean c(jr1 jr1Var) {
        if (!this.c) {
            return true;
        }
        jr1 jr1Var2 = (jr1) this.a.a;
        if (!(jr1Var2 instanceof y7a)) {
            return true;
        }
        ((y7a) jr1Var2).g = false;
        return true;
    }

    @Override // defpackage.f0
    public final jr1 f() {
        return this.a;
    }

    @Override // defpackage.f0
    public final boolean g() {
        return true;
    }

    @Override // defpackage.f0
    public final kr1 i(z96 z96Var) {
        if (z96Var.i) {
            if (this.a.b == null) {
                return null;
            }
            jr1 jr1VarF = z96Var.h().f();
            this.c = (jr1VarF instanceof arc) || (jr1VarF instanceof i9a);
            return kr1.a(z96Var.f);
        }
        int i = z96Var.h;
        int i2 = this.b;
        if (i >= i2) {
            return new kr1(-1, z96Var.d + i2, false);
        }
        return null;
    }
}
