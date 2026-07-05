package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class z7i {
    public static final z7i E;
    public static final z7i F;
    public static final z7i G;
    public static final /* synthetic */ z7i[] H;

    static {
        z7i z7iVar = new z7i("PERSISTED", 0);
        E = z7iVar;
        z7i z7iVar2 = new z7i("DISCARDED_NO_KID", 1);
        F = z7iVar2;
        z7i z7iVar3 = new z7i("NOT_ENROLLED", 2);
        G = z7iVar3;
        H = new z7i[]{z7iVar, z7iVar2, z7iVar3};
    }

    public static z7i valueOf(String str) {
        return (z7i) Enum.valueOf(z7i.class, str);
    }

    public static z7i[] values() {
        return (z7i[]) H.clone();
    }
}
