package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class teh {
    public static final teh E;
    public static final teh F;
    public static final teh G;
    public static final teh H;
    public static final /* synthetic */ teh[] I;

    static {
        teh tehVar = new teh("Start", 0);
        E = tehVar;
        teh tehVar2 = new teh("End", 1);
        F = tehVar2;
        teh tehVar3 = new teh("Inner", 2);
        G = tehVar3;
        teh tehVar4 = new teh("NotByUser", 3);
        H = tehVar4;
        I = new teh[]{tehVar, tehVar2, tehVar3, tehVar4};
    }

    public static teh valueOf(String str) {
        return (teh) Enum.valueOf(teh.class, str);
    }

    public static teh[] values() {
        return (teh[]) I.clone();
    }
}
