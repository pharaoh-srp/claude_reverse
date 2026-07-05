package defpackage;

import android.content.Context;
import android.content.Intent;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import android.view.ActionMode;
import android.webkit.WebSettings;
import androidx.work.impl.WorkDatabase;
import com.google.firebase.messaging.FirebaseMessagingService;
import io.sentry.android.core.c;
import io.sentry.android.core.h;
import io.sentry.h1;
import io.sentry.ndk.NativeScope;
import io.sentry.t5;
import io.sentry.u3;
import io.sentry.v;
import io.sentry.v3;
import io.sentry.w6;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f60 implements Runnable {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;

    public /* synthetic */ f60(Object obj, Object obj2, Object obj3, int i) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
        this.H = obj3;
    }

    private final void a() {
        boolean z;
        cbf cbfVar = (cbf) this.F;
        hlg hlgVar = (hlg) this.G;
        xhd xhdVar = (xhd) cbfVar.F;
        xhdVar.getClass();
        xfj xfjVar = hlgVar.a;
        String str = xfjVar.a;
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 21;
        tgj tgjVar = (tgj) xhdVar.e.o(new pza(i2, new xw5(xhdVar, arrayList, str, i)));
        if (tgjVar == null) {
            nga.c().f(xhd.l, "Didn't find WorkSpec for id " + xfjVar);
            xhdVar.d.d.execute(new yw5(xhdVar, i2, xfjVar));
            return;
        }
        synchronized (xhdVar.k) {
            try {
                synchronized (xhdVar.k) {
                    z = xhdVar.c(str) != null;
                }
                if (z) {
                    Set set = (Set) xhdVar.h.get(str);
                    if (((hlg) set.iterator().next()).a.b == xfjVar.b) {
                        set.add(hlgVar);
                        nga ngaVarC = nga.c();
                        xfjVar.toString();
                        ngaVarC.getClass();
                    } else {
                        xhdVar.d.d.execute(new yw5(xhdVar, i2, xfjVar));
                    }
                    return;
                }
                if (tgjVar.t != xfjVar.b) {
                    xhdVar.d.d.execute(new yw5(xhdVar, i2, xfjVar));
                    return;
                }
                Context context = xhdVar.b;
                fg4 fg4Var = xhdVar.c;
                ggj ggjVar = xhdVar.d;
                WorkDatabase workDatabase = xhdVar.e;
                context.getClass();
                fg4Var.getClass();
                xhdVar.getClass();
                hi6 hi6Var = new hi6();
                hi6Var.E = fg4Var;
                hi6Var.F = ggjVar;
                hi6Var.G = xhdVar;
                hi6Var.H = workDatabase;
                hi6Var.I = tgjVar;
                hi6Var.J = arrayList;
                Context applicationContext = context.getApplicationContext();
                applicationContext.getClass();
                hi6Var.K = applicationContext;
                qhj qhjVar = new qhj(hi6Var);
                e45 e45Var = qhjVar.d.b;
                mf9 mf9VarG = knk.g();
                e45Var.getClass();
                o92 o92VarM = rwj.m(nai.Z(e45Var, mf9VarG), new ohj(qhjVar, null, i));
                o92VarM.F.a(new f60(xhdVar, o92VarM, qhjVar, 9), xhdVar.d.d);
                xhdVar.g.put(str, qhjVar);
                HashSet hashSet = new HashSet();
                hashSet.add(hlgVar);
                xhdVar.h.put(str, hashSet);
                nga ngaVarC2 = nga.c();
                xfjVar.toString();
                ngaVarC2.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArrArray;
        byte[] bArr;
        h99 h99Var;
        byte[] bArrArray2 = null;
        boolean zBooleanValue = true;
        switch (this.E) {
            case 0:
                g60 g60Var = (g60) this.F;
                d60 d60Var = (d60) this.G;
                e60 e60Var = (e60) this.H;
                ActionMode actionModeStartActionMode = g60Var.a.startActionMode(new hp7(d60Var), 1);
                x44.r(g60Var.h, actionModeStartActionMode);
                if (actionModeStartActionMode == null) {
                    e60Var.close();
                    return;
                }
                return;
            case 1:
                AudioTrack audioTrack = (AudioTrack) this.F;
                Handler handler = (Handler) this.G;
                kba kbaVar = (kba) this.H;
                int i = 5;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new fc(i, kbaVar));
                    }
                    synchronized (g61.q) {
                        try {
                            int i2 = g61.s - 1;
                            g61.s = i2;
                            if (i2 == 0) {
                                ScheduledExecutorService scheduledExecutorService = g61.r;
                                scheduledExecutorService.getClass();
                                scheduledExecutorService.shutdown();
                                g61.r = null;
                            }
                        } finally {
                        }
                        break;
                    }
                    return;
                } catch (Throwable th) {
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new fc(i, kbaVar));
                    }
                    synchronized (g61.q) {
                        try {
                            int i3 = g61.s - 1;
                            g61.s = i3;
                            if (i3 == 0) {
                                ScheduledExecutorService scheduledExecutorService2 = g61.r;
                                scheduledExecutorService2.getClass();
                                scheduledExecutorService2.shutdown();
                                g61.r = null;
                            }
                            throw th;
                        } finally {
                        }
                    }
                }
            case 2:
                dpf dpfVar = (dpf) this.F;
                UUID uuid = (UUID) this.G;
                hj6 hj6Var = (hj6) this.H;
                el5 el5Var = (el5) dpfVar.I;
                g99 g99Var = g99.F;
                File fileA = ((ah5) el5Var.E).a((File) el5Var.G, (String) el5Var.F, "anonymous_id_key");
                byte[] bArrArray3 = ByteBuffer.allocate(4).putInt(0).array();
                bArrArray3.getClass();
                LinkedHashMap linkedHashMap = z1h.F;
                h99 h99Var2 = (h99) el5Var.H;
                h99Var2.getClass();
                h99 h99Var3 = h99Var2;
                if (bArrArray3.length != 0) {
                    int length = bArrArray3.length;
                    int i4 = 6 + length;
                    if (i4 > 10485760) {
                        dch.H(h99Var3, 4, g99Var, new dl5(10485760, i4, 1), null, false, 56);
                        h99Var3 = h99Var3;
                        bArrArray = null;
                    } else {
                        bArrArray = ByteBuffer.allocate(i4).putShort((short) 0).putInt(length).put(bArrArray3).array();
                    }
                } else {
                    bArrArray = null;
                }
                byte[] bytes = hj6Var.o(uuid).getBytes(dj2.a);
                bytes.getClass();
                if (bytes.length == 0) {
                    bArr = bArrArray;
                    h99Var = h99Var3;
                } else {
                    int length2 = bytes.length;
                    int i5 = 6 + length2;
                    if (i5 > 10485760) {
                        byte[] bArr2 = bArrArray;
                        h99Var = h99Var3;
                        bArr = bArr2;
                        dch.H(h99Var, 4, g99Var, new dl5(10485760, i5, 1), null, false, 56);
                    } else {
                        bArr = bArrArray;
                        h99Var = h99Var3;
                        bArrArray2 = ByteBuffer.allocate(i5).putShort((short) 1).putInt(length2).put(bytes).array();
                    }
                }
                if (bArr == null || bArrArray2 == null) {
                    return;
                }
                ((g4d) el5Var.I).h(fileA, nai.Q(x44.X(bArr, bArrArray2), el5.J, h99Var), false);
                return;
            case 3:
                epk epkVar = (epk) this.F;
                h92 h92Var = (h92) this.G;
                oqe oqeVar = (oqe) this.H;
                dq5 dq5Var = (dq5) epkVar.F;
                if (dq5Var.F.isCanceled()) {
                    h92Var.q(dq5Var, new IOException("Canceled"));
                    return;
                } else {
                    h92Var.k(dq5Var, oqeVar);
                    return;
                }
            case 4:
                ((h92) this.G).q((dq5) ((epk) this.F).F, (Throwable) this.H);
                return;
            case 5:
                FirebaseMessagingService firebaseMessagingService = (FirebaseMessagingService) this.F;
                Intent intent = (Intent) this.G;
                j5h j5hVar = (j5h) this.H;
                try {
                    firebaseMessagingService.b(intent);
                    return;
                } finally {
                    j5hVar.b(null);
                }
            case 6:
                rk8 rk8Var = (rk8) this.F;
                String str = (String) this.G;
                qu8 qu8Var = (qu8) this.H;
                rk8Var.i.getSharedPreferences("PermissionTokenManager.healthdata", 0).edit().putString("token", str).commit();
                try {
                    qu8Var.getClass();
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("androidx.health.platform.client.impl.sdkservice.ISetPermissionTokenCallback");
                        qu8Var.i.transact(1, parcelObtain, null, 1);
                        parcelObtain.recycle();
                        return;
                    } catch (Throwable th2) {
                        parcelObtain.recycle();
                        throw th2;
                    }
                } catch (RemoteException e) {
                    Log.e("rk8", "HealthDataSdkService#setPermissionToken failed: " + e.getMessage());
                    return;
                }
            case 7:
                v7b v7bVar = (v7b) this.F;
                hz8 hz8Var = (hz8) this.G;
                z7b z7bVar = (z7b) this.H;
                hp5 hp5Var = v7bVar.c;
                vde vdeVarG = hz8Var.g();
                jud judVar = hp5Var.d;
                v77 v77Var = hp5Var.g;
                v77Var.getClass();
                judVar.getClass();
                judVar.c = nz8.q(vdeVarG);
                if (!vdeVarG.isEmpty()) {
                    judVar.f = (z7b) vdeVarG.get(0);
                    z7bVar.getClass();
                    judVar.g = z7bVar;
                }
                if (((z7b) judVar.e) == null) {
                    judVar.e = jud.h(v77Var, (nz8) judVar.c, (z7b) judVar.f, (jqh) judVar.b);
                }
                judVar.p(v77Var.j());
                return;
            case 8:
                l8b l8bVar = (l8b) this.F;
                Pair pair = (Pair) this.G;
                ((hp5) l8bVar.b.i).c(((Integer) pair.first).intValue(), (z7b) pair.second, (l7b) this.H);
                return;
            case 9:
                xhd xhdVar = (xhd) this.F;
                o92 o92Var = (o92) this.G;
                qhj qhjVar = (qhj) this.H;
                xhdVar.getClass();
                try {
                    zBooleanValue = ((Boolean) o92Var.F.get()).booleanValue();
                    break;
                } catch (InterruptedException | ExecutionException unused) {
                }
                synchronized (xhdVar.k) {
                    try {
                        xfj xfjVarD = amk.d(qhjVar.a);
                        String str2 = xfjVarD.a;
                        if (xhdVar.c(str2) == qhjVar) {
                            xhdVar.b(str2);
                        }
                        nga.c().getClass();
                        Iterator it = xhdVar.j.iterator();
                        while (it.hasNext()) {
                            ((h57) it.next()).b(xfjVarD, zBooleanValue);
                        }
                    } finally {
                    }
                    break;
                }
                return;
            case 10:
                g8j g8jVar = (g8j) this.F;
                mvd mvdVar = (mvd) this.G;
                Context context = (Context) this.H;
                skk.j();
                if (t7j.d.b()) {
                    u7j.a.o(g8jVar, mvdVar);
                    return;
                } else if (t7j.e.b()) {
                    u7j.a.m(g8jVar, new jke(8, mvdVar));
                    return;
                } else {
                    WebSettings.getDefaultUserAgent(context.getApplicationContext());
                    new Handler(Looper.getMainLooper()).post(new pya(12, mvdVar));
                    return;
                }
            case 11:
                a();
                return;
            case 12:
                c cVar = (c) this.F;
                Runnable runnable = (Runnable) this.G;
                String str3 = (String) this.H;
                try {
                    runnable.run();
                    return;
                } catch (Throwable unused2) {
                    if (str3 != null) {
                        cVar.b.getLogger().h(t5.WARNING, "Failed to execute ".concat(str3), new Object[0]);
                        return;
                    }
                    return;
                }
            case 13:
                h hVar = (h) this.F;
                w6 w6Var = (w6) this.G;
                h1 h1Var = (h1) this.H;
                ArrayList<u3> arrayList = hVar.Q;
                if (hVar.T.get()) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                v vVarA = hVar.a0.a();
                try {
                    for (u3 u3Var : arrayList) {
                        arrayList2.add(new v3(u3Var.a, u3Var.b, u3Var.d, u3Var.c, Double.valueOf(u3Var.e), u3Var.f, w6Var));
                    }
                    arrayList.clear();
                    vVarA.close();
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        h1Var.n((v3) it2.next());
                    }
                    return;
                } catch (Throwable th3) {
                    try {
                        vVarA.close();
                        throw th3;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                        throw th3;
                    }
                }
            default:
                io.sentry.android.ndk.c cVar2 = (io.sentry.android.ndk.c) this.F;
                String str4 = (String) this.G;
                String str5 = (String) this.H;
                cVar2.b.getClass();
                NativeScope.nativeSetExtra(str4, str5);
                return;
        }
    }
}
