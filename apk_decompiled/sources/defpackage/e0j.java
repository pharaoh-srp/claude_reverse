package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class e0j {
    public final String a;
    public final String b;
    public final int c;
    public final Long d;
    public final int e;
    public final Boolean f;

    public e0j(String str, String str2, int i, Long l, int i2, Boolean bool) {
        sq6.a(i);
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = l;
        this.e = i2;
        this.f = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0j)) {
            return false;
        }
        e0j e0jVar = (e0j) obj;
        return this.a.equals(e0jVar.a) && this.b.equals(e0jVar.b) && this.c == e0jVar.c && this.d.equals(e0jVar.d) && this.e == e0jVar.e && this.f.equals(e0jVar.f);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + qy1.c(this.c, kgh.l(this.a.hashCode() * 31, 961, this.b), 31)) * 31;
        int i = this.e;
        return this.f.hashCode() + ((iHashCode + (i == 0 ? 0 : sq6.F(i))) * 961);
    }

    public final String toString() {
        StringBuilder sbR = kgh.r("Vital(id=", this.a, ", name=", this.b, ", description=null, appLaunchMetric=");
        String str = "null";
        int i = this.c;
        sbR.append(i != 1 ? i != 2 ? "null" : "TTFD" : "TTID");
        sbR.append(", duration=");
        sbR.append(this.d);
        sbR.append(", startupType=");
        int i2 = this.e;
        if (i2 == 1) {
            str = "COLD_START";
        } else if (i2 == 2) {
            str = "WARM_START";
        }
        sbR.append(str);
        sbR.append(", isPrewarmed=null, hasSavedInstanceStateBundle=");
        sbR.append(this.f);
        sbR.append(")");
        return sbR.toString();
    }
}
