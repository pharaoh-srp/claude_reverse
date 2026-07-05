package com.anthropic.claude.analytics.events;

import defpackage.e2c;
import defpackage.fq6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.w1a;
import defpackage.wbc;
import defpackage.wd6;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"com/anthropic/claude/analytics/events/OfflineEvents$CacheAgeBucket", "", "Lcom/anthropic/claude/analytics/events/OfflineEvents$CacheAgeBucket;", "<init>", "(Ljava/lang/String;I)V", "Companion", "wbc", "UNSPECIFIED", "UNDER_1M", "UNDER_1H", "UNDER_1D", "UNDER_1W", "OVER_1W", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class OfflineEvents$CacheAgeBucket {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ OfflineEvents$CacheAgeBucket[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final wbc Companion;
    public static final OfflineEvents$CacheAgeBucket UNSPECIFIED = new OfflineEvents$CacheAgeBucket("UNSPECIFIED", 0);
    public static final OfflineEvents$CacheAgeBucket UNDER_1M = new OfflineEvents$CacheAgeBucket("UNDER_1M", 1);
    public static final OfflineEvents$CacheAgeBucket UNDER_1H = new OfflineEvents$CacheAgeBucket("UNDER_1H", 2);
    public static final OfflineEvents$CacheAgeBucket UNDER_1D = new OfflineEvents$CacheAgeBucket("UNDER_1D", 3);
    public static final OfflineEvents$CacheAgeBucket UNDER_1W = new OfflineEvents$CacheAgeBucket("UNDER_1W", 4);
    public static final OfflineEvents$CacheAgeBucket OVER_1W = new OfflineEvents$CacheAgeBucket("OVER_1W", 5);

    private static final /* synthetic */ OfflineEvents$CacheAgeBucket[] $values() {
        return new OfflineEvents$CacheAgeBucket[]{UNSPECIFIED, UNDER_1M, UNDER_1H, UNDER_1D, UNDER_1W, OVER_1W};
    }

    static {
        OfflineEvents$CacheAgeBucket[] offlineEvents$CacheAgeBucketArr$values = $values();
        $VALUES = offlineEvents$CacheAgeBucketArr$values;
        $ENTRIES = wd6.n0(offlineEvents$CacheAgeBucketArr$values);
        Companion = new wbc();
        $cachedSerializer$delegate = yb5.w(w1a.F, new e2c(12));
    }

    private OfflineEvents$CacheAgeBucket(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.OfflineEvents.CacheAgeBucket", values(), new String[]{"unspecified", "under_1m", "under_1h", "under_1d", "under_1w", "over_1w"}, new Annotation[][]{null, null, null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static OfflineEvents$CacheAgeBucket valueOf(String str) {
        return (OfflineEvents$CacheAgeBucket) Enum.valueOf(OfflineEvents$CacheAgeBucket.class, str);
    }

    public static OfflineEvents$CacheAgeBucket[] values() {
        return (OfflineEvents$CacheAgeBucket[]) $VALUES.clone();
    }
}
