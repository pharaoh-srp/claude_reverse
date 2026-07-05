package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class bjh {
    public static final bjh E;
    public static final bjh F;
    public static final /* synthetic */ bjh[] G;

    static {
        bjh bjhVar = new bjh("Filled", 0);
        E = bjhVar;
        bjh bjhVar2 = new bjh("Outlined", 1);
        F = bjhVar2;
        G = new bjh[]{bjhVar, bjhVar2};
    }

    public static bjh valueOf(String str) {
        return (bjh) Enum.valueOf(bjh.class, str);
    }

    public static bjh[] values() {
        return (bjh[]) G.clone();
    }
}
