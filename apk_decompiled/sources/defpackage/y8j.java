package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class y8j implements Comparable {
    public final int E;
    public final u8j F;

    public y8j(int i, u8j u8jVar) {
        this.E = i;
        this.F = u8jVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.E, ((y8j) obj).E);
    }
}
