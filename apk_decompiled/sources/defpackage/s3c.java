package defpackage;

import com.anthropic.claude.sessions.types.PermissionMode;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class s3c {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PermissionMode.values().length];
        try {
            iArr[PermissionMode.Plan.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PermissionMode.Default.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PermissionMode.Auto.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
