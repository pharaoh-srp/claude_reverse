package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hkh {
    public static final hkh c = new hkh(2, false);
    public static final hkh d = new hkh(1, true);
    public final int a;
    public final boolean b;

    public hkh(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hkh)) {
            return false;
        }
        hkh hkhVar = (hkh) obj;
        return this.a == hkhVar.a && this.b == hkhVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return equals(c) ? "TextMotion.Static" : equals(d) ? "TextMotion.Animated" : "Invalid";
    }
}
