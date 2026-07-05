package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class tvc {
    public static final tvc E;
    public static final tvc F;
    public static final tvc G;
    public static final tvc H;
    public static final tvc I;
    public static final tvc J;
    public static final tvc K;
    public static final /* synthetic */ tvc[] L;

    static {
        tvc tvcVar = new tvc("Invalid", 0);
        E = tvcVar;
        tvc tvcVar2 = new tvc("Cancelled", 1);
        F = tvcVar2;
        tvc tvcVar3 = new tvc("InitialPending", 2);
        G = tvcVar3;
        tvc tvcVar4 = new tvc("RecomposePending", 3);
        H = tvcVar4;
        tvc tvcVar5 = new tvc("Recomposing", 4);
        I = tvcVar5;
        tvc tvcVar6 = new tvc("ApplyPending", 5);
        J = tvcVar6;
        tvc tvcVar7 = new tvc("Applied", 6);
        K = tvcVar7;
        L = new tvc[]{tvcVar, tvcVar2, tvcVar3, tvcVar4, tvcVar5, tvcVar6, tvcVar7};
    }

    public static tvc valueOf(String str) {
        return (tvc) Enum.valueOf(tvc.class, str);
    }

    public static tvc[] values() {
        return (tvc[]) L.clone();
    }
}
