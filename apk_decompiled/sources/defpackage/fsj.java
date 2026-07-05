package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes3.dex */
public abstract class fsj extends rlj implements ksj {
    public static ksj H(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
        return iInterfaceQueryLocalInterface instanceof ksj ? (ksj) iInterfaceQueryLocalInterface : new asj(iBinder, "com.android.vending.billing.IInAppBillingService", 7);
    }
}
