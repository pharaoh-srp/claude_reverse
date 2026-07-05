package defpackage;

import android.os.CancellationSignal;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ab2 {
    public static void a(CancellationSignal cancellationSignal) {
        cancellationSignal.cancel();
    }

    public static CancellationSignal b() {
        return new CancellationSignal();
    }
}
