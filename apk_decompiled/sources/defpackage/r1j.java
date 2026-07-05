package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class r1j implements u1j {
    public final String a;
    public final String b;
    public final zy7 c;

    public r1j(zy7 zy7Var, String str, String str2) {
        str.getClass();
        str2.getClass();
        zy7Var.getClass();
        this.a = str;
        this.b = str2;
        this.c = zy7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r1j)) {
            return false;
        }
        r1j r1jVar = (r1j) obj;
        return x44.r(this.a, r1jVar.a) && x44.r(this.b, r1jVar.b) && x44.r(this.c, r1jVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kgh.l(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbR = kgh.r("Fatal(title=", this.a, ", subtitle=", this.b, ", onDismiss=");
        sbR.append(this.c);
        sbR.append(")");
        return sbR.toString();
    }
}
