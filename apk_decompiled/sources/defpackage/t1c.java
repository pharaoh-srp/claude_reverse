package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class t1c {
    public static final t1c E;
    public static final t1c F;
    public static final t1c G;
    public static final t1c H;
    public static final t1c I;
    public static final t1c J;
    public static final /* synthetic */ t1c[] K;

    static {
        t1c t1cVar = new t1c("NOT_REQUIRED", 0);
        E = t1cVar;
        t1c t1cVar2 = new t1c("CONNECTED", 1);
        F = t1cVar2;
        t1c t1cVar3 = new t1c("UNMETERED", 2);
        G = t1cVar3;
        t1c t1cVar4 = new t1c("NOT_ROAMING", 3);
        H = t1cVar4;
        t1c t1cVar5 = new t1c("METERED", 4);
        I = t1cVar5;
        t1c t1cVar6 = new t1c("TEMPORARILY_UNMETERED", 5);
        J = t1cVar6;
        K = new t1c[]{t1cVar, t1cVar2, t1cVar3, t1cVar4, t1cVar5, t1cVar6};
    }

    public static t1c valueOf(String str) {
        return (t1c) Enum.valueOf(t1c.class, str);
    }

    public static t1c[] values() {
        return (t1c[]) K.clone();
    }
}
