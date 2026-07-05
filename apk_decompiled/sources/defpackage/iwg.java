package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class iwg {
    public static final iwg E;
    public static final iwg F;
    public static final iwg G;
    public static final /* synthetic */ iwg[] H;

    static {
        iwg iwgVar = new iwg("WEB", 0);
        E = iwgVar;
        iwg iwgVar2 = new iwg("GOOGLE_PLAY", 1);
        F = iwgVar2;
        iwg iwgVar3 = new iwg("APP_STORE", 2);
        G = iwgVar3;
        H = new iwg[]{iwgVar, iwgVar2, iwgVar3};
    }

    public static iwg valueOf(String str) {
        return (iwg) Enum.valueOf(iwg.class, str);
    }

    public static iwg[] values() {
        return (iwg[]) H.clone();
    }
}
