package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class bpf implements Runnable {
    public final p4a E;
    public final y3a F;
    public boolean G;

    public bpf(p4a p4aVar, y3a y3aVar) {
        p4aVar.getClass();
        y3aVar.getClass();
        this.E = p4aVar;
        this.F = y3aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.G) {
            return;
        }
        this.E.f(this.F);
        this.G = true;
    }
}
