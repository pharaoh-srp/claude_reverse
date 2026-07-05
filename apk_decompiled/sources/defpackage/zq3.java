package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zq3 {
    public static final zq3 e = new zq3(null, null, null, null);
    public final tkh a;
    public final iqb b;
    public final clh c;
    public final Boolean d;

    public zq3(tkh tkhVar, iqb iqbVar, clh clhVar, Boolean bool) {
        this.a = tkhVar;
        this.b = iqbVar;
        this.c = clhVar;
        this.d = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zq3)) {
            return false;
        }
        zq3 zq3Var = (zq3) obj;
        return x44.r(this.a, zq3Var.a) && x44.r(this.b, zq3Var.b) && x44.r(this.c, zq3Var.c) && x44.r(this.d, zq3Var.d);
    }

    public final int hashCode() {
        tkh tkhVar = this.a;
        int iHashCode = (tkhVar == null ? 0 : tkhVar.hashCode()) * 31;
        iqb iqbVar = this.b;
        int iHashCode2 = (iHashCode + (iqbVar == null ? 0 : iqbVar.hashCode())) * 31;
        clh clhVar = this.c;
        int iHashCode3 = (iHashCode2 + (clhVar == null ? 0 : Long.hashCode(clhVar.a))) * 31;
        Boolean bool = this.d;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "CodeBlockStyle(textStyle=" + this.a + ", modifier=" + this.b + ", padding=" + this.c + ", wordWrap=" + this.d + ")";
    }
}
