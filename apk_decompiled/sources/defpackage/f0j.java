package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class f0j {
    public final String a;
    public final int b;

    public f0j(String str, int i) {
        str.getClass();
        sq6.a(i);
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0j)) {
            return false;
        }
        f0j f0jVar = (f0j) obj;
        return x44.r(this.a, f0jVar.a) && this.b == f0jVar.b;
    }

    public final int hashCode() {
        return qy1.c(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sbX = sq6.x("VitalAppLaunchEventSession(id=", this.a, ", type=");
        int i = this.b;
        sbX.append(i != 1 ? i != 2 ? i != 3 ? "null" : "CI_TEST" : "SYNTHETICS" : "USER");
        sbX.append(", hasReplay=null)");
        return sbX.toString();
    }
}
