package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class zfj {
    public static final zfj E;
    public static final zfj F;
    public static final zfj G;
    public static final zfj H;
    public static final zfj I;
    public static final zfj J;
    public static final /* synthetic */ zfj[] K;

    static {
        zfj zfjVar = new zfj("ENQUEUED", 0);
        E = zfjVar;
        zfj zfjVar2 = new zfj("RUNNING", 1);
        F = zfjVar2;
        zfj zfjVar3 = new zfj("SUCCEEDED", 2);
        G = zfjVar3;
        zfj zfjVar4 = new zfj("FAILED", 3);
        H = zfjVar4;
        zfj zfjVar5 = new zfj("BLOCKED", 4);
        I = zfjVar5;
        zfj zfjVar6 = new zfj("CANCELLED", 5);
        J = zfjVar6;
        K = new zfj[]{zfjVar, zfjVar2, zfjVar3, zfjVar4, zfjVar5, zfjVar6};
    }

    public static zfj valueOf(String str) {
        return (zfj) Enum.valueOf(zfj.class, str);
    }

    public static zfj[] values() {
        return (zfj[]) K.clone();
    }

    public final boolean a() {
        return this == G || this == H || this == J;
    }
}
