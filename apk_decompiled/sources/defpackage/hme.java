package defpackage;

import com.anthropic.claude.api.chat.tool.ResearchStatus;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class hme {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ResearchStatus.values().length];
        try {
            iArr[ResearchStatus.CANCELLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ResearchStatus.FAILED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ResearchStatus.CLIENT_TIMEOUT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ResearchStatus.TIMED_OUT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
