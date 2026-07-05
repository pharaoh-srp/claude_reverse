package com.anthropic.claude.analytics.events;

import defpackage.fq6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.ulb;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.wmb;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"com/anthropic/claude/analytics/events/MobileToolEvents$MobileToolOutcome", "", "Lcom/anthropic/claude/analytics/events/MobileToolEvents$MobileToolOutcome;", "<init>", "(Ljava/lang/String;I)V", "Companion", "wmb", "UNSPECIFIED", "OK", "INPUT_PARSE_ERROR", "OUTPUT_PARSE_ERROR", "UNSUPPORTED_CONTENT", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class MobileToolEvents$MobileToolOutcome {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ MobileToolEvents$MobileToolOutcome[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final wmb Companion;
    public static final MobileToolEvents$MobileToolOutcome UNSPECIFIED = new MobileToolEvents$MobileToolOutcome("UNSPECIFIED", 0);
    public static final MobileToolEvents$MobileToolOutcome OK = new MobileToolEvents$MobileToolOutcome("OK", 1);
    public static final MobileToolEvents$MobileToolOutcome INPUT_PARSE_ERROR = new MobileToolEvents$MobileToolOutcome("INPUT_PARSE_ERROR", 2);
    public static final MobileToolEvents$MobileToolOutcome OUTPUT_PARSE_ERROR = new MobileToolEvents$MobileToolOutcome("OUTPUT_PARSE_ERROR", 3);
    public static final MobileToolEvents$MobileToolOutcome UNSUPPORTED_CONTENT = new MobileToolEvents$MobileToolOutcome("UNSUPPORTED_CONTENT", 4);

    private static final /* synthetic */ MobileToolEvents$MobileToolOutcome[] $values() {
        return new MobileToolEvents$MobileToolOutcome[]{UNSPECIFIED, OK, INPUT_PARSE_ERROR, OUTPUT_PARSE_ERROR, UNSUPPORTED_CONTENT};
    }

    static {
        MobileToolEvents$MobileToolOutcome[] mobileToolEvents$MobileToolOutcomeArr$values = $values();
        $VALUES = mobileToolEvents$MobileToolOutcomeArr$values;
        $ENTRIES = wd6.n0(mobileToolEvents$MobileToolOutcomeArr$values);
        Companion = new wmb();
        $cachedSerializer$delegate = yb5.w(w1a.F, new ulb(13));
    }

    private MobileToolEvents$MobileToolOutcome(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.MobileToolEvents.MobileToolOutcome", values(), new String[]{"unknown", "ok", "input_parse_error", "output_parse_error", "unsupported_content"}, new Annotation[][]{null, null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static MobileToolEvents$MobileToolOutcome valueOf(String str) {
        return (MobileToolEvents$MobileToolOutcome) Enum.valueOf(MobileToolEvents$MobileToolOutcome.class, str);
    }

    public static MobileToolEvents$MobileToolOutcome[] values() {
        return (MobileToolEvents$MobileToolOutcome[]) $VALUES.clone();
    }
}
