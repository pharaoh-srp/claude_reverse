package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class nuc {
    public static final nuc E;
    public static final /* synthetic */ nuc[] F;

    static {
        nuc nucVar = new nuc("CounterClockwise", 0);
        E = nucVar;
        F = new nuc[]{nucVar, new nuc("Clockwise", 1)};
    }

    public static nuc valueOf(String str) {
        return (nuc) Enum.valueOf(nuc.class, str);
    }

    public static nuc[] values() {
        return (nuc[]) F.clone();
    }
}
