package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* JADX INFO: loaded from: classes3.dex */
public final class wnj extends a4 {
    public static final Parcelable.Creator<wnj> CREATOR = new zmj(6);
    public final int E;
    public final Account F;
    public final int G;
    public final GoogleSignInAccount H;

    public wnj(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.E = i;
        this.F = account;
        this.G = i2;
        this.H = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.J0(parcel, 1, 4);
        parcel.writeInt(this.E);
        xn5.E0(parcel, 2, this.F, i);
        xn5.J0(parcel, 3, 4);
        parcel.writeInt(this.G);
        xn5.E0(parcel, 4, this.H, i);
        xn5.L0(parcel, iK0);
    }
}
