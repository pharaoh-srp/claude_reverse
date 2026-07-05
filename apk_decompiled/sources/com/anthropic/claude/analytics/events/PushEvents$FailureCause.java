package com.anthropic.claude.analytics.events;

import defpackage.fq6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.myd;
import defpackage.onf;
import defpackage.oq5;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import defpackage.zcd;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/anthropic/claude/analytics/events/PushEvents$FailureCause", "", "Lcom/anthropic/claude/analytics/events/PushEvents$FailureCause;", "<init>", "(Ljava/lang/String;I)V", "Companion", "myd", "UNSPECIFIED", "FCM_TOKEN_FAILED", "NETWORK_ERROR", "SERVER_REJECTED", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class PushEvents$FailureCause {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ PushEvents$FailureCause[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final myd Companion;
    public static final PushEvents$FailureCause UNSPECIFIED = new PushEvents$FailureCause("UNSPECIFIED", 0);
    public static final PushEvents$FailureCause FCM_TOKEN_FAILED = new PushEvents$FailureCause("FCM_TOKEN_FAILED", 1);
    public static final PushEvents$FailureCause NETWORK_ERROR = new PushEvents$FailureCause("NETWORK_ERROR", 2);
    public static final PushEvents$FailureCause SERVER_REJECTED = new PushEvents$FailureCause("SERVER_REJECTED", 3);

    private static final /* synthetic */ PushEvents$FailureCause[] $values() {
        return new PushEvents$FailureCause[]{UNSPECIFIED, FCM_TOKEN_FAILED, NETWORK_ERROR, SERVER_REJECTED};
    }

    static {
        PushEvents$FailureCause[] pushEvents$FailureCauseArr$values = $values();
        $VALUES = pushEvents$FailureCauseArr$values;
        $ENTRIES = wd6.n0(pushEvents$FailureCauseArr$values);
        Companion = new myd();
        $cachedSerializer$delegate = yb5.w(w1a.F, new zcd(2));
    }

    private PushEvents$FailureCause(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.PushEvents.FailureCause", values(), new String[]{"unspecified", "fcm_token_failed", "network_error", "server_rejected"}, new Annotation[][]{null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static PushEvents$FailureCause valueOf(String str) {
        return (PushEvents$FailureCause) Enum.valueOf(PushEvents$FailureCause.class, str);
    }

    public static PushEvents$FailureCause[] values() {
        return (PushEvents$FailureCause[]) $VALUES.clone();
    }
}
