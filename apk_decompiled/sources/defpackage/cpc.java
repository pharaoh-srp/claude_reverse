package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class cpc implements Serializable {
    public final Object E;
    public final Object F;

    public cpc(Object obj, Object obj2) {
        this.E = obj;
        this.F = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cpc)) {
            return false;
        }
        cpc cpcVar = (cpc) obj;
        return x44.r(this.E, cpcVar.E) && x44.r(this.F, cpcVar.F);
    }

    public final int hashCode() {
        Object obj = this.E;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.F;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.E + ", " + this.F + ')';
    }
}
