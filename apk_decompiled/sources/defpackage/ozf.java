package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ozf {
    public static final ozf E;
    public static final ozf F;
    public static final ozf G;
    public static final ozf H;
    public static final /* synthetic */ ozf[] I;

    static {
        ozf ozfVar = new ozf("INFO", 0);
        E = ozfVar;
        ozf ozfVar2 = new ozf("WARNING", 1);
        F = ozfVar2;
        ozf ozfVar3 = new ozf("ERROR", 2);
        G = ozfVar3;
        ozf ozfVar4 = new ozf("CRITICAL", 3);
        H = ozfVar4;
        I = new ozf[]{ozfVar, ozfVar2, ozfVar3, ozfVar4};
    }

    public static ozf valueOf(String str) {
        return (ozf) Enum.valueOf(ozf.class, str);
    }

    public static ozf[] values() {
        return (ozf[]) I.clone();
    }
}
