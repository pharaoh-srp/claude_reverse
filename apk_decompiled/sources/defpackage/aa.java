package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class aa {
    public final String a;
    public final int b;
    public final Boolean c;

    public aa(String str, int i, Boolean bool) {
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
        if (!(obj instanceof aa)) {
            return false;
        }
        aa aaVar = (aa) obj;
        return x44.r(this.a, aaVar.a) && this.b == aaVar.b && x44.r(this.c, aaVar.c);
    }

    public final int hashCode() {
        int iC = qy1.c(this.b, this.a.hashCode() * 31, 31);
        Boolean bool = this.c;
        return iC + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sbX = sq6.x("ActionEventSession(id=", this.a, ", type=");
        int i = this.b;
        sbX.append(i != 1 ? i != 2 ? i != 3 ? "null" : "CI_TEST" : "SYNTHETICS" : "USER");
        sbX.append(", hasReplay=");
        sbX.append(this.c);
        sbX.append(")");
        return sbX.toString();
    }
}
