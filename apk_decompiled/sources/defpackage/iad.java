package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public abstract class iad {
    public static final had E;
    public static final gad F;
    public static final /* synthetic */ iad[] G;

    static {
        had hadVar = new had();
        E = hadVar;
        gad gadVar = new gad();
        F = gadVar;
        G = new iad[]{hadVar, gadVar};
    }

    public static iad valueOf(String str) {
        return (iad) Enum.valueOf(iad.class, str);
    }

    public static iad[] values() {
        return (iad[]) G.clone();
    }

    public abstract String a();

    public abstract double b();
}
