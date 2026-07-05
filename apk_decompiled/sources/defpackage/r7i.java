package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class r7i implements Serializable {
    public final Object E;
    public final Object F;
    public final Object G;

    public r7i(Object obj, Object obj2, Object obj3) {
        this.E = obj;
        this.F = obj2;
        this.G = obj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r7i)) {
            return false;
        }
        r7i r7iVar = (r7i) obj;
        return x44.r(this.E, r7iVar.E) && x44.r(this.F, r7iVar.F) && x44.r(this.G, r7iVar.G);
    }

    public final int hashCode() {
        Object obj = this.E;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.F;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.G;
        return iHashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.E + ", " + this.F + ", " + this.G + ')';
    }
}
