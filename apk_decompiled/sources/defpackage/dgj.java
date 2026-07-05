package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import androidx.compose.foundation.layout.b;
import androidx.work.impl.WorkDatabase;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.pvporbit.freetype.FreeTypeConstants;
import io.sentry.e0;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.regex.Matcher;
import kotlinx.coroutines.DispatchException;

/* JADX INFO: loaded from: classes.dex */
public abstract class dgj {
    public static final ta4 a = new ta4(-3358061, false, new s03(28));
    public static final oob b = new oob(19);
    public static final f50 c = new f50(2);
    public static final c79 d = new c79(0, 0, -1, -1);
    public static final d9i e = new d9i(new u9e(11), new u9e(12));
    public static final d9i f = new d9i(new ddi(8), new ddi(25));
    public static final d9i g = new d9i(new ddi(9), new ddi(10));
    public static final d9i h = new d9i(new ddi(11), new ddi(12));
    public static final d9i i = new d9i(new ddi(13), new ddi(14));
    public static final d9i j = new d9i(new ddi(15), new ddi(16));
    public static final d9i k = new d9i(new ddi(17), new ddi(18));
    public static final d9i l = new d9i(new ddi(19), new ddi(20));
    public static final d9i m = new d9i(new ddi(21), new ddi(22));
    public static final d9i n = new d9i(new ddi(23), new ddi(24));

    public static Handler A(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return je0.b(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException e2) {
            e = e2;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InstantiationException e3) {
            e = e3;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (NoSuchMethodException e4) {
            e = e4;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InvocationTargetException e5) {
            Throwable cause = e5.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            xh6.h(cause);
            return null;
        }
    }

    public static final bgj B(Context context, fg4 fg4Var) {
        zue zueVar;
        context.getClass();
        fg4Var.getClass();
        ggj ggjVar = new ggj(fg4Var.c);
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        knf knfVar = ggjVar.a;
        knfVar.getClass();
        a5 a5Var = fg4Var.d;
        boolean z = context.getResources().getBoolean(R.bool.workmanager_test_configuration);
        a5Var.getClass();
        if (z) {
            zueVar = new zue(applicationContext, null);
            zueVar.j = true;
        } else {
            if (bsg.I0("androidx.work.workdb")) {
                sz6.p("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
                return null;
            }
            zue zueVar2 = new zue(applicationContext, "androidx.work.workdb");
            zueVar2.i = new cd(16, applicationContext);
            zueVar = zueVar2;
        }
        zueVar.g = knfVar;
        zueVar.e.add(new vn3(a5Var));
        zueVar.a(fkb.h);
        zueVar.a(new ske(applicationContext, 2, 3));
        zueVar.a(fkb.i);
        zueVar.a(fkb.j);
        zueVar.a(new ske(applicationContext, 5, 6));
        zueVar.a(fkb.k);
        zueVar.a(fkb.l);
        zueVar.a(fkb.m);
        zueVar.a(new ske(applicationContext));
        zueVar.a(new ske(applicationContext, 10, 11));
        zueVar.a(fkb.d);
        zueVar.a(fkb.e);
        zueVar.a(fkb.f);
        zueVar.a(fkb.g);
        zueVar.a(new ske(applicationContext, 21, 22));
        zueVar.q = false;
        zueVar.r = true;
        zueVar.s = true;
        WorkDatabase workDatabase = (WorkDatabase) zueVar.b();
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        j4i j4iVar = new j4i(applicationContext2, ggjVar);
        xhd xhdVar = new xhd(context.getApplicationContext(), fg4Var, ggjVar, workDatabase);
        return new bgj(context.getApplicationContext(), fg4Var, ggjVar, workDatabase, (List) cgj.E.l(context, fg4Var, ggjVar, workDatabase, j4iVar, xhdVar), xhdVar, j4iVar);
    }

    public static final yq5 C(ld4 ld4Var) {
        int i2 = syb.a;
        xe4 xe4Var = on4.a;
        e18 e18Var = (e18) ld4Var;
        return syb.a(gm3.a(e18Var).q, d54.g, ((d54) e18Var.j(xe4Var)).a, ((d54) e18Var.j(xe4Var)).a, e18Var, 116);
    }

    public static final l9e D(hqb hqbVar, boolean z, boolean z2) {
        if (!hqbVar.E.R) {
            return l9e.e;
        }
        if (z) {
            return yfd.U(hqbVar, 8).D1();
        }
        m5c m5cVarU = yfd.U(hqbVar, 8);
        return nai.A(m5cVarU).J(m5cVarU, z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008e A[EDGE_INSN: B:45:0x008e->B:41:0x008e BREAK  A[LOOP:0: B:11:0x0014->B:49:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List E(defpackage.aoa r9, int r10, int r11) {
        /*
            r9.getClass()
            if (r10 != r11) goto L8
            lm6 r9 = defpackage.lm6.E
            return r9
        L8:
            r0 = 0
            r1 = 1
            if (r11 <= r10) goto Le
            r2 = r1
            goto Lf
        Le:
            r2 = r0
        Lf:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L14:
            if (r2 == 0) goto L19
            if (r10 >= r11) goto L8f
            goto L1b
        L19:
            if (r10 <= r11) goto L8f
        L1b:
            java.util.LinkedHashMap r4 = r9.a
            r5 = 0
            if (r2 == 0) goto L38
            java.lang.Integer r6 = java.lang.Integer.valueOf(r10)
            java.lang.Object r4 = r4.get(r6)
            java.util.TreeMap r4 = (java.util.TreeMap) r4
            if (r4 != 0) goto L2e
        L2c:
            r7 = r5
            goto L4e
        L2e:
            java.util.NavigableSet r6 = r4.descendingKeySet()
            cpc r7 = new cpc
            r7.<init>(r4, r6)
            goto L4e
        L38:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r10)
            java.lang.Object r4 = r4.get(r6)
            java.util.TreeMap r4 = (java.util.TreeMap) r4
            if (r4 != 0) goto L45
            goto L2c
        L45:
            java.util.Set r6 = r4.keySet()
            cpc r7 = new cpc
            r7.<init>(r4, r6)
        L4e:
            if (r7 != 0) goto L51
            goto L8e
        L51:
            java.lang.Object r4 = r7.E
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Object r6 = r7.F
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L5d:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L8b
            java.lang.Object r7 = r6.next()
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            if (r2 == 0) goto L76
            int r8 = r10 + 1
            if (r8 > r7) goto L5d
            if (r7 > r11) goto L5d
            goto L7a
        L76:
            if (r11 > r7) goto L5d
            if (r7 >= r10) goto L5d
        L7a:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            java.lang.Object r10 = r4.get(r10)
            r10.getClass()
            r3.add(r10)
            r4 = r1
            r10 = r7
            goto L8c
        L8b:
            r4 = r0
        L8c:
            if (r4 != 0) goto L14
        L8e:
            return r5
        L8f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dgj.E(aoa, int, int):java.util.List");
    }

    public static ja F(qh9 qh9Var) {
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = ((m7a) qh9Var.E.entrySet()).iterator();
            while (((o7a) it).hasNext()) {
                p7a p7aVarA = ((l7a) it).a();
                Object key = p7aVarA.getKey();
                key.getClass();
                linkedHashMap.put(key, p7aVarA.getValue());
            }
            return new ja(linkedHashMap);
        } catch (IllegalStateException e2) {
            pmf.j("Unable to parse json into type Context", e2);
            return null;
        } catch (NullPointerException e3) {
            pmf.j("Unable to parse json into type Context", e3);
            return null;
        } catch (NumberFormatException e4) {
            pmf.j("Unable to parse json into type Context", e4);
            return null;
        }
    }

    public static final void G(c45 c45Var, Throwable th) {
        if (th instanceof DispatchException) {
            th = ((DispatchException) th).E;
        }
        try {
            f45 f45Var = (f45) c45Var.x0(zp3.G);
            if (f45Var != null) {
                f45Var.x(c45Var, th);
            } else {
                wtk.g(c45Var, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                mwa.p(runtimeException, th);
                th = runtimeException;
            }
            wtk.g(c45Var, th);
        }
    }

    public static final boolean H(float[] fArr, float[] fArr2) {
        if (fArr.length < 16 || fArr2.length < 16) {
            return false;
        }
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = fArr[6];
        float f9 = fArr[7];
        float f10 = fArr[8];
        float f11 = fArr[9];
        float f12 = fArr[10];
        float f13 = fArr[11];
        float f14 = fArr[12];
        float f15 = fArr[13];
        float f16 = fArr[14];
        float f17 = fArr[15];
        float f18 = (f2 * f7) - (f3 * f6);
        float f19 = (f2 * f8) - (f4 * f6);
        float f20 = (f2 * f9) - (f5 * f6);
        float f21 = (f3 * f8) - (f4 * f7);
        float f22 = (f3 * f9) - (f5 * f7);
        float f23 = (f4 * f9) - (f5 * f8);
        float f24 = (f10 * f15) - (f11 * f14);
        float f25 = (f10 * f16) - (f12 * f14);
        float f26 = (f10 * f17) - (f13 * f14);
        float f27 = (f11 * f16) - (f12 * f15);
        float f28 = (f11 * f17) - (f13 * f15);
        float f29 = (f12 * f17) - (f13 * f16);
        float f30 = (f23 * f24) + (((f21 * f26) + ((f20 * f27) + ((f18 * f29) - (f19 * f28)))) - (f22 * f25));
        if (f30 != MTTypesetterKt.kLineSkipLimitMultiplier) {
            float f31 = 1.0f / f30;
            fArr2[0] = ((f9 * f27) + ((f7 * f29) - (f8 * f28))) * f31;
            fArr2[1] = (((f4 * f28) + ((-f3) * f29)) - (f5 * f27)) * f31;
            fArr2[2] = ((f17 * f21) + ((f15 * f23) - (f16 * f22))) * f31;
            fArr2[3] = (((f12 * f22) + ((-f11) * f23)) - (f13 * f21)) * f31;
            float f32 = -f6;
            fArr2[4] = (((f8 * f26) + (f32 * f29)) - (f9 * f25)) * f31;
            fArr2[5] = ((f5 * f25) + ((f29 * f2) - (f4 * f26))) * f31;
            float f33 = -f14;
            fArr2[6] = (((f16 * f20) + (f33 * f23)) - (f17 * f19)) * f31;
            fArr2[7] = ((f13 * f19) + ((f23 * f10) - (f12 * f20))) * f31;
            fArr2[8] = ((f9 * f24) + ((f6 * f28) - (f7 * f26))) * f31;
            fArr2[9] = (((f26 * f3) + ((-f2) * f28)) - (f5 * f24)) * f31;
            fArr2[10] = ((f17 * f18) + ((f14 * f22) - (f15 * f20))) * f31;
            fArr2[11] = (((f20 * f11) + ((-f10) * f22)) - (f13 * f18)) * f31;
            fArr2[12] = (((f7 * f25) + (f32 * f27)) - (f8 * f24)) * f31;
            fArr2[13] = ((f4 * f24) + ((f2 * f27) - (f3 * f25))) * f31;
            fArr2[14] = (((f15 * f19) + (f33 * f21)) - (f16 * f18)) * f31;
            fArr2[15] = ((f12 * f18) + ((f10 * f21) - (f11 * f19))) * f31;
        }
        return !(f30 == MTTypesetterKt.kLineSkipLimitMultiplier);
    }

    public static final boolean I(a1c a1cVar) {
        a1cVar.getClass();
        return a1cVar.a != 1;
    }

    public static final LinkedHashMap J(List list, mrd mrdVar) {
        list.getClass();
        HashMap map = new HashMap();
        List list2 = list;
        int iD0 = tta.d0(x44.y(list2, 10));
        if (iD0 < 16) {
            iD0 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iD0);
        for (Object obj : list2) {
            Object obj2 = mrdVar.get(obj);
            Integer num = (Integer) map.get(obj2);
            int iIntValue = num != null ? num.intValue() + 1 : 0;
            map.put(obj2, Integer.valueOf(iIntValue));
            linkedHashMap.put(new ic9(iIntValue, obj2), obj);
        }
        return linkedHashMap;
    }

    public static final y5f K(bz7 bz7Var, pz7 pz7Var) {
        vu2 vu2Var = new vu2(3, pz7Var);
        nai.n(1, bz7Var);
        return new y5f(bz7Var, vu2Var);
    }

    public static final Object L(Object obj) {
        return obj instanceof e94 ? sf5.u(((e94) obj).a) : obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a1 A[PHI: r4
      0x00a1: PHI (r4v15 zy7) = (r4v8 zy7), (r4v16 zy7) binds: [B:33:0x009f, B:29:0x0098] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.nwb M(defpackage.zy7 r17, defpackage.zy7 r18, defpackage.pl3 r19, defpackage.ld4 r20, int r21, int r22) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dgj.M(zy7, zy7, pl3, ld4, int, int):nwb");
    }

    public static final noh N(ooh oohVar, poh pohVar, dqc dqcVar, boolean z, e18 e18Var) {
        boolean zF = e18Var.f(pohVar);
        Object objN = e18Var.N();
        if (zF || objN == jd4.a) {
            objN = new noh(oohVar, pohVar);
            e18Var.k0(objN);
        }
        noh nohVar = (noh) objN;
        nohVar.G.setValue(dqcVar);
        nohVar.H.setValue(Boolean.valueOf(z));
        return nohVar;
    }

    public static final void O(ua2 ua2Var, tp4 tp4Var, boolean z) {
        Object objS = ua2Var.s();
        Throwable thD = ua2Var.d(objS);
        Object hreVar = thD != null ? new hre(thD) : ua2Var.e(objS);
        if (!z) {
            tp4Var.resumeWith(hreVar);
            return;
        }
        tp4Var.getClass();
        z76 z76Var = (z76) tp4Var;
        vp4 vp4Var = z76Var.I;
        Object obj = z76Var.K;
        c45 context = vp4Var.getContext();
        Object objC = qnh.c(context, obj);
        ydi ydiVarD0 = objC != qnh.a ? zni.d0(vp4Var, context, objC) : null;
        try {
            vp4Var.resumeWith(hreVar);
            if (ydiVarD0 == null || ydiVarD0.z0()) {
                qnh.a(context, objC);
            }
        } catch (Throwable th) {
            if (ydiVarD0 == null || ydiVarD0.z0()) {
                qnh.a(context, objC);
            }
            throw th;
        }
    }

    public static final ls6 P(a1c a1cVar) {
        List listW;
        a1cVar.getClass();
        String str = a1cVar.b;
        int i2 = I(a1cVar) ? 1 : 2;
        switch (sq6.F(a1cVar.a)) {
            case 0:
                listW = lm6.E;
                break;
            case 1:
                listW = x44.W(zs6.ETHERNET);
                break;
            case 2:
                listW = x44.W(zs6.WIFI);
                break;
            case 3:
                listW = x44.W(zs6.WIMAX);
                break;
            case 4:
                listW = x44.W(zs6.BLUETOOTH);
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                listW = x44.W(zs6.CELLULAR);
                break;
            case 11:
                listW = x44.W(zs6.OTHER);
                break;
            default:
                mr9.b();
                return null;
        }
        String str2 = a1cVar.g;
        return new ls6(i2, listW, (str2 == null && str == null) ? null : new is6(str2, str));
    }

    public static final int Q(t26 t26Var) {
        t26Var.getClass();
        switch (t26Var.ordinal()) {
            case 0:
                return 1;
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 2;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            default:
                mr9.b();
                return 0;
        }
    }

    public static final int R(int i2) {
        sq6.a(i2);
        switch (sq6.F(i2)) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            default:
                mr9.b();
                return 0;
        }
    }

    public static final int S(int i2) {
        sq6.a(i2);
        switch (sq6.F(i2)) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            default:
                mr9.b();
                return 0;
        }
    }

    public static final z9 T(oxe oxeVar) {
        oxeVar.getClass();
        int iOrdinal = oxeVar.ordinal();
        if (iOrdinal == 0) {
            return z9.TAP;
        }
        if (iOrdinal == 1) {
            return z9.SCROLL;
        }
        if (iOrdinal == 2) {
            return z9.SWIPE;
        }
        if (iOrdinal == 3) {
            return z9.CLICK;
        }
        if (iOrdinal == 4) {
            return z9.BACK;
        }
        if (iOrdinal == 5) {
            return z9.CUSTOM;
        }
        mr9.b();
        return null;
    }

    public static final void U(long j2, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.setCounter(str, j2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void V(pu9 pu9Var, bz7 bz7Var) {
        m5c m5cVar;
        if (((hqb) pu9Var).E.R && (m5cVar = yfd.U(pu9Var, 2).V) != null) {
            m5cVar.G1(bz7Var, true);
        }
    }

    public static final void a(int i2, ld4 ld4Var, zy7 zy7Var, iqb iqbVar, boolean z) {
        int i3;
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1959372976);
        if ((i2 & 6) == 0) {
            i3 = (e18Var.g(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3 | (e18Var.h(zy7Var) ? 32 : 16) | 384;
        int i5 = 0;
        if (e18Var.Q(i4 & 1, (i4 & 147) != 146)) {
            wd6.M(z, null, gp6.e(null, 3).a(gp6.c(13)), gp6.f(null, 3).a(gp6.k(13)), null, fd9.q0(378599304, new mb1(i5, zy7Var), e18Var), e18Var, (i4 & 14) | 200064, 18);
            iqbVar = fqb.E;
        } else {
            e18Var.T();
        }
        iqb iqbVar2 = iqbVar;
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new nb1(z, zy7Var, iqbVar2, i2, 0);
        }
    }

    public static final void b(zy7 zy7Var, iqb iqbVar, wu8 wu8Var, float f2, ld4 ld4Var, int i2, int i3) {
        int i4;
        iqb iqbVar2;
        wu8 wu8Var2;
        float f3;
        wu8 wu8VarG;
        float fA;
        int i5;
        iqb iqbVar3;
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1916797120);
        int i6 = i2 | (e18Var.h(zy7Var) ? 4 : 2);
        int i7 = i3 & 2;
        if (i7 != 0) {
            i4 = i6 | 48;
        } else {
            i4 = i6 | (e18Var.f(iqbVar) ? 32 : 16);
        }
        int i8 = i4 | 1152;
        if (e18Var.Q(i8 & 1, (i8 & 1171) != 1170)) {
            e18Var.V();
            if ((i2 & 1) == 0 || e18Var.A()) {
                iqb iqbVar4 = i7 != 0 ? fqb.E : iqbVar;
                int i9 = i8 & (-8065);
                wu8VarG = vz8.G(0L, ((d54) e18Var.j(on4.a)).a, 0L, e18Var, 13);
                fA = csg.A(24, e18Var);
                i5 = i9;
                iqbVar3 = iqbVar4;
            } else {
                e18Var.T();
                i5 = i8 & (-8065);
                iqbVar3 = iqbVar;
                wu8VarG = wu8Var;
                fA = f2;
            }
            e18Var.q();
            ez1.e(zy7Var, iqbVar3, false, wu8VarG, null, fd9.q0(1620912862, new dt0(3, fA), e18Var), e18Var, (i5 & 14) | 1572864 | (i5 & 112), 52);
            wu8Var2 = wu8VarG;
            f3 = fA;
            iqbVar2 = iqbVar3;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
            wu8Var2 = wu8Var;
            f3 = f2;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new lb1(zy7Var, iqbVar2, wu8Var2, f3, i2, i3);
        }
    }

    public static final void c(int i2, ld4 ld4Var, iqb iqbVar, boolean z) {
        int i3;
        boolean z2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1656994956);
        if ((i2 & 6) == 0) {
            i3 = (e18Var.g(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3 | 48;
        int i5 = 0;
        if (e18Var.Q(i4 & 1, (i4 & 19) != 18)) {
            iqbVar = fqb.E;
            z2 = z;
            wd6.M(z2, iqbVar, gp6.e(null, 3).a(gp6.d(null, null, 15)), gp6.f(null, 3).a(gp6.l(null, null, 15)), null, fd9.k, e18Var, (i4 & 14) | 200064 | (i4 & 112), 16);
        } else {
            z2 = z;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new fa3(i2, i5, iqbVar, z2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(final String str, final boolean z, final boolean z2, final boolean z3, final boolean z4, final boolean z5, final boolean z6, final zy7 zy7Var, final zy7 zy7Var2, final zy7 zy7Var3, final zy7 zy7Var4, final bz7 bz7Var, final zy7 zy7Var5, final zy7 zy7Var6, final zy7 zy7Var7, final bz7 bz7Var2, final ml3 ml3Var, final skd skdVar, final int i2, List list, zy7 zy7Var8, final bz7 bz7Var3, final zy7 zy7Var9, final zy7 zy7Var10, bz7 bz7Var4, iqb iqbVar, pz7 pz7Var, ld4 ld4Var, final int i3) {
        boolean z7;
        List list2;
        zy7 zy7Var11;
        bz7 bz7Var5;
        pz7 pz7Var2;
        final iqb iqbVar2;
        boolean z8;
        str.getClass();
        zy7Var2.getClass();
        zy7Var3.getClass();
        zy7Var4.getClass();
        bz7Var.getClass();
        zy7Var5.getClass();
        zy7Var6.getClass();
        zy7Var7.getClass();
        bz7Var2.getClass();
        list.getClass();
        zy7Var8.getClass();
        bz7Var3.getClass();
        zy7Var9.getClass();
        zy7Var10.getClass();
        bz7Var4.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(471987988);
        int i4 = i3 | (e18Var.f(str) ? 4 : 2) | (e18Var.g(z) ? 32 : 16) | (e18Var.g(z2) ? 256 : FreeTypeConstants.FT_LOAD_PEDANTIC);
        boolean zG = e18Var.g(z3);
        int i5 = FreeTypeConstants.FT_LOAD_NO_RECURSE;
        int i6 = i4 | (zG ? 2048 : 1024);
        boolean zG2 = e18Var.g(z4);
        int i7 = FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        int i8 = i6 | (zG2 ? 16384 : 8192) | (e18Var.g(z5) ? 131072 : 65536) | (e18Var.g(z6) ? 1048576 : 524288) | (e18Var.h(zy7Var) ? 8388608 : 4194304) | (e18Var.h(zy7Var2) ? 67108864 : 33554432) | (e18Var.h(zy7Var3) ? 536870912 : 268435456);
        int i9 = (e18Var.h(zy7Var4) ? 4 : 2) | (e18Var.h(bz7Var) ? 32 : 16) | (e18Var.h(zy7Var5) ? 256 : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.h(zy7Var6) ? 2048 : 1024);
        if (e18Var.h(zy7Var7)) {
            i7 = 16384;
        }
        int i10 = i9 | i7 | (e18Var.h(bz7Var2) ? 131072 : 65536) | (e18Var.f(ml3Var) ? 1048576 : 524288) | (e18Var.f(skdVar) ? 8388608 : 4194304) | (e18Var.d(i2) ? 67108864 : 33554432) | (e18Var.f(list) ? 536870912 : 268435456);
        int i11 = 1597440 | (e18Var.h(zy7Var8) ? 4 : 2) | (e18Var.h(bz7Var3) ? 32 : 16) | (e18Var.h(zy7Var9) ? 256 : FreeTypeConstants.FT_LOAD_PEDANTIC);
        if (e18Var.h(zy7Var10)) {
            i5 = 2048;
        }
        int i12 = i11 | i5 | 196608;
        if (e18Var.Q(i8 & 1, ((i8 & 306783379) == 306783378 && (i10 & 306783379) == 306783378 && (i12 & 599187) == 599186) ? false : true)) {
            vo1 vo1Var = lja.T;
            eo0 eo0Var = ko0.c;
            q64 q64VarA = p64.a(eo0Var, vo1Var, e18Var, 48);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            fqb fqbVar = fqb.E;
            iqb iqbVarE = kxk.E(e18Var, fqbVar);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            z80 z80Var = cd4.f;
            d4c.i0(e18Var, z80Var, q64VarA);
            z80 z80Var2 = cd4.e;
            d4c.i0(e18Var, z80Var2, hycVarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z80 z80Var3 = cd4.g;
            d4c.i0(e18Var, z80Var3, numValueOf);
            bx bxVar = cd4.h;
            d4c.h0(e18Var, bxVar);
            z80 z80Var4 = cd4.d;
            d4c.i0(e18Var, z80Var4, iqbVarE);
            z7 = z;
            fd9.b(fd9.q0(1247454959, new ow1(skdVar, 9, bz7Var3), e18Var), fd9.q0(-1270776562, new a21(4, ml3Var), e18Var), fd9.q0(505959213, new pz7() { // from class: ca3
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ld4 ld4Var2 = (ld4) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    e18 e18Var2 = (e18) ld4Var2;
                    if (e18Var2.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        Boolean boolValueOf = Boolean.valueOf(!z2);
                        final boolean z9 = z3;
                        final boolean z10 = z;
                        final bz7 bz7Var6 = bz7Var2;
                        final boolean z11 = z4;
                        final zy7 zy7Var12 = zy7Var7;
                        final String str2 = str;
                        final boolean z12 = z5;
                        final boolean z13 = z6;
                        final skd skdVar2 = skdVar;
                        final zy7 zy7Var13 = zy7Var;
                        final zy7 zy7Var14 = zy7Var2;
                        final zy7 zy7Var15 = zy7Var3;
                        final zy7 zy7Var16 = zy7Var4;
                        final bz7 bz7Var7 = bz7Var;
                        final zy7 zy7Var17 = zy7Var5;
                        final zy7 zy7Var18 = zy7Var6;
                        knk.e(boolValueOf, null, null, "Chat actions crossfade", fd9.q0(-415132786, new rz7() { // from class: ga3
                            @Override // defpackage.rz7
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                                ld4 ld4Var3 = (ld4) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                if ((iIntValue2 & 6) == 0) {
                                    iIntValue2 |= ((e18) ld4Var3).g(zBooleanValue) ? 4 : 2;
                                }
                                e18 e18Var3 = (e18) ld4Var3;
                                if (e18Var3.Q(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                    boolean z14 = z10;
                                    lz1 lz1Var = jd4.a;
                                    if (zBooleanValue) {
                                        e18Var3.a0(-2009889323);
                                        cxe cxeVarA = axe.a(ko0.a, lja.Q, e18Var3, 48);
                                        int iHashCode2 = Long.hashCode(e18Var3.T);
                                        hyc hycVarL2 = e18Var3.l();
                                        iqb iqbVarE2 = kxk.E(e18Var3, fqb.E);
                                        dd4.e.getClass();
                                        re4 re4Var2 = cd4.b;
                                        e18Var3.e0();
                                        if (e18Var3.S) {
                                            e18Var3.k(re4Var2);
                                        } else {
                                            e18Var3.n0();
                                        }
                                        d4c.i0(e18Var3, cd4.f, cxeVarA);
                                        d4c.i0(e18Var3, cd4.e, hycVarL2);
                                        d4c.i0(e18Var3, cd4.g, Integer.valueOf(iHashCode2));
                                        d4c.h0(e18Var3, cd4.h);
                                        d4c.i0(e18Var3, cd4.d, iqbVarE2);
                                        fd9.q(zy7Var12, null, e18Var3, 0);
                                        boolean z15 = skdVar2 != null;
                                        bz7 bz7Var8 = bz7Var7;
                                        boolean zF = e18Var3.f(bz7Var8);
                                        String str3 = str2;
                                        boolean zF2 = zF | e18Var3.f(str3);
                                        Object objN = e18Var3.N();
                                        if (zF2 || objN == lz1Var) {
                                            objN = new l80(bz7Var8, 17, str3);
                                            e18Var3.k0(objN);
                                        }
                                        fd9.a(str3, z14, z12, z13, z15, zy7Var13, zy7Var14, zy7Var15, zy7Var16, (zy7) objN, zy7Var17, zy7Var18, e18Var3, 0);
                                        e18Var3.p(true);
                                        e18Var3.p(false);
                                    } else if (z9) {
                                        e18Var3.a0(-2008795178);
                                        boolean zG3 = e18Var3.g(z14);
                                        bz7 bz7Var9 = bz7Var6;
                                        boolean zF3 = zG3 | e18Var3.f(bz7Var9);
                                        Object objN2 = e18Var3.N();
                                        if (zF3 || objN2 == lz1Var) {
                                            objN2 = new rf1(z14, bz7Var9, 1);
                                            e18Var3.k0(objN2);
                                        }
                                        eve.e(0, 4, e18Var3, (zy7) objN2, null, z14, z11);
                                        e18Var3.p(false);
                                    } else {
                                        e18Var3.a0(-2008397324);
                                        e18Var3.p(false);
                                    }
                                } else {
                                    e18Var3.T();
                                }
                                return iei.a;
                            }
                        }, e18Var2), e18Var2, 27648, 6);
                    } else {
                        e18Var2.T();
                    }
                    return iei.a;
                }
            }, e18Var), null, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var, 438);
            iqb iqbVarN = sf5.N(fqbVar, MTTypesetterKt.kLineSkipLimitMultiplier, -8.0f, 1);
            Object objN = e18Var.N();
            if (objN == jd4.a) {
                bz7Var5 = bz7Var4;
                z8 = false;
                objN = new da3(null == true ? 1 : 0, bz7Var5);
                e18Var.k0(objN);
            } else {
                bz7Var5 = bz7Var4;
                z8 = false;
            }
            iqb iqbVarI = gb9.i(xn5.p0(iqbVarN, (bz7) objN), null, 3);
            q64 q64VarA2 = p64.a(eo0Var, vo1Var, e18Var, 48);
            int iHashCode2 = Long.hashCode(e18Var.T);
            hyc hycVarL2 = e18Var.l();
            iqb iqbVarE2 = kxk.E(e18Var, iqbVarI);
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, z80Var, q64VarA2);
            d4c.i0(e18Var, z80Var2, hycVarL2);
            ij0.t(iHashCode2, e18Var, z80Var3, e18Var, bxVar);
            d4c.i0(e18Var, z80Var4, iqbVarE2);
            c((i8 >> 3) & 14, e18Var, null, z7);
            int i13 = i12 >> 3;
            zni.b(i2, (i13 & 896) | ((i10 >> 24) & 14) | (i13 & 112), e18Var, zy7Var9, zy7Var10, null);
            list2 = list;
            e18Var = e18Var;
            if (list2.isEmpty()) {
                zy7Var11 = zy7Var8;
                e18Var.a0(1444875098);
                e18Var.p(z8);
            } else {
                e18Var.a0(1444636770);
                zy7Var11 = zy7Var8;
                hah.a(list2, zy7Var11, gb9.K(fqbVar, 24.0f, 4.0f), e18Var, ((i10 >> 27) & 14) | 384 | ((i12 << 3) & 112));
                e18Var.p(z8);
            }
            e18Var.p(true);
            pz7Var2 = pz7Var;
            pz7Var2.invoke(e18Var, 6);
            e18Var.p(true);
            iqbVar2 = fqbVar;
        } else {
            z7 = z;
            list2 = list;
            zy7Var11 = zy7Var8;
            bz7Var5 = bz7Var4;
            pz7Var2 = pz7Var;
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            final List list3 = list2;
            final pz7 pz7Var3 = pz7Var2;
            final zy7 zy7Var12 = zy7Var11;
            final boolean z9 = z7;
            final bz7 bz7Var6 = bz7Var5;
            r7eVarS.d = new pz7(str, z9, z2, z3, z4, z5, z6, zy7Var, zy7Var2, zy7Var3, zy7Var4, bz7Var, zy7Var5, zy7Var6, zy7Var7, bz7Var2, ml3Var, skdVar, i2, list3, zy7Var12, bz7Var3, zy7Var9, zy7Var10, bz7Var6, iqbVar2, pz7Var3, i3) { // from class: ea3
                public final /* synthetic */ String E;
                public final /* synthetic */ boolean F;
                public final /* synthetic */ boolean G;
                public final /* synthetic */ boolean H;
                public final /* synthetic */ boolean I;
                public final /* synthetic */ boolean J;
                public final /* synthetic */ boolean K;
                public final /* synthetic */ zy7 L;
                public final /* synthetic */ zy7 M;
                public final /* synthetic */ zy7 N;
                public final /* synthetic */ zy7 O;
                public final /* synthetic */ bz7 P;
                public final /* synthetic */ zy7 Q;
                public final /* synthetic */ zy7 R;
                public final /* synthetic */ zy7 S;
                public final /* synthetic */ bz7 T;
                public final /* synthetic */ ml3 U;
                public final /* synthetic */ skd V;
                public final /* synthetic */ int W;
                public final /* synthetic */ List X;
                public final /* synthetic */ zy7 Y;
                public final /* synthetic */ bz7 Z;
                public final /* synthetic */ zy7 a0;
                public final /* synthetic */ zy7 b0;
                public final /* synthetic */ bz7 c0;
                public final /* synthetic */ iqb d0;
                public final /* synthetic */ pz7 e0;

                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP0 = x44.p0(1);
                    dgj.d(this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, this.T, this.U, this.V, this.W, this.X, this.Y, this.Z, this.a0, this.b0, this.c0, this.d0, this.e0, (ld4) obj, iP0);
                    return iei.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(java.lang.String r24, defpackage.ud0 r25, defpackage.zy7 r26, defpackage.iqb r27, long r28, defpackage.ld4 r30, int r31, int r32) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dgj.e(java.lang.String, ud0, zy7, iqb, long, ld4, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(final defpackage.px9 r29, final defpackage.rf6 r30, final boolean r31, final defpackage.zy7 r32, final defpackage.ag6 r33, final boolean r34, final defpackage.sf6 r35, final defpackage.che r36, final defpackage.pz7 r37, final defpackage.zy7 r38, final defpackage.pz7 r39, defpackage.iqb r40, defpackage.ld4 r41, final int r42) {
        /*
            Method dump skipped, instruction units count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dgj.f(px9, rf6, boolean, zy7, ag6, boolean, sf6, che, pz7, zy7, pz7, iqb, ld4, int):void");
    }

    public static final void g(pf6 pf6Var, List list, bz7 bz7Var, iqb iqbVar, ld4 ld4Var, int i2) {
        int i3;
        iqb iqbVar2;
        Object next;
        fqb fqbVar;
        String str;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(90626880);
        if ((i2 & 6) == 0) {
            i3 = (e18Var.d(pf6Var.ordinal()) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3 | (e18Var.f(list) ? 32 : 16);
        if ((i2 & 384) == 0) {
            i4 |= e18Var.h(bz7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        int i5 = i4 | 3072;
        if (e18Var.Q(i5 & 1, (i5 & 1171) != 1170)) {
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = mpk.P(Boolean.FALSE);
                e18Var.k0(objN);
            }
            nwb nwbVar = (nwb) objN;
            String strJ0 = d4c.j0(R.string.nav_drawer_item_chats, e18Var);
            boolean zF = ((i5 & 112) == 32) | e18Var.f(strJ0);
            Object objN2 = e18Var.N();
            if (zF || objN2 == lz1Var) {
                d8a d8aVarE = x44.E();
                d8aVarE.add(new cpc(pf6.I, strJ0));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    rf6 rf6Var = (rf6) it.next();
                    pf6 pf6Var2 = rf6Var.a;
                    if (pf6Var2 != pf6.I) {
                        d8aVarE.add(new cpc(pf6Var2, rf6Var.c));
                    }
                }
                objN2 = x44.v(d8aVarE);
                e18Var.k0(objN2);
            }
            List list2 = (List) objN2;
            Iterator it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it2.next();
                    if (((cpc) next).E == pf6Var) {
                        break;
                    }
                }
            }
            cpc cpcVar = (cpc) next;
            String str2 = (cpcVar == null || (str = (String) cpcVar.F) == null) ? strJ0 : str;
            String strJ02 = d4c.j0(R.string.nav_drawer_opens_on_launch, e18Var);
            o5b o5bVarD = dw1.d(lja.G, false);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            fqb fqbVar2 = fqb.E;
            iqb iqbVarE = kxk.E(e18Var, fqbVar2);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            z80 z80Var = cd4.f;
            d4c.i0(e18Var, z80Var, o5bVarD);
            z80 z80Var2 = cd4.e;
            d4c.i0(e18Var, z80Var2, hycVarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z80 z80Var3 = cd4.g;
            d4c.i0(e18Var, z80Var3, numValueOf);
            bx bxVar = cd4.h;
            d4c.h0(e18Var, bxVar);
            z80 z80Var4 = cd4.d;
            d4c.i0(e18Var, z80Var4, iqbVarE);
            ho0 ho0Var = new ho0(6.0f, true, new sz6(1));
            wo1 wo1Var = lja.Q;
            iqb iqbVarC = b.c(fqbVar2, 1.0f);
            Object objN3 = e18Var.N();
            if (objN3 == lz1Var) {
                fqbVar = fqbVar2;
                objN3 = new sy4(16, nwbVar);
                e18Var.k0(objN3);
            } else {
                fqbVar = fqbVar2;
            }
            iqb iqbVarC2 = androidx.compose.foundation.b.c(iqbVarC, false, strJ02, null, null, (zy7) objN3, 13);
            Object objN4 = e18Var.N();
            if (objN4 == lz1Var) {
                objN4 = new qy4(22);
                e18Var.k0(objN4);
            }
            iqb iqbVarK = gb9.K(tjf.b(iqbVarC2, false, (bz7) objN4), 28.0f, 16.0f);
            cxe cxeVarA = axe.a(ho0Var, wo1Var, e18Var, 54);
            int iHashCode2 = Long.hashCode(e18Var.T);
            hyc hycVarL2 = e18Var.l();
            iqb iqbVarE2 = kxk.E(e18Var, iqbVarK);
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, z80Var, cxeVarA);
            d4c.i0(e18Var, z80Var2, hycVarL2);
            ij0.t(iHashCode2, e18Var, z80Var3, e18Var, bxVar);
            d4c.i0(e18Var, z80Var4, iqbVarE2);
            fqb fqbVar3 = fqbVar;
            tjh.b(strJ02, null, gm3.a(e18Var).O, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).g, e18Var, 0, 0, 131066);
            tjh.b(str2, null, gm3.a(e18Var).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).g, e18Var, 0, 0, 131066);
            iv1.b(ud0.B, null, null, ef2.F, gm3.a(e18Var).O, e18Var, 3120, 4);
            e18Var.p(true);
            boolean zBooleanValue = ((Boolean) nwbVar.getValue()).booleanValue();
            Object objN5 = e18Var.N();
            if (objN5 == lz1Var) {
                objN5 = new sy4(17, nwbVar);
                e18Var.k0(objN5);
            }
            j8.b(zBooleanValue, (zy7) objN5, null, 0L, null, null, null, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, fd9.q0(-413822743, new xg4((Object) list2, bz7Var, (Object) nwbVar, 11), e18Var), e18Var, 48, 2044);
            e18Var = e18Var;
            e18Var.p(true);
            iqbVar2 = fqbVar3;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new bg6(pf6Var, list, bz7Var, iqbVar2, i2, 0);
        }
    }

    public static final void h(oge ogeVar, String str, zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i2) {
        iqb iqbVar2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-649421647);
        int i3 = i2 | (e18Var.f(ogeVar) ? 4 : 2) | (e18Var.f(str) ? 32 : 16) | (e18Var.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | 3072;
        if (e18Var.Q(i3 & 1, (i3 & 1171) != 1170)) {
            ud0 ud0Var = ud0.h1;
            String strK0 = d4c.k0(R.string.nav_drawer_reorder_tab_a11y, new Object[]{str}, e18Var);
            long j2 = gm3.a(e18Var).O;
            fqb fqbVar = fqb.E;
            iv1.b(ud0Var, strK0, zmk.l(ogeVar, fqbVar, zy7Var), null, j2, e18Var, 0, 8);
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new mm5(ogeVar, str, zy7Var, iqbVar2, i2, 4);
        }
    }

    public static final void i(pf6 pf6Var, String str, boolean z, pz7 pz7Var, iqb iqbVar, ld4 ld4Var, int i2) {
        pf6 pf6Var2;
        iqb iqbVar2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1933087732);
        int i3 = i2 | (e18Var.d(pf6Var.ordinal()) ? 4 : 2) | (e18Var.f(str) ? 32 : 16) | (e18Var.g(z) ? 256 : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.h(pz7Var) ? 2048 : FreeTypeConstants.FT_LOAD_NO_RECURSE) | 24576;
        int i4 = 1;
        if (e18Var.Q(i3 & 1, (i3 & 9363) != 9362)) {
            boolean z2 = ((i3 & 14) == 4) | ((i3 & 7168) == 2048) | ((i3 & 896) == 256);
            Object objN = e18Var.N();
            if (z2 || objN == jd4.a) {
                pf6Var2 = pf6Var;
                objN = new gk1(pz7Var, pf6Var2, z);
                e18Var.k0(objN);
            } else {
                pf6Var2 = pf6Var;
            }
            ta4 ta4VarQ0 = fd9.q0(-2037641966, new lx3(z, str, i4), e18Var);
            fqb fqbVar = fqb.E;
            ez1.e((zy7) objN, fqbVar, false, null, null, ta4VarQ0, e18Var, 1572912, 60);
            iqbVar2 = fqbVar;
        } else {
            pf6Var2 = pf6Var;
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new bv(i2, 7, pf6Var2, str, pz7Var, iqbVar2, z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object j(defpackage.h9f r9, float r10, defpackage.nb0 r11, defpackage.zn5 r12, defpackage.bz7 r13, defpackage.vp4 r14) {
        /*
            boolean r0 = r14 instanceof defpackage.mcg
            if (r0 == 0) goto L13
            r0 = r14
            mcg r0 = (defpackage.mcg) r0
            int r1 = r0.I
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.I = r1
            goto L18
        L13:
            mcg r0 = new mcg
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.H
            int r1 = r0.I
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2b
            float r10 = r0.E
            aae r9 = r0.G
            nb0 r11 = r0.F
            defpackage.sf5.h0(r14)
            goto L69
        L2b:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r9)
            r9 = 0
            return r9
        L32:
            defpackage.sf5.h0(r14)
            aae r5 = new aae
            r5.<init>()
            java.lang.Object r14 = r11.a()
            java.lang.Number r14 = (java.lang.Number) r14
            float r14 = r14.floatValue()
            r1 = 0
            int r14 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r14 != 0) goto L4b
            r14 = r2
            goto L4c
        L4b:
            r14 = 0
        L4c:
            r14 = r14 ^ r2
            lcg r3 = new lcg
            r8 = 0
            r6 = r9
            r4 = r10
            r7 = r13
            r3.<init>(r4, r5, r6, r7, r8)
            r0.F = r11
            r0.G = r5
            r0.E = r4
            r0.I = r2
            java.lang.Object r9 = defpackage.mpk.n(r11, r12, r14, r3, r0)
            m45 r10 = defpackage.m45.E
            if (r9 != r10) goto L67
            return r10
        L67:
            r10 = r4
            r9 = r5
        L69:
            jb0 r12 = new jb0
            float r9 = r9.E
            float r10 = r10 - r9
            java.lang.Float r9 = new java.lang.Float
            r9.<init>(r10)
            r12.<init>(r9, r11)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dgj.j(h9f, float, nb0, zn5, bz7, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object k(defpackage.h9f r16, float r17, float r18, defpackage.nb0 r19, defpackage.mb0 r20, defpackage.bz7 r21, defpackage.vp4 r22) {
        /*
            r0 = r17
            r1 = r22
            boolean r2 = r1 instanceof defpackage.ncg
            if (r2 == 0) goto L18
            r2 = r1
            ncg r2 = (defpackage.ncg) r2
            int r3 = r2.J
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.J = r3
        L16:
            r8 = r2
            goto L1e
        L18:
            ncg r2 = new ncg
            r2.<init>(r1)
            goto L16
        L1e:
            java.lang.Object r1 = r8.I
            int r2 = r8.J
            r9 = 0
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L36
            float r0 = r8.F
            float r2 = r8.E
            aae r3 = r8.H
            nb0 r4 = r8.G
            defpackage.sf5.h0(r1)
            r1 = r0
            r0 = r2
            goto L8f
        L36:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r0)
            r0 = 0
            return r0
        L3d:
            defpackage.sf5.h0(r1)
            aae r12 = new aae
            r12.<init>()
            java.lang.Object r1 = r19.a()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            java.lang.Float r4 = new java.lang.Float
            r4.<init>(r0)
            java.lang.Object r2 = r19.a()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            int r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r2 != 0) goto L64
            r2 = r3
            goto L65
        L64:
            r2 = 0
        L65:
            r6 = r2 ^ 1
            lcg r10 = new lcg
            r15 = 1
            r13 = r16
            r11 = r18
            r14 = r21
            r10.<init>(r11, r12, r13, r14, r15)
            r2 = r19
            r8.G = r2
            r8.H = r12
            r8.E = r0
            r8.F = r1
            r8.J = r3
            r5 = r20
            r3 = r2
            r7 = r10
            java.lang.Object r2 = defpackage.mpk.o(r3, r4, r5, r6, r7, r8)
            m45 r3 = defpackage.m45.E
            if (r2 != r3) goto L8c
            return r3
        L8c:
            r4 = r19
            r3 = r12
        L8f:
            java.lang.Object r2 = r4.a()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            float r1 = z(r2, r1)
            jb0 r2 = new jb0
            float r3 = r3.E
            float r0 = r0 - r3
            java.lang.Float r3 = new java.lang.Float
            r3.<init>(r0)
            r0 = 29
            nb0 r0 = defpackage.yb5.l(r4, r9, r1, r0)
            r2.<init>(r3, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dgj.k(h9f, float, float, nb0, mb0, bz7, vp4):java.lang.Object");
    }

    public static final ova l(Matcher matcher, int i2, CharSequence charSequence) {
        if (matcher.find(i2)) {
            return new ova(matcher, charSequence);
        }
        return null;
    }

    public static final void m(lb0 lb0Var, h9f h9fVar, bz7 bz7Var, float f2) {
        float fB;
        try {
            fB = h9fVar.b(f2);
        } catch (CancellationException unused) {
            lb0Var.a();
            fB = MTTypesetterKt.kLineSkipLimitMultiplier;
        }
        bz7Var.invoke(Float.valueOf(fB));
        if (Math.abs(f2 - fB) > 0.5f) {
            lb0Var.a();
        }
    }

    public static void n(String str, boolean z) {
        if (z) {
            return;
        }
        sz6.p(str);
    }

    public static void o(boolean z) {
        if (z) {
            return;
        }
        mr9.y();
    }

    public static void p(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static void q(Handler handler) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != handler.getLooper()) {
            String name = looperMyLooper != null ? looperMyLooper.getThread().getName() : "null current looper";
            String name2 = handler.getLooper().getThread().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + String.valueOf(name2).length() + 35 + 1);
            kgh.u(sb, "Must be called on ", name2, " thread, but got ", name);
            e0.h(sb, ".");
        }
    }

    public static void r(String str) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return;
        }
        sz6.j(str);
    }

    public static void s(String str) {
        if (TextUtils.isEmpty(str)) {
            sz6.p("Given String is empty or null");
        }
    }

    public static void t(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            sz6.p(str2);
        }
    }

    public static void u(String str) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return;
        }
        sz6.j(str);
    }

    public static void v(Object obj) {
        if (obj != null) {
            return;
        }
        mr9.h("null reference");
    }

    public static void w(String str, Object obj) {
        if (obj != null) {
            return;
        }
        mr9.h(str);
    }

    public static void x(String str, boolean z) {
        if (z) {
            return;
        }
        sz6.j(str);
    }

    public static void y(boolean z) {
        if (z) {
            return;
        }
        e0.b();
    }

    public static final float z(float f2, float f3) {
        return f3 == MTTypesetterKt.kLineSkipLimitMultiplier ? MTTypesetterKt.kLineSkipLimitMultiplier : (f3 <= MTTypesetterKt.kLineSkipLimitMultiplier ? f2 >= f3 : f2 <= f3) ? f2 : f3;
    }
}
