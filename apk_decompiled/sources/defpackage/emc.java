package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class emc {
    public static final emc E;
    public static final emc F;
    public static final /* synthetic */ emc[] G;

    static {
        emc emcVar = new emc("RENDER_OVERRIDE", 0);
        E = emcVar;
        emc emcVar2 = new emc("RENDER_OPEN", 1);
        F = emcVar2;
        G = new emc[]{emcVar, emcVar2, new emc("RENDER_OPEN_OVERRIDE", 2)};
    }

    public static emc valueOf(String str) {
        return (emc) Enum.valueOf(emc.class, str);
    }

    public static emc[] values() {
        return (emc[]) G.clone();
    }
}
