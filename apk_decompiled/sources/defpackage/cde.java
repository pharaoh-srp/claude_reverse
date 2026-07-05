package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class cde {
    public final String a;
    public final String b;
    public final String c;

    public cde(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cde)) {
            return false;
        }
        cde cdeVar = (cde) obj;
        return this.a.equals(cdeVar.a) && this.b.equals(cdeVar.b) && x44.r(this.c, cdeVar.c);
    }

    public final int hashCode() {
        int iL = kgh.l(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iL + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return ij0.m(kgh.r("RefusalPausedFields(originalModel=", this.a, ", fallbackModel=", this.b, ", category="), this.c, ")");
    }
}
