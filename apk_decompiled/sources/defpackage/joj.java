package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
public final class joj extends b88 {
    public final ioj d0;

    public joj(Context context, Looper looper, rl rlVar, ioj iojVar, kmj kmjVar, kmj kmjVar2) {
        super(context, looper, 68, rlVar, kmjVar, kmjVar2, 0);
        iojVar = iojVar == null ? ioj.G : iojVar;
        dke dkeVar = new dke();
        dkeVar.E = Boolean.FALSE;
        ioj iojVar2 = ioj.G;
        iojVar.getClass();
        dkeVar.E = Boolean.valueOf(iojVar.E);
        dkeVar.F = iojVar.F;
        dkeVar.F = eoj.a();
        this.d0 = new ioj(dkeVar);
    }

    @Override // defpackage.fe1, defpackage.ge0
    public final int i() {
        return 12800000;
    }

    @Override // defpackage.fe1
    public final IInterface n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return iInterfaceQueryLocalInterface instanceof loj ? (loj) iInterfaceQueryLocalInterface : new loj(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService", 1);
    }

    @Override // defpackage.fe1
    public final Bundle r() {
        ioj iojVar = this.d0;
        iojVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", iojVar.E);
        bundle.putString("log_session_id", iojVar.F);
        return bundle;
    }

    @Override // defpackage.fe1
    public final String u() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // defpackage.fe1
    public final String v() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }
}
