package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes3.dex */
public final class qv8 extends b88 {
    @Override // defpackage.fe1
    public final boolean B() {
        return true;
    }

    @Override // defpackage.fe1, defpackage.ge0
    public final int i() {
        return 17895000;
    }

    @Override // defpackage.fe1
    public final IInterface n(IBinder iBinder) {
        iBinder.getClass();
        int i = ut8.j;
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
        return iInterfaceQueryLocalInterface instanceof vt8 ? (vt8) iInterfaceQueryLocalInterface : new tt8(iBinder);
    }

    @Override // defpackage.fe1
    public final jf7[] q() {
        return pik.d;
    }

    @Override // defpackage.fe1
    public final String u() {
        return "com.google.android.gms.identitycredentials.internal.IIdentityCredentialService";
    }

    @Override // defpackage.fe1
    public final String v() {
        return "com.google.android.gms.identitycredentials.service.START";
    }

    @Override // defpackage.fe1
    public final boolean x() {
        return true;
    }
}
