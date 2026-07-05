package defpackage;

import com.anthropic.claude.tool.model.MessageComposeV1InputKind;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class ofb {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[MessageComposeV1InputKind.values().length];
        try {
            iArr[MessageComposeV1InputKind.EMAIL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MessageComposeV1InputKind.TEXTMESSAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[MessageComposeV1InputKind.OTHER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
