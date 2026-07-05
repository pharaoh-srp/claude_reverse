package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes3.dex */
public final class znj extends b88 {
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
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
        return iInterfaceQueryLocalInterface instanceof enj ? (enj) iInterfaceQueryLocalInterface : new enj(iBinder, "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService", 0);
    }

    @Override // defpackage.fe1
    public final jf7[] q() {
        return jik.c;
    }

    @Override // defpackage.fe1
    public final String u() {
        return "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService";
    }

    @Override // defpackage.fe1
    public final String v() {
        return "com.google.android.gms.chimera.container.moduleinstall.ModuleInstallService.START";
    }

    @Override // defpackage.fe1
    public final boolean x() {
        return true;
    }
}
