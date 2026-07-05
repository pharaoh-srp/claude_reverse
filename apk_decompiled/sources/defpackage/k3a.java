package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class k3a {
    public static final k3a E;
    public static final k3a F;
    public static final k3a G;
    public static final k3a H;
    public static final k3a I;
    public static final /* synthetic */ k3a[] J;

    static {
        k3a k3aVar = new k3a("DEBUG", 0);
        E = k3aVar;
        k3a k3aVar2 = new k3a("INFO", 1);
        F = k3aVar2;
        k3a k3aVar3 = new k3a("WARNING", 2);
        G = k3aVar3;
        k3a k3aVar4 = new k3a("ERROR", 3);
        H = k3aVar4;
        k3a k3aVar5 = new k3a("NONE", 4);
        I = k3aVar5;
        J = new k3a[]{k3aVar, k3aVar2, k3aVar3, k3aVar4, k3aVar5};
    }

    public static k3a valueOf(String str) {
        return (k3a) Enum.valueOf(k3a.class, str);
    }

    public static k3a[] values() {
        return (k3a[]) J.clone();
    }
}
