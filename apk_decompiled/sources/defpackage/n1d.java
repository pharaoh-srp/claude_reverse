package defpackage;

import com.anthropic.claude.tool.model.PhoneCallCompletedOutputTranscriptItemSpeaker;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class n1d {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PhoneCallCompletedOutputTranscriptItemSpeaker.values().length];
        try {
            iArr[PhoneCallCompletedOutputTranscriptItemSpeaker.AGENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PhoneCallCompletedOutputTranscriptItemSpeaker.CALLEE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
