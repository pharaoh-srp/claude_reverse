package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class m42 {
    public static final m42 E;
    public static final m42 F;
    public static final /* synthetic */ m42[] G;

    static {
        m42 m42Var = new m42("all", 0);
        E = m42Var;
        m42 m42Var2 = new m42("aural", 1);
        m42 m42Var3 = new m42("braille", 2);
        m42 m42Var4 = new m42("embossed", 3);
        m42 m42Var5 = new m42("handheld", 4);
        m42 m42Var6 = new m42("print", 5);
        m42 m42Var7 = new m42("projection", 6);
        m42 m42Var8 = new m42("screen", 7);
        F = m42Var8;
        G = new m42[]{m42Var, m42Var2, m42Var3, m42Var4, m42Var5, m42Var6, m42Var7, m42Var8, new m42("speech", 8), new m42("tty", 9), new m42("tv", 10)};
    }

    public static m42 valueOf(String str) {
        return (m42) Enum.valueOf(m42.class, str);
    }

    public static m42[] values() {
        return (m42[]) G.clone();
    }
}
