package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class jmj implements Runnable {
    public final /* synthetic */ int E;
    public final /* synthetic */ kmj F;

    public jmj(kmj kmjVar, int i) {
        this.F = kmjVar;
        this.E = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.F.i(this.E);
    }
}
