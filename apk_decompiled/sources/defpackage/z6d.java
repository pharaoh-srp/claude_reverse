package defpackage;

import android.media.metrics.LogSessionId;
import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public final class z6d {
    public static final z6d c;
    public final String a;
    public final ro6 b;

    static {
        new z6d("");
        c = new z6d("preload");
    }

    public z6d(String str) {
        ro6 ro6Var;
        this.a = str;
        if (Build.VERSION.SDK_INT >= 31) {
            ro6Var = new ro6((byte) 0, 19);
            ro6Var.F = LogSessionId.LOG_SESSION_ID_NONE;
        } else {
            ro6Var = null;
        }
        this.b = ro6Var;
    }

    public final synchronized LogSessionId a() {
        ro6 ro6Var;
        ro6Var = this.b;
        ro6Var.getClass();
        return (LogSessionId) ro6Var.F;
    }
}
