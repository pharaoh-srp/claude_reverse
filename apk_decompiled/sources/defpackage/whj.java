package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class whj implements zhj {
    public final int a;
    public final String b;
    public final xhj c;
    public final Integer d;
    public final String e;
    public final Integer f;
    public final Long g;
    public final String h;
    public final Long i;
    public final Long j;
    public final String k;

    public whj(int i, String str, xhj xhjVar, Integer num, String str2, Integer num2, Long l, String str3, Long l2, Long l3, String str4) {
        str.getClass();
        this.a = i;
        this.b = str;
        this.c = xhjVar;
        this.d = num;
        this.e = str2;
        this.f = num2;
        this.g = l;
        this.h = str3;
        this.i = l2;
        this.j = l3;
        this.k = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof whj)) {
            return false;
        }
        whj whjVar = (whj) obj;
        return this.a == whjVar.a && x44.r(this.b, whjVar.b) && this.c == whjVar.c && x44.r(this.d, whjVar.d) && x44.r(this.e, whjVar.e) && x44.r(this.f, whjVar.f) && x44.r(this.g, whjVar.g) && x44.r(this.h, whjVar.h) && x44.r(this.i, whjVar.i) && x44.r(this.j, whjVar.j) && x44.r(this.k, whjVar.k);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + kgh.l(Integer.hashCode(this.a) * 31, 31, this.b)) * 31;
        Integer num = this.d;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.e;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.f;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l = this.g;
        int iHashCode5 = (iHashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.h;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l2 = this.i;
        int iHashCode7 = (iHashCode6 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.j;
        int iHashCode8 = (iHashCode7 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str3 = this.k;
        return iHashCode8 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Agent(index=");
        sb.append(this.a);
        sb.append(", label=");
        sb.append(this.b);
        sb.append(", state=");
        sb.append(this.c);
        sb.append(", phaseIndex=");
        sb.append(this.d);
        sb.append(", phaseTitle=");
        sb.append(this.e);
        sb.append(", tokens=");
        sb.append(this.f);
        sb.append(", durationMs=");
        sb.append(this.g);
        sb.append(", error=");
        sb.append(this.h);
        sb.append(", startedAtMillis=");
        sb.append(this.i);
        sb.append(", lastProgressAtMillis=");
        sb.append(this.j);
        sb.append(", lastToolName=");
        return ij0.m(sb, this.k, ")");
    }
}
