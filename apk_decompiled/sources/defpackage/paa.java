package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class paa {
    public static final paa E;
    public static final paa F;
    public static final /* synthetic */ paa[] G;

    static {
        paa paaVar = new paa("Ordered", 0);
        E = paaVar;
        paa paaVar2 = new paa("Unordered", 1);
        F = paaVar2;
        G = new paa[]{paaVar, paaVar2};
    }

    public static paa valueOf(String str) {
        return (paa) Enum.valueOf(paa.class, str);
    }

    public static paa[] values() {
        return (paa[]) G.clone();
    }
}
