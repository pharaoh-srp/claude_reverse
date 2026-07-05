package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class oab {
    public final wv8 a;
    public final Map b;

    public oab(wv8 wv8Var, Map map) {
        this.a = wv8Var;
        this.b = mwa.V(map);
    }

    public final Map a() {
        return this.b;
    }

    public final wv8 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oab)) {
            return false;
        }
        oab oabVar = (oab) obj;
        return x44.r(this.a, oabVar.a) && x44.r(this.b, oabVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Value(image=" + this.a + ", extras=" + this.b + ")";
    }

    public /* synthetic */ oab(gr1 gr1Var) {
        this(gr1Var, nm6.E);
    }
}
