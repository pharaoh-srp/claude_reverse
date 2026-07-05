package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class kla {
    public final lla a;
    public final fla b;
    public final String c;
    public final String d;
    public final Boolean e;
    public final ula f;

    public kla(lla llaVar, fla flaVar, String str, String str2, Boolean bool, ula ulaVar) {
        this.a = llaVar;
        this.b = flaVar;
        this.c = str;
        this.d = str2;
        this.e = bool;
        this.f = ulaVar;
    }

    public final qh9 a() {
        qh9 qh9Var = new qh9();
        qh9Var.p(2L, "format_version");
        lla llaVar = this.a;
        if (llaVar != null) {
            qh9 qh9Var2 = new qh9();
            tla tlaVar = llaVar.a;
            if (tlaVar != null) {
                qh9Var2.o("plan", new vh9(tlaVar.E));
            }
            int i = llaVar.b;
            if (i != 0) {
                qh9Var2.o("session_precondition", new vh9(y6a.k(i)));
            }
            qh9Var.o("session", qh9Var2);
        }
        fla flaVar = this.b;
        if (flaVar != null) {
            qh9 qh9Var3 = new qh9();
            qh9Var3.p(flaVar.a, "session_sample_rate");
            Number number = flaVar.b;
            if (number != null) {
                qh9Var3.p(number, "session_replay_sample_rate");
            }
            Number number2 = flaVar.c;
            if (number2 != null) {
                qh9Var3.p(number2, "profiling_sample_rate");
            }
            Number number3 = flaVar.d;
            if (number3 != null) {
                qh9Var3.p(number3, "trace_sample_rate");
            }
            qh9Var.o("configuration", qh9Var3);
        }
        String str = this.c;
        if (str != null) {
            qh9Var.r("browser_sdk_version", str);
        }
        String str2 = this.d;
        if (str2 != null) {
            qh9Var.r("sdk_name", str2);
        }
        Boolean bool = this.e;
        if (bool != null) {
            qh9Var.q("discarded", bool);
        }
        ula ulaVar = this.f;
        if (ulaVar != null) {
            qh9 qh9Var4 = new qh9();
            int i2 = ulaVar.a;
            if (i2 != 0) {
                qh9Var4.o("status", new vh9(y6a.j(i2)));
            }
            int i3 = ulaVar.b;
            if (i3 != 0) {
                qh9Var4.o("error_reason", new vh9(y6a.f(i3)));
            }
            qh9Var.o("profiling", qh9Var4);
        }
        return qh9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kla)) {
            return false;
        }
        kla klaVar = (kla) obj;
        return x44.r(this.a, klaVar.a) && x44.r(this.b, klaVar.b) && x44.r(this.c, klaVar.c) && x44.r(this.d, klaVar.d) && x44.r(this.e, klaVar.e) && x44.r(this.f, klaVar.f);
    }

    public final int hashCode() {
        lla llaVar = this.a;
        int iHashCode = (llaVar == null ? 0 : llaVar.hashCode()) * 31;
        fla flaVar = this.b;
        int iHashCode2 = (iHashCode + (flaVar == null ? 0 : flaVar.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.e;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        ula ulaVar = this.f;
        return iHashCode5 + (ulaVar != null ? ulaVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Dd(session=");
        sb.append(this.a);
        sb.append(", configuration=");
        sb.append(this.b);
        sb.append(", browserSdkVersion=");
        kgh.u(sb, this.c, ", sdkName=", this.d, ", discarded=");
        sb.append(this.e);
        sb.append(", profiling=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
