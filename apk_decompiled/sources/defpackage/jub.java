package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class jub {
    public static final jub E;
    public static final jub F;
    public static final /* synthetic */ jub[] G;

    static {
        jub jubVar = new jub("READ_ONLY", 0);
        E = jubVar;
        jub jubVar2 = new jub("MUTABLE", 1);
        F = jubVar2;
        G = new jub[]{jubVar, jubVar2};
    }

    public static jub valueOf(String str) {
        return (jub) Enum.valueOf(jub.class, str);
    }

    public static jub[] values() {
        return (jub[]) G.clone();
    }
}
