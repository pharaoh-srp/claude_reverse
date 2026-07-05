package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class prj {
    public static final prj E;
    public static final /* synthetic */ prj[] F;

    static {
        prj prjVar = new prj("DEFAULT", 0);
        E = prjVar;
        F = new prj[]{prjVar, new prj("SIGNED", 1), new prj("FIXED", 2)};
    }

    public static prj[] values() {
        return (prj[]) F.clone();
    }
}
