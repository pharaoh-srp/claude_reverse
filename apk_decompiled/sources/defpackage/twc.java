package defpackage;

import com.anthropic.claude.api.account.VillageWeaverConsentState;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class twc {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[VillageWeaverConsentState.values().length];
        try {
            iArr[VillageWeaverConsentState.ACCEPTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[VillageWeaverConsentState.PER_SESSION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[VillageWeaverConsentState.DECLINED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[VillageWeaverConsentState.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
