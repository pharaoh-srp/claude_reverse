package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ve8 implements u9d {
    public final tt a;
    public final qcc b;
    public long c = 0;

    public ve8(tt ttVar, qcc qccVar) {
        this.a = ttVar;
        this.b = qccVar;
    }

    @Override // defpackage.u9d
    public final long a(c79 c79Var, long j, fu9 fu9Var, long j2) {
        long jA = this.b.a();
        if ((9223372034707292159L & jA) == 9205357640488583168L) {
            jA = this.c;
        }
        this.c = jA;
        return y69.d(y69.d(c79Var.e(), yfd.a0(jA)), this.a.a(j2, 0L, fu9Var));
    }
}
