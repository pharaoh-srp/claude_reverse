package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontVariationAxis;
import android.os.Build;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.core.telemetry.SilentException;
import com.anthropic.claude.tool.model.ChartDisplayV0Input;
import com.anthropic.claude.tool.model.ChartDisplayV0Output;
import com.anthropic.claude.tool.model.ChartDisplayV0OutputStatus;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class ql8 implements j20, fdg, x4d, ia4, go0, jo0, lp3, m6e, bh5, k0j, c6d, w3g {
    public static final ql8 F = new ql8(1);
    public static final ql8 G = new ql8(2);
    public static final ql8 H = new ql8(3);
    public static final ql8 I = new ql8(5);
    public static final ql8 J = new ql8(6);
    public static final ql8 K = new ql8(7);
    public static final ql8 L = new ql8(8);
    public static final ql8 M = new ql8(9);
    public static final ql8 N = new ql8(10);
    public static final /* synthetic */ ql8 O = new ql8(11);
    public final /* synthetic */ int E;

    public ql8(gfa gfaVar) {
        this.E = 27;
        String str = gfa.d;
        new ConcurrentHashMap(3, 1.0f, 2);
    }

    public static final void m(AtomicBoolean atomicBoolean, ua2 ua2Var) {
        if (atomicBoolean.compareAndSet(false, true)) {
            ua2Var.resumeWith(iei.a);
        } else {
            SilentException.a(new SilentException("startUpWebView resumed more than once"), ozf.F, false, 2);
        }
    }

    public static Typeface n(String str, dv7 dv7Var, int i) {
        if (i == 0 && x44.r(dv7Var, dv7.J) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), dv7Var.E, i == 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v11 */
    public static t o(j7g j7gVar, g4 g4Var, int i, int i2, boolean z, boolean z2) {
        xh3 xh3VarA;
        u9i u9iVarO;
        Boolean bool;
        at atVar;
        Object objK;
        boolean zM = wvk.m(i2);
        ?? r4 = 0;
        boolean z3 = (z2 && z) ? false : true;
        Object obj = null;
        if ((zM || !j7gVar.H().isEmpty()) && (xh3VarA = j7gVar.O().a()) != null) {
            df9 df9Var = (df9) g4Var.invoke(Integer.valueOf(i));
            qqb qqbVarB = eai.b(xh3VarA, df9Var, i2);
            Boolean boolD = eai.d(df9Var, i2);
            if (qqbVarB == null || (u9iVarO = qqbVarB.p()) == null) {
                u9iVarO = j7gVar.O();
            }
            u9iVarO.getClass();
            int iK = i + 1;
            List listH = j7gVar.H();
            List parameters = u9iVarO.getParameters();
            parameters.getClass();
            List list = parameters;
            Iterator it = listH.iterator();
            Iterator it2 = list.iterator();
            ArrayList arrayList = new ArrayList(Math.min(x44.y(listH, 10), x44.y(list, 10)));
            while (it.hasNext() && it2.hasNext()) {
                Object next = it.next();
                qai qaiVar = (qai) it2.next();
                vai vaiVar = (vai) next;
                int i3 = 4;
                if (z3) {
                    bool = boolD;
                    if (!vaiVar.c()) {
                        atVar = p(vaiVar.b().k0(), g4Var, iK, z2);
                    } else if (((df9) g4Var.invoke(Integer.valueOf(iK))).b() == p9c.E) {
                        fhi fhiVarK0 = vaiVar.b().k0();
                        atVar = new at(yfd.z(yb5.A(fhiVarK0).l0(r4), yb5.S(fhiVarK0).l0(true)), 1, 4);
                    } else {
                        atVar = new at((Object) null, 1, i3);
                    }
                } else {
                    bool = boolD;
                    atVar = new at(obj, (int) r4, i3);
                }
                iK += atVar.k();
                if (atVar.l() != null) {
                    yr9 yr9VarL = atVar.l();
                    int iA = vaiVar.a();
                    sq6.a(iA);
                    objK = jwk.u(yr9VarL, iA, qaiVar);
                } else if (qqbVarB == null || vaiVar.c()) {
                    objK = qqbVarB != null ? fbi.k(qaiVar) : null;
                } else {
                    yr9 yr9VarB = vaiVar.b();
                    yr9VarB.getClass();
                    int iA2 = vaiVar.a();
                    sq6.a(iA2);
                    objK = jwk.u(yr9VarB, iA2, qaiVar);
                }
                arrayList.add(objK);
                boolD = bool;
                r4 = 0;
                obj = null;
            }
            Boolean bool2 = boolD;
            int i4 = iK - i;
            if (qqbVarB == null && bool2 == null) {
                if (!arrayList.isEmpty()) {
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        if (((vai) it3.next()) == null) {
                        }
                    }
                }
                return new t(null, i4, false);
            }
            wc0 annotations = j7gVar.getAnnotations();
            xc0 xc0Var = eai.b;
            if (qqbVarB == null) {
                xc0Var = null;
            }
            r9i r9iVarQ = rvk.q(eai.a(mp0.C0(new wc0[]{annotations, xc0Var, bool2 != null ? eai.e() : null})));
            List listH2 = j7gVar.H();
            Iterator it4 = arrayList.iterator();
            Iterator it5 = listH2.iterator();
            ArrayList arrayList2 = new ArrayList(Math.min(x44.y(arrayList, 10), x44.y(listH2, 10)));
            while (it4.hasNext() && it5.hasNext()) {
                Object next2 = it4.next();
                vai vaiVar2 = (vai) it5.next();
                vai vaiVar3 = (vai) next2;
                if (vaiVar3 != null) {
                    vaiVar2 = vaiVar3;
                }
                arrayList2.add(vaiVar2);
            }
            j7g j7gVarC0 = yfd.c0(r9iVarQ, u9iVarO, arrayList2, bool2 != null ? bool2.booleanValue() : j7gVar.b0());
            if (df9Var.a()) {
                j7gVarC0 = new w6c(j7gVarC0);
            }
            return new t(j7gVarC0, i4, bool2 != null && df9Var.c());
        }
        return new t(null, 1, false);
    }

    public static at p(fhi fhiVar, g4 g4Var, int i, boolean z) {
        yr9 yr9VarG;
        int i2 = 4;
        Object objN = null;
        if (ttj.j(fhiVar)) {
            return new at(objN, 1, i2);
        }
        if (!(fhiVar instanceof sn7)) {
            if (fhiVar instanceof j7g) {
                t tVarO = o((j7g) fhiVar, g4Var, i, 3, false, z);
                return new at(tVarO.e() ? nwk.n(fhiVar, tVarO.g()) : tVarO.g(), tVarO.f(), i2);
            }
            mr9.b();
            return null;
        }
        boolean z2 = fhiVar instanceof j2e;
        sn7 sn7Var = (sn7) fhiVar;
        j7g j7gVar = sn7Var.G;
        j7g j7gVar2 = sn7Var.F;
        t tVarO2 = o(j7gVar2, g4Var, i, 1, z2, z);
        t tVarO3 = o(sn7Var.G, g4Var, i, 2, z2, z);
        if (tVarO2.g() != null || tVarO3.g() != null) {
            if (tVarO2.e() || tVarO3.e()) {
                j7g j7gVarG = tVarO3.g();
                if (j7gVarG != null) {
                    j7g j7gVarG2 = tVarO2.g();
                    if (j7gVarG2 == null) {
                        j7gVarG2 = j7gVarG;
                    }
                    yr9VarG = yfd.z(j7gVarG2, j7gVarG);
                } else {
                    yr9VarG = tVarO2.g();
                    yr9VarG.getClass();
                }
                objN = nwk.n(fhiVar, yr9VarG);
            } else if (z2) {
                j7g j7gVarG3 = tVarO2.g();
                if (j7gVarG3 == null) {
                    j7gVarG3 = j7gVar2;
                }
                j7g j7gVarG4 = tVarO3.g();
                if (j7gVarG4 != null) {
                    j7gVar = j7gVarG4;
                }
                objN = new j2e(j7gVarG3, j7gVar);
            } else {
                j7g j7gVarG5 = tVarO2.g();
                if (j7gVarG5 == null) {
                    j7gVarG5 = j7gVar2;
                }
                j7g j7gVarG6 = tVarO3.g();
                if (j7gVarG6 != null) {
                    j7gVar = j7gVarG6;
                }
                objN = yfd.z(j7gVarG5, j7gVar);
            }
        }
        return new at(objN, tVarO2.f(), i2);
    }

    public static bh8 t(Context context) {
        context.getClass();
        int iU = u(context, "com.google.android.apps.healthdata");
        if (iU == 1) {
            pmf.n("SDK version too low or running in a profile");
            return null;
        }
        if (iU != 2) {
            return Build.VERSION.SDK_INT >= 34 ? new th8(context) : new mh8(context, "com.google.android.apps.healthdata");
        }
        sz6.j("Service not available");
        return null;
    }

    public static int u(Context context, String str) {
        context.getClass();
        int i = Build.VERSION.SDK_INT;
        if (34 <= i) {
            return h02.d(context);
        }
        if (28 > i || i >= 34) {
            return 1;
        }
        PackageManager packageManager = context.getPackageManager();
        packageManager.getClass();
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
            packageInfo.getClass();
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (applicationInfo == null || !applicationInfo.enabled) {
                return 2;
            }
            if (str.equals("com.google.android.apps.healthdata") && rwk.m(packageInfo) < 68623) {
                return 2;
            }
            Intent intent = new Intent();
            intent.setPackage(str);
            intent.setAction("androidx.health.ACTION_BIND_HEALTH_DATA_SERVICE");
            List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
            listQueryIntentServices.getClass();
            return !listQueryIntentServices.isEmpty() ? 3 : 2;
        } catch (PackageManager.NameNotFoundException unused) {
            return 2;
        }
    }

    public static ize x(de9 de9Var) {
        de9Var.getClass();
        return new ize((obe) de9Var);
    }

    @Override // defpackage.k0j
    public void a(j0j j0jVar) {
    }

    @Override // defpackage.k0j
    public void b(j0j j0jVar) {
        j0jVar.getClass();
    }

    @Override // defpackage.x4d
    public boolean c(qqb qqbVar, p16 p16Var) {
        qqbVar.getClass();
        return !p16Var.getAnnotations().x(y4d.a());
    }

    @Override // defpackage.go0, defpackage.jo0
    public float d() {
        return MTTypesetterKt.kLineSkipLimitMultiplier;
    }

    @Override // defpackage.j20
    public Object e(Context context, k20 k20Var) {
        return h(context, k20Var);
    }

    @Override // defpackage.w3g
    public kp7 f(nvg nvgVar) {
        return new pj4(1, t3g.E);
    }

    @Override // defpackage.c6d
    public Typeface g(dv7 dv7Var, int i) {
        return n(null, dv7Var, i);
    }

    @Override // defpackage.m6e
    public yr9 getType() {
        throw new IllegalStateException("This method should not be called");
    }

    @Override // defpackage.j20
    public Typeface h(Context context, k20 k20Var) throws IOException {
        context.getClass();
        k20Var.getClass();
        re7 re7Var = (re7) k20Var;
        dv7 dv7Var = re7Var.g;
        int i = re7Var.h != 1 ? 0 : 1;
        int i2 = dv7Var.E;
        int i3 = dv7Var.E;
        FontVariationAxis[] fontVariationAxisArr = {new FontVariationAxis("wght", i2), new FontVariationAxis("opsz", re7Var.f)};
        pa8.l();
        Font fontBuild = hz.i(re7Var.d).setFontVariationSettings(fontVariationAxisArr).setWeight(i3).setSlant(i).build();
        fontBuild.getClass();
        hz.w();
        Typeface.CustomFallbackBuilder systemFallback = pa8.e(pa8.h(fontBuild).build()).setSystemFallback(re7Var.e);
        hz.z();
        Typeface typefaceBuild = systemFallback.setStyle(hz.j(i3, i)).build();
        typefaceBuild.getClass();
        return typefaceBuild;
    }

    @Override // defpackage.bh5
    public void i(UUID uuid, hj6 hj6Var) {
    }

    @Override // defpackage.go0
    public void j(cz5 cz5Var, int i, int[] iArr, fu9 fu9Var, int[] iArr2) {
        if (fu9Var == fu9.E) {
            ko0.b(i, iArr, iArr2, false);
        } else {
            ko0.b(i, iArr, iArr2, true);
        }
    }

    @Override // defpackage.c6d
    public Typeface k(z28 z28Var, dv7 dv7Var, int i) {
        return n(z28Var.J, dv7Var, i);
    }

    @Override // defpackage.k0j
    public void l(double d) {
    }

    @Override // defpackage.fdg
    public boolean q(Object obj, Object obj2) {
        switch (this.E) {
            case 6:
                return false;
            default:
                ygh yghVar = (ygh) obj;
                ygh yghVar2 = (ygh) obj2;
                if (yghVar == null || yghVar2 == null) {
                    if ((yghVar == null) ^ (yghVar2 == null)) {
                        return false;
                    }
                } else if (yghVar.e != yghVar2.e || yghVar.f != yghVar2.f || yghVar.b != yghVar2.b || !x44.r(yghVar.c, yghVar2.c) || !rl4.b(yghVar.d, yghVar2.d)) {
                    return false;
                }
                return true;
        }
    }

    @Override // defpackage.bh5
    public void r(efe efeVar, efk efkVar) {
    }

    @Override // defpackage.ia4
    public Object s(el5 el5Var) {
        return new zp3(0);
    }

    public String toString() {
        switch (this.E) {
            case 6:
                return "NeverEqualPolicy";
            case 13:
                return "Arrangement#SpaceBetween";
            case 28:
                return "SharingStarted.Eagerly";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.jo0
    public void v(cz5 cz5Var, int i, int[] iArr, int[] iArr2) {
        ko0.b(i, iArr, iArr2, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.lp3
    public Object w(Context context, Object obj, String str, cxh cxhVar) {
        switch (this.E) {
            case 14:
                ChartDisplayV0Input chartDisplayV0Input = (ChartDisplayV0Input) obj;
                if (chartDisplayV0Input.getSeries().isEmpty()) {
                    return pyk.z0(new ChartDisplayV0Output("Chart had no series to plot. Provide at least one series with data.", ChartDisplayV0OutputStatus.ERROR));
                }
                if (!pj2.e(chartDisplayV0Input.getStyle(), chartDisplayV0Input.getSeries())) {
                    return pyk.z0(new ChartDisplayV0Output("Chart had no plottable data. Every series was empty; provide non-empty `values` (BAR/LINE) or `points` (LINE/SCATTER).", ChartDisplayV0OutputStatus.ERROR));
                }
                return pyk.E0(new ChartDisplayV0Output((String) null, ChartDisplayV0OutputStatus.SUCCESS, 1, (mq5) (0 == true ? 1 : 0)));
            default:
                return pyk.E0("Event creation template has been created.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0091 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0092 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object y(android.content.Context r6, defpackage.e45 r7, boolean r8, defpackage.vp4 r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof defpackage.i8j
            if (r0 == 0) goto L13
            r0 = r9
            i8j r0 = (defpackage.i8j) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            i8j r0 = new i8j
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r5 = r0.E
            int r9 = r0.G
            iei r1 = defpackage.iei.a
            r2 = 2
            r3 = 0
            r4 = 1
            if (r9 == 0) goto L35
            if (r9 == r4) goto L31
            if (r9 != r2) goto L2b
            defpackage.sf5.h0(r5)
            return r1
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r5)
            return r3
        L31:
            defpackage.sf5.h0(r5)
            return r1
        L35:
            defpackage.sf5.h0(r5)
            m45 r5 = defpackage.m45.E
            if (r8 == 0) goto L84
            r0.G = r4
            ua2 r8 = new ua2
            tp4 r9 = defpackage.zni.I(r0)
            r8.<init>(r4, r9)
            r8.t()
            java.util.concurrent.atomic.AtomicBoolean r9 = new java.util.concurrent.atomic.AtomicBoolean
            r0 = 0
            r9.<init>(r0)
            java.util.concurrent.Executor r7 = defpackage.d4c.C(r7)
            j8j r0 = new j8j
            r0.<init>(r7, r9, r8)
            xzd r7 = new xzd
            r2 = 21
            r7.<init>(r2, r0)
            g8j r7 = r7.r()
            mvd r0 = new mvd
            r2 = 8
            r0.<init>(r9, r2, r8)
            android.net.Uri r9 = defpackage.j7j.a
            java.util.concurrent.Executor r9 = r7.a()
            f60 r2 = new f60
            r3 = 10
            r2.<init>(r7, r0, r6, r3)
            j8j r9 = (defpackage.j8j) r9
            r9.execute(r2)
            java.lang.Object r6 = r8.r()
            if (r6 != r5) goto L92
            goto L91
        L84:
            ft4 r8 = new ft4
            r8.<init>(r6, r3, r4)
            r0.G = r2
            java.lang.Object r6 = defpackage.gb9.c0(r7, r8, r0)
            if (r6 != r5) goto L92
        L91:
            return r5
        L92:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ql8.y(android.content.Context, e45, boolean, vp4):java.lang.Object");
    }

    public /* synthetic */ ql8(int i) {
        this.E = i;
    }
}
