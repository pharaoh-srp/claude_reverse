package defpackage;

import com.anthropic.claude.api.account.RateLimitUpsell;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class s1e {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[RateLimitUpsell.values().length];
        try {
            iArr[RateLimitUpsell.UPGRADE_TO_PRO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RateLimitUpsell.UPGRADE_TO_MAX.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[RateLimitUpsell.GET_MORE_USAGE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[RateLimitUpsell.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
