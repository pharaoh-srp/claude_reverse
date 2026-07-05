package io.sentry;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a2 implements d2 {
    public final /* synthetic */ int E;
    public final /* synthetic */ l2 F;

    public /* synthetic */ a2(j2 j2Var, l2 l2Var) {
        this.E = 1;
        this.F = l2Var;
    }

    @Override // io.sentry.d2
    public final Object c() throws IOException {
        int i = this.E;
        l2 l2Var = this.F;
        switch (i) {
            case 0:
                return l2Var.nextString();
            case 1:
                try {
                    try {
                        return Integer.valueOf(l2Var.nextInt());
                    } catch (Exception unused) {
                        return Double.valueOf(l2Var.nextDouble());
                    }
                } catch (Exception unused2) {
                    return Long.valueOf(l2Var.nextLong());
                }
            default:
                boolean zJ = l2Var.E.j();
                l2Var.d();
                return Boolean.valueOf(zJ);
        }
    }

    public /* synthetic */ a2(l2 l2Var, int i) {
        this.E = i;
        this.F = l2Var;
    }
}
