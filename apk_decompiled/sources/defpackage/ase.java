package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ase {
    public static final ase E;
    public static final ase F;
    public static final /* synthetic */ ase[] G;

    static {
        ase aseVar = new ase("Content", 0);
        E = aseVar;
        ase aseVar2 = new ase("Actions", 1);
        F = aseVar2;
        G = new ase[]{aseVar, aseVar2};
    }

    public static ase valueOf(String str) {
        return (ase) Enum.valueOf(ase.class, str);
    }

    public static ase[] values() {
        return (ase[]) G.clone();
    }
}
