package defpackage;

import android.content.Context;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes.dex */
public final class yo1 {
    public volatile a5 a;
    public final Context b;
    public volatile txd c;
    public volatile boolean d;

    public /* synthetic */ yo1(Context context) {
        this.b = context;
    }

    public final zo1 a() {
        Context context = this.b;
        if (this.c == null) {
            sz6.p("Please provide a valid listener for purchases updates.");
            return null;
        }
        if (this.a == null) {
            sz6.p("Pending purchases for one-time products must be supported.");
            return null;
        }
        this.a.getClass();
        txd txdVar = this.c;
        a5 a5Var = this.a;
        if (txdVar == null) {
            return b() ? new t2k(a5Var, context, this) : new zo1(a5Var, context, this);
        }
        txd txdVar2 = this.c;
        return b() ? new t2k(a5Var, context, txdVar2, this) : new zo1(a5Var, context, txdVar2, this);
    }

    public final boolean b() {
        try {
            Context context = this.b;
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), FreeTypeConstants.FT_LOAD_PEDANTIC).metaData.getBoolean("com.google.android.play.billingclient.enableBillingOverridesTesting", false);
        } catch (Exception e) {
            jyj.i("BillingClient", "Unable to retrieve metadata value for enableBillingOverridesTesting.", e);
            return false;
        }
    }
}
