package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class v5b {
    public static final v5b E;
    public static final v5b F;
    public static final /* synthetic */ v5b[] G;

    static {
        v5b v5bVar = new v5b("US", 0);
        E = v5bVar;
        v5b v5bVar2 = new v5b("METRIC", 1);
        F = v5bVar2;
        G = new v5b[]{v5bVar, v5bVar2};
    }

    public static v5b valueOf(String str) {
        return (v5b) Enum.valueOf(v5b.class, str);
    }

    public static v5b[] values() {
        return (v5b[]) G.clone();
    }
}
