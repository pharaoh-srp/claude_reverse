package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.a4;
import defpackage.bfk;
import defpackage.cnk;
import defpackage.gb9;
import defpackage.pak;
import defpackage.sq6;
import defpackage.xn5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class ConnectionConfiguration extends a4 implements ReflectedParcelable {
    public static final Parcelable.Creator<ConnectionConfiguration> CREATOR = new pak(2);
    public final String E;
    public final String F;
    public final int G;
    public final int H;
    public final boolean I;
    public final boolean J;
    public volatile String K;
    public final boolean L;
    public final String M;
    public final String N;
    public final int O;
    public final List P;
    public final boolean Q;
    public final boolean R;
    public final cnk S;
    public final boolean T;
    public final bfk U;
    public final int V;
    public final int W;
    public final boolean X;

    public ConnectionConfiguration(String str, String str2, int i, int i2, boolean z, boolean z2, String str3, boolean z3, String str4, String str5, int i3, ArrayList arrayList, boolean z4, boolean z5, cnk cnkVar, boolean z6, bfk bfkVar, int i4, int i5, boolean z7) {
        this.E = str;
        this.F = str2;
        this.G = i;
        this.H = i2;
        this.I = z;
        this.J = z2;
        this.K = str3;
        this.L = z3;
        this.M = str4;
        this.N = str5;
        this.O = i3;
        this.P = arrayList;
        this.Q = z4;
        this.R = z5;
        this.S = cnkVar;
        this.T = z6;
        this.U = bfkVar;
        this.V = i4;
        this.W = i5;
        this.X = z7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ConnectionConfiguration)) {
            return false;
        }
        ConnectionConfiguration connectionConfiguration = (ConnectionConfiguration) obj;
        return gb9.v(this.E, connectionConfiguration.E) && gb9.v(this.F, connectionConfiguration.F) && gb9.v(Integer.valueOf(this.G), Integer.valueOf(connectionConfiguration.G)) && gb9.v(Integer.valueOf(this.H), Integer.valueOf(connectionConfiguration.H)) && gb9.v(Boolean.valueOf(this.I), Boolean.valueOf(connectionConfiguration.I)) && gb9.v(Boolean.valueOf(this.L), Boolean.valueOf(connectionConfiguration.L)) && gb9.v(Boolean.valueOf(this.Q), Boolean.valueOf(connectionConfiguration.Q)) && gb9.v(Boolean.valueOf(this.R), Boolean.valueOf(connectionConfiguration.R));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.E, this.F, Integer.valueOf(this.G), Integer.valueOf(this.H), Boolean.valueOf(this.I), Boolean.valueOf(this.L), Boolean.valueOf(this.Q), Boolean.valueOf(this.R)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConnectionConfiguration[ Name=");
        sb.append(this.E);
        sb.append(", Address=");
        String str = this.F;
        String strConcat = "{invalid address}";
        if (str != null && str.length() == 17) {
            strConcat = "XX:XX:XX:XX:".concat(str.substring(12));
        }
        sb.append(strConcat);
        sb.append(", Type=");
        sb.append(this.G);
        sb.append(", Role=");
        sb.append(this.H);
        sb.append(", Enabled=");
        sb.append(this.I);
        sb.append(", IsConnected=");
        sb.append(this.J);
        sb.append(", PeerNodeId=");
        sb.append(this.K);
        sb.append(", BtlePriority=");
        sb.append(this.L);
        sb.append(", NodeId=");
        sb.append(this.M);
        sb.append(", PackageName=");
        sb.append(this.N);
        sb.append(", ConnectionRetryStrategy=");
        sb.append(this.O);
        sb.append(", allowedConfigPackages=");
        sb.append(this.P);
        sb.append(", Migrating=");
        sb.append(this.Q);
        sb.append(", DataItemSyncEnabled=");
        sb.append(this.R);
        sb.append(", ConnectionRestrictions=");
        sb.append(this.S);
        sb.append(", removeConnectionWhenBondRemovedByUser=");
        sb.append(this.T);
        sb.append(", maxSupportedRemoteAndroidSdkVersion=");
        sb.append(this.V);
        sb.append(", runtimeType=");
        sb.append(this.W);
        sb.append(", skipConnectingIfDeviceNotBonded=");
        return sq6.v("]", sb, this.X);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.E;
        int iK0 = xn5.K0(parcel, 20293);
        xn5.F0(parcel, 2, str);
        xn5.F0(parcel, 3, this.F);
        int i2 = this.G;
        xn5.J0(parcel, 4, 4);
        parcel.writeInt(i2);
        int i3 = this.H;
        xn5.J0(parcel, 5, 4);
        parcel.writeInt(i3);
        boolean z = this.I;
        xn5.J0(parcel, 6, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.J;
        xn5.J0(parcel, 7, 4);
        parcel.writeInt(z2 ? 1 : 0);
        xn5.F0(parcel, 8, this.K);
        boolean z3 = this.L;
        xn5.J0(parcel, 9, 4);
        parcel.writeInt(z3 ? 1 : 0);
        xn5.F0(parcel, 10, this.M);
        xn5.F0(parcel, 11, this.N);
        int i4 = this.O;
        xn5.J0(parcel, 12, 4);
        parcel.writeInt(i4);
        xn5.G0(parcel, 13, this.P);
        boolean z4 = this.Q;
        xn5.J0(parcel, 14, 4);
        parcel.writeInt(z4 ? 1 : 0);
        boolean z5 = this.R;
        xn5.J0(parcel, 15, 4);
        parcel.writeInt(z5 ? 1 : 0);
        xn5.E0(parcel, 16, this.S, i);
        boolean z6 = this.T;
        xn5.J0(parcel, 17, 4);
        parcel.writeInt(z6 ? 1 : 0);
        xn5.E0(parcel, 18, this.U, i);
        int i5 = this.V;
        xn5.J0(parcel, 19, 4);
        parcel.writeInt(i5);
        int i6 = this.W;
        xn5.J0(parcel, 20, 4);
        parcel.writeInt(i6);
        boolean z7 = this.X;
        xn5.J0(parcel, 21, 4);
        parcel.writeInt(z7 ? 1 : 0);
        xn5.L0(parcel, iK0);
    }
}
