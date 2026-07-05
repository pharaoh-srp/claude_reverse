package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public abstract class kge {
    public static final jge E;
    public static final ige F;
    public static final /* synthetic */ kge[] G;

    static {
        jge jgeVar = new jge();
        E = jgeVar;
        ige igeVar = new ige();
        F = igeVar;
        G = new kge[]{jgeVar, igeVar};
    }

    public static kge valueOf(String str) {
        return (kge) Enum.valueOf(kge.class, str);
    }

    public static kge[] values() {
        return (kge[]) G.clone();
    }

    public abstract String a(String str);
}
