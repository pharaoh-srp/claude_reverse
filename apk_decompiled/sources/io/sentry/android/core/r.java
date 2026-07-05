package io.sentry.android.core;

import android.os.SystemClock;
import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements io.sentry.android.core.internal.util.o {
    public float a = MTTypesetterKt.kLineSkipLimitMultiplier;
    public final /* synthetic */ s b;

    public r(s sVar) {
        this.b = sVar;
    }

    @Override // io.sentry.android.core.internal.util.o
    public final void b(long j, long j2, long j3, long j4, boolean z, boolean z2, float f) {
        Date dateK = io.sentry.p.k();
        System.nanoTime();
        long time = dateK.getTime() * 1000000;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() + (j2 - System.nanoTime());
        s sVar = this.b;
        long j5 = jElapsedRealtimeNanos - sVar.a;
        if (j5 < 0) {
            return;
        }
        if (z2) {
            sVar.j.addLast(new io.sentry.profilemeasurements.b(Long.valueOf(j5), Long.valueOf(j3), time));
        } else if (z) {
            sVar.i.addLast(new io.sentry.profilemeasurements.b(Long.valueOf(j5), Long.valueOf(j3), time));
        }
        if (f != this.a) {
            this.a = f;
            sVar.h.addLast(new io.sentry.profilemeasurements.b(Long.valueOf(j5), Float.valueOf(f), time));
        }
    }
}
