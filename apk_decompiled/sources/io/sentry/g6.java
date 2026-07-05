package io.sentry;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g6 implements io.sentry.util.g {
    public final /* synthetic */ int E;
    public final /* synthetic */ w6 F;

    public /* synthetic */ g6(io.sentry.android.core.internal.gestures.h hVar, w6 w6Var) {
        this.E = 3;
        this.F = w6Var;
    }

    @Override // io.sentry.util.g
    public final Object f() {
        int i = this.E;
        w6 w6Var = this.F;
        switch (i) {
            case 0:
                return w6.a(w6Var);
            case 1:
                return new n2(w6Var);
            case 2:
                return w6.b(w6Var);
            default:
                return Boolean.valueOf(io.sentry.android.core.internal.gestures.h.d(w6Var, "androidx.core.view.ScrollingView"));
        }
    }

    public /* synthetic */ g6(w6 w6Var, int i) {
        this.E = i;
        this.F = w6Var;
    }
}
