package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class mgf {
    public static final mgf E;
    public static final mgf F;
    public static final mgf G;
    public static final mgf H;
    public static final /* synthetic */ mgf[] I;

    static {
        mgf mgfVar = new mgf("Spacer", 0);
        E = mgfVar;
        mgf mgfVar2 = new mgf("Loading", 1);
        F = mgfVar2;
        mgf mgfVar3 = new mgf("EmptyState", 2);
        G = mgfVar3;
        mgf mgfVar4 = new mgf("PaginationLoading", 3);
        H = mgfVar4;
        I = new mgf[]{mgfVar, mgfVar2, mgfVar3, mgfVar4};
    }

    public static mgf valueOf(String str) {
        return (mgf) Enum.valueOf(mgf.class, str);
    }

    public static mgf[] values() {
        return (mgf[]) I.clone();
    }
}
