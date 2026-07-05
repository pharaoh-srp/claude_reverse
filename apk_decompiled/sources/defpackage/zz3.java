package defpackage;

import com.anthropic.claude.sessions.types.SummaryStatusCategory;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class zz3 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SummaryStatusCategory.values().length];
        try {
            iArr[SummaryStatusCategory.WAITING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SummaryStatusCategory.BLOCKED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SummaryStatusCategory.NEED_INPUT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SummaryStatusCategory.FAILED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[SummaryStatusCategory.REVIEW_READY.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[SummaryStatusCategory.COMPLETED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[SummaryStatusCategory.UNKNOWN.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        a = iArr;
    }
}
