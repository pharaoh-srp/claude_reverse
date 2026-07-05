package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class pwi {
    public final long a;
    public final Long b;
    public final String c;
    public final qwi d;

    public pwi(long j, Long l, String str, qwi qwiVar) {
        this.a = j;
        this.b = l;
        this.c = str;
        this.d = qwiVar;
    }

    public final qh9 a() {
        qh9 qh9Var = new qh9();
        qh9Var.p(Long.valueOf(this.a), "duration");
        Long l = this.b;
        if (l != null) {
            grc.A(l, qh9Var, "timestamp");
        }
        String str = this.c;
        if (str != null) {
            qh9Var.r("target_selector", str);
        }
        qwi qwiVar = this.d;
        if (qwiVar != null) {
            qh9 qh9Var2 = new qh9();
            qh9Var2.p(Long.valueOf(qwiVar.a), "input_delay");
            qh9Var2.p(Long.valueOf(qwiVar.b), "processing_time");
            qh9Var2.p(Long.valueOf(qwiVar.c), "presentation_delay");
            qh9Var.o("sub_parts", qh9Var2);
        }
        return qh9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pwi)) {
            return false;
        }
        pwi pwiVar = (pwi) obj;
        return this.a == pwiVar.a && x44.r(this.b, pwiVar.b) && x44.r(this.c, pwiVar.c) && x44.r(this.d, pwiVar.d);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        qwi qwiVar = this.d;
        return iHashCode3 + (qwiVar != null ? qwiVar.hashCode() : 0);
    }

    public final String toString() {
        return "Inp(duration=" + this.a + ", timestamp=" + this.b + ", targetSelector=" + this.c + ", subParts=" + this.d + ")";
    }
}
