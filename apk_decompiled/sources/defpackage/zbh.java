package defpackage;

import com.anthropic.claude.api.login.VerifyResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zbh {
    public final am4 a;
    public final long b;
    public final String c;
    public final int d;
    public final String e;
    public final sbh f;
    public final wbh g;
    public final ybh h;
    public final rbh i;
    public final Number j;
    public final List k;
    public final xbh l;
    public final String m;

    public zbh(am4 am4Var, long j, String str, int i, String str2, sbh sbhVar, wbh wbhVar, ybh ybhVar, rbh rbhVar, Number number, ArrayList arrayList, xbh xbhVar) {
        if (i == 0) {
            throw null;
        }
        str2.getClass();
        this.a = am4Var;
        this.b = j;
        this.c = str;
        this.d = i;
        this.e = str2;
        this.f = sbhVar;
        this.g = wbhVar;
        this.h = ybhVar;
        this.i = rbhVar;
        this.j = number;
        this.k = arrayList;
        this.l = xbhVar;
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
        qh9Var.o("source", new vh9(gid.m(this.d)));
        qh9Var.r("version", this.e);
        sbh sbhVar = this.f;
        if (sbhVar != null) {
            qh9 qh9Var3 = new qh9();
            qh9Var3.r("id", sbhVar.a);
            qh9Var.o("application", qh9Var3);
        }
        wbh wbhVar = this.g;
        if (wbhVar != null) {
            qh9 qh9Var4 = new qh9();
            qh9Var4.r("id", wbhVar.a);
            qh9Var.o("session", qh9Var4);
        }
        ybh ybhVar = this.h;
        if (ybhVar != null) {
            qh9 qh9Var5 = new qh9();
            qh9Var5.r("id", ybhVar.a);
            qh9Var.o("view", qh9Var5);
        }
        rbh rbhVar = this.i;
        if (rbhVar != null) {
            qh9 qh9Var6 = new qh9();
            qh9Var6.r("id", rbhVar.a);
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
        xbh xbhVar = this.l;
        xbhVar.getClass();
        qh9 qh9Var7 = new qh9();
        tbh tbhVar = xbhVar.a;
        if (tbhVar != null) {
            qh9 qh9Var8 = new qh9();
            String str = tbhVar.a;
            if (str != null) {
                qh9Var8.r("architecture", str);
            }
            String str2 = tbhVar.b;
            if (str2 != null) {
                qh9Var8.r("brand", str2);
            }
            String str3 = tbhVar.c;
            if (str3 != null) {
                qh9Var8.r("model", str3);
            }
            Number number2 = tbhVar.d;
            if (number2 != null) {
                qh9Var8.p(number2, "logical_cpu_count");
            }
            Number number3 = tbhVar.e;
            if (number3 != null) {
                qh9Var8.p(number3, "total_ram");
            }
            Boolean bool = tbhVar.f;
            if (bool != null) {
                qh9Var8.q("is_low_ram", bool);
            }
            qh9Var7.o("device", qh9Var8);
        }
        vbh vbhVar = xbhVar.b;
        if (vbhVar != null) {
            qh9 qh9Var9 = new qh9();
            String str4 = vbhVar.a;
            if (str4 != null) {
                qh9Var9.r("build", str4);
            }
            String str5 = vbhVar.b;
            if (str5 != null) {
                qh9Var9.r("name", str5);
            }
            String str6 = vbhVar.c;
            if (str6 != null) {
                qh9Var9.r("version", str6);
            }
            qh9Var7.o("os", qh9Var9);
        }
        qh9Var7.r("type", "log");
        qh9Var7.r("status", "error");
        qh9Var7.r("message", xbhVar.c);
        ubh ubhVar = xbhVar.d;
        if (ubhVar != null) {
            qh9 qh9Var10 = new qh9();
            String str7 = ubhVar.a;
            if (str7 != null) {
                qh9Var10.r("stack", str7);
            }
            String str8 = ubhVar.b;
            if (str8 != null) {
                qh9Var10.r(VerifyResponse.AuthenticationState.DISCRIMINATOR, str8);
            }
            qh9Var7.o("error", qh9Var10);
        }
        for (Map.Entry entry : xbhVar.e.entrySet()) {
            String str9 = (String) entry.getKey();
            Object value = entry.getValue();
            if (!mp0.o0(str9, xbh.f)) {
                qh9Var7.o(str9, vz8.M(value));
            }
        }
        qh9Var.o("telemetry", qh9Var7);
        return qh9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zbh)) {
            return false;
        }
        zbh zbhVar = (zbh) obj;
        return x44.r(this.a, zbhVar.a) && this.b == zbhVar.b && x44.r(this.c, zbhVar.c) && this.d == zbhVar.d && x44.r(this.e, zbhVar.e) && x44.r(this.f, zbhVar.f) && x44.r(this.g, zbhVar.g) && x44.r(this.h, zbhVar.h) && x44.r(this.i, zbhVar.i) && x44.r(this.j, zbhVar.j) && x44.r(this.k, zbhVar.k) && x44.r(this.l, zbhVar.l);
    }

    public final int hashCode() {
        int iL = kgh.l(qy1.c(this.d, kgh.l(vb7.e(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31, this.e);
        sbh sbhVar = this.f;
        int iHashCode = (iL + (sbhVar == null ? 0 : sbhVar.a.hashCode())) * 31;
        wbh wbhVar = this.g;
        int iHashCode2 = (iHashCode + (wbhVar == null ? 0 : wbhVar.a.hashCode())) * 31;
        ybh ybhVar = this.h;
        int iHashCode3 = (iHashCode2 + (ybhVar == null ? 0 : ybhVar.a.hashCode())) * 31;
        rbh rbhVar = this.i;
        int iHashCode4 = (iHashCode3 + (rbhVar == null ? 0 : rbhVar.a.hashCode())) * 31;
        Number number = this.j;
        int iHashCode5 = (iHashCode4 + (number == null ? 0 : number.hashCode())) * 31;
        List list = this.k;
        return this.l.hashCode() + ((iHashCode5 + (list != null ? list.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("TelemetryErrorEvent(dd=");
        sb.append(this.a);
        sb.append(", date=");
        sb.append(this.b);
        sb.append(", service=");
        sb.append(this.c);
        sb.append(", source=");
        switch (this.d) {
            case 1:
                str = "ANDROID";
                break;
            case 2:
                str = "IOS";
                break;
            case 3:
                str = "BROWSER";
                break;
            case 4:
                str = "FLUTTER";
                break;
            case 5:
                str = "REACT_NATIVE";
                break;
            case 6:
                str = "UNITY";
                break;
            case 7:
                str = "KOTLIN_MULTIPLATFORM";
                break;
            case 8:
                str = "ELECTRON";
                break;
            case 9:
                str = "RUM_CPP";
                break;
            case 10:
                str = "MAUI";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append(", version=");
        sb.append(this.e);
        sb.append(", application=");
        sb.append(this.f);
        sb.append(", session=");
        sb.append(this.g);
        sb.append(", view=");
        sb.append(this.h);
        sb.append(", action=");
        sb.append(this.i);
        sb.append(", effectiveSampleRate=");
        sb.append(this.j);
        sb.append(", experimentalFeatures=");
        sb.append(this.k);
        sb.append(", telemetry=");
        sb.append(this.l);
        sb.append(")");
        return sb.toString();
    }
}
