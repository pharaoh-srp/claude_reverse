package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public final class m5l extends Handler {
    public boolean a;
    public final y4l b;
    public final /* synthetic */ r6j c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5l(r6j r6jVar, Looper looper) {
        super(looper);
        this.c = r6jVar;
        Looper.getMainLooper();
        this.b = new y4l();
    }

    public final void a() {
        r6j r6jVar = this.c;
        HandlerThread handlerThread = r6jVar.I;
        if (handlerThread == null) {
            getLooper().quit();
        } else {
            handlerThread.quitSafely();
            try {
                r6jVar.I.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                Log.e("WearableLS", "Failed to join serviceHandlerThread", e);
            }
            r6jVar.I = null;
        }
        b("quit");
    }

    public final synchronized void b(String str) {
        if (this.a) {
            if (Log.isLoggable("WearableLS", 2)) {
                r6j r6jVar = this.c;
                int length = str.length();
                String strValueOf = String.valueOf(r6jVar.E);
                StringBuilder sb = new StringBuilder(length + 17 + strValueOf.length());
                sb.append("unbindService: ");
                sb.append(str);
                sb.append(", ");
                sb.append(strValueOf);
                Log.v("WearableLS", sb.toString());
            }
            try {
                this.c.unbindService(this.b);
            } catch (RuntimeException e) {
                Log.e("WearableLS", "Exception when unbinding from local service", e);
            }
            this.a = false;
        }
    }

    @Override // android.os.Handler
    public final void dispatchMessage(Message message) {
        synchronized (this) {
            try {
                if (!this.a) {
                    if (Log.isLoggable("WearableLS", 2)) {
                        Log.v("WearableLS", "bindService: ".concat(String.valueOf(this.c.E)));
                    }
                    r6j r6jVar = this.c;
                    r6jVar.bindService(r6jVar.H, this.b, 1);
                    this.a = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            super.dispatchMessage(message);
            if (hasMessages(0)) {
                return;
            }
            b("dispatch");
        } catch (Throwable th2) {
            if (!hasMessages(0)) {
                b("dispatch");
            }
            throw th2;
        }
    }
}
