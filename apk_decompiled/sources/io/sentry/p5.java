package io.sentry;

import com.squareup.wire.internal.MathMethodsKt;
import java.time.Instant;

/* JADX INFO: loaded from: classes3.dex */
public final class p5 extends a5 {
    public final Instant E = Instant.now();

    @Override // io.sentry.a5
    public final long d() {
        Instant instant = this.E;
        return (instant.getEpochSecond() * MathMethodsKt.NANOS_PER_SECOND) + ((long) instant.getNano());
    }
}
