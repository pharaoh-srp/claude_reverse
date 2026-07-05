package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class x61 extends a4 {
    public static final Parcelable.Creator<x61> CREATOR = new zwj(12);
    public final kh7 E;
    public final m4l F;
    public final xoi G;
    public final e6l H;
    public final opj I;
    public final aqj J;
    public final b5l K;
    public final nqj L;
    public final v98 M;
    public final mrj N;
    public final ktj O;
    public final arj P;

    public x61(kh7 kh7Var, m4l m4lVar, xoi xoiVar, e6l e6lVar, opj opjVar, aqj aqjVar, b5l b5lVar, nqj nqjVar, v98 v98Var, mrj mrjVar, ktj ktjVar, arj arjVar) {
        this.E = kh7Var;
        this.G = xoiVar;
        this.F = m4lVar;
        this.H = e6lVar;
        this.I = opjVar;
        this.J = aqjVar;
        this.K = b5lVar;
        this.L = nqjVar;
        this.M = v98Var;
        this.N = mrjVar;
        this.O = ktjVar;
        this.P = arjVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x61)) {
            return false;
        }
        x61 x61Var = (x61) obj;
        return gb9.v(this.E, x61Var.E) && gb9.v(this.F, x61Var.F) && gb9.v(this.G, x61Var.G) && gb9.v(this.H, x61Var.H) && gb9.v(this.I, x61Var.I) && gb9.v(this.J, x61Var.J) && gb9.v(this.K, x61Var.K) && gb9.v(this.L, x61Var.L) && gb9.v(this.M, x61Var.M) && gb9.v(this.N, x61Var.N) && gb9.v(this.O, x61Var.O) && gb9.v(this.P, x61Var.P);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.E);
        String strValueOf2 = String.valueOf(this.F);
        String strValueOf3 = String.valueOf(this.G);
        String strValueOf4 = String.valueOf(this.H);
        String strValueOf5 = String.valueOf(this.I);
        String strValueOf6 = String.valueOf(this.J);
        String strValueOf7 = String.valueOf(this.K);
        String strValueOf8 = String.valueOf(this.L);
        String strValueOf9 = String.valueOf(this.M);
        String strValueOf10 = String.valueOf(this.N);
        String strValueOf11 = String.valueOf(this.O);
        StringBuilder sbR = kgh.r("AuthenticationExtensions{\n fidoAppIdExtension=", strValueOf, ", \n cableAuthenticationExtension=", strValueOf2, ", \n userVerificationMethodExtension=");
        kgh.u(sbR, strValueOf3, ", \n googleMultiAssertionExtension=", strValueOf4, ", \n googleSessionIdExtension=");
        kgh.u(sbR, strValueOf5, ", \n googleSilentVerificationExtension=", strValueOf6, ", \n devicePublicKeyExtension=");
        kgh.u(sbR, strValueOf7, ", \n googleTunnelServerIdExtension=", strValueOf8, ", \n googleThirdPartyPaymentExtension=");
        kgh.u(sbR, strValueOf9, ", \n prfExtension=", strValueOf10, ", \n simpleTransactionAuthorizationExtension=");
        return ij0.m(sbR, strValueOf11, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.E0(parcel, 2, this.E, i);
        xn5.E0(parcel, 3, this.F, i);
        xn5.E0(parcel, 4, this.G, i);
        xn5.E0(parcel, 5, this.H, i);
        xn5.E0(parcel, 6, this.I, i);
        xn5.E0(parcel, 7, this.J, i);
        xn5.E0(parcel, 8, this.K, i);
        xn5.E0(parcel, 9, this.L, i);
        xn5.E0(parcel, 10, this.M, i);
        xn5.E0(parcel, 11, this.N, i);
        xn5.E0(parcel, 12, this.O, i);
        xn5.E0(parcel, 13, this.P, i);
        xn5.L0(parcel, iK0);
    }
}
