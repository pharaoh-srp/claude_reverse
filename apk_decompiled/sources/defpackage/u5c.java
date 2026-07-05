package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class u5c {
    public static final u5c E;
    public static final u5c F;
    public static final /* synthetic */ u5c[] G;

    static {
        u5c u5cVar = new u5c("Min", 0);
        E = u5cVar;
        u5c u5cVar2 = new u5c("Max", 1);
        F = u5cVar2;
        G = new u5c[]{u5cVar, u5cVar2};
    }

    public static u5c valueOf(String str) {
        return (u5c) Enum.valueOf(u5c.class, str);
    }

    public static u5c[] values() {
        return (u5c[]) G.clone();
    }
}
