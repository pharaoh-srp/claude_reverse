package defpackage;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import androidx.health.platform.client.proto.g;
import com.datadog.android.rum.DdRumContentProvider;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class mx1 extends ts9 implements zy7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mx1(fo9 fo9Var, zy7 zy7Var) {
        super(0);
        this.F = 9;
        this.H = fo9Var;
        this.G = zy7Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v38, types: [hqb] */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41, types: [hqb] */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v58 */
    /* JADX WARN: Type inference failed for: r0v59 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27, types: [wwb] */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v30, types: [wwb] */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r2v26 */
    @Override // defpackage.zy7
    public final Object a() throws IOException {
        l9e l9eVar;
        long jNanoTime;
        jo9 jo9VarN;
        int i = this.F;
        iei ieiVar = iei.a;
        int i2 = 1;
        Object obj = this.H;
        Object obj2 = this.G;
        switch (i) {
            case 0:
                zy7 zy7Var = (zy7) obj2;
                if (zy7Var != null && (l9eVar = (l9e) zy7Var.a()) != null) {
                    return l9eVar;
                }
                m5c m5cVar = (m5c) obj;
                if (!m5cVar.h1().R) {
                    m5cVar = null;
                }
                if (m5cVar != null) {
                    return d4c.x(0L, csg.T(m5cVar.G));
                }
                return null;
            case 1:
                ((z42) obj2).U.invoke((b52) obj);
                return ieiVar;
            case 2:
                el5 el5Var = (el5) obj2;
                wc0 annotations = ((lh3) obj).getAnnotations();
                el5Var.getClass();
                annotations.getClass();
                return ((ke9) el5Var.E).q.b((ef9) ((kw9) el5Var.H).getValue(), annotations);
            case 3:
                o25 o25Var = (o25) obj2;
                gdc gdcVarB = ((hdc) o25Var.f.getValue()).b();
                if (((bg4) obj).a) {
                    gdcVarB.a(x44.W(jh4.g));
                }
                gdcVarB.c.add(new abg(o25Var.a));
                return new hdc(gdcVarB);
            case 4:
                String str = (String) obj2;
                Context context = (Context) obj;
                Object systemService = context.getSystemService("uimode");
                UiModeManager uiModeManager = systemService instanceof UiModeManager ? (UiModeManager) systemService : null;
                if (uiModeManager == null || uiModeManager.getCurrentModeType() != 4) {
                    PackageManager packageManager = context.getPackageManager();
                    packageManager.getClass();
                    if (!packageManager.hasSystemFeature("android.software.leanback") && !packageManager.hasSystemFeature("com.google.android.tv")) {
                        Locale locale = Locale.US;
                        String strN = ij0.n(locale, str, locale);
                        if (bsg.u0(strN, "tablet", false) || bsg.u0(strN, "sm-t", false) || context.getResources().getConfiguration().smallestScreenWidthDp >= 800) {
                            return t26.F;
                        }
                        String lowerCase = str.toLowerCase(locale);
                        lowerCase.getClass();
                        if (!bsg.u0(lowerCase, "phone", false)) {
                            Object systemService2 = context.getSystemService("phone");
                            TelephonyManager telephonyManager = systemService2 instanceof TelephonyManager ? (TelephonyManager) systemService2 : null;
                            if (telephonyManager != null && telephonyManager.getPhoneType() == 0) {
                                i = 1;
                            }
                            i2 = 1 ^ i;
                        }
                        return i2 != 0 ? t26.E : t26.H;
                    }
                }
                return t26.G;
            case 5:
                if (((hz1) ((jz1) obj2)).c) {
                    ((iuj) ((qp5) obj).a.a()).getClass();
                    jNanoTime = System.nanoTime() - TimeUnit.MILLISECONDS.toNanos(SystemClock.elapsedRealtime() - Process.getStartElapsedRealtime());
                    long j = DdRumContentProvider.F;
                    boolean z = jNanoTime > j;
                    i = j - jNanoTime > qp5.c ? 1 : 0;
                    if (z || i != 0) {
                        jNanoTime = j;
                    }
                } else {
                    jNanoTime = DdRumContentProvider.F;
                }
                return Long.valueOf(jNanoTime);
            case 6:
                oj9 oj9Var = (oj9) obj2;
                bz7 bz7Var = oj9Var.b;
                uqb uqbVar = oj9Var.a;
                gfa gfaVar = (gfa) obj;
                zg3 zg3Var = new zg3((bo5) bz7Var.invoke(uqbVar), oj9.g, 4, 2, x44.W(uqbVar.H.e()), gfaVar);
                zg3Var.v0(new yp3(gfaVar, zg3Var), um6.E, null);
                return zg3Var;
            case 7:
                rj9 rj9Var = (rj9) obj2;
                uqb uqbVarK = rj9Var.k();
                uqbVarK.getClass();
                return new wj9(uqbVarK, (gfa) obj, new l4(19, rj9Var));
            case 8:
                wj9 wj9Var = (wj9) obj2;
                tqb tqbVarA = wj9Var.b().a();
                oj9.d.getClass();
                return kxk.v(tqbVarA, oj9.h, new dpf((gfa) obj, wj9Var.b().a())).W();
            case 9:
                fo9 fo9Var = (fo9) obj;
                List listH = fo9Var.E.H();
                if (listH.isEmpty()) {
                    return lm6.E;
                }
                kw9 kw9VarW = yb5.w(w1a.F, new v01(23, fo9Var));
                List list = listH;
                zy7 zy7Var2 = (zy7) obj2;
                ArrayList arrayList = new ArrayList(x44.y(list, 10));
                for (Object obj3 : list) {
                    int i3 = i + 1;
                    if (i < 0) {
                        x44.n0();
                        throw null;
                    }
                    vai vaiVar = (vai) obj3;
                    if (vaiVar.c()) {
                        jo9 jo9Var = jo9.c;
                        jo9VarN = xsc.m();
                    } else {
                        yr9 yr9VarB = vaiVar.b();
                        yr9VarB.getClass();
                        fo9 fo9Var2 = new fo9(yr9VarB, zy7Var2 == null ? null : new x9b(fo9Var, i, kw9VarW));
                        int iF = sq6.F(vaiVar.a());
                        if (iF == 0) {
                            jo9 jo9Var2 = jo9.c;
                            jo9VarN = xsc.n(fo9Var2);
                        } else if (iF == 1) {
                            jo9 jo9Var3 = jo9.c;
                            jo9VarN = xsc.j(fo9Var2);
                        } else {
                            if (iF != 2) {
                                mr9.b();
                                return null;
                            }
                            jo9 jo9Var4 = jo9.c;
                            jo9VarN = xsc.k(fo9Var2);
                        }
                    }
                    arrayList.add(jo9VarN);
                    i = i3;
                }
                return arrayList;
            case 10:
                g5c g5cVar = ((av9) obj2).k0;
                dae daeVar = (dae) obj;
                if ((((hqb) g5cVar.K).H & 8) != 0) {
                    for (hqb hqbVar = (j4h) g5cVar.J; hqbVar != null; hqbVar = hqbVar.I) {
                        if ((hqbVar.G & 8) != 0) {
                            ?? J = hqbVar;
                            ?? wwbVar = 0;
                            while (J != 0) {
                                if (J instanceof ujf) {
                                    ujf ujfVar = (ujf) J;
                                    if (ujfVar.S()) {
                                        qjf qjfVar = new qjf();
                                        daeVar.E = qjfVar;
                                        qjfVar.H = true;
                                    }
                                    if (ujfVar.Z0()) {
                                        ((qjf) daeVar.E).G = true;
                                    }
                                    ujfVar.X0((ekf) daeVar.E);
                                } else if ((J.G & 8) != 0 && (J instanceof qw5)) {
                                    hqb hqbVar2 = ((qw5) J).T;
                                    int i4 = 0;
                                    J = J;
                                    wwbVar = wwbVar;
                                    while (hqbVar2 != null) {
                                        if ((hqbVar2.G & 8) != 0) {
                                            i4++;
                                            wwbVar = wwbVar;
                                            if (i4 == 1) {
                                                J = hqbVar2;
                                            } else {
                                                if (wwbVar == 0) {
                                                    wwbVar = new wwb(0, new hqb[16]);
                                                }
                                                if (J != 0) {
                                                    wwbVar.b(J);
                                                    J = 0;
                                                }
                                                wwbVar.b(hqbVar2);
                                            }
                                        }
                                        hqbVar2 = hqbVar2.J;
                                        J = J;
                                        wwbVar = wwbVar;
                                    }
                                    if (i4 == 1) {
                                    }
                                }
                                J = yfd.j(wwbVar);
                            }
                        }
                    }
                }
                return ieiVar;
            case 11:
                return new by9(((cy9) obj2).a, (ube) obj);
            case 12:
                kbe kbeVar = ((ke9) ((el5) obj2).E).b;
                ww7 ww7Var = ((hy9) obj).o.I;
                kbeVar.getClass();
                ww7Var.getClass();
                return null;
            case 13:
                xre xreVar = m5c.t0;
                ((bz7) obj2).invoke(xreVar);
                m5c m5cVar2 = (m5c) obj;
                boolean zR = x44.r(m5cVar2.j0, xreVar.S);
                boolean z2 = m5cVar2.k0;
                boolean z3 = xreVar.T;
                i = z2 != z3 ? 1 : 0;
                if (!zR || i != 0) {
                    m5cVar2.j0 = xreVar.S;
                    m5cVar2.k0 = z3;
                    if (m5cVar2.l0 && (i != 0 || (z3 && !zR))) {
                        m5cVar2.S.V();
                    }
                }
                m5cVar2.l0 = true;
                xreVar.a0 = xreVar.S.a(xreVar.V, xreVar.X, xreVar.W);
                return ieiVar;
            case 14:
                return Boolean.valueOf(x44.r(obj2, ((che) obj).j.getValue()));
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return Float.valueOf(((Number) ((zy7) ((nwb) obj2).getValue()).a()).floatValue() / (((Number) ((nwb) obj).getValue()).floatValue() / 1000.0f));
            default:
                bpg bpgVar = (bpg) obj2;
                fj0 fj0Var = bpgVar.F;
                String str2 = bpgVar.L;
                boolean zB = fj0Var.B(bpg.b(bpgVar));
                if (zB) {
                    fj0Var.U(str2);
                }
                File file = (File) fj0Var.G;
                if ((file != null ? file.length() : 0L) > 475000) {
                    bpg.c(bpgVar);
                    zB = fj0Var.B(bpg.b(bpgVar));
                    fj0Var.U(str2);
                }
                StringBuilder sb = new StringBuilder();
                if (!zB) {
                    sb.append(',');
                }
                sb.append((String) obj);
                fj0Var.U(sb.toString());
                return ieiVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mx1(Object obj, int i, Object obj2) {
        super(0);
        this.F = i;
        this.G = obj;
        this.H = obj2;
    }
}
