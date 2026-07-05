package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class dfg {
    public static final dfg E;
    public static final dfg F;
    public static final /* synthetic */ dfg[] G;

    static {
        dfg dfgVar = new dfg("Header", 0);
        E = dfgVar;
        dfg dfgVar2 = new dfg("Source", 1);
        F = dfgVar2;
        G = new dfg[]{dfgVar, dfgVar2};
    }

    public static dfg valueOf(String str) {
        return (dfg) Enum.valueOf(dfg.class, str);
    }

    public static dfg[] values() {
        return (dfg[]) G.clone();
    }
}
