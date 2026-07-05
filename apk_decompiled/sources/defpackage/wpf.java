package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class wpf {
    public static final wpf E;
    public static final wpf F;
    public static final wpf G;
    public static final wpf H;
    public static final /* synthetic */ wpf[] I;

    static {
        wpf wpfVar = new wpf("ACTION", 0);
        E = wpfVar;
        wpf wpfVar2 = new wpf("RESOURCE", 1);
        F = wpfVar2;
        wpf wpfVar3 = new wpf("ERROR", 2);
        G = wpfVar3;
        wpf wpfVar4 = new wpf("LONG_TASK", 3);
        H = wpfVar4;
        I = new wpf[]{wpfVar, wpfVar2, wpfVar3, wpfVar4};
    }

    public static wpf valueOf(String str) {
        return (wpf) Enum.valueOf(wpf.class, str);
    }

    public static wpf[] values() {
        return (wpf[]) I.clone();
    }
}
