package io.sentry.util;

import io.sentry.v;

/* JADX INFO: loaded from: classes.dex */
public final class h {
    public final g b;
    public volatile Object a = null;
    public final a c = new a();

    public h(g gVar) {
        this.b = gVar;
    }

    public final Object a() {
        if (this.a == null) {
            v vVarA = this.c.a();
            try {
                if (this.a == null) {
                    this.a = this.b.f();
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
        return this.a;
    }

    public final void b() {
        v vVarA = this.c.a();
        try {
            this.a = null;
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

    public final void c(Object obj) {
        v vVarA = this.c.a();
        try {
            this.a = obj;
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
