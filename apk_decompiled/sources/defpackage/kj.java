package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class kj {
    public static final kj E;
    public static final kj F;
    public static final kj G;
    public static final /* synthetic */ kj[] H;

    static {
        kj kjVar = new kj("IDLE", 0);
        E = kjVar;
        kj kjVar2 = new kj("WORKING", 1);
        F = kjVar2;
        kj kjVar3 = new kj("COMPACTING", 2);
        G = kjVar3;
        H = new kj[]{kjVar, kjVar2, kjVar3};
    }

    public static kj valueOf(String str) {
        return (kj) Enum.valueOf(kj.class, str);
    }

    public static kj[] values() {
        return (kj[]) H.clone();
    }
}
