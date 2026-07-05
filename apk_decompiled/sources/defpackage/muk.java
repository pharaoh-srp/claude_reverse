package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class muk extends a7k {
    public final /* synthetic */ IBinder F;
    public final /* synthetic */ lj1 G;

    public muk(lj1 lj1Var, IBinder iBinder) {
        this.F = iBinder;
        this.G = lj1Var;
    }

    @Override // defpackage.a7k
    public final void b() {
        it8 gt8Var;
        int i = ht8.j;
        IBinder iBinder = this.F;
        if (iBinder == null) {
            gt8Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.agesignals.protocol.IAgeSignalsService");
            gt8Var = iInterfaceQueryLocalInterface instanceof it8 ? (it8) iInterfaceQueryLocalInterface : new gt8(iBinder);
        }
        y0l y0lVar = (y0l) this.G.F;
        y0lVar.m = gt8Var;
        ArrayList arrayList = y0lVar.d;
        bnh bnhVar = y0lVar.b;
        bnhVar.i("linkToDeath", new Object[0]);
        try {
            y0lVar.m.asBinder().linkToDeath(y0lVar.j, 0);
        } catch (RemoteException e) {
            Object[] objArr = new Object[0];
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", bnh.k((String) bnhVar.F, "linkToDeath failed", objArr), e);
            }
        }
        y0lVar.g = false;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        arrayList.clear();
    }
}
