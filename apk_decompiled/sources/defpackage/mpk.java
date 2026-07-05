package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.ScrollingLayoutElement;
import androidx.compose.foundation.text.modifiers.SelectableTextAnnotatedStringElement;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement;
import androidx.concurrent.futures.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.core.telemetry.SilentException;
import com.arkivanov.essenty.statekeeper.SerializableContainer;
import com.pvporbit.freetype.FreeTypeConstants;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes.dex */
public abstract class mpk {
    public static volatile kjc a;
    public static final ta4 b = new ta4(-585652533, false, new xe3(8));
    public static final o54 c = o54.P;
    public static final o54 d = o54.L;
    public static final float e = 0.1f;
    public static final o54 f = o54.M;
    public static final float g = 0.38f;
    public static final float h = 1.0f;
    public static final o54 i = o54.I;
    public static final f50 j = new f50(4);
    public static final ddi k = new ddi(29);
    public static final hdj l = new hdj(0);
    public static final hdj m = new hdj(1);
    public static final hdj n = new hdj(2);
    public static final hdj o = new hdj(3);
    public static boolean p;
    public static long q;
    public static Method r;
    public static Method s;
    public static Method t;

    public static void A(cv9 cv9Var, knk knkVar, long j2) {
        boolean z = knkVar instanceof flc;
        qk7 qk7Var = qk7.a;
        if (z) {
            l9e l9eVar = ((flc) knkVar).k;
            float f2 = l9eVar.a;
            cv9Var.T0(j2, (((long) Float.floatToRawIntBits(l9eVar.b)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32), c0(l9eVar), 1.0f, qk7Var, null, 3);
            return;
        }
        if (!(knkVar instanceof glc)) {
            if (knkVar instanceof elc) {
                cv9Var.i(((elc) knkVar).k, j2, 1.0f, qk7Var);
                return;
            } else {
                mr9.b();
                return;
            }
        }
        glc glcVar = (glc) knkVar;
        c40 c40Var = glcVar.l;
        if (c40Var != null) {
            cv9Var.i(c40Var, j2, 1.0f, qk7Var);
            return;
        }
        sve sveVar = glcVar.k;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (sveVar.h >> 32));
        float f3 = sveVar.a;
        cv9Var.p0(j2, (((long) Float.floatToRawIntBits(sveVar.b)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32), (((long) Float.floatToRawIntBits(sveVar.b())) << 32) | (((long) Float.floatToRawIntBits(sveVar.a())) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), qk7Var, 1.0f);
    }

    public static final void B(int i2, String str) throws Throwable {
        if (Build.VERSION.SDK_INT >= 29) {
            d59.d(i2, g0(str));
            return;
        }
        String strG0 = g0(str);
        try {
            if (t == null) {
                t = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
            }
            Method method = t;
            if (method == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            method.invoke(null, Long.valueOf(q), strG0, Integer.valueOf(i2));
        } catch (Exception e2) {
            L("asyncTraceEnd", e2);
        }
    }

    public static final int C(View view, int i2) {
        int i3 = 0;
        int i4 = Integer.MAX_VALUE;
        Object obj = null;
        while (view != null) {
            Object tag = view.getTag(i2);
            if (tag != null) {
                if (obj != null) {
                    if (!tag.equals(obj)) {
                        break;
                    }
                } else {
                    obj = tag;
                }
                i4 = i3;
            }
            i3++;
            Object objA = bmk.a(view);
            view = objA instanceof View ? (View) objA : null;
        }
        return i4;
    }

    public static final View D(View view) {
        if (!view.isAttachedToWindow()) {
            return view;
        }
        int iMin = Math.min(C(view, R.id.view_tree_lifecycle_owner), C(view, R.id.view_tree_saved_state_registry_owner));
        View view2 = view;
        int i2 = 0;
        View view3 = view2;
        while (view != null) {
            if (i2 == iMin) {
                if (!(view.getParent() instanceof ViewGroup)) {
                    return view2;
                }
            } else if (H(view) == null) {
                i2++;
                Object objA = bmk.a(view);
                View view4 = view2;
                view2 = view;
                view = objA instanceof View ? (View) objA : null;
                view3 = view4;
            }
            return view;
        }
        return view3;
    }

    public static final void E(long j2, byte[] bArr, int i2, int i3, int i4) {
        int i5 = 7 - i3;
        int i6 = 8 - i4;
        if (i6 > i5) {
            return;
        }
        while (true) {
            int i7 = nm8.a[(int) ((j2 >> (i5 << 3)) & 255)];
            int i8 = i2 + 1;
            bArr[i2] = (byte) (i7 >> 8);
            i2 += 2;
            bArr[i8] = (byte) i7;
            if (i5 == i6) {
                return;
            } else {
                i5--;
            }
        }
    }

    public static kye F(String str, Object obj) {
        String strC;
        String canonicalName;
        obj.getClass();
        ComponentName componentName = obj instanceof Activity ? ((Activity) obj).getComponentName() : null;
        if (componentName == null) {
            boolean z = obj instanceof String;
            String string = z ? (String) obj : (!(obj instanceof Number) && (obj instanceof Enum)) ? ij0.C(obj.getClass().getName(), "@", ((Enum) obj).name()) : obj.toString();
            if (z) {
                canonicalName = (String) obj;
            } else if (obj instanceof Number) {
                canonicalName = obj.toString();
            } else if (obj instanceof Enum) {
                canonicalName = ij0.C(obj.getClass().getName(), ".", ((Enum) obj).name());
            } else {
                canonicalName = obj.getClass().getCanonicalName();
                if (canonicalName == null) {
                    canonicalName = obj.getClass().getSimpleName();
                }
            }
            if (str == null) {
                str = z ? (String) obj : obj instanceof Number ? obj.toString() : obj instanceof Enum ? ((Enum) obj).name() : obj.getClass().getName();
            }
            return new kye(string, canonicalName, str);
        }
        String str2 = componentName.getClassName() + "@" + System.identityHashCode(obj);
        String packageName = componentName.getPackageName();
        packageName.getClass();
        if (packageName.length() == 0) {
            strC = componentName.getClassName();
            strC.getClass();
        } else {
            String className = componentName.getClassName();
            className.getClass();
            if (isg.q0(className, componentName.getPackageName() + ".", false)) {
                strC = componentName.getClassName();
                strC.getClass();
            } else {
                String className2 = componentName.getClassName();
                className2.getClass();
                if (bsg.v0(className2, '.')) {
                    strC = componentName.getClassName();
                    strC.getClass();
                } else {
                    strC = ij0.C(componentName.getPackageName(), ".", componentName.getClassName());
                }
            }
        }
        if (str == null) {
            str = componentName.getClassName();
            str.getClass();
        }
        return new kye(str2, strC, str);
    }

    public static pa G(qh9 qh9Var) {
        ArrayList arrayList;
        String strM;
        try {
            bh9 bh9VarS = qh9Var.s("type");
            int i2 = 0;
            if (bh9VarS != null && (strM = bh9VarS.m()) != null) {
                int[] iArrH = sq6.H(7);
                int length = iArrH.length;
                while (i2 < length) {
                    int i3 = iArrH[i2];
                    if (sq6.g(i3).equals(strM)) {
                        i2 = i3;
                    } else {
                        i2++;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
            bh9 bh9VarS2 = qh9Var.s("name");
            String strM2 = bh9VarS2 != null ? bh9VarS2.m() : null;
            bh9 bh9VarS3 = qh9Var.s("model");
            String strM3 = bh9VarS3 != null ? bh9VarS3.m() : null;
            bh9 bh9VarS4 = qh9Var.s("brand");
            String strM4 = bh9VarS4 != null ? bh9VarS4.m() : null;
            bh9 bh9VarS5 = qh9Var.s("architecture");
            String strM5 = bh9VarS5 != null ? bh9VarS5.m() : null;
            bh9 bh9VarS6 = qh9Var.s("locale");
            String strM6 = bh9VarS6 != null ? bh9VarS6.m() : null;
            bh9 bh9VarS7 = qh9Var.s("locales");
            if (bh9VarS7 != null) {
                ArrayList arrayList2 = bh9VarS7.e().E;
                arrayList = new ArrayList(arrayList2.size());
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((bh9) it.next()).m());
                }
            } else {
                arrayList = null;
            }
            bh9 bh9VarS8 = qh9Var.s("time_zone");
            String strM7 = bh9VarS8 != null ? bh9VarS8.m() : null;
            bh9 bh9VarS9 = qh9Var.s("battery_level");
            Number numberL = bh9VarS9 != null ? bh9VarS9.l() : null;
            bh9 bh9VarS10 = qh9Var.s("power_saving_mode");
            Boolean boolValueOf = bh9VarS10 != null ? Boolean.valueOf(bh9VarS10.a()) : null;
            bh9 bh9VarS11 = qh9Var.s("brightness_level");
            Number numberL2 = bh9VarS11 != null ? bh9VarS11.l() : null;
            bh9 bh9VarS12 = qh9Var.s("logical_cpu_count");
            Number numberL3 = bh9VarS12 != null ? bh9VarS12.l() : null;
            bh9 bh9VarS13 = qh9Var.s("total_ram");
            Number numberL4 = bh9VarS13 != null ? bh9VarS13.l() : null;
            bh9 bh9VarS14 = qh9Var.s("is_low_ram");
            return new pa(i2, strM2, strM3, strM4, strM5, strM6, arrayList, strM7, numberL, boolValueOf, numberL2, numberL3, numberL4, bh9VarS14 != null ? Boolean.valueOf(bh9VarS14.a()) : null);
        } catch (IllegalStateException e2) {
            pmf.j("Unable to parse json into type Device", e2);
            return null;
        } catch (NullPointerException e3) {
            pmf.j("Unable to parse json into type Device", e3);
            return null;
        } catch (NumberFormatException e4) {
            pmf.j("Unable to parse json into type Device", e4);
            return null;
        }
    }

    public static final hd4 H(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_compose_view_context);
        WeakReference weakReference = tag instanceof WeakReference ? (WeakReference) tag : null;
        if (weakReference != null) {
            return (hd4) weakReference.get();
        }
        return null;
    }

    public static final float I(c45 c45Var) {
        qrb qrbVar = (qrb) c45Var.x0(a5.K);
        float fT = qrbVar != null ? qrbVar.T() : 1.0f;
        if (fT >= MTTypesetterKt.kLineSkipLimitMultiplier) {
            return fT;
        }
        bbd.b("negative scale factor");
        return fT;
    }

    public static o92 J(m92 m92Var) {
        b bVar = new b();
        bVar.c = new dne();
        o92 o92Var = new o92(bVar);
        bVar.b = o92Var;
        bVar.a = m92Var.getClass();
        try {
            Object objD = m92Var.d(bVar);
            if (objD == null) {
                return o92Var;
            }
            bVar.a = objD;
            return o92Var;
        } catch (Exception e2) {
            o92Var.F.l(e2);
            return o92Var;
        }
    }

    public static final long K(byte[] bArr, int i2) {
        return (((long) bArr[i2 + 7]) & 255) | ((((long) bArr[i2]) & 255) << 56) | ((((long) bArr[i2 + 1]) & 255) << 48) | ((((long) bArr[i2 + 2]) & 255) << 40) | ((((long) bArr[i2 + 3]) & 255) << 32) | ((((long) bArr[i2 + 4]) & 255) << 24) | ((((long) bArr[i2 + 5]) & 255) << 16) | ((((long) bArr[i2 + 6]) & 255) << 8);
    }

    public static void L(String str, Exception exc) throws Throwable {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = ((InvocationTargetException) exc).getCause();
            if (cause instanceof RuntimeException) {
                throw cause;
            }
            xh6.h(cause);
            return;
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static final iqb M(iqb iqbVar) {
        return k0(iqbVar, n);
    }

    public static /* synthetic */ oe3 N(dpf dpfVar, Object obj, String str, SerializableContainer serializableContainer, int i2) {
        if ((i2 & 4) != 0) {
            serializableContainer = null;
        }
        return dpfVar.O(obj, str, serializableContainer, null);
    }

    public static final boolean O() throws Throwable {
        if (Build.VERSION.SDK_INT >= 29) {
            return d59.g();
        }
        try {
            if (r == null) {
                q = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                r = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            Method method = r;
            if (method == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Object objInvoke = method.invoke(null, Long.valueOf(q));
            objInvoke.getClass();
            return ((Boolean) objInvoke).booleanValue();
        } catch (Exception e2) {
            L("isTagEnabled", e2);
            return false;
        }
    }

    public static lsc P(Object obj) {
        return new lsc(obj, a5.N);
    }

    public static final nwb Q(s21 s21Var, Object obj, Object obj2, Object obj3, pz7 pz7Var, ld4 ld4Var, int i2) {
        e18 e18Var = (e18) ld4Var;
        Object objN = e18Var.N();
        lz1 lz1Var = jd4.a;
        if (objN == lz1Var) {
            objN = P(s21Var);
            e18Var.k0(objN);
        }
        nwb nwbVar = (nwb) objN;
        boolean zH = e18Var.h(pz7Var);
        Object objN2 = e18Var.N();
        if (zH || objN2 == lz1Var) {
            objN2 = new idg(pz7Var, nwbVar, null, 0);
            e18Var.k0(objN2);
        }
        fd9.k(obj, obj2, obj3, (pz7) objN2, e18Var);
        return nwbVar;
    }

    public static final nwb R(ld4 ld4Var, pz7 pz7Var, Object obj) {
        e18 e18Var = (e18) ld4Var;
        Object objN = e18Var.N();
        lz1 lz1Var = jd4.a;
        if (objN == lz1Var) {
            objN = P(obj);
            e18Var.k0(objN);
        }
        nwb nwbVar = (nwb) objN;
        boolean zH = e18Var.h(pz7Var);
        Object objN2 = e18Var.N();
        if (zH || objN2 == lz1Var) {
            objN2 = new hdg(pz7Var, nwbVar, null, 0);
            e18Var.k0(objN2);
        }
        fd9.i(e18Var, (pz7) objN2, iei.a);
        return nwbVar;
    }

    public static final nwb S(me6 me6Var, Object obj, pz7 pz7Var, ld4 ld4Var, int i2) {
        e18 e18Var = (e18) ld4Var;
        Object objN = e18Var.N();
        lz1 lz1Var = jd4.a;
        if (objN == lz1Var) {
            objN = P(me6Var);
            e18Var.k0(objN);
        }
        nwb nwbVar = (nwb) objN;
        boolean zH = e18Var.h(pz7Var);
        Object objN2 = e18Var.N();
        if (zH || objN2 == lz1Var) {
            objN2 = new hdg(pz7Var, nwbVar, null, 1);
            e18Var.k0(objN2);
        }
        fd9.i(e18Var, (pz7) objN2, obj);
        return nwbVar;
    }

    public static final nwb T(Object obj, Object obj2, Object obj3, pz7 pz7Var, ld4 ld4Var, int i2) {
        e18 e18Var = (e18) ld4Var;
        Object objN = e18Var.N();
        lz1 lz1Var = jd4.a;
        if (objN == lz1Var) {
            objN = P(obj);
            e18Var.k0(objN);
        }
        nwb nwbVar = (nwb) objN;
        boolean zH = e18Var.h(pz7Var);
        Object objN2 = e18Var.N();
        if (zH || objN2 == lz1Var) {
            objN2 = new hdg(pz7Var, nwbVar, null, 2);
            e18Var.k0(objN2);
        }
        fd9.j(obj2, obj3, (pz7) objN2, e18Var);
        return nwbVar;
    }

    public static final JsonElement U(rh9 rh9Var, String str, String str2) {
        rh9Var.getClass();
        return rh9Var.b(str, ch9.c(str2));
    }

    public static final void V(rh9 rh9Var, String str, Boolean bool) {
        rh9Var.getClass();
        rh9Var.b(str, ch9.a(bool));
    }

    public static final void W(rh9 rh9Var, String str, bz7 bz7Var) {
        rh9Var.getClass();
        str.getClass();
        rh9 rh9Var2 = new rh9();
        bz7Var.invoke(rh9Var2);
        rh9Var.b(str, rh9Var2.a());
    }

    public static final ng8 X(ld4 ld4Var) {
        wo8 wo8Var = cg8.a;
        boolean z = Build.VERSION.SDK_INT >= 31;
        e18 e18Var = (e18) ld4Var;
        Object objN = e18Var.N();
        if (objN == jd4.a) {
            objN = new ng8(z);
            e18Var.k0(objN);
        }
        ng8 ng8Var = (ng8) objN;
        ng8Var.b.setValue(Boolean.valueOf(z));
        return ng8Var;
    }

    public static final j9f Y(ld4 ld4Var) {
        Object[] objArr = new Object[0];
        boolean zD = ((e18) ld4Var).d(0);
        e18 e18Var = (e18) ld4Var;
        Object objN = e18Var.N();
        if (zD || objN == jd4.a) {
            objN = new zcd(26);
            e18Var.k0(objN);
        }
        return (j9f) iuj.K(objArr, j9f.j, (zy7) objN, e18Var, 0);
    }

    public static final nwb Z(Object obj, ld4 ld4Var) {
        e18 e18Var = (e18) ld4Var;
        Object objN = e18Var.N();
        if (objN == jd4.a) {
            objN = P(obj);
            e18Var.k0(objN);
        }
        nwb nwbVar = (nwb) objN;
        nwbVar.setValue(obj);
        return nwbVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:190:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final defpackage.zb0 r29, defpackage.iqb r30, final defpackage.tkh r31, defpackage.bz7 r32, int r33, final boolean r34, int r35, int r36, java.util.Map r37, defpackage.ld4 r38, final int r39, final int r40, final int r41) {
        /*
            Method dump skipped, instruction units count: 932
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mpk.a(zb0, iqb, tkh, bz7, int, boolean, int, int, java.util.Map, ld4, int, int, int):void");
    }

    public static final sx9 a0(el5 el5Var, sd9 sd9Var) {
        el5Var.getClass();
        sd9Var.getClass();
        return new sx9(el5Var, sd9Var, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:170:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(java.lang.String r35, defpackage.iqb r36, defpackage.tkh r37, defpackage.bz7 r38, int r39, boolean r40, int r41, int r42, defpackage.ld4 r43, final int r44, final int r45) {
        /*
            Method dump skipped, instruction units count: 797
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mpk.b(java.lang.String, iqb, tkh, bz7, int, boolean, int, int, ld4, int, int):void");
    }

    public static iqb b0(iqb iqbVar, j9f j9fVar, boolean z) {
        ukc ukcVar = ukc.E;
        ukc ukcVar2 = z ? ukcVar : ukc.F;
        zub zubVar = j9fVar.d;
        fqb fqbVar = fqb.E;
        return iqbVar.B(ukcVar2 == ukcVar ? xn5.V(fqbVar, wo8.c) : xn5.V(fqbVar, wo8.b)).B(new k9f(null, null, null, zubVar, ukcVar2, j9fVar, true, false, true)).B(new ScrollingLayoutElement(j9fVar, z));
    }

    public static final zc5 c(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        return new zc5(new float[]{f2, f3, f4, f5, f6, f7, f8, f9});
    }

    public static final long c0(l9e l9eVar) {
        float f2 = l9eVar.c - l9eVar.a;
        return (((long) Float.floatToRawIntBits(l9eVar.d - l9eVar.b)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
    }

    public static final long d(float f2, float f3) {
        return (((long) Float.floatToRawIntBits(f3)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
    }

    public static final b3f d0(zy7 zy7Var) {
        return new b3f(new x25(zy7Var, (tp4) null, 7));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0213  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(final defpackage.iqb r26, final defpackage.zb0 r27, final defpackage.bz7 r28, final boolean r29, final java.util.Map r30, final defpackage.tkh r31, final int r32, final boolean r33, final int r34, final int r35, final defpackage.wt7 r36, final defpackage.yhf r37, final defpackage.bz7 r38, defpackage.ld4 r39, final int r40, final int r41) {
        /*
            Method dump skipped, instruction units count: 1102
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mpk.e(iqb, zb0, bz7, boolean, java.util.Map, tkh, int, boolean, int, int, wt7, yhf, bz7, ld4, int, int):void");
    }

    public static final iqb e0(iqb iqbVar, zb0 zb0Var, tkh tkhVar, bz7 bz7Var, int i2, boolean z, int i3, int i4, wt7 wt7Var, List list, bz7 bz7Var2, yhf yhfVar, bz7 bz7Var3) {
        if (yhfVar == null) {
            return iqbVar.B(fqb.E).B(new TextAnnotatedStringElement(zb0Var, tkhVar, wt7Var, bz7Var, i2, z, i3, i4, list, bz7Var2, bz7Var3));
        }
        return iqbVar.B(yhfVar.d()).B(new SelectableTextAnnotatedStringElement(zb0Var, tkhVar, wt7Var, bz7Var, i2, z, i3, i4, list, bz7Var2, yhfVar));
    }

    public static final void f(t53 t53Var, t4g t4gVar, zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i2) {
        iqb iqbVar2;
        t4gVar.getClass();
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(105767537);
        int i3 = i2 | (e18Var.f(t53Var) ? 4 : 2) | (e18Var.f(t4gVar) ? 32 : 16) | (e18Var.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | 3072;
        if (e18Var.Q(i3 & 1, (i3 & 1171) != 1170)) {
            wt2 wt2Var = new wt2(t53Var, t4gVar, zy7Var, 7);
            int i4 = ((i3 >> 3) & 14) | 48;
            fqb fqbVar = fqb.E;
            qwe.a(t4gVar, fqbVar, null, false, null, wt2Var, e18Var, i4, 28);
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new f73(t53Var, t4gVar, zy7Var, iqbVar2, i2, 7);
        }
    }

    public static final ArrayList f0(LocaleList localeList) {
        ArrayList arrayList = new ArrayList();
        int size = localeList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Locale locale = localeList.get(i2);
            if (locale != null) {
                arrayList.add(locale);
            }
        }
        if (arrayList.isEmpty()) {
            Locale locale2 = Locale.getDefault();
            SilentException.a(new SilentException("LocaleList is empty, falling back to getDefault: " + locale2), null, false, 3);
            if (locale2 == null) {
                locale2 = Locale.US;
            }
            locale2.getClass();
            arrayList.add(locale2);
        }
        return arrayList;
    }

    public static final void g(boolean z, pz7 pz7Var, ld4 ld4Var, int i2) {
        int i3;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-642000585);
        if ((i2 & 6) == 0) {
            i3 = (e18Var.g(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= e18Var.h(pz7Var) ? 32 : 16;
        }
        int i4 = 18;
        if (e18Var.Q(i3 & 1, (i3 & 19) != 18)) {
            Object objA = uda.a(e18Var);
            if (objA == null) {
                e18Var.a0(1512740606);
                objA = vda.a(e18Var);
            } else {
                e18Var.a0(1512737723);
            }
            e18Var.p(false);
            if (objA == null) {
                sz6.j("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
                return;
            }
            boolean zF = e18Var.f(objA);
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (zF || objN == lz1Var) {
                izb izbVar = objA instanceof izb ? (izb) objA : null;
                dpf dpfVarB = izbVar != null ? izbVar.b() : null;
                xdc xdcVar = objA instanceof xdc ? (xdc) objA : null;
                objN = new fb1(dpfVarB, xdcVar != null ? xdcVar.c() : null);
                e18Var.k0(objN);
            }
            fb1 fb1Var = (fb1) objN;
            Object objN2 = e18Var.N();
            if (objN2 == lz1Var) {
                objN2 = fd9.O(im6.E, e18Var);
                e18Var.k0(objN2);
            }
            l45 l45Var = (l45) objN2;
            long j2 = e18Var.T;
            boolean zF2 = e18Var.f(fb1Var) | e18Var.e(j2);
            Object objN3 = e18Var.N();
            if (zF2 || objN3 == lz1Var) {
                objN3 = new vc4(l45Var, new obd(objA, j2));
                e18Var.k0(objN3);
            }
            vc4 vc4Var = (vc4) objN3;
            e18Var.a0(-348514256);
            boolean zH = e18Var.h(vc4Var) | e18Var.h(pz7Var);
            Object objN4 = e18Var.N();
            if (zH || objN4 == lz1Var) {
                objN4 = new vc8(vc4Var, i4, pz7Var);
                e18Var.k0(objN4);
            }
            fd9.s((zy7) objN4, e18Var);
            int i5 = i3;
            Boolean boolValueOf = Boolean.valueOf(z);
            int i6 = i5 & 14;
            boolean zH2 = (i6 == 4) | e18Var.h(vc4Var);
            Object objN5 = e18Var.N();
            if (zH2 || objN5 == lz1Var) {
                objN5 = new hb1(vc4Var, z, 3);
                e18Var.k0(objN5);
            }
            mwa.i(boolValueOf, vc4Var, null, (bz7) objN5, e18Var, i6);
            boolean zH3 = e18Var.h(fb1Var) | e18Var.h(vc4Var);
            Object objN6 = e18Var.N();
            if (zH3 || objN6 == lz1Var) {
                objN6 = new vk3(fb1Var, 23, vc4Var);
                e18Var.k0(objN6);
            }
            fd9.e(fb1Var, vc4Var, (bz7) objN6, e18Var);
            e18Var.p(false);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new fa3(i2, 1, pz7Var, z);
        }
    }

    public static String g0(String str) {
        String str2 = str.length() <= 127 ? str : null;
        return str2 == null ? str.substring(0, 127) : str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(java.lang.String r17, defpackage.iqb r18, boolean r19, io.sentry.p1 r20, defpackage.ta4 r21, defpackage.ld4 r22, int r23, int r24) {
        /*
            Method dump skipped, instruction units count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mpk.h(java.lang.String, iqb, boolean, io.sentry.p1, ta4, ld4, int, int):void");
    }

    public static final void h0(lb0 lb0Var, nb0 nb0Var) {
        nb0Var.F.setValue(lb0Var.e.getValue());
        sb0 sb0Var = nb0Var.G;
        sb0 sb0Var2 = lb0Var.f;
        int iB = sb0Var.b();
        for (int i2 = 0; i2 < iB; i2++) {
            sb0Var.e(i2, sb0Var2.a(i2));
        }
        nb0Var.I = lb0Var.h;
        nb0Var.H = lb0Var.g;
        nb0Var.J = ((Boolean) lb0Var.i.getValue()).booleanValue();
    }

    public static final ArrayList i(List list, zy7 zy7Var) {
        gp1 gp1Var;
        if (!((Boolean) zy7Var.a()).booleanValue()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            h5b h5bVar = (h5b) list.get(i2);
            Object objZ = h5bVar.z();
            objZ.getClass();
            ja4 ja4Var = ((lkh) objZ).E;
            dkh dkhVar = (dkh) ja4Var.F;
            yb0 yb0Var = (yb0) ja4Var.G;
            yjh yjhVar = (yjh) dkhVar.a.getValue();
            if (yjhVar == null) {
                gp1Var = new gp1(0, 0, new wof(24));
            } else {
                yb0 yb0VarC = dkh.c(yb0Var, yjhVar);
                if (yb0VarC == null) {
                    gp1Var = new gp1(0, 0, new wof(25));
                } else {
                    c79 c79VarR = eve.R(yjhVar.j(yb0VarC.b, yb0VarC.c).e());
                    gp1Var = new gp1(c79VarR.f(), c79VarR.c(), new p3f(16, c79VarR));
                }
            }
            int i3 = gp1Var.E;
            int i4 = gp1Var.F;
            arrayList.add(new cpc(h5bVar.u(sf5.G(i3, i3, i4, i4)), (zy7) gp1Var.G));
        }
        return arrayList;
    }

    public static final List i0(int i2, int i3, ArrayList arrayList, List list) {
        if (arrayList.isEmpty()) {
            return lm6.E;
        }
        ArrayList arrayList2 = new ArrayList(list);
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            oz9 oz9Var = (oz9) arrayList.get(i4);
            int index = oz9Var.getIndex();
            if (i2 <= index && index <= i3) {
                arrayList2.add(oz9Var);
            }
        }
        a54.s0(arrayList2, j);
        return arrayList2;
    }

    public static final void j(c40 c40Var, knk knkVar) {
        if (knkVar instanceof flc) {
            c40.b(c40Var, ((flc) knkVar).k);
            return;
        }
        if (knkVar instanceof glc) {
            c40.c(c40Var, ((glc) knkVar).k);
        } else if (knkVar instanceof elc) {
            c40.a(c40Var, ((elc) knkVar).k);
        } else {
            mr9.b();
        }
    }

    public static final void j0(String str, int i2, String str2) {
        StringBuilder sbP = ij0.p("Expected ", str2, i2, " at index ", ", but was '");
        sbP.append(str.charAt(i2));
        sbP.append('\'');
        throw new IllegalArgumentException(sbP.toString());
    }

    public static final Object k(float f2, float f3, float f4, mb0 mb0Var, pz7 pz7Var, vp4 vp4Var) {
        d9i d9iVar = dgj.f;
        Float f5 = new Float(f2);
        Float f6 = new Float(f3);
        Float f7 = new Float(f4);
        bz7 bz7Var = d9iVar.a;
        sb0 sb0VarC = (sb0) bz7Var.invoke(f7);
        if (sb0VarC == null) {
            sb0VarC = ((sb0) bz7Var.invoke(f5)).c();
        }
        sb0 sb0Var = sb0VarC;
        Object objL = l(new nb0(d9iVar, f5, sb0Var, 56), new a5h(mb0Var, d9iVar, f5, f6, sb0Var), Long.MIN_VALUE, new kld(2, pz7Var), vp4Var);
        iei ieiVar = iei.a;
        m45 m45Var = m45.E;
        if (objL != m45Var) {
            objL = ieiVar;
        }
        return objL == m45Var ? objL : ieiVar;
    }

    public static final iqb k0(iqb iqbVar, bz7 bz7Var) {
        return iqbVar.B(new q1h(bz7Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object l(defpackage.nb0 r24, defpackage.gb0 r25, long r26, final defpackage.bz7 r28, defpackage.vp4 r29) {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mpk.l(nb0, gb0, long, bz7, vp4):java.lang.Object");
    }

    public static /* synthetic */ Object m(float f2, float f3, mb0 mb0Var, pz7 pz7Var, xzg xzgVar, int i2) {
        if ((i2 & 8) != 0) {
            mb0Var = kxk.K(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, null, 7);
        }
        return k(f2, f3, MTTypesetterKt.kLineSkipLimitMultiplier, mb0Var, pz7Var, xzgVar);
    }

    public static final Object n(nb0 nb0Var, zn5 zn5Var, boolean z, bz7 bz7Var, vp4 vp4Var) {
        Object objL = l(nb0Var, new yn5(zn5Var, nb0Var.E, nb0Var.F.getValue(), nb0Var.G), z ? nb0Var.H : Long.MIN_VALUE, bz7Var, vp4Var);
        return objL == m45.E ? objL : iei.a;
    }

    public static final Object o(nb0 nb0Var, Float f2, mb0 mb0Var, boolean z, bz7 bz7Var, vp4 vp4Var) {
        Object objL = l(nb0Var, new a5h(mb0Var, nb0Var.E, nb0Var.F.getValue(), f2, nb0Var.G), z ? nb0Var.H : Long.MIN_VALUE, bz7Var, vp4Var);
        return objL == m45.E ? objL : iei.a;
    }

    public static /* synthetic */ Object p(nb0 nb0Var, Float f2, mb0 mb0Var, boolean z, bz7 bz7Var, vp4 vp4Var, int i2) {
        if ((i2 & 2) != 0) {
            mb0Var = kxk.K(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, null, 7);
        }
        mb0 mb0Var2 = mb0Var;
        if ((i2 & 4) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i2 & 8) != 0) {
            bz7Var = new z1g(27);
        }
        return o(nb0Var, f2, mb0Var2, z2, bz7Var, vp4Var);
    }

    public static final void q(int i2, String str) throws Throwable {
        if (Build.VERSION.SDK_INT >= 29) {
            d59.a(i2, g0(str));
            return;
        }
        String strG0 = g0(str);
        try {
            if (s == null) {
                s = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
            }
            Method method = s;
            if (method == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            method.invoke(null, Long.valueOf(q), strG0, Integer.valueOf(i2));
        } catch (Exception e2) {
            L("asyncTraceBegin", e2);
        }
    }

    public static final String r(String str, ld4 ld4Var) {
        str.getClass();
        e18 e18Var = (e18) ld4Var;
        Configuration configuration = (Configuration) e18Var.j(w00.a);
        boolean zF = e18Var.f(configuration);
        Object objN = e18Var.N();
        lz1 lz1Var = jd4.a;
        if (zF || objN == lz1Var) {
            LocaleList locales = configuration.getLocales();
            locales.getClass();
            objN = (Locale) w44.L0(f0(locales));
            e18Var.k0(objN);
        }
        Locale locale = (Locale) objN;
        boolean zF2 = e18Var.f(str) | e18Var.f(locale);
        Object objN2 = e18Var.N();
        if (zF2 || objN2 == lz1Var) {
            objN2 = s(str, locale);
            e18Var.k0(objN2);
        }
        return (String) objN2;
    }

    public static final String s(String str, Locale locale) {
        str.getClass();
        locale.getClass();
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char cCharAt = str.charAt(0);
        sb.append((Object) (Character.isLowerCase(cCharAt) ? gb9.a0(cCharAt, locale) : String.valueOf(cCharAt)));
        sb.append(str.substring(1));
        return sb.toString();
    }

    public static final nwb t(kp7 kp7Var, Object obj, c45 c45Var, ld4 ld4Var, int i2, int i3) {
        int i4 = 2;
        if ((i3 & 2) != 0) {
            c45Var = im6.E;
        }
        c45 c45Var2 = c45Var;
        e18 e18Var = (e18) ld4Var;
        boolean zH = e18Var.h(c45Var2) | e18Var.h(kp7Var);
        Object objN = e18Var.N();
        if (zH || objN == jd4.a) {
            objN = new wmf(c45Var2, kp7Var, null, i4);
            e18Var.k0(objN);
        }
        return T(obj, kp7Var, c45Var2, (pz7) objN, e18Var, ((i2 >> 3) & 14) | (i2 & 896));
    }

    public static final nwb u(ylg ylgVar, ld4 ld4Var) {
        return t(ylgVar, ylgVar.getValue(), im6.E, ld4Var, 0, 0);
    }

    public static final wwb v() {
        w3c w3cVar = gdg.b;
        wwb wwbVar = (wwb) w3cVar.get();
        if (wwbVar != null) {
            return wwbVar;
        }
        wwb wwbVar2 = new wwb(0, new d18[0]);
        w3cVar.c(wwbVar2);
        return wwbVar2;
    }

    public static final wz5 w(zy7 zy7Var) {
        w3c w3cVar = gdg.a;
        return new wz5(zy7Var, null);
    }

    public static final wz5 x(zy7 zy7Var, fdg fdgVar) {
        w3c w3cVar = gdg.a;
        return new wz5(zy7Var, fdgVar);
    }

    public static final void y(lb0 lb0Var, long j2, float f2, gb0 gb0Var, nb0 nb0Var, bz7 bz7Var) {
        long jB = f2 == MTTypesetterKt.kLineSkipLimitMultiplier ? gb0Var.b() : (long) ((j2 - lb0Var.c) / f2);
        lb0Var.g = j2;
        lb0Var.e.setValue(gb0Var.f(jB));
        lb0Var.f = gb0Var.d(jB);
        if (gb0Var.e(jB)) {
            lb0Var.h = lb0Var.g;
            lb0Var.i.setValue(Boolean.FALSE);
        }
        h0(lb0Var, nb0Var);
        bz7Var.invoke(lb0Var);
    }

    public static void z(cv9 cv9Var, knk knkVar, jy1 jy1Var, float f2, int i2) {
        float f3 = (i2 & 4) != 0 ? 1.0f : f2;
        boolean z = knkVar instanceof flc;
        qk7 qk7Var = qk7.a;
        if (z) {
            l9e l9eVar = ((flc) knkVar).k;
            float f4 = l9eVar.a;
            cv9Var.b1(jy1Var, (((long) Float.floatToRawIntBits(l9eVar.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(f4)) << 32), c0(l9eVar), f3, qk7Var, null, 3);
            return;
        }
        if (!(knkVar instanceof glc)) {
            if (knkVar instanceof elc) {
                cv9Var.t0(((elc) knkVar).k, jy1Var, f3, qk7Var, null, 3);
                return;
            } else {
                mr9.b();
                return;
            }
        }
        glc glcVar = (glc) knkVar;
        c40 c40Var = glcVar.l;
        if (c40Var != null) {
            cv9Var.t0(c40Var, jy1Var, f3, qk7Var, null, 3);
            return;
        }
        sve sveVar = glcVar.k;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (sveVar.h >> 32));
        float f5 = sveVar.a;
        cv9Var.w0(jy1Var, (((long) Float.floatToRawIntBits(sveVar.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(f5)) << 32), (((long) Float.floatToRawIntBits(sveVar.b())) << 32) | (((long) Float.floatToRawIntBits(sveVar.a())) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32), f3, qk7Var, null, 3);
    }
}
