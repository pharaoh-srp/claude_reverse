package defpackage;

import com.anthropic.claude.api.project.ProjectSubtype;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class eod {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ProjectSubtype.values().length];
        try {
            iArr[ProjectSubtype.STUDY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ProjectSubtype.CAREER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ProjectSubtype.RESEARCH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
