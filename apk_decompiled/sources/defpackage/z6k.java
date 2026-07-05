package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class z6k {
    public static final z6k b;
    public static final z6k c;
    public final Throwable a;

    static {
        if (x0l.H) {
            c = null;
            b = null;
        } else {
            c = new z6k(null);
            b = new z6k(null);
        }
    }

    public z6k(CancellationException cancellationException) {
        this.a = cancellationException;
    }
}
