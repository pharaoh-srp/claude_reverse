package defpackage;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zqa extends m08 implements pz7 {
    public static final zqa E = new zqa(2, n88.class, "setOnPoiClickListener", "setOnPoiClickListener(Lcom/google/android/gms/maps/GoogleMap$OnPoiClickListener;)V", 0);

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        n88 n88Var = (n88) obj;
        vqa vqaVar = (vqa) obj2;
        n88Var.getClass();
        hfk hfkVar = n88Var.a;
        try {
            if (vqaVar == null) {
                Parcel parcelH = hfkVar.H();
                gyj.d(parcelH, null);
                hfkVar.L(parcelH, 80);
            } else {
                voj vojVar = new voj(vqaVar);
                Parcel parcelH2 = hfkVar.H();
                gyj.d(parcelH2, vojVar);
                hfkVar.L(parcelH2, 80);
            }
            return iei.a;
        } catch (RemoteException e) {
            poc.q(e);
            return null;
        }
    }
}
