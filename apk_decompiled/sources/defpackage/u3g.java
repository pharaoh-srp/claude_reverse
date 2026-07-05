package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class u3g {
    public static final u3g E;
    public static final u3g F;
    public static final /* synthetic */ u3g[] G;

    static {
        u3g u3gVar = new u3g("ORGANIZATION", 0);
        E = u3gVar;
        u3g u3gVar2 = new u3g("PUBLISH", 1);
        F = u3gVar2;
        G = new u3g[]{u3gVar, u3gVar2};
    }

    public static u3g valueOf(String str) {
        return (u3g) Enum.valueOf(u3g.class, str);
    }

    public static u3g[] values() {
        return (u3g[]) G.clone();
    }
}
