package com.squareup.wire;

import defpackage.mdj;
import java.time.Duration;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u001a\u001d\u0010\u0002\u001a\u00060\u0001j\u0002`\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0086\b*\n\u0010\u0000\"\u00020\u00012\u00020\u0001¨\u0006\u0007"}, d2 = {"Duration", "Ljava/time/Duration;", "durationOfSeconds", "Lcom/squareup/wire/Duration;", "seconds", "", "nano", "wire-runtime"}, k = 2, mv = {2, 0, 0}, xi = mdj.f)
public final class DurationKt {
    public static final Duration durationOfSeconds(long j, long j2) {
        Duration durationOfSeconds = Duration.ofSeconds(j, j2);
        durationOfSeconds.getClass();
        return durationOfSeconds;
    }
}
