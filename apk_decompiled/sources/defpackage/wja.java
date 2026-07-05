package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class wja {
    public static final wja E;
    public static final wja F;
    public static final /* synthetic */ wja[] G;

    static {
        wja wjaVar = new wja("USER_INITIATED", 0);
        E = wjaVar;
        wja wjaVar2 = new wja("ACCOUNT_DELETED", 1);
        F = wjaVar2;
        G = new wja[]{wjaVar, wjaVar2};
    }

    public static wja valueOf(String str) {
        return (wja) Enum.valueOf(wja.class, str);
    }

    public static wja[] values() {
        return (wja[]) G.clone();
    }
}
