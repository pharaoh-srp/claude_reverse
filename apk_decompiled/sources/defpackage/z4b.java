package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class z4b {
    public static final z4b E;
    public static final z4b F;
    public static final z4b G;
    public static final /* synthetic */ z4b[] H;
    public static final /* synthetic */ gq6 I;

    static {
        z4b z4bVar = new z4b("ALLOW", 0);
        E = z4bVar;
        z4b z4bVar2 = new z4b("ASK", 1);
        F = z4bVar2;
        z4b z4bVar3 = new z4b("BLOCKED", 2);
        G = z4bVar3;
        z4b[] z4bVarArr = {z4bVar, z4bVar2, z4bVar3};
        H = z4bVarArr;
        I = new gq6(z4bVarArr);
    }

    public static z4b valueOf(String str) {
        return (z4b) Enum.valueOf(z4b.class, str);
    }

    public static z4b[] values() {
        return (z4b[]) H.clone();
    }
}
