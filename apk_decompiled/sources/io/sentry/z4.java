package io.sentry;

/* JADX INFO: loaded from: classes.dex */
public final class z4 {
    public static final z4 d = new z4();
    public boolean a;
    public Boolean b;
    public final io.sentry.util.a c = new io.sentry.util.a();

    public final void a(boolean z) {
        v vVarA = this.c.a();
        try {
            if (!this.a) {
                this.b = Boolean.valueOf(z);
                this.a = true;
            }
            vVarA.close();
        } catch (Throwable th) {
            try {
                vVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
