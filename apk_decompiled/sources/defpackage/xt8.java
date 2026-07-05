package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes2.dex */
public abstract class xt8 extends Binder implements yt8 {
    public static yt8 b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(yt8.a);
        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof yt8)) {
            return (yt8) iInterfaceQueryLocalInterface;
        }
        wt8 wt8Var = new wt8();
        wt8Var.i = iBinder;
        return wt8Var;
    }
}
