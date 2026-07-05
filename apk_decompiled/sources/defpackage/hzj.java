package defpackage;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONException;

/* JADX INFO: loaded from: classes3.dex */
public final class hzj extends rlj {
    public final z22 j;
    public final e3k k;
    public final int l;

    public hzj(z22 z22Var, cbf cbfVar, int i) {
        super("com.android.vending.billing.IInAppBillingGetBillingConfigCallback", 2);
        this.j = z22Var;
        this.k = cbfVar;
        this.l = i;
    }

    @Override // defpackage.rlj
    public final boolean b(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) atj.a(parcel);
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(grc.p(iDataAvail, "Parcel data not fully consumed, unread size: "));
        }
        int i2 = this.l;
        isk iskVar = isk.BROADCAST_ACTION_UNSPECIFIED;
        e3k e3kVar = this.k;
        z22 z22Var = this.j;
        if (bundle == null) {
            hp1 hp1Var = y3k.f;
            ((cbf) e3kVar).w(a3k.b(63, 13, hp1Var, null, iskVar), i2);
            z22Var.b(hp1Var, null);
        } else {
            int iA = jyj.a("BillingClient", bundle);
            String strF = jyj.f("BillingClient", bundle);
            gp1 gp1VarA = hp1.a();
            gp1VarA.E = iA;
            gp1VarA.G = strF;
            if (iA != 0) {
                jyj.h("BillingClient", "getBillingConfig() failed. Response code: " + iA);
                hp1 hp1VarB = gp1VarA.b();
                ((cbf) e3kVar).w(a3k.b(23, 13, hp1VarB, null, iskVar), i2);
                z22Var.b(hp1VarB, null);
            } else if (bundle.containsKey("BILLING_CONFIG")) {
                try {
                    z22Var.b(gp1VarA.b(), new wg(bundle.getString("BILLING_CONFIG"), 8));
                } catch (JSONException e) {
                    jyj.i("BillingClient", "Got a JSON exception trying to decode BillingConfig. \n Exception: ", e);
                    hp1 hp1Var2 = y3k.f;
                    ((cbf) e3kVar).w(a3k.b(65, 13, hp1Var2, null, iskVar), i2);
                    z22Var.b(hp1Var2, null);
                }
            } else {
                jyj.h("BillingClient", "getBillingConfig() returned a bundle with neither an error nor a billing config response");
                gp1VarA.E = 6;
                hp1 hp1VarB2 = gp1VarA.b();
                ((cbf) e3kVar).w(a3k.b(64, 13, hp1VarB2, null, iskVar), i2);
                z22Var.b(hp1VarB2, null);
            }
        }
        parcel2.writeNoException();
        return true;
    }
}
