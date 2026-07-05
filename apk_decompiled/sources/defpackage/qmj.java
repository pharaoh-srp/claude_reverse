package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public final class qmj implements mnj {
    public final /* synthetic */ Bundle a;
    public final /* synthetic */ x7b b;

    public qmj(x7b x7bVar, Bundle bundle) {
        this.b = x7bVar;
        this.a = bundle;
    }

    @Override // defpackage.mnj
    public final int a() {
        return 1;
    }

    @Override // defpackage.mnj
    public final void b() {
        lrb lrbVar = (lrb) this.b.a;
        Bundle bundle = this.a;
        lrbVar.getClass();
        try {
            Bundle bundle2 = new Bundle();
            kzj.j(bundle, bundle2);
            exk exkVar = (exk) lrbVar.G;
            Parcel parcelH = exkVar.H();
            gyj.c(parcelH, bundle2);
            exkVar.L(parcelH, 2);
            kzj.j(bundle2, bundle);
            Parcel parcelF = exkVar.F(exkVar.H(), 8);
            lu8 lu8VarF = cbc.F(parcelF.readStrongBinder());
            parcelF.recycle();
            lrbVar.H = (View) cbc.G(lu8VarF);
            ViewGroup viewGroup = (ViewGroup) lrbVar.F;
            viewGroup.removeAllViews();
            viewGroup.addView((View) lrbVar.H);
        } catch (RemoteException e) {
            poc.q(e);
        }
    }
}
