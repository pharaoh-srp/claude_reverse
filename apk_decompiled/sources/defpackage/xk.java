package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class xk {
    public static final xk E;
    public static final xk F;
    public static final xk G;
    public static final xk H;
    public static final xk I;
    public static final xk J;
    public static final xk K;
    public static final xk L;
    public static final /* synthetic */ xk[] M;

    static {
        xk xkVar = new xk("LOAD_SESSIONS_FAILED", 0);
        E = xkVar;
        xk xkVar2 = new xk("SEND_MESSAGE_FAILED", 1);
        F = xkVar2;
        xk xkVar3 = new xk("MESSAGE_DELIVERY_DELAYED", 2);
        G = xkVar3;
        xk xkVar4 = new xk("TOOL_APPROVAL_FAILED", 3);
        H = xkVar4;
        xk xkVar5 = new xk("DOWNLOAD_FAILED", 4);
        I = xkVar5;
        xk xkVar6 = new xk("FILE_TOO_LARGE", 5);
        J = xkVar6;
        xk xkVar7 = new xk("UPLOAD_FAILED", 6);
        K = xkVar7;
        xk xkVar8 = new xk("DOWNLOAD_STARTED", 7);
        L = xkVar8;
        M = new xk[]{xkVar, xkVar2, xkVar3, xkVar4, xkVar5, xkVar6, xkVar7, xkVar8};
    }

    public static xk valueOf(String str) {
        return (xk) Enum.valueOf(xk.class, str);
    }

    public static xk[] values() {
        return (xk[]) M.clone();
    }
}
