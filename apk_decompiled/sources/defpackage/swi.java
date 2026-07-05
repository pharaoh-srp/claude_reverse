package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class swi {
    public final long a;
    public final String b;
    public final String c;
    public final twi d;

    public swi(long j, String str, String str2, twi twiVar) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = twiVar;
    }

    public final qh9 a() {
        qh9 qh9Var = new qh9();
        qh9Var.p(Long.valueOf(this.a), "timestamp");
        String str = this.b;
        if (str != null) {
            qh9Var.r("target_selector", str);
        }
        String str2 = this.c;
        if (str2 != null) {
            qh9Var.r("resource_url", str2);
        }
        twi twiVar = this.d;
        if (twiVar != null) {
            qh9 qh9Var2 = new qh9();
            qh9Var2.p(Long.valueOf(twiVar.a), "load_delay");
            qh9Var2.p(Long.valueOf(twiVar.b), "load_time");
            qh9Var2.p(Long.valueOf(twiVar.c), "render_delay");
            qh9Var.o("sub_parts", qh9Var2);
        }
        return qh9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof swi)) {
            return false;
        }
        swi swiVar = (swi) obj;
        return this.a == swiVar.a && x44.r(this.b, swiVar.b) && x44.r(this.c, swiVar.c) && x44.r(this.d, swiVar.d);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        twi twiVar = this.d;
        return iHashCode3 + (twiVar != null ? twiVar.hashCode() : 0);
    }

    public final String toString() {
        return "Lcp(timestamp=" + this.a + ", targetSelector=" + this.b + ", resourceUrl=" + this.c + ", subParts=" + this.d + ")";
    }
}
