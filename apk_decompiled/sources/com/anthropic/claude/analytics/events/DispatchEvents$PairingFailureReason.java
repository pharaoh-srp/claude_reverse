package com.anthropic.claude.analytics.events;

import defpackage.fq6;
import defpackage.h85;
import defpackage.kw9;
import defpackage.l76;
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
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/anthropic/claude/analytics/events/DispatchEvents$PairingFailureReason", "", "Lcom/anthropic/claude/analytics/events/DispatchEvents$PairingFailureReason;", "<init>", "(Ljava/lang/String;I)V", "Companion", "l76", "UNSPECIFIED", "POLL_EXHAUSTED_NO_BRIDGE", "POLL_EXHAUSTED_WITH_ERRORS", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class DispatchEvents$PairingFailureReason {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ DispatchEvents$PairingFailureReason[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final l76 Companion;
    public static final DispatchEvents$PairingFailureReason UNSPECIFIED = new DispatchEvents$PairingFailureReason("UNSPECIFIED", 0);
    public static final DispatchEvents$PairingFailureReason POLL_EXHAUSTED_NO_BRIDGE = new DispatchEvents$PairingFailureReason("POLL_EXHAUSTED_NO_BRIDGE", 1);
    public static final DispatchEvents$PairingFailureReason POLL_EXHAUSTED_WITH_ERRORS = new DispatchEvents$PairingFailureReason("POLL_EXHAUSTED_WITH_ERRORS", 2);

    private static final /* synthetic */ DispatchEvents$PairingFailureReason[] $values() {
        return new DispatchEvents$PairingFailureReason[]{UNSPECIFIED, POLL_EXHAUSTED_NO_BRIDGE, POLL_EXHAUSTED_WITH_ERRORS};
    }

    static {
        DispatchEvents$PairingFailureReason[] dispatchEvents$PairingFailureReasonArr$values = $values();
        $VALUES = dispatchEvents$PairingFailureReasonArr$values;
        $ENTRIES = wd6.n0(dispatchEvents$PairingFailureReasonArr$values);
        Companion = new l76();
        $cachedSerializer$delegate = yb5.w(w1a.F, new h85(25));
    }

    private DispatchEvents$PairingFailureReason(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.DispatchEvents.PairingFailureReason", values(), new String[]{"unspecified", "poll_exhausted_no_bridge", "poll_exhausted_with_errors"}, new Annotation[][]{null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static DispatchEvents$PairingFailureReason valueOf(String str) {
        return (DispatchEvents$PairingFailureReason) Enum.valueOf(DispatchEvents$PairingFailureReason.class, str);
    }

    public static DispatchEvents$PairingFailureReason[] values() {
        return (DispatchEvents$PairingFailureReason[]) $VALUES.clone();
    }
}
