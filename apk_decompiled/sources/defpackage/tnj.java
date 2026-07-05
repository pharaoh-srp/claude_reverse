package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class tnj extends b88 {
    public final ech d0;

    public tnj(Context context, Looper looper, rl rlVar, ech echVar, kmj kmjVar, kmj kmjVar2) {
        super(context, looper, 270, rlVar, kmjVar, kmjVar2, 0);
        this.d0 = echVar;
    }

    @Override // defpackage.fe1, defpackage.ge0
    public final int i() {
        return 203400000;
    }

    @Override // defpackage.fe1
    public final /* synthetic */ IInterface n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof nnj ? (nnj) iInterfaceQueryLocalInterface : new nnj(iBinder);
    }

    @Override // defpackage.fe1
    public final jf7[] q() {
        return j8.i;
    }

    @Override // defpackage.fe1
    public final Bundle r() {
        ech echVar = this.d0;
        echVar.getClass();
        Bundle bundle = new Bundle();
        String str = echVar.E;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    @Override // defpackage.fe1
    public final String u() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // defpackage.fe1
    public final String v() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // defpackage.fe1
    public final boolean x() {
        return true;
    }
}
