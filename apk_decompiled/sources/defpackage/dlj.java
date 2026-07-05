package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class dlj extends amj {
    public final /* synthetic */ IBinder F;
    public final /* synthetic */ lj1 G;

    public dlj(lj1 lj1Var, IBinder iBinder) {
        this.F = iBinder;
        this.G = lj1Var;
    }

    @Override // defpackage.amj
    public final void b() {
        ylj wljVar;
        flj fljVar = (flj) this.G.F;
        yl4 yl4Var = fljVar.i;
        ArrayList arrayList = fljVar.d;
        zlj zljVar = fljVar.b;
        yl4Var.getClass();
        int i = xlj.j;
        IBinder iBinder = this.F;
        if (iBinder == null) {
            wljVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IIntegrityService");
            wljVar = iInterfaceQueryLocalInterface instanceof ylj ? (ylj) iInterfaceQueryLocalInterface : new wlj(iBinder);
        }
        fljVar.n = wljVar;
        zljVar.a("linkToDeath", new Object[0]);
        try {
            fljVar.n.asBinder().linkToDeath(fljVar.k, 0);
        } catch (RemoteException e) {
            Object[] objArr = new Object[0];
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", zlj.c(zljVar.a, "linkToDeath failed", objArr), e);
            }
        }
        fljVar.g = false;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        arrayList.clear();
    }
}
