package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import androidx.health.platform.client.proto.g;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.ConnectionConfiguration;
import com.google.android.gms.wearable.Term;
import java.util.ArrayList;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final class pak implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ pak(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iY = 0;
        int iY2 = 0;
        int iY3 = 0;
        boolean zT = false;
        int iY4 = 0;
        int iY5 = 0;
        int iY6 = 0;
        int iY7 = 0;
        int iY8 = 0;
        int iY9 = 0;
        int iY10 = 0;
        int iY11 = 0;
        int iY12 = 0;
        int iY13 = 0;
        int iY14 = 0;
        int iY15 = 0;
        int iY16 = 0;
        int iY17 = 0;
        int iY18 = 0;
        int iY19 = 0;
        int iY20 = 0;
        int iY21 = 0;
        int iY22 = 0;
        String strX = null;
        String strX2 = null;
        lzj lzjVar = null;
        String strX3 = null;
        String strX4 = null;
        String strX5 = null;
        ArrayList arrayListA = null;
        String strX6 = null;
        ArrayList arrayListA2 = null;
        byte[] bArrT = null;
        String strX7 = null;
        rnk rnkVar = null;
        ArrayList arrayListY = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
        ArrayList arrayListA3 = null;
        e8k e8kVar = null;
        String strX8 = null;
        o7k o7kVar = null;
        ArrayList arrayListA4 = null;
        ConnectionConfiguration[] connectionConfigurationArr = null;
        ConnectionConfiguration connectionConfiguration = null;
        switch (this.a) {
            case 0:
                int iK0 = sf5.k0(parcel);
                boolean zT2 = false;
                boolean zT3 = false;
                while (parcel.dataPosition() < iK0) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c == 2) {
                        iY = sf5.Y(parcel, i);
                    } else if (c == 3) {
                        zT2 = sf5.T(parcel, i);
                    } else if (c != 4) {
                        sf5.g0(parcel, i);
                    } else {
                        zT3 = sf5.T(parcel, i);
                    }
                }
                sf5.D(parcel, iK0);
                return new tak(iY, zT2, zT3);
            case 1:
                int iK02 = sf5.k0(parcel);
                boolean zT4 = false;
                while (parcel.dataPosition() < iK02) {
                    int i2 = parcel.readInt();
                    char c2 = (char) i2;
                    if (c2 == 2) {
                        iY22 = sf5.Y(parcel, i2);
                    } else if (c2 != 3) {
                        sf5.g0(parcel, i2);
                    } else {
                        zT4 = sf5.T(parcel, i2);
                    }
                }
                sf5.D(parcel, iK02);
                return new hbk(iY22, zT4);
            case 2:
                int iK03 = sf5.k0(parcel);
                boolean zT5 = true;
                boolean zT6 = true;
                int iY23 = 0;
                int iY24 = 0;
                boolean zT7 = false;
                boolean zT8 = false;
                boolean zT9 = false;
                int iY25 = 0;
                boolean zT10 = false;
                int iY26 = 0;
                int iY27 = 0;
                boolean zT11 = false;
                String strX9 = null;
                String strX10 = null;
                String strX11 = null;
                String strX12 = null;
                String strX13 = null;
                ArrayList arrayListY2 = null;
                cnk cnkVar = null;
                bfk bfkVar = null;
                while (parcel.dataPosition() < iK03) {
                    int i3 = parcel.readInt();
                    switch ((char) i3) {
                        case 2:
                            strX9 = sf5.x(parcel, i3);
                            break;
                        case 3:
                            strX10 = sf5.x(parcel, i3);
                            break;
                        case 4:
                            iY23 = sf5.Y(parcel, i3);
                            break;
                        case 5:
                            iY24 = sf5.Y(parcel, i3);
                            break;
                        case 6:
                            zT7 = sf5.T(parcel, i3);
                            break;
                        case 7:
                            zT8 = sf5.T(parcel, i3);
                            break;
                        case '\b':
                            strX11 = sf5.x(parcel, i3);
                            break;
                        case '\t':
                            zT9 = sf5.T(parcel, i3);
                            break;
                        case '\n':
                            strX12 = sf5.x(parcel, i3);
                            break;
                        case 11:
                            strX13 = sf5.x(parcel, i3);
                            break;
                        case '\f':
                            iY25 = sf5.Y(parcel, i3);
                            break;
                        case '\r':
                            arrayListY2 = sf5.y(parcel, i3);
                            break;
                        case 14:
                            zT10 = sf5.T(parcel, i3);
                            break;
                        case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                            zT5 = sf5.T(parcel, i3);
                            break;
                        case 16:
                            cnkVar = (cnk) sf5.v(parcel, i3, cnk.CREATOR);
                            break;
                        case g.MAX_FIELD_NUMBER /* 17 */:
                            zT6 = sf5.T(parcel, i3);
                            break;
                        case g.AVG_FIELD_NUMBER /* 18 */:
                            bfkVar = (bfk) sf5.v(parcel, i3, bfk.CREATOR);
                            break;
                        case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            iY26 = sf5.Y(parcel, i3);
                            break;
                        case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                            iY27 = sf5.Y(parcel, i3);
                            break;
                        case 21:
                            zT11 = sf5.T(parcel, i3);
                            break;
                        default:
                            sf5.g0(parcel, i3);
                            break;
                    }
                }
                sf5.D(parcel, iK03);
                return new ConnectionConfiguration(strX9, strX10, iY23, iY24, zT7, zT8, strX11, zT9, strX12, strX13, iY25, arrayListY2, zT10, zT5, cnkVar, zT6, bfkVar, iY26, iY27, zT11);
            case 3:
                int iK04 = sf5.k0(parcel);
                int iY28 = 0;
                String strX14 = null;
                String strX15 = null;
                String strX16 = null;
                ArrayList arrayListA5 = null;
                j7k j7kVar = null;
                while (parcel.dataPosition() < iK04) {
                    int i4 = parcel.readInt();
                    char c3 = (char) i4;
                    if (c3 == 1) {
                        iY28 = sf5.Y(parcel, i4);
                    } else if (c3 == 3) {
                        strX14 = sf5.x(parcel, i4);
                    } else if (c3 == 4) {
                        strX15 = sf5.x(parcel, i4);
                    } else if (c3 == 6) {
                        strX16 = sf5.x(parcel, i4);
                    } else if (c3 == 7) {
                        j7kVar = (j7k) sf5.v(parcel, i4, j7k.CREATOR);
                    } else if (c3 != '\b') {
                        sf5.g0(parcel, i4);
                    } else {
                        arrayListA5 = sf5.A(parcel, i4, jf7.CREATOR);
                    }
                }
                sf5.D(parcel, iK04);
                return new j7k(iY28, strX14, strX15, strX16, arrayListA5, j7kVar);
            case 4:
                int iK05 = sf5.k0(parcel);
                while (parcel.dataPosition() < iK05) {
                    int i5 = parcel.readInt();
                    char c4 = (char) i5;
                    if (c4 == 2) {
                        iY21 = sf5.Y(parcel, i5);
                    } else if (c4 != 3) {
                        sf5.g0(parcel, i5);
                    } else {
                        strX = sf5.x(parcel, i5);
                    }
                }
                sf5.D(parcel, iK05);
                return new lbk(iY21, strX);
            case 5:
                int iK06 = sf5.k0(parcel);
                while (parcel.dataPosition() < iK06) {
                    int i6 = parcel.readInt();
                    char c5 = (char) i6;
                    if (c5 == 2) {
                        iY20 = sf5.Y(parcel, i6);
                    } else if (c5 != 3) {
                        sf5.g0(parcel, i6);
                    } else {
                        connectionConfiguration = (ConnectionConfiguration) sf5.v(parcel, i6, ConnectionConfiguration.CREATOR);
                    }
                }
                sf5.D(parcel, iK06);
                return new rbk(iY20, connectionConfiguration);
            case 6:
                int iK07 = sf5.k0(parcel);
                while (parcel.dataPosition() < iK07) {
                    int i7 = parcel.readInt();
                    char c6 = (char) i7;
                    if (c6 == 2) {
                        iY19 = sf5.Y(parcel, i7);
                    } else if (c6 != 3) {
                        sf5.g0(parcel, i7);
                    } else {
                        connectionConfigurationArr = (ConnectionConfiguration[]) sf5.z(parcel, i7, ConnectionConfiguration.CREATOR);
                    }
                }
                sf5.D(parcel, iK07);
                return new ybk(iY19, connectionConfigurationArr);
            case 7:
                int iK08 = sf5.k0(parcel);
                while (parcel.dataPosition() < iK08) {
                    int i8 = parcel.readInt();
                    char c7 = (char) i8;
                    if (c7 == 2) {
                        iY18 = sf5.Y(parcel, i8);
                    } else if (c7 != 3) {
                        sf5.g0(parcel, i8);
                    } else {
                        arrayListA4 = sf5.A(parcel, i8, rnk.CREATOR);
                    }
                }
                sf5.D(parcel, iK08);
                return new fck(iY18, arrayListA4);
            case 8:
                int iK09 = sf5.k0(parcel);
                while (parcel.dataPosition() < iK09) {
                    int i9 = parcel.readInt();
                    char c8 = (char) i9;
                    if (c8 == 2) {
                        iY17 = sf5.Y(parcel, i9);
                    } else if (c8 != 3) {
                        sf5.g0(parcel, i9);
                    } else {
                        o7kVar = (o7k) sf5.v(parcel, i9, o7k.CREATOR);
                    }
                }
                sf5.D(parcel, iK09);
                return new lck(iY17, o7kVar);
            case 9:
                int iK010 = sf5.k0(parcel);
                while (parcel.dataPosition() < iK010) {
                    int i10 = parcel.readInt();
                    char c9 = (char) i10;
                    if (c9 == 2) {
                        iY16 = sf5.Y(parcel, i10);
                    } else if (c9 != 3) {
                        sf5.g0(parcel, i10);
                    } else {
                        strX8 = sf5.x(parcel, i10);
                    }
                }
                sf5.D(parcel, iK010);
                return new rck(iY16, strX8);
            case 10:
                int iK011 = sf5.k0(parcel);
                while (parcel.dataPosition() < iK011) {
                    int i11 = parcel.readInt();
                    char c10 = (char) i11;
                    if (c10 == 1) {
                        iY15 = sf5.Y(parcel, i11);
                    } else if (c10 != 2) {
                        sf5.g0(parcel, i11);
                    } else {
                        e8kVar = (e8k) sf5.v(parcel, i11, e8k.CREATOR);
                    }
                }
                sf5.D(parcel, iK011);
                return new cdk(iY15, e8kVar);
            case 11:
                int iK012 = sf5.k0(parcel);
                while (parcel.dataPosition() < iK012) {
                    int i12 = parcel.readInt();
                    char c11 = (char) i12;
                    if (c11 == 1) {
                        iY14 = sf5.Y(parcel, i12);
                    } else if (c11 != 2) {
                        sf5.g0(parcel, i12);
                    } else {
                        arrayListA3 = sf5.A(parcel, i12, e8k.CREATOR);
                    }
                }
                sf5.D(parcel, iK012);
                return new idk(iY14, arrayListA3);
            case 12:
                int iK013 = sf5.k0(parcel);
                while (parcel.dataPosition() < iK013) {
                    int i13 = parcel.readInt();
                    char c12 = (char) i13;
                    if (c12 == 2) {
                        iY13 = sf5.Y(parcel, i13);
                    } else if (c12 != 3) {
                        sf5.g0(parcel, i13);
                    } else {
                        parcelFileDescriptor = (ParcelFileDescriptor) sf5.v(parcel, i13, ParcelFileDescriptor.CREATOR);
                    }
                }
                sf5.D(parcel, iK013);
                return new pdk(iY13, parcelFileDescriptor);
            case 13:
                int iK014 = sf5.k0(parcel);
                while (parcel.dataPosition() < iK014) {
                    sf5.g0(parcel, parcel.readInt());
                }
                sf5.D(parcel, iK014);
                return new wdk();
            case 14:
                int iK015 = sf5.k0(parcel);
                ArrayList arrayListY3 = null;
                while (parcel.dataPosition() < iK015) {
                    int i14 = parcel.readInt();
                    char c13 = (char) i14;
                    if (c13 == 1) {
                        iY12 = sf5.Y(parcel, i14);
                    } else if (c13 == 2) {
                        arrayListY = sf5.y(parcel, i14);
                    } else if (c13 != 3) {
                        sf5.g0(parcel, i14);
                    } else {
                        arrayListY3 = sf5.y(parcel, i14);
                    }
                }
                sf5.D(parcel, iK015);
                return new eek(iY12, arrayListY, arrayListY3);
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                int iK016 = sf5.k0(parcel);
                while (parcel.dataPosition() < iK016) {
                    int i15 = parcel.readInt();
                    char c14 = (char) i15;
                    if (c14 == 2) {
                        iY11 = sf5.Y(parcel, i15);
                    } else if (c14 != 3) {
                        sf5.g0(parcel, i15);
                    } else {
                        rnkVar = (rnk) sf5.v(parcel, i15, rnk.CREATOR);
                    }
                }
                sf5.D(parcel, iK016);
                return new qek(iY11, rnkVar);
            case 16:
                int iK017 = sf5.k0(parcel);
                byte[] bArrT2 = null;
                byte[] bArrT3 = null;
                while (parcel.dataPosition() < iK017) {
                    int i16 = parcel.readInt();
                    char c15 = (char) i16;
                    if (c15 == 1) {
                        bArrT2 = sf5.t(parcel, i16);
                    } else if (c15 != 2) {
                        sf5.g0(parcel, i16);
                    } else {
                        bArrT3 = sf5.t(parcel, i16);
                    }
                }
                sf5.D(parcel, iK017);
                return new ebk(bArrT2 == null ? null : wik.m(bArrT2, bArrT2.length), bArrT3 != null ? wik.m(bArrT3, bArrT3.length) : null);
            case g.MAX_FIELD_NUMBER /* 17 */:
                int iK018 = sf5.k0(parcel);
                while (parcel.dataPosition() < iK018) {
                    int i17 = parcel.readInt();
                    char c16 = (char) i17;
                    if (c16 == 2) {
                        iY10 = sf5.Y(parcel, i17);
                    } else if (c16 != 3) {
                        sf5.g0(parcel, i17);
                    } else {
                        strX7 = sf5.x(parcel, i17);
                    }
                }
                sf5.D(parcel, iK018);
                return new zek(iY10, strX7);
            case g.AVG_FIELD_NUMBER /* 18 */:
                int iK019 = sf5.k0(parcel);
                int iY29 = 0;
                while (parcel.dataPosition() < iK019) {
                    int i18 = parcel.readInt();
                    char c17 = (char) i18;
                    if (c17 == 1) {
                        iY9 = sf5.Y(parcel, i18);
                    } else if (c17 == 2) {
                        iY29 = sf5.Y(parcel, i18);
                    } else if (c17 != 3) {
                        sf5.g0(parcel, i18);
                    } else {
                        bArrT = sf5.t(parcel, i18);
                    }
                }
                sf5.D(parcel, iK019);
                return new qfk(bArrT, iY9, iY29);
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                int iK020 = sf5.k0(parcel);
                boolean zT12 = false;
                while (parcel.dataPosition() < iK020) {
                    int i19 = parcel.readInt();
                    char c18 = (char) i19;
                    if (c18 == 1) {
                        iY8 = sf5.Y(parcel, i19);
                    } else if (c18 != 2) {
                        sf5.g0(parcel, i19);
                    } else {
                        zT12 = sf5.T(parcel, i19);
                    }
                }
                sf5.D(parcel, iK020);
                return new agk(iY8, zT12);
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                int iK021 = sf5.k0(parcel);
                while (parcel.dataPosition() < iK021) {
                    int i20 = parcel.readInt();
                    char c19 = (char) i20;
                    if (c19 == 1) {
                        iY7 = sf5.Y(parcel, i20);
                    } else if (c19 != 2) {
                        sf5.g0(parcel, i20);
                    } else {
                        arrayListA2 = sf5.A(parcel, i20, Term.CREATOR);
                    }
                }
                sf5.D(parcel, iK021);
                return new hgk(iY7, arrayListA2);
            case 21:
                int iK022 = sf5.k0(parcel);
                int iY30 = 0;
                while (parcel.dataPosition() < iK022) {
                    int i21 = parcel.readInt();
                    char c20 = (char) i21;
                    if (c20 == 1) {
                        strX6 = sf5.x(parcel, i21);
                    } else if (c20 == 2) {
                        iY6 = sf5.Y(parcel, i21);
                    } else if (c20 != 3) {
                        sf5.g0(parcel, i21);
                    } else {
                        iY30 = sf5.Y(parcel, i21);
                    }
                }
                sf5.D(parcel, iK022);
                return new hwk(strX6, iY6, iY30);
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                int iK023 = sf5.k0(parcel);
                while (parcel.dataPosition() < iK023) {
                    int i22 = parcel.readInt();
                    if (((char) i22) != 1) {
                        sf5.g0(parcel, i22);
                    } else {
                        arrayListA = sf5.A(parcel, i22, iuk.CREATOR);
                    }
                }
                sf5.D(parcel, iK023);
                return new bfk(arrayListA);
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                int iK024 = sf5.k0(parcel);
                byte[] bArrT4 = null;
                String strX17 = null;
                while (parcel.dataPosition() < iK024) {
                    int i23 = parcel.readInt();
                    char c21 = (char) i23;
                    if (c21 == 2) {
                        iY5 = sf5.Y(parcel, i23);
                    } else if (c21 == 3) {
                        strX5 = sf5.x(parcel, i23);
                    } else if (c21 == 4) {
                        bArrT4 = sf5.t(parcel, i23);
                    } else if (c21 != 5) {
                        sf5.g0(parcel, i23);
                    } else {
                        strX17 = sf5.x(parcel, i23);
                    }
                }
                sf5.D(parcel, iK024);
                return new hlk(iY5, strX5, strX17, bArrT4);
            case 24:
                int iK025 = sf5.k0(parcel);
                DataHolder dataHolder = null;
                while (parcel.dataPosition() < iK025) {
                    int i24 = parcel.readInt();
                    char c22 = (char) i24;
                    if (c22 == 1) {
                        strX4 = sf5.x(parcel, i24);
                    } else if (c22 != 2) {
                        sf5.g0(parcel, i24);
                    } else {
                        dataHolder = (DataHolder) sf5.v(parcel, i24, DataHolder.CREATOR);
                    }
                }
                sf5.D(parcel, iK025);
                return new nnk(strX4, dataHolder);
            case BuildConfig.VERSION_CODE /* 25 */:
                int iK026 = sf5.k0(parcel);
                while (parcel.dataPosition() < iK026) {
                    int i25 = parcel.readInt();
                    if (((char) i25) != 2) {
                        sf5.g0(parcel, i25);
                    } else {
                        iY4 = sf5.Y(parcel, i25);
                    }
                }
                sf5.D(parcel, iK026);
                return new ojk(iY4);
            case 26:
                int iK027 = sf5.k0(parcel);
                byte[] bArrT5 = null;
                while (parcel.dataPosition() < iK027) {
                    int i26 = parcel.readInt();
                    char c23 = (char) i26;
                    if (c23 == 1) {
                        zT = sf5.T(parcel, i26);
                    } else if (c23 != 2) {
                        sf5.g0(parcel, i26);
                    } else {
                        bArrT5 = sf5.t(parcel, i26);
                    }
                }
                sf5.D(parcel, iK027);
                return new rjk(zT, bArrT5 != null ? wik.m(bArrT5, bArrT5.length) : null);
            case 27:
                int iK028 = sf5.k0(parcel);
                boolean zT13 = false;
                String strX18 = null;
                while (parcel.dataPosition() < iK028) {
                    int i27 = parcel.readInt();
                    char c24 = (char) i27;
                    if (c24 == 2) {
                        strX3 = sf5.x(parcel, i27);
                    } else if (c24 == 3) {
                        strX18 = sf5.x(parcel, i27);
                    } else if (c24 == 4) {
                        iY3 = sf5.Y(parcel, i27);
                    } else if (c24 != 5) {
                        sf5.g0(parcel, i27);
                    } else {
                        zT13 = sf5.T(parcel, i27);
                    }
                }
                sf5.D(parcel, iK028);
                return new rnk(strX3, strX18, iY3, zT13);
            case 28:
                int iK029 = sf5.k0(parcel);
                while (parcel.dataPosition() < iK029) {
                    int i28 = parcel.readInt();
                    char c25 = (char) i28;
                    if (c25 == 2) {
                        iY2 = sf5.Y(parcel, i28);
                    } else if (c25 != 3) {
                        sf5.g0(parcel, i28);
                    } else {
                        lzjVar = (lzj) sf5.v(parcel, i28, lzj.CREATOR);
                    }
                }
                sf5.D(parcel, iK029);
                return new znk(iY2, lzjVar);
            default:
                int iK030 = sf5.k0(parcel);
                long jA0 = 0;
                String strX19 = null;
                while (parcel.dataPosition() < iK030) {
                    int i29 = parcel.readInt();
                    char c26 = (char) i29;
                    if (c26 == 2) {
                        strX2 = sf5.x(parcel, i29);
                    } else if (c26 == 3) {
                        strX19 = sf5.x(parcel, i29);
                    } else if (c26 != 4) {
                        sf5.g0(parcel, i29);
                    } else {
                        jA0 = sf5.a0(parcel, i29);
                    }
                }
                sf5.D(parcel, iK030);
                return new jok(strX2, strX19, jA0);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new tak[i];
            case 1:
                return new hbk[i];
            case 2:
                return new ConnectionConfiguration[i];
            case 3:
                return new j7k[i];
            case 4:
                return new lbk[i];
            case 5:
                return new rbk[i];
            case 6:
                return new ybk[i];
            case 7:
                return new fck[i];
            case 8:
                return new lck[i];
            case 9:
                return new rck[i];
            case 10:
                return new cdk[i];
            case 11:
                return new idk[i];
            case 12:
                return new pdk[i];
            case 13:
                return new wdk[i];
            case 14:
                return new eek[i];
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return new qek[i];
            case 16:
                return new ebk[i];
            case g.MAX_FIELD_NUMBER /* 17 */:
                return new zek[i];
            case g.AVG_FIELD_NUMBER /* 18 */:
                return new qfk[i];
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return new agk[i];
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return new hgk[i];
            case 21:
                return new hwk[i];
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return new bfk[i];
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return new hlk[i];
            case 24:
                return new nnk[i];
            case BuildConfig.VERSION_CODE /* 25 */:
                return new ojk[i];
            case 26:
                return new rjk[i];
            case 27:
                return new rnk[i];
            case 28:
                return new znk[i];
            default:
                return new jok[i];
        }
    }
}
