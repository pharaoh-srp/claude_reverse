package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class l4i {
    public static final l4i E;
    public static final l4i F;
    public static final l4i G;
    public static final /* synthetic */ l4i[] H;

    static {
        l4i l4iVar = new l4i("GRANTED", 0);
        E = l4iVar;
        l4i l4iVar2 = new l4i("NOT_GRANTED", 1);
        F = l4iVar2;
        l4i l4iVar3 = new l4i("PENDING", 2);
        G = l4iVar3;
        H = new l4i[]{l4iVar, l4iVar2, l4iVar3};
    }

    public static l4i valueOf(String str) {
        return (l4i) Enum.valueOf(l4i.class, str);
    }

    public static l4i[] values() {
        return (l4i[]) H.clone();
    }
}
