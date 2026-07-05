package io.sentry;

/* JADX INFO: loaded from: classes3.dex */
public final class y1 implements d1 {
    public final Runtime a = Runtime.getRuntime();

    @Override // io.sentry.d1
    public final void a(s3 s3Var) {
        Runtime runtime = this.a;
        s3Var.b = Long.valueOf(runtime.totalMemory() - runtime.freeMemory());
    }

    @Override // io.sentry.d1
    public final void c() {
    }
}
