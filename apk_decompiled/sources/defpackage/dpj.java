package defpackage;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.os.SharedMemory;
import androidx.health.platform.client.proto.g;
import androidx.health.platform.client.proto.m;
import androidx.health.platform.client.proto.s;
import androidx.health.platform.client.proto.w;
import java.io.Closeable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final class dpj implements Parcelable.Creator {
    public static final dpj b = new dpj(0);
    public final /* synthetic */ int a;

    public /* synthetic */ dpj(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        m94 m94Var = null;
        Bundle bundleS = null;
        Bundle bundleS2 = null;
        String strX = null;
        Bundle bundleS3 = null;
        Bundle bundleS4 = null;
        String strX2 = null;
        PendingIntent pendingIntent = null;
        Bundle bundleS5 = null;
        switch (this.a) {
            case 0:
                int iDataPosition = parcel.dataPosition();
                if (parcel.readInt() != -204102970) {
                    parcel.setDataPosition(iDataPosition - 4);
                    return hf0.H;
                }
                int iK0 = sf5.k0(parcel);
                while (parcel.dataPosition() < iK0) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c == 1) {
                        m94Var = (m94) sf5.v(parcel, i, m94.CREATOR);
                    } else if (c != 2) {
                        sf5.g0(parcel, i);
                    } else {
                        zT = sf5.T(parcel, i);
                    }
                }
                sf5.D(parcel, iK0);
                return new hf0(m94Var, zT);
            case 1:
                parcel.getClass();
                return new pc(parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
            case 2:
                parcel.getClass();
                int i2 = parcel.readInt();
                if (i2 == 0) {
                    byte[] bArrCreateByteArray = parcel.createByteArray();
                    if (bArrCreateByteArray == null) {
                        return null;
                    }
                    s sVarV = s.v(bArrCreateByteArray);
                    sVarV.getClass();
                    return new jr(sVarV);
                }
                if (i2 != 1) {
                    sz6.p(grc.p(i2, "Unknown storage: "));
                    return null;
                }
                Closeable closeable = (Closeable) SharedMemory.CREATOR.createFromParcel(parcel);
                try {
                    ByteBuffer byteBufferMapReadOnly = u2g.d(closeable).mapReadOnly();
                    byteBufferMapReadOnly.getClass();
                    byte[] bArr = new byte[byteBufferMapReadOnly.remaining()];
                    byteBufferMapReadOnly.get(bArr);
                    s sVarV2 = s.v(bArr);
                    sVarV2.getClass();
                    jr jrVar = new jr(sVarV2);
                    wd6.Z(closeable, null);
                    return jrVar;
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            case 3:
                parcel.getClass();
                int i3 = parcel.readInt();
                if (i3 == 0) {
                    byte[] bArrCreateByteArray2 = parcel.createByteArray();
                    if (bArrCreateByteArray2 == null) {
                        return null;
                    }
                    w wVarQ = w.q(bArrCreateByteArray2);
                    wVarQ.getClass();
                    return new kr(wVarQ);
                }
                if (i3 != 1) {
                    sz6.p(grc.p(i3, "Unknown storage: "));
                    return null;
                }
                Closeable closeable2 = (Closeable) SharedMemory.CREATOR.createFromParcel(parcel);
                try {
                    ByteBuffer byteBufferMapReadOnly2 = u2g.d(closeable2).mapReadOnly();
                    byteBufferMapReadOnly2.getClass();
                    byte[] bArr2 = new byte[byteBufferMapReadOnly2.remaining()];
                    byteBufferMapReadOnly2.get(bArr2);
                    w wVarQ2 = w.q(bArr2);
                    wVarQ2.getClass();
                    kr krVar = new kr(wVarQ2);
                    wd6.Z(closeable2, null);
                    return krVar;
                } finally {
                }
            case 4:
                xh0 xh0Var = new xh0(parcel);
                xh0Var.E = parcel.readByte() != 0;
                return xh0Var;
            case 5:
                return new ub1(parcel);
            case 6:
                return new vb1(parcel);
            case 7:
                parcel.getClass();
                return new d02(parcel);
            case 8:
                int iK02 = sf5.k0(parcel);
                while (parcel.dataPosition() < iK02) {
                    int i4 = parcel.readInt();
                    if (((char) i4) != 1) {
                        sf5.g0(parcel, i4);
                    } else {
                        zT = sf5.T(parcel, i4);
                    }
                }
                sf5.D(parcel, iK02);
                return new xn3(zT);
            case 9:
                int iK03 = sf5.k0(parcel);
                while (parcel.dataPosition() < iK03) {
                    sf5.g0(parcel, parcel.readInt());
                }
                sf5.D(parcel, iK03);
                return new yn3();
            case 10:
                int iK04 = sf5.k0(parcel);
                while (parcel.dataPosition() < iK04) {
                    sf5.g0(parcel, parcel.readInt());
                }
                sf5.D(parcel, iK04);
                return new ao3();
            case 11:
                int iK05 = sf5.k0(parcel);
                while (parcel.dataPosition() < iK05) {
                    int i5 = parcel.readInt();
                    if (((char) i5) != 1) {
                        sf5.g0(parcel, i5);
                    } else {
                        zT = sf5.T(parcel, i5);
                    }
                }
                sf5.D(parcel, iK05);
                return new bo3(zT);
            case 12:
                int iK06 = sf5.k0(parcel);
                while (parcel.dataPosition() < iK06) {
                    int i6 = parcel.readInt();
                    if (((char) i6) != 1) {
                        sf5.g0(parcel, i6);
                    } else {
                        zT = sf5.T(parcel, i6);
                    }
                }
                sf5.D(parcel, iK06);
                return new co3(zT);
            case 13:
                int iK07 = sf5.k0(parcel);
                while (parcel.dataPosition() < iK07) {
                    int i7 = parcel.readInt();
                    if (((char) i7) != 1) {
                        sf5.g0(parcel, i7);
                    } else {
                        bundleS5 = sf5.s(parcel, i7);
                    }
                }
                sf5.D(parcel, iK07);
                return new do3(bundleS5);
            case 14:
                int iK08 = sf5.k0(parcel);
                k65 k65Var = null;
                while (parcel.dataPosition() < iK08) {
                    int i8 = parcel.readInt();
                    char c2 = (char) i8;
                    if (c2 == 1) {
                        pendingIntent = (PendingIntent) sf5.v(parcel, i8, PendingIntent.CREATOR);
                    } else if (c2 != 2) {
                        sf5.g0(parcel, i8);
                    } else {
                        k65Var = (k65) sf5.v(parcel, i8, k65.CREATOR);
                    }
                }
                sf5.D(parcel, iK08);
                return new h65(pendingIntent, k65Var);
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                int iK09 = sf5.k0(parcel);
                String strX3 = null;
                Bundle bundleS6 = null;
                Bundle bundleS7 = null;
                String strX4 = null;
                String strX5 = null;
                ResultReceiver resultReceiver = null;
                while (parcel.dataPosition() < iK09) {
                    int i9 = parcel.readInt();
                    switch ((char) i9) {
                        case 1:
                            strX3 = sf5.x(parcel, i9);
                            break;
                        case 2:
                            bundleS6 = sf5.s(parcel, i9);
                            break;
                        case 3:
                            bundleS7 = sf5.s(parcel, i9);
                            break;
                        case 4:
                            strX4 = sf5.x(parcel, i9);
                            break;
                        case 5:
                            strX5 = sf5.x(parcel, i9);
                            break;
                        case 6:
                            resultReceiver = (ResultReceiver) sf5.v(parcel, i9, ResultReceiver.CREATOR);
                            break;
                        default:
                            sf5.g0(parcel, i9);
                            break;
                    }
                }
                sf5.D(parcel, iK09);
                return new i65(strX3, bundleS6, bundleS7, strX4, strX5, resultReceiver);
            case 16:
                int iK010 = sf5.k0(parcel);
                Bundle bundleS8 = null;
                while (parcel.dataPosition() < iK010) {
                    int i10 = parcel.readInt();
                    char c3 = (char) i10;
                    if (c3 == 1) {
                        strX2 = sf5.x(parcel, i10);
                    } else if (c3 != 2) {
                        sf5.g0(parcel, i10);
                    } else {
                        bundleS8 = sf5.s(parcel, i10);
                    }
                }
                sf5.D(parcel, iK010);
                return new k65(strX2, bundleS8);
            case g.MAX_FIELD_NUMBER /* 17 */:
                int iK011 = sf5.k0(parcel);
                while (parcel.dataPosition() < iK011) {
                    int i11 = parcel.readInt();
                    if (((char) i11) != 1) {
                        sf5.g0(parcel, i11);
                    } else {
                        bundleS4 = sf5.s(parcel, i11);
                    }
                }
                sf5.D(parcel, iK011);
                return new c85(bundleS4);
            case g.AVG_FIELD_NUMBER /* 18 */:
                int iK012 = sf5.k0(parcel);
                while (parcel.dataPosition() < iK012) {
                    int i12 = parcel.readInt();
                    if (((char) i12) != 1) {
                        sf5.g0(parcel, i12);
                    } else {
                        bundleS3 = sf5.s(parcel, i12);
                    }
                }
                sf5.D(parcel, iK012);
                return new e85(bundleS3);
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                int iK013 = sf5.k0(parcel);
                Bundle bundleS9 = null;
                while (parcel.dataPosition() < iK013) {
                    int i13 = parcel.readInt();
                    char c4 = (char) i13;
                    if (c4 == 1) {
                        strX = sf5.x(parcel, i13);
                    } else if (c4 != 2) {
                        sf5.g0(parcel, i13);
                    } else {
                        bundleS9 = sf5.s(parcel, i13);
                    }
                }
                sf5.D(parcel, iK013);
                return new k95(strX, bundleS9);
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                int iK014 = sf5.k0(parcel);
                String strX6 = "";
                String strX7 = strX6;
                String strX8 = strX7;
                Bundle bundleS10 = null;
                Bundle bundleS11 = null;
                String strX9 = null;
                while (parcel.dataPosition() < iK014) {
                    int i14 = parcel.readInt();
                    switch ((char) i14) {
                        case 1:
                            strX6 = sf5.x(parcel, i14);
                            break;
                        case 2:
                            bundleS10 = sf5.s(parcel, i14);
                            break;
                        case 3:
                            bundleS11 = sf5.s(parcel, i14);
                            break;
                        case 4:
                            strX9 = sf5.x(parcel, i14);
                            break;
                        case 5:
                            strX7 = sf5.x(parcel, i14);
                            break;
                        case 6:
                            strX8 = sf5.x(parcel, i14);
                            break;
                        default:
                            sf5.g0(parcel, i14);
                            break;
                    }
                }
                sf5.D(parcel, iK014);
                return new o95(strX6, bundleS10, bundleS11, strX9, strX7, strX8);
            case 21:
                int iK015 = sf5.k0(parcel);
                while (parcel.dataPosition() < iK015) {
                    int i15 = parcel.readInt();
                    if (((char) i15) != 1) {
                        sf5.g0(parcel, i15);
                    } else {
                        bundleS2 = sf5.s(parcel, i15);
                    }
                }
                sf5.D(parcel, iK015);
                return new xa5(bundleS2);
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return new yr5(parcel.readInt());
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return new rg6(parcel);
            case 24:
                return new qg6(parcel);
            case BuildConfig.VERSION_CODE /* 25 */:
                parcel.getClass();
                int i16 = parcel.readInt();
                if (i16 == 0) {
                    byte[] bArrCreateByteArray3 = parcel.createByteArray();
                    if (bArrCreateByteArray3 == null) {
                        return null;
                    }
                    m mVarV = m.v(bArrCreateByteArray3);
                    return xik.b(mVarV.r(), mVarV.t() ? mVarV.s() : null);
                }
                if (i16 != 1) {
                    sz6.p(grc.p(i16, "Unknown storage: "));
                    return null;
                }
                Closeable closeable3 = (Closeable) SharedMemory.CREATOR.createFromParcel(parcel);
                try {
                    ByteBuffer byteBufferMapReadOnly3 = u2g.d(closeable3).mapReadOnly();
                    byteBufferMapReadOnly3.getClass();
                    byte[] bArr3 = new byte[byteBufferMapReadOnly3.remaining()];
                    byteBufferMapReadOnly3.get(bArr3);
                    m mVarV2 = m.v(bArr3);
                    hu6 hu6VarB = xik.b(mVarV2.r(), mVarV2.t() ? mVarV2.s() : null);
                    wd6.Z(closeable3, null);
                    return hu6VarB;
                } finally {
                }
            case 26:
                int iK016 = sf5.k0(parcel);
                while (parcel.dataPosition() < iK016) {
                    int i17 = parcel.readInt();
                    if (((char) i17) != 1) {
                        sf5.g0(parcel, i17);
                    } else {
                        bundleS = sf5.s(parcel, i17);
                    }
                }
                sf5.D(parcel, iK016);
                return new ib7(bundleS);
            case 27:
                nx7 nx7Var = new nx7();
                nx7Var.E = parcel.readString();
                nx7Var.F = parcel.readInt();
                return nx7Var;
            case 28:
                sx7 sx7Var = new sx7();
                sx7Var.I = null;
                sx7Var.J = new ArrayList();
                sx7Var.K = new ArrayList();
                sx7Var.E = parcel.createStringArrayList();
                sx7Var.F = parcel.createStringArrayList();
                sx7Var.G = (ub1[]) parcel.createTypedArray(ub1.CREATOR);
                sx7Var.H = parcel.readInt();
                sx7Var.I = parcel.readString();
                sx7Var.J = parcel.createStringArrayList();
                sx7Var.K = parcel.createTypedArrayList(vb1.CREATOR);
                sx7Var.L = parcel.createTypedArrayList(nx7.CREATOR);
                return sx7Var;
            default:
                return new vx7(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new hf0[i];
            case 1:
                return new pc[i];
            case 2:
                return new jr[i];
            case 3:
                return new kr[i];
            case 4:
                return new xh0[i];
            case 5:
                return new ub1[i];
            case 6:
                return new vb1[i];
            case 7:
                return new d02[i];
            case 8:
                return new xn3[i];
            case 9:
                return new yn3[i];
            case 10:
                return new ao3[i];
            case 11:
                return new bo3[i];
            case 12:
                return new co3[i];
            case 13:
                return new do3[i];
            case 14:
                return new h65[i];
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return new i65[i];
            case 16:
                return new k65[i];
            case g.MAX_FIELD_NUMBER /* 17 */:
                return new c85[i];
            case g.AVG_FIELD_NUMBER /* 18 */:
                return new e85[i];
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return new k95[i];
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return new o95[i];
            case 21:
                return new xa5[i];
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return new yr5[i];
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return new rg6[i];
            case 24:
                return new qg6[i];
            case BuildConfig.VERSION_CODE /* 25 */:
                return new hu6[i];
            case 26:
                return new ib7[i];
            case 27:
                return new nx7[i];
            case 28:
                return new sx7[i];
            default:
                return new vx7[i];
        }
    }
}
