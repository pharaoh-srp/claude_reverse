package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class tb {
    public static final tb E;
    public static final tb F;
    public static final /* synthetic */ tb[] G;

    /* JADX INFO: Fake field, exist only in values array */
    tb EF0;

    static {
        tb tbVar = new tb("ACTIVITY", 0);
        tb tbVar2 = new tb("BROADCAST", 1);
        E = tbVar2;
        tb tbVar3 = new tb("SERVICE", 2);
        tb tbVar4 = new tb("FOREGROUND_SERVICE", 3);
        tb tbVar5 = new tb("CALLBACK", 4);
        F = tbVar5;
        G = new tb[]{tbVar, tbVar2, tbVar3, tbVar4, tbVar5};
    }

    public static tb valueOf(String str) {
        return (tb) Enum.valueOf(tb.class, str);
    }

    public static tb[] values() {
        return (tb[]) G.clone();
    }
}
