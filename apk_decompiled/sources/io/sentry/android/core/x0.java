package io.sentry.android.core;

import android.os.FileObserver;
import defpackage.ij0;
import io.sentry.r3;
import io.sentry.t5;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class x0 extends FileObserver {
    public final String a;
    public final r3 b;
    public final io.sentry.a1 c;
    public final long d;

    public x0(String str, r3 r3Var, io.sentry.a1 a1Var, long j) {
        super(str);
        this.a = str;
        this.b = r3Var;
        io.sentry.p.v("Logger is required.", a1Var);
        this.c = a1Var;
        this.d = j;
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i, String str) {
        if (str == null || i != 8) {
            return;
        }
        t5 t5Var = t5.DEBUG;
        Integer numValueOf = Integer.valueOf(i);
        String str2 = this.a;
        io.sentry.a1 a1Var = this.c;
        a1Var.h(t5Var, "onEvent fired for EnvelopeFileObserver with event type %d on path: %s for file %s.", numValueOf, str2, str);
        io.sentry.n0 n0VarA = io.sentry.util.c.a(new w0(this.d, a1Var));
        StringBuilder sbO = ij0.o(str2);
        sbO.append(File.separator);
        sbO.append(str);
        String string = sbO.toString();
        r3 r3Var = this.b;
        r3Var.getClass();
        r3Var.b(new File(string), n0VarA);
    }
}
