package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class n4i {
    public final long a;
    public final long b;
    public final boolean c;

    public n4i(long j, long j2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = z;
    }

    public final n4i a(n4i n4iVar) {
        return new n4i(fcc.i(this.a, n4iVar.a), Math.max(this.b, n4iVar.b), this.c || n4iVar.c);
    }
}
