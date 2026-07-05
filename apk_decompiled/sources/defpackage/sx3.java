package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class sx3 {
    public final boolean a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public sx3(boolean z, int i, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.a = z;
        this.b = i;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sx3)) {
            return false;
        }
        sx3 sx3Var = (sx3) obj;
        return this.a == sx3Var.a && this.b == sx3Var.b && this.c == sx3Var.c && this.d == sx3Var.d && this.e == sx3Var.e && this.f == sx3Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + fsh.p(fsh.p(fsh.p(vb7.c(this.b, Boolean.hashCode(this.a) * 31, 31), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CodeModelPillGate(isCoworkRemote=");
        sb.append(this.a);
        sb.append(", catalogSize=");
        sb.append(this.b);
        sb.append(", isSending=");
        ij0.A(sb, this.c, ", hasSession=", this.d, ", isMidSessionModelSelectorEnabled=");
        sb.append(this.e);
        sb.append(", isReadOnly=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
