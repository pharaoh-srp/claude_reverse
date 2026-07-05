package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class go4 {
    public static final go4 E;
    public static final go4 F;
    public static final go4 G;
    public static final go4 H;
    public static final /* synthetic */ go4[] I;

    static {
        go4 go4Var = new go4("DragAndDrop", 0);
        E = go4Var;
        go4 go4Var2 = new go4("Keyboard", 1);
        F = go4Var2;
        go4 go4Var3 = new go4("Clipboard", 2);
        G = go4Var3;
        go4 go4Var4 = new go4("Unknown", 3);
        H = go4Var4;
        I = new go4[]{go4Var, go4Var2, go4Var3, go4Var4};
    }

    public static go4 valueOf(String str) {
        return (go4) Enum.valueOf(go4.class, str);
    }

    public static go4[] values() {
        return (go4[]) I.clone();
    }
}
