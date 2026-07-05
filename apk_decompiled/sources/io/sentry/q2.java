package io.sentry;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public enum q2 {
    NANOSECOND,
    MICROSECOND,
    MILLISECOND,
    SECOND,
    MINUTE,
    HOUR,
    DAY,
    WEEK;

    public String apiName() {
        return name().toLowerCase(Locale.ROOT);
    }
}
