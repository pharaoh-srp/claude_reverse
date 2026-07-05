package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class gya {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final jxa f;

    public gya(boolean z, boolean z2, boolean z3, boolean z4, String str, jxa jxaVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = str;
        this.f = jxaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gya)) {
            return false;
        }
        gya gyaVar = (gya) obj;
        return this.a == gyaVar.a && this.b == gyaVar.b && this.c == gyaVar.c && this.d == gyaVar.d && x44.r(this.e, gyaVar.e) && this.f.equals(gyaVar.f);
    }

    public final int hashCode() {
        int iP = fsh.p(fsh.p(fsh.p(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        return this.f.hashCode() + ((iP + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("McpAppItemUiState(showHeader=");
        sb.append(this.a);
        sb.append(", isHeaderLoading=");
        sb.append(this.b);
        sb.append(", showConnectingText=");
        ij0.A(sb, this.c, ", hasToolResultError=", this.d, ", toolResultRawMessage=");
        sb.append(this.e);
        sb.append(", body=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
