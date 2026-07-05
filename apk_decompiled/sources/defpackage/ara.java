package defpackage;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ara extends m08 implements pz7 {
    public static final ara E = new ara(2, n88.class, "setOnIndoorStateChangeListener", "setOnIndoorStateChangeListener(Lcom/google/android/gms/maps/GoogleMap$OnIndoorStateChangeListener;)V", 0);

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        n88 n88Var = (n88) obj;
        bra braVar = (bra) obj2;
        n88Var.getClass();
        hfk hfkVar = n88Var.a;
        try {
            if (braVar == null) {
                Parcel parcelH = hfkVar.H();
                gyj.d(parcelH, null);
                hfkVar.L(parcelH, 45);
            } else {
                voj vojVar = new voj(braVar);
                Parcel parcelH2 = hfkVar.H();
                gyj.d(parcelH2, vojVar);
                hfkVar.L(parcelH2, 45);
            }
            return iei.a;
        } catch (RemoteException e) {
            poc.q(e);
            return null;
        }
    }
}
