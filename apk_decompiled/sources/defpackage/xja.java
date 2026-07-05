package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class xja {
    public static final xja E;
    public static final xja F;
    public static final xja G;
    public static final /* synthetic */ xja[] H;

    static {
        xja xjaVar = new xja("UserSessionEnded", 0);
        E = xjaVar;
        xja xjaVar2 = new xja("ApiAuthError", 1);
        F = xjaVar2;
        xja xjaVar3 = new xja("AccountBanned", 2);
        G = xjaVar3;
        H = new xja[]{xjaVar, xjaVar2, xjaVar3};
    }

    public static xja valueOf(String str) {
        return (xja) Enum.valueOf(xja.class, str);
    }

    public static xja[] values() {
        return (xja[]) H.clone();
    }
}
