package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class kmg {
    public long a;
    public kmg b;

    public kmg(long j) {
        this.a = j;
    }

    public abstract void a(kmg kmgVar);

    public abstract kmg b();

    public kmg c(long j) {
        kmg kmgVarB = b();
        kmgVarB.a = j;
        return kmgVarB;
    }
}
