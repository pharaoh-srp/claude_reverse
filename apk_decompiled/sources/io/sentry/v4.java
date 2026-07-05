package io.sentry;

/* JADX INFO: loaded from: classes3.dex */
public final class v4 implements b5 {
    public final b5 a;

    public v4() {
        if (io.sentry.util.k.a || !io.sentry.util.k.b) {
            this.a = new e6();
        } else {
            this.a = new q5();
        }
    }

    @Override // io.sentry.b5
    public final a5 c() {
        return this.a.c();
    }
}
