package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import java.lang.ref.SoftReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ujk implements Runnable {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ Parcelable G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;

    public /* synthetic */ ujk(FirebaseInstanceIdReceiver firebaseInstanceIdReceiver, Intent intent, Context context, boolean z, BroadcastReceiver.PendingResult pendingResult) {
        this.G = intent;
        this.H = context;
        this.F = z;
        this.I = pendingResult;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Executor executorUnconfigurableExecutorService;
        int iA;
        switch (this.E) {
            case 0:
                Intent intent = (Intent) this.G;
                Context context = (Context) this.H;
                boolean z = this.F;
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.I;
                try {
                    Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
                    Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
                    if (intent2 == null) {
                        int iIntValue = 500;
                        if (intent.getExtras() != null) {
                            iq3 iq3Var = new iq3(intent);
                            CountDownLatch countDownLatch = new CountDownLatch(1);
                            synchronized (FirebaseInstanceIdReceiver.class) {
                                try {
                                    SoftReference softReference = FirebaseInstanceIdReceiver.b;
                                    executorUnconfigurableExecutorService = softReference != null ? (Executor) softReference.get() : null;
                                    if (executorUnconfigurableExecutorService == null) {
                                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new vk5("pscm-ack-executor", 1));
                                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                                        executorUnconfigurableExecutorService = Executors.unconfigurableExecutorService(threadPoolExecutor);
                                        FirebaseInstanceIdReceiver.b = new SoftReference(executorUnconfigurableExecutorService);
                                    }
                                } finally {
                                }
                                break;
                            }
                            executorUnconfigurableExecutorService.execute(new ije((Object) context, (Object) iq3Var, (Object) countDownLatch, 5));
                            try {
                                iIntValue = ((Integer) ez1.r(new i49(context).X0(intent))).intValue();
                            } catch (InterruptedException | ExecutionException e) {
                                Log.e("FirebaseMessaging", "Failed to send message to service.", e);
                            }
                            try {
                                if (!countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
                                    Log.w("CloudMessagingReceiver", "Message ack timed out");
                                }
                            } catch (InterruptedException e2) {
                                Log.w("CloudMessagingReceiver", "Message ack failed: ".concat(e2.toString()));
                            }
                        }
                        iA = iIntValue;
                        break;
                    } else {
                        iA = FirebaseInstanceIdReceiver.a(intent2);
                    }
                    if (z && pendingResult != null) {
                        pendingResult.setResultCode(iA);
                    }
                    if (pendingResult != null) {
                        pendingResult.finish();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    throw th;
                }
            case 1:
                u1l u1lVar = (u1l) this.G;
                hyk hykVar = (hyk) this.I;
                pfk pfkVar = hykVar.H;
                if (pfkVar == null) {
                    hykVar.b0().J.b("Discarding data. Failed to set user property");
                    return;
                } else {
                    hykVar.U0(pfkVar, this.F ? null : (e1l) this.H, u1lVar);
                    hykVar.c1();
                    return;
                }
            default:
                u1l u1lVar2 = (u1l) this.G;
                hyk hykVar2 = (hyk) this.I;
                pfk pfkVar2 = hykVar2.H;
                if (pfkVar2 == null) {
                    hykVar2.b0().J.b("Discarding data. Failed to send conditional user property to service");
                    return;
                } else {
                    hykVar2.U0(pfkVar2, this.F ? null : (kqj) this.H, u1lVar2);
                    hykVar2.c1();
                    return;
                }
        }
    }

    public ujk(hyk hykVar, u1l u1lVar, boolean z, kqj kqjVar, kqj kqjVar2) {
        this.G = u1lVar;
        this.F = z;
        this.H = kqjVar;
        this.I = hykVar;
    }

    public ujk(hyk hykVar, u1l u1lVar, boolean z, e1l e1lVar) {
        this.G = u1lVar;
        this.F = z;
        this.H = e1lVar;
        this.I = hykVar;
    }
}
