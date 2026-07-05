package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes3.dex */
public abstract class xqj extends rlj implements crj {
    public static crj H(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
        return iInterfaceQueryLocalInterface instanceof crj ? (crj) iInterfaceQueryLocalInterface : new tqj(iBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate", 3);
    }
}
