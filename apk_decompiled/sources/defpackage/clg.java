package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class clg implements mb0 {
    public final mb0 a;
    public final long b;

    public clg(kl7 kl7Var, long j) {
        this.a = kl7Var;
        this.b = j;
    }

    @Override // defpackage.mb0
    public final dsi a(c9i c9iVar) {
        return new dlg(this.a.a(c9iVar), this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof clg)) {
            return false;
        }
        clg clgVar = (clg) obj;
        return clgVar.b == this.b && x44.r(clgVar.a, this.a);
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
