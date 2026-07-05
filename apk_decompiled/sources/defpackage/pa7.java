package defpackage;

import com.anthropic.claude.api.experience.BulletsStyle;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class pa7 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[BulletsStyle.values().length];
        try {
            iArr[BulletsStyle.CARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BulletsStyle.PLAIN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
