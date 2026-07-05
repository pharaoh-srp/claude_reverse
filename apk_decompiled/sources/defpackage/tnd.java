package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class tnd {
    public final gnd a;
    public final String b;

    public tnd(gnd gndVar, String str) {
        gndVar.getClass();
        this.a = gndVar;
        this.b = str;
    }

    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tnd)) {
            return false;
        }
        tnd tndVar = (tnd) obj;
        return this.a == tndVar.a && x44.r(this.b, tndVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "ProjectQuery(filter=" + this.a + ", searchQuery=" + this.b + ")";
    }

    public /* synthetic */ tnd(gnd gndVar) {
        this(gndVar, null);
    }
}
