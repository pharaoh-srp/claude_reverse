package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class mo9 {
    public static final mo9 E;
    public static final mo9 F;
    public static final mo9 G;
    public static final mo9 H;
    public static final /* synthetic */ mo9[] I;

    static {
        mo9 mo9Var = new mo9("PUBLIC", 0);
        E = mo9Var;
        mo9 mo9Var2 = new mo9("PROTECTED", 1);
        F = mo9Var2;
        mo9 mo9Var3 = new mo9("INTERNAL", 2);
        G = mo9Var3;
        mo9 mo9Var4 = new mo9("PRIVATE", 3);
        H = mo9Var4;
        I = new mo9[]{mo9Var, mo9Var2, mo9Var3, mo9Var4};
    }

    public static mo9 valueOf(String str) {
        return (mo9) Enum.valueOf(mo9.class, str);
    }

    public static mo9[] values() {
        return (mo9[]) I.clone();
    }
}
