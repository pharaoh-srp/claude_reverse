package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class vre implements wd3 {
    public final bz7 a;
    public final String b;

    public vre(String str, bz7 bz7Var) {
        this.a = bz7Var;
        this.b = "must return ".concat(str);
    }

    @Override // defpackage.wd3
    public final boolean a(ge9 ge9Var) {
        return x44.r(ge9Var.K, this.a.invoke(o06.e(ge9Var)));
    }

    @Override // defpackage.wd3
    public final String b(ge9 ge9Var) {
        return zjk.h(this, ge9Var);
    }

    @Override // defpackage.wd3
    public final String getDescription() {
        return this.b;
    }
}
