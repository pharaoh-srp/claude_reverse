package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class w3h {
    public static final w3h f = new w3h(null, 0 == true ? 1 : 0, 31);
    public final tkh a;
    public final clh b;
    public final va6 c;
    public final d54 d;
    public final Float e;

    public /* synthetic */ w3h(va6 va6Var, d54 d54Var, int i) {
        this(null, null, (i & 4) != 0 ? null : va6Var, (i & 8) != 0 ? null : d54Var, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w3h)) {
            return false;
        }
        w3h w3hVar = (w3h) obj;
        return x44.r(this.a, w3hVar.a) && x44.r(this.b, w3hVar.b) && x44.r(this.c, w3hVar.c) && x44.r(this.d, w3hVar.d) && x44.r(this.e, w3hVar.e);
    }

    public final int hashCode() {
        tkh tkhVar = this.a;
        int iHashCode = (tkhVar == null ? 0 : tkhVar.hashCode()) * 31;
        clh clhVar = this.b;
        int iHashCode2 = (iHashCode + (clhVar == null ? 0 : Long.hashCode(clhVar.a))) * 31;
        va6 va6Var = this.c;
        int iHashCode3 = (iHashCode2 + (va6Var == null ? 0 : Float.hashCode(va6Var.E))) * 31;
        d54 d54Var = this.d;
        int iHashCode4 = (iHashCode3 + (d54Var == null ? 0 : Long.hashCode(d54Var.a))) * 31;
        Float f2 = this.e;
        return iHashCode4 + (f2 != null ? f2.hashCode() : 0);
    }

    public final String toString() {
        return "TableStyle(headerTextStyle=" + this.a + ", cellPadding=" + this.b + ", cellMaxWidth=" + this.c + ", borderColor=" + this.d + ", borderStrokeWidth=" + this.e + ")";
    }

    public w3h(tkh tkhVar, clh clhVar, va6 va6Var, d54 d54Var, Float f2) {
        this.a = tkhVar;
        this.b = clhVar;
        this.c = va6Var;
        this.d = d54Var;
        this.e = f2;
    }
}
