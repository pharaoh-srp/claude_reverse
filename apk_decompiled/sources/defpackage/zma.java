package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class zma {
    public static final /* synthetic */ zma[] E = {new zma("Immediately", 0), new zma("OnIterationFinish", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    zma EF5;

    public static zma valueOf(String str) {
        return (zma) Enum.valueOf(zma.class, str);
    }

    public static zma[] values() {
        return (zma[]) E.clone();
    }
}
