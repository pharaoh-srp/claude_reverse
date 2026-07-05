package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class k9c extends gg9 {
    public final gg9 a;

    public k9c(gg9 gg9Var) {
        this.a = gg9Var;
    }

    @Override // defpackage.gg9
    public final Object fromJson(ci9 ci9Var) {
        if (ci9Var.j() != bi9.M) {
            return this.a.fromJson(ci9Var);
        }
        ci9Var.f();
        return null;
    }

    @Override // defpackage.gg9
    public final void toJson(jj9 jj9Var, Object obj) {
        if (obj == null) {
            jj9Var.x();
        } else {
            this.a.toJson(jj9Var, obj);
        }
    }

    public final String toString() {
        return this.a + ".nullSafe()";
    }
}
