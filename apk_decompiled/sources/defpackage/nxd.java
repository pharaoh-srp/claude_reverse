package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class nxd {
    public static final nxd E;
    public static final nxd F;
    public static final /* synthetic */ nxd[] G;

    static {
        nxd nxdVar = new nxd("Clawd", 0);
        E = nxdVar;
        nxd nxdVar2 = new nxd("Scribble", 1);
        F = nxdVar2;
        G = new nxd[]{nxdVar, nxdVar2};
    }

    public static nxd valueOf(String str) {
        return (nxd) Enum.valueOf(nxd.class, str);
    }

    public static nxd[] values() {
        return (nxd[]) G.clone();
    }
}
