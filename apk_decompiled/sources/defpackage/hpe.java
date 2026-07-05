package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hpe {
    public final String a;
    public final int b;
    public final Boolean c;

    public hpe(String str, int i, Boolean bool) {
        str.getClass();
        sq6.a(i);
        this.a = str;
        this.b = i;
        this.c = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hpe)) {
            return false;
        }
        hpe hpeVar = (hpe) obj;
        return x44.r(this.a, hpeVar.a) && this.b == hpeVar.b && x44.r(this.c, hpeVar.c);
    }

    public final int hashCode() {
        int iC = qy1.c(this.b, this.a.hashCode() * 31, 31);
        Boolean bool = this.c;
        return iC + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sbX = sq6.x("ResourceEventSession(id=", this.a, ", type=");
        int i = this.b;
        sbX.append(i != 1 ? i != 2 ? i != 3 ? "null" : "CI_TEST" : "SYNTHETICS" : "USER");
        sbX.append(", hasReplay=");
        sbX.append(this.c);
        sbX.append(")");
        return sbX.toString();
    }
}
