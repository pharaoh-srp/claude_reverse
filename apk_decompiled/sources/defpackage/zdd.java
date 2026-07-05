package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class zdd {
    public static final zdd E;
    public static final zdd F;
    public static final /* synthetic */ zdd[] G;

    static {
        zdd zddVar = new zdd("END", 0);
        E = zddVar;
        zdd zddVar2 = new zdd("START", 1);
        F = zddVar2;
        G = new zdd[]{zddVar, zddVar2};
    }

    public static zdd valueOf(String str) {
        return (zdd) Enum.valueOf(zdd.class, str);
    }

    public static zdd[] values() {
        return (zdd[]) G.clone();
    }
}
