package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class axb {
    public static final axb E;
    public static final /* synthetic */ axb[] F;

    static {
        axb axbVar = new axb("Default", 0);
        E = axbVar;
        F = new axb[]{axbVar, new axb("UserInput", 1), new axb("PreventUserInput", 2)};
    }

    public static axb valueOf(String str) {
        return (axb) Enum.valueOf(axb.class, str);
    }

    public static axb[] values() {
        return (axb[]) F.clone();
    }
}
