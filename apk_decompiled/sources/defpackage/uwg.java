package defpackage;

import com.anthropic.claude.api.account.RavenType;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class uwg {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[RavenType.values().length];
        try {
            iArr[RavenType.ENTERPRISE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
        int[] iArr2 = new int[pvg.values().length];
        try {
            iArr2[0] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[1] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[2] = 3;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[3] = 4;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
