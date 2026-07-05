package defpackage;

import android.app.Application;
import android.content.ComponentName;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import androidx.health.platform.client.proto.g;
import com.anthropic.claude.wear.PhoneWearableListenerService;
import com.google.android.gms.common.data.DataHolder;
import com.google.common.util.concurrent.a;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class t08 implements Runnable {
    public final /* synthetic */ int E;
    public final Object F;
    public final Object G;

    public t08(zqj zqjVar, hlk hlkVar) {
        this.E = 20;
        this.F = hlkVar;
        Objects.requireNonNull(zqjVar);
        this.G = zqjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tcb tcbVar;
        int i = 0;
        Throwable th = null;
        switch (this.E) {
            case 0:
                s08 s08Var = (s08) this.G;
                Future future = (Future) this.F;
                if (future instanceof w1) {
                    w1 w1Var = (w1) future;
                    if (w1Var instanceof o1) {
                        Object obj = w1Var.E;
                        if (obj instanceof a) {
                            th = ((a) obj).a;
                        }
                    }
                    if (th != null) {
                        s08Var.o(th);
                        return;
                    }
                }
                try {
                    if (!future.isDone()) {
                        throw new IllegalStateException(iik.g("Future was expected to be done: %s", future));
                    }
                    s08Var.onSuccess(x41.n(future));
                    return;
                } catch (ExecutionException e) {
                    s08Var.o(e.getCause());
                    return;
                } catch (Throwable th2) {
                    s08Var.o(th2);
                    return;
                }
            case 1:
                hb hbVar = (hb) this.F;
                kb kbVar = (kb) this.G;
                vcb vcbVar = kbVar.G;
                if (vcbVar != null && (tcbVar = vcbVar.e) != null) {
                    tcbVar.B(vcbVar);
                }
                View view = (View) kbVar.L;
                if (view != null && view.getWindowToken() != null) {
                    if (hbVar.b()) {
                        kbVar.W = hbVar;
                    } else if (hbVar.e != null) {
                        hbVar.d(0, 0, false, false);
                        kbVar.W = hbVar;
                    }
                }
                kbVar.Y = null;
                return;
            case 2:
                ((Application) this.F).unregisterActivityLifecycleCallbacks((nc) this.G);
                return;
            case 3:
                qq1 qq1Var = ((hq1) this.G).z0;
                if (qq1Var.c == null) {
                    qq1Var.c = new nq1();
                }
                qq1Var.c.q((lq1) this.F);
                return;
            case 4:
                nga ngaVarC = nga.c();
                int i2 = jw5.e;
                tgj tgjVar = (tgj) this.F;
                ngaVarC.getClass();
                ((jw5) this.G).a.e(tgjVar);
                return;
            case 5:
                f11 f11Var = (f11) this.G;
                Object obj2 = this.F;
                boolean z = f11Var.G.get();
                goj gojVar = f11Var.I;
                if (z) {
                    if (gojVar.h == f11Var) {
                        SystemClock.uptimeMillis();
                        gojVar.h = null;
                        gojVar.b();
                    }
                } else if (gojVar.g != f11Var) {
                    if (gojVar.h == f11Var) {
                        SystemClock.uptimeMillis();
                        gojVar.h = null;
                        gojVar.b();
                    }
                } else if (!gojVar.c) {
                    SystemClock.uptimeMillis();
                    gojVar.g = null;
                    yba ybaVar = gojVar.a;
                    if (ybaVar != null) {
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            ybaVar.i(obj2);
                        } else {
                            ybaVar.g(obj2);
                        }
                    }
                }
                f11Var.F = 3;
                return;
            case 6:
                ((ua2) this.G).F((k57) this.F, iei.a);
                return;
            case 7:
                fba fbaVar = (fba) this.F;
                eba ebaVar = (eba) this.G;
                Object obj3 = fbaVar.b;
                if (obj3 == null) {
                    return;
                }
                ebaVar.e(obj3);
                return;
            case 8:
                ReferenceQueue referenceQueue = (ReferenceQueue) this.F;
                Set set = (Set) this.G;
                while (!set.isEmpty()) {
                    try {
                        l3k l3kVar = (l3k) referenceQueue.remove();
                        if (l3kVar.a.remove(l3kVar)) {
                            l3kVar.clear();
                            l3kVar.b.getClass();
                        }
                    } catch (InterruptedException unused) {
                    }
                }
                return;
            case 9:
                zqj zqjVar = (zqj) this.F;
                nnk nnkVar = (nnk) this.G;
                zqjVar.getClass();
                DataHolder dataHolder = nnkVar.F;
                int i3 = dataHolder.I;
                try {
                    zqjVar.H("onNodeMigrated");
                    dataHolder.close();
                    return;
                } catch (Throwable th3) {
                    try {
                        dataHolder.close();
                        break;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            case 10:
                zo1 zo1Var = (zo1) this.F;
                z22 z22Var = (z22) this.G;
                hp1 hp1Var = y3k.i;
                zo1Var.z(24, 13, hp1Var);
                z22Var.b(hp1Var, null);
                return;
            case 11:
                zo1 zo1Var2 = (zo1) this.F;
                ap1 ap1Var = (ap1) this.G;
                hp1 hp1Var2 = y3k.i;
                zo1Var2.z(24, 7, hp1Var2);
                kxj kxjVar = txj.F;
                szj szjVar = szj.I;
                v84 v84Var = ap1Var.a;
                hp1Var2.getClass();
                v84Var.c0(new hid(hp1Var2, szjVar));
                return;
            case 12:
                try {
                    ((zo1) ((mvd) this.F).G).B.d((hp1) this.G);
                    return;
                } catch (Throwable th5) {
                    jyj.i("BillingClient", "Exception calling onBillingSetupFinished.", th5);
                    return;
                }
            case 13:
                v59 v59Var = (v59) this.G;
                fkk fkkVar = (fkk) v59Var.G;
                String str = (String) v59Var.F;
                cyj cyjVar = (cyj) this.F;
                umk umkVar = fkkVar.b;
                wlk wlkVar = umkVar.N;
                qgk qgkVar = umkVar.M;
                umk.d(wlkVar);
                wlkVar.K0();
                Bundle bundle = new Bundle();
                bundle.putString("package_name", str);
                try {
                    czj czjVar = (czj) cyjVar;
                    Parcel parcelB = czjVar.b();
                    qxj.d(parcelB, bundle);
                    Parcel parcelI = czjVar.I(parcelB, 1);
                    Bundle bundle2 = (Bundle) qxj.a(parcelI, Bundle.CREATOR);
                    parcelI.recycle();
                    if (bundle2 == null) {
                        umk.d(qgkVar);
                        qgkVar.J.b("Install Referrer Service returned a null response");
                    }
                    break;
                } catch (Exception e2) {
                    umk.d(qgkVar);
                    qgkVar.J.c("Exception occurred while retrieving the Install Referrer", e2.getMessage());
                }
                wlk wlkVar2 = umkVar.N;
                umk.d(wlkVar2);
                wlkVar2.K0();
                throw new IllegalStateException("Unexpected call on client side");
            case 14:
                v1l v1lVar = (v1l) this.F;
                IBinder iBinder = (IBinder) this.G;
                synchronized (v1lVar) {
                    if (iBinder == null) {
                        v1lVar.a("Null service connection");
                    } else {
                        try {
                            v1lVar.G = new dke(iBinder);
                            v1lVar.E = 2;
                            ((ScheduledExecutorService) v1lVar.J.H).execute(new frk(v1lVar, i));
                        } catch (RemoteException e3) {
                            v1lVar.a(e3.getMessage());
                        }
                    }
                }
                return;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                ffk ffkVar = (ffk) this.F;
                j5h j5hVar = (j5h) this.G;
                int iDecrementAndGet = ffkVar.b.decrementAndGet();
                dgj.y(iDecrementAndGet >= 0);
                if (iDecrementAndGet == 0) {
                    ffkVar.a.c();
                    juj jujVar = ffkVar.d;
                    if (jujVar != null) {
                        awk awkVar = jujVar.e;
                        if (awkVar != null) {
                            try {
                                Parcel parcelObtain = Parcel.obtain();
                                parcelObtain.writeInterfaceToken(awkVar.k);
                                awkVar.L(parcelObtain, 2);
                            } catch (RemoteException unused2) {
                                Log.e("ThinLanguageIdentifier", "Failed to release language identifier.");
                            }
                            jujVar.e = null;
                        }
                        ffkVar.d = null;
                    }
                    ffkVar.c.set(false);
                    break;
                }
                tyk.E.clear();
                a0l.a.clear();
                j5hVar.b(null);
                return;
            case 16:
                u1l u1lVar = (u1l) this.F;
                hyk hykVar = (hyk) this.G;
                pfk pfkVar = hykVar.H;
                if (pfkVar == null) {
                    hykVar.b0().M.b("Failed to send app backgrounded");
                    return;
                }
                try {
                    pfkVar.x(u1lVar);
                    hykVar.c1();
                    return;
                } catch (RemoteException e4) {
                    hykVar.b0().J.c("Failed to send app backgrounded to the service", e4);
                    return;
                }
            case g.MAX_FIELD_NUMBER /* 17 */:
                hyk hykVar2 = ((fzk) this.G).G;
                ComponentName componentName = (ComponentName) this.F;
                hykVar2.K0();
                if (hykVar2.H != null) {
                    hykVar2.H = null;
                    hykVar2.b0().R.c("Disconnected from device MeasurementService", componentName);
                    hykVar2.K0();
                    hykVar2.W0();
                    return;
                }
                return;
            case g.AVG_FIELD_NUMBER /* 18 */:
                o0l o0lVar = (o0l) this.F;
                o0lVar.Z();
                Runnable runnable = (Runnable) this.G;
                o0lVar.O().K0();
                if (o0lVar.T == null) {
                    o0lVar.T = new ArrayList();
                }
                o0lVar.T.add(runnable);
                o0lVar.c0();
                return;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                s31 s31Var = (s31) this.F;
                Runnable runnable2 = (Runnable) this.G;
                AtomicReference atomicReference = (AtomicReference) s31Var.I;
                dgj.y(((Thread) atomicReference.getAndSet(Thread.currentThread())) == null);
                try {
                    runnable2.run();
                    atomicReference.set(null);
                    s31Var.m();
                    return;
                } catch (Throwable th6) {
                    try {
                        atomicReference.set(null);
                        s31Var.m();
                        break;
                    } catch (Throwable th7) {
                        try {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th6, th7);
                            break;
                        } catch (Exception unused3) {
                        }
                    }
                    throw th6;
                }
            default:
                sfa sfaVar = sfa.DEBUG;
                r6j r6jVarH = ((zqj) this.G).H("onMessageReceived");
                if (r6jVarH == null) {
                    return;
                }
                hlk hlkVar = (hlk) this.F;
                PhoneWearableListenerService phoneWearableListenerService = (PhoneWearableListenerService) r6jVarH;
                hlkVar.getClass();
                String str2 = hlkVar.F;
                zfa.a.getClass();
                if (yfa.b()) {
                    String strE = iuj.E(phoneWearableListenerService);
                    CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj4 : copyOnWriteArrayList) {
                        ((n30) ((zfa) obj4)).getClass();
                        arrayList.add(obj4);
                    }
                    if (!arrayList.isEmpty()) {
                        String strM = ebh.m(zfa.a, "Wear message received: path=", str2);
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((n30) ((zfa) it.next())).b(sfaVar, strE, strM);
                        }
                    }
                }
                if (str2.hashCode() == 222223788 && str2.equals("/claude/auth-request")) {
                    String str3 = hlkVar.H;
                    str3.getClass();
                    zfa.a.getClass();
                    if (yfa.b()) {
                        String strE2 = iuj.E(phoneWearableListenerService);
                        CopyOnWriteArrayList copyOnWriteArrayList2 = yfa.b;
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj5 : copyOnWriteArrayList2) {
                            ((n30) ((zfa) obj5)).getClass();
                            arrayList2.add(obj5);
                        }
                        if (!arrayList2.isEmpty()) {
                            zfa.a.getClass();
                            String strConcat = "Watch requested auth credentials, node=".concat(str3);
                            Iterator it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                ((n30) ((zfa) it2.next())).b(sfaVar, strE2, strConcat);
                            }
                        }
                    }
                    gb9.D((l45) phoneWearableListenerService.P.getValue(), null, null, new com.anthropic.claude.wear.g(phoneWearableListenerService, str3, null), 3);
                    return;
                }
                return;
        }
    }

    public String toString() {
        switch (this.E) {
            case 0:
                lrb lrbVar = new lrb(t08.class.getSimpleName(), 0);
                s08 s08Var = (s08) this.G;
                epk epkVar = new epk();
                ((epk) lrbVar.H).F = epkVar;
                lrbVar.H = epkVar;
                epkVar.E = s08Var;
                return lrbVar.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ t08(Object obj, Object obj2, boolean z, int i) {
        this.E = i;
        this.G = obj;
        this.F = obj2;
    }

    public t08(v59 v59Var, cyj cyjVar, v59 v59Var2) {
        this.E = 13;
        this.F = cyjVar;
        this.G = v59Var;
    }

    public /* synthetic */ t08(Object obj, int i, Object obj2) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
    }
}
