package io.sentry.android.core;

/* JADX INFO: loaded from: classes3.dex */
public final class w implements io.sentry.hints.a, io.sentry.hints.l {
    public final boolean E;

    public w(boolean z) {
        this.E = z;
    }

    @Override // io.sentry.hints.a
    public final Long b() {
        return null;
    }

    @Override // io.sentry.hints.a
    public final boolean c() {
        return true;
    }

    @Override // io.sentry.hints.a
    public final String e() {
        return this.E ? "anr_background" : "anr_foreground";
    }
}
