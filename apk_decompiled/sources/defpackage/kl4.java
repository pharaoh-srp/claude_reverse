package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class kl4 implements ymf {
    public final AtomicReference a;

    public kl4(ymf ymfVar) {
        this.a = new AtomicReference(ymfVar);
    }

    @Override // defpackage.ymf
    public final Iterator iterator() {
        ymf ymfVar = (ymf) this.a.getAndSet(null);
        if (ymfVar != null) {
            return ymfVar.iterator();
        }
        sz6.j("This sequence can be consumed only once.");
        return null;
    }
}
