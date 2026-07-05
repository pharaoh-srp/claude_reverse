package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* JADX INFO: loaded from: classes3.dex */
public final class i6g extends b88 {
    public final boolean d0;
    public final rl e0;
    public final Bundle f0;
    public final Integer g0;

    public i6g(Context context, Looper looper, rl rlVar, Bundle bundle, h88 h88Var, i88 i88Var) {
        super(context, looper, 44, rlVar, h88Var, i88Var, 0);
        this.d0 = true;
        this.e0 = rlVar;
        this.f0 = bundle;
        this.g0 = (Integer) rlVar.J;
    }

    public final void E() {
        f(new ive(this));
    }

    public final void F(xmj xmjVar) {
        try {
            this.e0.getClass();
            Account account = new Account("<<default account>>", "com.google");
            GoogleSignInAccount googleSignInAccountB = "<<default account>>".equals(account.name) ? nog.a(this.G).b() : null;
            Integer num = this.g0;
            dgj.v(num);
            wnj wnjVar = new wnj(2, account, num.intValue(), googleSignInAccountB);
            gnj gnjVar = (gnj) t();
            onj onjVar = new onj(1, wnjVar);
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(gnjVar.k);
            rmj.c(parcelObtain, onjVar);
            parcelObtain.writeStrongBinder(xmjVar);
            gnjVar.c(parcelObtain, 12);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                xmjVar.k.post(new s2k(xmjVar, new qnj(1, new hh4(8, null, null), null), false, 9));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    @Override // defpackage.fe1, defpackage.ge0
    public final int i() {
        return 12451000;
    }

    @Override // defpackage.fe1, defpackage.ge0
    public final boolean l() {
        return this.d0;
    }

    @Override // defpackage.fe1
    public final IInterface n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof gnj ? (gnj) iInterfaceQueryLocalInterface : new gnj(iBinder, "com.google.android.gms.signin.internal.ISignInService", 0);
    }

    @Override // defpackage.fe1
    public final Bundle r() {
        rl rlVar = this.e0;
        boolean zEquals = this.G.getPackageName().equals((String) rlVar.E);
        Bundle bundle = this.f0;
        if (!zEquals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) rlVar.E);
        }
        return bundle;
    }

    @Override // defpackage.fe1
    public final String u() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // defpackage.fe1
    public final String v() {
        return "com.google.android.gms.signin.service.START";
    }
}
