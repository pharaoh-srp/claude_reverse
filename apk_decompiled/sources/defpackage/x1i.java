package defpackage;

import com.anthropic.claude.api.experience.ExperienceTooltipActionType;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class x1i {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ExperienceTooltipActionType.values().length];
        try {
            iArr[ExperienceTooltipActionType.OPEN_MODEL_SELECTOR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ExperienceTooltipActionType.DISMISS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ExperienceTooltipActionType.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
