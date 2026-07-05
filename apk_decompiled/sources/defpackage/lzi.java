package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class lzi {
    public static final lzi E;
    public static final /* synthetic */ lzi[] F;

    static {
        lzi lziVar = new lzi("Visible", 0);
        E = lziVar;
        F = new lzi[]{lziVar, new lzi("Invisible", 1), new lzi("Gone", 2)};
    }

    public static lzi valueOf(String str) {
        return (lzi) Enum.valueOf(lzi.class, str);
    }

    public static lzi[] values() {
        return (lzi[]) F.clone();
    }
}
