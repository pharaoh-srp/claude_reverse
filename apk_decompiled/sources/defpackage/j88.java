package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class j88 implements Handler.Callback {
    public static final Status S = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);
    public static final Status T = new Status(4, "The user must be signed in to make this API call.", null, null);
    public static final Object U = new Object();
    public static j88 V;
    public long E;
    public boolean F;
    public ibh G;
    public snj H;
    public final Context I;
    public final f88 J;
    public final cbf K;
    public final AtomicInteger L;
    public final AtomicInteger M;
    public final ConcurrentHashMap N;
    public final ip0 O;
    public final ip0 P;
    public final xnj Q;
    public volatile boolean R;

    public j88(Context context, Looper looper) {
        f88 f88Var = f88.d;
        this.E = 10000L;
        this.F = false;
        this.L = new AtomicInteger(1);
        this.M = new AtomicInteger(0);
        this.N = new ConcurrentHashMap(5, 0.75f, 1);
        this.O = new ip0(0);
        this.P = new ip0(0);
        this.R = true;
        this.I = context;
        xnj xnjVar = new xnj(looper, this);
        Looper.getMainLooper();
        this.Q = xnjVar;
        this.J = f88Var;
        this.K = new cbf(23);
        PackageManager packageManager = context.getPackageManager();
        if (nai.C == null) {
            nai.C = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (nai.C.booleanValue()) {
            this.R = false;
        }
        xnjVar.sendMessage(xnjVar.obtainMessage(6));
    }

    public static void a() {
        synchronized (U) {
            try {
                j88 j88Var = V;
                if (j88Var != null) {
                    j88Var.M.incrementAndGet();
                    xnj xnjVar = j88Var.Q;
                    xnjVar.sendMessageAtFrontOfQueue(xnjVar.obtainMessage(10));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Status d(gf0 gf0Var, hh4 hh4Var) {
        return new Status(17, ij0.k("API: ", (String) gf0Var.b.G, " is not available on this device. Connection failed with: ", String.valueOf(hh4Var)), hh4Var.G, hh4Var);
    }

    public static j88 g(Context context) {
        j88 j88Var;
        HandlerThread handlerThread;
        synchronized (U) {
            if (V == null) {
                synchronized (o2l.g) {
                    try {
                        handlerThread = o2l.i;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            o2l.i = handlerThread2;
                            handlerThread2.start();
                            handlerThread = o2l.i;
                        }
                    } finally {
                    }
                }
                Looper looper = handlerThread.getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = f88.c;
                V = new j88(applicationContext, looper);
            }
            j88Var = V;
        }
        return j88Var;
    }

    public final boolean b() {
        if (this.F) {
            return false;
        }
        jve jveVarQ = ive.r().q();
        if (jveVarQ != null && !jveVarQ.l0()) {
            return false;
        }
        int i = ((SparseIntArray) this.K.F).get(203400000, -1);
        return i == -1 || i == 0;
    }

    public final boolean c(hh4 hh4Var, int i) {
        f88 f88Var = this.J;
        f88Var.getClass();
        Context context = this.I;
        if (!oq5.J(context)) {
            int i2 = hh4Var.F;
            PendingIntent pendingIntentM = hh4Var.G;
            if (!((i2 == 0 || pendingIntentM == null) ? false : true)) {
                pendingIntentM = null;
                Intent intentB = f88Var.b(i2, context, null);
                if (intentB != null) {
                    pendingIntentM = ysj.m(context, intentB);
                }
            }
            if (pendingIntentM != null) {
                f88Var.h(context, i2, PendingIntent.getActivity(context, 0, GoogleApiActivity.a(context, pendingIntentM, i, true), unj.a | 134217728));
                return true;
            }
        }
        return false;
    }

    public final kmj e(e88 e88Var) {
        gf0 gf0Var = e88Var.e;
        ConcurrentHashMap concurrentHashMap = this.N;
        kmj kmjVar = (kmj) concurrentHashMap.get(gf0Var);
        if (kmjVar == null) {
            kmjVar = new kmj(this, e88Var);
            concurrentHashMap.put(gf0Var, kmjVar);
        }
        if (kmjVar.j.l()) {
            this.P.add(gf0Var);
        }
        kmjVar.m();
        return kmjVar;
    }

    public final void f(j5h j5hVar, int i, e88 e88Var) {
        smj smjVarA;
        if (i == 0 || (smjVarA = smj.a(this, i, e88Var.e)) == null) {
            return;
        }
        r5l r5lVar = j5hVar.a;
        xnj xnjVar = this.Q;
        xnjVar.getClass();
        r5lVar.i(new fq1(xnjVar, 3), smjVarA);
    }

    public final void h(hh4 hh4Var, int i) {
        if (c(hh4Var, i)) {
            return;
        }
        xnj xnjVar = this.Q;
        xnjVar.sendMessage(xnjVar.obtainMessage(5, i, 0, hh4Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:160:0x0328  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handleMessage(android.os.Message r13) {
        /*
            Method dump skipped, instruction units count: 1100
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j88.handleMessage(android.os.Message):boolean");
    }
}
