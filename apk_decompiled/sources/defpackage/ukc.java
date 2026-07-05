package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ukc {
    public static final ukc E;
    public static final ukc F;
    public static final /* synthetic */ ukc[] G;

    static {
        ukc ukcVar = new ukc("Vertical", 0);
        E = ukcVar;
        ukc ukcVar2 = new ukc("Horizontal", 1);
        F = ukcVar2;
        G = new ukc[]{ukcVar, ukcVar2};
    }

    public static ukc valueOf(String str) {
        return (ukc) Enum.valueOf(ukc.class, str);
    }

    public static ukc[] values() {
        return (ukc[]) G.clone();
    }
}
