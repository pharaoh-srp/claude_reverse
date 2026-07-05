package defpackage;

import com.anthropic.claude.api.mcp.McpAuthStatus;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class d0b {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[McpAuthStatus.values().length];
        try {
            iArr[McpAuthStatus.TOKEN_INVALID.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[McpAuthStatus.REFRESH_FAILED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[McpAuthStatus.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[McpAuthStatus.NOT_REQUIRED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[McpAuthStatus.AUTHENTICATED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[McpAuthStatus.AUTH_REQUIRED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr;
    }
}
