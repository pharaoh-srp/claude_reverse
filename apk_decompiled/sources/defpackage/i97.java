package defpackage;

import com.anthropic.claude.api.experience.ExperienceButtonType;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class i97 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ExperienceButtonType.values().length];
        try {
            iArr[ExperienceButtonType.PRIMARY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ExperienceButtonType.SECONDARY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ExperienceButtonType.DESTRUCTIVE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ExperienceButtonType.TINTED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ExperienceButtonType.UNKNOWN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
