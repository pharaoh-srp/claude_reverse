package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class och {
    public final bm4 a;
    public final long b;
    public final int c;
    public final String d;
    public final hch e;
    public final kch f;
    public final nch g;
    public final gch h;
    public final Float i;
    public final lch j;

    public och(bm4 bm4Var, long j, int i, String str, hch hchVar, kch kchVar, nch nchVar, gch gchVar, Float f, lch lchVar) {
        if (i == 0) {
            throw null;
        }
        str.getClass();
        this.a = bm4Var;
        this.b = j;
        this.c = i;
        this.d = str;
        this.e = hchVar;
        this.f = kchVar;
        this.g = nchVar;
        this.h = gchVar;
        this.i = f;
        this.j = lchVar;
    }

    public final qh9 a() {
        qh9 qh9Var = new qh9();
        qh9 qh9Var2 = new qh9();
        qh9Var2.p(2L, "format_version");
        qh9Var.o("_dd", qh9Var2);
        qh9Var.r("type", "telemetry");
        qh9Var.p(Long.valueOf(this.b), "date");
        qh9Var.r("service", "dd-sdk-android");
        qh9Var.o("source", new vh9(ebh.d(this.c)));
        qh9Var.r("version", this.d);
        qh9 qh9Var3 = new qh9();
        qh9Var3.r("id", this.e.a);
        qh9Var.o("application", qh9Var3);
        qh9 qh9Var4 = new qh9();
        qh9Var4.r("id", this.f.a);
        qh9Var.o("session", qh9Var4);
        nch nchVar = this.g;
        if (nchVar != null) {
            qh9 qh9Var5 = new qh9();
            qh9Var5.r("id", nchVar.a);
            qh9Var.o("view", qh9Var5);
        }
        gch gchVar = this.h;
        if (gchVar != null) {
            qh9 qh9Var6 = new qh9();
            qh9Var6.r("id", gchVar.a);
            qh9Var.o("action", qh9Var6);
        }
        qh9Var.p(this.i, "effective_sample_rate");
        qh9 qh9Var7 = new qh9();
        lch lchVar = this.j;
        ich ichVar = lchVar.a;
        qh9 qh9Var8 = new qh9();
        String str = ichVar.a;
        if (str != null) {
            qh9Var8.r("architecture", str);
        }
        String str2 = ichVar.b;
        if (str2 != null) {
            qh9Var8.r("brand", str2);
        }
        String str3 = ichVar.c;
        if (str3 != null) {
            qh9Var8.r("model", str3);
        }
        qh9Var8.p(ichVar.d, "logical_cpu_count");
        Number number = ichVar.e;
        if (number != null) {
            qh9Var8.p(number, "total_ram");
        }
        Boolean bool = ichVar.f;
        if (bool != null) {
            qh9Var8.q("is_low_ram", bool);
        }
        qh9Var7.o("device", qh9Var8);
        jch jchVar = lchVar.b;
        qh9 qh9Var9 = new qh9();
        String str4 = jchVar.a;
        if (str4 != null) {
            qh9Var9.r("build", str4);
        }
        String str5 = jchVar.b;
        if (str5 != null) {
            qh9Var9.r("name", str5);
        }
        String str6 = jchVar.c;
        if (str6 != null) {
            qh9Var9.r("version", str6);
        }
        qh9Var7.o("os", qh9Var9);
        qh9Var7.r("type", "usage");
        mch mchVar = lchVar.c;
        qh9 qh9Var10 = new qh9();
        qh9Var10.r("feature", "addViewLoadingTime");
        qh9Var10.q("no_view", Boolean.valueOf(mchVar.a));
        qh9Var10.q("no_active_view", Boolean.valueOf(mchVar.b));
        qh9Var10.q("overwritten", Boolean.valueOf(mchVar.c));
        qh9Var7.o("usage", qh9Var10);
        for (Map.Entry entry : lchVar.d.entrySet()) {
            String str7 = (String) entry.getKey();
            Object value = entry.getValue();
            if (!mp0.o0(str7, lch.e)) {
                qh9Var7.o(str7, vz8.M(value));
            }
        }
        qh9Var.o("telemetry", qh9Var7);
        return qh9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof och) {
            och ochVar = (och) obj;
            if (this.a == ochVar.a && this.b == ochVar.b && this.c == ochVar.c && x44.r(this.d, ochVar.d) && this.e.equals(ochVar.e) && this.f.equals(ochVar.f) && x44.r(this.g, ochVar.g) && x44.r(this.h, ochVar.h) && this.i.equals(ochVar.i) && this.j.equals(ochVar.j)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iL = kgh.l(kgh.l(kgh.l(qy1.c(this.c, (((Long.hashCode(this.b) + (this.a.hashCode() * 31)) * 31) + 391076367) * 31, 31), 31, this.d), 31, this.e.a), 31, this.f.a);
        nch nchVar = this.g;
        int iHashCode = (iL + (nchVar == null ? 0 : nchVar.a.hashCode())) * 31;
        gch gchVar = this.h;
        int iHashCode2 = gchVar != null ? gchVar.a.hashCode() : 0;
        return this.j.hashCode() + ((this.i.hashCode() + ((iHashCode + iHashCode2) * 31)) * 961);
    }

    public final String toString() {
        return "TelemetryUsageEvent(dd=" + this.a + ", date=" + this.b + ", service=dd-sdk-android, source=" + ebh.F(this.c) + ", version=" + this.d + ", application=" + this.e + ", session=" + this.f + ", view=" + this.g + ", action=" + this.h + ", effectiveSampleRate=" + this.i + ", experimentalFeatures=null, telemetry=" + this.j + ")";
    }
}
