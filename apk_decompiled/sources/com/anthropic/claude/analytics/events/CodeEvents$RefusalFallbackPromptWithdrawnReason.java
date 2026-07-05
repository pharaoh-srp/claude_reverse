package com.anthropic.claude.analytics.events;

import defpackage.dv3;
import defpackage.fq6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.wt3;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/anthropic/claude/analytics/events/CodeEvents$RefusalFallbackPromptWithdrawnReason", "", "Lcom/anthropic/claude/analytics/events/CodeEvents$RefusalFallbackPromptWithdrawnReason;", "<init>", "(Ljava/lang/String;I)V", "Companion", "dv3", "UNSPECIFIED", "CONTROL_CANCEL", "ANSWERED_ELSEWHERE", "TURN_ENDED", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class CodeEvents$RefusalFallbackPromptWithdrawnReason {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ CodeEvents$RefusalFallbackPromptWithdrawnReason[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final dv3 Companion;
    public static final CodeEvents$RefusalFallbackPromptWithdrawnReason UNSPECIFIED = new CodeEvents$RefusalFallbackPromptWithdrawnReason("UNSPECIFIED", 0);
    public static final CodeEvents$RefusalFallbackPromptWithdrawnReason CONTROL_CANCEL = new CodeEvents$RefusalFallbackPromptWithdrawnReason("CONTROL_CANCEL", 1);
    public static final CodeEvents$RefusalFallbackPromptWithdrawnReason ANSWERED_ELSEWHERE = new CodeEvents$RefusalFallbackPromptWithdrawnReason("ANSWERED_ELSEWHERE", 2);
    public static final CodeEvents$RefusalFallbackPromptWithdrawnReason TURN_ENDED = new CodeEvents$RefusalFallbackPromptWithdrawnReason("TURN_ENDED", 3);

    private static final /* synthetic */ CodeEvents$RefusalFallbackPromptWithdrawnReason[] $values() {
        return new CodeEvents$RefusalFallbackPromptWithdrawnReason[]{UNSPECIFIED, CONTROL_CANCEL, ANSWERED_ELSEWHERE, TURN_ENDED};
    }

    static {
        CodeEvents$RefusalFallbackPromptWithdrawnReason[] codeEvents$RefusalFallbackPromptWithdrawnReasonArr$values = $values();
        $VALUES = codeEvents$RefusalFallbackPromptWithdrawnReasonArr$values;
        $ENTRIES = wd6.n0(codeEvents$RefusalFallbackPromptWithdrawnReasonArr$values);
        Companion = new dv3();
        $cachedSerializer$delegate = yb5.w(w1a.F, new wt3(12));
    }

    private CodeEvents$RefusalFallbackPromptWithdrawnReason(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.CodeEvents.RefusalFallbackPromptWithdrawnReason", values(), new String[]{"unknown", "control_cancel", "answered_elsewhere", "turn_ended"}, new Annotation[][]{null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static CodeEvents$RefusalFallbackPromptWithdrawnReason valueOf(String str) {
        return (CodeEvents$RefusalFallbackPromptWithdrawnReason) Enum.valueOf(CodeEvents$RefusalFallbackPromptWithdrawnReason.class, str);
    }

    public static CodeEvents$RefusalFallbackPromptWithdrawnReason[] values() {
        return (CodeEvents$RefusalFallbackPromptWithdrawnReason[]) $VALUES.clone();
    }
}
