package defpackage;

import com.anthropic.claude.api.model.BadgeVariant;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class g32 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[BadgeVariant.values().length];
        try {
            iArr[BadgeVariant.NEUTRAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BadgeVariant.ACCENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[BadgeVariant.WARNING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
