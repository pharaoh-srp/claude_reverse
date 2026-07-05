package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vr4 {
    public final String a;
    public final String b;
    public final String c;
    public final lj2 d;
    public final jx4 e;

    public vr4(String str, String str2, String str3, lj2 lj2Var, jx4 jx4Var) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = lj2Var;
        this.e = jx4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vr4) {
            vr4 vr4Var = (vr4) obj;
            return x44.r(this.a, vr4Var.a) && this.b.equals(vr4Var.b) && x44.r(this.c, vr4Var.c) && this.d == vr4Var.d && this.e == vr4Var.e;
        }
        return false;
    }

    public final int hashCode() {
        int iL = kgh.l(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.e.hashCode() + ((this.d.hashCode() + ((iL + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbR = kgh.r("ConwayClientPermissionRequest(clientName=", this.a, ", displayName=", this.b, ", triggeringTool=");
        sbR.append(this.c);
        sbR.append(", onResolve=");
        sbR.append(this.d);
        sbR.append(", onDismiss=");
        sbR.append(this.e);
        sbR.append(")");
        return sbR.toString();
    }
}
