package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.a;
import com.google.android.gms.internal.measurement.b;
import com.google.android.gms.internal.measurement.c;
import com.google.android.gms.internal.measurement.e;
import com.google.android.gms.internal.measurement.g;
import com.google.android.gms.internal.measurement.h;
import com.google.android.gms.internal.measurement.i0;
import com.google.android.gms.internal.measurement.j;
import com.google.android.gms.internal.measurement.j0;
import com.google.android.gms.internal.measurement.k;
import com.google.android.gms.internal.measurement.l;
import com.google.android.gms.internal.measurement.m;
import com.google.android.gms.internal.measurement.q;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.internal.measurement.zzlk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class pkk extends k0l implements frj {
    public final bp0 H;
    public final bp0 I;
    public final bp0 J;
    public final bp0 K;
    public final bp0 L;
    public final bp0 M;
    public final uh4 N;
    public final hsi O;
    public final bp0 P;
    public final bp0 Q;
    public final bp0 R;

    public pkk(o0l o0lVar) {
        super(o0lVar);
        this.H = new bp0(0);
        this.I = new bp0(0);
        this.J = new bp0(0);
        this.K = new bp0(0);
        this.L = new bp0(0);
        this.P = new bp0(0);
        this.Q = new bp0(0);
        this.R = new bp0(0);
        this.M = new bp0(0);
        this.N = new uh4(this);
        this.O = new hsi(4, this);
    }

    public static bp0 S0(m mVar) {
        bp0 bp0Var = new bp0(0);
        for (q qVar : mVar.E()) {
            bp0Var.put(qVar.q(), qVar.r());
        }
        return bp0Var;
    }

    public static ork V0(int i) {
        int i2 = plk.b[sq6.F(i)];
        if (i2 == 1) {
            return ork.AD_STORAGE;
        }
        if (i2 == 2) {
            return ork.ANALYTICS_STORAGE;
        }
        if (i2 == 3) {
            return ork.AD_USER_DATA;
        }
        if (i2 != 4) {
            return null;
        }
        return ork.AD_PERSONALIZATION;
    }

    @Override // defpackage.k0l
    public final boolean Q0() {
        return false;
    }

    public final long R0(String str) {
        String strO = o(str, "measurement.account.time_zone_offset_minutes");
        if (TextUtils.isEmpty(strO)) {
            return 0L;
        }
        try {
            return Long.parseLong(strO);
        } catch (NumberFormatException e) {
            this.b0().M.a(qgk.Q0(str), e, "Unable to parse timezone offset. appId");
            return 0L;
        }
    }

    public final m T0(String str, byte[] bArr) {
        if (bArr == null) {
            return m.x();
        }
        try {
            m mVar = (m) ((lek) dik.e1(m.w(), bArr)).b();
            b0().R.a(mVar.J() ? Long.valueOf(mVar.u()) : null, mVar.H() ? mVar.z() : null, "Parsed config. version, gmp_app_id");
            return mVar;
        } catch (zzlk e) {
            b0().M.a(qgk.Q0(str), e, "Unable to merge remote config. appId");
            return m.x();
        } catch (RuntimeException e2) {
            b0().M.a(qgk.Q0(str), e2, "Unable to merge remote config. appId");
            return m.x();
        }
    }

    public final mrk U0(String str, ork orkVar) {
        K0();
        j1(str);
        j jVarA1 = a1(str);
        if (jVarA1 != null) {
            Iterator it = jVarA1.u().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                g gVar = (g) it.next();
                if (V0(gVar.r()) == orkVar) {
                    int i = plk.c[sq6.F(gVar.q())];
                    if (i == 1) {
                        return mrk.DENIED;
                    }
                    if (i == 2) {
                        return mrk.GRANTED;
                    }
                }
            }
        }
        return mrk.UNINITIALIZED;
    }

    public final void W0(String str, m mVar) {
        int iP = mVar.p();
        uh4 uh4Var = this.N;
        if (iP == 0) {
            uh4Var.e(str);
            return;
        }
        b0().R.c("EES programs found", Integer.valueOf(mVar.p()));
        int i = 0;
        j0 j0Var = (j0) mVar.D().get(0);
        try {
            cuj cujVar = new cuj();
            cujVar.c("internal.remoteConfig", new ukk(this, str, i));
            cujVar.c("internal.appMetadata", new ukk(this, str, 2));
            cujVar.c("internal.logger", new eqb(2, this));
            cujVar.b(j0Var);
            uh4Var.d(str, cujVar);
            b0().R.a(str, Integer.valueOf(j0Var.p().p()), "EES program loaded for appId, activities");
            Iterator it = j0Var.p().r().iterator();
            while (it.hasNext()) {
                b0().R.c("EES program activity", ((i0) it.next()).p());
            }
        } catch (zzc unused) {
            b0().J.c("Failed to load EES program. appId", str);
        }
    }

    public final void X0(String str, String str2, String str3, byte[] bArr) {
        byte[] bArrC;
        boolean z;
        boolean z2;
        O0();
        K0();
        dgj.s(str);
        lek lekVar = (lek) T0(str, bArr).l();
        Y0(str, lekVar);
        W0(str, (m) lekVar.b());
        m mVar = (m) lekVar.b();
        bp0 bp0Var = this.L;
        bp0Var.put(str, mVar);
        this.P.put(str, ((m) lekVar.F).A());
        this.Q.put(str, str2);
        this.R.put(str, str3);
        this.H.put(str, S0((m) lekVar.b()));
        wrj wrjVarM0 = M0();
        ArrayList<a> arrayList = new ArrayList(Collections.unmodifiableList(((m) lekVar.F).B()));
        int i = 0;
        while (i < arrayList.size()) {
            vck vckVar = (vck) ((a) arrayList.get(i)).l();
            if (vckVar.f() != 0) {
                int i2 = 0;
                while (i2 < vckVar.f()) {
                    wck wckVar = (wck) vckVar.g(i2).l();
                    wck wckVar2 = (wck) ((nxk) wckVar.clone());
                    bp0 bp0Var2 = bp0Var;
                    String strB = q7j.b(wckVar.j(), v40.k, v40.m);
                    if (strB != null) {
                        wckVar2.i(strB);
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    int i3 = 0;
                    while (i3 < wckVar.f()) {
                        c cVarG = wckVar.g(i3);
                        wck wckVar3 = wckVar;
                        String strH = sik.h(cVarG.t());
                        if (strH != null) {
                            xck xckVar = (xck) cVarG.l();
                            xckVar.f(strH);
                            wckVar2.h(i3, (c) xckVar.b());
                            z2 = true;
                        }
                        i3++;
                        wckVar = wckVar3;
                    }
                    if (z2) {
                        vckVar.h(i2, wckVar2);
                        arrayList.set(i, (a) vckVar.b());
                    }
                    i2++;
                    bp0Var = bp0Var2;
                }
            }
            bp0 bp0Var3 = bp0Var;
            if (vckVar.j() != 0) {
                for (int i4 = 0; i4 < vckVar.j(); i4++) {
                    e eVarK = vckVar.k(i4);
                    String strM = tik.m(eVarK.t());
                    if (strM != null) {
                        zck zckVar = (zck) eVarK.l();
                        zckVar.f(strM);
                        vckVar.i(i4, zckVar);
                        arrayList.set(i, (a) vckVar.b());
                    }
                }
            }
            i++;
            bp0Var = bp0Var3;
        }
        bp0 bp0Var4 = bp0Var;
        wrjVarM0.O0();
        wrjVarM0.K0();
        dgj.s(str);
        SQLiteDatabase sQLiteDatabaseR0 = wrjVarM0.R0();
        sQLiteDatabaseR0.beginTransaction();
        try {
            wrjVarM0.O0();
            wrjVarM0.K0();
            dgj.s(str);
            SQLiteDatabase sQLiteDatabaseR02 = wrjVarM0.R0();
            sQLiteDatabaseR02.delete("property_filters", "app_id=?", new String[]{str});
            sQLiteDatabaseR02.delete("event_filters", "app_id=?", new String[]{str});
            for (a aVar : arrayList) {
                wrjVarM0.O0();
                wrjVarM0.K0();
                dgj.s(str);
                dgj.v(aVar);
                if (aVar.z()) {
                    int iP = aVar.p();
                    Iterator it = aVar.x().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!((b) it.next()).C()) {
                                wrjVarM0.b0().M.a(qgk.Q0(str), Integer.valueOf(iP), "Event filter with no ID. Audience definition ignored. appId, audienceId");
                                break;
                            }
                        } else {
                            Iterator it2 = aVar.y().iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (!((e) it2.next()).x()) {
                                        wrjVarM0.b0().M.a(qgk.Q0(str), Integer.valueOf(iP), "Property filter with no ID. Audience definition ignored. appId, audienceId");
                                        break;
                                    }
                                } else {
                                    Iterator it3 = aVar.x().iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            if (!wrjVarM0.q1(str, iP, (b) it3.next())) {
                                                z = false;
                                                break;
                                            }
                                        } else {
                                            z = true;
                                            break;
                                        }
                                    }
                                    if (z) {
                                        Iterator it4 = aVar.y().iterator();
                                        while (true) {
                                            if (it4.hasNext()) {
                                                if (!wrjVarM0.r1(str, iP, (e) it4.next())) {
                                                    z = false;
                                                    break;
                                                }
                                            } else {
                                                break;
                                            }
                                        }
                                    }
                                    if (!z) {
                                        wrjVarM0.O0();
                                        wrjVarM0.K0();
                                        dgj.s(str);
                                        SQLiteDatabase sQLiteDatabaseR03 = wrjVarM0.R0();
                                        sQLiteDatabaseR03.delete("property_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(iP)});
                                        sQLiteDatabaseR03.delete("event_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(iP)});
                                    }
                                }
                            }
                        }
                    }
                } else {
                    wrjVarM0.b0().M.c("Audience with no ID. appId", qgk.Q0(str));
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (a aVar2 : arrayList) {
                arrayList2.add(aVar2.z() ? Integer.valueOf(aVar2.p()) : null);
            }
            wrjVarM0.A1(str, arrayList2);
            sQLiteDatabaseR0.setTransactionSuccessful();
            sQLiteDatabaseR0.endTransaction();
            try {
                lekVar.c();
                m.r((m) lekVar.F);
                bArrC = ((m) lekVar.b()).c();
            } catch (RuntimeException e) {
                b0().M.a(qgk.Q0(str), e, "Unable to serialize reduced-size config. Storing full config instead. appId");
                bArrC = bArr;
            }
            wrj wrjVarM02 = M0();
            dgj.s(str);
            wrjVarM02.K0();
            wrjVarM02.O0();
            ContentValues contentValues = new ContentValues();
            contentValues.put("remote_config", bArrC);
            contentValues.put("config_last_modified_time", str2);
            contentValues.put("e_tag", str3);
            try {
                if (wrjVarM02.R0().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                    wrjVarM02.b0().J.c("Failed to update remote config (got 0). appId", qgk.Q0(str));
                }
            } catch (SQLiteException e2) {
                wrjVarM02.b0().J.a(qgk.Q0(str), e2, "Error storing remote config. appId");
            }
            bp0Var4.put(str, (m) lekVar.b());
        } catch (Throwable th) {
            sQLiteDatabaseR0.endTransaction();
            throw th;
        }
    }

    public final void Y0(String str, lek lekVar) {
        HashSet hashSet = new HashSet();
        bp0 bp0Var = new bp0(0);
        bp0 bp0Var2 = new bp0(0);
        bp0 bp0Var3 = new bp0(0);
        Iterator it = Collections.unmodifiableList(((m) lekVar.F).C()).iterator();
        while (it.hasNext()) {
            hashSet.add(((k) it.next()).q());
        }
        for (int i = 0; i < ((m) lekVar.F).t(); i++) {
            kek kekVar = (kek) ((m) lekVar.F).q(i).l();
            if (kekVar.f().isEmpty()) {
                b0().M.b("EventConfig contained null event name");
            } else {
                String strF = kekVar.f();
                String strB = q7j.b(kekVar.f(), v40.k, v40.m);
                if (!TextUtils.isEmpty(strB)) {
                    kekVar.c();
                    l.q((l) kekVar.F, strB);
                    lekVar.c();
                    m.s((m) lekVar.F, i, (l) kekVar.b());
                }
                if (((l) kekVar.F).u() && ((l) kekVar.F).s()) {
                    bp0Var.put(strF, Boolean.TRUE);
                }
                if (((l) kekVar.F).v() && ((l) kekVar.F).t()) {
                    bp0Var2.put(kekVar.f(), Boolean.TRUE);
                }
                if (((l) kekVar.F).w()) {
                    if (((l) kekVar.F).p() < 2 || ((l) kekVar.F).p() > 65535) {
                        b0().M.a(kekVar.f(), Integer.valueOf(((l) kekVar.F).p()), "Invalid sampling rate. Event name, sample rate");
                    } else {
                        bp0Var3.put(kekVar.f(), Integer.valueOf(((l) kekVar.F).p()));
                    }
                }
            }
        }
        this.I.put(str, hashSet);
        this.J.put(str, bp0Var);
        this.K.put(str, bp0Var2);
        this.M.put(str, bp0Var3);
    }

    public final int Z0(String str, String str2) {
        Integer num;
        K0();
        j1(str);
        Map map = (Map) this.M.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    public final j a1(String str) {
        K0();
        j1(str);
        m mVarC1 = c1(str);
        if (mVarC1 == null || !mVarC1.G()) {
            return null;
        }
        return mVarC1.v();
    }

    public final ork b1(String str) {
        K0();
        j1(str);
        j jVarA1 = a1(str);
        if (jVarA1 == null) {
            return null;
        }
        for (h hVar : jVarA1.t()) {
            if (ork.AD_USER_DATA == V0(hVar.r())) {
                return V0(hVar.q());
            }
        }
        return null;
    }

    public final m c1(String str) {
        O0();
        K0();
        dgj.s(str);
        j1(str);
        return (m) this.L.get(str);
    }

    public final boolean d1(String str, String str2) {
        Boolean bool;
        K0();
        j1(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.K.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean e1(String str, ork orkVar) {
        K0();
        j1(str);
        j jVarA1 = a1(str);
        if (jVarA1 == null) {
            return false;
        }
        for (g gVar : jVarA1.s()) {
            if (orkVar == V0(gVar.r())) {
                return gVar.q() == 2;
            }
        }
        return false;
    }

    public final boolean f1(String str, String str2) {
        Boolean bool;
        K0();
        j1(str);
        if ("1".equals(o(str, "measurement.upload.blacklist_internal")) && h1l.P1(str2)) {
            return true;
        }
        if ("1".equals(o(str, "measurement.upload.blacklist_public")) && h1l.R1(str2)) {
            return true;
        }
        Map map = (Map) this.J.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final String g1(String str) {
        K0();
        j1(str);
        return (String) this.P.get(str);
    }

    public final boolean h1(String str) {
        K0();
        j1(str);
        bp0 bp0Var = this.I;
        return bp0Var.get(str) != null && ((Set) bp0Var.get(str)).contains("app_instance_id");
    }

    public final boolean i1(String str) {
        K0();
        j1(str);
        bp0 bp0Var = this.I;
        if (bp0Var.get(str) != null) {
            return ((Set) bp0Var.get(str)).contains("os_version") || ((Set) bp0Var.get(str)).contains("device_info");
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j1(java.lang.String r13) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pkk.j1(java.lang.String):void");
    }

    @Override // defpackage.frj
    public final String o(String str, String str2) {
        K0();
        j1(str);
        Map map = (Map) this.H.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }
}
