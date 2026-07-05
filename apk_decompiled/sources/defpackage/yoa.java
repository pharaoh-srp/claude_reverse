package defpackage;

import com.anthropic.claude.api.login.CodeConfiguration;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class yoa {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CodeConfiguration.CharSet.values().length];
        try {
            iArr[CodeConfiguration.CharSet.ALPHANUMERIC.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CodeConfiguration.CharSet.NUMERIC.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
