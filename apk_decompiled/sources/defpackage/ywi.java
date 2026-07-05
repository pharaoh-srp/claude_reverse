package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ywi {
    public final Number a;
    public final Long b;
    public final String c;
    public final axi d;
    public final axi e;

    public ywi(Number number, Long l, String str, axi axiVar, axi axiVar2) {
        this.a = number;
        this.b = l;
        this.c = str;
        this.d = axiVar;
        this.e = axiVar2;
    }

    public final qh9 a() {
        qh9 qh9Var = new qh9();
        qh9Var.p(this.a, "score");
        Long l = this.b;
        if (l != null) {
            grc.A(l, qh9Var, "timestamp");
        }
        String str = this.c;
        if (str != null) {
            qh9Var.r("target_selector", str);
        }
        axi axiVar = this.d;
        if (axiVar != null) {
            qh9Var.o("previous_rect", axiVar.a());
        }
        axi axiVar2 = this.e;
        if (axiVar2 != null) {
            qh9Var.o("current_rect", axiVar2.a());
        }
        return qh9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ywi)) {
            return false;
        }
        ywi ywiVar = (ywi) obj;
        return this.a.equals(ywiVar.a) && x44.r(this.b, ywiVar.b) && x44.r(this.c, ywiVar.c) && x44.r(this.d, ywiVar.d) && x44.r(this.e, ywiVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        axi axiVar = this.d;
        int iHashCode4 = (iHashCode3 + (axiVar == null ? 0 : axiVar.hashCode())) * 31;
        axi axiVar2 = this.e;
        return iHashCode4 + (axiVar2 != null ? axiVar2.hashCode() : 0);
    }

    public final String toString() {
        return "PerformanceCls(score=" + this.a + ", timestamp=" + this.b + ", targetSelector=" + this.c + ", previousRect=" + this.d + ", currentRect=" + this.e + ")";
    }
}
