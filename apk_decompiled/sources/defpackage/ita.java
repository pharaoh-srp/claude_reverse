package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ita {
    public static final qnc a = gb9.b(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 3);

    public static final void a(bta btaVar, n88 n88Var, mnc mncVar) {
        cz5 cz5Var = btaVar.b;
        int iM0 = cz5Var.M0(mncVar.b(btaVar.c));
        int iM02 = cz5Var.M0(mncVar.d());
        int iM03 = cz5Var.M0(mncVar.c(btaVar.c));
        int iM04 = cz5Var.M0(mncVar.a());
        n88Var.getClass();
        try {
            hfk hfkVar = n88Var.a;
            Parcel parcelH = hfkVar.H();
            parcelH.writeInt(iM0);
            parcelH.writeInt(iM02);
            parcelH.writeInt(iM03);
            parcelH.writeInt(iM04);
            hfkVar.L(parcelH, 39);
        } catch (RemoteException e) {
            poc.q(e);
        }
    }
}
