package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ohd implements phd {
    public final h21 a;
    public final vt6 b;
    public final Integer c;

    public ohd(h21 h21Var, vt6 vt6Var, Integer num) {
        this.a = h21Var;
        this.b = vt6Var;
        this.c = num;
    }

    public final Integer a() {
        return this.c;
    }

    public final vt6 b() {
        return this.b;
    }

    public final h21 c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ohd)) {
            return false;
        }
        ohd ohdVar = (ohd) obj;
        return this.a == ohdVar.a && x44.r(this.b, ohdVar.b) && x44.r(this.c, ohdVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        vt6 vt6Var = this.b;
        int iHashCode2 = (iHashCode + (vt6Var == null ? 0 : vt6Var.hashCode())) * 31;
        Integer num = this.c;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "Failed(reason=" + this.a + ", message=" + this.b + ", httpStatusCode=" + this.c + ")";
    }

    public /* synthetic */ ohd(h21 h21Var) {
        this(h21Var, null, null);
    }
}
