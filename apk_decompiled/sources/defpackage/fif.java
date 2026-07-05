package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class fif {
    public static final fif E;
    public static final fif F;
    public static final fif G;
    public static final /* synthetic */ fif[] H;

    static {
        fif fifVar = new fif("Left", 0);
        E = fifVar;
        fif fifVar2 = new fif("Middle", 1);
        F = fifVar2;
        fif fifVar3 = new fif("Right", 2);
        G = fifVar3;
        H = new fif[]{fifVar, fifVar2, fifVar3};
    }

    public static fif valueOf(String str) {
        return (fif) Enum.valueOf(fif.class, str);
    }

    public static fif[] values() {
        return (fif[]) H.clone();
    }
}
