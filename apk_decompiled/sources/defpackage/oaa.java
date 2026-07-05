package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class oaa {
    public static final oaa f = new oaa(null, null, null, null, null);
    public final clh a;
    public final clh b;
    public final clh c;
    public final bz7 d;
    public final bz7 e;

    public oaa(clh clhVar, clh clhVar2, clh clhVar3, bz7 bz7Var, bz7 bz7Var2) {
        this.a = clhVar;
        this.b = clhVar2;
        this.c = clhVar3;
        this.d = bz7Var;
        this.e = bz7Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oaa)) {
            return false;
        }
        oaa oaaVar = (oaa) obj;
        return x44.r(this.a, oaaVar.a) && x44.r(this.b, oaaVar.b) && x44.r(this.c, oaaVar.c) && x44.r(this.d, oaaVar.d) && x44.r(this.e, oaaVar.e);
    }

    public final int hashCode() {
        clh clhVar = this.a;
        int iHashCode = (clhVar == null ? 0 : Long.hashCode(clhVar.a)) * 31;
        clh clhVar2 = this.b;
        int iHashCode2 = (iHashCode + (clhVar2 == null ? 0 : Long.hashCode(clhVar2.a))) * 31;
        clh clhVar3 = this.c;
        int iHashCode3 = (iHashCode2 + (clhVar3 == null ? 0 : Long.hashCode(clhVar3.a))) * 31;
        bz7 bz7Var = this.d;
        int iHashCode4 = (iHashCode3 + (bz7Var == null ? 0 : bz7Var.hashCode())) * 31;
        bz7 bz7Var2 = this.e;
        return iHashCode4 + (bz7Var2 != null ? bz7Var2.hashCode() : 0);
    }

    public final String toString() {
        return "ListStyle(markerIndent=" + this.a + ", contentsIndent=" + this.b + ", itemSpacing=" + this.c + ", orderedMarkers=" + this.d + ", unorderedMarkers=" + this.e + ")";
    }
}
