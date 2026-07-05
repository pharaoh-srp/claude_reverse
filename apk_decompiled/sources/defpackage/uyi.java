package defpackage;

import com.squareup.wire.internal.MathMethodsKt;
import java.util.concurrent.ConcurrentLinkedDeque;

/* JADX INFO: loaded from: classes.dex */
public final class uyi {
    public final long a;
    public final t47 b;
    public volatile long c;
    public volatile long d;
    public volatile long e;
    public final long f;

    public uyi(long j) {
        t47 t47Var = new t47(new ConcurrentLinkedDeque());
        this.a = j;
        this.b = t47Var;
        this.c = 0L;
        this.d = 0L;
        this.e = 0L;
        this.f = MathMethodsKt.NANOS_PER_SECOND;
    }
}
