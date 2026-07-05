package defpackage;

import com.anthropic.claude.api.chat.tool.ResearchStatus;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class ple {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ResearchStatus.values().length];
        try {
            iArr[ResearchStatus.STARTING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ResearchStatus.PLANNING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
