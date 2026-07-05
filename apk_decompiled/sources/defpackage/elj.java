package defpackage;

import android.os.RemoteException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class elj extends amj {
    public final /* synthetic */ int F = 1;
    public final /* synthetic */ Object G;

    public elj(flj fljVar) {
        Objects.requireNonNull(fljVar);
        this.G = fljVar;
    }

    @Override // defpackage.amj
    public final void b() {
        switch (this.F) {
            case 0:
                flj fljVar = (flj) ((lj1) this.G).F;
                fljVar.b.a("unlinkToDeath", new Object[0]);
                fljVar.n.asBinder().unlinkToDeath(fljVar.k, 0);
                fljVar.n = null;
                fljVar.g = false;
                return;
            default:
                flj fljVar2 = (flj) this.G;
                synchronized (fljVar2.f) {
                    try {
                        if (fljVar2.l.get() > 0 && fljVar2.l.decrementAndGet() > 0) {
                            fljVar2.b.a("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        if (fljVar2.n != null) {
                            fljVar2.b.a("Unbind from service.", new Object[0]);
                            fljVar2.a.unbindService(fljVar2.m);
                            fljVar2.g = false;
                            fljVar2.n = null;
                            fljVar2.m = null;
                        }
                        HashSet hashSet = fljVar2.e;
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            ((j5h) it.next()).c(new RemoteException(String.valueOf(fljVar2.c).concat(" : Binder has died.")));
                        }
                        hashSet.clear();
                        return;
                    } finally {
                    }
                }
        }
    }

    public elj(lj1 lj1Var) {
        this.G = lj1Var;
    }
}
