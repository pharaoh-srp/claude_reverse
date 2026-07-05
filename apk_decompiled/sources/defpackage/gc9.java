package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class gc9 {
    public static final gc9 E;
    public static final /* synthetic */ gc9[] F;

    static {
        gc9 gc9Var = new gc9("Spacer", 0);
        E = gc9Var;
        F = new gc9[]{gc9Var};
    }

    public static gc9 valueOf(String str) {
        return (gc9) Enum.valueOf(gc9.class, str);
    }

    public static gc9[] values() {
        return (gc9[]) F.clone();
    }
}
