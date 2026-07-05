package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class t1j implements u1j {
    public final String a;
    public final String b;
    public final zy7 c;
    public final zy7 d;

    public t1j(zy7 zy7Var, zy7 zy7Var2, String str, String str2) {
        str.getClass();
        str2.getClass();
        zy7Var.getClass();
        zy7Var2.getClass();
        this.a = str;
        this.b = str2;
        this.c = zy7Var;
        this.d = zy7Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1j)) {
            return false;
        }
        t1j t1jVar = (t1j) obj;
        return x44.r(this.a, t1jVar.a) && x44.r(this.b, t1jVar.b) && x44.r(this.c, t1jVar.c) && x44.r(this.d, t1jVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + kgh.l(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder sbR = kgh.r("Retryable(title=", this.a, ", subtitle=", this.b, ", onRetry=");
        sbR.append(this.c);
        sbR.append(", onDismiss=");
        sbR.append(this.d);
        sbR.append(")");
        return sbR.toString();
    }
}
