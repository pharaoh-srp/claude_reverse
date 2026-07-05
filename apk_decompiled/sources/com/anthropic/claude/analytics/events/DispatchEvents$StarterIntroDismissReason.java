package com.anthropic.claude.analytics.events;

import defpackage.fq6;
import defpackage.h85;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.q76;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/anthropic/claude/analytics/events/DispatchEvents$StarterIntroDismissReason", "", "Lcom/anthropic/claude/analytics/events/DispatchEvents$StarterIntroDismissReason;", "<init>", "(Ljava/lang/String;I)V", "Companion", "q76", "UNSPECIFIED", "GET_STARTED", "AUTO_NAVIGATION", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class DispatchEvents$StarterIntroDismissReason {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ DispatchEvents$StarterIntroDismissReason[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final q76 Companion;
    public static final DispatchEvents$StarterIntroDismissReason UNSPECIFIED = new DispatchEvents$StarterIntroDismissReason("UNSPECIFIED", 0);
    public static final DispatchEvents$StarterIntroDismissReason GET_STARTED = new DispatchEvents$StarterIntroDismissReason("GET_STARTED", 1);
    public static final DispatchEvents$StarterIntroDismissReason AUTO_NAVIGATION = new DispatchEvents$StarterIntroDismissReason("AUTO_NAVIGATION", 2);

    private static final /* synthetic */ DispatchEvents$StarterIntroDismissReason[] $values() {
        return new DispatchEvents$StarterIntroDismissReason[]{UNSPECIFIED, GET_STARTED, AUTO_NAVIGATION};
    }

    static {
        DispatchEvents$StarterIntroDismissReason[] dispatchEvents$StarterIntroDismissReasonArr$values = $values();
        $VALUES = dispatchEvents$StarterIntroDismissReasonArr$values;
        $ENTRIES = wd6.n0(dispatchEvents$StarterIntroDismissReasonArr$values);
        Companion = new q76();
        $cachedSerializer$delegate = yb5.w(w1a.F, new h85(27));
    }

    private DispatchEvents$StarterIntroDismissReason(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.DispatchEvents.StarterIntroDismissReason", values(), new String[]{"unspecified", "get_started", "auto_navigation"}, new Annotation[][]{null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static DispatchEvents$StarterIntroDismissReason valueOf(String str) {
        return (DispatchEvents$StarterIntroDismissReason) Enum.valueOf(DispatchEvents$StarterIntroDismissReason.class, str);
    }

    public static DispatchEvents$StarterIntroDismissReason[] values() {
        return (DispatchEvents$StarterIntroDismissReason[]) $VALUES.clone();
    }
}
