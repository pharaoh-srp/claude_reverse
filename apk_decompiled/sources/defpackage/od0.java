package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class od0 {
    public final String a;
    public final String b;

    public od0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof od0)) {
            return false;
        }
        od0 od0Var = (od0) obj;
        return x44.r(this.a, od0Var.a) && this.b.equals(od0Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return ij0.l("CcrSender(accountUuid=", this.a, ", displayName=", this.b, ")");
    }
}
