package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class n1i {
    public static final n1i E;
    public static final n1i F;
    public static final n1i G;
    public static final /* synthetic */ n1i[] H;

    static {
        n1i n1iVar = new n1i("Uninitialized", 0);
        E = n1iVar;
        n1i n1iVar2 = new n1i("Detached", 1);
        F = n1iVar2;
        n1i n1iVar3 = new n1i("Attached", 2);
        G = n1iVar3;
        H = new n1i[]{n1iVar, n1iVar2, n1iVar3};
    }

    public static n1i valueOf(String str) {
        return (n1i) Enum.valueOf(n1i.class, str);
    }

    public static n1i[] values() {
        return (n1i[]) H.clone();
    }
}
