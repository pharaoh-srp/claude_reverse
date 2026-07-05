package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class y3a {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ y3a[] $VALUES;
    public static final w3a Companion;
    public static final y3a ON_ANY;
    public static final y3a ON_CREATE;
    public static final y3a ON_DESTROY;
    public static final y3a ON_PAUSE;
    public static final y3a ON_RESUME;
    public static final y3a ON_START;
    public static final y3a ON_STOP;

    static {
        y3a y3aVar = new y3a("ON_CREATE", 0);
        ON_CREATE = y3aVar;
        y3a y3aVar2 = new y3a("ON_START", 1);
        ON_START = y3aVar2;
        y3a y3aVar3 = new y3a("ON_RESUME", 2);
        ON_RESUME = y3aVar3;
        y3a y3aVar4 = new y3a("ON_PAUSE", 3);
        ON_PAUSE = y3aVar4;
        y3a y3aVar5 = new y3a("ON_STOP", 4);
        ON_STOP = y3aVar5;
        y3a y3aVar6 = new y3a("ON_DESTROY", 5);
        ON_DESTROY = y3aVar6;
        y3a y3aVar7 = new y3a("ON_ANY", 6);
        ON_ANY = y3aVar7;
        y3a[] y3aVarArr = {y3aVar, y3aVar2, y3aVar3, y3aVar4, y3aVar5, y3aVar6, y3aVar7};
        $VALUES = y3aVarArr;
        $ENTRIES = new gq6(y3aVarArr);
        Companion = new w3a();
    }

    public static y3a valueOf(String str) {
        return (y3a) Enum.valueOf(y3a.class, str);
    }

    public static y3a[] values() {
        return (y3a[]) $VALUES.clone();
    }

    public final a4a a() {
        switch (x3a.a[ordinal()]) {
            case 1:
            case 2:
                return a4a.G;
            case 3:
            case 4:
                return a4a.H;
            case 5:
                return a4a.I;
            case 6:
                return a4a.E;
            case 7:
                throw new IllegalArgumentException(this + " has no target state");
            default:
                mr9.b();
                return null;
        }
    }
}
