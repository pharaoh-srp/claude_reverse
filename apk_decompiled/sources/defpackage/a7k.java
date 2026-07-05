package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a7k implements Runnable {
    public final j5h E;

    public a7k() {
        this.E = null;
    }

    public void a(Exception exc) {
        j5h j5hVar = this.E;
        if (j5hVar != null) {
            j5hVar.c(exc);
        }
    }

    public abstract void b();

    public final j5h c() {
        return this.E;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            b();
        } catch (Exception e) {
            a(e);
        }
    }

    public a7k(j5h j5hVar) {
        this.E = j5hVar;
    }
}
