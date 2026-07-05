package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class mhf {
    public static final mhf E;
    public static final mhf F;
    public static final /* synthetic */ mhf[] G;

    static {
        mhf mhfVar = new mhf("EditableText", 0);
        E = mhfVar;
        mhf mhfVar2 = new mhf("StaticText", 1);
        F = mhfVar2;
        G = new mhf[]{mhfVar, mhfVar2};
    }

    public static mhf valueOf(String str) {
        return (mhf) Enum.valueOf(mhf.class, str);
    }

    public static mhf[] values() {
        return (mhf[]) G.clone();
    }
}
