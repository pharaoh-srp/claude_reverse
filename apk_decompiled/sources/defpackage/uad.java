package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class uad {
    public static final uad E;
    public static final uad F;
    public static final uad G;
    public static final /* synthetic */ uad[] H;

    static {
        uad uadVar = new uad("EXACT", 0);
        E = uadVar;
        uad uadVar2 = new uad("INEXACT", 1);
        F = uadVar2;
        uad uadVar3 = new uad("AUTOMATIC", 2);
        G = uadVar3;
        H = new uad[]{uadVar, uadVar2, uadVar3};
    }

    public static uad valueOf(String str) {
        return (uad) Enum.valueOf(uad.class, str);
    }

    public static uad[] values() {
        return (uad[]) H.clone();
    }
}
