package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class w4l extends qzk {
    public final /* synthetic */ IBinder F;
    public final /* synthetic */ lj1 G;

    public w4l(lj1 lj1Var, IBinder iBinder) {
        this.G = lj1Var;
        this.F = iBinder;
    }

    @Override // defpackage.qzk
    public final void a() {
        abk h3kVar;
        u5l u5lVar = (u5l) this.G.F;
        int i = e7k.j;
        IBinder iBinder = this.F;
        if (iBinder == null) {
            h3kVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
            h3kVar = iInterfaceQueryLocalInterface instanceof abk ? (abk) iInterfaceQueryLocalInterface : new h3k(iBinder);
        }
        u5lVar.m = h3kVar;
        sqb sqbVar = u5lVar.b;
        sqbVar.c("linkToDeath", new Object[0]);
        try {
            u5lVar.m.asBinder().linkToDeath(u5lVar.j, 0);
        } catch (RemoteException e) {
            sqbVar.b(e, "linkToDeath failed", new Object[0]);
        }
        u5lVar.g = false;
        Iterator it = u5lVar.d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        u5lVar.d.clear();
    }
}
