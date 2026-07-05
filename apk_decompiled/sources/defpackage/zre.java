package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class zre {
    public static final zre E;
    public static final zre F;
    public static final /* synthetic */ zre[] G;

    static {
        zre zreVar = new zre("Closed", 0);
        E = zreVar;
        zre zreVar2 = new zre("Open", 1);
        F = zreVar2;
        G = new zre[]{zreVar, zreVar2};
    }

    public static zre valueOf(String str) {
        return (zre) Enum.valueOf(zre.class, str);
    }

    public static zre[] values() {
        return (zre[]) G.clone();
    }
}
