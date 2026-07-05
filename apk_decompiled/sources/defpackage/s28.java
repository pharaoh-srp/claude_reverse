package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class s28 implements Comparable {
    public final int E;
    public final bfj F;
    public final boolean G;

    public s28(int i, bfj bfjVar, boolean z) {
        this.E = i;
        this.F = bfjVar;
        this.G = z;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.E - ((s28) obj).E;
    }
}
