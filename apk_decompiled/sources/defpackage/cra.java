package defpackage;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class cra extends m08 implements pz7 {
    public static final cra E = new cra(2, n88.class, "setOnMapClickListener", "setOnMapClickListener(Lcom/google/android/gms/maps/GoogleMap$OnMapClickListener;)V", 0);

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        n88 n88Var = (n88) obj;
        qqa qqaVar = (qqa) obj2;
        n88Var.getClass();
        hfk hfkVar = n88Var.a;
        try {
            if (qqaVar == null) {
                Parcel parcelH = hfkVar.H();
                gyj.d(parcelH, null);
                hfkVar.L(parcelH, 28);
            } else {
                voj vojVar = new voj(qqaVar);
                Parcel parcelH2 = hfkVar.H();
                gyj.d(parcelH2, vojVar);
                hfkVar.L(parcelH2, 28);
            }
            return iei.a;
        } catch (RemoteException e) {
            poc.q(e);
            return null;
        }
    }
}
