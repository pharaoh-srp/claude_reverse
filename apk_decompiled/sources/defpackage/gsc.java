package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import androidx.health.platform.client.proto.g;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationRequest;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class gsc implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ gsc(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iY = 0;
        int iY2 = 0;
        boolean zT = false;
        ArrayList arrayListA = null;
        String strX = null;
        Bundle bundleS = null;
        ArrayList arrayListA2 = null;
        switch (this.a) {
            case 0:
                return new hsc(parcel.readFloat());
            case 1:
                return new isc(parcel.readInt());
            case 2:
                return new jsc(parcel.readLong());
            case 3:
                int iK0 = sf5.k0(parcel);
                while (parcel.dataPosition() < iK0) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c == 1) {
                        iY = sf5.Y(parcel, i);
                    } else if (c != 2) {
                        sf5.g0(parcel, i);
                    } else {
                        arrayListA = sf5.A(parcel, i, vjb.CREATOR);
                    }
                }
                sf5.D(parcel, iK0);
                return new ibh(iY, arrayListA);
            case 4:
                int iK02 = sf5.k0(parcel);
                int iY3 = -1;
                long jA0 = 0;
                long jA02 = 0;
                int iY4 = 0;
                int iY5 = 0;
                int iY6 = 0;
                int iY7 = 0;
                String strX2 = null;
                String strX3 = null;
                while (parcel.dataPosition() < iK02) {
                    int i2 = parcel.readInt();
                    switch ((char) i2) {
                        case 1:
                            iY4 = sf5.Y(parcel, i2);
                            break;
                        case 2:
                            iY5 = sf5.Y(parcel, i2);
                            break;
                        case 3:
                            iY6 = sf5.Y(parcel, i2);
                            break;
                        case 4:
                            jA0 = sf5.a0(parcel, i2);
                            break;
                        case 5:
                            jA02 = sf5.a0(parcel, i2);
                            break;
                        case 6:
                            strX2 = sf5.x(parcel, i2);
                            break;
                        case 7:
                            strX3 = sf5.x(parcel, i2);
                            break;
                        case '\b':
                            iY7 = sf5.Y(parcel, i2);
                            break;
                        case '\t':
                            iY3 = sf5.Y(parcel, i2);
                            break;
                        default:
                            sf5.g0(parcel, i2);
                            break;
                    }
                }
                sf5.D(parcel, iK02);
                return new vjb(iY4, iY5, iY6, jA0, jA02, strX2, strX3, iY7, iY3);
            case 5:
                int iK03 = sf5.k0(parcel);
                int iY8 = 0;
                int iY9 = 0;
                PendingIntent pendingIntent = null;
                String strX4 = null;
                Integer numZ = null;
                while (parcel.dataPosition() < iK03) {
                    int i3 = parcel.readInt();
                    char c2 = (char) i3;
                    if (c2 == 1) {
                        iY8 = sf5.Y(parcel, i3);
                    } else if (c2 == 2) {
                        iY9 = sf5.Y(parcel, i3);
                    } else if (c2 == 3) {
                        pendingIntent = (PendingIntent) sf5.v(parcel, i3, PendingIntent.CREATOR);
                    } else if (c2 == 4) {
                        strX4 = sf5.x(parcel, i3);
                    } else if (c2 != 5) {
                        sf5.g0(parcel, i3);
                    } else {
                        numZ = sf5.Z(parcel, i3);
                    }
                }
                sf5.D(parcel, iK03);
                return new hh4(iY8, iY9, pendingIntent, strX4, numZ);
            case 6:
                int iK04 = sf5.k0(parcel);
                long jA03 = -1;
                WorkSource workSource = new WorkSource();
                float fV = 0.0f;
                int iY10 = Integer.MAX_VALUE;
                int iY11 = 102;
                long jA04 = 0;
                boolean zT2 = false;
                int iY12 = 0;
                int iY13 = 0;
                boolean zT3 = false;
                j7k j7kVar = null;
                long jA05 = Long.MAX_VALUE;
                long jA06 = Long.MAX_VALUE;
                long jA07 = 600000;
                long jA08 = 3600000;
                while (parcel.dataPosition() < iK04) {
                    int i4 = parcel.readInt();
                    switch ((char) i4) {
                        case 1:
                            iY11 = sf5.Y(parcel, i4);
                            break;
                        case 2:
                            jA08 = sf5.a0(parcel, i4);
                            break;
                        case 3:
                            jA07 = sf5.a0(parcel, i4);
                            break;
                        case 4:
                        case 14:
                        default:
                            sf5.g0(parcel, i4);
                            break;
                        case 5:
                            jA05 = sf5.a0(parcel, i4);
                            break;
                        case 6:
                            iY10 = sf5.Y(parcel, i4);
                            break;
                        case 7:
                            fV = sf5.V(parcel, i4);
                            break;
                        case '\b':
                            jA04 = sf5.a0(parcel, i4);
                            break;
                        case '\t':
                            zT2 = sf5.T(parcel, i4);
                            break;
                        case '\n':
                            jA06 = sf5.a0(parcel, i4);
                            break;
                        case 11:
                            jA03 = sf5.a0(parcel, i4);
                            break;
                        case '\f':
                            iY12 = sf5.Y(parcel, i4);
                            break;
                        case '\r':
                            iY13 = sf5.Y(parcel, i4);
                            break;
                        case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                            zT3 = sf5.T(parcel, i4);
                            break;
                        case 16:
                            workSource = (WorkSource) sf5.v(parcel, i4, WorkSource.CREATOR);
                            break;
                        case g.MAX_FIELD_NUMBER /* 17 */:
                            j7kVar = (j7k) sf5.v(parcel, i4, j7k.CREATOR);
                            break;
                    }
                }
                sf5.D(parcel, iK04);
                return new LocationRequest(iY11, jA08, jA07, jA04, jA05, jA06, iY10, fV, zT2, jA03, iY12, iY13, zT3, workSource, j7kVar);
            case 7:
                int iK05 = sf5.k0(parcel);
                boolean zT4 = false;
                while (parcel.dataPosition() < iK05) {
                    int i5 = parcel.readInt();
                    char c3 = (char) i5;
                    if (c3 == 1) {
                        arrayListA2 = sf5.A(parcel, i5, LocationRequest.CREATOR);
                    } else if (c3 == 2) {
                        zT = sf5.T(parcel, i5);
                    } else if (c3 != 3) {
                        sf5.g0(parcel, i5);
                    } else {
                        zT4 = sf5.T(parcel, i5);
                    }
                }
                sf5.D(parcel, iK05);
                return new sea(arrayListA2, zT, zT4);
            case 8:
                int iK06 = sf5.k0(parcel);
                long jA09 = -1;
                int iY14 = 0;
                boolean zT5 = false;
                String strX5 = null;
                while (parcel.dataPosition() < iK06) {
                    int i6 = parcel.readInt();
                    char c4 = (char) i6;
                    if (c4 == 1) {
                        strX5 = sf5.x(parcel, i6);
                    } else if (c4 == 2) {
                        iY14 = sf5.Y(parcel, i6);
                    } else if (c4 == 3) {
                        jA09 = sf5.a0(parcel, i6);
                    } else if (c4 != 4) {
                        sf5.g0(parcel, i6);
                    } else {
                        zT5 = sf5.T(parcel, i6);
                    }
                }
                sf5.D(parcel, iK06);
                return new jf7(strX5, iY14, jA09, zT5);
            case 9:
                int iK07 = sf5.k0(parcel);
                while (parcel.dataPosition() < iK07) {
                    int i7 = parcel.readInt();
                    if (((char) i7) != 2) {
                        sf5.g0(parcel, i7);
                    } else {
                        bundleS = sf5.s(parcel, i7);
                    }
                }
                sf5.D(parcel, iK07);
                return new avj(bundleS);
            case 10:
                int iK08 = sf5.k0(parcel);
                long jA010 = 0;
                String strX6 = null;
                avj avjVar = null;
                String strX7 = null;
                while (parcel.dataPosition() < iK08) {
                    int i8 = parcel.readInt();
                    char c5 = (char) i8;
                    if (c5 == 2) {
                        strX6 = sf5.x(parcel, i8);
                    } else if (c5 == 3) {
                        avjVar = (avj) sf5.v(parcel, i8, avj.CREATOR);
                    } else if (c5 == 4) {
                        strX7 = sf5.x(parcel, i8);
                    } else if (c5 != 5) {
                        sf5.g0(parcel, i8);
                    } else {
                        jA010 = sf5.a0(parcel, i8);
                    }
                }
                sf5.D(parcel, iK08);
                return new rvj(strX6, avjVar, strX7, jA010);
            case 11:
                int iK09 = sf5.k0(parcel);
                long jA011 = 0;
                long jA012 = 0;
                boolean zT6 = false;
                String strX8 = null;
                String strX9 = null;
                String strX10 = null;
                Bundle bundleS2 = null;
                String strX11 = null;
                while (parcel.dataPosition() < iK09) {
                    int i9 = parcel.readInt();
                    switch ((char) i9) {
                        case 1:
                            jA011 = sf5.a0(parcel, i9);
                            break;
                        case 2:
                            jA012 = sf5.a0(parcel, i9);
                            break;
                        case 3:
                            zT6 = sf5.T(parcel, i9);
                            break;
                        case 4:
                            strX8 = sf5.x(parcel, i9);
                            break;
                        case 5:
                            strX9 = sf5.x(parcel, i9);
                            break;
                        case 6:
                            strX10 = sf5.x(parcel, i9);
                            break;
                        case 7:
                            bundleS2 = sf5.s(parcel, i9);
                            break;
                        case '\b':
                            strX11 = sf5.x(parcel, i9);
                            break;
                        default:
                            sf5.g0(parcel, i9);
                            break;
                    }
                }
                sf5.D(parcel, iK09);
                return new y5k(jA011, jA012, zT6, strX8, strX9, strX10, bundleS2, strX11);
            case 12:
                int iK010 = sf5.k0(parcel);
                PendingIntent pendingIntent2 = null;
                hh4 hh4Var = null;
                while (parcel.dataPosition() < iK010) {
                    int i10 = parcel.readInt();
                    char c6 = (char) i10;
                    if (c6 == 1) {
                        iY2 = sf5.Y(parcel, i10);
                    } else if (c6 == 2) {
                        strX = sf5.x(parcel, i10);
                    } else if (c6 == 3) {
                        pendingIntent2 = (PendingIntent) sf5.v(parcel, i10, PendingIntent.CREATOR);
                    } else if (c6 != 4) {
                        sf5.g0(parcel, i10);
                    } else {
                        hh4Var = (hh4) sf5.v(parcel, i10, hh4.CREATOR);
                    }
                }
                sf5.D(parcel, iK010);
                return new Status(iY2, strX, pendingIntent2, hh4Var);
            case 13:
                int iK011 = sf5.k0(parcel);
                long jA013 = -2147483648L;
                String strX12 = "";
                String strX13 = strX12;
                String strX14 = strX13;
                String strX15 = strX14;
                int iY15 = 100;
                boolean zT7 = true;
                boolean zT8 = true;
                long jA014 = 0;
                long jA015 = 0;
                long jA016 = 0;
                long jA017 = 0;
                long jA018 = 0;
                long jA019 = 0;
                long jA020 = 0;
                boolean zT9 = false;
                int iY16 = 0;
                boolean zT10 = false;
                boolean zT11 = false;
                int iY17 = 0;
                String strX16 = null;
                String strX17 = null;
                String strX18 = null;
                String strX19 = null;
                String strX20 = null;
                String strX21 = null;
                String strX22 = null;
                Boolean boolValueOf = null;
                ArrayList arrayListY = null;
                String strX23 = null;
                String strX24 = null;
                String strX25 = null;
                while (parcel.dataPosition() < iK011) {
                    int i11 = parcel.readInt();
                    switch ((char) i11) {
                        case 2:
                            strX16 = sf5.x(parcel, i11);
                            break;
                        case 3:
                            strX17 = sf5.x(parcel, i11);
                            break;
                        case 4:
                            strX18 = sf5.x(parcel, i11);
                            break;
                        case 5:
                            strX19 = sf5.x(parcel, i11);
                            break;
                        case 6:
                            jA014 = sf5.a0(parcel, i11);
                            break;
                        case 7:
                            jA015 = sf5.a0(parcel, i11);
                            break;
                        case '\b':
                            strX20 = sf5.x(parcel, i11);
                            break;
                        case '\t':
                            zT7 = sf5.T(parcel, i11);
                            break;
                        case '\n':
                            zT9 = sf5.T(parcel, i11);
                            break;
                        case 11:
                            jA013 = sf5.a0(parcel, i11);
                            break;
                        case '\f':
                            strX21 = sf5.x(parcel, i11);
                            break;
                        case '\r':
                            jA016 = sf5.a0(parcel, i11);
                            break;
                        case 14:
                            jA017 = sf5.a0(parcel, i11);
                            break;
                        case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                            iY16 = sf5.Y(parcel, i11);
                            break;
                        case 16:
                            zT8 = sf5.T(parcel, i11);
                            break;
                        case g.MAX_FIELD_NUMBER /* 17 */:
                        case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                        case '!':
                        default:
                            sf5.g0(parcel, i11);
                            break;
                        case g.AVG_FIELD_NUMBER /* 18 */:
                            zT10 = sf5.T(parcel, i11);
                            break;
                        case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            strX22 = sf5.x(parcel, i11);
                            break;
                        case 21:
                            int iC0 = sf5.c0(parcel, i11);
                            if (iC0 != 0) {
                                sf5.m0(parcel, iC0, 4);
                                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                            } else {
                                boolValueOf = null;
                            }
                            break;
                        case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            jA018 = sf5.a0(parcel, i11);
                            break;
                        case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            arrayListY = sf5.y(parcel, i11);
                            break;
                        case 24:
                            strX23 = sf5.x(parcel, i11);
                            break;
                        case BuildConfig.VERSION_CODE /* 25 */:
                            strX12 = sf5.x(parcel, i11);
                            break;
                        case 26:
                            strX13 = sf5.x(parcel, i11);
                            break;
                        case 27:
                            strX24 = sf5.x(parcel, i11);
                            break;
                        case 28:
                            zT11 = sf5.T(parcel, i11);
                            break;
                        case 29:
                            jA019 = sf5.a0(parcel, i11);
                            break;
                        case 30:
                            iY15 = sf5.Y(parcel, i11);
                            break;
                        case 31:
                            strX14 = sf5.x(parcel, i11);
                            break;
                        case FreeTypeConstants.FT_LOAD_FORCE_AUTOHINT /* 32 */:
                            iY17 = sf5.Y(parcel, i11);
                            break;
                        case '\"':
                            jA020 = sf5.a0(parcel, i11);
                            break;
                        case '#':
                            strX25 = sf5.x(parcel, i11);
                            break;
                        case '$':
                            strX15 = sf5.x(parcel, i11);
                            break;
                    }
                }
                sf5.D(parcel, iK011);
                return new u1l(strX16, strX17, strX18, strX19, jA014, jA015, strX20, zT7, zT9, jA013, strX21, jA016, jA017, iY16, zT8, zT10, strX22, boolValueOf, jA018, arrayListY, strX23, strX12, strX13, strX24, zT11, jA019, iY15, strX14, iY17, jA020, strX25, strX15);
            default:
                int iK012 = sf5.k0(parcel);
                long jA021 = 0;
                int iY18 = 0;
                String strX26 = null;
                Long lB0 = null;
                Float fW = null;
                String strX27 = null;
                String strX28 = null;
                Double dValueOf = null;
                while (parcel.dataPosition() < iK012) {
                    int i12 = parcel.readInt();
                    switch ((char) i12) {
                        case 1:
                            iY18 = sf5.Y(parcel, i12);
                            break;
                        case 2:
                            strX26 = sf5.x(parcel, i12);
                            break;
                        case 3:
                            jA021 = sf5.a0(parcel, i12);
                            break;
                        case 4:
                            lB0 = sf5.b0(parcel, i12);
                            break;
                        case 5:
                            fW = sf5.W(parcel, i12);
                            break;
                        case 6:
                            strX27 = sf5.x(parcel, i12);
                            break;
                        case 7:
                            strX28 = sf5.x(parcel, i12);
                            break;
                        case '\b':
                            int iC02 = sf5.c0(parcel, i12);
                            if (iC02 != 0) {
                                sf5.m0(parcel, iC02, 8);
                                dValueOf = Double.valueOf(parcel.readDouble());
                            } else {
                                dValueOf = null;
                            }
                            break;
                        default:
                            sf5.g0(parcel, i12);
                            break;
                    }
                }
                sf5.D(parcel, iK012);
                return new e1l(iY18, strX26, jA021, lB0, fW, strX27, strX28, dValueOf);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new hsc[i];
            case 1:
                return new isc[i];
            case 2:
                return new jsc[i];
            case 3:
                return new ibh[i];
            case 4:
                return new vjb[i];
            case 5:
                return new hh4[i];
            case 6:
                return new LocationRequest[i];
            case 7:
                return new sea[i];
            case 8:
                return new jf7[i];
            case 9:
                return new avj[i];
            case 10:
                return new rvj[i];
            case 11:
                return new y5k[i];
            case 12:
                return new Status[i];
            case 13:
                return new u1l[i];
            default:
                return new e1l[i];
        }
    }
}
