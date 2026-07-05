package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class nl7 implements xb1 {
    public static final AtomicReference a = new AtomicReference();

    @Override // defpackage.xb1
    public final void a(boolean z) {
        synchronized (pl7.j) {
            try {
                for (pl7 pl7Var : new ArrayList(pl7.k.values())) {
                    if (pl7Var.e.get()) {
                        Iterator it = pl7Var.i.iterator();
                        while (it.hasNext()) {
                            pl7 pl7Var2 = ((ml7) it.next()).a;
                            if (!z) {
                                ((or5) pl7Var2.h.get()).b();
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
