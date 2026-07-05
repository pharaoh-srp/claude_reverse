package defpackage;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public final class g1h {
    public static final g1h a = new g1h();

    public final k1h a(Looper looper, Handler.Callback callback) {
        return new k1h(new Handler(looper, callback));
    }
}
