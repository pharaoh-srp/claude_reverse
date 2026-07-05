package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class zvc {
    public static final zvc E;
    public static final zvc F;
    public static final /* synthetic */ zvc[] G;

    static {
        zvc zvcVar = new zvc("ALLOW_ONCE", 0);
        E = zvcVar;
        zvc zvcVar2 = new zvc("ALWAYS_ALLOW", 1);
        F = zvcVar2;
        G = new zvc[]{zvcVar, zvcVar2};
    }

    public static zvc valueOf(String str) {
        return (zvc) Enum.valueOf(zvc.class, str);
    }

    public static zvc[] values() {
        return (zvc[]) G.clone();
    }
}
