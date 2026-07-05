package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class sef {
    public static final sef E;
    public static final sef F;
    public static final /* synthetic */ sef[] G;

    static {
        sef sefVar = new sef("Inherit", 0);
        E = sefVar;
        sef sefVar2 = new sef("SecureOn", 1);
        F = sefVar2;
        G = new sef[]{sefVar, sefVar2, new sef("SecureOff", 2)};
    }

    public static sef valueOf(String str) {
        return (sef) Enum.valueOf(sef.class, str);
    }

    public static sef[] values() {
        return (sef[]) G.clone();
    }
}
