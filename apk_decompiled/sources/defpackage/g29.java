package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class g29 {
    public static final g29 d = new g29(null, null, null);
    public final mnc a;
    public final rz7 b;
    public final rz7 c;

    public g29(mnc mncVar, rz7 rz7Var, rz7 rz7Var2) {
        this.a = mncVar;
        this.b = rz7Var;
        this.c = rz7Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g29)) {
            return false;
        }
        g29 g29Var = (g29) obj;
        return x44.r(this.a, g29Var.a) && x44.r(this.b, g29Var.b) && x44.r(this.c, g29Var.c);
    }

    public final int hashCode() {
        mnc mncVar = this.a;
        int iHashCode = (mncVar == null ? 0 : mncVar.hashCode()) * 31;
        rz7 rz7Var = this.b;
        int iHashCode2 = (iHashCode + (rz7Var == null ? 0 : rz7Var.hashCode())) * 31;
        rz7 rz7Var2 = this.c;
        return iHashCode2 + (rz7Var2 != null ? rz7Var2.hashCode() : 0);
    }

    public final String toString() {
        return "InfoPanelStyle(contentPadding=" + this.a + ", background=" + this.b + ", textStyle=" + this.c + ")";
    }
}
