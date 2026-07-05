package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kr7 {
    public final void a(h5b h5bVar, h5b h5bVar2, long j) {
        long jF = bwk.f(j, ov9.E);
        if (h5bVar != null) {
            int iL = h5bVar.l(rl4.g(jF));
            new t69(t69.a(iL, h5bVar.Q(iL)));
        }
        if (h5bVar2 != null) {
            int iL2 = h5bVar2.l(rl4.g(jF));
            new t69(t69.a(iL2, h5bVar2.Q(iL2)));
        }
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof kr7);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + vb7.c(0, jr7.E.hashCode() * 31, 31);
    }

    public final String toString() {
        return "FlowLayoutOverflowState(type=" + jr7.E + ", minLinesToShowCollapse=0, minCrossAxisSizeToShowCollapse=0)";
    }
}
