package defpackage;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class or5 implements rl8, sl8 {
    public final qa4 a;
    public final Context b;
    public final jvd c;
    public final Set d;
    public final Executor e;

    public or5(Context context, String str, Set set, jvd jvdVar, Executor executor) {
        this.a = new qa4(context, 1, str);
        this.d = set;
        this.e = executor;
        this.c = jvdVar;
        this.b = context;
    }

    public final r5l a() {
        if (!eve.G(this.b)) {
            return ez1.E("");
        }
        return ez1.v(this.e, new mr5(0, this));
    }

    public final void b() {
        if (this.d.size() <= 0) {
            ez1.E(null);
        } else if (!eve.G(this.b)) {
            ez1.E(null);
        } else {
            ez1.v(this.e, new Callable() { // from class: nr5
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    or5 or5Var = this.E;
                    synchronized (or5Var) {
                        ((efe) or5Var.a.get()).F(System.currentTimeMillis(), ((pv5) or5Var.c.get()).a());
                    }
                    return null;
                }
            });
        }
    }
}
