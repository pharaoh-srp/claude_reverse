package defpackage;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wqa extends m08 implements pz7 {
    public static final wqa E = new wqa(2, n88.class, "setOnMyLocationButtonClickListener", "setOnMyLocationButtonClickListener(Lcom/google/android/gms/maps/GoogleMap$OnMyLocationButtonClickListener;)V", 0);

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        n88 n88Var = (n88) obj;
        tqa tqaVar = (tqa) obj2;
        n88Var.getClass();
        hfk hfkVar = n88Var.a;
        try {
            if (tqaVar == null) {
                Parcel parcelH = hfkVar.H();
                gyj.d(parcelH, null);
                hfkVar.L(parcelH, 37);
            } else {
                voj vojVar = new voj(tqaVar);
                Parcel parcelH2 = hfkVar.H();
                gyj.d(parcelH2, vojVar);
                hfkVar.L(parcelH2, 37);
            }
            return iei.a;
        } catch (RemoteException e) {
            poc.q(e);
            return null;
        }
    }
}
