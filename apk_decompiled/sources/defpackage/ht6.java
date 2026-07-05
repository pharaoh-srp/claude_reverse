package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ht6 {
    public final String a;
    public final boolean b;
    public final String c;
    public final String d;

    public ht6(String str, boolean z, String str2, String str3) {
        this.a = str;
        this.b = z;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ht6)) {
            return false;
        }
        ht6 ht6Var = (ht6) obj;
        return this.a.equals(ht6Var.a) && this.b == ht6Var.b && this.c.equals(ht6Var.c) && x44.r(this.d, ht6Var.d);
    }

    public final int hashCode() {
        int iL = kgh.l(fsh.p(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return iL + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Thread(name=");
        sb.append(this.a);
        sb.append(", crashed=");
        sb.append(this.b);
        sb.append(", stack=");
        return vb7.t(sb, this.c, ", state=", this.d, ")");
    }
}
