package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ovg {
    public static final ovg E;
    public static final ovg F;
    public static final ovg G;
    public static final ovg H;
    public static final ovg I;
    public static final ovg J;
    public static final ovg K;
    public static final ovg L;
    public static final ovg M;
    public static final ovg N;
    public static final ovg O;
    public static final ovg P;
    public static final /* synthetic */ ovg[] Q;

    static {
        ovg ovgVar = new ovg("CONNECTION_ERROR", 0);
        E = ovgVar;
        ovg ovgVar2 = new ovg("SERVICE_DISCONNECTED", 1);
        F = ovgVar2;
        ovg ovgVar3 = new ovg("SERVICE_UNAVAILABLE", 2);
        G = ovgVar3;
        ovg ovgVar4 = new ovg("BILLING_UNAVAILABLE", 3);
        H = ovgVar4;
        ovg ovgVar5 = new ovg("NETWORK_ERROR", 4);
        I = ovgVar5;
        ovg ovgVar6 = new ovg("MISMATCH_ACCOUNT_ID", 5);
        J = ovgVar6;
        ovg ovgVar7 = new ovg("PENDING_PURCHASE", 6);
        K = ovgVar7;
        ovg ovgVar8 = new ovg("VERIFY_PLAY_PURCHASE", 7);
        L = ovgVar8;
        ovg ovgVar9 = new ovg("REFRESH_ACCOUNT", 8);
        M = ovgVar9;
        ovg ovgVar10 = new ovg("UNKNOWN_TRY_AGAIN", 9);
        N = ovgVar10;
        ovg ovgVar11 = new ovg("UNKNOWN_UPDATE_APP", 10);
        O = ovgVar11;
        ovg ovgVar12 = new ovg("DEVELOPER_ERROR", 11);
        P = ovgVar12;
        Q = new ovg[]{ovgVar, ovgVar2, ovgVar3, ovgVar4, ovgVar5, ovgVar6, ovgVar7, ovgVar8, ovgVar9, ovgVar10, ovgVar11, ovgVar12};
    }

    public static ovg valueOf(String str) {
        return (ovg) Enum.valueOf(ovg.class, str);
    }

    public static ovg[] values() {
        return (ovg[]) Q.clone();
    }
}
