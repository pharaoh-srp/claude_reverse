package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class brk implements Runnable {
    public final j5h E;

    public brk() {
        this.E = null;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e) {
            j5h j5hVar = this.E;
            if (j5hVar != null) {
                j5hVar.c(e);
            }
        }
    }

    public brk(j5h j5hVar) {
        this.E = j5hVar;
    }
}
