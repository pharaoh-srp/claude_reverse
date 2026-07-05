package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.a4;
import defpackage.dgj;
import defpackage.xn5;
import defpackage.zmj;

/* JADX INFO: loaded from: classes3.dex */
public class SignInAccount extends a4 implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new zmj(8);
    public final String E;
    public final GoogleSignInAccount F;
    public final String G;

    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.F = googleSignInAccount;
        dgj.t(str, "8.3 and 8.4 SDKs require non-null email");
        this.E = str;
        dgj.t(str2, "8.3 and 8.4 SDKs require non-null userId");
        this.G = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.F0(parcel, 4, this.E);
        xn5.E0(parcel, 7, this.F, i);
        xn5.F0(parcel, 8, this.G);
        xn5.L0(parcel, iK0);
    }
}
