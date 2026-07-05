package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jxi {
    public final String a;
    public final int b;
    public final Boolean c;
    public final Boolean d;
    public final Boolean e;

    public jxi(String str, int i, Boolean bool, Boolean bool2, Boolean bool3) {
        str.getClass();
        sq6.a(i);
        this.a = str;
        this.b = i;
        this.c = bool;
        this.d = bool2;
        this.e = bool3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jxi)) {
            return false;
        }
        jxi jxiVar = (jxi) obj;
        return x44.r(this.a, jxiVar.a) && this.b == jxiVar.b && x44.r(this.c, jxiVar.c) && x44.r(this.d, jxiVar.d) && x44.r(this.e, jxiVar.e);
    }

    public final int hashCode() {
        int iC = qy1.c(this.b, this.a.hashCode() * 31, 31);
        Boolean bool = this.c;
        int iHashCode = (iC + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.d;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.e;
        return iHashCode2 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbX = sq6.x("ViewEventSession(id=", this.a, ", type=");
        int i = this.b;
        sbX.append(i != 1 ? i != 2 ? i != 3 ? "null" : "CI_TEST" : "SYNTHETICS" : "USER");
        sbX.append(", hasReplay=");
        sbX.append(this.c);
        sbX.append(", isActive=");
        sbX.append(this.d);
        sbX.append(", sampledForReplay=");
        sbX.append(this.e);
        sbX.append(")");
        return sbX.toString();
    }
}
