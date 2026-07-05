package defpackage;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class era extends m08 implements pz7 {
    public static final era E = new era(2, n88.class, "setOnMapLoadedCallback", "setOnMapLoadedCallback(Lcom/google/android/gms/maps/GoogleMap$OnMapLoadedCallback;)V", 0);

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        n88 n88Var = (n88) obj;
        sqa sqaVar = (sqa) obj2;
        n88Var.getClass();
        hfk hfkVar = n88Var.a;
        try {
            if (sqaVar == null) {
                Parcel parcelH = hfkVar.H();
                gyj.d(parcelH, null);
                hfkVar.L(parcelH, 42);
            } else {
                voj vojVar = new voj(sqaVar);
                Parcel parcelH2 = hfkVar.H();
                gyj.d(parcelH2, vojVar);
                hfkVar.L(parcelH2, 42);
            }
            return iei.a;
        } catch (RemoteException e) {
            poc.q(e);
            return null;
        }
    }
}
