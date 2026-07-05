package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class qvh {
    public static final qvh E;
    public static final qvh F;
    public static final qvh G;
    public static final /* synthetic */ qvh[] H;

    static {
        qvh qvhVar = new qvh("Pending", 0);
        E = qvhVar;
        qvh qvhVar2 = new qvh("Completed", 1);
        F = qvhVar2;
        qvh qvhVar3 = new qvh("Failed", 2);
        G = qvhVar3;
        H = new qvh[]{qvhVar, qvhVar2, qvhVar3};
    }

    public static qvh valueOf(String str) {
        return (qvh) Enum.valueOf(qvh.class, str);
    }

    public static qvh[] values() {
        return (qvh[]) H.clone();
    }
}
