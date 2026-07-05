package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class hbc {
    public static final hbc E;
    public static final hbc F;
    public static final hbc G;
    public static final /* synthetic */ hbc[] H;

    static {
        hbc hbcVar = new hbc("NO_OP", 0);
        E = hbcVar;
        hbc hbcVar2 = new hbc("ADD", 1);
        F = hbcVar2;
        hbc hbcVar3 = new hbc("REMOVE", 2);
        G = hbcVar3;
        H = new hbc[]{hbcVar, hbcVar2, hbcVar3};
    }

    public static hbc valueOf(String str) {
        return (hbc) Enum.valueOf(hbc.class, str);
    }

    public static hbc[] values() {
        return (hbc[]) H.clone();
    }
}
