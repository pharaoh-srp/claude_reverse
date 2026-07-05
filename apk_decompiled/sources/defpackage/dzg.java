package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class dzg {
    public static final dzg E;
    public static final dzg F;
    public static final dzg G;
    public static final dzg H;
    public static final dzg I;
    public static final /* synthetic */ dzg[] J;

    static {
        dzg dzgVar = new dzg("END", 0);
        E = dzgVar;
        dzg dzgVar2 = new dzg("ROLLBACK", 1);
        F = dzgVar2;
        dzg dzgVar3 = new dzg("BEGIN_EXCLUSIVE", 2);
        G = dzgVar3;
        dzg dzgVar4 = new dzg("BEGIN_IMMEDIATE", 3);
        H = dzgVar4;
        dzg dzgVar5 = new dzg("BEGIN_DEFERRED", 4);
        I = dzgVar5;
        J = new dzg[]{dzgVar, dzgVar2, dzgVar3, dzgVar4, dzgVar5};
    }

    public static dzg valueOf(String str) {
        return (dzg) Enum.valueOf(dzg.class, str);
    }

    public static dzg[] values() {
        return (dzg[]) J.clone();
    }
}
