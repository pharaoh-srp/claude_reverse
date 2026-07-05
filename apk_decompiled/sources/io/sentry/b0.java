package io.sentry;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public abstract class b0 {
    public final h1 a;
    public final a1 b;
    public final long c;
    public final o7 d;

    public b0(h1 h1Var, a1 a1Var, long j, int i) {
        this.a = h1Var;
        this.b = a1Var;
        this.c = j;
        this.d = new o7(new i(i));
    }

    public abstract boolean a(String str);

    public abstract void b(File file, n0 n0Var);
}
