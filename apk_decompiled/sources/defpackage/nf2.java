package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class nf2 {
    public static final nf2 E;
    public static final /* synthetic */ nf2[] F;

    /* JADX INFO: Fake field, exist only in values array */
    nf2 EF0;

    static {
        nf2 nf2Var = new nf2("Auto", 0);
        nf2 nf2Var2 = new nf2("Up", 1);
        E = nf2Var2;
        F = new nf2[]{nf2Var, nf2Var2, new nf2("Down", 2)};
    }

    public static nf2 valueOf(String str) {
        return (nf2) Enum.valueOf(nf2.class, str);
    }

    public static nf2[] values() {
        return (nf2[]) F.clone();
    }
}
