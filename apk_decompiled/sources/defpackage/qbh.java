package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class qbh {
    public final yl4 a;
    public final long b;
    public final String c;
    public final int d;
    public final String e;
    public final kbh f;
    public final nbh g;
    public final pbh h;
    public final jbh i;
    public final Number j;
    public final List k;
    public final obh l;
    public final String m;

    public qbh(yl4 yl4Var, long j, String str, int i, String str2, kbh kbhVar, nbh nbhVar, pbh pbhVar, jbh jbhVar, Number number, ArrayList arrayList, obh obhVar) {
        if (i == 0) {
            throw null;
        }
        str2.getClass();
        this.a = yl4Var;
        this.b = j;
        this.c = str;
        this.d = i;
        this.e = str2;
        this.f = kbhVar;
        this.g = nbhVar;
        this.h = pbhVar;
        this.i = jbhVar;
        this.j = number;
        this.k = arrayList;
        this.l = obhVar;
        this.m = "telemetry";
    }

    public final qh9 a() {
        qh9 qh9Var = new qh9();
        this.a.getClass();
        qh9 qh9Var2 = new qh9();
        qh9Var2.p(2L, "format_version");
        qh9Var.o("_dd", qh9Var2);
        qh9Var.r("type", this.m);
        qh9Var.p(Long.valueOf(this.b), "date");
        qh9Var.r("service", this.c);
        qh9Var.o("source", new vh9(ebh.c(this.d)));
        qh9Var.r("version", this.e);
        kbh kbhVar = this.f;
        if (kbhVar != null) {
            qh9 qh9Var3 = new qh9();
            qh9Var3.r("id", kbhVar.a);
            qh9Var.o("application", qh9Var3);
        }
        nbh nbhVar = this.g;
        if (nbhVar != null) {
            qh9 qh9Var4 = new qh9();
            qh9Var4.r("id", nbhVar.a);
            qh9Var.o("session", qh9Var4);
        }
        pbh pbhVar = this.h;
        if (pbhVar != null) {
            qh9 qh9Var5 = new qh9();
            qh9Var5.r("id", pbhVar.a);
            qh9Var.o("view", qh9Var5);
        }
        jbh jbhVar = this.i;
        if (jbhVar != null) {
            qh9 qh9Var6 = new qh9();
            qh9Var6.r("id", jbhVar.a);
            qh9Var.o("action", qh9Var6);
        }
        Number number = this.j;
        if (number != null) {
            qh9Var.p(number, "effective_sample_rate");
        }
        List list = this.k;
        if (list != null) {
            ig9 ig9Var = new ig9(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ig9Var.p((String) it.next());
            }
            qh9Var.o("experimental_features", ig9Var);
        }
        obh obhVar = this.l;
        obhVar.getClass();
        qh9 qh9Var7 = new qh9();
        lbh lbhVar = obhVar.a;
        if (lbhVar != null) {
            qh9 qh9Var8 = new qh9();
            String str = lbhVar.a;
            if (str != null) {
                qh9Var8.r("architecture", str);
            }
            String str2 = lbhVar.b;
            if (str2 != null) {
                qh9Var8.r("brand", str2);
            }
            String str3 = lbhVar.c;
            if (str3 != null) {
                qh9Var8.r("model", str3);
            }
            Number number2 = lbhVar.d;
            if (number2 != null) {
                qh9Var8.p(number2, "logical_cpu_count");
            }
            Number number3 = lbhVar.e;
            if (number3 != null) {
                qh9Var8.p(number3, "total_ram");
            }
            Boolean bool = lbhVar.f;
            if (bool != null) {
                qh9Var8.q("is_low_ram", bool);
            }
            qh9Var7.o("device", qh9Var8);
        }
        mbh mbhVar = obhVar.b;
        if (mbhVar != null) {
            qh9 qh9Var9 = new qh9();
            String str4 = mbhVar.a;
            if (str4 != null) {
                qh9Var9.r("build", str4);
            }
            String str5 = mbhVar.b;
            if (str5 != null) {
                qh9Var9.r("name", str5);
            }
            String str6 = mbhVar.c;
            if (str6 != null) {
                qh9Var9.r("version", str6);
            }
            qh9Var7.o("os", qh9Var9);
        }
        qh9Var7.r("type", "log");
        qh9Var7.r("status", "debug");
        qh9Var7.r("message", obhVar.c);
        for (Map.Entry entry : obhVar.d.entrySet()) {
            String str7 = (String) entry.getKey();
            Object value = entry.getValue();
            if (!mp0.o0(str7, obh.e)) {
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
        if (!(obj instanceof qbh)) {
            return false;
        }
        qbh qbhVar = (qbh) obj;
        return x44.r(this.a, qbhVar.a) && this.b == qbhVar.b && x44.r(this.c, qbhVar.c) && this.d == qbhVar.d && x44.r(this.e, qbhVar.e) && x44.r(this.f, qbhVar.f) && x44.r(this.g, qbhVar.g) && x44.r(this.h, qbhVar.h) && x44.r(this.i, qbhVar.i) && x44.r(this.j, qbhVar.j) && x44.r(this.k, qbhVar.k) && x44.r(this.l, qbhVar.l);
    }

    public final int hashCode() {
        int iL = kgh.l(qy1.c(this.d, kgh.l(vb7.e(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31, this.e);
        kbh kbhVar = this.f;
        int iHashCode = (iL + (kbhVar == null ? 0 : kbhVar.a.hashCode())) * 31;
        nbh nbhVar = this.g;
        int iHashCode2 = (iHashCode + (nbhVar == null ? 0 : nbhVar.a.hashCode())) * 31;
        pbh pbhVar = this.h;
        int iHashCode3 = (iHashCode2 + (pbhVar == null ? 0 : pbhVar.a.hashCode())) * 31;
        jbh jbhVar = this.i;
        int iHashCode4 = (iHashCode3 + (jbhVar == null ? 0 : jbhVar.a.hashCode())) * 31;
        Number number = this.j;
        int iHashCode5 = (iHashCode4 + (number == null ? 0 : number.hashCode())) * 31;
        List list = this.k;
        return this.l.hashCode() + ((iHashCode5 + (list != null ? list.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "TelemetryDebugEvent(dd=" + this.a + ", date=" + this.b + ", service=" + this.c + ", source=" + ebh.E(this.d) + ", version=" + this.e + ", application=" + this.f + ", session=" + this.g + ", view=" + this.h + ", action=" + this.i + ", effectiveSampleRate=" + this.j + ", experimentalFeatures=" + this.k + ", telemetry=" + this.l + ")";
    }

    public /* synthetic */ qbh(yl4 yl4Var, long j, int i, String str, kbh kbhVar, nbh nbhVar, pbh pbhVar, jbh jbhVar, Float f, obh obhVar) {
        this(yl4Var, j, "dd-sdk-android", i, str, kbhVar, nbhVar, pbhVar, jbhVar, f, null, obhVar);
    }
}
