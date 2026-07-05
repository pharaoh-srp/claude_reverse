package defpackage;

import com.anthropic.claude.tool.model.AskUserInputV0InputQuestionsItemType;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class qv0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[AskUserInputV0InputQuestionsItemType.values().length];
        try {
            iArr[AskUserInputV0InputQuestionsItemType.SINGLE_SELECT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AskUserInputV0InputQuestionsItemType.MULTI_SELECT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AskUserInputV0InputQuestionsItemType.RANK_PRIORITIES.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
