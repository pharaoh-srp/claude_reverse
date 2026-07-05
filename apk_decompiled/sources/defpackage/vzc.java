package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class vzc {
    public static final vzc E;
    public static final vzc F;
    public static final vzc G;
    public static final vzc H;
    public static final vzc I;
    public static final vzc J;
    public static final vzc K;
    public static final /* synthetic */ vzc[] L;

    static {
        vzc vzcVar = new vzc("SUNDAY", 0);
        E = vzcVar;
        vzc vzcVar2 = new vzc("MONDAY", 1);
        F = vzcVar2;
        vzc vzcVar3 = new vzc("TUESDAY", 2);
        G = vzcVar3;
        vzc vzcVar4 = new vzc("WEDNESDAY", 3);
        H = vzcVar4;
        vzc vzcVar5 = new vzc("THURSDAY", 4);
        I = vzcVar5;
        vzc vzcVar6 = new vzc("FRIDAY", 5);
        J = vzcVar6;
        vzc vzcVar7 = new vzc("SATURDAY", 6);
        K = vzcVar7;
        L = new vzc[]{vzcVar, vzcVar2, vzcVar3, vzcVar4, vzcVar5, vzcVar6, vzcVar7};
    }

    public static vzc valueOf(String str) {
        return (vzc) Enum.valueOf(vzc.class, str);
    }

    public static vzc[] values() {
        return (vzc[]) L.clone();
    }
}
