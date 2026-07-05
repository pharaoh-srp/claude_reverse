package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gwi {
    public final lxi a;
    public final fxi b;

    public gwi(lxi lxiVar, fxi fxiVar) {
        this.a = lxiVar;
        this.b = fxiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gwi)) {
            return false;
        }
        gwi gwiVar = (gwi) obj;
        return x44.r(this.a, gwiVar.a) && x44.r(this.b, gwiVar.b);
    }

    public final int hashCode() {
        lxi lxiVar = this.a;
        int iHashCode = (lxiVar == null ? 0 : lxiVar.hashCode()) * 31;
        fxi fxiVar = this.b;
        return iHashCode + (fxiVar != null ? fxiVar.hashCode() : 0);
    }

    public final String toString() {
        return "Display(viewport=" + this.a + ", scroll=" + this.b + ")";
    }
}
