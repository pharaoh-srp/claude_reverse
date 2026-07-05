package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class mt6 implements vt6 {
    public final vt6 a;
    public final int b;
    public final zy7 c;
    public final Integer d;

    public mt6(vt6 vt6Var, int i, zy7 zy7Var, Integer num) {
        zy7Var.getClass();
        this.a = vt6Var;
        this.b = i;
        this.c = zy7Var;
        this.d = num;
    }

    @Override // defpackage.vt6
    public final zb0 a(ld4 ld4Var) {
        e18 e18Var = (e18) ld4Var;
        e18Var.a0(-457432695);
        zb0 zb0VarA = this.a.a(e18Var);
        e18Var.p(false);
        return zb0VarA;
    }

    @Override // defpackage.vt6
    public final Integer b() {
        return this.d;
    }

    @Override // defpackage.vt6
    public final yt6 d() {
        return new wt6(this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mt6)) {
            return false;
        }
        mt6 mt6Var = (mt6) obj;
        return x44.r(this.a, mt6Var.a) && this.b == mt6Var.b && x44.r(this.c, mt6Var.c) && x44.r(this.d, mt6Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + vb7.c(this.b, this.a.hashCode() * 31, 31)) * 31;
        Integer num = this.d;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "ActionableError(message=" + this.a + ", actionLabelResId=" + this.b + ", onAction=" + this.c + ", titleResId=" + this.d + ")";
    }
}
