package defpackage;

import com.anthropic.claude.tool.model.MessageComposeV0InputKind;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class mfb {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[MessageComposeV0InputKind.values().length];
        try {
            iArr[MessageComposeV0InputKind.EMAIL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MessageComposeV0InputKind.TEXTMESSAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[MessageComposeV0InputKind.OTHER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
