package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class o8i {
    public static final o8i E;
    public static final o8i F;
    public static final o8i G;
    public static final o8i H;
    public static final /* synthetic */ o8i[] I;

    static {
        o8i o8iVar = new o8i("SUCCESSFUL", 0);
        E = o8iVar;
        o8i o8iVar2 = new o8i("REREGISTER", 1);
        F = o8iVar2;
        o8i o8iVar3 = new o8i("CANCELLED", 2);
        G = o8iVar3;
        o8i o8iVar4 = new o8i("ALREADY_SELECTED", 3);
        H = o8iVar4;
        I = new o8i[]{o8iVar, o8iVar2, o8iVar3, o8iVar4};
    }

    public static o8i valueOf(String str) {
        return (o8i) Enum.valueOf(o8i.class, str);
    }

    public static o8i[] values() {
        return (o8i[]) I.clone();
    }
}
