package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class z3a {
    public static final z3a E;
    public static final z3a F;
    public static final z3a G;
    public static final z3a H;
    public static final z3a I;
    public static final /* synthetic */ z3a[] J;

    static {
        z3a z3aVar = new z3a("DESTROYED", 0);
        E = z3aVar;
        z3a z3aVar2 = new z3a("INITIALIZED", 1);
        F = z3aVar2;
        z3a z3aVar3 = new z3a("CREATED", 2);
        G = z3aVar3;
        z3a z3aVar4 = new z3a("STARTED", 3);
        H = z3aVar4;
        z3a z3aVar5 = new z3a("RESUMED", 4);
        I = z3aVar5;
        J = new z3a[]{z3aVar, z3aVar2, z3aVar3, z3aVar4, z3aVar5};
    }

    public static z3a valueOf(String str) {
        return (z3a) Enum.valueOf(z3a.class, str);
    }

    public static z3a[] values() {
        return (z3a[]) J.clone();
    }
}
