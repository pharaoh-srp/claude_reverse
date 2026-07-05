package defpackage;

import android.accounts.Account;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import androidx.health.platform.client.proto.g;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.ArrayList;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final class xok implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ xok(int i) {
        this.a = i;
    }

    public static void a(g48 g48Var, Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        int i2 = g48Var.E;
        xn5.J0(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = g48Var.F;
        xn5.J0(parcel, 2, 4);
        parcel.writeInt(i3);
        int i4 = g48Var.G;
        xn5.J0(parcel, 3, 4);
        parcel.writeInt(i4);
        xn5.F0(parcel, 4, g48Var.H);
        xn5.B0(parcel, 5, g48Var.I);
        xn5.H0(parcel, 6, g48Var.J, i);
        xn5.y0(parcel, 7, g48Var.K);
        xn5.E0(parcel, 8, g48Var.L, i);
        xn5.H0(parcel, 10, g48Var.M, i);
        xn5.H0(parcel, 11, g48Var.N, i);
        boolean z = g48Var.O;
        xn5.J0(parcel, 12, 4);
        parcel.writeInt(z ? 1 : 0);
        int i5 = g48Var.P;
        xn5.J0(parcel, 13, 4);
        parcel.writeInt(i5);
        boolean z2 = g48Var.Q;
        xn5.J0(parcel, 14, 4);
        parcel.writeInt(z2 ? 1 : 0);
        xn5.F0(parcel, 15, g48Var.R);
        xn5.L0(parcel, iK0);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        long jA0 = 0;
        int iY = 0;
        int iY2 = 0;
        int iY3 = 0;
        int iY4 = 0;
        int iY5 = 0;
        int iY6 = 0;
        int iY7 = 0;
        byte bU = 0;
        int iY8 = 0;
        int iY9 = 0;
        int iY10 = 0;
        int iY11 = 0;
        int iY12 = 0;
        byte[] bArrT = null;
        String strX = null;
        String strX2 = null;
        Status status = null;
        LatLng latLng = null;
        String strX3 = null;
        Uri uri = null;
        Float fW = null;
        String strX4 = null;
        Bundle bundleS = null;
        String strX5 = null;
        ArrayList arrayListA = null;
        ArrayList arrayListA2 = null;
        byte[] bArrT2 = null;
        String strX6 = null;
        o7k o7kVar = null;
        String strX7 = null;
        switch (this.a) {
            case 0:
                int iK0 = sf5.k0(parcel);
                while (parcel.dataPosition() < iK0) {
                    int i = parcel.readInt();
                    if (((char) i) != 1) {
                        sf5.g0(parcel, i);
                    } else {
                        bArrT = sf5.t(parcel, i);
                    }
                }
                sf5.D(parcel, iK0);
                return new sok(bArrT);
            case 1:
                int iK02 = sf5.k0(parcel);
                while (parcel.dataPosition() < iK02) {
                    int i2 = parcel.readInt();
                    char c = (char) i2;
                    if (c == 2) {
                        iY = sf5.Y(parcel, i2);
                    } else if (c != 3) {
                        sf5.g0(parcel, i2);
                    } else {
                        strX7 = sf5.x(parcel, i2);
                    }
                }
                sf5.D(parcel, iK02);
                return new bpk(iY, strX7);
            case 2:
                int iK03 = sf5.k0(parcel);
                while (parcel.dataPosition() < iK03) {
                    int i3 = parcel.readInt();
                    char c2 = (char) i3;
                    if (c2 == 2) {
                        iY12 = sf5.Y(parcel, i3);
                    } else if (c2 != 3) {
                        sf5.g0(parcel, i3);
                    } else {
                        o7kVar = (o7k) sf5.v(parcel, i3, o7k.CREATOR);
                    }
                }
                sf5.D(parcel, iK03);
                return new hpk(iY12, o7kVar);
            case 3:
                int iK04 = sf5.k0(parcel);
                while (parcel.dataPosition() < iK04) {
                    int i4 = parcel.readInt();
                    if (((char) i4) != 2) {
                        sf5.g0(parcel, i4);
                    } else {
                        iY11 = sf5.Y(parcel, i4);
                    }
                }
                sf5.D(parcel, iK04);
                return new upk(iY11);
            case 4:
                int iK05 = sf5.k0(parcel);
                while (parcel.dataPosition() < iK05) {
                    int i5 = parcel.readInt();
                    if (((char) i5) != 1) {
                        sf5.g0(parcel, i5);
                    } else {
                        strX6 = sf5.x(parcel, i5);
                    }
                }
                sf5.D(parcel, iK05);
                return new zpk(strX6);
            case 5:
                int iK06 = sf5.k0(parcel);
                int iY13 = 0;
                while (parcel.dataPosition() < iK06) {
                    int i6 = parcel.readInt();
                    char c3 = (char) i6;
                    if (c3 == 1) {
                        iY10 = sf5.Y(parcel, i6);
                    } else if (c3 == 2) {
                        iY13 = sf5.Y(parcel, i6);
                    } else if (c3 != 3) {
                        sf5.g0(parcel, i6);
                    } else {
                        bArrT2 = sf5.t(parcel, i6);
                    }
                }
                sf5.D(parcel, iK06);
                return new eqk(bArrT2, iY10, iY13);
            case 6:
                int iK07 = sf5.k0(parcel);
                int iY14 = 0;
                while (parcel.dataPosition() < iK07) {
                    int i7 = parcel.readInt();
                    char c4 = (char) i7;
                    if (c4 == 2) {
                        iY9 = sf5.Y(parcel, i7);
                    } else if (c4 != 3) {
                        sf5.g0(parcel, i7);
                    } else {
                        iY14 = sf5.Y(parcel, i7);
                    }
                }
                sf5.D(parcel, iK07);
                return new jqk(iY9, iY14);
            case 7:
                int iK08 = sf5.k0(parcel);
                WorkSource workSource = new WorkSource();
                long jA02 = Long.MAX_VALUE;
                long jA03 = Long.MAX_VALUE;
                int iY15 = 102;
                int iY16 = 0;
                boolean zT = false;
                int iY17 = 0;
                j7k j7kVar = null;
                while (parcel.dataPosition() < iK08) {
                    int i8 = parcel.readInt();
                    switch ((char) i8) {
                        case 1:
                            jA02 = sf5.a0(parcel, i8);
                            break;
                        case 2:
                            iY16 = sf5.Y(parcel, i8);
                            break;
                        case 3:
                            iY15 = sf5.Y(parcel, i8);
                            break;
                        case 4:
                            jA03 = sf5.a0(parcel, i8);
                            break;
                        case 5:
                            zT = sf5.T(parcel, i8);
                            break;
                        case 6:
                            workSource = (WorkSource) sf5.v(parcel, i8, WorkSource.CREATOR);
                            break;
                        case 7:
                            iY17 = sf5.Y(parcel, i8);
                            break;
                        case '\b':
                        default:
                            sf5.g0(parcel, i8);
                            break;
                        case '\t':
                            j7kVar = (j7k) sf5.v(parcel, i8, j7k.CREATOR);
                            break;
                    }
                }
                sf5.D(parcel, iK08);
                return new jd5(jA02, iY16, iY15, jA03, zT, iY17, workSource, j7kVar);
            case 8:
                int iK09 = sf5.k0(parcel);
                ArrayList arrayListY = null;
                ArrayList arrayListY2 = null;
                while (parcel.dataPosition() < iK09) {
                    int i9 = parcel.readInt();
                    char c5 = (char) i9;
                    if (c5 == 1) {
                        arrayListA2 = sf5.A(parcel, i9, iuk.CREATOR);
                    } else if (c5 == 2) {
                        arrayListY = sf5.y(parcel, i9);
                    } else if (c5 != 3) {
                        sf5.g0(parcel, i9);
                    } else {
                        arrayListY2 = sf5.y(parcel, i9);
                    }
                }
                sf5.D(parcel, iK09);
                return new cnk(arrayListA2, arrayListY, arrayListY2);
            case 9:
                int iK010 = sf5.k0(parcel);
                byte[] bArrT3 = null;
                byte[] bArrT4 = null;
                byte[] bArrT5 = null;
                byte[] bArrT6 = null;
                byte[] bArrT7 = null;
                while (parcel.dataPosition() < iK010) {
                    int i10 = parcel.readInt();
                    char c6 = (char) i10;
                    if (c6 == 2) {
                        bArrT3 = sf5.t(parcel, i10);
                    } else if (c6 == 3) {
                        bArrT4 = sf5.t(parcel, i10);
                    } else if (c6 == 4) {
                        bArrT5 = sf5.t(parcel, i10);
                    } else if (c6 == 5) {
                        bArrT6 = sf5.t(parcel, i10);
                    } else if (c6 != 6) {
                        sf5.g0(parcel, i10);
                    } else {
                        bArrT7 = sf5.t(parcel, i10);
                    }
                }
                sf5.D(parcel, iK010);
                return new a71(bArrT3, bArrT4, bArrT5, bArrT6, bArrT7);
            case 10:
                int iK011 = sf5.k0(parcel);
                while (parcel.dataPosition() < iK011) {
                    int i11 = parcel.readInt();
                    char c7 = (char) i11;
                    if (c7 == 2) {
                        iY8 = sf5.Y(parcel, i11);
                    } else if (c7 == 3) {
                        jA0 = sf5.a0(parcel, i11);
                    } else if (c7 != 4) {
                        sf5.g0(parcel, i11);
                    } else {
                        arrayListA = sf5.A(parcel, i11, jok.CREATOR);
                    }
                }
                sf5.D(parcel, iK011);
                return new tqk(iY8, jA0, arrayListA);
            case 11:
                int iK012 = sf5.k0(parcel);
                byte bU2 = 0;
                while (parcel.dataPosition() < iK012) {
                    int i12 = parcel.readInt();
                    char c8 = (char) i12;
                    if (c8 == 2) {
                        bU = sf5.U(parcel, i12);
                    } else if (c8 == 3) {
                        bU2 = sf5.U(parcel, i12);
                    } else if (c8 != 4) {
                        sf5.g0(parcel, i12);
                    } else {
                        strX5 = sf5.x(parcel, i12);
                    }
                }
                sf5.D(parcel, iK012);
                return new xqk(bU, bU2, strX5);
            case 12:
                int iK013 = sf5.k0(parcel);
                jf7[] jf7VarArr = null;
                sh4 sh4Var = null;
                while (parcel.dataPosition() < iK013) {
                    int i13 = parcel.readInt();
                    char c9 = (char) i13;
                    if (c9 == 1) {
                        bundleS = sf5.s(parcel, i13);
                    } else if (c9 == 2) {
                        jf7VarArr = (jf7[]) sf5.z(parcel, i13, jf7.CREATOR);
                    } else if (c9 == 3) {
                        iY7 = sf5.Y(parcel, i13);
                    } else if (c9 != 4) {
                        sf5.g0(parcel, i13);
                    } else {
                        sh4Var = (sh4) sf5.v(parcel, i13, sh4.CREATOR);
                    }
                }
                sf5.D(parcel, iK013);
                drk drkVar = new drk();
                drkVar.E = bundleS;
                drkVar.F = jf7VarArr;
                drkVar.G = iY7;
                drkVar.H = sh4Var;
                return drkVar;
            case 13:
                int iK014 = sf5.k0(parcel);
                byte[] bArrT8 = null;
                byte[] bArrT9 = null;
                byte[] bArrT10 = null;
                String[] strArr = null;
                while (parcel.dataPosition() < iK014) {
                    int i14 = parcel.readInt();
                    char c10 = (char) i14;
                    if (c10 == 2) {
                        bArrT8 = sf5.t(parcel, i14);
                    } else if (c10 == 3) {
                        bArrT9 = sf5.t(parcel, i14);
                    } else if (c10 == 4) {
                        bArrT10 = sf5.t(parcel, i14);
                    } else if (c10 != 5) {
                        sf5.g0(parcel, i14);
                    } else {
                        int iC0 = sf5.c0(parcel, i14);
                        int iDataPosition = parcel.dataPosition();
                        if (iC0 == 0) {
                            strArr = null;
                        } else {
                            String[] strArrCreateStringArray = parcel.createStringArray();
                            parcel.setDataPosition(iDataPosition + iC0);
                            strArr = strArrCreateStringArray;
                        }
                    }
                }
                sf5.D(parcel, iK014);
                return new b71(bArrT8, bArrT9, bArrT10, strArr);
            case 14:
                int iK015 = sf5.k0(parcel);
                float fV = MTTypesetterKt.kLineSkipLimitMultiplier;
                while (parcel.dataPosition() < iK015) {
                    int i15 = parcel.readInt();
                    char c11 = (char) i15;
                    if (c11 == 1) {
                        strX4 = sf5.x(parcel, i15);
                    } else if (c11 != 2) {
                        sf5.g0(parcel, i15);
                    } else {
                        fV = sf5.V(parcel, i15);
                    }
                }
                sf5.D(parcel, iK015);
                return new mwk(strX4, fV);
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                int iK016 = sf5.k0(parcel);
                while (parcel.dataPosition() < iK016) {
                    int i16 = parcel.readInt();
                    if (((char) i16) != 1) {
                        sf5.g0(parcel, i16);
                    } else {
                        fW = sf5.W(parcel, i16);
                    }
                }
                sf5.D(parcel, iK016);
                return new uwk(fW);
            case 16:
                int iK017 = sf5.k0(parcel);
                while (parcel.dataPosition() < iK017) {
                    int i17 = parcel.readInt();
                    char c12 = (char) i17;
                    if (c12 == 1) {
                        uri = (Uri) sf5.v(parcel, i17, Uri.CREATOR);
                    } else if (c12 != 2) {
                        sf5.g0(parcel, i17);
                    } else {
                        iY6 = sf5.Y(parcel, i17);
                    }
                }
                sf5.D(parcel, iK017);
                return new iuk(uri, iY6);
            case g.MAX_FIELD_NUMBER /* 17 */:
                int iK018 = sf5.k0(parcel);
                boolean zT2 = false;
                boolean zT3 = false;
                int iY18 = 0;
                jve jveVar = null;
                int[] iArr = null;
                int[] iArr2 = null;
                while (parcel.dataPosition() < iK018) {
                    int i18 = parcel.readInt();
                    switch ((char) i18) {
                        case 1:
                            jveVar = (jve) sf5.v(parcel, i18, jve.CREATOR);
                            break;
                        case 2:
                            zT2 = sf5.T(parcel, i18);
                            break;
                        case 3:
                            zT3 = sf5.T(parcel, i18);
                            break;
                        case 4:
                            int iC02 = sf5.c0(parcel, i18);
                            int iDataPosition2 = parcel.dataPosition();
                            if (iC02 != 0) {
                                int[] iArrCreateIntArray = parcel.createIntArray();
                                parcel.setDataPosition(iDataPosition2 + iC02);
                                iArr = iArrCreateIntArray;
                            } else {
                                iArr = null;
                            }
                            break;
                        case 5:
                            iY18 = sf5.Y(parcel, i18);
                            break;
                        case 6:
                            int iC03 = sf5.c0(parcel, i18);
                            int iDataPosition3 = parcel.dataPosition();
                            if (iC03 != 0) {
                                int[] iArrCreateIntArray2 = parcel.createIntArray();
                                parcel.setDataPosition(iDataPosition3 + iC03);
                                iArr2 = iArrCreateIntArray2;
                            } else {
                                iArr2 = null;
                            }
                            break;
                        default:
                            sf5.g0(parcel, i18);
                            break;
                    }
                }
                sf5.D(parcel, iK018);
                return new sh4(jveVar, zT2, zT3, iArr, iY18, iArr2);
            case g.AVG_FIELD_NUMBER /* 18 */:
                int iK019 = sf5.k0(parcel);
                int iY19 = 0;
                while (parcel.dataPosition() < iK019) {
                    int i19 = parcel.readInt();
                    char c13 = (char) i19;
                    if (c13 == 2) {
                        iY5 = sf5.Y(parcel, i19);
                    } else if (c13 == 3) {
                        strX3 = sf5.x(parcel, i19);
                    } else if (c13 != 4) {
                        sf5.g0(parcel, i19);
                    } else {
                        iY19 = sf5.Y(parcel, i19);
                    }
                }
                sf5.D(parcel, iK019);
                return new c71(iY5, iY19, strX3);
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                int iK020 = sf5.k0(parcel);
                LatLng latLng2 = null;
                while (parcel.dataPosition() < iK020) {
                    int i20 = parcel.readInt();
                    char c14 = (char) i20;
                    if (c14 == 2) {
                        latLng = (LatLng) sf5.v(parcel, i20, LatLng.CREATOR);
                    } else if (c14 != 3) {
                        sf5.g0(parcel, i20);
                    } else {
                        latLng2 = (LatLng) sf5.v(parcel, i20, LatLng.CREATOR);
                    }
                }
                sf5.D(parcel, iK020);
                return new LatLngBounds(latLng, latLng2);
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                int iK021 = sf5.k0(parcel);
                int iY20 = 0;
                while (parcel.dataPosition() < iK021) {
                    int i21 = parcel.readInt();
                    char c15 = (char) i21;
                    if (c15 == 1) {
                        iY4 = sf5.Y(parcel, i21);
                    } else if (c15 != 2) {
                        sf5.g0(parcel, i21);
                    } else {
                        iY20 = sf5.Y(parcel, i21);
                    }
                }
                sf5.D(parcel, iK021);
                return new im0(iY4, iY20);
            case 21:
                int iK022 = sf5.k0(parcel);
                int iY21 = 0;
                byte bU3 = 0;
                byte bU4 = 0;
                byte bU5 = 0;
                byte bU6 = 0;
                String strX8 = null;
                String strX9 = null;
                String strX10 = null;
                String strX11 = null;
                String strX12 = null;
                String strX13 = null;
                String strX14 = null;
                while (parcel.dataPosition() < iK022) {
                    int i22 = parcel.readInt();
                    switch ((char) i22) {
                        case 2:
                            iY21 = sf5.Y(parcel, i22);
                            break;
                        case 3:
                            strX8 = sf5.x(parcel, i22);
                            break;
                        case 4:
                            strX9 = sf5.x(parcel, i22);
                            break;
                        case 5:
                            strX10 = sf5.x(parcel, i22);
                            break;
                        case 6:
                            strX11 = sf5.x(parcel, i22);
                            break;
                        case 7:
                            strX12 = sf5.x(parcel, i22);
                            break;
                        case '\b':
                            strX13 = sf5.x(parcel, i22);
                            break;
                        case '\t':
                            bU3 = sf5.U(parcel, i22);
                            break;
                        case '\n':
                            bU4 = sf5.U(parcel, i22);
                            break;
                        case 11:
                            bU5 = sf5.U(parcel, i22);
                            break;
                        case '\f':
                            bU6 = sf5.U(parcel, i22);
                            break;
                        case '\r':
                            strX14 = sf5.x(parcel, i22);
                            break;
                        default:
                            sf5.g0(parcel, i22);
                            break;
                    }
                }
                sf5.D(parcel, iK022);
                return new fxk(iY21, strX8, strX9, strX10, strX11, strX12, strX13, bU3, bU4, bU5, bU6, strX14);
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                int iK023 = sf5.k0(parcel);
                Bundle bundle = new Bundle();
                Scope[] scopeArr = g48.S;
                jf7[] jf7VarArr2 = g48.T;
                jf7[] jf7VarArr3 = jf7VarArr2;
                int iY22 = 0;
                int iY23 = 0;
                int iY24 = 0;
                boolean zT4 = false;
                int iY25 = 0;
                boolean zT5 = false;
                String strX15 = null;
                IBinder iBinderX = null;
                Account account = null;
                String strX16 = null;
                while (parcel.dataPosition() < iK023) {
                    int i23 = parcel.readInt();
                    switch ((char) i23) {
                        case 1:
                            iY22 = sf5.Y(parcel, i23);
                            break;
                        case 2:
                            iY23 = sf5.Y(parcel, i23);
                            break;
                        case 3:
                            iY24 = sf5.Y(parcel, i23);
                            break;
                        case 4:
                            strX15 = sf5.x(parcel, i23);
                            break;
                        case 5:
                            iBinderX = sf5.X(parcel, i23);
                            break;
                        case 6:
                            scopeArr = (Scope[]) sf5.z(parcel, i23, Scope.CREATOR);
                            break;
                        case 7:
                            bundle = sf5.s(parcel, i23);
                            break;
                        case '\b':
                            account = (Account) sf5.v(parcel, i23, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            sf5.g0(parcel, i23);
                            break;
                        case '\n':
                            jf7VarArr2 = (jf7[]) sf5.z(parcel, i23, jf7.CREATOR);
                            break;
                        case 11:
                            jf7VarArr3 = (jf7[]) sf5.z(parcel, i23, jf7.CREATOR);
                            break;
                        case '\f':
                            zT4 = sf5.T(parcel, i23);
                            break;
                        case '\r':
                            iY25 = sf5.Y(parcel, i23);
                            break;
                        case 14:
                            zT5 = sf5.T(parcel, i23);
                            break;
                        case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                            strX16 = sf5.x(parcel, i23);
                            break;
                    }
                }
                sf5.D(parcel, iK023);
                return new g48(iY22, iY23, iY24, strX15, iBinderX, scopeArr, bundle, account, jf7VarArr2, jf7VarArr3, zT4, iY25, zT5, strX16);
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                int iK024 = sf5.k0(parcel);
                String strX17 = null;
                Boolean boolValueOf = null;
                String strX18 = null;
                String strX19 = null;
                while (parcel.dataPosition() < iK024) {
                    int i24 = parcel.readInt();
                    char c16 = (char) i24;
                    if (c16 == 2) {
                        strX17 = sf5.x(parcel, i24);
                    } else if (c16 == 3) {
                        int iC04 = sf5.c0(parcel, i24);
                        if (iC04 == 0) {
                            boolValueOf = null;
                        } else {
                            sf5.m0(parcel, iC04, 4);
                            boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                        }
                    } else if (c16 == 4) {
                        strX18 = sf5.x(parcel, i24);
                    } else if (c16 != 5) {
                        sf5.g0(parcel, i24);
                    } else {
                        strX19 = sf5.x(parcel, i24);
                    }
                }
                sf5.D(parcel, iK024);
                return new e71(boolValueOf, strX17, strX18, strX19);
            case 24:
                int iK025 = sf5.k0(parcel);
                while (parcel.dataPosition() < iK025) {
                    int i25 = parcel.readInt();
                    if (((char) i25) != 1) {
                        sf5.g0(parcel, i25);
                    } else {
                        status = (Status) sf5.v(parcel, i25, Status.CREATOR);
                    }
                }
                sf5.D(parcel, iK025);
                return new hxk(status);
            case BuildConfig.VERSION_CODE /* 25 */:
                int iK026 = sf5.k0(parcel);
                double d = 0.0d;
                double d2 = 0.0d;
                while (parcel.dataPosition() < iK026) {
                    int i26 = parcel.readInt();
                    char c17 = (char) i26;
                    if (c17 == 2) {
                        sf5.l0(parcel, i26, 8);
                        d = parcel.readDouble();
                    } else if (c17 != 3) {
                        sf5.g0(parcel, i26);
                    } else {
                        sf5.l0(parcel, i26, 8);
                        d2 = parcel.readDouble();
                    }
                }
                sf5.D(parcel, iK026);
                return new LatLng(d, d2);
            case 26:
                int iK027 = sf5.k0(parcel);
                while (parcel.dataPosition() < iK027) {
                    int i27 = parcel.readInt();
                    char c18 = (char) i27;
                    if (c18 == 1) {
                        strX2 = sf5.x(parcel, i27);
                    } else if (c18 == 2) {
                        jA0 = sf5.a0(parcel, i27);
                    } else if (c18 != 3) {
                        sf5.g0(parcel, i27);
                    } else {
                        iY3 = sf5.Y(parcel, i27);
                    }
                }
                sf5.D(parcel, iK027);
                return new f0l(strX2, jA0, iY3);
            case 27:
                int iK028 = sf5.k0(parcel);
                int iY26 = 0;
                int iY27 = 0;
                while (parcel.dataPosition() < iK028) {
                    int i28 = parcel.readInt();
                    char c19 = (char) i28;
                    if (c19 == 1) {
                        iY2 = sf5.Y(parcel, i28);
                    } else if (c19 == 2) {
                        iY26 = sf5.Y(parcel, i28);
                    } else if (c19 != 3) {
                        sf5.g0(parcel, i28);
                    } else {
                        iY27 = sf5.Y(parcel, i28);
                    }
                }
                sf5.D(parcel, iK028);
                return new jm0(iY2, iY26, iY27);
            case 28:
                int iK029 = sf5.k0(parcel);
                String strX20 = null;
                String strX21 = null;
                hwk hwkVar = null;
                String strX22 = null;
                String strX23 = null;
                Float fW2 = null;
                l3l l3lVar = null;
                while (parcel.dataPosition() < iK029) {
                    int i29 = parcel.readInt();
                    switch ((char) i29) {
                        case 1:
                            strX20 = sf5.x(parcel, i29);
                            break;
                        case 2:
                            strX21 = sf5.x(parcel, i29);
                            break;
                        case 3:
                            hwkVar = (hwk) sf5.v(parcel, i29, hwk.CREATOR);
                            break;
                        case 4:
                            strX22 = sf5.x(parcel, i29);
                            break;
                        case 5:
                            strX23 = sf5.x(parcel, i29);
                            break;
                        case 6:
                            fW2 = sf5.W(parcel, i29);
                            break;
                        case 7:
                            l3lVar = (l3l) sf5.v(parcel, i29, l3l.CREATOR);
                            break;
                        default:
                            sf5.g0(parcel, i29);
                            break;
                    }
                }
                sf5.D(parcel, iK029);
                return new pzk(strX20, strX21, hwkVar, strX22, strX23, fW2, l3lVar);
            default:
                int iK030 = sf5.k0(parcel);
                while (parcel.dataPosition() < iK030) {
                    int i30 = parcel.readInt();
                    if (((char) i30) != 2) {
                        sf5.g0(parcel, i30);
                    } else {
                        strX = sf5.x(parcel, i30);
                    }
                }
                sf5.D(parcel, iK030);
                return new cta(strX);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new sok[i];
            case 1:
                return new bpk[i];
            case 2:
                return new hpk[i];
            case 3:
                return new upk[i];
            case 4:
                return new zpk[i];
            case 5:
                return new eqk[i];
            case 6:
                return new jqk[i];
            case 7:
                return new jd5[i];
            case 8:
                return new cnk[i];
            case 9:
                return new a71[i];
            case 10:
                return new tqk[i];
            case 11:
                return new xqk[i];
            case 12:
                return new drk[i];
            case 13:
                return new b71[i];
            case 14:
                return new mwk[i];
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return new uwk[i];
            case 16:
                return new iuk[i];
            case g.MAX_FIELD_NUMBER /* 17 */:
                return new sh4[i];
            case g.AVG_FIELD_NUMBER /* 18 */:
                return new c71[i];
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return new LatLngBounds[i];
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return new im0[i];
            case 21:
                return new fxk[i];
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return new g48[i];
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return new e71[i];
            case 24:
                return new hxk[i];
            case BuildConfig.VERSION_CODE /* 25 */:
                return new LatLng[i];
            case 26:
                return new f0l[i];
            case 27:
                return new jm0[i];
            case 28:
                return new pzk[i];
            default:
                return new cta[i];
        }
    }
}
