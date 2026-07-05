package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class frk implements Runnable {
    public final /* synthetic */ int E;
    public final /* synthetic */ v1l F;

    public /* synthetic */ frk(v1l v1lVar, int i) {
        this.E = i;
        this.F = v1lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.E) {
            case 0:
                break;
            case 1:
                v1l v1lVar = this.F;
                synchronized (v1lVar) {
                    if (v1lVar.E == 1) {
                        v1lVar.a("Timed out while binding");
                    }
                    break;
                }
                return;
            default:
                this.F.a("Service disconnected");
                return;
        }
        while (true) {
            v1l v1lVar2 = this.F;
            synchronized (v1lVar2) {
                try {
                    if (v1lVar2.E != 2) {
                        return;
                    }
                    if (v1lVar2.H.isEmpty()) {
                        v1lVar2.c();
                        return;
                    }
                    t3l t3lVar = (t3l) v1lVar2.H.poll();
                    v1lVar2.I.put(t3lVar.a, t3lVar);
                    ((ScheduledExecutorService) v1lVar2.J.H).schedule(new s2k(v1lVar2, 24, t3lVar), 30L, TimeUnit.SECONDS);
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        "Sending ".concat(String.valueOf(t3lVar));
                    }
                    o5l o5lVar = v1lVar2.J;
                    Messenger messenger = v1lVar2.F;
                    int i = t3lVar.c;
                    Context context = (Context) o5lVar.G;
                    Message messageObtain = Message.obtain();
                    messageObtain.what = i;
                    messageObtain.arg1 = t3lVar.a;
                    messageObtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", t3lVar.a());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", t3lVar.d);
                    messageObtain.setData(bundle);
                    try {
                        dke dkeVar = v1lVar2.G;
                        Messenger messenger2 = (Messenger) dkeVar.E;
                        if (messenger2 != null) {
                            messenger2.send(messageObtain);
                        } else {
                            p3k p3kVar = (p3k) dkeVar.F;
                            if (p3kVar == null) {
                                throw new IllegalStateException("Both messengers are null");
                            }
                            p3kVar.a(messageObtain);
                        }
                    } catch (RemoteException e) {
                        v1lVar2.a(e.getMessage());
                    }
                } finally {
                }
            }
        }
    }
}
