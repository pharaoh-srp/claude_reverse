package defpackage;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.Trace;
import android.util.Log;
import android.view.ActionMode;
import androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController;
import androidx.credentials.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController;
import androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController;
import androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential.CreateDigitalCredentialController;
import androidx.health.platform.client.proto.g;
import androidx.media3.exoplayer.ExoPlaybackException;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Semaphore;
import org.chromium.net.UrlRequest;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class fc implements Runnable {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;

    public /* synthetic */ fc(yt5 yt5Var, rgg rggVar) {
        this.E = 15;
        this.F = yt5Var;
    }

    private final void a() {
        iu7 iu7Var = (iu7) this.F;
        synchronized (iu7Var.d) {
            try {
                if (iu7Var.h == null) {
                    return;
                }
                try {
                    jv7 jv7VarC = iu7Var.c();
                    int i = jv7VarC.f;
                    if (i == 2) {
                        synchronized (iu7Var.d) {
                        }
                    }
                    if (i != 0) {
                        throw new RuntimeException("fetchFonts result is not OK. (" + i + ")");
                    }
                    try {
                        int i2 = g3i.a;
                        Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                        yl4 yl4Var = iu7Var.c;
                        Context context = iu7Var.a;
                        yl4Var.getClass();
                        jv7[] jv7VarArr = {jv7VarC};
                        qwk qwkVar = kbi.a;
                        Trace.beginSection("TypefaceCompat.createFromFontInfo");
                        try {
                            Typeface typefaceG = kbi.a.g(context, jv7VarArr, 0);
                            Trace.endSection();
                            MappedByteBuffer mappedByteBufferO = rwk.o(iu7Var.a, jv7VarC.a);
                            if (mappedByteBufferO == null || typefaceG == null) {
                                throw new RuntimeException("Unable to open file.");
                            }
                            try {
                                Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                c61 c61Var = new c61(typefaceG, zrk.t(mappedByteBufferO));
                                Trace.endSection();
                                synchronized (iu7Var.d) {
                                    try {
                                        kvj kvjVar = iu7Var.h;
                                        if (kvjVar != null) {
                                            kvjVar.g(c61Var);
                                        }
                                    } finally {
                                    }
                                }
                                iu7Var.b();
                            } finally {
                                int i3 = g3i.a;
                            }
                        } finally {
                            Trace.endSection();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } catch (Throwable th2) {
                    synchronized (iu7Var.d) {
                        try {
                            kvj kvjVar2 = iu7Var.h;
                            if (kvjVar2 != null) {
                                kvjVar2.f(th2);
                            }
                            iu7Var.b();
                        } finally {
                        }
                    }
                }
            } finally {
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Application application;
        nc ncVar;
        Object obj2;
        int i = 17;
        int i2 = 2;
        int i3 = 1;
        switch (this.E) {
            case 0:
                Activity activity = (Activity) this.F;
                if (activity.isFinishing()) {
                    return;
                }
                Handler handler = oc.g;
                Method method = oc.f;
                int i4 = Build.VERSION.SDK_INT;
                if (i4 >= 28) {
                    activity.recreate();
                    return;
                }
                if (((i4 != 26 && i4 != 27) || method != null) && (oc.e != null || oc.d != null)) {
                    try {
                        Object obj3 = oc.c.get(activity);
                        if (obj3 != null && (obj = oc.b.get(activity)) != null) {
                            Application application2 = activity.getApplication();
                            nc ncVar2 = new nc(activity);
                            application2.registerActivityLifecycleCallbacks(ncVar2);
                            handler.post(new s2k(ncVar2, i3, obj3));
                            try {
                                if (i4 == 26 || i4 == 27) {
                                    Boolean bool = Boolean.FALSE;
                                    application = application2;
                                    application2 = null;
                                    ncVar = ncVar2;
                                    ncVar2 = null;
                                    try {
                                        method.invoke(obj, obj3, null, null, 0, bool, null, null, bool, bool);
                                    } catch (Throwable th) {
                                        th = th;
                                        handler.post(new t08(application, i2, ncVar));
                                        throw th;
                                    }
                                    break;
                                } else {
                                    activity.recreate();
                                    application = application2;
                                    ncVar = ncVar2;
                                }
                                handler.post(new t08(application, i2, ncVar));
                                return;
                            } catch (Throwable th2) {
                                th = th2;
                                application = application2;
                                ncVar = ncVar2;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                activity.recreate();
                return;
            case 1:
                ActionMode actionMode = ((g60) this.F).h;
                if (actionMode != null) {
                    actionMode.finish();
                    return;
                }
                return;
            case 2:
                q11 q11Var = (q11) this.F;
                synchronized (q11Var.a) {
                    try {
                        if (q11Var.m) {
                            return;
                        }
                        long j = q11Var.l - 1;
                        q11Var.l = j;
                        if (j > 0) {
                            return;
                        }
                        if (j >= 0) {
                            q11Var.a();
                            return;
                        }
                        IllegalStateException illegalStateException = new IllegalStateException();
                        synchronized (q11Var.a) {
                            q11Var.n = illegalStateException;
                            break;
                        }
                        return;
                    } finally {
                    }
                }
            case 3:
                r31 r31Var = (r31) this.F;
                if (r31Var.c.F) {
                    r31Var.a.E.C(3, false);
                    return;
                }
                return;
            case 4:
                ((x31) this.F).c();
                return;
            case 5:
                kba kbaVar = (kba) this.F;
                kbaVar.getClass();
                if (Thread.currentThread() == kbaVar.a) {
                    kbaVar.e(-1, new wg6(i));
                    return;
                }
                return;
            case 6:
                ga4.d((ga4) this.F);
                return;
            case 7:
                CreateDigitalCredentialController.handleResponse$lambda$2$0((CreateDigitalCredentialController) this.F);
                return;
            case 8:
                CredentialProviderBeginSignInController.invokePlayServices$lambda$0$0$0((CredentialProviderBeginSignInController) this.F);
                return;
            case 9:
                CredentialProviderCreatePasswordController.invokePlayServices$lambda$0$0$0((CredentialProviderCreatePasswordController) this.F);
                return;
            case 10:
                CredentialProviderGetSignInIntentController.invokePlayServices$lambda$1$0$0((CredentialProviderGetSignInIntentController) this.F);
                return;
            case 11:
                Iterator it = ((sb5) this.F).F.entrySet().iterator();
                while (it.hasNext()) {
                    try {
                        Map.Entry entry = (Map.Entry) it.next();
                        if (((f4e) ((v82) entry.getKey())).V) {
                            it.remove();
                            ((UrlRequest) entry.getValue()).cancel();
                        }
                    } catch (RuntimeException e) {
                        Log.w("CronetInterceptor", "Unable to propagate cancellation status", e);
                    }
                }
                return;
            case 12:
                ((qj5) this.F).C().n.b();
                return;
            case 13:
                hp5 hp5Var = (hp5) this.F;
                hp5Var.H(hp5Var.C(), 1028, new ed5(25));
                hp5Var.f.d();
                return;
            case 14:
                vp5 vp5Var = (vp5) this.F;
                if (vp5Var.a0 >= 300000) {
                    ((e6b) vp5Var.n.F).w1 = true;
                    vp5Var.a0 = 0L;
                    return;
                }
                return;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                ((yt5) this.F).a(null);
                return;
            case 16:
                ((gv5) this.F).g();
                return;
            case g.MAX_FIELD_NUMBER /* 17 */:
                ((wv5) this.F).h.d();
                return;
            case g.AVG_FIELD_NUMBER /* 18 */:
                v77 v77Var = (v77) this.F;
                ig0 ig0Var = v77Var.C;
                Context context = v77Var.e;
                String str = tpi.a;
                int iGenerateAudioSessionId = x41.j(context).generateAudioSessionId();
                if (iGenerateAudioSessionId == -1) {
                    iGenerateAudioSessionId = 0;
                }
                ig0Var.getClass();
                Looper looperMyLooper = Looper.myLooper();
                if (looperMyLooper == ((k1h) ig0Var.G).a.getLooper()) {
                    obj2 = ig0Var.I;
                } else {
                    fd9.M(looperMyLooper == ((k1h) ig0Var.F).a.getLooper());
                    obj2 = ig0Var.J;
                }
                if (((Integer) obj2).intValue() != iGenerateAudioSessionId) {
                    Integer numValueOf = Integer.valueOf(iGenerateAudioSessionId);
                    ig0Var.J = numValueOf;
                    hc1 hc1Var = new hc1(ig0Var, numValueOf, i);
                    k1h k1hVar = (k1h) ig0Var.G;
                    if (k1hVar.a.getLooper().getThread().isAlive()) {
                        k1hVar.d(hc1Var);
                    }
                    v77Var.z(1, Integer.valueOf(iGenerateAudioSessionId), 10);
                    v77Var.z(2, Integer.valueOf(iGenerateAudioSessionId), 10);
                    return;
                }
                return;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                hp5 hp5Var2 = ((d87) this.F).a0;
                hp5Var2.H(hp5Var2.C(), 1034, new ed5(i));
                return;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                c7d c7dVar = (c7d) this.F;
                try {
                    synchronized (c7dVar) {
                    }
                    try {
                        c7dVar.a.d(c7dVar.c, c7dVar.d);
                        c7dVar.a(true);
                        return;
                    } catch (Throwable th3) {
                        c7dVar.a(true);
                        throw th3;
                    }
                } catch (ExoPlaybackException e2) {
                    ysj.k("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e2);
                    xh6.h(e2);
                    return;
                }
            case 21:
                ((dx7) this.F).accept(new odj(lm6.E));
                return;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                a();
                return;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                cx7 cx7Var = (cx7) this.F;
                cx7Var.s0.I.y(cx7Var.H);
                cx7Var.H = null;
                return;
            case 24:
                Iterator it2 = ((rx7) this.F).n.iterator();
                if (it2.hasNext()) {
                    it2.next().getClass();
                    mr9.o();
                    return;
                }
                return;
            case BuildConfig.VERSION_CODE /* 25 */:
                ot8 ot8Var = (ot8) this.F;
                try {
                    ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                    ActivityManager.getMyMemoryState(runningAppProcessInfo);
                    int i5 = runningAppProcessInfo.importance;
                    i = (i5 == 100 || i5 == 125 || i5 == 200) ? 1 : 0;
                    ot8Var.getClass();
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("androidx.health.platform.client.impl.sdkservice.IGetIsInForegroundCallback");
                        parcelObtain.writeInt(i);
                        ot8Var.i.transact(1, parcelObtain, null, 1);
                        parcelObtain.recycle();
                        return;
                    } catch (Throwable th4) {
                        parcelObtain.recycle();
                        throw th4;
                    }
                } catch (RemoteException e3) {
                    Log.e("rk8", "HealthDataSdkService#getIsInForeground failed: " + e3.getMessage());
                    return;
                }
            case 26:
                ((re9) this.F).i();
                return;
            case 27:
                lf9 lf9Var = (lf9) this.F;
                if (lf9Var != null) {
                    lf9Var.d(null);
                    return;
                }
                return;
            case 28:
                pna pnaVar = (pna) this.F;
                Semaphore semaphore = pnaVar.e0;
                me4 me4Var = pnaVar.M;
                if (me4Var == null) {
                    return;
                }
                try {
                    semaphore.acquire();
                    me4Var.m(pnaVar.F.a());
                    break;
                } catch (InterruptedException unused2) {
                } catch (Throwable th5) {
                    semaphore.release();
                    throw th5;
                }
                semaphore.release();
                return;
            default:
                ((vna) this.F).c();
                return;
        }
    }

    public /* synthetic */ fc(int i, Object obj) {
        this.E = i;
        this.F = obj;
    }

    public /* synthetic */ fc(d87 d87Var, int i) {
        this.E = 19;
        this.F = d87Var;
    }

    public /* synthetic */ fc(d87 d87Var, c7d c7dVar) {
        this.E = 20;
        this.F = c7dVar;
    }
}
