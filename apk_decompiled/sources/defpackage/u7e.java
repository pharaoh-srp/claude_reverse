package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class u7e {
    public static final u7e E;
    public static final u7e F;
    public static final u7e G;
    public static final u7e H;
    public static final u7e I;
    public static final u7e J;
    public static final /* synthetic */ u7e[] K;

    static {
        u7e u7eVar = new u7e("ShutDown", 0);
        E = u7eVar;
        u7e u7eVar2 = new u7e("ShuttingDown", 1);
        F = u7eVar2;
        u7e u7eVar3 = new u7e("Inactive", 2);
        G = u7eVar3;
        u7e u7eVar4 = new u7e("InactivePendingWork", 3);
        H = u7eVar4;
        u7e u7eVar5 = new u7e("Idle", 4);
        I = u7eVar5;
        u7e u7eVar6 = new u7e("PendingWork", 5);
        J = u7eVar6;
        K = new u7e[]{u7eVar, u7eVar2, u7eVar3, u7eVar4, u7eVar5, u7eVar6};
    }

    public static u7e valueOf(String str) {
        return (u7e) Enum.valueOf(u7e.class, str);
    }

    public static u7e[] values() {
        return (u7e[]) K.clone();
    }
}
