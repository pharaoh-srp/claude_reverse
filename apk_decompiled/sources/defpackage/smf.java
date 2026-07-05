package defpackage;

import io.sentry.h1;
import io.sentry.n4;
import io.sentry.n7;
import io.sentry.r1;

/* JADX INFO: loaded from: classes.dex */
public final class smf implements y59 {
    public final h1 a = n4.a;
    public final String b;
    public r1 c;

    public smf(String str) {
        this.b = str;
    }

    public final void a() {
        r1 r1Var = this.c;
        if (r1Var == null) {
            return;
        }
        n7 n7VarE = r1Var.e();
        if (n7VarE == null) {
            n7VarE = n7.OK;
        }
        r1Var.m(n7VarE);
        this.a.w(new cd(10, this));
        this.c = null;
    }

    @Override // defpackage.y59
    public final void onDestroy() {
        a();
    }
}
