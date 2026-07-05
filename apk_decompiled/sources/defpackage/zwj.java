package defpackage;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import androidx.health.platform.client.proto.g;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.wearable.AppTheme;
import com.google.android.gms.wearable.internal.DataItemAssetParcelable;
import java.util.ArrayList;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final class zwj implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ zwj(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        lzj lzjVar = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
        ParcelFileDescriptor parcelFileDescriptor2 = null;
        gsj gsjVar = null;
        sok[] sokVarArr = null;
        AppTheme appTheme = null;
        ArrayList arrayListA = null;
        byte[] bArrT = null;
        Uri uri = null;
        String strX = null;
        String strX2 = null;
        String strX3 = null;
        String strX4 = null;
        String strX5 = null;
        km0 km0Var = null;
        int iY = 0;
        int iY2 = 0;
        int iY3 = 0;
        int iY4 = 0;
        int iY5 = 0;
        int iY6 = 0;
        int iY7 = 0;
        int iY8 = 0;
        int iY9 = 0;
        int iY10 = 0;
        boolean zT = false;
        int iY11 = 0;
        int iY12 = 0;
        int iY13 = 0;
        int iY14 = 0;
        int iY15 = 0;
        int iY16 = 0;
        int iY17 = 0;
        boolean zT2 = false;
        int iY18 = 0;
        switch (this.a) {
            case 0:
                int iK0 = sf5.k0(parcel);
                int iY19 = 0;
                int iY20 = 0;
                while (parcel.dataPosition() < iK0) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c == 2) {
                        lzjVar = (lzj) sf5.v(parcel, i, lzj.CREATOR);
                    } else if (c == 3) {
                        iY = sf5.Y(parcel, i);
                    } else if (c == 4) {
                        iY19 = sf5.Y(parcel, i);
                    } else if (c != 5) {
                        sf5.g0(parcel, i);
                    } else {
                        iY20 = sf5.Y(parcel, i);
                    }
                }
                sf5.D(parcel, iK0);
                return new vwj(lzjVar, iY, iY19, iY20);
            case 1:
                int iK02 = sf5.k0(parcel);
                jm0 jm0Var = null;
                im0 im0Var = null;
                hm0 hm0Var = null;
                int iY21 = 0;
                int iY22 = 0;
                int iY23 = 0;
                int iY24 = 0;
                while (parcel.dataPosition() < iK02) {
                    int i2 = parcel.readInt();
                    switch ((char) i2) {
                        case 1:
                            iY18 = sf5.Y(parcel, i2);
                            break;
                        case 2:
                            iY21 = sf5.Y(parcel, i2);
                            break;
                        case 3:
                            iY22 = sf5.Y(parcel, i2);
                            break;
                        case 4:
                            iY23 = sf5.Y(parcel, i2);
                            break;
                        case 5:
                            iY24 = sf5.Y(parcel, i2);
                            break;
                        case 6:
                            km0Var = (km0) sf5.v(parcel, i2, km0.CREATOR);
                            break;
                        case 7:
                            jm0Var = (jm0) sf5.v(parcel, i2, jm0.CREATOR);
                            break;
                        case '\b':
                            im0Var = (im0) sf5.v(parcel, i2, im0.CREATOR);
                            break;
                        case '\t':
                            hm0Var = (hm0) sf5.v(parcel, i2, hm0.CREATOR);
                            break;
                        default:
                            sf5.g0(parcel, i2);
                            break;
                    }
                }
                sf5.D(parcel, iK02);
                AppTheme appTheme2 = new AppTheme();
                appTheme2.J = new km0();
                appTheme2.K = new jm0();
                appTheme2.L = new im0();
                appTheme2.M = new hm0();
                appTheme2.E = iY18;
                appTheme2.F = iY21;
                appTheme2.G = iY22;
                appTheme2.H = iY23;
                appTheme2.I = iY24;
                if (km0Var == null) {
                    km0Var = new km0();
                }
                appTheme2.J = km0Var;
                if (jm0Var == null) {
                    jm0Var = new jm0();
                }
                appTheme2.K = jm0Var;
                if (im0Var == null) {
                    im0Var = new im0();
                }
                appTheme2.L = im0Var;
                if (hm0Var == null) {
                    hm0Var = new hm0();
                }
                appTheme2.M = hm0Var;
                return appTheme2;
            case 2:
                int iK03 = sf5.k0(parcel);
                while (parcel.dataPosition() < iK03) {
                    int i3 = parcel.readInt();
                    char c2 = (char) i3;
                    if (c2 == 1) {
                        strX5 = sf5.x(parcel, i3);
                    } else if (c2 != 2) {
                        sf5.g0(parcel, i3);
                    } else {
                        zT2 = sf5.T(parcel, i3);
                    }
                }
                sf5.D(parcel, iK03);
                return new huj(strX5, zT2);
            case 3:
                int iK04 = sf5.k0(parcel);
                boolean zT3 = true;
                int iY25 = 0;
                int iY26 = 0;
                while (parcel.dataPosition() < iK04) {
                    int i4 = parcel.readInt();
                    char c3 = (char) i4;
                    if (c3 == 1) {
                        iY17 = sf5.Y(parcel, i4);
                    } else if (c3 == 2) {
                        iY25 = sf5.Y(parcel, i4);
                    } else if (c3 == 3) {
                        iY26 = sf5.Y(parcel, i4);
                    } else if (c3 != 4) {
                        sf5.g0(parcel, i4);
                    } else {
                        zT3 = sf5.T(parcel, i4);
                    }
                }
                sf5.D(parcel, iK04);
                return new m94(zT3, iY17, iY25, iY26);
            case 4:
                int iK05 = sf5.k0(parcel);
                mqi mqiVar = null;
                ebk ebkVar = null;
                z61 z61Var = null;
                rjk rjkVar = null;
                String strX6 = null;
                while (parcel.dataPosition() < iK05) {
                    int i5 = parcel.readInt();
                    char c4 = (char) i5;
                    if (c4 == 1) {
                        mqiVar = (mqi) sf5.v(parcel, i5, mqi.CREATOR);
                    } else if (c4 == 2) {
                        ebkVar = (ebk) sf5.v(parcel, i5, ebk.CREATOR);
                    } else if (c4 == 3) {
                        z61Var = (z61) sf5.v(parcel, i5, z61.CREATOR);
                    } else if (c4 == 4) {
                        rjkVar = (rjk) sf5.v(parcel, i5, rjk.CREATOR);
                    } else if (c4 != 5) {
                        sf5.g0(parcel, i5);
                    } else {
                        strX6 = sf5.x(parcel, i5);
                    }
                }
                sf5.D(parcel, iK05);
                return new y61(mqiVar, ebkVar, z61Var, rjkVar, strX6);
            case 5:
                int iK06 = sf5.k0(parcel);
                String strX7 = null;
                String strX8 = null;
                while (parcel.dataPosition() < iK06) {
                    int i6 = parcel.readInt();
                    char c5 = (char) i6;
                    if (c5 == 2) {
                        strX4 = sf5.x(parcel, i6);
                    } else if (c5 == 3) {
                        strX7 = sf5.x(parcel, i6);
                    } else if (c5 != 4) {
                        sf5.g0(parcel, i6);
                    } else {
                        strX8 = sf5.x(parcel, i6);
                    }
                }
                sf5.D(parcel, iK06);
                return new lzj(strX4, strX7, strX8);
            case 6:
                int iK07 = sf5.k0(parcel);
                while (parcel.dataPosition() < iK07) {
                    int i7 = parcel.readInt();
                    if (((char) i7) != 2) {
                        sf5.g0(parcel, i7);
                    } else {
                        iY16 = sf5.Y(parcel, i7);
                    }
                }
                sf5.D(parcel, iK07);
                return new m0k(iY16);
            case 7:
                int iK08 = sf5.k0(parcel);
                while (parcel.dataPosition() < iK08) {
                    int i8 = parcel.readInt();
                    if (((char) i8) != 2) {
                        sf5.g0(parcel, i8);
                    } else {
                        iY15 = sf5.Y(parcel, i8);
                    }
                }
                sf5.D(parcel, iK08);
                return new u0k(iY15);
            case 8:
                int iK09 = sf5.k0(parcel);
                while (parcel.dataPosition() < iK09) {
                    int i9 = parcel.readInt();
                    if (((char) i9) != 2) {
                        sf5.g0(parcel, i9);
                    } else {
                        iY14 = sf5.Y(parcel, i9);
                    }
                }
                sf5.D(parcel, iK09);
                return new l1k(iY14);
            case 9:
                int iK010 = sf5.k0(parcel);
                while (parcel.dataPosition() < iK010) {
                    int i10 = parcel.readInt();
                    char c6 = (char) i10;
                    if (c6 == 1) {
                        iY13 = sf5.Y(parcel, i10);
                    } else if (c6 != 2) {
                        sf5.g0(parcel, i10);
                    } else {
                        strX3 = sf5.x(parcel, i10);
                    }
                }
                sf5.D(parcel, iK010);
                return new v1k(iY13, strX3);
            case 10:
                int iK011 = sf5.k0(parcel);
                ArrayList arrayListA2 = null;
                String strX9 = null;
                Long lB0 = null;
                int iY27 = 0;
                boolean zT4 = false;
                boolean zT5 = false;
                boolean zT6 = false;
                boolean zT7 = false;
                while (parcel.dataPosition() < iK011) {
                    int i11 = parcel.readInt();
                    switch ((char) i11) {
                        case 1:
                            iY27 = sf5.Y(parcel, i11);
                            break;
                        case 2:
                            zT4 = sf5.T(parcel, i11);
                            break;
                        case 3:
                            zT5 = sf5.T(parcel, i11);
                            break;
                        case 4:
                            zT6 = sf5.T(parcel, i11);
                            break;
                        case 5:
                            zT7 = sf5.T(parcel, i11);
                            break;
                        case 6:
                            arrayListA2 = sf5.A(parcel, i11, huj.CREATOR);
                            break;
                        case 7:
                            strX9 = sf5.x(parcel, i11);
                            break;
                        case '\b':
                            lB0 = sf5.b0(parcel, i11);
                            break;
                        default:
                            sf5.g0(parcel, i11);
                            break;
                    }
                }
                sf5.D(parcel, iK011);
                return new d2k(iY27, zT4, zT5, zT6, zT7, arrayListA2, strX9, lB0);
            case 11:
                int iK012 = sf5.k0(parcel);
                while (parcel.dataPosition() < iK012) {
                    int i12 = parcel.readInt();
                    char c7 = (char) i12;
                    if (c7 == 1) {
                        iY12 = sf5.Y(parcel, i12);
                    } else if (c7 != 2) {
                        sf5.g0(parcel, i12);
                    } else {
                        strX2 = sf5.x(parcel, i12);
                    }
                }
                sf5.D(parcel, iK012);
                return new Scope(iY12, strX2);
            case 12:
                int iK013 = sf5.k0(parcel);
                kh7 kh7Var = null;
                m4l m4lVar = null;
                xoi xoiVar = null;
                e6l e6lVar = null;
                opj opjVar = null;
                aqj aqjVar = null;
                b5l b5lVar = null;
                nqj nqjVar = null;
                v98 v98Var = null;
                mrj mrjVar = null;
                ktj ktjVar = null;
                arj arjVar = null;
                while (parcel.dataPosition() < iK013) {
                    int i13 = parcel.readInt();
                    switch ((char) i13) {
                        case 2:
                            kh7Var = (kh7) sf5.v(parcel, i13, kh7.CREATOR);
                            break;
                        case 3:
                            m4lVar = (m4l) sf5.v(parcel, i13, m4l.CREATOR);
                            break;
                        case 4:
                            xoiVar = (xoi) sf5.v(parcel, i13, xoi.CREATOR);
                            break;
                        case 5:
                            e6lVar = (e6l) sf5.v(parcel, i13, e6l.CREATOR);
                            break;
                        case 6:
                            opjVar = (opj) sf5.v(parcel, i13, opj.CREATOR);
                            break;
                        case 7:
                            aqjVar = (aqj) sf5.v(parcel, i13, aqj.CREATOR);
                            break;
                        case '\b':
                            b5lVar = (b5l) sf5.v(parcel, i13, b5l.CREATOR);
                            break;
                        case '\t':
                            nqjVar = (nqj) sf5.v(parcel, i13, nqj.CREATOR);
                            break;
                        case '\n':
                            v98Var = (v98) sf5.v(parcel, i13, v98.CREATOR);
                            break;
                        case 11:
                            mrjVar = (mrj) sf5.v(parcel, i13, mrj.CREATOR);
                            break;
                        case '\f':
                            ktjVar = (ktj) sf5.v(parcel, i13, ktj.CREATOR);
                            break;
                        case '\r':
                            arjVar = (arj) sf5.v(parcel, i13, arj.CREATOR);
                            break;
                        default:
                            sf5.g0(parcel, i13);
                            break;
                    }
                }
                sf5.D(parcel, iK013);
                return new x61(kh7Var, m4lVar, xoiVar, e6lVar, opjVar, aqjVar, b5lVar, nqjVar, v98Var, mrjVar, ktjVar, arjVar);
            case 13:
                int iK014 = sf5.k0(parcel);
                String strX10 = null;
                while (parcel.dataPosition() < iK014) {
                    int i14 = parcel.readInt();
                    char c8 = (char) i14;
                    if (c8 == 2) {
                        strX = sf5.x(parcel, i14);
                    } else if (c8 != 3) {
                        sf5.g0(parcel, i14);
                    } else {
                        strX10 = sf5.x(parcel, i14);
                    }
                }
                sf5.D(parcel, iK014);
                return new DataItemAssetParcelable(strX, strX10);
            case 14:
                int iK015 = sf5.k0(parcel);
                int iY28 = 0;
                int iY29 = 0;
                while (parcel.dataPosition() < iK015) {
                    int i15 = parcel.readInt();
                    char c9 = (char) i15;
                    if (c9 == 1) {
                        iY11 = sf5.Y(parcel, i15);
                    } else if (c9 == 2) {
                        iY28 = sf5.Y(parcel, i15);
                    } else if (c9 != 3) {
                        sf5.g0(parcel, i15);
                    } else {
                        iY29 = sf5.Y(parcel, i15);
                    }
                }
                sf5.D(parcel, iK015);
                return new hm0(iY11, iY28, iY29);
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                int iK016 = sf5.k0(parcel);
                while (parcel.dataPosition() < iK016) {
                    int i16 = parcel.readInt();
                    if (((char) i16) != 1) {
                        sf5.g0(parcel, i16);
                    } else {
                        zT = sf5.T(parcel, i16);
                    }
                }
                sf5.D(parcel, iK016);
                return new z61(zT);
            case 16:
                int iK017 = sf5.k0(parcel);
                Bundle bundleS = null;
                byte[] bArrT2 = null;
                while (parcel.dataPosition() < iK017) {
                    int i17 = parcel.readInt();
                    char c10 = (char) i17;
                    if (c10 == 2) {
                        uri = (Uri) sf5.v(parcel, i17, Uri.CREATOR);
                    } else if (c10 == 4) {
                        bundleS = sf5.s(parcel, i17);
                    } else if (c10 != 5) {
                        sf5.g0(parcel, i17);
                    } else {
                        bArrT2 = sf5.t(parcel, i17);
                    }
                }
                sf5.D(parcel, iK017);
                return new o7k(uri, bundleS, bArrT2);
            case g.MAX_FIELD_NUMBER /* 17 */:
                int iK018 = sf5.k0(parcel);
                int iY30 = 0;
                while (parcel.dataPosition() < iK018) {
                    int i18 = parcel.readInt();
                    char c11 = (char) i18;
                    if (c11 == 2) {
                        iY10 = sf5.Y(parcel, i18);
                    } else if (c11 != 3) {
                        sf5.g0(parcel, i18);
                    } else {
                        iY30 = sf5.Y(parcel, i18);
                    }
                }
                sf5.D(parcel, iK018);
                return new y7k(iY10, iY30);
            case g.AVG_FIELD_NUMBER /* 18 */:
                int iK019 = sf5.k0(parcel);
                IBinder iBinderX = null;
                IBinder iBinderX2 = null;
                PendingIntent pendingIntent = null;
                String strX11 = null;
                int iY31 = 0;
                while (parcel.dataPosition() < iK019) {
                    int i19 = parcel.readInt();
                    char c12 = (char) i19;
                    if (c12 == 1) {
                        iY31 = sf5.Y(parcel, i19);
                    } else if (c12 == 2) {
                        iBinderX = sf5.X(parcel, i19);
                    } else if (c12 == 3) {
                        iBinderX2 = sf5.X(parcel, i19);
                    } else if (c12 == 4) {
                        pendingIntent = (PendingIntent) sf5.v(parcel, i19, PendingIntent.CREATOR);
                    } else if (c12 != 6) {
                        sf5.g0(parcel, i19);
                    } else {
                        strX11 = sf5.x(parcel, i19);
                    }
                }
                sf5.D(parcel, iK019);
                return new b8k(iY31, iBinderX, iBinderX2, pendingIntent, strX11);
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                int iK020 = sf5.k0(parcel);
                while (parcel.dataPosition() < iK020) {
                    int i20 = parcel.readInt();
                    if (((char) i20) != 1) {
                        sf5.g0(parcel, i20);
                    } else {
                        bArrT = sf5.t(parcel, i20);
                    }
                }
                sf5.D(parcel, iK020);
                return new e8k(bArrT);
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                int iK021 = sf5.k0(parcel);
                LocationRequest locationRequest = null;
                ArrayList arrayListA3 = null;
                boolean zT8 = false;
                boolean zT9 = false;
                boolean zT10 = false;
                boolean zT11 = false;
                long jA0 = Long.MAX_VALUE;
                while (parcel.dataPosition() < iK021) {
                    int i21 = parcel.readInt();
                    char c13 = (char) i21;
                    if (c13 == 1) {
                        locationRequest = (LocationRequest) sf5.v(parcel, i21, LocationRequest.CREATOR);
                    } else if (c13 == 5) {
                        arrayListA3 = sf5.A(parcel, i21, wo3.CREATOR);
                    } else if (c13 == '\b') {
                        zT8 = sf5.T(parcel, i21);
                    } else if (c13 != '\t') {
                        switch (c13) {
                            case 11:
                                zT10 = sf5.T(parcel, i21);
                                break;
                            case '\f':
                                zT11 = sf5.T(parcel, i21);
                                break;
                            case '\r':
                                sf5.x(parcel, i21);
                                break;
                            case 14:
                                jA0 = sf5.a0(parcel, i21);
                                break;
                            default:
                                sf5.g0(parcel, i21);
                                break;
                        }
                    } else {
                        zT9 = sf5.T(parcel, i21);
                    }
                }
                sf5.D(parcel, iK021);
                return new i8k(locationRequest, arrayListA3, zT8, zT9, zT10, zT11, jA0);
            case 21:
                int iK022 = sf5.k0(parcel);
                while (parcel.dataPosition() < iK022) {
                    int i22 = parcel.readInt();
                    char c14 = (char) i22;
                    if (c14 == 2) {
                        iY9 = sf5.Y(parcel, i22);
                    } else if (c14 != 3) {
                        sf5.g0(parcel, i22);
                    } else {
                        arrayListA = sf5.A(parcel, i22, gsj.CREATOR);
                    }
                }
                sf5.D(parcel, iK022);
                return new m8k(iY9, arrayListA);
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                int iK023 = sf5.k0(parcel);
                int iY32 = 1;
                i8k i8kVar = null;
                IBinder iBinderX3 = null;
                IBinder iBinderX4 = null;
                PendingIntent pendingIntent2 = null;
                IBinder iBinderX5 = null;
                String strX12 = null;
                while (parcel.dataPosition() < iK023) {
                    int i23 = parcel.readInt();
                    switch ((char) i23) {
                        case 1:
                            iY32 = sf5.Y(parcel, i23);
                            break;
                        case 2:
                            i8kVar = (i8k) sf5.v(parcel, i23, i8k.CREATOR);
                            break;
                        case 3:
                            iBinderX3 = sf5.X(parcel, i23);
                            break;
                        case 4:
                            pendingIntent2 = (PendingIntent) sf5.v(parcel, i23, PendingIntent.CREATOR);
                            break;
                        case 5:
                            iBinderX4 = sf5.X(parcel, i23);
                            break;
                        case 6:
                            iBinderX5 = sf5.X(parcel, i23);
                            break;
                        case 7:
                        default:
                            sf5.g0(parcel, i23);
                            break;
                        case '\b':
                            strX12 = sf5.x(parcel, i23);
                            break;
                    }
                }
                sf5.D(parcel, iK023);
                return new q8k(iY32, i8kVar, iBinderX3, iBinderX4, pendingIntent2, iBinderX5, strX12);
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                int iK024 = sf5.k0(parcel);
                while (parcel.dataPosition() < iK024) {
                    int i24 = parcel.readInt();
                    char c15 = (char) i24;
                    if (c15 == 2) {
                        iY8 = sf5.Y(parcel, i24);
                    } else if (c15 != 3) {
                        sf5.g0(parcel, i24);
                    } else {
                        appTheme = (AppTheme) sf5.v(parcel, i24, AppTheme.CREATOR);
                    }
                }
                sf5.D(parcel, iK024);
                return new u8k(iY8, appTheme);
            case 24:
                int iK025 = sf5.k0(parcel);
                boolean zT12 = false;
                while (parcel.dataPosition() < iK025) {
                    int i25 = parcel.readInt();
                    char c16 = (char) i25;
                    if (c16 == 1) {
                        iY7 = sf5.Y(parcel, i25);
                    } else if (c16 != 2) {
                        sf5.g0(parcel, i25);
                    } else {
                        zT12 = sf5.T(parcel, i25);
                    }
                }
                sf5.D(parcel, iK025);
                return new a9k(iY7, zT12);
            case BuildConfig.VERSION_CODE /* 25 */:
                int iK026 = sf5.k0(parcel);
                boolean zT13 = false;
                while (parcel.dataPosition() < iK026) {
                    int i26 = parcel.readInt();
                    char c17 = (char) i26;
                    if (c17 == 2) {
                        iY6 = sf5.Y(parcel, i26);
                    } else if (c17 == 3) {
                        zT13 = sf5.T(parcel, i26);
                    } else if (c17 != 4) {
                        sf5.g0(parcel, i26);
                    } else {
                        sokVarArr = (sok[]) sf5.z(parcel, i26, sok.CREATOR);
                    }
                }
                sf5.D(parcel, iK026);
                return new g9k(iY6, zT13, sokVarArr);
            case 26:
                int iK027 = sf5.k0(parcel);
                while (parcel.dataPosition() < iK027) {
                    int i27 = parcel.readInt();
                    char c18 = (char) i27;
                    if (c18 == 2) {
                        iY5 = sf5.Y(parcel, i27);
                    } else if (c18 != 3) {
                        sf5.g0(parcel, i27);
                    } else {
                        gsjVar = (gsj) sf5.v(parcel, i27, gsj.CREATOR);
                    }
                }
                sf5.D(parcel, iK027);
                return new n9k(iY5, gsjVar);
            case 27:
                int iK028 = sf5.k0(parcel);
                while (parcel.dataPosition() < iK028) {
                    int i28 = parcel.readInt();
                    char c19 = (char) i28;
                    if (c19 == 2) {
                        iY4 = sf5.Y(parcel, i28);
                    } else if (c19 != 3) {
                        sf5.g0(parcel, i28);
                    } else {
                        parcelFileDescriptor2 = (ParcelFileDescriptor) sf5.v(parcel, i28, ParcelFileDescriptor.CREATOR);
                    }
                }
                sf5.D(parcel, iK028);
                return new s9k(iY4, parcelFileDescriptor2);
            case 28:
                int iK029 = sf5.k0(parcel);
                boolean zT14 = false;
                while (parcel.dataPosition() < iK029) {
                    int i29 = parcel.readInt();
                    char c20 = (char) i29;
                    if (c20 == 2) {
                        iY3 = sf5.Y(parcel, i29);
                    } else if (c20 == 3) {
                        parcelFileDescriptor = (ParcelFileDescriptor) sf5.v(parcel, i29, ParcelFileDescriptor.CREATOR);
                    } else if (c20 != 4) {
                        sf5.g0(parcel, i29);
                    } else {
                        zT14 = sf5.T(parcel, i29);
                    }
                }
                sf5.D(parcel, iK029);
                return new aak(iY3, parcelFileDescriptor, zT14);
            default:
                int iK030 = sf5.k0(parcel);
                boolean zT15 = false;
                while (parcel.dataPosition() < iK030) {
                    int i30 = parcel.readInt();
                    char c21 = (char) i30;
                    if (c21 == 2) {
                        iY2 = sf5.Y(parcel, i30);
                    } else if (c21 != 3) {
                        sf5.g0(parcel, i30);
                    } else {
                        zT15 = sf5.T(parcel, i30);
                    }
                }
                sf5.D(parcel, iK030);
                return new lak(iY2, zT15);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new vwj[i];
            case 1:
                return new AppTheme[i];
            case 2:
                return new huj[i];
            case 3:
                return new m94[i];
            case 4:
                return new y61[i];
            case 5:
                return new lzj[i];
            case 6:
                return new m0k[i];
            case 7:
                return new u0k[i];
            case 8:
                return new l1k[i];
            case 9:
                return new v1k[i];
            case 10:
                return new d2k[i];
            case 11:
                return new Scope[i];
            case 12:
                return new x61[i];
            case 13:
                return new DataItemAssetParcelable[i];
            case 14:
                return new hm0[i];
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return new z61[i];
            case 16:
                return new o7k[i];
            case g.MAX_FIELD_NUMBER /* 17 */:
                return new y7k[i];
            case g.AVG_FIELD_NUMBER /* 18 */:
                return new b8k[i];
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return new e8k[i];
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return new i8k[i];
            case 21:
                return new m8k[i];
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return new q8k[i];
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return new u8k[i];
            case 24:
                return new a9k[i];
            case BuildConfig.VERSION_CODE /* 25 */:
                return new g9k[i];
            case 26:
                return new n9k[i];
            case 27:
                return new s9k[i];
            case 28:
                return new aak[i];
            default:
                return new lak[i];
        }
    }
}
