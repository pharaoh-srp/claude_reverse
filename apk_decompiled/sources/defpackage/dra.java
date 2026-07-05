package defpackage;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dra extends m08 implements pz7 {
    public static final dra E = new dra(2, n88.class, "setOnMapLongClickListener", "setOnMapLongClickListener(Lcom/google/android/gms/maps/GoogleMap$OnMapLongClickListener;)V", 0);

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        n88 n88Var = (n88) obj;
        rqa rqaVar = (rqa) obj2;
        n88Var.getClass();
        hfk hfkVar = n88Var.a;
        try {
            if (rqaVar == null) {
                Parcel parcelH = hfkVar.H();
                gyj.d(parcelH, null);
                hfkVar.L(parcelH, 29);
            } else {
                voj vojVar = new voj(rqaVar);
                Parcel parcelH2 = hfkVar.H();
                gyj.d(parcelH2, vojVar);
                hfkVar.L(parcelH2, 29);
            }
            return iei.a;
        } catch (RemoteException e) {
            poc.q(e);
            return null;
        }
    }
}
