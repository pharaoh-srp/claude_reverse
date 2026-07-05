package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes3.dex */
public final class dre extends b88 {
    @Override // defpackage.fe1, defpackage.ge0
    public final int i() {
        return 17895000;
    }

    @Override // defpackage.fe1
    public final IInterface n(IBinder iBinder) {
        iBinder.getClass();
        int i = nu8.j;
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.blockstore.restorecredential.internal.IRestoreCredentialService");
        return iInterfaceQueryLocalInterface instanceof ou8 ? (ou8) iInterfaceQueryLocalInterface : new mu8(iBinder);
    }

    @Override // defpackage.fe1
    public final jf7[] q() {
        return nik.e;
    }

    @Override // defpackage.fe1
    public final String u() {
        return "com.google.android.gms.auth.blockstore.restorecredential.internal.IRestoreCredentialService";
    }

    @Override // defpackage.fe1
    public final String v() {
        return "com.google.android.gms.auth.blockstore.restorecredential.service.START_RESTORE_CRED";
    }

    @Override // defpackage.fe1
    public final boolean x() {
        return true;
    }
}
