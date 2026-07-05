package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: loaded from: classes3.dex */
public class nua extends a4 {
    public static final Parcelable.Creator<nua> CREATOR = new o1l(2);
    public LatLng E;
    public String F;
    public String G;
    public sq1 H;
    public float I;
    public float J;
    public boolean K;
    public boolean L;
    public boolean M;
    public float N;
    public float O;
    public float P;
    public float Q;
    public float R;
    public int S;
    public View T;
    public int U;
    public String V;
    public float W;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.E0(parcel, 2, this.E, i);
        xn5.F0(parcel, 3, this.F);
        xn5.F0(parcel, 4, this.G);
        sq1 sq1Var = this.H;
        xn5.B0(parcel, 5, sq1Var == null ? null : sq1Var.a.asBinder());
        float f = this.I;
        xn5.J0(parcel, 6, 4);
        parcel.writeFloat(f);
        float f2 = this.J;
        xn5.J0(parcel, 7, 4);
        parcel.writeFloat(f2);
        boolean z = this.K;
        xn5.J0(parcel, 8, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.L;
        xn5.J0(parcel, 9, 4);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z3 = this.M;
        xn5.J0(parcel, 10, 4);
        parcel.writeInt(z3 ? 1 : 0);
        float f3 = this.N;
        xn5.J0(parcel, 11, 4);
        parcel.writeFloat(f3);
        float f4 = this.O;
        xn5.J0(parcel, 12, 4);
        parcel.writeFloat(f4);
        float f5 = this.P;
        xn5.J0(parcel, 13, 4);
        parcel.writeFloat(f5);
        float f6 = this.Q;
        xn5.J0(parcel, 14, 4);
        parcel.writeFloat(f6);
        float f7 = this.R;
        xn5.J0(parcel, 15, 4);
        parcel.writeFloat(f7);
        int i2 = this.S;
        xn5.J0(parcel, 17, 4);
        parcel.writeInt(i2);
        xn5.B0(parcel, 18, new cbc(this.T));
        int i3 = this.U;
        xn5.J0(parcel, 19, 4);
        parcel.writeInt(i3);
        xn5.F0(parcel, 20, this.V);
        float f8 = this.W;
        xn5.J0(parcel, 21, 4);
        parcel.writeFloat(f8);
        xn5.L0(parcel, iK0);
    }
}
