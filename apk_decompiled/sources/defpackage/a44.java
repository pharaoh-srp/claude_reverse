package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class a44 {
    public final String a;
    public final tkh b;
    public final boolean c;
    public final boolean d;

    public a44(String str, tkh tkhVar, boolean z, boolean z2) {
        str.getClass();
        tkhVar.getClass();
        this.a = str;
        this.b = tkhVar;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a44)) {
            return false;
        }
        a44 a44Var = (a44) obj;
        return x44.r(this.a, a44Var.a) && x44.r(this.b, a44Var.b) && this.c == a44Var.c && this.d == a44Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + fsh.p(gid.n(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        return "MessageState(text=" + this.a + ", textStyle=" + this.b + ", isLoading=" + this.c + ", isError=" + this.d + ")";
    }
}
