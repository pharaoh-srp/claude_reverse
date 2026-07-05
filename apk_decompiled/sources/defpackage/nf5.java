package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class nf5 {
    public static final nf5 E;
    public static final /* synthetic */ nf5[] F;

    static {
        nf5 nf5Var = new nf5("Resize", 0);
        E = nf5Var;
        F = new nf5[]{nf5Var, new nf5("Fixed", 1)};
    }

    public static nf5 valueOf(String str) {
        return (nf5) Enum.valueOf(nf5.class, str);
    }

    public static nf5[] values() {
        return (nf5[]) F.clone();
    }
}
