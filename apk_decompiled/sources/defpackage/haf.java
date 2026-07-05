package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class haf {
    public static final haf E;
    public static final haf F;
    public static final /* synthetic */ haf[] G;

    static {
        haf hafVar = new haf("BACKWARD", 0);
        E = hafVar;
        haf hafVar2 = new haf("FORWARD", 1);
        F = hafVar2;
        G = new haf[]{hafVar, hafVar2};
    }

    public static haf valueOf(String str) {
        return (haf) Enum.valueOf(haf.class, str);
    }

    public static haf[] values() {
        return (haf[]) G.clone();
    }

    public final haf a() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return F;
        }
        if (iOrdinal == 1) {
            return E;
        }
        wg6.i();
        return null;
    }
}
