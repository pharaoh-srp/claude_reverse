package androidx.concurrent.futures;

import defpackage.dne;
import defpackage.n92;
import defpackage.o92;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public Object a;
    public o92 b;
    public dne c;
    public boolean d;

    public final void a(Object obj) {
        this.d = true;
        o92 o92Var = this.b;
        if (o92Var == null || !o92Var.F.k(obj)) {
            return;
        }
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public final void b(Throwable th) {
        this.d = true;
        o92 o92Var = this.b;
        if (o92Var == null || !o92Var.F.l(th)) {
            return;
        }
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public final void finalize() {
        dne dneVar;
        o92 o92Var = this.b;
        if (o92Var != null) {
            n92 n92Var = o92Var.F;
            if (!n92Var.isDone()) {
                final String str = "The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.a;
                n92Var.l(new Throwable(str) { // from class: androidx.concurrent.futures.CallbackToFutureAdapter$FutureGarbageCollectedException
                    @Override // java.lang.Throwable
                    public final synchronized Throwable fillInStackTrace() {
                        return this;
                    }
                });
            }
        }
        if (this.d || (dneVar = this.c) == null) {
            return;
        }
        dneVar.k(null);
    }
}
