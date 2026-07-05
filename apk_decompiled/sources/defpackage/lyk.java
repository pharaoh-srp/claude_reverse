package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import androidx.health.platform.client.proto.g;
import com.anthropic.claude.R;
import com.anthropic.claude.design.icon.a;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class lyk implements vv1, br4, fri, v0i, ia4, ut9, lv1, j5i, go0, i94 {
    public static lyk F;
    public static i49 P;
    public final /* synthetic */ int E;
    public static final lyk G = new lyk(1);
    public static final lyk H = new lyk(2);
    public static final lyk I = new lyk(3);
    public static final lyk J = new lyk(4);
    public static final lyk K = new lyk(5);
    public static final lyk L = new lyk(6);
    public static final lyk M = new lyk(7);
    public static final lyk N = new lyk(8);
    public static final lyk O = new lyk(9);
    public static final lyk Q = new lyk(10);
    public static final /* synthetic */ lyk R = new lyk(11);
    public static final lyk S = new lyk(12);
    public static final lyk T = new lyk(13);
    public static final lyk U = new lyk(14);
    public static final lyk V = new lyk(15);
    public static final lyk W = new lyk(17);
    public static final lyk X = new lyk(18);
    public static final lyk Y = new lyk(20);
    public static final /* synthetic */ lyk Z = new lyk(21);

    public lyk(evd evdVar) {
        this.E = 29;
    }

    public static String[] k(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add("<init>(" + str + ")V");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static String l(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        StringBuilder sb = new StringBuilder("/api/organizations/");
        sb.append(str);
        return vb7.t(sb, "/conversations/", str2, "/wiggle/download-file?path=", str3);
    }

    public static LinkedHashSet p(String str, String... strArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str2 : strArr) {
            linkedHashSet.add(str + '.' + str2);
        }
        return linkedHashSet;
    }

    public static LinkedHashSet q(String str, String... strArr) {
        return p("java/lang/".concat(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static LinkedHashSet r(String str, String... strArr) {
        return p("java/util/".concat(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static neg u(c92 c92Var) {
        while (c92Var instanceof e92) {
            e92 e92Var = (e92) c92Var;
            if (e92Var.getKind() != 2) {
                break;
            }
            Collection collectionI = e92Var.i();
            collectionI.getClass();
            c92Var = (e92) w44.f1(collectionI);
            if (c92Var == null) {
                return null;
            }
        }
        return c92Var.d();
    }

    public static synchronized void v() {
        if (F == null) {
            F = new lyk(0);
        }
    }

    @Override // defpackage.v0i
    public String H(Context context, boolean z, boolean z2) {
        int i = this.E;
        context.getClass();
        switch (i) {
            case 5:
                String string = context.getString(z2 ? R.string.create_file_tool_status_failed : z ? R.string.create_file_tool_status_created : R.string.create_file_tool_status_creating);
                string.getClass();
                return string;
            default:
                String string2 = context.getString(z2 ? R.string.timer_creator_tool_status_creation_failed : z ? R.string.timer_creator_tool_status_creation_success : R.string.timer_creator_tool_status_creating);
                string2.getClass();
                return string2;
        }
    }

    public void a(int i, ld4 ld4Var, zy7 zy7Var, boolean z) {
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(222079433);
        int i2 = i | (e18Var.g(z) ? 4 : 2) | (e18Var.h(zy7Var) ? 32 : 16);
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            uuj.a(d4c.j0(z ? R.string.project_unarchive : R.string.project_archive, e18Var), a.a(ud0.h, e18Var), zy7Var, null, null, false, null, null, null, null, 0, 0, e18Var, 64 | ((i2 << 3) & 896), 4088);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new knd(this, z, zy7Var, i, 1);
        }
    }

    @Override // defpackage.j5i
    public Object apply(Object obj) {
        return (byte[]) obj;
    }

    public void b(zy7 zy7Var, ld4 ld4Var, int i) {
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1067707840);
        int i2 = (e18Var.h(zy7Var) ? 4 : 2) | i;
        if (e18Var.Q(i2 & 1, (i2 & 3) != 2)) {
            String strJ0 = d4c.j0(R.string.project_delete, e18Var);
            bpc bpcVarA = a.a(ud0.C1, e18Var);
            float f = wcb.a;
            uuj.a(strJ0, bpcVarA, zy7Var, null, null, false, null, nrk.e(e18Var), null, null, 0, 0, e18Var, 64 | ((i2 << 6) & 896), 3960);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new jnd(this, zy7Var, i, 0);
        }
    }

    public void c(zy7 zy7Var, ld4 ld4Var, int i) {
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-866580339);
        int i2 = (e18Var.h(zy7Var) ? 4 : 2) | i;
        if (e18Var.Q(i2 & 1, (i2 & 3) != 2)) {
            uuj.a(d4c.j0(R.string.project_rename, e18Var), a.a(ud0.e0, e18Var), zy7Var, null, null, false, null, null, null, null, 0, 0, e18Var, 64 | ((i2 << 6) & 896), 4088);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new jnd(this, zy7Var, i, 1);
        }
    }

    public void e(int i, ld4 ld4Var, zy7 zy7Var, boolean z) {
        int i2;
        int i3;
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-670603875);
        int i4 = i | (e18Var.g(z) ? 4 : 2) | (e18Var.h(zy7Var) ? 32 : 16);
        if (e18Var.Q(i4 & 1, (i4 & 19) != 18)) {
            if (z) {
                ud0 ud0Var = ud0.d;
                i2 = R.string.project_unstar;
                i3 = R.drawable.anthropicon_star_slash;
            } else {
                ud0 ud0Var2 = ud0.d;
                i2 = R.string.project_star;
                i3 = R.drawable.anthropicon_star;
            }
            uuj.a(d4c.j0(i2, e18Var), u00.D(i3, 0, e18Var), zy7Var, null, null, false, null, null, null, null, 0, 0, e18Var, 64 | ((i4 << 3) & 896), 4088);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new knd(this, z, zy7Var, i, 0);
        }
    }

    public boolean f(bo5 bo5Var, bo5 bo5Var2, boolean z) {
        if ((bo5Var instanceof qqb) && (bo5Var2 instanceof qqb)) {
            return x44.r(((qqb) bo5Var).p(), ((qqb) bo5Var2).p());
        }
        if ((bo5Var instanceof qai) && (bo5Var2 instanceof qai)) {
            return g((qai) bo5Var, (qai) bo5Var2, z, c0.V);
        }
        if (!(bo5Var instanceof c92) || !(bo5Var2 instanceof c92)) {
            return ((bo5Var instanceof wmc) && (bo5Var2 instanceof wmc)) ? x44.r(((xmc) ((wmc) bo5Var)).I, ((xmc) ((wmc) bo5Var2)).I) : x44.r(bo5Var, bo5Var2);
        }
        c92 c92Var = (c92) bo5Var;
        c92 c92Var2 = (c92) bo5Var2;
        if (!c92Var.equals(c92Var2)) {
            if (x44.r(c92Var.getName(), c92Var2.getName()) && ((!(c92Var instanceof w9b) || !(c92Var2 instanceof w9b) || ((w9b) c92Var).x() == ((w9b) c92Var2).x()) && ((!x44.r(c92Var.h(), c92Var2.h()) || (z && x44.r(u(c92Var), u(c92Var2)))) && !m06.o(c92Var) && !m06.o(c92Var2)))) {
                bo5 bo5VarH = c92Var.h();
                bo5 bo5VarH2 = c92Var2.h();
                if (((bo5VarH instanceof e92) || (bo5VarH2 instanceof e92)) ? false : f(bo5VarH, bo5VarH2, z)) {
                    m11 m11Var = new m11();
                    m11Var.E = z;
                    m11Var.F = c92Var;
                    m11Var.G = c92Var2;
                    gmc gmcVar = new gmc(m11Var);
                    if (gmcVar.m(c92Var, c92Var2, null, true).c() != 1 || gmcVar.m(c92Var2, c92Var, null, true).c() != 1) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public boolean g(qai qaiVar, qai qaiVar2, boolean z, pz7 pz7Var) {
        qaiVar.getClass();
        qaiVar2.getClass();
        if (qaiVar.equals(qaiVar2)) {
            return true;
        }
        if (x44.r(qaiVar.h(), qaiVar2.h())) {
            return false;
        }
        bo5 bo5VarH = qaiVar.h();
        bo5 bo5VarH2 = qaiVar2.h();
        return (((bo5VarH instanceof e92) || (bo5VarH2 instanceof e92)) ? ((Boolean) pz7Var.invoke(bo5VarH, bo5VarH2)).booleanValue() : f(bo5VarH, bo5VarH2, z)) && qaiVar.getIndex() == qaiVar2.getIndex();
    }

    @Override // defpackage.br4
    public Object h(Object obj) {
        ((rqe) obj).close();
        return null;
    }

    public void i(dn6 dn6Var) {
        dn6Var.e(ymk.class, v7k.a);
        dn6Var.e(utk.class, sfk.a);
        dn6Var.e(zmk.class, z7k.a);
        dn6Var.e(tnk.class, f8k.a);
        dn6Var.e(lnk.class, c8k.a);
        dn6Var.e(pnk.class, j8k.a);
        dn6Var.e(hkk.class, b5k.a);
        dn6Var.e(ckk.class, y4k.a);
        dn6Var.e(nlk.class, n6k.a);
        dn6Var.e(ysk.class, aek.a);
        dn6Var.e(zjk.class, v4k.a);
        dn6Var.e(yjk.class, r4k.a);
        dn6Var.e(fpk.class, u9k.a);
        dn6Var.e(xvk.class, v5k.a);
        dn6Var.e(dlk.class, e6k.a);
        dn6Var.e(xkk.class, q5k.a);
        dn6Var.e(jpk.class, x9k.a);
        dn6Var.e(osk.class, ndk.a);
        dn6Var.e(rsk.class, rdk.a);
        dn6Var.e(lsk.class, kdk.a);
        dn6Var.e(lok.class, e9k.a);
        dn6Var.e(wvk.class, g2k.a);
        dn6Var.e(pok.class, h9k.a);
        dn6Var.e(npk.class, bak.a);
        dn6Var.e(wpk.class, nak.a);
        dn6Var.e(spk.class, iak.a);
        dn6Var.e(ppk.class, eak.a);
        dn6Var.e(mqk.class, obk.a);
        dn6Var.e(rqk.class, pbk.a);
        dn6Var.e(grk.class, wbk.a);
        dn6Var.e(sqk.class, vbk.a);
        dn6Var.e(fok.class, c9k.a);
        dn6Var.e(nrk.class, ack.a);
        dn6Var.e(prk.class, cck.a);
        dn6Var.e(trk.class, hck.a);
        dn6Var.e(urk.class, jck.a);
        dn6Var.e(ksk.class, gdk.a);
        dn6Var.e(gsk.class, jdk.a);
        dn6Var.e(kqk.class, rak.a);
        dn6Var.e(cmk.class, q7k.a);
        dn6Var.e(cqk.class, ibk.a);
        dn6Var.e(bqk.class, vak.a);
        dn6Var.e(gqk.class, jbk.a);
        dn6Var.e(vsk.class, udk.a);
        dn6Var.e(huk.class, jgk.a);
        dn6Var.e(iik.class, y2k.a);
        dn6Var.e(yhk.class, q2k.a);
        dn6Var.e(thk.class, m2k.a);
        dn6Var.e(fik.class, u2k.a);
        dn6Var.e(pik.class, q3k.a);
        dn6Var.e(jik.class, c3k.a);
        dn6Var.e(sik.class, t3k.a);
        dn6Var.e(tik.class, v3k.a);
        dn6Var.e(zik.class, z3k.a);
        dn6Var.e(bjk.class, c4k.a);
        dn6Var.e(cjk.class, g4k.a);
        dn6Var.e(qwj.class, o1k.a);
        dn6Var.e(xwj.class, y1k.a);
        dn6Var.e(twj.class, s1k.a);
        dn6Var.e(ulk.class, x6k.a);
        dn6Var.e(mkk.class, f5k.a);
        dn6Var.e(ysj.class, fxj.a);
        dn6Var.e(usj.class, ixj.a);
        dn6Var.e(nkk.class, k5k.a);
        dn6Var.e(jpi.class, mxj.a);
        dn6Var.e(dtj.class, rxj.a);
        dn6Var.e(xuj.class, izj.a);
        dn6Var.e(tuj.class, nzj.a);
        dn6Var.e(stj.class, vxj.a);
        dn6Var.e(ntj.class, ayj.a);
        dn6Var.e(gvj.class, qzj.a);
        dn6Var.e(cvj.class, vzj.a);
        dn6Var.e(nvj.class, yzj.a);
        dn6Var.e(kvj.class, c0k.a);
        dn6Var.e(me7.class, h1k.a);
        dn6Var.e(lwj.class, m1k.a);
        dn6Var.e(svj.class, f0k.a);
        dn6Var.e(pvj.class, j0k.a);
        dn6Var.e(awj.class, p0k.a);
        dn6Var.e(wvj.class, s0k.a);
        dn6Var.e(jvk.class, mek.a);
        dn6Var.e(ouk.class, i5k.a);
        dn6Var.e(yuk.class, x8k.a);
        dn6Var.e(xuk.class, w8k.a);
        dn6Var.e(puk.class, z5k.a);
        dn6Var.e(xb5.class, gek.a);
        dn6Var.e(bvk.class, bek.a);
        dn6Var.e(lvk.class, uek.a);
        dn6Var.e(vuk.class, q6k.a);
        dn6Var.e(tvk.class, rgk.a);
        dn6Var.e(qvk.class, sgk.a);
        dn6Var.e(nvk.class, mgk.a);
        dn6Var.e(ctk.class, vek.a);
        dn6Var.e(rlk.class, s6k.a);
        dn6Var.e(gmk.class, t7k.a);
        dn6Var.e(fhk.class, k2k.a);
        dn6Var.e(elk.class, k6k.a);
        dn6Var.e(zlk.class, m7k.a);
        dn6Var.e(rkk.class, l5k.a);
        dn6Var.e(bok.class, s8k.a);
        dn6Var.e(aok.class, n8k.a);
        dn6Var.e(ssj.class, cxj.a);
        dn6Var.e(vtk.class, wfk.a);
        dn6Var.e(euk.class, igk.a);
        dn6Var.e(ztk.class, cgk.a);
        dn6Var.e(bhk.class, a2k.a);
        dn6Var.e(vjk.class, o4k.a);
        dn6Var.e(ljk.class, j4k.a);
        dn6Var.e(hjk.class, i4k.a);
        dn6Var.e(uok.class, k9k.a);
        dn6Var.e(cpk.class, q9k.a);
        dn6Var.e(yok.class, o9k.a);
        dn6Var.e(puj.class, dyj.a);
        dn6Var.e(ztj.class, dzj.a);
        dn6Var.e(xrk.class, mck.a);
        dn6Var.e(esk.class, ddk.a);
        dn6Var.e(zrk.class, pck.a);
        dn6Var.e(bsk.class, sck.a);
        dn6Var.e(jwj.class, w0k.a);
        dn6Var.e(fwj.class, a1k.a);
        dn6Var.e(ktk.class, nfk.a);
        dn6Var.e(gtk.class, ifk.a);
    }

    @Override // defpackage.go0
    public void j(cz5 cz5Var, int i, int[] iArr, fu9 fu9Var, int[] iArr2) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        int length = iArr.length;
        int i5 = i - i3;
        int i6 = 0;
        while (i2 < length) {
            int i7 = iArr[i2];
            iArr2[i6] = i5;
            i5 += i7;
            i2++;
            i6++;
        }
    }

    @Override // defpackage.vv1
    public Rect m(Activity activity) throws Exception {
        uv1 uv1Var = vv1.b;
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        DisplayCutout displayCutoutH = null;
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (activity.isInMultiWindowMode()) {
                Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                objInvoke.getClass();
                rect.set((Rect) objInvoke);
            } else {
                Object objInvoke2 = obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null);
                objInvoke2.getClass();
                rect.set((Rect) objInvoke2);
            }
        } catch (Exception e) {
            if (!(e instanceof NoSuchFieldException) && !(e instanceof NoSuchMethodException) && !(e instanceof IllegalAccessException) && !(e instanceof InvocationTargetException)) {
                throw e;
            }
            uv1Var.getClass();
            Log.w(uv1.b, e);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        if (!activity.isInMultiWindowMode()) {
            Resources resources = activity.getResources();
            int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
            int i = rect.bottom + dimensionPixelSize;
            if (i == point.y) {
                rect.bottom = i;
            } else {
                int i2 = rect.right + dimensionPixelSize;
                if (i2 == point.x) {
                    rect.right = i2;
                } else if (rect.left == dimensionPixelSize) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !activity.isInMultiWindowMode()) {
            try {
                Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(null);
                constructor.setAccessible(true);
                Object objNewInstance = constructor.newInstance(null);
                Method declaredMethod = defaultDisplay.getClass().getDeclaredMethod("getDisplayInfo", objNewInstance.getClass());
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(defaultDisplay, objNewInstance);
                Field declaredField2 = objNewInstance.getClass().getDeclaredField("displayCutout");
                declaredField2.setAccessible(true);
                Object obj2 = declaredField2.get(objNewInstance);
                if (v5.w(obj2)) {
                    displayCutoutH = v5.h(obj2);
                }
            } catch (Exception e2) {
                if (!(e2 instanceof ClassNotFoundException) && !(e2 instanceof NoSuchMethodException) && !(e2 instanceof NoSuchFieldException) && !(e2 instanceof IllegalAccessException) && !(e2 instanceof InvocationTargetException) && !(e2 instanceof InstantiationException)) {
                    throw e2;
                }
                uv1Var.getClass();
                Log.w(uv1.b, e2);
            }
            if (displayCutoutH != null) {
                if (rect.left == displayCutoutH.getSafeInsetLeft()) {
                    rect.left = 0;
                }
                if (point.x - rect.right == displayCutoutH.getSafeInsetRight()) {
                    rect.right = displayCutoutH.getSafeInsetRight() + rect.right;
                }
                if (rect.top == displayCutoutH.getSafeInsetTop()) {
                    rect.top = 0;
                }
                if (point.y - rect.bottom == displayCutoutH.getSafeInsetBottom()) {
                    rect.bottom = displayCutoutH.getSafeInsetBottom() + rect.bottom;
                }
            }
        }
        return rect;
    }

    @Override // defpackage.fri
    public Object n(com.airbnb.lottie.parser.moshi.a aVar, float f) {
        switch (this.E) {
            case 4:
                boolean z = aVar.e() == 1;
                if (z) {
                    aVar.beginArray();
                }
                double dNextDouble = aVar.nextDouble();
                double dNextDouble2 = aVar.nextDouble();
                double dNextDouble3 = aVar.nextDouble();
                double dNextDouble4 = aVar.e() == 7 ? aVar.nextDouble() : 1.0d;
                if (z) {
                    aVar.endArray();
                }
                if (dNextDouble <= 1.0d && dNextDouble2 <= 1.0d && dNextDouble3 <= 1.0d) {
                    dNextDouble *= 255.0d;
                    dNextDouble2 *= 255.0d;
                    dNextDouble3 *= 255.0d;
                    if (dNextDouble4 <= 1.0d) {
                        dNextDouble4 *= 255.0d;
                    }
                }
                return Integer.valueOf(Color.argb((int) dNextDouble4, (int) dNextDouble, (int) dNextDouble2, (int) dNextDouble3));
            default:
                return ej9.b(aVar, f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.ut9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object o(defpackage.ja8 r8, defpackage.tp4 r9) throws java.lang.Exception {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.vt9
            if (r0 == 0) goto L13
            r0 = r9
            vt9 r0 = (defpackage.vt9) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L1a
        L13:
            vt9 r0 = new vt9
            vp4 r9 = (defpackage.vp4) r9
            r0.<init>(r7, r9)
        L1a:
            java.lang.Object r7 = r0.F
            int r9 = r0.H
            r1 = 1
            r2 = 0
            if (r9 == 0) goto L33
            if (r9 != r1) goto L2d
            android.media.ImageReader r8 = r0.E
            defpackage.sf5.h0(r7)     // Catch: java.lang.Throwable -> L2a
            goto L95
        L2a:
            r7 = move-exception
            goto La7
        L2d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r7)
            return r2
        L33:
            defpackage.sf5.h0(r7)
            long r3 = r8.u
            android.os.Looper r7 = android.os.Looper.myLooper()
            if (r7 != 0) goto L42
            android.os.Looper r7 = android.os.Looper.getMainLooper()
        L42:
            r9 = 32
            long r5 = r3 >> r9
            int r9 = (int) r5
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r5
            int r3 = (int) r3
            android.media.ImageReader r9 = android.media.ImageReader.newInstance(r9, r3, r1, r1)
            r0.E = r9     // Catch: java.lang.Throwable -> L9f
            r0.H = r1     // Catch: java.lang.Throwable -> L9f
            ua2 r3 = new ua2     // Catch: java.lang.Throwable -> L9f
            tp4 r0 = defpackage.zni.I(r0)     // Catch: java.lang.Throwable -> L9f
            r3.<init>(r1, r0)     // Catch: java.lang.Throwable -> L9f
            r3.t()     // Catch: java.lang.Throwable -> L9f
            wt9 r0 = new wt9     // Catch: java.lang.Throwable -> L9f
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L9f
            android.os.Handler r7 = defpackage.dgj.A(r7)     // Catch: java.lang.Throwable -> L9f
            r9.setOnImageAvailableListener(r0, r7)     // Catch: java.lang.Throwable -> L9f
            android.view.Surface r7 = r9.getSurface()     // Catch: java.lang.Throwable -> L9f
            android.graphics.Canvas r0 = r7.lockHardwareCanvas()     // Catch: java.lang.Throwable -> L9f
            long r4 = defpackage.d54.b     // Catch: java.lang.Throwable -> La2
            int r1 = defpackage.d4c.n0(r4)     // Catch: java.lang.Throwable -> La2
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.CLEAR     // Catch: java.lang.Throwable -> La2
            r0.drawColor(r1, r4)     // Catch: java.lang.Throwable -> La2
            iz r1 = defpackage.jz.a(r0)     // Catch: java.lang.Throwable -> La2
            r8.c(r1, r2)     // Catch: java.lang.Throwable -> La2
            r7.unlockCanvasAndPost(r0)     // Catch: java.lang.Throwable -> L9f
            java.lang.Object r7 = r3.r()     // Catch: java.lang.Throwable -> L9f
            m45 r8 = defpackage.m45.E
            if (r7 != r8) goto L94
            return r8
        L94:
            r8 = r9
        L95:
            android.media.Image r7 = (android.media.Image) r7     // Catch: java.lang.Throwable -> L2a
            android.graphics.Bitmap r7 = defpackage.nuj.k(r7)     // Catch: java.lang.Throwable -> L2a
            defpackage.csg.o(r8, r2)
            return r7
        L9f:
            r7 = move-exception
            r8 = r9
            goto La7
        La2:
            r8 = move-exception
            r7.unlockCanvasAndPost(r0)     // Catch: java.lang.Throwable -> L9f
            throw r8     // Catch: java.lang.Throwable -> L9f
        La7:
            throw r7     // Catch: java.lang.Throwable -> La8
        La8:
            r9 = move-exception
            defpackage.csg.o(r8, r7)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lyk.o(ja8, tp4):java.lang.Object");
    }

    @Override // defpackage.ia4
    public Object s(el5 el5Var) {
        Object objI = el5Var.i(new qzd(wb1.class, Executor.class));
        objI.getClass();
        return d4c.N((Executor) objI);
    }

    @Override // defpackage.lv1
    public long t(tgf tgfVar, int i) {
        return tgfVar.f.k(i);
    }

    public String toString() {
        switch (this.E) {
            case 12:
                return "coil.request.NullRequestData";
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return "AbsoluteArrangement#Right";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ lyk(int i) {
        this.E = i;
    }
}
