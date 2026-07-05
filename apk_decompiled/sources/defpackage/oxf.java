package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class oxf {
    public final e0g a;
    public final long b;

    public oxf(e0g e0gVar, long j) {
        e0gVar.getClass();
        this.a = e0gVar;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oxf)) {
            return false;
        }
        oxf oxfVar = (oxf) obj;
        return x44.r(this.a, oxfVar.a) && d54.c(this.b, oxfVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = d54.i;
        return Long.hashCode(this.b) + iHashCode;
    }

    public final String toString() {
        return "SettingRowContainerStyle(shape=" + this.a + ", containerColor=" + d54.i(this.b) + ")";
    }
}
