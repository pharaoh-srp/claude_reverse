package defpackage;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;

/* JADX INFO: loaded from: classes3.dex */
public final class g48 extends a4 {
    public static final Parcelable.Creator<g48> CREATOR = new xok(22);
    public static final Scope[] S = new Scope[0];
    public static final jf7[] T = new jf7[0];
    public final int E;
    public final int F;
    public final int G;
    public String H;
    public IBinder I;
    public Scope[] J;
    public Bundle K;
    public Account L;
    public jf7[] M;
    public jf7[] N;
    public final boolean O;
    public final int P;
    public boolean Q;
    public final String R;

    public g48(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, jf7[] jf7VarArr, jf7[] jf7VarArr2, boolean z, int i4, boolean z2, String str2) {
        Account account2;
        Scope[] scopeArr2 = scopeArr == null ? S : scopeArr;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        jf7[] jf7VarArr3 = T;
        jf7[] jf7VarArr4 = jf7VarArr == null ? jf7VarArr3 : jf7VarArr;
        jf7VarArr3 = jf7VarArr2 != null ? jf7VarArr2 : jf7VarArr3;
        this.E = i;
        this.F = i2;
        this.G = i3;
        if ("com.google.android.gms".equals(str)) {
            this.H = "com.google.android.gms";
        } else {
            this.H = str;
        }
        if (i < 2) {
            account2 = null;
            if (iBinder != null) {
                int i5 = m7.j;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                IInterface x4lVar = iInterfaceQueryLocalInterface instanceof ft8 ? (ft8) iInterfaceQueryLocalInterface : new x4l(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 6);
                long jClearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    try {
                        x4l x4lVar2 = (x4l) x4lVar;
                        Parcel parcelE = x4lVar2.E(x4lVar2.H(), 2);
                        Account account3 = (Account) xyj.a(parcelE, Account.CREATOR);
                        parcelE.recycle();
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                        account2 = account3;
                    } catch (RemoteException unused) {
                        Log.w("AccountAccessor", "Remote account accessor probably died");
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                    }
                } catch (Throwable th) {
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                    throw th;
                }
            }
        } else {
            this.I = iBinder;
            account2 = account;
        }
        this.L = account2;
        this.J = scopeArr2;
        this.K = bundle2;
        this.M = jf7VarArr4;
        this.N = jf7VarArr3;
        this.O = z;
        this.P = i4;
        this.Q = z2;
        this.R = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        xok.a(this, parcel, i);
    }
}
