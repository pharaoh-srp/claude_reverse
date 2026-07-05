package defpackage;

import android.app.Activity;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.res.AssetManager;
import android.os.Build;
import android.util.Log;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Toast;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.platform.AndroidComposeView;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.account.BillingType;
import com.anthropic.claude.api.account.RateLimitUpsell;
import com.pvporbit.freetype.FreeTypeConstants;
import java.io.File;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class oq5 {
    public static final o54 A;
    public static final o54 B;
    public static final o54 C;
    public static final o54 D;
    public static final o54 E;
    public static final o54 F;
    public static final o54 G;
    public static final Object H;
    public static Context a;
    public static Boolean b;
    public static final eb0 c = new eb0(0);
    public static final o54 d;
    public static final q0g e;
    public static final o54 f;
    public static final o54 g;
    public static final o54 h;
    public static final o54 i;
    public static final o54 j;
    public static final o54 k;
    public static final o54 l;
    public static final o54 m;
    public static final o54 n;
    public static final o54 o;
    public static final o54 p;
    public static final o54 q;
    public static final o54 r;
    public static final o54 s;
    public static final o54 t;
    public static final o54 u;
    public static final o54 v;
    public static final o54 w;
    public static final o54 x;
    public static final o54 y;
    public static final o54 z;

    static {
        o54 o54Var = o54.P;
        d = o54Var;
        e = q0g.G;
        o54 o54Var2 = o54.L;
        f = o54Var2;
        g = o54Var2;
        h = o54Var2;
        i = o54Var2;
        j = o54Var2;
        k = o54Var2;
        o54 o54Var3 = o54.E;
        l = o54Var3;
        m = o54Var2;
        n = o54Var3;
        o54 o54Var4 = o54.M;
        o = o54Var4;
        p = o54Var3;
        q = o54Var3;
        r = o54Var3;
        s = o54Var2;
        t = o54Var;
        u = o54Var4;
        v = o54Var;
        w = o54Var4;
        x = o54Var4;
        y = o54Var2;
        z = o54Var4;
        A = o54Var4;
        B = o54Var4;
        C = o54Var4;
        D = o54Var4;
        E = o54.N;
        F = o54Var4;
        G = o54Var4;
        H = new Object();
    }

    public oq5(Class cls) {
    }

    public static boolean A() {
        try {
            if (AndroidComposeView.r1 == null) {
                AndroidComposeView.r1 = Class.forName("android.os.SystemProperties");
            }
            if (AndroidComposeView.s1 == null) {
                Class cls = AndroidComposeView.r1;
                AndroidComposeView.s1 = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
            }
            Method method = AndroidComposeView.s1;
            Object objInvoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
            return x44.r(objInvoke instanceof Boolean ? (Boolean) objInvoke : null, Boolean.TRUE);
        } catch (Exception unused) {
            return false;
        }
    }

    public static final String B(pl9 pl9Var) {
        pl9Var.getClass();
        String strD = pl9Var.d();
        if (strD != null) {
            return strD;
        }
        xh6.l(pl9Var, " as the default key", "Unable to use name of ");
        return null;
    }

    public static final emg C(kdg kdgVar) {
        emg emgVar = kdgVar.E;
        emgVar.getClass();
        return (emg) ycg.t(emgVar, kdgVar);
    }

    public static final boolean D(zxc zxcVar) {
        zxcVar.getClass();
        if (zxcVar.equals(yxc.a)) {
            return false;
        }
        if (zxcVar instanceof xxc) {
            return ((xxc) zxcVar).a;
        }
        mr9.b();
        return false;
    }

    public static final int E(kdg kdgVar) {
        emg emgVar = kdgVar.E;
        emgVar.getClass();
        return ((emg) ycg.h(emgVar)).e;
    }

    public static final l9e F(dpf dpfVar) {
        return d4c.x(fcc.i(((fcc) ((lsc) dpfVar.G).getValue()).a, ((fcc) ((lsc) dpfVar.H).getValue()).a), ((k8g) ((lsc) dpfVar.F).getValue()).a);
    }

    public static final File G(Context context) {
        context.getClass();
        File cacheDir = context.getCacheDir();
        cacheDir.getClass();
        File file = new File(cacheDir, "tmp");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static boolean H(Context context, int i2) {
        if (!U(i2, context, "com.google.android.gms")) {
            return false;
        }
        try {
            return u98.a(context).b(context.getPackageManager().getPackageInfo("com.google.android.gms", 64));
        } catch (PackageManager.NameNotFoundException unused) {
            Log.isLoggable("UidVerifier", 3);
            return false;
        }
    }

    public static final boolean I(zxc zxcVar) {
        zxcVar.getClass();
        return zxcVar.equals(yxc.a);
    }

    public static synchronized boolean J(Context context) {
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = a;
        if (context2 != null && (bool = b) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        b = null;
        Boolean boolValueOf = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        b = boolValueOf;
        a = applicationContext;
        return boolValueOf.booleanValue();
    }

    public static void K(Context context, wxc wxcVar) {
        context.getClass();
        wxcVar.getClass();
        zxc zxcVarE = wxcVar.e();
        xxc xxcVar = zxcVarE instanceof xxc ? (xxc) zxcVarE : null;
        if (xxcVar == null || !xxcVar.a) {
            wxcVar.f();
            return;
        }
        Toast.makeText(context, context.getString(R.string.notification_permission_toast_message), 1).show();
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    public static final boolean L(kdg kdgVar, bz7 bz7Var) {
        int i2;
        l3 l3Var;
        Object objInvoke;
        rcg rcgVarJ;
        boolean zP;
        do {
            synchronized (H) {
                emg emgVar = kdgVar.E;
                emgVar.getClass();
                emg emgVar2 = (emg) ycg.h(emgVar);
                i2 = emgVar2.d;
                l3Var = emgVar2.c;
            }
            l3Var.getClass();
            pzc pzcVarH = l3Var.h();
            objInvoke = bz7Var.invoke(pzcVarH);
            l3 l3VarA = pzcVarH.a();
            if (x44.r(l3VarA, l3Var)) {
                break;
            }
            emg emgVar3 = kdgVar.E;
            emgVar3.getClass();
            synchronized (ycg.c) {
                rcgVarJ = ycg.j();
                zP = p((emg) ycg.w(emgVar3, kdgVar, rcgVarJ), i2, l3VarA, true);
            }
            ycg.n(rcgVarJ, kdgVar);
        } while (!zP);
        return ((Boolean) objInvoke).booleanValue();
    }

    public static final List M(String str) {
        if (str == null || str.length() == 0) {
            return lm6.E;
        }
        List listY0 = bsg.Y0(str, new String[]{","}, 6);
        ArrayList arrayList = new ArrayList(x44.y(listY0, 10));
        Iterator it = listY0.iterator();
        while (it.hasNext()) {
            arrayList.add(bsg.k1((String) it.next()).toString());
        }
        return arrayList;
    }

    public static final r1e N(RateLimitUpsell rateLimitUpsell, boolean z2, boolean z3, boolean z4, boolean z5) {
        if (!z5) {
            rateLimitUpsell = null;
        }
        int i2 = rateLimitUpsell == null ? -1 : s1e.a[rateLimitUpsell.ordinal()];
        r1e r1eVar = r1e.I;
        r1e r1eVar2 = r1e.E;
        if (i2 != -1) {
            if (i2 == 1) {
                return z2 ? r1eVar2 : r1eVar;
            }
            if (i2 == 2) {
                return z3 ? r1e.F : r1e.G;
            }
            if (i2 == 3) {
                return r1e.H;
            }
            if (i2 != 4) {
                mr9.b();
                return null;
            }
        }
        return (z4 && z2) ? r1eVar2 : r1eVar;
    }

    public static wxc O(ld4 ld4Var) {
        e18 e18Var = (e18) ld4Var;
        Context context = (Context) e18Var.j(w00.b);
        int i2 = Build.VERSION.SDK_INT;
        lz1 lz1Var = jd4.a;
        if (i2 >= 33) {
            e18Var.a0(-692128702);
            Object objN = e18Var.N();
            if (objN == lz1Var) {
                objN = new xg5(22);
                e18Var.k0(objN);
            }
            wxc wxcVarW0 = wd6.w0("android.permission.POST_NOTIFICATIONS", (bz7) objN, e18Var, 54, 0);
            e18Var.p(false);
            return wxcVarW0;
        }
        e18Var.a0(-691955877);
        boolean zF = e18Var.f(context);
        Object objN2 = e18Var.N();
        if (zF || objN2 == lz1Var) {
            objN2 = new q8c(context);
            e18Var.k0(objN2);
        }
        q8c q8cVar = (q8c) objN2;
        e18Var.p(false);
        return q8cVar;
    }

    public static final void P(i6 i6Var, wjf wjfVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = i6Var.a;
        Object objG = wjfVar.k().E.g(akf.f);
        if (objG == null) {
            objG = null;
        }
        o44 o44Var = (o44) objG;
        if (o44Var != null) {
            accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) g6.d(o44Var.a, o44Var.b).E);
            return;
        }
        ArrayList arrayList = new ArrayList();
        Object objG2 = wjfVar.k().E.g(akf.e);
        if ((objG2 != null ? objG2 : null) != null) {
            List listJ = wjf.j(4, wjfVar);
            int size = listJ.size();
            for (int i2 = 0; i2 < size; i2++) {
                wjf wjfVar2 = (wjf) listJ.get(i2);
                if (wjfVar2.k().E.c(akf.K)) {
                    arrayList.add(wjfVar2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        boolean zR = r(arrayList);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) g6.d(zR ? 1 : arrayList.size(), zR ? arrayList.size() : 1).E);
    }

    public static final void Q(i6 i6Var, wjf wjfVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = i6Var.a;
        Object objG = wjfVar.k().E.g(akf.g);
        if (objG == null) {
            objG = null;
        }
        p44 p44Var = (p44) objG;
        if (p44Var != null) {
            int iB = p44Var.b();
            int iA = p44Var.a();
            Object objG2 = wjfVar.k().E.g(akf.K);
            if (objG2 == null) {
                objG2 = Boolean.FALSE;
            }
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) h6.c(((Boolean) objG2).booleanValue(), iB, 1, iA, 1).a);
        }
        wjf wjfVarL = wjfVar.l();
        if (wjfVarL == null) {
            return;
        }
        Object objG3 = wjfVarL.k().E.g(akf.e);
        if (objG3 == null) {
            objG3 = null;
        }
        if (objG3 != null) {
            Object objG4 = wjfVarL.k().E.g(akf.f);
            o44 o44Var = (o44) (objG4 != null ? objG4 : null);
            if (o44Var == null || (o44Var.a >= 0 && o44Var.b >= 0)) {
                if (wjfVar.k().E.c(akf.K)) {
                    ArrayList arrayList = new ArrayList();
                    List listJ = wjf.j(4, wjfVarL);
                    int size = listJ.size();
                    int i2 = 0;
                    for (int i3 = 0; i3 < size; i3++) {
                        wjf wjfVar2 = (wjf) listJ.get(i3);
                        if (wjfVar2.k().E.c(akf.K)) {
                            arrayList.add(wjfVar2);
                            if (wjfVar2.c.H() < wjfVar.c.H()) {
                                i2++;
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    boolean zR = r(arrayList);
                    int i4 = zR ? 0 : i2;
                    int i5 = zR ? i2 : 0;
                    Object objG5 = wjfVar.k().E.g(akf.K);
                    if (objG5 == null) {
                        objG5 = Boolean.FALSE;
                    }
                    accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) h6.c(((Boolean) objG5).booleanValue(), i4, 1, i5, 1).a);
                }
            }
        }
    }

    public static final iqb R(iqb iqbVar, k3g k3gVar, ia0 ia0Var, ld4 ld4Var) {
        e18 e18Var = (e18) ld4Var;
        e18Var.a0(757300211);
        if (k3gVar == null) {
            e18Var.p(false);
            return iqbVar;
        }
        iqb iqbVarC = k3g.c(k3gVar, iqbVar, k3g.b("login-claude-logo", e18Var), ia0Var, 120);
        e18Var.p(false);
        return iqbVarC;
    }

    public static final iwg S(String str) {
        return x44.r(str, BillingType.GOOGLE_PLAY_SUBSCRIPTION.getValue()) ? iwg.F : x44.r(str, BillingType.APPLE_SUBSCRIPTION.getValue()) ? iwg.G : iwg.E;
    }

    public static final String T(byte b2) {
        return b2 == 1 ? "quotation mark '\"'" : b2 == 2 ? "string escape sequence '\\'" : b2 == 4 ? "comma ','" : b2 == 5 ? "colon ':'" : b2 == 6 ? "start of the object '{'" : b2 == 7 ? "end of the object '}'" : b2 == 8 ? "start of the array '['" : b2 == 9 ? "end of the array ']'" : b2 == 10 ? "end of the input" : b2 == 127 ? "invalid token" : "valid token";
    }

    public static boolean U(int i2, Context context, String str) {
        gmf gmfVarA = nij.a(context);
        gmfVarA.getClass();
        try {
            AppOpsManager appOpsManager = (AppOpsManager) ((Context) gmfVarA.F).getSystemService("appops");
            if (appOpsManager == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(i2, str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006a, code lost:
    
        if (r8 == r5) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object V(defpackage.cve r6, defpackage.pz7 r7, defpackage.vp4 r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof defpackage.dve
            if (r0 == 0) goto L13
            r0 = r8
            dve r0 = (defpackage.dve) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            dve r0 = new dve
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.G
            int r1 = r0.H
            r2 = 0
            r3 = 2
            r4 = 1
            m45 r5 = defpackage.m45.E
            if (r1 == 0) goto L3e
            if (r1 == r4) goto L33
            if (r1 != r3) goto L2d
            cve r6 = r0.E
            defpackage.sf5.h0(r8)
            goto L6d
        L2d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r6)
            return r2
        L33:
            xzg r6 = r0.F
            r7 = r6
            pz7 r7 = (defpackage.pz7) r7
            cve r6 = r0.E
            defpackage.sf5.h0(r8)
            goto L52
        L3e:
            defpackage.sf5.h0(r8)
            r0.E = r6
            r8 = r7
            xzg r8 = (defpackage.xzg) r8
            r0.F = r8
            r0.H = r4
            r8 = 0
            c45 r8 = defpackage.u00.v(r6, r8, r0)
            if (r8 != r5) goto L52
            goto L6c
        L52:
            c45 r8 = (defpackage.c45) r8
            cb2 r1 = defpackage.cb2.G
            c45 r8 = r8.r0(r1)
            rrb r1 = new rrb
            r4 = 4
            r1.<init>(r6, r7, r2, r4)
            r0.E = r6
            r0.F = r2
            r0.H = r3
            java.lang.Object r8 = defpackage.gb9.c0(r8, r1, r0)
            if (r8 != r5) goto L6d
        L6c:
            return r5
        L6d:
            vb9 r6 = r6.g()
            o7i r7 = r6.b
            q59 r0 = r6.e
            q59 r6 = r6.f
            r7.e(r0, r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oq5.V(cve, pz7, vp4):java.lang.Object");
    }

    public static final Object W(bz7 bz7Var, vp4 vp4Var) {
        if (vp4Var.getContext().x0(unb.I) == null) {
            return j8.O(vp4Var.getContext()).b0(vp4Var, bz7Var);
        }
        mr9.o();
        return null;
    }

    public static final Object X(tp4 tp4Var, bz7 bz7Var, cve cveVar) {
        knf knfVar;
        jq4 jq4Var = new jq4(2, null, bz7Var);
        w4i w4iVar = (w4i) tp4Var.getContext().x0(w4i.F);
        e45 e45Var = w4iVar != null ? w4iVar.E : null;
        if (e45Var != null) {
            return gb9.c0(e45Var, jq4Var, tp4Var);
        }
        int i2 = 1;
        ua2 ua2Var = new ua2(1, zni.I(tp4Var));
        ua2Var.t();
        try {
            knfVar = cveVar.d;
        } catch (RejectedExecutionException e2) {
            ua2Var.q(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e2));
        }
        if (knfVar != null) {
            knfVar.execute(new ije(ua2Var, cveVar, jq4Var, i2));
            return ua2Var.r();
        }
        x44.o0("internalTransactionExecutor");
        throw null;
    }

    public static String a(long j2) {
        String str = String.format("%016x", Long.valueOf(j2));
        return "44617461-646f-6721-" + str.substring(0, 4) + "-" + str.substring(4);
    }

    public static String b(String str) {
        try {
            if (!str.contains("-")) {
                return str.length() == 32 ? str.substring(16) : str;
            }
            String[] strArrSplit = str.split("-");
            if (strArrSplit.length != 5) {
                throw new NumberFormatException("Invalid UUID format: ".concat(str));
            }
            return strArrSplit[3] + strArrSplit[4];
        } catch (Exception e2) {
            throw new IllegalArgumentException("Exception when converting UUID to BigInteger: ".concat(str), e2);
        }
    }

    public static final void c(k3g k3gVar, boolean z2, ld4 ld4Var, int i2) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1503239546);
        int i3 = (e18Var.f(k3gVar) ? 4 : 2) | i2 | (e18Var.g(z2) ? 32 : 16);
        int i4 = 0;
        if (e18Var.Q(i3 & 1, (i3 & 19) != 18)) {
            wd6.M(!z2, null, gp6.e(kxk.N(700, 0, null, 6), 2), gp6.f(kxk.N(700, 0, null, 6), 2), null, fd9.q0(-936922274, new cb0(i4, k3gVar), e18Var), e18Var, 200064, 18);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new db0(i2, i4, k3gVar, z2);
        }
    }

    public static final c10 d(String str) {
        return new c10(sf5.f0(str));
    }

    public static final dz e(ou7 ou7Var, dv7 dv7Var, bv7 bv7Var, ld4 ld4Var, int i2, int i3) {
        ou7Var.getClass();
        boolean z2 = true;
        int i4 = (i3 & 4) != 0 ? 0 : 1;
        e18 e18Var = (e18) ld4Var;
        ((yne) e18Var.j(aoe.b)).getClass();
        xne xneVarA = yne.a(e18Var);
        boolean zF = e18Var.f(xneVarA);
        if ((((i2 & 14) ^ 6) <= 4 || !e18Var.f(ou7Var)) && (i2 & 6) != 4) {
            z2 = false;
        }
        boolean z3 = zF | z2;
        Object objN = e18Var.N();
        if (z3 || objN == jd4.a) {
            objN = aoe.a(ou7Var, xneVarA).b;
            e18Var.k0(objN);
        }
        AssetManager assets = ((Context) e18Var.j(w00.b)).getAssets();
        assets.getClass();
        return new dz(assets, (String) objN, dv7Var, i4, bv7Var);
    }

    public static final void f(ta4 ta4Var, ld4 ld4Var, int i2) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-709502251);
        if (e18Var.Q(i2 & 1, (i2 & 3) != 2)) {
            umg umgVar = e5f.a;
            c5f c5fVar = (c5f) e18Var.j(umgVar);
            a5f a5fVarY0 = wd6.y0(e18Var);
            Object[] objArr = {c5fVar};
            y5f y5fVar = new y5f(new vk3(c5fVar, 11, a5fVarY0), new gg7(21));
            boolean zH = e18Var.h(c5fVar) | e18Var.h(a5fVarY0);
            Object objN = e18Var.N();
            if (zH || objN == jd4.a) {
                objN = new vc8(c5fVar, 8, a5fVarY0);
                e18Var.k0(objN);
            }
            f1a f1aVar = (f1a) iuj.K(objArr, y5fVar, (zy7) objN, e18Var, 0);
            j8.c(umgVar.a(f1aVar), fd9.q0(-412824043, new ow1(ta4Var, f1aVar, 28), e18Var), e18Var, 56);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new tu2(ta4Var, i2, 4);
        }
    }

    public static final void g(wvb wvbVar, y3a y3aVar, ld4 ld4Var, int i2) {
        wvbVar.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1770945943);
        int i3 = 4;
        int i4 = (e18Var.f(wvbVar) ? 4 : 2) | i2 | 48;
        if ((i4 & 19) == 18 && e18Var.C()) {
            e18Var.T();
        } else {
            y3aVar = y3a.ON_RESUME;
            e18Var.a0(-2101357749);
            int i5 = 1;
            boolean z2 = (i4 & 14) == 4;
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (z2 || objN == lz1Var) {
                objN = new s94(y3aVar, i5, wvbVar);
                e18Var.k0(objN);
            }
            i4a i4aVar = (i4a) objN;
            e18Var.p(false);
            c4a c4aVarA = ((m4a) e18Var.j(tda.a)).a();
            e18Var.a0(-2101338711);
            boolean zH = e18Var.h(c4aVarA) | e18Var.h(i4aVar);
            Object objN2 = e18Var.N();
            if (zH || objN2 == lz1Var) {
                objN2 = new vk3(c4aVarA, 22, i4aVar);
                e18Var.k0(objN2);
            }
            e18Var.p(false);
            fd9.e(c4aVarA, i4aVar, (bz7) objN2, e18Var);
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new fga(wvbVar, y3aVar, i2, i3);
        }
    }

    public static final void h(List list, y3a y3aVar, ld4 ld4Var, int i2) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1533427666);
        int i3 = 19;
        if ((((e18Var.h(list) ? 4 : 2) | i2 | 48) & 19) == 18 && e18Var.C()) {
            e18Var.T();
        } else {
            y3aVar = y3a.ON_RESUME;
            e18Var.a0(-67706430);
            boolean zF = e18Var.f(list);
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (zF || objN == lz1Var) {
                objN = new pm3(y3aVar, 3, list);
                e18Var.k0(objN);
            }
            i4a i4aVar = (i4a) objN;
            e18Var.p(false);
            c4a c4aVarA = ((m4a) e18Var.j(tda.a)).a();
            e18Var.a0(-67685064);
            boolean zH = e18Var.h(c4aVarA) | e18Var.h(i4aVar);
            Object objN2 = e18Var.N();
            if (zH || objN2 == lz1Var) {
                objN2 = new b4b(c4aVarA, 15, i4aVar);
                e18Var.k0(objN2);
            }
            e18Var.p(false);
            fd9.e(c4aVarA, i4aVar, (bz7) objN2, e18Var);
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new lpa(list, y3aVar, i2, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0207 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0232 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:189:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(defpackage.iqb r25, defpackage.pz7 r26, defpackage.pz7 r27, defpackage.pz7 r28, defpackage.pz7 r29, int r30, long r31, long r33, defpackage.wbj r35, final defpackage.ta4 r36, defpackage.ld4 r37, final int r38, final int r39) {
        /*
            Method dump skipped, instruction units count: 698
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oq5.i(iqb, pz7, pz7, pz7, pz7, int, long, long, wbj, ta4, ld4, int, int):void");
    }

    public static final void j(int i2, pz7 pz7Var, ta4 ta4Var, pz7 pz7Var2, pz7 pz7Var3, wbj wbjVar, pz7 pz7Var4, ld4 ld4Var, int i3) {
        int i4;
        int i5;
        int i6;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-280287501);
        int i7 = 4;
        int i8 = i3 | (e18Var.d(i2) ? 4 : 2) | (e18Var.h(pz7Var) ? 32 : 16) | (e18Var.h(ta4Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.h(pz7Var2) ? 2048 : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var.h(pz7Var3) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) | (e18Var.f(wbjVar) ? 131072 : 65536) | (e18Var.h(pz7Var4) ? FreeTypeConstants.FT_LOAD_COLOR : 524288);
        if (e18Var.Q(i8 & 1, (599187 & i8) != 599186)) {
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = new h6f();
                e18Var.k0(objN);
            }
            h6f h6fVar = (h6f) objN;
            boolean z2 = (i8 & 112) == 32;
            Object objN2 = e18Var.N();
            if (z2 || objN2 == lz1Var) {
                objN2 = new ta4(605195056, true, new vu2(i7, pz7Var));
                e18Var.k0(objN2);
            }
            pz7 pz7Var5 = (pz7) objN2;
            boolean z3 = (i8 & 7168) == 2048;
            Object objN3 = e18Var.N();
            if (z3 || objN3 == lz1Var) {
                objN3 = new ta4(418899191, true, new vu2(5, pz7Var2));
                e18Var.k0(objN3);
            }
            pz7 pz7Var6 = (pz7) objN3;
            boolean z4 = (57344 & i8) == 16384;
            Object objN4 = e18Var.N();
            if (z4 || objN4 == lz1Var) {
                objN4 = new ta4(338600263, true, new vu2(6, pz7Var3));
                e18Var.k0(objN4);
            }
            pz7 pz7Var7 = (pz7) objN4;
            boolean z5 = (i8 & 896) == 256;
            Object objN5 = e18Var.N();
            if (z5 || objN5 == lz1Var) {
                i4 = i8;
                objN5 = new ta4(-1776388365, true, new fga(ta4Var, 9, h6fVar));
                e18Var.k0(objN5);
            } else {
                i4 = i8;
            }
            pz7 pz7Var8 = (pz7) objN5;
            boolean z6 = (i4 & 3670016) == 1048576;
            Object objN6 = e18Var.N();
            if (z6 || objN6 == lz1Var) {
                objN6 = new ta4(-1731662488, true, new vu2(7, pz7Var4));
                e18Var.k0(objN6);
            }
            pz7 pz7Var9 = (pz7) objN6;
            boolean zF = ((i4 & 458752) == 131072) | e18Var.f(pz7Var5) | e18Var.f(pz7Var6) | e18Var.f(pz7Var7) | ((i4 & 14) == 4) | e18Var.f(pz7Var9) | e18Var.f(pz7Var8);
            Object objN7 = e18Var.N();
            if (zF || objN7 == lz1Var) {
                i5 = 0;
                i6 = 1;
                n8a n8aVar = new n8a(wbjVar, pz7Var5, pz7Var6, pz7Var7, i2, pz7Var9, h6fVar, pz7Var8);
                e18Var.k0(n8aVar);
                objN7 = n8aVar;
            } else {
                i5 = 0;
                i6 = 1;
            }
            bvg.a(i5, i6, e18Var, (pz7) objN7, null);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new wga(i2, pz7Var, ta4Var, pz7Var2, pz7Var3, wbjVar, pz7Var4, i3);
        }
    }

    public static final void k(k3g k3gVar, ia0 ia0Var, iqb iqbVar, ld4 ld4Var, int i2) {
        int i3;
        iqb iqbVar2;
        ia0Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1552113683);
        if ((i2 & 6) == 0) {
            i3 = (e18Var.f(k3gVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? e18Var.f(ia0Var) : e18Var.h(ia0Var) ? 32 : 16;
        }
        int i4 = i3 | 384;
        if (e18Var.Q(i4 & 1, (i4 & 147) != 146)) {
            FillElement fillElement = b.c;
            o5b o5bVarD = dw1.d(lja.K, false);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, fillElement);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, cd4.f, o5bVarD);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            fqb fqbVar = fqb.E;
            v40.c(R(b.t(sf5.M(fqbVar, -5.0f, -1.0f), 192.0f), k3gVar, ia0Var, e18Var), Float.NaN, e18Var, 48, 0);
            e18Var.p(true);
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new fb0(k3gVar, i2, ia0Var, iqbVar2, 0);
        }
    }

    public static final l9e l(b3d b3dVar, int i2, f5i f5iVar, yjh yjhVar, boolean z2, int i3) {
        l9e l9eVarC = yjhVar != null ? yjhVar.c(f5iVar.b.D(i2)) : l9e.e;
        float f2 = l9eVarC.a;
        int iM0 = b3dVar.M0(2.0f);
        return l9e.b(l9eVarC, z2 ? (i3 - f2) - iM0 : f2, z2 ? i3 - f2 : iM0 + f2, MTTypesetterKt.kLineSkipLimitMultiplier, 10);
    }

    public static final l9e m(g2g g2gVar, s1g s1gVar) {
        if (s1gVar == null) {
            return null;
        }
        List listB = g2gVar.b();
        int size = listB.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (x44.r(((h2g) listB.get(i2)).P, s1gVar)) {
                if (s1gVar.R) {
                    return !s1gVar.T ? s1gVar.S : d4c.x(s1gVar.p1().L(yfd.V(s1gVar), 0L, (6 & 4) != 0), csg.T(yfd.V(s1gVar).G));
                }
                return null;
            }
        }
        return null;
    }

    public static final void n(dpf dpfVar, long j2, long j3, long j4, boolean z2) {
        lsc lscVar = (lsc) dpfVar.G;
        lsc lscVar2 = (lsc) dpfVar.I;
        lsc lscVar3 = (lsc) dpfVar.F;
        lsc lscVar4 = (lsc) dpfVar.H;
        if (!fcc.c(((fcc) lscVar4.getValue()).a, j4) || !k8g.b(((k8g) lscVar3.getValue()).a, j2) || z2) {
            lscVar3.setValue(new k8g(j2));
            lscVar4.setValue(new fcc(j4));
            if (z2) {
                grc.x(fcc.h(fcc.h(j3, j4), fcc.h(((fcc) lscVar2.getValue()).a, ((fcc) lscVar.getValue()).a)), lscVar);
            }
        }
        grc.x(fcc.h(j3, j4), lscVar2);
    }

    public static final void o(int i2, int i3) {
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException("index (" + i2 + ") is out of bound of [0, " + i3 + ')');
        }
    }

    public static final boolean p(emg emgVar, int i2, l3 l3Var, boolean z2) {
        boolean z3;
        synchronized (H) {
            try {
                int i3 = emgVar.d;
                if (i3 == i2) {
                    emgVar.c = l3Var;
                    z3 = true;
                    if (z2) {
                        emgVar.e++;
                    }
                    emgVar.d = i3 + 1;
                } else {
                    z3 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z3;
    }

    public static final Object q(nw5 nw5Var, zy7 zy7Var, vp4 vp4Var) {
        int i2;
        Object obj;
        m5c m5cVarV;
        Object objA0;
        g5c g5cVar;
        if (nw5Var.x0().R) {
            if (!nw5Var.x0().R) {
                b39.c("visitAncestors called on an unattached node");
            }
            hqb hqbVar = nw5Var.x0().I;
            av9 av9VarW = yfd.W(nw5Var);
            loop0: while (true) {
                i2 = 0;
                obj = null;
                if (av9VarW == null) {
                    break;
                }
                if ((((hqb) av9VarW.k0.K).H & 524288) != 0) {
                    while (hqbVar != null) {
                        if ((hqbVar.G & 524288) != 0) {
                            hqb hqbVarJ = hqbVar;
                            wwb wwbVar = null;
                            while (hqbVarJ != null) {
                                if (hqbVarJ instanceof lx1) {
                                    obj = hqbVarJ;
                                    break loop0;
                                }
                                if ((hqbVarJ.G & 524288) != 0 && (hqbVarJ instanceof qw5)) {
                                    int i3 = 0;
                                    for (hqb hqbVar2 = ((qw5) hqbVarJ).T; hqbVar2 != null; hqbVar2 = hqbVar2.J) {
                                        if ((hqbVar2.G & 524288) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                hqbVarJ = hqbVar2;
                                            } else {
                                                if (wwbVar == null) {
                                                    wwbVar = new wwb(0, new hqb[16]);
                                                }
                                                if (hqbVarJ != null) {
                                                    wwbVar.b(hqbVarJ);
                                                    hqbVarJ = null;
                                                }
                                                wwbVar.b(hqbVar2);
                                            }
                                        }
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                hqbVarJ = yfd.j(wwbVar);
                            }
                        }
                        hqbVar = hqbVar.I;
                    }
                }
                av9VarW = av9VarW.G();
                hqbVar = (av9VarW == null || (g5cVar = av9VarW.k0) == null) ? null : (j4h) g5cVar.J;
            }
            lx1 lx1Var = (lx1) obj;
            if (lx1Var != null && (objA0 = lx1Var.a0((m5cVarV = yfd.V(nw5Var)), new mx1(zy7Var, i2, m5cVarV), vp4Var)) == m45.E) {
                return objA0;
            }
        }
        return iei.a;
    }

    public static final boolean r(ArrayList arrayList) {
        List list;
        long j2;
        if (arrayList.size() >= 2) {
            if (arrayList.size() <= 1) {
                list = lm6.E;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Object obj = arrayList.get(0);
                int size = arrayList.size() - 1;
                int i2 = 0;
                while (i2 < size) {
                    i2++;
                    Object obj2 = arrayList.get(i2);
                    wjf wjfVar = (wjf) obj2;
                    wjf wjfVar2 = (wjf) obj;
                    arrayList2.add(new fcc((((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (wjfVar2.g().f() >> 32)) - Float.intBitsToFloat((int) (wjfVar.g().f() >> 32))))) << 32) | (((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (wjfVar2.g().f() & 4294967295L)) - Float.intBitsToFloat((int) (wjfVar.g().f() & 4294967295L))))) & 4294967295L)));
                    obj = obj2;
                }
                list = arrayList2;
            }
            if (list.size() == 1) {
                j2 = ((fcc) w44.L0(list)).a;
            } else {
                if (list.isEmpty()) {
                    qaa.c("Empty collection can't be reduced.");
                }
                Object objL0 = w44.L0(list);
                int size2 = list.size() - 1;
                if (1 <= size2) {
                    int i3 = 1;
                    while (true) {
                        objL0 = new fcc(fcc.i(((fcc) objL0).a, ((fcc) list.get(i3)).a));
                        if (i3 == size2) {
                            break;
                        }
                        i3++;
                    }
                }
                j2 = ((fcc) objL0).a;
            }
            if (Float.intBitsToFloat((int) (4294967295L & j2)) >= Float.intBitsToFloat((int) (j2 >> 32))) {
                return false;
            }
        }
        return true;
    }

    public static final void s(d6e d6eVar, Throwable th) {
        CancellationException cancellationExceptionB = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationExceptionB == null) {
            cancellationExceptionB = gjk.b("Channel was consumed, consumer had failed", th);
        }
        d6eVar.d(cancellationExceptionB);
    }

    public static final byte t(char c2) {
        if (c2 < '~') {
            return ji2.b[c2];
        }
        return (byte) 0;
    }

    public static final Object u(tp4 tp4Var, bz7 bz7Var, cve cveVar) {
        if ((!cveVar.k() || !cveVar.n() || !cveVar.l()) && tp4Var.getContext().x0(cb2.G) != null) {
            return X(tp4Var, bz7Var, cveVar);
        }
        return bz7Var.invoke(tp4Var);
    }

    public static ju7 v(Context context) {
        ProviderInfo providerInfo;
        hu7 hu7Var;
        ApplicationInfo applicationInfo;
        int i2 = 2;
        zl4 cr5Var = Build.VERSION.SDK_INT >= 28 ? new cr5(i2) : new zl4(i2);
        PackageManager packageManager = context.getPackageManager();
        knk.q("Package manager required to locate emoji font provider", packageManager);
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            hu7Var = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArrM = cr5Var.m(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrM) {
                    arrayList.add(signature.toByteArray());
                }
                hu7Var = new hu7(str, str2, Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e2) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e2);
                hu7Var = null;
            }
        }
        if (hu7Var == null) {
            return null;
        }
        return new ju7(context, hu7Var);
    }

    public static final lq6 w(String str, Enum[] enumArr, String[] strArr, Annotation[][] annotationArr) {
        enumArr.getClass();
        eq6 eq6Var = new eq6(str, enumArr.length);
        int length = enumArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            Enum r5 = enumArr[i2];
            int i4 = i3 + 1;
            String strName = (String) mp0.I0(i3, strArr);
            if (strName == null) {
                strName = r5.name();
            }
            eq6Var.j(strName, false);
            Annotation[] annotationArr2 = (Annotation[]) mp0.I0(i3, annotationArr);
            if (annotationArr2 != null) {
                for (Annotation annotation : annotationArr2) {
                    annotation.getClass();
                    int i5 = eq6Var.d;
                    List[] listArr = eq6Var.f;
                    List arrayList = listArr[i5];
                    if (arrayList == null) {
                        arrayList = new ArrayList(1);
                        listArr[eq6Var.d] = arrayList;
                    }
                    arrayList.add(annotation);
                }
            }
            i2++;
            i3 = i4;
        }
        lq6 lq6Var = new lq6(str, enumArr);
        lq6Var.c = eq6Var;
        return lq6Var;
    }

    public static final Activity x(Context context) {
        context.getClass();
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        sz6.j("Permissions should be called in the context of an Activity");
        return null;
    }

    public static qh9 y(HashMap map) {
        qh9 qh9Var = new qh9();
        for (Map.Entry entry : map.entrySet()) {
            qh9Var.r((String) entry.getKey(), (String) entry.getValue());
        }
        return qh9Var;
    }

    public static final String[] z(ro4 ro4Var) {
        ro4Var.getClass();
        return (String[]) ((c10) ro4Var).b.toArray(new String[0]);
    }
}
