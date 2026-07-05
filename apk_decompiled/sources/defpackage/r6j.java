package defpackage;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.os.HandlerThread;
import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r6j extends Service implements hh2 {
    public ComponentName E;
    public m5l F;
    public zqj G;
    public Intent H;
    public HandlerThread I;
    public boolean K;
    public final Object J = new Object();
    public final suj L = new suj(new c6k(this));

    @Override // defpackage.hh2
    public final void a(lzj lzjVar) {
    }

    @Override // defpackage.hh2
    public final void b(lzj lzjVar) {
    }

    @Override // defpackage.hh2
    public final void c(lzj lzjVar) {
    }

    @Override // defpackage.hh2
    public final void d(lzj lzjVar) {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0018, code lost:
    
        if (r0.equals("com.google.android.gms.wearable.BIND_LISTENER") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0021, code lost:
    
        if (r0.equals("com.google.android.gms.wearable.CHANNEL_EVENT") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002a, code lost:
    
        if (r0.equals("com.google.android.gms.wearable.DATA_CHANGED") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0033, code lost:
    
        if (r0.equals("com.google.android.gms.wearable.NODE_MIGRATED") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003c, code lost:
    
        if (r0.equals("com.google.android.gms.wearable.MESSAGE_RECEIVED") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0045, code lost:
    
        if (r0.equals("com.google.android.gms.wearable.REQUEST_RECEIVED") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004e, code lost:
    
        if (r0.equals("com.google.android.gms.wearable.CAPABILITY_CHANGED") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0052, code lost:
    
        return r2.G;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.app.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.IBinder onBind(android.content.Intent r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L4
            goto L6b
        L4:
            java.lang.String r0 = r3.getAction()
            if (r0 == 0) goto L6b
            int r1 = r0.hashCode()
            switch(r1) {
                case -1487371046: goto L48;
                case -1140095138: goto L3f;
                case -786751258: goto L36;
                case 705066793: goto L2d;
                case 915816236: goto L24;
                case 1003809169: goto L1b;
                case 1460975593: goto L12;
                default: goto L11;
            }
        L11:
            goto L53
        L12:
            java.lang.String r1 = "com.google.android.gms.wearable.BIND_LISTENER"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L53
            goto L50
        L1b:
            java.lang.String r1 = "com.google.android.gms.wearable.CHANNEL_EVENT"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L53
            goto L50
        L24:
            java.lang.String r1 = "com.google.android.gms.wearable.DATA_CHANGED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L53
            goto L50
        L2d:
            java.lang.String r1 = "com.google.android.gms.wearable.NODE_MIGRATED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L53
            goto L50
        L36:
            java.lang.String r1 = "com.google.android.gms.wearable.MESSAGE_RECEIVED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L53
            goto L50
        L3f:
            java.lang.String r1 = "com.google.android.gms.wearable.REQUEST_RECEIVED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L53
            goto L50
        L48:
            java.lang.String r1 = "com.google.android.gms.wearable.CAPABILITY_CHANGED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L53
        L50:
            zqj r2 = r2.G
            return r2
        L53:
            java.lang.String r2 = "WearableLS"
            r0 = 3
            boolean r2 = android.util.Log.isLoggable(r2, r0)
            if (r2 == 0) goto L6b
            java.lang.String r2 = r3.toString()
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 46
            r3.<init>(r2)
        L6b:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r6j.onBind(android.content.Intent):android.os.IBinder");
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.E = new ComponentName(this, getClass().getName());
        if (Log.isLoggable("WearableLS", 3)) {
            "onCreate: ".concat(String.valueOf(this.E));
        }
        if (this.I == null) {
            HandlerThread handlerThread = new HandlerThread("WearableListenerService");
            handlerThread.start();
            this.I = handlerThread;
        }
        this.F = new m5l(this, this.I.getLooper());
        Intent intent = new Intent("com.google.android.gms.wearable.BIND_LISTENER");
        this.H = intent;
        intent.setComponent(this.E);
        this.G = new zqj(this);
    }

    @Override // android.app.Service
    public void onDestroy() {
        if (Log.isLoggable("WearableLS", 3)) {
            "onDestroy: ".concat(String.valueOf(this.E));
        }
        synchronized (this.J) {
            this.K = true;
            m5l m5lVar = this.F;
            if (m5lVar == null) {
                String strValueOf = String.valueOf(this.E);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 111);
                sb.append("onDestroy: mServiceHandler not set, did you override onCreate() but forget to call super.onCreate()? component=");
                sb.append(strValueOf);
                throw new IllegalStateException(sb.toString());
            }
            m5lVar.a();
        }
        super.onDestroy();
    }
}
