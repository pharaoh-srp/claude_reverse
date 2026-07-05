package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class irj {
    public static final irj E;
    public static final /* synthetic */ irj[] F;

    static {
        irj irjVar = new irj("DEFAULT", 0);
        E = irjVar;
        F = new irj[]{irjVar, new irj("SIGNED", 1), new irj("FIXED", 2)};
    }

    public static irj[] values() {
        return (irj[]) F.clone();
    }
}
