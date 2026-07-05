package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class mab {
    public final String a;
    public final Map b;

    public mab(String str, Map map) {
        this.a = str;
        this.b = mwa.V(map);
    }

    public final Map a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mab)) {
            return false;
        }
        mab mabVar = (mab) obj;
        return x44.r(this.a, mabVar.a) && x44.r(this.b, mabVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Key(key=" + this.a + ", extras=" + this.b + ")";
    }
}
