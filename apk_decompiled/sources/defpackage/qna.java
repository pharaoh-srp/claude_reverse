package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class qna {
    public static final qna E;
    public static final /* synthetic */ qna[] F;

    static {
        qna qnaVar = new qna("MergePathsApi19", 0);
        E = qnaVar;
        F = new qna[]{qnaVar};
    }

    public static qna valueOf(String str) {
        return (qna) Enum.valueOf(qna.class, str);
    }

    public static qna[] values() {
        return (qna[]) F.clone();
    }
}
