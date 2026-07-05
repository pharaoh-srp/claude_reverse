package defpackage;

import com.anthropic.claude.api.experience.ExperienceAssetResizeMode;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class t87 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ExperienceAssetResizeMode.values().length];
        try {
            iArr[ExperienceAssetResizeMode.UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ExperienceAssetResizeMode.FIXED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ExperienceAssetResizeMode.ASPECT_FIT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ExperienceAssetResizeMode.ASPECT_FILL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
