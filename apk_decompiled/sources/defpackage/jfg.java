package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jfg {
    public final String a;
    public final hfg b;
    public final pfg c;
    public final tfg d;

    public jfg(String str, hfg hfgVar, pfg pfgVar, tfg tfgVar) {
        this.a = str;
        this.b = hfgVar;
        this.c = pfgVar;
        this.d = tfgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jfg)) {
            return false;
        }
        jfg jfgVar = (jfg) obj;
        return x44.r(this.a, jfgVar.a) && x44.r(this.b, jfgVar.b) && x44.r(this.c, jfgVar.c) && x44.r(this.d, jfgVar.d);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        hfg hfgVar = this.b;
        int iHashCode2 = (iHashCode + (hfgVar == null ? 0 : hfgVar.hashCode())) * 31;
        pfg pfgVar = this.c;
        int iHashCode3 = (iHashCode2 + (pfgVar == null ? 0 : pfgVar.hashCode())) * 31;
        tfg tfgVar = this.d;
        return iHashCode3 + (tfgVar != null ? tfgVar.hashCode() : 0);
    }

    public final String toString() {
        return "Dd(source=" + this.a + ", application=" + this.b + ", session=" + this.c + ", view=" + this.d + ")";
    }
}
