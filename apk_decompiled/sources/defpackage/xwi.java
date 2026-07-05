package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xwi {
    public final ywi a;
    public final jwi b;
    public final kwi c;
    public final pwi d;
    public final swi e;
    public final iwi f;

    public xwi(ywi ywiVar, jwi jwiVar, kwi kwiVar, pwi pwiVar, swi swiVar, iwi iwiVar) {
        this.a = ywiVar;
        this.b = jwiVar;
        this.c = kwiVar;
        this.d = pwiVar;
        this.e = swiVar;
        this.f = iwiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xwi)) {
            return false;
        }
        xwi xwiVar = (xwi) obj;
        return x44.r(this.a, xwiVar.a) && x44.r(this.b, xwiVar.b) && x44.r(this.c, xwiVar.c) && x44.r(this.d, xwiVar.d) && x44.r(this.e, xwiVar.e) && x44.r(this.f, xwiVar.f);
    }

    public final int hashCode() {
        ywi ywiVar = this.a;
        int iHashCode = (ywiVar == null ? 0 : ywiVar.hashCode()) * 31;
        jwi jwiVar = this.b;
        int iHashCode2 = (iHashCode + (jwiVar == null ? 0 : jwiVar.hashCode())) * 31;
        kwi kwiVar = this.c;
        int iHashCode3 = (iHashCode2 + (kwiVar == null ? 0 : kwiVar.hashCode())) * 31;
        pwi pwiVar = this.d;
        int iHashCode4 = (iHashCode3 + (pwiVar == null ? 0 : pwiVar.hashCode())) * 31;
        swi swiVar = this.e;
        int iHashCode5 = (iHashCode4 + (swiVar == null ? 0 : swiVar.hashCode())) * 31;
        iwi iwiVar = this.f;
        return iHashCode5 + (iwiVar != null ? Long.hashCode(iwiVar.a) : 0);
    }

    public final String toString() {
        return "Performance(cls=" + this.a + ", fcp=" + this.b + ", fid=" + this.c + ", inp=" + this.d + ", lcp=" + this.e + ", fbc=" + this.f + ")";
    }
}
