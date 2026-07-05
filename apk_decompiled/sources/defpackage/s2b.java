package defpackage;

import com.anthropic.claude.api.mcp.McpToolMaxPermission;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class s2b {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[McpToolMaxPermission.values().length];
        try {
            iArr[McpToolMaxPermission.ASK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[McpToolMaxPermission.BLOCKED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[McpToolMaxPermission.ALLOW.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[McpToolMaxPermission.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
        int[] iArr2 = new int[z4b.values().length];
        try {
            iArr2[0] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[2] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[1] = 3;
        } catch (NoSuchFieldError unused7) {
        }
    }
}
