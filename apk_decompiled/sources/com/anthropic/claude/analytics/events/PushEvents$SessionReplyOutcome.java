package com.anthropic.claude.analytics.events;

import defpackage.fq6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.rod;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import defpackage.zyd;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"com/anthropic/claude/analytics/events/PushEvents$SessionReplyOutcome", "", "Lcom/anthropic/claude/analytics/events/PushEvents$SessionReplyOutcome;", "<init>", "(Ljava/lang/String;I)V", "Companion", "zyd", "UNSPECIFIED", "SENT", "API_FAILURE", "SCOPE_FAILURE", "DROPPED_RECEIVER", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class PushEvents$SessionReplyOutcome {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ PushEvents$SessionReplyOutcome[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final zyd Companion;
    public static final PushEvents$SessionReplyOutcome UNSPECIFIED = new PushEvents$SessionReplyOutcome("UNSPECIFIED", 0);
    public static final PushEvents$SessionReplyOutcome SENT = new PushEvents$SessionReplyOutcome("SENT", 1);
    public static final PushEvents$SessionReplyOutcome API_FAILURE = new PushEvents$SessionReplyOutcome("API_FAILURE", 2);
    public static final PushEvents$SessionReplyOutcome SCOPE_FAILURE = new PushEvents$SessionReplyOutcome("SCOPE_FAILURE", 3);
    public static final PushEvents$SessionReplyOutcome DROPPED_RECEIVER = new PushEvents$SessionReplyOutcome("DROPPED_RECEIVER", 4);

    private static final /* synthetic */ PushEvents$SessionReplyOutcome[] $values() {
        return new PushEvents$SessionReplyOutcome[]{UNSPECIFIED, SENT, API_FAILURE, SCOPE_FAILURE, DROPPED_RECEIVER};
    }

    static {
        PushEvents$SessionReplyOutcome[] pushEvents$SessionReplyOutcomeArr$values = $values();
        $VALUES = pushEvents$SessionReplyOutcomeArr$values;
        $ENTRIES = wd6.n0(pushEvents$SessionReplyOutcomeArr$values);
        Companion = new zyd();
        $cachedSerializer$delegate = yb5.w(w1a.F, new rod(13));
    }

    private PushEvents$SessionReplyOutcome(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.PushEvents.SessionReplyOutcome", values(), new String[]{"unspecified", "sent", "api_failure", "scope_failure", "dropped_receiver"}, new Annotation[][]{null, null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static PushEvents$SessionReplyOutcome valueOf(String str) {
        return (PushEvents$SessionReplyOutcome) Enum.valueOf(PushEvents$SessionReplyOutcome.class, str);
    }

    public static PushEvents$SessionReplyOutcome[] values() {
        return (PushEvents$SessionReplyOutcome[]) $VALUES.clone();
    }
}
