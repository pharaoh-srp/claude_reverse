package defpackage;

import com.anthropic.claude.api.account.SendProductEmailLinkRequest;
import com.anthropic.claude.api.login.VerifyMagicLinkRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class xxe implements bof {
    public static final Set G = mp0.Z0(new String[]{"action.gesture.direction", "action.gesture.from_state", "action.gesture.to_state", "action.target.parent.resource_id", "action.target.parent.classname", "action.target.parent.index", "action.target.classname", "action.target.resource_id", "action.target.title", "action.target.selected", "action.target.role", "error.resource.method", "error.resource.status_code", "error.resource.url"});
    public static final Set H = mp0.Z0(new String[]{"_dd.timestamp", "_dd.error_type", "_dd.error.source_type", "_dd.error.is_crash"});
    public static final Set I = mp0.Z0(new String[]{"_dd.timestamp", "_dd.error_type", "_dd.error.source_type", "_dd.error.is_crash"});
    public final h99 E;
    public final tj5 F;

    public xxe(h99 h99Var) {
        tj5 tj5Var = new tj5(h99Var);
        h99Var.getClass();
        this.E = h99Var;
        this.F = tj5Var;
    }

    public static void a(qh9 qh9Var) {
        q7a q7aVar = qh9Var.E;
        if (q7aVar.containsKey("context")) {
            qh9 qh9Var2 = (qh9) q7aVar.get("context");
            Set setEntrySet = qh9Var2.E.entrySet();
            ArrayList<Map.Entry> arrayList = new ArrayList();
            for (Object obj : (m7a) setEntrySet) {
                if (G.contains(((Map.Entry) obj).getKey())) {
                    arrayList.add(obj);
                }
            }
            for (Map.Entry entry : arrayList) {
                qh9Var.o((String) entry.getKey(), (bh9) entry.getValue());
            }
        }
    }

    public final String b(ppe ppeVar) {
        mpe mpeVar = ppeVar.k;
        h99 h99Var = this.E;
        mpe mpeVar2 = mpeVar != null ? new mpe(mpeVar.a, mpeVar.b, mpeVar.c, mpeVar.d, new LinkedHashMap(vz8.J(f(mpeVar.e), h99Var))) : null;
        boe boeVar = ppeVar.l;
        boe boeVarA = boeVar != null ? boe.a(boeVar, new LinkedHashMap(vz8.J(d(boeVar.b()), h99Var))) : null;
        loe loeVar = ppeVar.t;
        loe loeVar2 = loeVar != null ? new loe(new LinkedHashMap(vz8.J(e(loeVar.a), h99Var))) : null;
        long j = ppeVar.a;
        doe doeVar = ppeVar.b;
        String str = ppeVar.c;
        String str2 = ppeVar.d;
        String str3 = ppeVar.e;
        String str4 = ppeVar.f;
        String str5 = ppeVar.g;
        hpe hpeVar = ppeVar.h;
        int i = ppeVar.i;
        ipe ipeVar = ppeVar.j;
        ioe ioeVar = ppeVar.m;
        boe boeVar2 = boeVarA;
        poe poeVar = ppeVar.n;
        lpe lpeVar = ppeVar.o;
        foe foeVar = ppeVar.p;
        xoe xoeVar = ppeVar.q;
        ooe ooeVar = ppeVar.r;
        moe moeVar = ppeVar.s;
        coe coeVar = ppeVar.u;
        joe joeVar = ppeVar.v;
        gpe gpeVar = ppeVar.w;
        qh9 qh9Var = new qh9();
        loe loeVar3 = loeVar2;
        qh9Var.p(Long.valueOf(j), "date");
        qh9 qh9Var2 = new qh9();
        qh9Var2.r("id", doeVar.a);
        String str6 = doeVar.b;
        if (str6 != null) {
            qh9Var2.r("current_locale", str6);
        }
        qh9Var.o("application", qh9Var2);
        if (str != null) {
            qh9Var.r("service", str);
        }
        if (str2 != null) {
            qh9Var.r("version", str2);
        }
        if (str3 != null) {
            qh9Var.r("build_version", str3);
        }
        if (str4 != null) {
            qh9Var.r("build_id", str4);
        }
        if (str5 != null) {
            qh9Var.r("ddtags", str5);
        }
        qh9 qh9Var3 = new qh9();
        qh9Var3.r("id", hpeVar.a);
        qh9Var3.o("type", new vh9(grc.g(hpeVar.b)));
        Boolean bool = hpeVar.c;
        if (bool != null) {
            qh9Var3.q("has_replay", bool);
        }
        qh9Var.o("session", qh9Var3);
        if (i != 0) {
            qh9Var.o("source", new vh9(grc.h(i)));
        }
        qh9 qh9Var4 = new qh9();
        qh9Var4.r("id", ipeVar.a);
        String str7 = ipeVar.b;
        if (str7 != null) {
            qh9Var4.r("referrer", str7);
        }
        qh9Var4.r("url", ipeVar.c);
        String str8 = ipeVar.d;
        if (str8 != null) {
            qh9Var4.r("name", str8);
        }
        qh9Var.o("view", qh9Var4);
        if (mpeVar2 != null) {
            qh9 qh9Var5 = new qh9();
            String str9 = mpeVar2.a;
            if (str9 != null) {
                qh9Var5.r("id", str9);
            }
            String str10 = mpeVar2.b;
            if (str10 != null) {
                qh9Var5.r("name", str10);
            }
            String str11 = mpeVar2.c;
            if (str11 != null) {
                qh9Var5.r("email", str11);
            }
            String str12 = mpeVar2.d;
            if (str12 != null) {
                qh9Var5.r("anonymous_id", str12);
            }
            for (Map.Entry entry : mpeVar2.e.entrySet()) {
                String str13 = (String) entry.getKey();
                Object value = entry.getValue();
                if (!mp0.o0(str13, mpe.f)) {
                    qh9Var5.o(str13, vz8.M(value));
                }
            }
            qh9Var.o("usr", qh9Var5);
        }
        if (boeVar2 != null) {
            qh9Var.o("account", boeVar2.c());
        }
        if (ioeVar != null) {
            qh9 qh9Var6 = new qh9();
            qh9Var6.o("status", new vh9(grc.k(ioeVar.a)));
            List list = ioeVar.b;
            if (list != null) {
                ig9 ig9Var = new ig9(list.size());
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ig9Var.o(new vh9(((voe) it.next()).E));
                }
                qh9Var6.o("interfaces", ig9Var);
            }
            int i2 = ioeVar.c;
            if (i2 != 0) {
                qh9Var6.o("effective_type", gid.d(i2));
            }
            eoe eoeVar = ioeVar.d;
            if (eoeVar != null) {
                qh9Var6.o("cellular", eoeVar.a());
            }
            qh9Var.o("connectivity", qh9Var6);
        }
        if (poeVar != null) {
            qh9Var.o("display", poeVar.a());
        }
        if (lpeVar != null) {
            qh9Var.o("synthetics", lpeVar.a());
        }
        if (foeVar != null) {
            qh9Var.o("ci_test", foeVar.a());
        }
        if (xoeVar != null) {
            qh9 qh9Var7 = new qh9();
            qh9Var7.r("name", xoeVar.a);
            qh9Var7.r("version", xoeVar.b);
            String str14 = xoeVar.c;
            if (str14 != null) {
                qh9Var7.r("build", str14);
            }
            qh9Var7.r("version_major", xoeVar.d);
            qh9Var.o("os", qh9Var7);
        }
        if (ooeVar != null) {
            qh9 qh9Var8 = new qh9();
            int i3 = ooeVar.a;
            if (i3 != 0) {
                qh9Var8.o("type", new vh9(grc.e(i3)));
            }
            String str15 = ooeVar.b;
            if (str15 != null) {
                qh9Var8.r("name", str15);
            }
            String str16 = ooeVar.c;
            if (str16 != null) {
                qh9Var8.r("model", str16);
            }
            String str17 = ooeVar.d;
            if (str17 != null) {
                qh9Var8.r("brand", str17);
            }
            String str18 = ooeVar.e;
            if (str18 != null) {
                qh9Var8.r("architecture", str18);
            }
            String str19 = ooeVar.f;
            if (str19 != null) {
                qh9Var8.r("locale", str19);
            }
            List list2 = ooeVar.g;
            if (list2 != null) {
                ig9 ig9Var2 = new ig9(list2.size());
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    ig9Var2.p((String) it2.next());
                }
                qh9Var8.o("locales", ig9Var2);
            }
            String str20 = ooeVar.h;
            if (str20 != null) {
                qh9Var8.r("time_zone", str20);
            }
            Number number = ooeVar.i;
            if (number != null) {
                qh9Var8.p(number, "battery_level");
            }
            Boolean bool2 = ooeVar.j;
            if (bool2 != null) {
                qh9Var8.q("power_saving_mode", bool2);
            }
            Number number2 = ooeVar.k;
            if (number2 != null) {
                qh9Var8.p(number2, "brightness_level");
            }
            Number number3 = ooeVar.l;
            if (number3 != null) {
                qh9Var8.p(number3, "logical_cpu_count");
            }
            Number number4 = ooeVar.m;
            if (number4 != null) {
                qh9Var8.p(number4, "total_ram");
            }
            Boolean bool3 = ooeVar.n;
            if (bool3 != null) {
                qh9Var8.q("is_low_ram", bool3);
            }
            qh9Var.o("device", qh9Var8);
        }
        qh9 qh9Var9 = new qh9();
        qh9Var9.p(2L, "format_version");
        noe noeVar = moeVar.a;
        if (noeVar != null) {
            qh9 qh9Var10 = new qh9();
            bpe bpeVar = noeVar.a;
            if (bpeVar != null) {
                qh9Var10.o("plan", bpeVar.a());
            }
            int i4 = noeVar.b;
            if (i4 != 0) {
                qh9Var10.o("session_precondition", new vh9(grc.j(i4)));
            }
            qh9Var9.o("session", qh9Var10);
        }
        goe goeVar = moeVar.b;
        if (goeVar != null) {
            qh9 qh9Var11 = new qh9();
            qh9Var11.p(goeVar.a, "session_sample_rate");
            Number number5 = goeVar.b;
            if (number5 != null) {
                qh9Var11.p(number5, "session_replay_sample_rate");
            }
            Number number6 = goeVar.c;
            if (number6 != null) {
                qh9Var11.p(number6, "profiling_sample_rate");
            }
            Number number7 = goeVar.d;
            if (number7 != null) {
                qh9Var11.p(number7, "trace_sample_rate");
            }
            qh9Var9.o("configuration", qh9Var11);
        }
        String str21 = moeVar.c;
        if (str21 != null) {
            qh9Var9.r("browser_sdk_version", str21);
        }
        String str22 = moeVar.d;
        if (str22 != null) {
            qh9Var9.r("sdk_name", str22);
        }
        String str23 = moeVar.e;
        if (str23 != null) {
            qh9Var9.r("span_id", str23);
        }
        String str24 = moeVar.f;
        if (str24 != null) {
            qh9Var9.r("parent_span_id", str24);
        }
        String str25 = moeVar.g;
        if (str25 != null) {
            qh9Var9.r("trace_id", str25);
        }
        Number number8 = moeVar.h;
        if (number8 != null) {
            qh9Var9.p(number8, "rule_psr");
        }
        Boolean bool4 = moeVar.i;
        if (bool4 != null) {
            qh9Var9.q("discarded", bool4);
        }
        qh9Var.o("_dd", qh9Var9);
        if (loeVar3 != null) {
            qh9 qh9Var12 = new qh9();
            for (Map.Entry entry2 : loeVar3.a.entrySet()) {
                qh9Var12.o((String) entry2.getKey(), vz8.M(entry2.getValue()));
            }
            qh9Var.o("context", qh9Var12);
        }
        if (coeVar != null) {
            qh9 qh9Var13 = new qh9();
            List list3 = coeVar.a;
            ig9 ig9Var3 = new ig9(list3.size());
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                ig9Var3.p((String) it3.next());
            }
            qh9Var13.o("id", ig9Var3);
            qh9Var.o("action", qh9Var13);
        }
        if (joeVar != null) {
            qh9Var.o("container", joeVar.a());
        }
        qh9Var.r("type", "resource");
        qh9 qh9Var14 = new qh9();
        String str26 = gpeVar.a;
        if (str26 != null) {
            qh9Var14.r("id", str26);
        }
        qh9Var14.o("type", new vh9(grc.i(gpeVar.b)));
        int i5 = gpeVar.c;
        if (i5 != 0) {
            qh9Var14.o(VerifyMagicLinkRequest.Credentials.DISCRIMINATOR, new vh9(grc.f(i5)));
        }
        qh9Var14.r("url", gpeVar.d);
        Long l = gpeVar.e;
        if (l != null) {
            grc.A(l, qh9Var14, "status_code");
        }
        Long l2 = gpeVar.f;
        if (l2 != null) {
            grc.A(l2, qh9Var14, "duration");
        }
        Long l3 = gpeVar.g;
        if (l3 != null) {
            grc.A(l3, qh9Var14, "size");
        }
        Long l4 = gpeVar.h;
        if (l4 != null) {
            grc.A(l4, qh9Var14, "encoded_body_size");
        }
        Long l5 = gpeVar.i;
        if (l5 != null) {
            grc.A(l5, qh9Var14, "decoded_body_size");
        }
        Long l6 = gpeVar.j;
        if (l6 != null) {
            grc.A(l6, qh9Var14, "transfer_size");
        }
        int i6 = gpeVar.k;
        if (i6 != 0) {
            qh9Var14.o("render_blocking_status", gid.e(i6));
        }
        ope opeVar = gpeVar.l;
        if (opeVar != null) {
            qh9Var14.o("worker", opeVar.a());
        }
        dpe dpeVar = gpeVar.m;
        if (dpeVar != null) {
            qh9Var14.o("redirect", dpeVar.a());
        }
        qoe qoeVar = gpeVar.n;
        if (qoeVar != null) {
            qh9Var14.o("dns", qoeVar.a());
        }
        hoe hoeVar = gpeVar.o;
        if (hoeVar != null) {
            qh9Var14.o("connect", hoeVar.a());
        }
        kpe kpeVar = gpeVar.p;
        if (kpeVar != null) {
            qh9Var14.o("ssl", kpeVar.a());
        }
        toe toeVar = gpeVar.q;
        if (toeVar != null) {
            qh9Var14.o("first_byte", toeVar.a());
        }
        roe roeVar = gpeVar.r;
        if (roeVar != null) {
            qh9Var14.o("download", roeVar.a());
        }
        String str27 = gpeVar.s;
        if (str27 != null) {
            qh9Var14.r("protocol", str27);
        }
        int i7 = gpeVar.t;
        if (i7 != 0) {
            qh9Var14.o("delivery_type", gid.c(i7));
        }
        cpe cpeVar = gpeVar.u;
        if (cpeVar != null) {
            qh9Var14.o("provider", cpeVar.a());
        }
        epe epeVar = gpeVar.v;
        if (epeVar != null) {
            qh9Var14.o("request", epeVar.a());
        }
        jpe jpeVar = gpeVar.w;
        if (jpeVar != null) {
            qh9Var14.o("response", jpeVar.a());
        }
        uoe uoeVar = gpeVar.x;
        if (uoeVar != null) {
            qh9Var14.o("graphql", uoeVar.a());
        }
        qh9Var.o("resource", qh9Var14);
        qh9 qh9VarG = qh9Var.g();
        a(qh9VarG);
        String string = qh9VarG.toString();
        string.getClass();
        return string;
    }

    public final String c(h0j h0jVar) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        d0j d0jVar = h0jVar.k;
        h99 h99Var = this.E;
        d0j d0jVar2 = d0jVar != null ? new d0j(d0jVar.a, d0jVar.b, d0jVar.c, d0jVar.d, new LinkedHashMap(vz8.J(f(d0jVar.e), h99Var))) : null;
        vzi vziVar = h0jVar.q;
        vzi vziVar2 = vziVar != null ? new vzi(new LinkedHashMap(vz8.J(e(vziVar.a), h99Var))) : null;
        long j = h0jVar.a;
        rzi rziVar = h0jVar.b;
        String str8 = h0jVar.c;
        String str9 = h0jVar.d;
        String str10 = h0jVar.e;
        String str11 = h0jVar.f;
        String str12 = h0jVar.g;
        f0j f0jVar = h0jVar.h;
        int i = h0jVar.i;
        g0j g0jVar = h0jVar.j;
        uzi uziVar = h0jVar.l;
        c0j c0jVar = h0jVar.m;
        a0j a0jVar = h0jVar.n;
        yzi yziVar = h0jVar.o;
        wzi wziVar = h0jVar.p;
        e0j e0jVar = h0jVar.r;
        qh9 qh9Var = new qh9();
        vzi vziVar3 = vziVar2;
        qh9Var.p(Long.valueOf(j), "date");
        qh9 qh9Var2 = new qh9();
        qh9Var2.r("id", rziVar.a);
        String str13 = rziVar.b;
        if (str13 != null) {
            qh9Var2.r("current_locale", str13);
        }
        qh9Var.o("application", qh9Var2);
        if (str8 != null) {
            qh9Var.r("service", str8);
        }
        if (str9 != null) {
            qh9Var.r("version", str9);
        }
        if (str10 != null) {
            qh9Var.r("build_version", str10);
        }
        if (str11 != null) {
            qh9Var.r("build_id", str11);
        }
        if (str12 != null) {
            qh9Var.r("ddtags", str12);
        }
        qh9 qh9Var3 = new qh9();
        qh9Var3.r("id", f0jVar.a);
        int i2 = f0jVar.b;
        if (i2 == 1) {
            str = "user";
        } else if (i2 == 2) {
            str = "synthetics";
        } else {
            if (i2 != 3) {
                throw null;
            }
            str = "ci_test";
        }
        qh9Var3.o("type", new vh9(str));
        qh9Var.o("session", qh9Var3);
        if (i != 0) {
            qh9Var.o("source", new vh9(kgh.e(i)));
        }
        qh9 qh9Var4 = new qh9();
        qh9Var4.r("id", g0jVar.a);
        qh9Var4.r("url", g0jVar.b);
        String str14 = g0jVar.c;
        if (str14 != null) {
            qh9Var4.r("name", str14);
        }
        qh9Var.o("view", qh9Var4);
        if (d0jVar2 != null) {
            qh9 qh9Var5 = new qh9();
            String str15 = d0jVar2.a;
            if (str15 != null) {
                qh9Var5.r("id", str15);
            }
            String str16 = d0jVar2.b;
            if (str16 != null) {
                qh9Var5.r("name", str16);
            }
            String str17 = d0jVar2.c;
            if (str17 != null) {
                qh9Var5.r("email", str17);
            }
            String str18 = d0jVar2.d;
            if (str18 != null) {
                qh9Var5.r("anonymous_id", str18);
            }
            for (Map.Entry entry : d0jVar2.e.entrySet()) {
                String str19 = (String) entry.getKey();
                Object value = entry.getValue();
                if (!mp0.o0(str19, d0j.f)) {
                    qh9Var5.o(str19, vz8.M(value));
                }
            }
            qh9Var.o("usr", qh9Var5);
        }
        if (uziVar != null) {
            qh9 qh9Var6 = new qh9();
            int i3 = uziVar.a;
            if (i3 == 1) {
                str7 = "connected";
            } else if (i3 == 2) {
                str7 = "not_connected";
            } else {
                if (i3 != 3) {
                    throw null;
                }
                str7 = "maybe";
            }
            qh9Var6.o("status", new vh9(str7));
            List list = uziVar.b;
            ig9 ig9Var = new ig9(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ig9Var.o(new vh9(((zzi) it.next()).E));
            }
            qh9Var6.o("interfaces", ig9Var);
            szi sziVar = uziVar.c;
            if (sziVar != null) {
                qh9 qh9Var7 = new qh9();
                String str20 = sziVar.a;
                if (str20 != null) {
                    qh9Var7.r("technology", str20);
                }
                String str21 = sziVar.b;
                if (str21 != null) {
                    qh9Var7.r("carrier_name", str21);
                }
                qh9Var6.o("cellular", qh9Var7);
            }
            qh9Var.o("connectivity", qh9Var6);
        }
        if (c0jVar != null) {
            qh9 qh9Var8 = new qh9();
            qh9Var8.r("test_id", c0jVar.a);
            qh9Var8.r("result_id", c0jVar.b);
            for (Map.Entry entry2 : c0jVar.c.entrySet()) {
                String str22 = (String) entry2.getKey();
                Object value2 = entry2.getValue();
                if (!mp0.o0(str22, c0j.d)) {
                    qh9Var8.o(str22, vz8.M(value2));
                }
            }
            qh9Var.o("synthetics", qh9Var8);
        }
        if (a0jVar != null) {
            qh9 qh9Var9 = new qh9();
            qh9Var9.r("name", a0jVar.a);
            qh9Var9.r("version", a0jVar.b);
            qh9Var9.r("version_major", a0jVar.c);
            qh9Var.o("os", qh9Var9);
        }
        if (yziVar != null) {
            qh9 qh9Var10 = new qh9();
            int i4 = yziVar.a;
            if (i4 != 0) {
                switch (i4) {
                    case 1:
                        str6 = "mobile";
                        break;
                    case 2:
                        str6 = SendProductEmailLinkRequest.PRODUCT_DESKTOP;
                        break;
                    case 3:
                        str6 = "tablet";
                        break;
                    case 4:
                        str6 = "tv";
                        break;
                    case 5:
                        str6 = "gaming_console";
                        break;
                    case 6:
                        str6 = "bot";
                        break;
                    case 7:
                        str6 = "other";
                        break;
                    default:
                        throw null;
                }
                qh9Var10.o("type", new vh9(str6));
            }
            String str23 = yziVar.b;
            if (str23 != null) {
                qh9Var10.r("name", str23);
            }
            String str24 = yziVar.c;
            if (str24 != null) {
                qh9Var10.r("model", str24);
            }
            String str25 = yziVar.d;
            if (str25 != null) {
                qh9Var10.r("brand", str25);
            }
            String str26 = yziVar.e;
            if (str26 != null) {
                qh9Var10.r("architecture", str26);
            }
            List list2 = yziVar.f;
            if (list2 != null) {
                ig9 ig9Var2 = new ig9(list2.size());
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    ig9Var2.p((String) it2.next());
                }
                qh9Var10.o("locales", ig9Var2);
            }
            String str27 = yziVar.g;
            if (str27 != null) {
                qh9Var10.r("time_zone", str27);
            }
            Float f = yziVar.h;
            if (f != null) {
                qh9Var10.p(f, "battery_level");
            }
            Boolean bool = yziVar.i;
            if (bool != null) {
                qh9Var10.q("power_saving_mode", bool);
            }
            Number number = yziVar.j;
            if (number != null) {
                qh9Var10.p(number, "brightness_level");
            }
            qh9Var10.p(yziVar.k, "logical_cpu_count");
            Number number2 = yziVar.l;
            if (number2 != null) {
                qh9Var10.p(number2, "total_ram");
            }
            Boolean bool2 = yziVar.m;
            if (bool2 != null) {
                qh9Var10.q("is_low_ram", bool2);
            }
            qh9Var.o("device", qh9Var10);
        }
        qh9 qh9Var11 = new qh9();
        qh9Var11.p(2L, "format_version");
        xzi xziVar = wziVar.a;
        qh9 qh9Var12 = new qh9();
        int i5 = xziVar.a;
        if (i5 != 0) {
            switch (i5) {
                case 1:
                    str5 = "user_app_launch";
                    break;
                case 2:
                    str5 = "inactivity_timeout";
                    break;
                case 3:
                    str5 = "max_duration";
                    break;
                case 4:
                    str5 = "background_launch";
                    break;
                case 5:
                    str5 = "prewarm";
                    break;
                case 6:
                    str5 = "from_non_interactive_session";
                    break;
                case 7:
                    str5 = "explicit_stop";
                    break;
                default:
                    throw null;
            }
            qh9Var12.o("session_precondition", new vh9(str5));
        }
        qh9Var11.o("session", qh9Var12);
        tzi tziVar = wziVar.b;
        qh9 qh9Var13 = new qh9();
        qh9Var13.p(tziVar.a, "session_sample_rate");
        qh9Var11.o("configuration", qh9Var13);
        b0j b0jVar = wziVar.c;
        qh9 qh9Var14 = new qh9();
        int i6 = b0jVar.a;
        if (i6 != 0) {
            if (i6 == 1) {
                str4 = "starting";
            } else if (i6 == 2) {
                str4 = "running";
            } else if (i6 == 3) {
                str4 = "stopped";
            } else {
                if (i6 != 4) {
                    throw null;
                }
                str4 = "error";
            }
            qh9Var14.o("status", new vh9(str4));
        }
        qh9Var11.o("profiling", qh9Var14);
        qh9Var.o("_dd", qh9Var11);
        if (vziVar3 != null) {
            qh9 qh9Var15 = new qh9();
            for (Map.Entry entry3 : vziVar3.a.entrySet()) {
                qh9Var15.o((String) entry3.getKey(), vz8.M(entry3.getValue()));
            }
            qh9Var.o("context", qh9Var15);
        }
        qh9Var.r("type", "vital");
        qh9 qh9Var16 = new qh9();
        qh9Var16.r("id", e0jVar.a);
        qh9Var16.r("name", e0jVar.b);
        qh9Var16.r("type", "app_launch");
        int i7 = e0jVar.c;
        if (i7 == 1) {
            str2 = "ttid";
        } else {
            if (i7 != 2) {
                throw null;
            }
            str2 = "ttfd";
        }
        qh9Var16.o("app_launch_metric", new vh9(str2));
        qh9Var16.p(e0jVar.d, "duration");
        int i8 = e0jVar.e;
        if (i8 != 0) {
            if (i8 == 1) {
                str3 = "cold_start";
            } else {
                if (i8 != 2) {
                    throw null;
                }
                str3 = "warm_start";
            }
            qh9Var16.o("startup_type", new vh9(str3));
        }
        qh9Var16.q("has_saved_instance_state_bundle", e0jVar.f);
        qh9Var.o("vital", qh9Var16);
        qh9 qh9VarG = qh9Var.g();
        a(qh9VarG);
        String string = qh9VarG.toString();
        string.getClass();
        return string;
    }

    public final LinkedHashMap d(Map map) {
        return this.F.a(map, "account", "account extra information", H);
    }

    public final LinkedHashMap e(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (!I.contains((String) entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return iv1.S(this.F, linkedHashMap, "context", H, 4);
    }

    public final LinkedHashMap f(Map map) {
        return this.F.a(map, "usr", "user extra information", H);
    }

    @Override // defpackage.bof
    public final String o(Object obj) {
        String str;
        xla xlaVarA;
        xla xlaVar;
        ala alaVarA;
        String str2;
        String str3;
        bb bbVar;
        bb bbVar2;
        String str4;
        w9 w9Var;
        String str5;
        String str6;
        String str7;
        String str8;
        it6 it6VarA;
        it6 it6Var;
        ds6 ds6VarA;
        bwi bwiVar;
        obj.getClass();
        boolean z = obj instanceof mxi;
        h99 h99Var = this.E;
        if (z) {
            mxi mxiVar = (mxi) obj;
            ixi ixiVar = mxiVar.k;
            ixi ixiVar2 = ixiVar != null ? new ixi(ixiVar.a, ixiVar.b, ixiVar.c, ixiVar.d, new LinkedHashMap(vz8.J(f(ixiVar.e), h99Var))) : null;
            qvi qviVar = mxiVar.l;
            qvi qviVar2 = qviVar != null ? new qvi(qviVar.a, qviVar.b, new LinkedHashMap(vz8.J(d(qviVar.c), h99Var))) : null;
            zvi zviVar = mxiVar.t;
            zvi zviVar2 = zviVar != null ? new zvi(new LinkedHashMap(vz8.J(e(zviVar.a), h99Var))) : null;
            kxi kxiVar = mxiVar.j;
            bwi bwiVar2 = kxiVar.z;
            if (bwiVar2 != null) {
                LinkedHashMap linkedHashMap = bwiVar2.a;
                tj5 tj5Var = this.F;
                tj5Var.getClass();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(tta.d0(linkedHashMap.size()));
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    CharSequence charSequence = (CharSequence) entry.getKey();
                    Pattern patternCompile = Pattern.compile("[^a-zA-Z0-9\\-_.@$]");
                    patternCompile.getClass();
                    charSequence.getClass();
                    String strReplaceAll = patternCompile.matcher(charSequence).replaceAll("_");
                    strReplaceAll.getClass();
                    if (!strReplaceAll.equals(entry.getKey())) {
                        dch.H(tj5Var.a, 4, g99.E, new sj5(entry, strReplaceAll, 1), null, false, 56);
                    }
                    linkedHashMap2.put(strReplaceAll, entry.getValue());
                }
                bwiVar = new bwi(new LinkedHashMap(linkedHashMap2));
            } else {
                bwiVar = null;
            }
            qh9 qh9VarG = mxi.a(mxiVar, kxi.a(kxiVar, bwiVar, null, -67108865), ixiVar2, qviVar2, null, zviVar2, 7860735).b().g();
            a(qh9VarG);
            String string = qh9VarG.toString();
            string.getClass();
            return string;
        }
        if (obj instanceof kt6) {
            kt6 kt6Var = (kt6) obj;
            it6 it6Var2 = kt6Var.k;
            if (it6Var2 != null) {
                str8 = "account";
                str7 = "usr";
                it6VarA = it6.a(it6Var2, new LinkedHashMap(vz8.J(f(it6Var2.b()), h99Var)));
            } else {
                str7 = "usr";
                str8 = "account";
                it6VarA = null;
            }
            ds6 ds6Var = kt6Var.l;
            if (ds6Var != null) {
                it6Var = it6VarA;
                ds6VarA = ds6.a(ds6Var, new LinkedHashMap(vz8.J(d(ds6Var.b()), h99Var)));
            } else {
                it6Var = it6VarA;
                ds6VarA = null;
            }
            ps6 ps6Var = kt6Var.t;
            ps6 ps6VarA = ps6Var != null ? ps6.a(new LinkedHashMap(vz8.J(e(ps6Var.b()), h99Var))) : null;
            ds6 ds6Var2 = ds6VarA;
            long j = kt6Var.a;
            fs6 fs6Var = kt6Var.b;
            String str9 = kt6Var.c;
            String str10 = kt6Var.d;
            String str11 = kt6Var.e;
            ps6 ps6Var2 = ps6VarA;
            String str12 = kt6Var.f;
            String str13 = kt6Var.g;
            ws6 ws6Var = kt6Var.h;
            int i = kt6Var.i;
            xs6 xs6Var = kt6Var.j;
            ls6 ls6Var = kt6Var.m;
            us6 us6Var = kt6Var.n;
            gt6 gt6Var = kt6Var.o;
            js6 js6Var = kt6Var.p;
            bt6 bt6Var = kt6Var.q;
            ts6 ts6Var = kt6Var.r;
            rs6 rs6Var = kt6Var.s;
            es6 es6Var = kt6Var.u;
            ns6 ns6Var = kt6Var.v;
            vs6 vs6Var = kt6Var.w;
            ys6 ys6Var = kt6Var.x;
            ps6 ps6Var3 = kt6Var.y;
            fs6Var.getClass();
            ws6Var.getClass();
            xs6Var.getClass();
            rs6Var.getClass();
            vs6Var.getClass();
            qh9 qh9Var = new qh9();
            qh9Var.p(Long.valueOf(j), "date");
            qh9Var.o("application", fs6Var.a());
            if (str9 != null) {
                qh9Var.r("service", str9);
            }
            if (str10 != null) {
                qh9Var.r("version", str10);
            }
            if (str11 != null) {
                qh9Var.r("build_version", str11);
            }
            if (str12 != null) {
                qh9Var.r("build_id", str12);
            }
            if (str13 != null) {
                qh9Var.r("ddtags", str13);
            }
            qh9Var.o("session", ws6Var.a());
            if (i != 0) {
                qh9Var.o("source", ms6.b(i));
            }
            qh9Var.o("view", xs6Var.a());
            if (it6Var != null) {
                qh9Var.o(str7, it6Var.c());
            }
            if (ds6Var2 != null) {
                qh9Var.o(str8, ds6Var2.c());
            }
            if (ls6Var != null) {
                qh9Var.o("connectivity", ls6Var.a());
            }
            if (us6Var != null) {
                qh9Var.o("display", us6Var.a());
            }
            if (gt6Var != null) {
                qh9Var.o("synthetics", gt6Var.a());
            }
            if (js6Var != null) {
                qh9Var.o("ci_test", js6Var.a());
            }
            if (bt6Var != null) {
                qh9Var.o("os", bt6Var.a());
            }
            if (ts6Var != null) {
                qh9Var.o("device", ts6Var.a());
            }
            qh9Var.o("_dd", rs6Var.a());
            if (ps6Var2 != null) {
                qh9Var.o("context", ps6Var2.c());
            }
            if (es6Var != null) {
                qh9Var.o("action", es6Var.a());
            }
            if (ns6Var != null) {
                qh9Var.o("container", ns6Var.a());
            }
            qh9Var.r("type", "error");
            qh9Var.o("error", vs6Var.b());
            if (ys6Var != null) {
                qh9Var.o("freeze", ys6Var.a());
            }
            if (ps6Var3 != null) {
                qh9Var.o("feature_flags", ps6Var3.c());
            }
            qh9 qh9VarG2 = qh9Var.g();
            a(qh9VarG2);
            String string2 = qh9VarG2.toString();
            string2.getClass();
            return string2;
        }
        if (!(obj instanceof db)) {
            if (obj instanceof ppe) {
                return b((ppe) obj);
            }
            if (!(obj instanceof zla)) {
                if (obj instanceof n0j) {
                    new qh9().p(0L, "date");
                    throw null;
                }
                if (obj instanceof h0j) {
                    return c((h0j) obj);
                }
                if (obj instanceof qbh) {
                    String string3 = ((qbh) obj).a().toString();
                    string3.getClass();
                    return string3;
                }
                if (obj instanceof zbh) {
                    String string4 = ((zbh) obj).a().toString();
                    string4.getClass();
                    return string4;
                }
                if (obj instanceof hbh) {
                    String string5 = ((hbh) obj).a().toString();
                    string5.getClass();
                    return string5;
                }
                if (obj instanceof och) {
                    String string6 = ((och) obj).a().toString();
                    string6.getClass();
                    return string6;
                }
                if (obj instanceof qh9) {
                    return obj.toString();
                }
                String string7 = new qh9().toString();
                string7.getClass();
                return string7;
            }
            zla zlaVar = (zla) obj;
            xla xlaVar2 = zlaVar.k;
            if (xlaVar2 != null) {
                str = "usr";
                xlaVarA = xla.a(xlaVar2, new LinkedHashMap(vz8.J(f(xlaVar2.b()), h99Var)));
            } else {
                str = "usr";
                xlaVarA = null;
            }
            ala alaVar = zlaVar.l;
            if (alaVar != null) {
                xlaVar = xlaVarA;
                alaVarA = ala.a(alaVar, new LinkedHashMap(vz8.J(d(alaVar.b()), h99Var)));
            } else {
                xlaVar = xlaVarA;
                alaVarA = null;
            }
            jla jlaVar = zlaVar.t;
            jla jlaVarA = jlaVar != null ? jla.a(new LinkedHashMap(vz8.J(e(jlaVar.b()), h99Var))) : null;
            long j2 = zlaVar.a;
            cla claVar = zlaVar.b;
            String str14 = zlaVar.c;
            jla jlaVar2 = jlaVarA;
            String str15 = zlaVar.d;
            String str16 = zlaVar.e;
            String str17 = zlaVar.f;
            ala alaVar2 = alaVarA;
            String str18 = zlaVar.g;
            qla qlaVar = zlaVar.h;
            int i2 = zlaVar.i;
            rla rlaVar = zlaVar.j;
            gla glaVar = zlaVar.m;
            nla nlaVar = zlaVar.n;
            wla wlaVar = zlaVar.o;
            ela elaVar = zlaVar.p;
            sla slaVar = zlaVar.q;
            mla mlaVar = zlaVar.r;
            kla klaVar = zlaVar.s;
            bla blaVar = zlaVar.u;
            hla hlaVar = zlaVar.v;
            pla plaVar = zlaVar.w;
            qh9 qh9Var2 = new qh9();
            qh9Var2.p(Long.valueOf(j2), "date");
            qh9Var2.o("application", claVar.a());
            if (str14 != null) {
                qh9Var2.r("service", str14);
            }
            if (str15 != null) {
                qh9Var2.r("version", str15);
            }
            if (str16 != null) {
                qh9Var2.r("build_version", str16);
            }
            if (str17 != null) {
                qh9Var2.r("build_id", str17);
            }
            if (str18 != null) {
                qh9Var2.r("ddtags", str18);
            }
            qh9Var2.o("session", qlaVar.a());
            if (i2 != 0) {
                qh9Var2.o("source", y6a.a(i2));
            }
            qh9Var2.o("view", rlaVar.a());
            if (xlaVar != null) {
                qh9Var2.o(str, xlaVar.c());
            }
            if (alaVar2 != null) {
                qh9Var2.o("account", alaVar2.c());
            }
            if (glaVar != null) {
                qh9Var2.o("connectivity", glaVar.a());
            }
            if (nlaVar != null) {
                qh9Var2.o("display", nlaVar.a());
            }
            if (wlaVar != null) {
                qh9Var2.o("synthetics", wlaVar.a());
            }
            if (elaVar != null) {
                qh9Var2.o("ci_test", elaVar.a());
            }
            if (slaVar != null) {
                qh9Var2.o("os", slaVar.a());
            }
            if (mlaVar != null) {
                qh9Var2.o("device", mlaVar.a());
            }
            qh9Var2.o("_dd", klaVar.a());
            if (jlaVar2 != null) {
                qh9Var2.o("context", jlaVar2.c());
            }
            if (blaVar != null) {
                qh9Var2.o("action", blaVar.a());
            }
            if (hlaVar != null) {
                qh9Var2.o("container", hlaVar.a());
            }
            qh9Var2.r("type", "long_task");
            qh9Var2.o("long_task", plaVar.a());
            qh9 qh9VarG3 = qh9Var2.g();
            a(qh9VarG3);
            String string8 = qh9VarG3.toString();
            string8.getClass();
            return string8;
        }
        db dbVar = (db) obj;
        bb bbVar3 = dbVar.k;
        if (bbVar3 != null) {
            str3 = "usr";
            str2 = "view";
            bbVar = new bb(bbVar3.a, bbVar3.b, bbVar3.c, bbVar3.d, new LinkedHashMap(vz8.J(f(bbVar3.e), h99Var)));
        } else {
            str2 = "view";
            str3 = "usr";
            bbVar = null;
        }
        w9 w9Var2 = dbVar.l;
        if (w9Var2 != null) {
            bbVar2 = bbVar;
            str4 = "source";
            w9Var = new w9(w9Var2.a, w9Var2.b, new LinkedHashMap(vz8.J(d(w9Var2.c), h99Var)));
        } else {
            bbVar2 = bbVar;
            str4 = "source";
            w9Var = null;
        }
        ja jaVar = dbVar.t;
        ja jaVar2 = jaVar != null ? new ja(new LinkedHashMap(vz8.J(e(jaVar.a), h99Var))) : null;
        long j3 = dbVar.a;
        ca caVar = dbVar.b;
        String str19 = dbVar.c;
        String str20 = dbVar.d;
        String str21 = dbVar.e;
        ja jaVar3 = jaVar2;
        String str22 = dbVar.f;
        w9 w9Var3 = w9Var;
        String str23 = dbVar.g;
        aa aaVar = dbVar.h;
        int i3 = dbVar.i;
        ba baVar = dbVar.j;
        ga gaVar = dbVar.m;
        qa qaVar = dbVar.n;
        za zaVar = dbVar.o;
        ea eaVar = dbVar.p;
        va vaVar = dbVar.q;
        pa paVar = dbVar.r;
        la laVar = dbVar.s;
        ha haVar = dbVar.u;
        x9 x9Var = dbVar.v;
        qh9 qh9Var3 = new qh9();
        qh9Var3.p(Long.valueOf(j3), "date");
        qh9 qh9Var4 = new qh9();
        qh9Var4.r("id", caVar.a);
        String str24 = caVar.b;
        if (str24 != null) {
            qh9Var4.r("current_locale", str24);
        }
        qh9Var3.o("application", qh9Var4);
        if (str19 != null) {
            qh9Var3.r("service", str19);
        }
        if (str20 != null) {
            qh9Var3.r("version", str20);
        }
        if (str21 != null) {
            qh9Var3.r("build_version", str21);
        }
        if (str22 != null) {
            qh9Var3.r("build_id", str22);
        }
        if (str23 != null) {
            qh9Var3.r("ddtags", str23);
        }
        qh9 qh9Var5 = new qh9();
        qh9Var5.r("id", aaVar.a);
        qh9Var5.o("type", new vh9(sq6.e(aaVar.b)));
        Boolean bool = aaVar.c;
        if (bool != null) {
            qh9Var5.q("has_replay", bool);
        }
        qh9Var3.o("session", qh9Var5);
        if (i3 != 0) {
            str5 = str4;
            qh9Var3.o(str5, new vh9(sq6.f(i3)));
        } else {
            str5 = str4;
        }
        qh9 qh9Var6 = new qh9();
        qh9Var6.r("id", baVar.a);
        String str25 = baVar.b;
        if (str25 != null) {
            qh9Var6.r("referrer", str25);
        }
        qh9Var6.r("url", baVar.c);
        String str26 = baVar.d;
        if (str26 != null) {
            qh9Var6.r("name", str26);
        }
        Boolean bool2 = baVar.e;
        if (bool2 != null) {
            qh9Var6.q("in_foreground", bool2);
        }
        String str27 = str2;
        qh9Var3.o(str27, qh9Var6);
        if (bbVar2 != null) {
            qh9 qh9Var7 = new qh9();
            bb bbVar4 = bbVar2;
            String str28 = bbVar4.a;
            if (str28 != null) {
                qh9Var7.r("id", str28);
            }
            String str29 = bbVar4.b;
            if (str29 != null) {
                qh9Var7.r("name", str29);
            }
            String str30 = bbVar4.c;
            if (str30 != null) {
                qh9Var7.r("email", str30);
            }
            String str31 = bbVar4.d;
            if (str31 != null) {
                qh9Var7.r("anonymous_id", str31);
            }
            for (Map.Entry entry2 : bbVar4.e.entrySet()) {
                String str32 = (String) entry2.getKey();
                Object value = entry2.getValue();
                if (!mp0.o0(str32, bb.f)) {
                    qh9Var7.o(str32, vz8.M(value));
                }
            }
            qh9Var3.o(str3, qh9Var7);
        }
        if (w9Var3 != null) {
            qh9 qh9Var8 = new qh9();
            qh9Var8.r("id", w9Var3.a);
            String str33 = w9Var3.b;
            if (str33 != null) {
                qh9Var8.r("name", str33);
            }
            for (Map.Entry entry3 : w9Var3.c.entrySet()) {
                String str34 = (String) entry3.getKey();
                Object value2 = entry3.getValue();
                if (!mp0.o0(str34, w9.d)) {
                    qh9Var8.o(str34, vz8.M(value2));
                }
            }
            qh9Var3.o("account", qh9Var8);
        }
        if (gaVar != null) {
            qh9 qh9Var9 = new qh9();
            qh9Var9.o("status", new vh9(sq6.j(gaVar.a)));
            List list = gaVar.b;
            if (list != null) {
                ig9 ig9Var = new ig9(list.size());
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ig9Var.o(new vh9(((ta) it.next()).E));
                }
                qh9Var9.o("interfaces", ig9Var);
            }
            int i4 = gaVar.c;
            if (i4 != 0) {
                qh9Var9.o("effective_type", new vh9(sq6.h(i4)));
            }
            da daVar = gaVar.d;
            if (daVar != null) {
                qh9 qh9Var10 = new qh9();
                String str35 = daVar.a;
                if (str35 != null) {
                    qh9Var10.r("technology", str35);
                }
                String str36 = daVar.b;
                if (str36 != null) {
                    qh9Var10.r("carrier_name", str36);
                }
                qh9Var9.o("cellular", qh9Var10);
            }
            qh9Var3.o("connectivity", qh9Var9);
        }
        if (qaVar != null) {
            qh9 qh9Var11 = new qh9();
            cb cbVar = qaVar.a;
            if (cbVar != null) {
                qh9Var11.o("viewport", cbVar.a());
            }
            qh9Var3.o("display", qh9Var11);
        }
        if (zaVar != null) {
            qh9 qh9Var12 = new qh9();
            qh9Var12.r("test_id", zaVar.a);
            qh9Var12.r("result_id", zaVar.b);
            Boolean bool3 = zaVar.c;
            if (bool3 != null) {
                qh9Var12.q("injected", bool3);
            }
            for (Map.Entry entry4 : zaVar.d.entrySet()) {
                String str37 = (String) entry4.getKey();
                Object value3 = entry4.getValue();
                if (!mp0.o0(str37, za.e)) {
                    qh9Var12.o(str37, vz8.M(value3));
                }
            }
            qh9Var3.o("synthetics", qh9Var12);
        }
        if (eaVar != null) {
            qh9 qh9Var13 = new qh9();
            qh9Var13.r("test_execution_id", eaVar.a);
            qh9Var3.o("ci_test", qh9Var13);
        }
        if (vaVar != null) {
            qh9 qh9Var14 = new qh9();
            qh9Var14.r("name", vaVar.a);
            qh9Var14.r("version", vaVar.b);
            String str38 = vaVar.c;
            if (str38 != null) {
                qh9Var14.r("build", str38);
            }
            qh9Var14.r("version_major", vaVar.d);
            qh9Var3.o("os", qh9Var14);
        }
        if (paVar != null) {
            qh9 qh9Var15 = new qh9();
            int i5 = paVar.a;
            if (i5 != 0) {
                qh9Var15.o("type", new vh9(sq6.g(i5)));
            }
            String str39 = paVar.b;
            if (str39 != null) {
                qh9Var15.r("name", str39);
            }
            String str40 = paVar.c;
            if (str40 != null) {
                qh9Var15.r("model", str40);
            }
            String str41 = paVar.d;
            if (str41 != null) {
                qh9Var15.r("brand", str41);
            }
            String str42 = paVar.e;
            if (str42 != null) {
                qh9Var15.r("architecture", str42);
            }
            String str43 = paVar.f;
            if (str43 != null) {
                qh9Var15.r("locale", str43);
            }
            List list2 = paVar.g;
            if (list2 != null) {
                ig9 ig9Var2 = new ig9(list2.size());
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    ig9Var2.p((String) it2.next());
                }
                qh9Var15.o("locales", ig9Var2);
            }
            String str44 = paVar.h;
            if (str44 != null) {
                qh9Var15.r("time_zone", str44);
            }
            Number number = paVar.i;
            if (number != null) {
                qh9Var15.p(number, "battery_level");
            }
            Boolean bool4 = paVar.j;
            if (bool4 != null) {
                qh9Var15.q("power_saving_mode", bool4);
            }
            Number number2 = paVar.k;
            if (number2 != null) {
                qh9Var15.p(number2, "brightness_level");
            }
            Number number3 = paVar.l;
            if (number3 != null) {
                qh9Var15.p(number3, "logical_cpu_count");
            }
            Number number4 = paVar.m;
            if (number4 != null) {
                qh9Var15.p(number4, "total_ram");
            }
            Boolean bool5 = paVar.n;
            if (bool5 != null) {
                qh9Var15.q("is_low_ram", bool5);
            }
            qh9Var3.o("device", qh9Var15);
        }
        qh9 qh9Var16 = new qh9();
        qh9Var16.p(2L, "format_version");
        oa oaVar = laVar.a;
        if (oaVar != null) {
            qh9 qh9Var17 = new qh9();
            wa waVar = oaVar.a;
            if (waVar != null) {
                qh9Var17.o("plan", new vh9(waVar.E));
            }
            int i6 = oaVar.b;
            if (i6 != 0) {
                qh9Var17.o("session_precondition", new vh9(sq6.i(i6)));
            }
            qh9Var16.o("session", qh9Var17);
        }
        fa faVar = laVar.b;
        if (faVar != null) {
            qh9 qh9Var18 = new qh9();
            qh9Var18.p(faVar.a, "session_sample_rate");
            Number number5 = faVar.b;
            if (number5 != null) {
                qh9Var18.p(number5, "session_replay_sample_rate");
            }
            Number number6 = faVar.c;
            if (number6 != null) {
                qh9Var18.p(number6, "profiling_sample_rate");
            }
            Number number7 = faVar.d;
            if (number7 != null) {
                qh9Var18.p(number7, "trace_sample_rate");
            }
            qh9Var16.o("configuration", qh9Var18);
        }
        String str45 = laVar.c;
        if (str45 != null) {
            qh9Var16.r("browser_sdk_version", str45);
        }
        String str46 = laVar.d;
        if (str46 != null) {
            qh9Var16.r("sdk_name", str46);
        }
        ma maVar = laVar.e;
        if (maVar != null) {
            qh9 qh9Var19 = new qh9();
            xa xaVar = maVar.a;
            if (xaVar != null) {
                qh9Var19.o("position", xaVar.a());
            }
            na naVar = maVar.b;
            if (naVar != null) {
                qh9Var19.o("target", naVar.a());
            }
            int i7 = maVar.c;
            if (i7 != 0) {
                qh9Var19.o("name_source", ebh.a(i7));
            }
            str6 = "action";
            qh9Var16.o(str6, qh9Var19);
        } else {
            str6 = "action";
        }
        qh9Var3.o("_dd", qh9Var16);
        if (jaVar3 != null) {
            qh9 qh9Var20 = new qh9();
            for (Map.Entry entry5 : jaVar3.a.entrySet()) {
                qh9Var20.o((String) entry5.getKey(), vz8.M(entry5.getValue()));
            }
            qh9Var3.o("context", qh9Var20);
        }
        if (haVar != null) {
            qh9 qh9Var21 = new qh9();
            qh9Var21.o(str27, haVar.a.a());
            qh9Var21.o(str5, new vh9(sq6.f(haVar.b)));
            qh9Var3.o("container", qh9Var21);
        }
        qh9Var3.r("type", str6);
        qh9 qh9Var22 = new qh9();
        qh9Var22.o("type", new vh9(x9Var.a.E));
        String str47 = x9Var.b;
        if (str47 != null) {
            qh9Var22.r("id", str47);
        }
        Long l = x9Var.c;
        if (l != null) {
            grc.A(l, qh9Var22, "loading_time");
        }
        y9 y9Var = x9Var.d;
        if (y9Var != null) {
            qh9 qh9Var23 = new qh9();
            qh9Var23.r("name", y9Var.a);
            qh9Var22.o("target", qh9Var23);
        }
        sa saVar = x9Var.e;
        if (saVar != null) {
            qh9 qh9Var24 = new qh9();
            ArrayList arrayList = saVar.a;
            ig9 ig9Var3 = new ig9(arrayList.size());
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                ig9Var3.o(((ab) it3.next()).a());
            }
            qh9Var24.o("type", ig9Var3);
            qh9Var22.o("frustration", qh9Var24);
        }
        ra raVar = x9Var.f;
        if (raVar != null) {
            qh9 qh9Var25 = new qh9();
            qh9Var25.p(Long.valueOf(raVar.a), "count");
            qh9Var22.o("error", qh9Var25);
        }
        ka kaVar = x9Var.g;
        if (kaVar != null) {
            qh9 qh9Var26 = new qh9();
            qh9Var26.p(Long.valueOf(kaVar.a), "count");
            qh9Var22.o("crash", qh9Var26);
        }
        ua uaVar = x9Var.h;
        if (uaVar != null) {
            qh9 qh9Var27 = new qh9();
            qh9Var27.p(Long.valueOf(uaVar.a), "count");
            qh9Var22.o("long_task", qh9Var27);
        }
        ya yaVar = x9Var.i;
        if (yaVar != null) {
            qh9 qh9Var28 = new qh9();
            qh9Var28.p(Long.valueOf(yaVar.a), "count");
            qh9Var22.o("resource", qh9Var28);
        }
        qh9Var3.o(str6, qh9Var22);
        qh9 qh9VarG4 = qh9Var3.g();
        a(qh9VarG4);
        String string9 = qh9VarG4.toString();
        string9.getClass();
        return string9;
    }
}
