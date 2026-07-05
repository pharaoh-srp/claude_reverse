package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class sfb {
    public static final sfb E;
    public static final sfb F;
    public static final sfb G;
    public static final sfb H;
    public static final /* synthetic */ sfb[] I;

    static {
        sfb sfbVar = new sfb("IDLE", 0);
        E = sfbVar;
        sfb sfbVar2 = new sfb("SENDING", 1);
        F = sfbVar2;
        sfb sfbVar3 = new sfb("RECEIVED", 2);
        G = sfbVar3;
        sfb sfbVar4 = new sfb("SAMPLING", 3);
        H = sfbVar4;
        I = new sfb[]{sfbVar, sfbVar2, sfbVar3, sfbVar4};
    }

    public static sfb valueOf(String str) {
        return (sfb) Enum.valueOf(sfb.class, str);
    }

    public static sfb[] values() {
        return (sfb[]) I.clone();
    }
}
