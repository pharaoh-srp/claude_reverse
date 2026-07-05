package com.anthropic.claude.analytics.events;

import defpackage.clb;
import defpackage.fq6;
import defpackage.g9b;
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
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"com/anthropic/claude/analytics/events/MobileAppFeedbackEvents$FeedbackType", "", "Lcom/anthropic/claude/analytics/events/MobileAppFeedbackEvents$FeedbackType;", "<init>", "(Ljava/lang/String;I)V", "Companion", "clb", "UNSPECIFIED", "BUG_REPORT", "FEATURE_REQUEST", "OTHER", "GENERAL_FEEDBACK", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class MobileAppFeedbackEvents$FeedbackType {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ MobileAppFeedbackEvents$FeedbackType[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final clb Companion;
    public static final MobileAppFeedbackEvents$FeedbackType UNSPECIFIED = new MobileAppFeedbackEvents$FeedbackType("UNSPECIFIED", 0);
    public static final MobileAppFeedbackEvents$FeedbackType BUG_REPORT = new MobileAppFeedbackEvents$FeedbackType("BUG_REPORT", 1);
    public static final MobileAppFeedbackEvents$FeedbackType FEATURE_REQUEST = new MobileAppFeedbackEvents$FeedbackType("FEATURE_REQUEST", 2);
    public static final MobileAppFeedbackEvents$FeedbackType OTHER = new MobileAppFeedbackEvents$FeedbackType("OTHER", 3);
    public static final MobileAppFeedbackEvents$FeedbackType GENERAL_FEEDBACK = new MobileAppFeedbackEvents$FeedbackType("GENERAL_FEEDBACK", 4);

    private static final /* synthetic */ MobileAppFeedbackEvents$FeedbackType[] $values() {
        return new MobileAppFeedbackEvents$FeedbackType[]{UNSPECIFIED, BUG_REPORT, FEATURE_REQUEST, OTHER, GENERAL_FEEDBACK};
    }

    static {
        MobileAppFeedbackEvents$FeedbackType[] mobileAppFeedbackEvents$FeedbackTypeArr$values = $values();
        $VALUES = mobileAppFeedbackEvents$FeedbackTypeArr$values;
        $ENTRIES = wd6.n0(mobileAppFeedbackEvents$FeedbackTypeArr$values);
        Companion = new clb();
        $cachedSerializer$delegate = yb5.w(w1a.F, new g9b(23));
    }

    private MobileAppFeedbackEvents$FeedbackType(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.MobileAppFeedbackEvents.FeedbackType", values(), new String[]{"unknown", "bug-report", "feature-request", "other", "general-feedback"}, new Annotation[][]{null, null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static MobileAppFeedbackEvents$FeedbackType valueOf(String str) {
        return (MobileAppFeedbackEvents$FeedbackType) Enum.valueOf(MobileAppFeedbackEvents$FeedbackType.class, str);
    }

    public static MobileAppFeedbackEvents$FeedbackType[] values() {
        return (MobileAppFeedbackEvents$FeedbackType[]) $VALUES.clone();
    }
}
