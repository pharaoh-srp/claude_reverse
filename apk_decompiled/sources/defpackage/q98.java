package defpackage;

import com.anthropic.claude.types.environment.AppEnvironment;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class q98 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[AppEnvironment.values().length];
        try {
            iArr[AppEnvironment.PRODUCTION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AppEnvironment.STAGING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AppEnvironment.DEVELOPMENT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
