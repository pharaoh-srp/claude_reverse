package defpackage;

import com.anthropic.claude.login.WelcomeNotice;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class sa0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[WelcomeNotice.values().length];
        try {
            iArr[WelcomeNotice.SessionExpired.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[WelcomeNotice.AccountRestricted.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
