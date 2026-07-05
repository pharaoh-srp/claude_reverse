package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class z7e {
    public static final z7e E;
    public static final z7e F;
    public static final z7e G;
    public static final /* synthetic */ z7e[] H;

    static {
        z7e z7eVar = new z7e("INSTANTANEOUS", 0);
        E = z7eVar;
        z7e z7eVar2 = new z7e("INTERVAL", 1);
        F = z7eVar2;
        z7e z7eVar3 = new z7e("SERIES", 2);
        G = z7eVar3;
        H = new z7e[]{z7eVar, z7eVar2, z7eVar3};
    }

    public static z7e valueOf(String str) {
        return (z7e) Enum.valueOf(z7e.class, str);
    }

    public static z7e[] values() {
        return (z7e[]) H.clone();
    }
}
