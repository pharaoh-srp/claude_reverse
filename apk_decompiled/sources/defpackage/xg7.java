package defpackage;

import com.anthropic.claude.analytics.events.MobileAppFeedbackEvents$FeedbackType;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class xg7 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[MobileAppFeedbackEvents$FeedbackType.values().length];
        try {
            iArr[MobileAppFeedbackEvents$FeedbackType.BUG_REPORT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MobileAppFeedbackEvents$FeedbackType.FEATURE_REQUEST.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[MobileAppFeedbackEvents$FeedbackType.GENERAL_FEEDBACK.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[MobileAppFeedbackEvents$FeedbackType.OTHER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[MobileAppFeedbackEvents$FeedbackType.UNSPECIFIED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
