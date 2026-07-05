package defpackage;

import android.net.NetworkRequest;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlinx.coroutines.internal.DiagnosticCoroutineContextException;
import kotlinx.coroutines.internal.ExceptionSuccessfullyProcessed;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wtk {
    public static final ta4 a = new ta4(-514154163, false, new wb4(24));

    public static final void a(String str, iqb iqbVar, float f, ld4 ld4Var, int i) {
        str.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(649335032);
        int i2 = (e18Var.f(str) ? 4 : 2) | i | (e18Var.f(iqbVar) ? 32 : 16) | 384;
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            xvk.c(null, fd9.q0(392445595, new pt0(str, iqbVar, 16.0f), e18Var), e18Var, 48, 1);
            f = 16.0f;
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pt0(str, iqbVar, f, i);
        }
    }

    public static final void b(int i, ld4 ld4Var) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1257244356);
        if (i == 0 && e18Var.C()) {
            e18Var.T();
        } else {
            Object objN = e18Var.N();
            if (objN == jd4.a) {
                objN = tv8.E;
                e18Var.k0(objN);
            }
            zy7 zy7Var = (zy7) ((jm9) objN);
            e18Var.b0(-1115894518);
            e18Var.b0(1886828752);
            if (!(e18Var.a instanceof gn0)) {
                iuj.A();
                throw null;
            }
            e18Var.Y();
            if (e18Var.S) {
                e18Var.k(new r68(1, zy7Var));
            } else {
                e18Var.n0();
            }
            ij0.w(e18Var, true, false, false);
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new lc4(i, 28);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(defpackage.iqb r24, long r25, long r27, defpackage.qu1 r29, float r30, final defpackage.ta4 r31, defpackage.ld4 r32, final int r33, final int r34) {
        /*
            Method dump skipped, instruction units count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wtk.c(iqb, long, long, qu1, float, ta4, ld4, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final java.lang.String r21, final java.lang.String r22, defpackage.iqb r23, java.lang.String r24, long r25, float r27, defpackage.ld4 r28, final int r29, final int r30) {
        /*
            Method dump skipped, instruction units count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wtk.d(java.lang.String, java.lang.String, iqb, java.lang.String, long, float, ld4, int, int):void");
    }

    public static k5f e(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            bundle = bundle2;
        }
        if (bundle == null) {
            k5f k5fVar = new k5f();
            new LinkedHashMap();
            k5fVar.a = new h80(nm6.E);
            return k5fVar;
        }
        ClassLoader classLoader = k5f.class.getClassLoader();
        classLoader.getClass();
        bundle.setClassLoader(classLoader);
        lqa lqaVar = new lqa(bundle.size());
        for (String str : bundle.keySet()) {
            str.getClass();
            lqaVar.put(str, bundle.get(str));
        }
        lqa lqaVarC = lqaVar.c();
        k5f k5fVar2 = new k5f();
        new LinkedHashMap();
        k5fVar2.a = new h80(lqaVarC);
        return k5fVar2;
    }

    public static k1c f(int[] iArr, int[] iArr2) {
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        for (int i : iArr) {
            try {
                builder.addCapability(i);
            } catch (IllegalArgumentException e) {
                nga ngaVarC = nga.c();
                String str = k1c.b;
                String str2 = k1c.b;
                String strP = vb7.p("Ignoring adding capability '", i, '\'');
                if (ngaVarC.a <= 5) {
                    Log.w(str2, strP, e);
                }
            }
        }
        int[] iArr3 = auj.e;
        for (int i2 = 0; i2 < 3; i2++) {
            int i3 = iArr3[i2];
            if (!mp0.n0(i3, iArr)) {
                try {
                    builder.removeCapability(i3);
                } catch (IllegalArgumentException e2) {
                    nga ngaVarC2 = nga.c();
                    String str3 = k1c.b;
                    String str4 = k1c.b;
                    String strP2 = vb7.p("Ignoring removing default capability '", i3, '\'');
                    if (ngaVarC2.a <= 5) {
                        Log.w(str4, strP2, e2);
                    }
                }
            }
        }
        for (int i4 : iArr2) {
            builder.addTransportType(i4);
        }
        NetworkRequest networkRequestBuild = builder.build();
        networkRequestBuild.getClass();
        return new k1c(networkRequestBuild);
    }

    public static final void g(c45 c45Var, Throwable th) {
        Throwable runtimeException;
        Iterator it = g45.a.iterator();
        while (it.hasNext()) {
            try {
                ((f45) it.next()).x(c45Var, th);
            } catch (ExceptionSuccessfullyProcessed unused) {
                return;
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    mwa.p(runtimeException, th);
                }
                Thread threadCurrentThread = Thread.currentThread();
                try {
                    threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
                } catch (Throwable unused2) {
                }
            }
        }
        try {
            mwa.p(th, new DiagnosticCoroutineContextException(c45Var));
        } catch (Throwable unused3) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        try {
            threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
        } catch (Throwable unused4) {
        }
    }

    public static final boolean h(qk6 qk6Var) {
        if (qk6Var instanceof tk6) {
            return true;
        }
        if (!(qk6Var instanceof zk6)) {
            return false;
        }
        ArrayList arrayList = ((zk6) qk6Var).b;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (h((qk6) it.next())) {
                return true;
            }
        }
        return false;
    }
}
