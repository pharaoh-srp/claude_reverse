package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class fji {
    public static final fji E;
    public static final fji F;
    public static final /* synthetic */ fji[] G;

    static {
        fji fjiVar = new fji("DEFAULT", 0);
        E = fjiVar;
        fji fjiVar2 = new fji("PROJECTS", 1);
        F = fjiVar2;
        G = new fji[]{fjiVar, fjiVar2};
    }

    public static fji valueOf(String str) {
        return (fji) Enum.valueOf(fji.class, str);
    }

    public static fji[] values() {
        return (fji[]) G.clone();
    }
}
