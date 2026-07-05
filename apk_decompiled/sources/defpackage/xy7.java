package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class xy7 {
    public final Executor a;
    public final r94 b;
    public final Object c;
    public int d;
    public boolean e;
    public boolean f;
    public final ArrayList g;
    public final y0 h;

    public xy7(Executor executor, r94 r94Var) {
        executor.getClass();
        this.a = executor;
        this.b = r94Var;
        this.c = new Object();
        this.g = new ArrayList();
        this.h = new y0(7, this);
    }

    public final void a() {
        synchronized (this.c) {
            try {
                this.f = true;
                Iterator it = this.g.iterator();
                while (it.hasNext()) {
                    ((zy7) it.next()).a();
                }
                this.g.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
