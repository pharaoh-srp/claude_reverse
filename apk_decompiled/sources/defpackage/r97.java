package defpackage;

import com.anthropic.claude.api.experience.CacheType;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class r97 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CacheType.values().length];
        try {
            iArr[CacheType.ACCOUNT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CacheType.ACCOUNT_SETTINGS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CacheType.ACCOUNT_PROFILE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[CacheType.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
