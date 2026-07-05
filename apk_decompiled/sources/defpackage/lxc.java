package defpackage;

import com.anthropic.claude.sessions.types.PermissionMode;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class lxc {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[r71.values().length];
        try {
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[1] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[PermissionMode.values().length];
        try {
            iArr2[PermissionMode.Plan.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[PermissionMode.Default.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[PermissionMode.Auto.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr2;
    }
}
