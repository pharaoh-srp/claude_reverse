package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class mxc {
    public static final mxc E;
    public static final mxc F;
    public static final mxc G;
    public static final /* synthetic */ mxc[] H;

    static {
        mxc mxcVar = new mxc("Plan", 0);
        E = mxcVar;
        mxc mxcVar2 = new mxc("Code", 1);
        F = mxcVar2;
        mxc mxcVar3 = new mxc("Auto", 2);
        G = mxcVar3;
        H = new mxc[]{mxcVar, mxcVar2, mxcVar3};
    }

    public static mxc valueOf(String str) {
        return (mxc) Enum.valueOf(mxc.class, str);
    }

    public static mxc[] values() {
        return (mxc[]) H.clone();
    }
}
