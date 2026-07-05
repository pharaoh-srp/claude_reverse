package defpackage;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public abstract class evj {
    public static final pwj a;

    static {
        pwj zujVar;
        try {
            SystemClock.elapsedRealtimeNanos();
            zujVar = new vuj();
        } catch (Throwable unused) {
            SystemClock.elapsedRealtime();
            zujVar = new zuj();
        }
        a = zujVar;
    }
}
