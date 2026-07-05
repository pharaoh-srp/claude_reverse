package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uu6 extends av6 {
    public final String a;
    public final hde b;

    public uu6(String str, hde hdeVar) {
        this.a = ouk.h(str);
        this.b = hdeVar;
    }

    @Override // defpackage.av6
    public final int a() {
        return 8;
    }

    @Override // defpackage.av6
    public final boolean b(yj6 yj6Var, yj6 yj6Var2) {
        String str = this.a;
        return yj6Var2.u(str) && this.b.b(yj6Var2.g(str)).B();
    }

    public final String toString() {
        return ij0.l("[", this.a, "~=", this.b.toString(), "]");
    }
}
