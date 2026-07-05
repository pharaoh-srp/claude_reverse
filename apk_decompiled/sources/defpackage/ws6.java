package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ws6 {
    public final String a;
    public final int b;
    public final Boolean c;

    public ws6(String str, int i, Boolean bool) {
        str.getClass();
        if (i == 0) {
            throw null;
        }
        this.a = str;
        this.b = i;
        this.c = bool;
    }

    public final qh9 a() {
        qh9 qh9Var = new qh9();
        qh9Var.r("id", this.a);
        qh9Var.o("type", new vh9(ms6.m(this.b)));
        Boolean bool = this.c;
        if (bool != null) {
            qh9Var.q("has_replay", bool);
        }
        return qh9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ws6)) {
            return false;
        }
        ws6 ws6Var = (ws6) obj;
        return x44.r(this.a, ws6Var.a) && this.b == ws6Var.b && x44.r(this.c, ws6Var.c);
    }

    public final int hashCode() {
        int iC = qy1.c(this.b, this.a.hashCode() * 31, 31);
        Boolean bool = this.c;
        return iC + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sbX = sq6.x("ErrorEventSession(id=", this.a, ", type=");
        int i = this.b;
        sbX.append(i != 1 ? i != 2 ? i != 3 ? "null" : "CI_TEST" : "SYNTHETICS" : "USER");
        sbX.append(", hasReplay=");
        sbX.append(this.c);
        sbX.append(")");
        return sbX.toString();
    }
}
