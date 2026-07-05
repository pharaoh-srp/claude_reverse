package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class rs6 {
    public final ss6 a;
    public final ks6 b;
    public final String c;
    public final String d;
    public final dt6 e;

    public rs6(ss6 ss6Var, ks6 ks6Var, String str, String str2, dt6 dt6Var) {
        this.a = ss6Var;
        this.b = ks6Var;
        this.c = str;
        this.d = str2;
        this.e = dt6Var;
    }

    public final qh9 a() {
        qh9 qh9Var = new qh9();
        qh9Var.p(2L, "format_version");
        ss6 ss6Var = this.a;
        if (ss6Var != null) {
            qh9 qh9Var2 = new qh9();
            ct6 ct6Var = ss6Var.a;
            if (ct6Var != null) {
                qh9Var2.o("plan", new vh9(ct6Var.E));
            }
            int i = ss6Var.b;
            if (i != 0) {
                qh9Var2.o("session_precondition", new vh9(ms6.i(i)));
            }
            qh9Var.o("session", qh9Var2);
        }
        ks6 ks6Var = this.b;
        if (ks6Var != null) {
            qh9 qh9Var3 = new qh9();
            qh9Var3.p(ks6Var.a, "session_sample_rate");
            Number number = ks6Var.b;
            if (number != null) {
                qh9Var3.p(number, "session_replay_sample_rate");
            }
            Number number2 = ks6Var.c;
            if (number2 != null) {
                qh9Var3.p(number2, "profiling_sample_rate");
            }
            Number number3 = ks6Var.d;
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
        dt6 dt6Var = this.e;
        if (dt6Var != null) {
            qh9 qh9Var4 = new qh9();
            int i2 = dt6Var.a;
            if (i2 != 0) {
                qh9Var4.o("status", new vh9(ms6.g(i2)));
            }
            int i3 = dt6Var.b;
            if (i3 != 0) {
                qh9Var4.o("error_reason", new vh9(ms6.o(i3)));
            }
            qh9Var.o("profiling", qh9Var4);
        }
        return qh9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rs6)) {
            return false;
        }
        rs6 rs6Var = (rs6) obj;
        return x44.r(this.a, rs6Var.a) && x44.r(this.b, rs6Var.b) && x44.r(this.c, rs6Var.c) && x44.r(this.d, rs6Var.d) && x44.r(this.e, rs6Var.e);
    }

    public final int hashCode() {
        ss6 ss6Var = this.a;
        int iHashCode = (ss6Var == null ? 0 : ss6Var.hashCode()) * 31;
        ks6 ks6Var = this.b;
        int iHashCode2 = (iHashCode + (ks6Var == null ? 0 : ks6Var.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        dt6 dt6Var = this.e;
        return iHashCode4 + (dt6Var != null ? dt6Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Dd(session=");
        sb.append(this.a);
        sb.append(", configuration=");
        sb.append(this.b);
        sb.append(", browserSdkVersion=");
        kgh.u(sb, this.c, ", sdkName=", this.d, ", profiling=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ rs6(ss6 ss6Var, ks6 ks6Var) {
        this(ss6Var, ks6Var, null, null, null);
    }
}
