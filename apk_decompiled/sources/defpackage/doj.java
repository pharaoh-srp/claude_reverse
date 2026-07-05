package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
public final class doj extends b88 {
    public final Bundle d0;

    public doj(rl rlVar, Context context, Looper looper, kmj kmjVar, kmj kmjVar2) {
        super(context, looper, 212, rlVar, kmjVar, kmjVar2, 0);
        this.d0 = new Bundle();
    }

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
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof soj ? (soj) iInterfaceQueryLocalInterface : new soj(iBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService", 1);
    }

    @Override // defpackage.fe1
    public final jf7[] q() {
        return kik.e;
    }

    @Override // defpackage.fe1
    public final Bundle r() {
        return this.d0;
    }

    @Override // defpackage.fe1
    public final String u() {
        return "com.google.android.gms.auth.api.identity.internal.ISignInService";
    }

    @Override // defpackage.fe1
    public final String v() {
        return "com.google.android.gms.auth.api.identity.service.signin.START";
    }

    @Override // defpackage.fe1
    public final boolean x() {
        return true;
    }
}
