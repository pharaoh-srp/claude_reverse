package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class szh {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final int d;

    public szh(int i, boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = i;
    }

    public final zb0 a(ld4 ld4Var) {
        if (b()) {
            e18 e18Var = (e18) ld4Var;
            e18Var.a0(832653086);
            e18Var.p(false);
            return null;
        }
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.a0(-2051349367);
        zb0 zb0VarI = zrk.i(this.d, e18Var2);
        e18Var2.p(false);
        return zb0VarI;
    }

    public final boolean b() {
        return this.d == 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof szh)) {
            return false;
        }
        szh szhVar = (szh) obj;
        return this.a == szhVar.a && this.b == szhVar.b && this.c == szhVar.c && this.d == szhVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + fsh.p(fsh.p(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "ToolSettingUiState(isVisible=" + this.a + ", isBeta=" + this.b + ", isChecked=" + this.c + ", disabledReasonRes=" + this.d + ")";
    }
}
