package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class jj {
    public static final jj E;
    public static final jj F;
    public static final jj G;
    public static final jj H;
    public static final jj I;
    public static final jj J;
    public static final jj K;
    public static final jj L;
    public static final jj M;
    public static final /* synthetic */ jj[] N;

    static {
        jj jjVar = new jj("Loading", 0);
        E = jjVar;
        jj jjVar2 = new jj("Verified", 1);
        F = jjVar2;
        jj jjVar3 = new jj("Supervised", 2);
        G = jjVar3;
        jj jjVar4 = new jj("DeclaredAdult", 3);
        H = jjVar4;
        jj jjVar5 = new jj("DeclaredMinor", 4);
        I = jjVar5;
        jj jjVar6 = new jj("Declared", 5);
        J = jjVar6;
        jj jjVar7 = new jj("Unknown", 6);
        K = jjVar7;
        jj jjVar8 = new jj("RetryableError", 7);
        L = jjVar8;
        jj jjVar9 = new jj("Skipped", 8);
        M = jjVar9;
        N = new jj[]{jjVar, jjVar2, jjVar3, jjVar4, jjVar5, jjVar6, jjVar7, jjVar8, jjVar9, new jj("Disabled", 9)};
    }

    public static jj valueOf(String str) {
        return (jj) Enum.valueOf(jj.class, str);
    }

    public static jj[] values() {
        return (jj[]) N.clone();
    }

    public final boolean a() {
        return this == G || this == I;
    }
}
