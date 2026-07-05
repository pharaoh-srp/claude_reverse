package defpackage;

import android.os.RemoteException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class jnk extends a7k {
    public final /* synthetic */ int F = 1;
    public final /* synthetic */ Object G;

    public jnk(y0l y0lVar) {
        Objects.requireNonNull(y0lVar);
        this.G = y0lVar;
    }

    @Override // defpackage.a7k
    public final void b() {
        switch (this.F) {
            case 0:
                y0l y0lVar = (y0l) this.G;
                synchronized (y0lVar.f) {
                    try {
                        if (y0lVar.k.get() > 0 && y0lVar.k.decrementAndGet() > 0) {
                            y0lVar.b.i("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        if (y0lVar.m != null) {
                            y0lVar.b.i("Unbind from service.", new Object[0]);
                            y0lVar.a.unbindService(y0lVar.l);
                            y0lVar.g = false;
                            y0lVar.m = null;
                            y0lVar.l = null;
                        }
                        HashSet hashSet = y0lVar.e;
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            ((j5h) it.next()).c(new RemoteException(String.valueOf(y0lVar.c).concat(" : Binder has died.")));
                        }
                        hashSet.clear();
                        return;
                    } finally {
                    }
                }
            default:
                y0l y0lVar2 = (y0l) ((lj1) this.G).F;
                y0lVar2.b.i("unlinkToDeath", new Object[0]);
                y0lVar2.m.asBinder().unlinkToDeath(y0lVar2.j, 0);
                y0lVar2.m = null;
                y0lVar2.g = false;
                return;
        }
    }

    public jnk(lj1 lj1Var) {
        this.G = lj1Var;
    }
}
