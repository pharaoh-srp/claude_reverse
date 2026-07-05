package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class z1i {
    public static final z1i E;
    public static final z1i F;
    public static final /* synthetic */ z1i[] G;

    static {
        z1i z1iVar = new z1i("BottomCenter", 0);
        E = z1iVar;
        z1i z1iVar2 = new z1i("TopCenter", 1);
        F = z1iVar2;
        G = new z1i[]{z1iVar, z1iVar2};
    }

    public static z1i valueOf(String str) {
        return (z1i) Enum.valueOf(z1i.class, str);
    }

    public static z1i[] values() {
        return (z1i[]) G.clone();
    }
}
