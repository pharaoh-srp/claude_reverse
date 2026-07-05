package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class fm1 {
    public static final fm1 E;
    public static final fm1 F;
    public static final fm1 G;
    public static final fm1 H;
    public static final fm1 I;
    public static final fm1 J;
    public static final fm1 K;
    public static final fm1 L;
    public static final fm1 M;
    public static final fm1 N;
    public static final fm1 O;
    public static final fm1 P;
    public static final fm1 Q;
    public static final fm1 R;
    public static final fm1 S;
    public static final fm1 T;
    public static final fm1 U;
    public static final fm1 V;
    public static final fm1 W;
    public static final /* synthetic */ fm1[] X;

    static {
        fm1 fm1Var = new fm1("NONE", 0);
        E = fm1Var;
        fm1 fm1Var2 = new fm1("CONNECTING", 1);
        F = fm1Var2;
        fm1 fm1Var3 = new fm1("RECONNECTING", 2);
        G = fm1Var3;
        fm1 fm1Var4 = new fm1("DISCONNECTED", 3);
        H = fm1Var4;
        fm1 fm1Var5 = new fm1("LISTENING", 4);
        I = fm1Var5;
        fm1 fm1Var6 = new fm1("HOLD_TO_TALK", 5);
        J = fm1Var6;
        fm1 fm1Var7 = new fm1("RELEASE_TO_SEND", 6);
        K = fm1Var7;
        fm1 fm1Var8 = new fm1("TAP_TO_SEND", 7);
        fm1 fm1Var9 = new fm1("JUST_A_SEC", 8);
        L = fm1Var9;
        fm1 fm1Var10 = new fm1("TAP_TO_INTERRUPT", 9);
        M = fm1Var10;
        fm1 fm1Var11 = new fm1("SEARCHING", 10);
        N = fm1Var11;
        fm1 fm1Var12 = new fm1("WORKING", 11);
        O = fm1Var12;
        fm1 fm1Var13 = new fm1("WAITING_FOR_TOOL_APPROVAL", 12);
        P = fm1Var13;
        fm1 fm1Var14 = new fm1("THINKING", 13);
        Q = fm1Var14;
        fm1 fm1Var15 = new fm1("VOLUME_MUTED", 14);
        R = fm1Var15;
        fm1 fm1Var16 = new fm1("MUTED", 15);
        S = fm1Var16;
        fm1 fm1Var17 = new fm1("HELD", 16);
        T = fm1Var17;
        fm1 fm1Var18 = new fm1("RATE_LIMIT_EXCEEDS", 17);
        U = fm1Var18;
        fm1 fm1Var19 = new fm1("ERROR_FATAL", 18);
        V = fm1Var19;
        fm1 fm1Var20 = new fm1("ERROR_TEMPORARY", 19);
        W = fm1Var20;
        X = new fm1[]{fm1Var, fm1Var2, fm1Var3, fm1Var4, fm1Var5, fm1Var6, fm1Var7, fm1Var8, fm1Var9, fm1Var10, fm1Var11, fm1Var12, fm1Var13, fm1Var14, fm1Var15, fm1Var16, fm1Var17, fm1Var18, fm1Var19, fm1Var20, new fm1("ENGLISH_ONLY_DISCLAIMER", 20)};
    }

    public static fm1 valueOf(String str) {
        return (fm1) Enum.valueOf(fm1.class, str);
    }

    public static fm1[] values() {
        return (fm1[]) X.clone();
    }
}
