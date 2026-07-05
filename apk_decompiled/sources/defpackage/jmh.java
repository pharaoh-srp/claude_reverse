package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class jmh {
    public static final jmh E;
    public static final jmh F;
    public static final jmh G;
    public static final jmh H;
    public static final jmh I;
    public static final /* synthetic */ jmh[] J;

    static {
        jmh jmhVar = new jmh("THINKING", 0);
        E = jmhVar;
        jmh jmhVar2 = new jmh("STILL_THINKING", 1);
        F = jmhVar2;
        jmh jmhVar3 = new jmh("THINKING_MORE", 2);
        G = jmhVar3;
        jmh jmhVar4 = new jmh("THINKING_SOME_MORE", 3);
        H = jmhVar4;
        jmh jmhVar5 = new jmh("ALMOST_DONE_THINKING", 4);
        I = jmhVar5;
        J = new jmh[]{jmhVar, jmhVar2, jmhVar3, jmhVar4, jmhVar5};
    }

    public static jmh valueOf(String str) {
        return (jmh) Enum.valueOf(jmh.class, str);
    }

    public static jmh[] values() {
        return (jmh[]) J.clone();
    }
}
