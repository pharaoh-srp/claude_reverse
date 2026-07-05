package defpackage;

import com.anthropic.claude.analytics.events.ChatEvents$AddFileFailureReason;
import com.anthropic.claude.analytics.events.ChatEvents$AddImageFailureReason;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class h21 {
    public static final h21 E;
    public static final h21 F;
    public static final h21 G;
    public static final h21 H;
    public static final h21 I;
    public static final h21 J;
    public static final h21 K;
    public static final h21 L;
    public static final h21 M;
    public static final /* synthetic */ h21[] N;

    static {
        h21 h21Var = new h21("ERROR_LOCAL_PROCESSING", 0);
        E = h21Var;
        h21 h21Var2 = new h21("ERROR_UPLOADING", 1);
        F = h21Var2;
        h21 h21Var3 = new h21("CANCELLED", 2);
        G = h21Var3;
        h21 h21Var4 = new h21("REJECTED_FILE_TOO_LARGE", 3);
        H = h21Var4;
        h21 h21Var5 = new h21("REJECTED_ATTACHMENT_LIMIT", 4);
        I = h21Var5;
        h21 h21Var6 = new h21("SERVER_RATE_LIMITED", 5);
        J = h21Var6;
        h21 h21Var7 = new h21("SERVER_UNSUPPORTED_FORMAT", 6);
        K = h21Var7;
        h21 h21Var8 = new h21("SERVER_FILE_TOO_LARGE", 7);
        L = h21Var8;
        h21 h21Var9 = new h21("NETWORK_ERROR", 8);
        M = h21Var9;
        N = new h21[]{h21Var, h21Var2, h21Var3, h21Var4, h21Var5, h21Var6, h21Var7, h21Var8, h21Var9};
    }

    public static h21 valueOf(String str) {
        return (h21) Enum.valueOf(h21.class, str);
    }

    public static h21[] values() {
        return (h21[]) N.clone();
    }

    public final ChatEvents$AddFileFailureReason a() {
        switch (ordinal()) {
            case 0:
                return ChatEvents$AddFileFailureReason.ERROR_LOCAL_PROCESSING;
            case 1:
                return ChatEvents$AddFileFailureReason.ERROR_UPLOADING;
            case 2:
                return ChatEvents$AddFileFailureReason.CANCELLED;
            case 3:
                return ChatEvents$AddFileFailureReason.REJECTED_FILE_TOO_LARGE;
            case 4:
                return ChatEvents$AddFileFailureReason.REJECTED_ATTACHMENT_LIMIT;
            case 5:
                return ChatEvents$AddFileFailureReason.SERVER_RATE_LIMITED;
            case 6:
                return ChatEvents$AddFileFailureReason.SERVER_UNSUPPORTED_FORMAT;
            case 7:
                return ChatEvents$AddFileFailureReason.SERVER_FILE_TOO_LARGE;
            case 8:
                return ChatEvents$AddFileFailureReason.NETWORK_ERROR;
            default:
                wg6.i();
                return null;
        }
    }

    public final ChatEvents$AddImageFailureReason b() {
        switch (ordinal()) {
            case 0:
                return ChatEvents$AddImageFailureReason.ERROR_LOCAL_PROCESSING;
            case 1:
                return ChatEvents$AddImageFailureReason.ERROR_UPLOADING;
            case 2:
                return ChatEvents$AddImageFailureReason.CANCELLED;
            case 3:
                return ChatEvents$AddImageFailureReason.REJECTED_FILE_TOO_LARGE;
            case 4:
                return ChatEvents$AddImageFailureReason.REJECTED_ATTACHMENT_LIMIT;
            case 5:
            case 6:
            case 7:
            case 8:
                return ChatEvents$AddImageFailureReason.ERROR_UPLOADING;
            default:
                wg6.i();
                return null;
        }
    }
}
