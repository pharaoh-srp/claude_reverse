package defpackage;

import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.agog.mathdisplay.render.MTTypesetterKt;
import io.sentry.android.core.l;
import io.sentry.b6;
import io.sentry.c5;
import io.sentry.c6;
import io.sentry.d;
import io.sentry.h5;
import io.sentry.internal.debugmeta.c;
import io.sentry.metrics.a;
import io.sentry.n5;
import io.sentry.t5;
import io.sentry.transport.o;
import io.sentry.v;
import io.sentry.w6;
import io.sentry.y4;
import java.io.File;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class rl implements wjb, jhd, dc0, mc0, h99, a {
    public Object E;
    public Object F;
    public Object G;
    public Object H;
    public Object I;
    public Object J;

    public rl(String str, String str2, Set set) {
        Set setUnmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.F = setUnmodifiableSet;
        Map map = Collections.EMPTY_MAP;
        this.E = str;
        this.H = str2;
        this.I = k6g.E;
        HashSet hashSet = new HashSet(setUnmodifiableSet);
        Iterator it = map.values().iterator();
        if (!it.hasNext()) {
            this.G = Collections.unmodifiableSet(hashSet);
        } else {
            it.next().getClass();
            mr9.o();
            throw null;
        }
    }

    public static /* synthetic */ List A(rl rlVar, a0 a0Var, hab habVar, Boolean bool, boolean z, int i) {
        boolean z2 = (i & 4) == 0;
        if ((i & 16) != 0) {
            bool = null;
        }
        return rlVar.z(a0Var, habVar, z2, false, bool, (i & 32) != 0 ? false : z);
    }

    public static hab C(b3 b3Var, txb txbVar, cbi cbiVar, int i, boolean z) {
        b3Var.getClass();
        txbVar.getClass();
        sq6.a(i);
        if (b3Var instanceof gsd) {
            oc7 oc7Var = fl9.a;
            ik9 ik9VarA = fl9.a((gsd) b3Var, txbVar, cbiVar);
            if (ik9VarA != null) {
                return aqk.f(ik9VarA);
            }
        } else if (b3Var instanceof usd) {
            oc7 oc7Var2 = fl9.a;
            ik9 ik9VarC = fl9.c((usd) b3Var, txbVar, cbiVar);
            if (ik9VarC != null) {
                return aqk.f(ik9VarC);
            }
        } else if (b3Var instanceof ctd) {
            t28 t28Var = el9.d;
            t28Var.getClass();
            yk9 yk9Var = (yk9) uik.i((r28) b3Var, t28Var);
            if (yk9Var != null) {
                int iF = sq6.F(i);
                if (iF == 1) {
                    return hjk.b((ctd) b3Var, txbVar, cbiVar, true, true, z);
                }
                if (iF == 2) {
                    if ((yk9Var.F & 4) != 4) {
                        return null;
                    }
                    wk9 wk9Var = yk9Var.I;
                    wk9Var.getClass();
                    return aqk.g(txbVar, wk9Var);
                }
                if (iF != 3 || (yk9Var.F & 8) != 8) {
                    return null;
                }
                wk9 wk9Var2 = yk9Var.J;
                wk9Var2.getClass();
                return aqk.g(txbVar, wk9Var2);
            }
        }
        return null;
    }

    public static Long Q(File file, h99 h99Var) {
        String name = file.getName();
        name.getClass();
        Long lT0 = isg.t0(name);
        if (lT0 == null) {
            dch.H(h99Var, 5, g99.F, new fh1(file, 1), null, false, 56);
        }
        return lT0;
    }

    public static String R(File file) {
        String str;
        Locale locale;
        File parentFile = file.getParentFile();
        String name = parentFile != null ? parentFile.getName() : null;
        if (name != null) {
            if (cg7.M.f(name)) {
                str = "PENDING";
                locale = Locale.US;
            } else if (cg7.L.f(name)) {
                str = "GRANTED";
                locale = Locale.US;
            }
            return ij0.n(locale, str, locale);
        }
        return null;
    }

    public static boolean S(float f) {
        q28 q28Var = new q28(f);
        float fFloatValue = q28Var.s().floatValue();
        if (fFloatValue == MTTypesetterKt.kLineSkipLimitMultiplier) {
            return false;
        }
        return fFloatValue == 100.0f || ((SecureRandom) ((u0h) q28Var.G).getValue()).nextFloat() * 100.0f <= fFloatValue;
    }

    public static int W(int i) {
        int iF = sq6.F(i);
        if (iF == 0) {
            return 2;
        }
        if (iF == 1) {
            return 3;
        }
        if (iF == 2) {
            return 4;
        }
        if (iF == 3) {
            return 5;
        }
        if (iF == 4) {
            return 6;
        }
        mr9.b();
        return 0;
    }

    public void B() {
        ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) this.H;
        ArrayList arrayList = new ArrayList(1000);
        do {
            b6 b6Var = (b6) concurrentLinkedQueue.poll();
            if (b6Var != null) {
                arrayList.add(b6Var);
            }
            if (concurrentLinkedQueue.isEmpty()) {
                break;
            }
        } while (arrayList.size() < 1000);
        if (arrayList.isEmpty()) {
            return;
        }
        y4 y4Var = (y4) this.G;
        c6 c6Var = new c6(arrayList);
        w6 w6Var = (w6) y4Var.b;
        try {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(h5.f(w6Var.getSerializer(), c6Var));
            y4Var.s(new c(new c5(null, w6Var.getSdkVersion(), null), arrayList2), null);
        } catch (IOException e) {
            w6Var.getLogger().b(t5.WARNING, e, "Capturing metrics failed.", new Object[0]);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            o oVar = (o) ((d) this.J).E;
            int i2 = o.E;
            oVar.releaseShared(1);
        }
    }

    public void D(long j, long j2, ArrayList arrayList) {
        arrayList.getClass();
        synchronized (((ArrayList) this.G)) {
            arrayList.clear();
            l(j, j2, arrayList, (ArrayList) this.F);
            l(j, j2, arrayList, (ArrayList) this.G);
        }
    }

    public bce E(a0 a0Var, boolean z, boolean z2, Boolean bool, boolean z3) {
        cud cudVar;
        dsd dsdVar;
        gmf gmfVar = (gmf) this.F;
        a0Var.getClass();
        neg negVar = (neg) a0Var.H;
        dsd dsdVar2 = dsd.INTERFACE;
        if (z) {
            if (bool == null) {
                throw new IllegalStateException(("isConst should not be null for property (container=" + a0Var + ')').toString());
            }
            if (a0Var instanceof cud) {
                cud cudVar2 = (cud) a0Var;
                if (cudVar2.L == dsdVar2) {
                    return mwa.y(gmfVar, cudVar2.K.d(sxb.e("DefaultImpls")), (jk9) this.J);
                }
            }
            if (bool.booleanValue() && (a0Var instanceof dud)) {
                lk9 lk9Var = negVar instanceof lk9 ? (lk9) negVar : null;
                zj9 zj9VarB = lk9Var != null ? lk9Var.b() : null;
                if (zj9VarB != null) {
                    String strE = zj9VarB.e();
                    strE.getClass();
                    String strReplace = strE.replace('/', '.');
                    strReplace.getClass();
                    return mwa.y(gmfVar, gh3.j(new ww7(strReplace)), (jk9) this.J);
                }
            }
        }
        if (z2 && (a0Var instanceof cud)) {
            cud cudVar3 = (cud) a0Var;
            if (cudVar3.L == dsd.COMPANION_OBJECT && (cudVar = cudVar3.J) != null && ((dsdVar = cudVar.L) == dsd.CLASS || dsdVar == dsd.ENUM_CLASS || (z3 && (dsdVar == dsdVar2 || dsdVar == dsd.ANNOTATION_CLASS)))) {
                neg negVar2 = (neg) cudVar.H;
                vr9 vr9Var = negVar2 instanceof vr9 ? (vr9) negVar2 : null;
                if (vr9Var != null) {
                    return vr9Var.E;
                }
                return null;
            }
        }
        if (!(a0Var instanceof dud) || !(negVar instanceof lk9)) {
            return null;
        }
        lk9 lk9Var2 = (lk9) negVar;
        bce bceVarC = lk9Var2.c();
        return bceVarC == null ? mwa.y(gmfVar, lk9Var2.a(), (jk9) this.J) : bceVarC;
    }

    public gxc F(long j, dmg dmgVar) {
        synchronized (((ArrayList) this.J)) {
            if (((ArrayList) this.J).isEmpty()) {
                gxc gxcVar = new gxc();
                gxcVar.a = j;
                gxcVar.b = -1L;
                gxcVar.c = dmgVar;
                return gxcVar;
            }
            gxc gxcVar2 = (gxc) ((ArrayList) this.J).remove(0);
            gxcVar2.a = j;
            gxcVar2.b = -1L;
            gxcVar2.c = dmgVar;
            return gxcVar2;
        }
    }

    public boolean G(gh3 gh3Var) {
        bce bceVarY;
        gh3Var.getClass();
        return gh3Var.f() != null && x44.r(gh3Var.i().b(), "Container") && (bceVarY = mwa.y((gmf) this.F, gh3Var, (jk9) this.J)) != null && xgg.b(bceVarY);
    }

    public hi6 H(gh3 gh3Var, neg negVar, List list) {
        list.getClass();
        return new hi6(this, kxk.v((uqb) this.H, gh3Var, (dpf) this.I), gh3Var, list, negVar);
    }

    public hi6 I(gh3 gh3Var, xae xaeVar, List list) {
        list.getClass();
        if (xgg.a().contains(gh3Var)) {
            return null;
        }
        return H(gh3Var, xaeVar, list);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object J(defpackage.a0 r9, defpackage.ctd r10, int r11, defpackage.yr9 r12, defpackage.pz7 r13) {
        /*
            r8 = this;
            in7 r0 = defpackage.on7.A
            int r1 = r10.H
            java.lang.Boolean r6 = r0.e(r1)
            boolean r7 = defpackage.fl9.d(r10)
            r4 = 1
            r5 = 1
            r2 = r8
            r3 = r9
            bce r8 = r2.E(r3, r4, r5, r6, r7)
            r9 = 0
            if (r8 != 0) goto L30
            boolean r8 = r3 instanceof defpackage.cud
            if (r8 == 0) goto L2f
            r8 = r3
            cud r8 = (defpackage.cud) r8
            java.lang.Object r8 = r8.H
            neg r8 = (defpackage.neg) r8
            boolean r0 = r8 instanceof defpackage.vr9
            if (r0 == 0) goto L29
            vr9 r8 = (defpackage.vr9) r8
            goto L2a
        L29:
            r8 = r9
        L2a:
            if (r8 == 0) goto L2f
            bce r8 = r8.E
            goto L30
        L2f:
            r8 = r9
        L30:
            if (r8 != 0) goto L33
            goto L65
        L33:
            z81 r0 = r8.b
            java.lang.Object r0 = r0.e
            jk9 r0 = (defpackage.jk9) r0
            jk9 r1 = defpackage.f16.e
            r1.getClass()
            int r4 = r1.b
            int r5 = r1.c
            int r1 = r1.d
            boolean r0 = r0.a(r4, r5, r1)
            java.lang.Object r1 = r3.F
            txb r1 = (defpackage.txb) r1
            java.lang.Object r3 = r3.G
            cbi r3 = (defpackage.cbi) r3
            hab r10 = C(r10, r1, r3, r11, r0)
            if (r10 != 0) goto L57
            goto L65
        L57:
            java.lang.Object r11 = r2.G
            afa r11 = (defpackage.afa) r11
            java.lang.Object r8 = r11.invoke(r8)
            java.lang.Object r8 = r13.invoke(r8, r10)
            if (r8 != 0) goto L66
        L65:
            return r9
        L66:
            boolean r9 = defpackage.dhi.c(r12)
            if (r9 == 0) goto Lc6
            il4 r8 = (defpackage.il4) r8
            boolean r9 = r8 instanceof defpackage.m22
            if (r9 == 0) goto L84
            kci r9 = new kci
            m22 r8 = (defpackage.m22) r8
            java.lang.Object r8 = r8.b()
            java.lang.Number r8 = (java.lang.Number) r8
            byte r8 = r8.byteValue()
            r9.<init>(r8)
            return r9
        L84:
            boolean r9 = r8 instanceof defpackage.i5g
            if (r9 == 0) goto L9a
            kci r9 = new kci
            i5g r8 = (defpackage.i5g) r8
            java.lang.Object r8 = r8.b()
            java.lang.Number r8 = (java.lang.Number) r8
            short r8 = r8.shortValue()
            r9.<init>(r8)
            return r9
        L9a:
            boolean r9 = r8 instanceof defpackage.i79
            if (r9 == 0) goto Lb0
            kci r9 = new kci
            i79 r8 = (defpackage.i79) r8
            java.lang.Object r8 = r8.b()
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            r9.<init>(r8)
            return r9
        Lb0:
            boolean r9 = r8 instanceof defpackage.ama
            if (r9 == 0) goto Lc6
            kci r9 = new kci
            ama r8 = (defpackage.ama) r8
            java.lang.Object r8 = r8.b()
            java.lang.Number r8 = (java.lang.Number) r8
            long r10 = r8.longValue()
            r9.<init>(r10)
            return r9
        Lc6:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rl.J(a0, ctd, int, yr9, pz7):java.lang.Object");
    }

    public List K(a0 a0Var, ctd ctdVar, int i) {
        cbi cbiVar = (cbi) a0Var.G;
        Boolean boolE = on7.A.e(ctdVar.H);
        boolean zD = fl9.d(ctdVar);
        txb txbVar = (txb) a0Var.F;
        if (i == 1) {
            hab habVarB = hjk.b(ctdVar, txbVar, cbiVar, (40 & 8) == 0, (40 & 16) == 0, true);
            if (habVarB != null) {
                return A(this, a0Var, habVarB, boolE, zD, 8);
            }
        } else {
            hab habVarB2 = hjk.b(ctdVar, txbVar, cbiVar, (40 & 8) == 0, (40 & 16) == 0, true);
            if (habVarB2 != null) {
                if (bsg.u0(habVarB2.a(), "$delegate", false) == (i == 3)) {
                    return z(a0Var, habVarB2, true, true, boolE, zD);
                }
            }
        }
        return lm6.E;
    }

    public void L(int i, g99 g99Var, zy7 zy7Var, Throwable th, boolean z, Map map) {
        gbf feature;
        sq6.a(i);
        g99Var.getClass();
        zy7Var.getClass();
        int iOrdinal = g99Var.ordinal();
        if (iOrdinal == 0) {
            T((lja) this.G, i, zy7Var, th, z, (LinkedHashSet) this.I);
            return;
        }
        if (iOrdinal == 1) {
            lja ljaVar = (lja) this.H;
            if (ljaVar != null) {
                T(ljaVar, i, zy7Var, th, z, (LinkedHashSet) this.E);
                return;
            }
            return;
        }
        if (iOrdinal != 2) {
            return;
        }
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.J;
        k99 k99Var = (k99) this.F;
        if (k99Var == null || (feature = k99Var.getFeature("rum")) == null) {
            return;
        }
        String str = (String) zy7Var.a();
        if (z) {
            if (linkedHashSet.contains(str)) {
                return;
            } else {
                linkedHashSet.add(str);
            }
        }
        feature.a((i == 5 || i == 4 || th != null) ? new ga9(str, map, th) : new fa9(str, map));
    }

    public void M(int i, List list, zy7 zy7Var, Throwable th, boolean z, Map map) {
        sq6.a(i);
        list.getClass();
        zy7Var.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            L(i, (g99) it.next(), zy7Var, th, z, map);
        }
    }

    public void N(zy7 zy7Var, Map map, float f, Float f2) {
        gbf feature;
        k99 k99Var = (k99) this.F;
        qj5 qj5Var = k99Var instanceof qj5 ? (qj5) k99Var : null;
        if (qj5Var != null) {
            qj5Var.C();
        }
        if (!S(f) || k99Var == null || (feature = k99Var.getFeature("rum")) == null) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        sq6.a(1);
        if (f2 != null) {
            sq6.a(1);
            linkedHashMap.put(vb7.a(1), f2);
        }
        Float fValueOf = Float.valueOf(f);
        sq6.a(2);
        linkedHashMap.put(vb7.a(2), fValueOf);
        feature.a(new ia9((String) zy7Var.a(), linkedHashMap));
    }

    public void O(long j, String str, ArrayList arrayList) {
        synchronized (((ArrayList) this.G)) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                gxc gxcVar = (gxc) arrayList.get(i);
                if (x44.r(gxcVar.c.a, str) && gxcVar.b < 0) {
                    gxcVar.b = j;
                }
            }
        }
    }

    public void P(boolean z) {
        v vVarA = ((io.sentry.util.a) this.E).a();
        try {
            try {
                ((n5) this.I).c(new l(9, this), z ? 0 : 5000);
            } catch (RejectedExecutionException e) {
                ((w6) this.F).getLogger().d(t5.WARNING, "Metrics batch processor flush task rejected", e);
            }
            vVarA.close();
        } catch (Throwable th) {
            try {
                vVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public void T(lja ljaVar, int i, zy7 zy7Var, Throwable th, boolean z, LinkedHashSet linkedHashSet) {
        int iW = W(i);
        ljaVar.getClass();
        if (iW >= kj5.c) {
            String strK = (String) zy7Var.a();
            k99 k99Var = (k99) this.F;
            String name = k99Var != null ? k99Var.getName() : null;
            if (name != null) {
                strK = ij0.k("[", name, "]: ", strK);
            }
            if (z) {
                if (linkedHashSet.contains(strK)) {
                    return;
                } else {
                    linkedHashSet.add(strK);
                }
            }
            int iW2 = W(i);
            strK.getClass();
            if (iW2 >= kj5.c) {
                Log.println(iW2, "Datadog", strK);
                if (th != null) {
                    Log.println(iW2, "Datadog", Log.getStackTraceString(th));
                }
            }
        }
    }

    public void U(String str, String str2, Bundle bundle) {
        int i;
        String str3;
        String strEncodeToString;
        boolean zE;
        int i2;
        PackageInfo packageInfoD;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        pl7 pl7Var = (pl7) this.F;
        pl7Var.a();
        bundle.putString("gmp_app_id", pl7Var.c.b);
        hjb hjbVar = (hjb) this.G;
        synchronized (hjbVar) {
            try {
                if (hjbVar.a == 0 && (packageInfoD = hjbVar.d("com.google.android.gms")) != null) {
                    hjbVar.a = packageInfoD.versionCode;
                }
                i = hjbVar.a;
            } finally {
            }
        }
        bundle.putString("gmsv", Integer.toString(i));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", ((hjb) this.G).b());
        hjb hjbVar2 = (hjb) this.G;
        synchronized (hjbVar2) {
            try {
                if (((String) hjbVar2.e) == null) {
                    hjbVar2.f();
                }
                str3 = (String) hjbVar2.e;
            } finally {
            }
        }
        bundle.putString("app_ver_name", str3);
        pl7 pl7Var2 = (pl7) this.F;
        pl7Var2.a();
        try {
            strEncodeToString = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(pl7Var2.b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            strEncodeToString = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", strEncodeToString);
        try {
            String str4 = ((s81) ez1.r(((xl7) ((yl7) this.J)).d())).a;
            if (TextUtils.isEmpty(str4)) {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", str4);
            }
        } catch (InterruptedException e) {
            e = e;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        } catch (ExecutionException e2) {
            e = e2;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        }
        bundle.putString("appid", (String) ez1.r(((xl7) ((yl7) this.J)).c()));
        bundle.putString("cliv", "fcm-24.0.1");
        sl8 sl8Var = (sl8) ((jvd) this.E).get();
        pv5 pv5Var = (pv5) ((jvd) this.I).get();
        if (sl8Var == null || pv5Var == null) {
            return;
        }
        or5 or5Var = (or5) sl8Var;
        synchronized (or5Var) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            efe efeVar = (efe) or5Var.a.get();
            synchronized (efeVar) {
                zE = efeVar.E(jCurrentTimeMillis);
            }
            if (zE) {
                synchronized (efeVar) {
                    String strT = efeVar.t(System.currentTimeMillis());
                    ((SharedPreferences) efeVar.F).edit().putString("last-used-date", strT).commit();
                    efeVar.z(strT);
                }
                i2 = 3;
            } else {
                i2 = 1;
            }
        }
        if (i2 != 1) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(sq6.F(i2)));
            bundle.putString("Firebase-Client", pv5Var.a());
        }
    }

    public r5l V(String str, String str2, Bundle bundle) {
        try {
            U(str, str2, bundle);
            gxe gxeVar = (gxe) this.H;
            z46 z46Var = z46.G;
            gp1 gp1Var = gxeVar.c;
            return gp1Var.c() < 12000000 ? gp1Var.d() != 0 ? gxeVar.a(bundle).k(z46Var, new ire(gxeVar, 16, bundle)) : ez1.D(new IOException("MISSING_INSTANCEID_SERVICE")) : o5l.j(gxeVar.b).m(1, bundle).j(z46Var, hj6.W);
        } catch (InterruptedException | ExecutionException e) {
            return ez1.D(e);
        }
    }

    public void a(boolean z) {
        n5 n5Var = (n5) this.I;
        if (z) {
            P(true);
            n5Var.submit(new pya(28, this));
        } else {
            n5Var.a(((w6) this.F).getShutdownTimeoutMillis());
            while (!((ConcurrentLinkedQueue) this.H).isEmpty()) {
                B();
            }
        }
    }

    @Override // io.sentry.metrics.a
    public void b(long j) {
        P(true);
        try {
            ((o) ((d) this.J).E).tryAcquireSharedNanos(1, TimeUnit.MILLISECONDS.toNanos(j));
        } catch (InterruptedException e) {
            ((w6) this.F).getLogger().d(t5.ERROR, "Failed to flush metrics events", e);
            Thread.currentThread().interrupt();
        }
    }

    @Override // defpackage.mc0
    public List c(a0 a0Var, b3 b3Var, int i) {
        b3Var.getClass();
        sq6.a(i);
        hab habVarC = C(b3Var, (txb) a0Var.F, (cbi) a0Var.G, i, false);
        return habVarC != null ? A(this, a0Var, aqk.h(habVarC, 0), null, false, 60) : lm6.E;
    }

    @Override // defpackage.jhd
    public void d() {
        ((AtomicBoolean) this.J).set(true);
    }

    @Override // defpackage.mc0
    public List e(a0 a0Var, psd psdVar) {
        a0Var.getClass();
        return A(this, a0Var, aqk.d(((txb) a0Var.F).getString(psdVar.H), kh3.b(((cud) a0Var).K.c())), null, false, 60);
    }

    @Override // defpackage.wjb
    public void f(File file, xg1 xg1Var) {
        h99 h99Var = (h99) this.H;
        file.getClass();
        String str = (String) this.E;
        if (str == null || !fd9.T(file, h99Var)) {
            return;
        }
        Long lQ = Q(file, h99Var);
        Map mapH0 = null;
        if (lQ != null) {
            long jB = xg1Var.b() - lQ.longValue();
            if (jB >= 0) {
                mapH0 = sta.h0(new cpc("track", str), new cpc("metric_type", "batch closed"), new cpc("batch_duration", Long.valueOf(jB)), new cpc("uploader_window", Long.valueOf(((xi7) this.G).a)), new cpc("batch_size", Long.valueOf(fd9.i0(file, h99Var))), new cpc("batch_events_count", Long.valueOf(xg1Var.a())), new cpc("consent", R(file)), new cpc("filename", file.getName()), new cpc("thread", Thread.currentThread().getName()));
            }
        }
        if (mapH0 != null) {
            ((rl) h99Var).N(n.S, mapH0, 1.5f, null);
        }
    }

    @Override // defpackage.jhd
    public void g() {
    }

    @Override // defpackage.jhd
    public void h() {
        ((AtomicBoolean) this.J).set(false);
    }

    @Override // defpackage.mc0
    public ArrayList j(ntd ntdVar, txb txbVar) {
        ntdVar.getClass();
        txbVar.getClass();
        Object objK = ntdVar.k(el9.f);
        objK.getClass();
        Iterable<bsd> iterable = (Iterable) objK;
        ArrayList arrayList = new ArrayList(x44.y(iterable, 10));
        for (bsd bsdVar : iterable) {
            bsdVar.getClass();
            arrayList.add(((nyj) this.E).F(bsdVar, txbVar));
        }
        return arrayList;
    }

    @Override // defpackage.jhd
    public void k() {
    }

    public void l(long j, long j2, List list, ArrayList arrayList) {
        ArrayList arrayList2;
        int size = arrayList.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                gxc gxcVar = (gxc) arrayList.get(size);
                long j3 = gxcVar.b;
                if (j3 > 0 && j3 < j) {
                    gxc gxcVar2 = (gxc) arrayList.remove(size);
                    gxcVar2.getClass();
                    synchronized (((ArrayList) this.J)) {
                        try {
                            ((ArrayList) this.J).add(gxcVar2);
                        } catch (OutOfMemoryError unused) {
                            ((ArrayList) this.J).clear();
                            ((ArrayList) this.J).add(gxcVar2);
                        }
                    }
                } else if (gxcVar.a < j2) {
                    ((ArrayList) this.H).add(gxcVar);
                    if (arrayList.equals((ArrayList) this.G) && gxcVar.b == -1) {
                        gxcVar.b = j;
                    }
                }
                if (i < 0) {
                    break;
                } else {
                    size = i;
                }
            }
        }
        if (((ArrayList) this.H).size() <= 0) {
            return;
        }
        int size2 = ((ArrayList) this.H).size();
        int i2 = 0;
        for (int i3 = 0; i3 < size2; i3++) {
            if (((ArrayList) this.E).contains(Integer.valueOf(i3))) {
                ((ArrayList) this.I).add(Integer.valueOf(i3));
            } else {
                gxc gxcVar3 = (gxc) ((ArrayList) this.H).get(i3);
                int i4 = i3 + 1;
                int size3 = ((ArrayList) this.H).size();
                while (true) {
                    if (i4 < size3) {
                        gxc gxcVar4 = (gxc) ((ArrayList) this.H).get(i4);
                        if (x44.r(gxcVar3.c.a, gxcVar4.c.a)) {
                            if (gxcVar3.a < gxcVar4.a) {
                                ((ArrayList) this.I).add(Integer.valueOf(i3));
                                break;
                            }
                            ((ArrayList) this.E).add(Integer.valueOf(i4));
                        }
                        i4++;
                    }
                }
            }
        }
        int size4 = ((ArrayList) this.I).size();
        while (true) {
            size4--;
            arrayList2 = (ArrayList) this.H;
            if (-1 >= size4) {
                break;
            } else {
                arrayList2.remove(((Number) ((ArrayList) this.I).get(size4)).intValue());
            }
        }
        int size5 = arrayList2.size();
        while (true) {
            ArrayList arrayList3 = (ArrayList) this.H;
            if (i2 >= size5) {
                arrayList3.clear();
                ((ArrayList) this.I).clear();
                ((ArrayList) this.E).clear();
                return;
            }
            list.add(((gxc) arrayList3.get(i2)).c);
            i2++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.mc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List m(defpackage.a0 r7, defpackage.b3 r8, int r9, int r10, defpackage.vtd r11) {
        /*
            r6 = this;
            r8.getClass()
            defpackage.sq6.a(r9)
            java.lang.Object r11 = r7.F
            txb r11 = (defpackage.txb) r11
            java.lang.Object r0 = r7.G
            cbi r0 = (defpackage.cbi) r0
            r1 = 0
            hab r9 = C(r8, r11, r0, r9, r1)
            if (r9 == 0) goto L6d
            boolean r11 = r8 instanceof defpackage.usd
            r0 = 1
            if (r11 == 0) goto L24
            usd r8 = (defpackage.usd) r8
            boolean r8 = defpackage.ajk.j(r8)
            if (r8 == 0) goto L45
        L22:
            r1 = r0
            goto L45
        L24:
            boolean r11 = r8 instanceof defpackage.ctd
            if (r11 == 0) goto L31
            ctd r8 = (defpackage.ctd) r8
            boolean r8 = defpackage.ajk.k(r8)
            if (r8 == 0) goto L45
            goto L22
        L31:
            boolean r11 = r8 instanceof defpackage.gsd
            if (r11 == 0) goto L55
            r8 = r7
            cud r8 = (defpackage.cud) r8
            dsd r11 = r8.L
            dsd r2 = defpackage.dsd.ENUM_CLASS
            if (r11 != r2) goto L40
            r1 = 2
            goto L45
        L40:
            boolean r8 = r8.M
            if (r8 == 0) goto L45
            goto L22
        L45:
            int r10 = r10 + r1
            hab r2 = defpackage.aqk.h(r9, r10)
            r4 = 0
            r5 = 60
            r3 = 0
            r0 = r6
            r1 = r7
            java.util.List r6 = A(r0, r1, r2, r3, r4, r5)
            return r6
        L55:
            java.lang.UnsupportedOperationException r6 = new java.lang.UnsupportedOperationException
            java.lang.Class r7 = r8.getClass()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Unsupported message: "
            r8.<init>(r9)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            r6.<init>(r7)
            throw r6
        L6d:
            lm6 r6 = defpackage.lm6.E
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rl.m(a0, b3, int, int, vtd):java.util.List");
    }

    @Override // defpackage.mc0
    public ArrayList n(std stdVar, txb txbVar) {
        stdVar.getClass();
        txbVar.getClass();
        Object objK = stdVar.k(el9.h);
        objK.getClass();
        Iterable<bsd> iterable = (Iterable) objK;
        ArrayList arrayList = new ArrayList(x44.y(iterable, 10));
        for (bsd bsdVar : iterable) {
            bsdVar.getClass();
            arrayList.add(((nyj) this.E).F(bsdVar, txbVar));
        }
        return arrayList;
    }

    @Override // defpackage.dc0
    public Object o(a0 a0Var, ctd ctdVar, yr9 yr9Var) {
        ctdVar.getClass();
        return J(a0Var, ctdVar, 3, yr9Var, c0.G);
    }

    @Override // defpackage.mc0
    public List p(a0 a0Var, ctd ctdVar) {
        ctdVar.getClass();
        return K(a0Var, ctdVar, 2);
    }

    public void q(String str, String str2) {
        HashMap map = (HashMap) this.J;
        if (map != null) {
            map.put(str, str2);
        } else {
            sz6.j("Property \"autoMetadata\" has not been set");
        }
    }

    @Override // defpackage.wjb
    public void r(File file, mpk mpkVar, int i) {
        h99 h99Var = (h99) this.H;
        file.getClass();
        String str = (String) this.E;
        if (str == null) {
            return;
        }
        di5 di5Var = (di5) this.F;
        Long lQ = Q(file, h99Var);
        Map mapH0 = null;
        if (lQ != null) {
            long jLongValue = lQ.longValue();
            ((iuj) this.I).getClass();
            long jCurrentTimeMillis = System.currentTimeMillis() - jLongValue;
            if (jCurrentTimeMillis >= 0) {
                mapH0 = sta.h0(new cpc("track", str), new cpc("metric_type", "batch deleted"), new cpc("batch_age", Long.valueOf(jCurrentTimeMillis)), new cpc("uploader_delay", sta.h0(new cpc("min", Long.valueOf(di5Var.c)), new cpc("max", Long.valueOf(di5Var.d)))), new cpc("uploader_window", Long.valueOf(((xi7) this.G).a)), new cpc("batch_removal_reason", mpkVar.toString()), new cpc("in_background", Boolean.valueOf(((AtomicBoolean) this.J).get())), new cpc("consent", R(file)), new cpc("filename", file.getName()), new cpc("pending_batches", Integer.valueOf(i)), new cpc("thread", Thread.currentThread().getName()));
            }
        }
        if (mapH0 != null) {
            ((rl) h99Var).N(v00.O, mapH0, 1.5f, null);
        }
    }

    public o81 s() {
        String strConcat = ((String) this.E) == null ? " transportName" : "";
        if (((bn6) this.G) == null) {
            strConcat = strConcat.concat(" encodedPayload");
        }
        if (((Long) this.H) == null) {
            strConcat = strConcat.concat(" eventMillis");
        }
        if (((Long) this.I) == null) {
            strConcat = strConcat.concat(" uptimeMillis");
        }
        if (((HashMap) this.J) == null) {
            strConcat = strConcat.concat(" autoMetadata");
        }
        if (strConcat.isEmpty()) {
            return new o81((String) this.E, (Integer) this.F, (bn6) this.G, ((Long) this.H).longValue(), ((Long) this.I).longValue(), (HashMap) this.J);
        }
        sz6.j("Missing required properties:".concat(strConcat));
        return null;
    }

    public r5l t(r5l r5lVar) {
        return r5lVar.j(new ao0(1), new xh6(this));
    }

    @Override // defpackage.mc0
    public List u(a0 a0Var, ctd ctdVar) {
        ctdVar.getClass();
        return K(a0Var, ctdVar, 3);
    }

    @Override // defpackage.dc0
    public Object v(a0 a0Var, ctd ctdVar, yr9 yr9Var) {
        ctdVar.getClass();
        return J(a0Var, ctdVar, 2, yr9Var, c0.H);
    }

    @Override // defpackage.mc0
    public List w(a0 a0Var, b3 b3Var, int i) {
        b3Var.getClass();
        sq6.a(i);
        if (i == 2) {
            return K(a0Var, (ctd) b3Var, 1);
        }
        hab habVarC = C(b3Var, (txb) a0Var.F, (cbi) a0Var.G, i, false);
        return habVarC == null ? lm6.E : A(this, a0Var, habVarC, null, false, 60);
    }

    @Override // defpackage.mc0
    public ArrayList y(cud cudVar) {
        cudVar.getClass();
        neg negVar = (neg) cudVar.H;
        vr9 vr9Var = negVar instanceof vr9 ? (vr9) negVar : null;
        bce bceVar = vr9Var != null ? vr9Var.E : null;
        if (bceVar == null) {
            sz6.k("Class for loading annotations is not found: ", cudVar.K.b());
            return null;
        }
        ArrayList arrayList = new ArrayList(1);
        Class cls = bceVar.a;
        cls.getClass();
        Annotation[] declaredAnnotations = cls.getDeclaredAnnotations();
        declaredAnnotations.getClass();
        for (Annotation annotation : declaredAnnotations) {
            annotation.getClass();
            Class clsI = ez1.I(ez1.H(annotation));
            hi6 hi6VarI = I(yae.a(clsI), new xae(annotation), arrayList);
            if (hi6VarI != null) {
                yfd.Q(hi6VarI, annotation, clsI);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List z(defpackage.a0 r7, defpackage.hab r8, boolean r9, boolean r10, java.lang.Boolean r11, boolean r12) {
        /*
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            bce r6 = r0.E(r1, r2, r3, r4, r5)
            if (r6 != 0) goto L26
            boolean r6 = r1 instanceof defpackage.cud
            r7 = 0
            if (r6 == 0) goto L25
            r6 = r1
            cud r6 = (defpackage.cud) r6
            java.lang.Object r6 = r6.H
            neg r6 = (defpackage.neg) r6
            boolean r9 = r6 instanceof defpackage.vr9
            if (r9 == 0) goto L1f
            vr9 r6 = (defpackage.vr9) r6
            goto L20
        L1f:
            r6 = r7
        L20:
            if (r6 == 0) goto L25
            bce r6 = r6.E
            goto L26
        L25:
            r6 = r7
        L26:
            if (r6 != 0) goto L29
            goto L41
        L29:
            java.lang.Object r7 = r0.G
            afa r7 = (defpackage.afa) r7
            java.lang.Object r6 = r7.invoke(r6)
            b0 r6 = (defpackage.b0) r6
            java.util.Map r6 = r6.a()
            java.util.HashMap r6 = (java.util.HashMap) r6
            java.lang.Object r6 = r6.get(r8)
            java.util.List r6 = (java.util.List) r6
            if (r6 != 0) goto L43
        L41:
            lm6 r6 = defpackage.lm6.E
        L43:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rl.z(a0, hab, boolean, boolean, java.lang.Boolean, boolean):java.util.List");
    }

    public rl(k99 k99Var) {
        re4 re4Var = re4.d0;
        this.F = k99Var;
        this.G = (lja) re4Var.a();
        this.H = null;
        this.I = new LinkedHashSet();
        this.E = new LinkedHashSet();
        this.J = new LinkedHashSet();
    }

    public rl(w6 w6Var, y4 y4Var) {
        this.E = new io.sentry.util.a();
        this.J = new d(7, false);
        this.F = w6Var;
        this.G = y4Var;
        this.H = new ConcurrentLinkedQueue();
        this.I = new n5(w6Var);
    }
}
