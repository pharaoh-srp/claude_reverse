package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class o6i {
    public static final o6i E;
    public static final o6i F;
    public static final o6i G;
    public static final /* synthetic */ o6i[] H;

    static {
        o6i o6iVar = new o6i("ContinueTraversal", 0);
        E = o6iVar;
        o6i o6iVar2 = new o6i("SkipSubtreeAndContinueTraversal", 1);
        F = o6iVar2;
        o6i o6iVar3 = new o6i("CancelTraversal", 2);
        G = o6iVar3;
        H = new o6i[]{o6iVar, o6iVar2, o6iVar3};
    }

    public static o6i valueOf(String str) {
        return (o6i) Enum.valueOf(o6i.class, str);
    }

    public static o6i[] values() {
        return (o6i[]) H.clone();
    }
}
