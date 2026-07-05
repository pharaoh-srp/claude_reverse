package defpackage;

import com.anthropic.claude.api.model.BadgeVariant;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class ggf {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[pvg.values().length];
        try {
            iArr[1] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[2] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[BadgeVariant.values().length];
        try {
            iArr2[BadgeVariant.NEUTRAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[BadgeVariant.ACCENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[BadgeVariant.WARNING.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
    }
}
