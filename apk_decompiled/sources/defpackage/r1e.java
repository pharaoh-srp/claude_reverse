package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class r1e {
    public static final r1e E;
    public static final r1e F;
    public static final r1e G;
    public static final r1e H;
    public static final r1e I;
    public static final /* synthetic */ r1e[] J;

    static {
        r1e r1eVar = new r1e("UPGRADE_TO_PRO", 0);
        E = r1eVar;
        r1e r1eVar2 = new r1e("UPGRADE_TO_MAX", 1);
        F = r1eVar2;
        r1e r1eVar3 = new r1e("UPGRADE_TO_MAX_ON_WEB", 2);
        G = r1eVar3;
        r1e r1eVar4 = new r1e("GET_MORE_USAGE_ON_WEB", 3);
        H = r1eVar4;
        r1e r1eVar5 = new r1e("NONE", 4);
        I = r1eVar5;
        J = new r1e[]{r1eVar, r1eVar2, r1eVar3, r1eVar4, r1eVar5};
    }

    public static r1e valueOf(String str) {
        return (r1e) Enum.valueOf(r1e.class, str);
    }

    public static r1e[] values() {
        return (r1e[]) J.clone();
    }
}
