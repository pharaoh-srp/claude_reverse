package io.sentry;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l7 implements io.sentry.util.g, j4 {
    public final /* synthetic */ int E;
    public final /* synthetic */ String F;

    public /* synthetic */ l7(io.sentry.protocol.w wVar, String str) {
        this.E = 2;
        this.F = str;
    }

    @Override // io.sentry.util.g
    public Object f() {
        int i = this.E;
        String str = this.F;
        switch (i) {
            case 0:
                return str;
            case 1:
            default:
                return str;
            case 2:
                Charset charset = io.sentry.util.o.a;
                if (str.equals("0000-0000")) {
                    str = "00000000-0000-0000-0000-000000000000";
                }
                return str.replace("-", "");
        }
    }

    @Override // io.sentry.j4
    public void i(f1 f1Var) {
        f1Var.F(this.F);
    }

    public /* synthetic */ l7(String str, int i) {
        this.E = i;
        this.F = str;
    }
}
