package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.a4;
import defpackage.dgj;
import defpackage.xn5;
import defpackage.zmj;

/* JADX INFO: loaded from: classes3.dex */
public final class SignInConfiguration extends a4 implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new zmj(18);
    public final String E;
    public final GoogleSignInOptions F;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        dgj.s(str);
        this.E = str;
        this.F = googleSignInOptions;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.E.equals(signInConfiguration.E)) {
            GoogleSignInOptions googleSignInOptions = signInConfiguration.F;
            GoogleSignInOptions googleSignInOptions2 = this.F;
            if (googleSignInOptions2 == null) {
                if (googleSignInOptions == null) {
                    return true;
                }
            } else if (googleSignInOptions2.equals(googleSignInOptions)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1 * 31;
        String str = this.E;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        GoogleSignInOptions googleSignInOptions = this.F;
        return iHashCode + (googleSignInOptions != null ? googleSignInOptions.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.F0(parcel, 2, this.E);
        xn5.E0(parcel, 5, this.F, i);
        xn5.L0(parcel, iK0);
    }
}
