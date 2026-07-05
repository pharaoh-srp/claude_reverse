package com.anthropic.claude.analytics.events;

import defpackage.dcc;
import defpackage.e2c;
import defpackage.fq6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"com/anthropic/claude/analytics/events/OfflineEvents$ScreenResolvedOutcome", "", "Lcom/anthropic/claude/analytics/events/OfflineEvents$ScreenResolvedOutcome;", "<init>", "(Ljava/lang/String;I)V", "Companion", "dcc", "UNSPECIFIED", "LIVE_DATA", "CACHED_THEN_UPDATED", "CACHED_ONLY_SYNC_FAILED", "ERROR_EMPTY", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class OfflineEvents$ScreenResolvedOutcome {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ OfflineEvents$ScreenResolvedOutcome[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final dcc Companion;
    public static final OfflineEvents$ScreenResolvedOutcome UNSPECIFIED = new OfflineEvents$ScreenResolvedOutcome("UNSPECIFIED", 0);
    public static final OfflineEvents$ScreenResolvedOutcome LIVE_DATA = new OfflineEvents$ScreenResolvedOutcome("LIVE_DATA", 1);
    public static final OfflineEvents$ScreenResolvedOutcome CACHED_THEN_UPDATED = new OfflineEvents$ScreenResolvedOutcome("CACHED_THEN_UPDATED", 2);
    public static final OfflineEvents$ScreenResolvedOutcome CACHED_ONLY_SYNC_FAILED = new OfflineEvents$ScreenResolvedOutcome("CACHED_ONLY_SYNC_FAILED", 3);
    public static final OfflineEvents$ScreenResolvedOutcome ERROR_EMPTY = new OfflineEvents$ScreenResolvedOutcome("ERROR_EMPTY", 4);

    private static final /* synthetic */ OfflineEvents$ScreenResolvedOutcome[] $values() {
        return new OfflineEvents$ScreenResolvedOutcome[]{UNSPECIFIED, LIVE_DATA, CACHED_THEN_UPDATED, CACHED_ONLY_SYNC_FAILED, ERROR_EMPTY};
    }

    static {
        OfflineEvents$ScreenResolvedOutcome[] offlineEvents$ScreenResolvedOutcomeArr$values = $values();
        $VALUES = offlineEvents$ScreenResolvedOutcomeArr$values;
        $ENTRIES = wd6.n0(offlineEvents$ScreenResolvedOutcomeArr$values);
        Companion = new dcc();
        $cachedSerializer$delegate = yb5.w(w1a.F, new e2c(19));
    }

    private OfflineEvents$ScreenResolvedOutcome(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.OfflineEvents.ScreenResolvedOutcome", values(), new String[]{"unspecified", "live_data", "cached_then_updated", "cached_only_sync_failed", "error_empty"}, new Annotation[][]{null, null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static OfflineEvents$ScreenResolvedOutcome valueOf(String str) {
        return (OfflineEvents$ScreenResolvedOutcome) Enum.valueOf(OfflineEvents$ScreenResolvedOutcome.class, str);
    }

    public static OfflineEvents$ScreenResolvedOutcome[] values() {
        return (OfflineEvents$ScreenResolvedOutcome[]) $VALUES.clone();
    }
}
