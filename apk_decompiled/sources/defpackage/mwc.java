package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class mwc {
    public static final mwc E;
    public static final mwc F;
    public static final mwc G;
    public static final mwc H;
    public static final mwc I;
    public static final /* synthetic */ mwc[] J;

    static {
        mwc mwcVar = new mwc("WRITTEN", 0);
        E = mwcVar;
        mwc mwcVar2 = new mwc("PARTIAL_FLUSH", 1);
        F = mwcVar2;
        mwc mwcVar3 = new mwc("ROOT_BUFFERED", 2);
        G = mwcVar3;
        mwc mwcVar4 = new mwc("BUFFERED", 3);
        H = mwcVar4;
        mwc mwcVar5 = new mwc("PENDING", 4);
        I = mwcVar5;
        J = new mwc[]{mwcVar, mwcVar2, mwcVar3, mwcVar4, mwcVar5};
    }

    public static mwc valueOf(String str) {
        return (mwc) Enum.valueOf(mwc.class, str);
    }

    public static mwc[] values() {
        return (mwc[]) J.clone();
    }
}
