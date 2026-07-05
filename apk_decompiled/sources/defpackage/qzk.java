package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class qzk implements Runnable {
    public final j5h E;

    public qzk() {
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

    public qzk(j5h j5hVar) {
        this.E = j5hVar;
    }
}
