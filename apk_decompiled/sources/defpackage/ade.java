package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ade {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public ade(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ade)) {
            return false;
        }
        ade adeVar = (ade) obj;
        return this.a.equals(adeVar.a) && this.b.equals(adeVar.b) && x44.r(this.c, adeVar.c) && x44.r(this.d, adeVar.d);
    }

    public final int hashCode() {
        int iL = kgh.l(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iL + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return vb7.t(kgh.r("RefusalFallbackFields(originalModel=", this.a, ", fallbackModel=", this.b, ", category="), this.c, ", explanation=", this.d, ")");
    }
}
