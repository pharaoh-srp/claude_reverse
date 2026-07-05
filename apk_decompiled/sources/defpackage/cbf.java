package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.provider.Settings;
import android.util.SparseIntArray;
import android.view.WindowInsetsAnimation;
import androidx.health.platform.client.proto.g;
import com.anthropic.claude.R;
import com.anthropic.claude.api.account.SendProductEmailLinkRequest;
import com.anthropic.claude.api.login.VerifyResponse;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class cbf implements plj, e3k, lqj {
    public final /* synthetic */ int E;
    public Object F;
    public Object G;

    public cbf(int i) {
        this.E = i;
        switch (i) {
            case 6:
                break;
            case 14:
                this.F = new ConcurrentHashMap();
                this.G = new AtomicInteger(0);
                break;
            case 16:
                this.F = new lja(29);
                this.G = new zna(16);
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                this.F = new wwb(0, new Reference[16]);
                this.G = new ReferenceQueue();
                break;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                this.F = Collections.synchronizedMap(new WeakHashMap());
                this.G = Collections.synchronizedMap(new WeakHashMap());
                break;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                f88 f88Var = f88.d;
                this.F = new SparseIntArray();
                this.G = f88Var;
                break;
            default:
                this.F = new jxb();
                this.G = new AtomicInteger(0);
                break;
        }
    }

    public static r9i b(List list) {
        return list.isEmpty() ? r9i.G : new r9i(list);
    }

    public static String i(g25 g25Var) {
        return (g25Var.f ? "https" : "http") + "://" + g25Var.d + g25Var.e + "|" + g25Var.a;
    }

    public static Object t(cbf cbfVar, Serializable serializable, xzg xzgVar, int i) {
        return cbfVar.s(serializable, false, ((AtomicInteger) ((cbf) cbfVar.F).G).incrementAndGet(), xzgVar);
    }

    public void A(dsk dskVar) {
        try {
            dvk dvkVarQ = ivk.q();
            dvkVarQ.c((itk) this.F);
            dvkVarQ.b();
            ivk.t((ivk) dvkVarQ.F, dskVar);
            ((kd4) this.G).n((ivk) dvkVarQ.a());
        } catch (Throwable th) {
            jyj.i("BillingLogger", "Unable to log.", th);
        }
    }

    public void B(yvk yvkVar) {
        try {
            kd4 kd4Var = (kd4) this.G;
            dvk dvkVarQ = ivk.q();
            dvkVarQ.c((itk) this.F);
            dvkVarQ.b();
            ivk.v((ivk) dvkVarQ.F, yvkVar);
            kd4Var.n((ivk) dvkVarQ.a());
        } catch (Throwable th) {
            jyj.i("BillingLogger", "Unable to log.", th);
        }
    }

    public void C(kwk kwkVar) {
        if (kwkVar == null) {
            return;
        }
        try {
            dvk dvkVarQ = ivk.q();
            dvkVarQ.c((itk) this.F);
            dvkVarQ.b();
            ivk.p((ivk) dvkVarQ.F, kwkVar);
            ((kd4) this.G).n((ivk) dvkVarQ.a());
        } catch (Throwable th) {
            jyj.i("BillingLogger", "Unable to log.", th);
        }
    }

    public void D(lqk lqkVar, itk itkVar) {
        if (lqkVar == null) {
            return;
        }
        try {
            dvk dvkVarQ = ivk.q();
            dvkVarQ.c(itkVar);
            dvkVarQ.b();
            ivk.r((ivk) dvkVarQ.F, lqkVar);
            ((kd4) this.G).n((ivk) dvkVarQ.a());
        } catch (Throwable th) {
            jyj.i("BillingLogger", "Unable to log.", th);
        }
    }

    public void E(irk irkVar, itk itkVar) {
        if (irkVar == null) {
            return;
        }
        try {
            dvk dvkVarQ = ivk.q();
            dvkVarQ.c(itkVar);
            dvkVarQ.b();
            ivk.s((ivk) dvkVarQ.F, irkVar);
            ((kd4) this.G).n((ivk) dvkVarQ.a());
        } catch (Throwable th) {
            jyj.i("BillingLogger", "Unable to log.", th);
        }
    }

    public boolean a(xfj xfjVar) {
        boolean zContainsKey;
        synchronized (this.G) {
            zContainsKey = ((hr5) this.F).a.containsKey(xfjVar);
        }
        return zContainsKey;
    }

    public void c() {
        lsc lscVar = (lsc) this.G;
        rcg rcgVarZ = fd9.Z();
        bz7 bz7VarE = rcgVarZ != null ? rcgVarZ.e() : null;
        rcg rcgVarK0 = fd9.k0(rcgVarZ);
        try {
            blh blhVar = (blh) lscVar.getValue();
            if (blhVar != null) {
                zdi zdiVar = (zdi) this.F;
                kdg kdgVar = zdiVar.b;
                kdg kdgVar2 = zdiVar.c;
                kdgVar2.clear();
                while (kdgVar2.size() + kdgVar.size() > zdiVar.a - 1) {
                    if (kdgVar.isEmpty()) {
                        pmf.h("List is empty.");
                        return;
                    }
                    kdgVar.remove(0);
                }
                kdgVar.add(blhVar);
            }
            lscVar.setValue(null);
        } finally {
            fd9.s0(rcgVarZ, rcgVarK0, bz7VarE);
        }
    }

    @Override // defpackage.qlj
    public Object d() {
        return new llj((Context) ((bnh) this.F).F, (zlj) ((nlj) this.G).d(), new byi(1));
    }

    public fhi e(ze9 ze9Var) {
        fhi fhiVarE;
        j7g j7gVarB = ze9Var.b();
        return (j7gVarB == null || (fhiVarE = jwk.E(j7gVarB)) == null) ? (ku6) ((u0h) this.F).getValue() : fhiVarE;
    }

    public yr9 f(qai qaiVar, ze9 ze9Var) {
        qaiVar.getClass();
        ze9Var.getClass();
        return (yr9) ((afa) this.G).invoke(new uai(qaiVar, ze9Var));
    }

    public int g(pl9 pl9Var) {
        int iIntValue;
        pl9Var.getClass();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.F;
        String strD = pl9Var.d();
        strD.getClass();
        z9i z9iVar = new z9i(1, this);
        concurrentHashMap.getClass();
        Integer num = (Integer) concurrentHashMap.get(strD);
        if (num != null) {
            return num.intValue();
        }
        synchronized (concurrentHashMap) {
            try {
                Integer num2 = (Integer) concurrentHashMap.get(strD);
                if (num2 == null) {
                    Object objInvoke = z9iVar.invoke(strD);
                    concurrentHashMap.putIfAbsent(strD, Integer.valueOf(((Number) objInvoke).intValue()));
                    num2 = (Integer) objInvoke;
                }
                iIntValue = num2.intValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return iIntValue;
    }

    public int h() {
        try {
            return Settings.System.getInt(((Context) this.G).getContentResolver(), "screen_brightness");
        } catch (Settings.SettingNotFoundException e) {
            dch.H((h99) this.F, 4, g99.F, new tnh(), e, false, 48);
            return Integer.MIN_VALUE;
        }
    }

    public String j(String str) {
        String str2 = (String) this.G;
        Resources resources = (Resources) this.F;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public void k(blh blhVar) {
        lsc lscVar = (lsc) this.G;
        rcg rcgVarZ = fd9.Z();
        bz7 bz7VarE = rcgVarZ != null ? rcgVarZ.e() : null;
        rcg rcgVarK0 = fd9.k0(rcgVarZ);
        try {
            blh blhVar2 = (blh) lscVar.getValue();
            if (blhVar2 == null) {
                lscVar.setValue(blhVar);
                return;
            }
            blh blhVarF = mqk.f(blhVar2, blhVar);
            if (blhVarF != null) {
                lscVar.setValue(blhVarF);
            } else {
                c();
                lscVar.setValue(blhVar);
            }
        } finally {
            fd9.s0(rcgVarZ, rcgVarK0, bz7VarE);
        }
    }

    public hlg l(xfj xfjVar) {
        hlg hlgVar;
        synchronized (this.G) {
            hlgVar = (hlg) ((hr5) this.F).a.remove(xfjVar);
        }
        return hlgVar;
    }

    public String m(lj5 lj5Var, ufg ufgVar) {
        String str;
        Object value;
        lj5Var.getClass();
        lfg lfgVar = ufgVar.k;
        sfg sfgVar = lfgVar.e;
        tj5 tj5Var = (tj5) this.G;
        LinkedHashMap linkedHashMapS = iv1.S(tj5Var, sfgVar.d, "meta.usr", null, 12);
        LinkedHashMap linkedHashMap = new LinkedHashMap(tta.d0(linkedHashMapS.size()));
        for (Map.Entry entry : linkedHashMapS.entrySet()) {
            Object key = entry.getKey();
            try {
                value = entry.getValue();
            } catch (Exception e) {
                dch.I((h99) this.F, 5, x44.X(g99.E, g99.G), new rj5(entry, 3), e, 48);
            }
            String strValueOf = (x44.r(value, u00.d) || value == null) ? null : value instanceof Date ? String.valueOf(((Date) value).getTime()) : value instanceof vh9 ? ((vh9) value).m() : value.toString();
            linkedHashMap.put(key, strValueOf);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            if (((String) entry2.getValue()) != null) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(linkedHashMap2);
        String str2 = sfgVar.a;
        String str3 = sfgVar.b;
        String str4 = sfgVar.c;
        mfg mfgVar = ufgVar.j;
        LinkedHashMap linkedHashMapS2 = iv1.S(tj5Var, mfgVar.b, "metrics", null, 12);
        Long l = mfgVar.a;
        String str5 = lfgVar.a;
        jfg jfgVar = lfgVar.b;
        rfg rfgVar = lfgVar.d;
        nfg nfgVar = lfgVar.f;
        kfg kfgVar = lfgVar.g;
        ofg ofgVar = lfgVar.h;
        Map map = lfgVar.i;
        str5.getClass();
        String str6 = ufgVar.a;
        String str7 = ufgVar.b;
        String str8 = ufgVar.c;
        String str9 = ufgVar.d;
        String str10 = ufgVar.e;
        String str11 = ufgVar.f;
        long j = ufgVar.g;
        long j2 = ufgVar.h;
        long j3 = ufgVar.i;
        str9.getClass();
        str10.getClass();
        str11.getClass();
        qh9 qh9Var = new qh9();
        qh9Var.r("trace_id", str6);
        qh9Var.r("span_id", str7);
        qh9Var.r("parent_id", str8);
        qh9Var.r("resource", str9);
        qh9Var.r("name", str10);
        qh9Var.r("service", str11);
        qh9Var.p(Long.valueOf(j), "duration");
        qh9Var.p(Long.valueOf(j2), "start");
        qh9Var.p(Long.valueOf(j3), "error");
        qh9Var.r("type", "custom");
        qh9 qh9Var2 = new qh9();
        if (l != null) {
            grc.A(l, qh9Var2, "_top_level");
        }
        for (Map.Entry entry3 : linkedHashMapS2.entrySet()) {
            String str12 = (String) entry3.getKey();
            Number number = (Number) entry3.getValue();
            if (!mp0.o0(str12, mfg.c)) {
                qh9Var2.p(number, str12);
            }
        }
        qh9Var.o("metrics", qh9Var2);
        qh9 qh9Var3 = new qh9();
        qh9Var3.r("version", str5);
        qh9 qh9Var4 = new qh9();
        String str13 = jfgVar.a;
        if (str13 != null) {
            qh9Var4.r("source", str13);
        }
        hfg hfgVar = jfgVar.b;
        if (hfgVar != null) {
            qh9 qh9Var5 = new qh9();
            String str14 = hfgVar.a;
            if (str14 != null) {
                qh9Var5.r("id", str14);
            }
            qh9Var4.o("application", qh9Var5);
        }
        pfg pfgVar = jfgVar.c;
        if (pfgVar != null) {
            qh9 qh9Var6 = new qh9();
            String str15 = pfgVar.a;
            if (str15 != null) {
                qh9Var6.r("id", str15);
            }
            qh9Var4.o("session", qh9Var6);
        }
        tfg tfgVar = jfgVar.d;
        if (tfgVar != null) {
            qh9 qh9Var7 = new qh9();
            String str16 = tfgVar.a;
            if (str16 != null) {
                qh9Var7.r("id", str16);
            }
            qh9Var4.o("view", qh9Var7);
        }
        qh9Var3.o("_dd", qh9Var4);
        qh9 qh9Var8 = new qh9();
        qh9Var8.r(VerifyResponse.AuthenticationState.DISCRIMINATOR, "client");
        qh9Var3.o("span", qh9Var8);
        qh9 qh9Var9 = new qh9();
        qh9Var9.r("version", rfgVar.a);
        qh9Var3.o("tracer", qh9Var9);
        qh9 qh9Var10 = new qh9();
        if (str2 != null) {
            qh9Var10.r("id", str2);
        }
        if (str3 != null) {
            qh9Var10.r("name", str3);
        }
        if (str4 != null) {
            qh9Var10.r("email", str4);
        }
        for (Map.Entry entry4 : linkedHashMap3.entrySet()) {
            String str17 = (String) entry4.getKey();
            Object value2 = entry4.getValue();
            if (!mp0.o0(str17, sfg.e)) {
                qh9Var10.o(str17, vz8.M(value2));
            }
        }
        qh9Var3.o("usr", qh9Var10);
        if (nfgVar != null) {
            qh9 qh9Var11 = new qh9();
            ifg ifgVar = nfgVar.a;
            qh9 qh9Var12 = new qh9();
            qfg qfgVar = ifgVar.a;
            if (qfgVar != null) {
                qh9Var12.o("sim_carrier", qfgVar.a());
            }
            String str18 = ifgVar.b;
            if (str18 != null) {
                qh9Var12.r("signal_strength", str18);
            }
            String str19 = ifgVar.c;
            if (str19 != null) {
                qh9Var12.r("downlink_kbps", str19);
            }
            String str20 = ifgVar.d;
            if (str20 != null) {
                qh9Var12.r("uplink_kbps", str20);
            }
            String str21 = ifgVar.e;
            if (str21 != null) {
                qh9Var12.r("connectivity", str21);
            }
            qh9Var11.o("client", qh9Var12);
            qh9Var3.o("network", qh9Var11);
        }
        qh9 qh9Var13 = new qh9();
        int i = kfgVar.a;
        if (i != 0) {
            switch (i) {
                case 1:
                    str = "mobile";
                    break;
                case 2:
                    str = SendProductEmailLinkRequest.PRODUCT_DESKTOP;
                    break;
                case 3:
                    str = "tablet";
                    break;
                case 4:
                    str = "tv";
                    break;
                case 5:
                    str = "gaming_console";
                    break;
                case 6:
                    str = "bot";
                    break;
                case 7:
                    str = "other";
                    break;
                default:
                    throw null;
            }
            qh9Var13.o("type", new vh9(str));
        }
        String str22 = kfgVar.b;
        if (str22 != null) {
            qh9Var13.r("name", str22);
        }
        String str23 = kfgVar.c;
        if (str23 != null) {
            qh9Var13.r("model", str23);
        }
        String str24 = kfgVar.d;
        if (str24 != null) {
            qh9Var13.r("brand", str24);
        }
        String str25 = kfgVar.e;
        if (str25 != null) {
            qh9Var13.r("architecture", str25);
        }
        qh9Var13.p(kfgVar.f, "logical_cpu_count");
        Number number2 = kfgVar.g;
        if (number2 != null) {
            qh9Var13.p(number2, "total_ram");
        }
        Boolean bool = kfgVar.h;
        if (bool != null) {
            qh9Var13.q("is_low_ram", bool);
        }
        qh9Var3.o("device", qh9Var13);
        qh9 qh9Var14 = new qh9();
        qh9Var14.r("name", ofgVar.a);
        qh9Var14.r("version", ofgVar.b);
        qh9Var14.r("version_major", ofgVar.c);
        qh9Var3.o("os", qh9Var14);
        for (Map.Entry entry5 : map.entrySet()) {
            String str26 = (String) entry5.getKey();
            String str27 = (String) entry5.getValue();
            if (!mp0.o0(str26, lfg.j)) {
                qh9Var3.r(str26, str27);
            }
        }
        qh9Var.o("meta", qh9Var3);
        ig9 ig9Var = new ig9(1);
        ig9Var.o(qh9Var);
        qh9 qh9Var15 = new qh9();
        qh9Var15.o("spans", ig9Var);
        qh9Var15.r("env", lj5Var.d);
        String string = qh9Var15.toString();
        string.getClass();
        return string;
    }

    public void n(hlg hlgVar, am4 am4Var) {
        hlgVar.getClass();
        ggj ggjVar = (ggj) this.G;
        ggjVar.a.execute(new f60(this, hlgVar, am4Var, 11));
    }

    public void o(hlg hlgVar, int i) {
        hlgVar.getClass();
        ggj ggjVar = (ggj) this.G;
        ggjVar.a.execute(new log((xhd) this.F, hlgVar, false, i));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.pwf p(kotlin.reflect.jvm.internal.impl.types.a r17, java.util.List r18, defpackage.ze9 r19) {
        /*
            Method dump skipped, instruction units count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbf.p(kotlin.reflect.jvm.internal.impl.types.a, java.util.List, ze9):pwf");
    }

    public hlg q(xfj xfjVar) {
        hlg hlgVarC;
        synchronized (this.G) {
            hlgVarC = ((hr5) this.F).c(xfjVar);
        }
        return hlgVarC;
    }

    public void r(rdg rdgVar) {
        synchronized (this) {
            x2g x2gVar = (x2g) this.F;
            x2gVar.a.edit().putLong("com.lyft.kronos.cached_current_time", rdgVar.a).apply();
            x2g x2gVar2 = (x2g) this.F;
            x2gVar2.a.edit().putLong("com.lyft.kronos.cached_elapsed_time", rdgVar.b).apply();
            x2g x2gVar3 = (x2g) this.F;
            x2gVar3.a.edit().putLong("com.lyft.kronos.cached_offset", rdgVar.c).apply();
        }
    }

    public Object s(Serializable serializable, boolean z, int i, vp4 vp4Var) {
        Object objN = fd9.N(new k8(this, i, z, serializable, null), vp4Var);
        return objN == m45.E ? objN : iei.a;
    }

    public String toString() {
        switch (this.E) {
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return "Bounds{lower=" + ((f59) this.F) + " upper=" + ((f59) this.G) + "}";
            default:
                return super.toString();
        }
    }

    public void u(boolean z, Status status) {
        HashMap map;
        HashMap map2;
        synchronized (((Map) this.F)) {
            map = new HashMap((Map) this.F);
        }
        synchronized (((Map) this.G)) {
            map2 = new HashMap((Map) this.G);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).c(status);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((j5h) entry2.getKey()).c(new ApiException(status));
            }
        }
    }

    public void v(lqk lqkVar) {
        try {
            D(lqkVar, (itk) this.F);
        } catch (Throwable th) {
            jyj.i("BillingLogger", "Unable to log.", th);
        }
    }

    public void w(lqk lqkVar, int i) {
        try {
            atk atkVar = (atk) ((itk) this.F).l();
            atkVar.b();
            itk.C((itk) atkVar.F, i);
            this.F = (itk) atkVar.a();
            v(lqkVar);
        } catch (Throwable th) {
            jyj.i("BillingLogger", "Unable to log.", th);
        }
    }

    public void x(lqk lqkVar, int i, long j) {
        try {
            atk atkVar = (atk) ((itk) this.F).l();
            atkVar.b();
            itk.C((itk) atkVar.F, i);
            itk itkVar = (itk) atkVar.a();
            this.F = itkVar;
            if (j != 0) {
                atk atkVar2 = (atk) itkVar.l();
                atkVar2.b();
                itk.E((itk) atkVar2.F, j);
                itkVar = (itk) atkVar2.a();
            }
            D(lqkVar, itkVar);
        } catch (Throwable th) {
            jyj.i("BillingLogger", "Unable to log.", th);
        }
    }

    public void y(lqk lqkVar, long j, boolean z) {
        try {
            hqk hqkVar = (hqk) lqkVar.l();
            guk gukVar = (guk) lqkVar.u().l();
            gukVar.c(z);
            hqkVar.b();
            lqk.p((lqk) hqkVar.F, (avk) gukVar.a());
            lqk lqkVar2 = (lqk) hqkVar.a();
            itk itkVar = (itk) this.F;
            if (j != 0) {
                atk atkVar = (atk) itkVar.l();
                atkVar.b();
                itk.E((itk) atkVar.F, j);
                itkVar = (itk) atkVar.a();
            }
            D(lqkVar2, itkVar);
        } catch (Throwable th) {
            jyj.i("BillingLogger", "Unable to log.", th);
        }
    }

    public void z(lqk lqkVar, int i, long j, boolean z) {
        try {
            atk atkVar = (atk) ((itk) this.F).l();
            atkVar.b();
            itk.C((itk) atkVar.F, i);
            this.F = (itk) atkVar.a();
            hqk hqkVar = (hqk) lqkVar.l();
            guk gukVar = (guk) lqkVar.u().l();
            gukVar.c(z);
            hqkVar.b();
            lqk.p((lqk) hqkVar.F, (avk) gukVar.a());
            lqk lqkVar2 = (lqk) hqkVar.a();
            itk itkVar = (itk) this.F;
            if (j != 0) {
                atk atkVar2 = (atk) itkVar.l();
                atkVar2.b();
                itk.E((itk) atkVar2.F, j);
                itkVar = (itk) atkVar2.a();
            }
            D(lqkVar2, itkVar);
        } catch (Throwable th) {
            jyj.i("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // defpackage.lqj
    public Object zza() {
        return new m3l(((kf5) ((hsi) this.F).F).a, (v4l) ((lqj) this.G).zza());
    }

    public /* synthetic */ cbf(Object obj, int i, Object obj2) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
    }

    public cbf(Context context) {
        this.E = 9;
        dgj.v(context);
        Resources resources = context.getResources();
        this.F = resources;
        this.G = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
    }

    public cbf(Context context, itk itkVar) {
        this.E = 24;
        kd4 kd4Var = new kd4();
        try {
            n6i.b(context);
            kd4Var.b = n6i.a().c(g42.e).a("PLAY_BILLING_LIBRARY", new en6("proto"), new byi(7));
        } catch (Throwable unused) {
            kd4Var.a = true;
        }
        this.G = kd4Var;
        this.F = itkVar;
    }

    public cbf(yzk yzkVar) {
        this.E = 25;
        this.G = yzkVar;
    }

    public cbf(bnh bnhVar, nlj nljVar, xxi xxiVar) {
        this.E = 21;
        this.F = bnhVar;
        this.G = nljVar;
    }

    public cbf(Context context, h99 h99Var) {
        this.E = 11;
        context.getClass();
        h99Var.getClass();
        this.G = context;
        this.F = h99Var;
    }

    public cbf(h99 h99Var, int i) {
        this.E = i;
        switch (i) {
            case 8:
                tj5 tj5Var = new tj5(h99Var);
                this.F = h99Var;
                this.G = tj5Var;
                break;
            default:
                h99Var.getClass();
                this.F = h99Var;
                this.G = new LinkedHashMap();
                break;
        }
    }

    public cbf(lja ljaVar) {
        this.E = 15;
        gfa gfaVar = new gfa("Type parameter upper bound erasure results");
        this.F = new u0h(new x7f(6, this));
        this.G = gfaVar.b(new r1g(3, this));
    }

    public cbf(h99 h99Var, g4d g4dVar) {
        this.E = 12;
        h99Var.getClass();
        this.F = h99Var;
        this.G = g4dVar;
    }

    public cbf(blh blhVar, zdi zdiVar) {
        this.E = 13;
        this.F = zdiVar;
        this.G = mpk.P(blhVar);
    }

    public cbf(bz7 bz7Var, pz7 pz7Var) {
        this.E = 2;
        this.F = new cbf(3);
        this.G = new cyf(bz7Var, pz7Var);
    }

    public cbf(xhd xhdVar, ggj ggjVar) {
        this.E = 20;
        xhdVar.getClass();
        ggjVar.getClass();
        this.F = xhdVar;
        this.G = ggjVar;
    }

    public cbf(hr5 hr5Var) {
        this.E = 10;
        this.F = hr5Var;
        this.G = new Object();
    }

    public cbf(WindowInsetsAnimation.Bounds bounds) {
        this.E = 19;
        this.F = f59.d(bounds.getLowerBound());
        this.G = f59.d(bounds.getUpperBound());
    }
}
