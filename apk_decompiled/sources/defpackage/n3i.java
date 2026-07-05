package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class n3i {
    public static final n3i E;
    public static final n3i F;
    public static final /* synthetic */ n3i[] G;

    static {
        n3i n3iVar = new n3i("DATADOG", 0);
        E = n3iVar;
        n3i n3iVar2 = new n3i("B3", 1);
        n3i n3iVar3 = new n3i("B3MULTI", 2);
        n3i n3iVar4 = new n3i("TRACECONTEXT", 3);
        F = n3iVar4;
        G = new n3i[]{n3iVar, n3iVar2, n3iVar3, n3iVar4};
    }

    public static n3i valueOf(String str) {
        return (n3i) Enum.valueOf(n3i.class, str);
    }

    public static n3i[] values() {
        return (n3i[]) G.clone();
    }
}
