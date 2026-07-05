package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class x4i {
    public static final x4i E;
    public static final x4i F;
    public static final /* synthetic */ x4i[] G;

    static {
        x4i x4iVar = new x4i("DEFERRED", 0);
        E = x4iVar;
        x4i x4iVar2 = new x4i("IMMEDIATE", 1);
        F = x4iVar2;
        G = new x4i[]{x4iVar, x4iVar2, new x4i("EXCLUSIVE", 2)};
    }

    public static x4i valueOf(String str) {
        return (x4i) Enum.valueOf(x4i.class, str);
    }

    public static x4i[] values() {
        return (x4i[]) G.clone();
    }
}
