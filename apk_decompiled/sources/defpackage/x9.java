package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class x9 {
    public final z9 a;
    public final String b;
    public final Long c;
    public final y9 d;
    public final sa e;
    public final ra f;
    public final ka g;
    public final ua h;
    public final ya i;

    public x9(z9 z9Var, String str, Long l, y9 y9Var, sa saVar, ra raVar, ka kaVar, ua uaVar, ya yaVar) {
        this.a = z9Var;
        this.b = str;
        this.c = l;
        this.d = y9Var;
        this.e = saVar;
        this.f = raVar;
        this.g = kaVar;
        this.h = uaVar;
        this.i = yaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x9)) {
            return false;
        }
        x9 x9Var = (x9) obj;
        return this.a == x9Var.a && x44.r(this.b, x9Var.b) && x44.r(this.c, x9Var.c) && x44.r(this.d, x9Var.d) && x44.r(this.e, x9Var.e) && x44.r(this.f, x9Var.f) && x44.r(this.g, x9Var.g) && x44.r(this.h, x9Var.h) && x44.r(this.i, x9Var.i);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.c;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        y9 y9Var = this.d;
        int iHashCode4 = (iHashCode3 + (y9Var == null ? 0 : y9Var.a.hashCode())) * 31;
        sa saVar = this.e;
        int iHashCode5 = (iHashCode4 + (saVar == null ? 0 : saVar.a.hashCode())) * 31;
        ra raVar = this.f;
        int iHashCode6 = (iHashCode5 + (raVar == null ? 0 : Long.hashCode(raVar.a))) * 31;
        ka kaVar = this.g;
        int iHashCode7 = (iHashCode6 + (kaVar == null ? 0 : Long.hashCode(kaVar.a))) * 31;
        ua uaVar = this.h;
        int iHashCode8 = (iHashCode7 + (uaVar == null ? 0 : Long.hashCode(uaVar.a))) * 31;
        ya yaVar = this.i;
        return iHashCode8 + (yaVar != null ? Long.hashCode(yaVar.a) : 0);
    }

    public final String toString() {
        return "ActionEventAction(type=" + this.a + ", id=" + this.b + ", loadingTime=" + this.c + ", target=" + this.d + ", frustration=" + this.e + ", error=" + this.f + ", crash=" + this.g + ", longTask=" + this.h + ", resource=" + this.i + ")";
    }
}
