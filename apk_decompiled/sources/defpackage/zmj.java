package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.database.CursorWindow;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.platform.client.proto.g;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.fido.fido2.api.common.Attachment$UnsupportedAttachmentException;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.ArrayList;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final class zmj implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ zmj(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        long jA0 = 0;
        int iY = 0;
        boolean zT = false;
        int iY2 = 0;
        boolean zT2 = false;
        int iY3 = 0;
        boolean zT3 = false;
        boolean zT4 = false;
        boolean zT5 = false;
        int iY4 = 0;
        int iY5 = 0;
        int iY6 = 0;
        switch (this.a) {
            case 0:
                int iK0 = sf5.k0(parcel);
                boolean zT6 = false;
                while (parcel.dataPosition() < iK0) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c == 1) {
                        iY = sf5.Y(parcel, i);
                    } else if (c != 2) {
                        sf5.g0(parcel, i);
                    } else {
                        zT6 = sf5.T(parcel, i);
                    }
                }
                sf5.D(parcel, iK0);
                return new wqb(iY, zT6);
            case 1:
                ArrayList arrayListA = null;
                int iK02 = sf5.k0(parcel);
                int iY7 = 0;
                boolean zT7 = false;
                boolean zT8 = false;
                boolean zT9 = false;
                ArrayList arrayListA2 = null;
                Account account = null;
                String strX = null;
                String strX2 = null;
                String strX3 = null;
                while (parcel.dataPosition() < iK02) {
                    int i2 = parcel.readInt();
                    switch ((char) i2) {
                        case 1:
                            iY7 = sf5.Y(parcel, i2);
                            break;
                        case 2:
                            arrayListA2 = sf5.A(parcel, i2, Scope.CREATOR);
                            break;
                        case 3:
                            account = (Account) sf5.v(parcel, i2, Account.CREATOR);
                            break;
                        case 4:
                            zT7 = sf5.T(parcel, i2);
                            break;
                        case 5:
                            zT8 = sf5.T(parcel, i2);
                            break;
                        case 6:
                            zT9 = sf5.T(parcel, i2);
                            break;
                        case 7:
                            strX = sf5.x(parcel, i2);
                            break;
                        case '\b':
                            strX2 = sf5.x(parcel, i2);
                            break;
                        case '\t':
                            arrayListA = sf5.A(parcel, i2, t98.CREATOR);
                            break;
                        case '\n':
                            strX3 = sf5.x(parcel, i2);
                            break;
                        default:
                            sf5.g0(parcel, i2);
                            break;
                    }
                }
                sf5.D(parcel, iK02);
                return new GoogleSignInOptions(iY7, arrayListA2, account, zT7, zT8, zT9, strX, strX2, GoogleSignInOptions.x0(arrayListA), strX3);
            case 2:
                int iK03 = sf5.k0(parcel);
                int iY8 = 0;
                int iY9 = 0;
                String[] strArr = null;
                CursorWindow[] cursorWindowArr = null;
                Bundle bundleS = null;
                while (parcel.dataPosition() < iK03) {
                    int i3 = parcel.readInt();
                    char c2 = (char) i3;
                    if (c2 == 1) {
                        int iC0 = sf5.c0(parcel, i3);
                        int iDataPosition = parcel.dataPosition();
                        if (iC0 == 0) {
                            strArr = null;
                        } else {
                            String[] strArrCreateStringArray = parcel.createStringArray();
                            parcel.setDataPosition(iDataPosition + iC0);
                            strArr = strArrCreateStringArray;
                        }
                    } else if (c2 == 2) {
                        cursorWindowArr = (CursorWindow[]) sf5.z(parcel, i3, CursorWindow.CREATOR);
                    } else if (c2 == 3) {
                        iY9 = sf5.Y(parcel, i3);
                    } else if (c2 == 4) {
                        bundleS = sf5.s(parcel, i3);
                    } else if (c2 != 1000) {
                        sf5.g0(parcel, i3);
                    } else {
                        iY8 = sf5.Y(parcel, i3);
                    }
                }
                sf5.D(parcel, iK03);
                DataHolder dataHolder = new DataHolder(iY8, strArr, cursorWindowArr, iY9, bundleS);
                dataHolder.G = new Bundle();
                int i4 = 0;
                while (true) {
                    String[] strArr2 = dataHolder.F;
                    if (i4 >= strArr2.length) {
                        CursorWindow[] cursorWindowArr2 = dataHolder.H;
                        dataHolder.K = new int[cursorWindowArr2.length];
                        int numRows = 0;
                        for (int i5 = 0; i5 < cursorWindowArr2.length; i5++) {
                            dataHolder.K[i5] = numRows;
                            numRows += cursorWindowArr2[i5].getNumRows() - (numRows - cursorWindowArr2[i5].getStartPosition());
                        }
                        dataHolder.L = numRows;
                        return dataHolder;
                    }
                    dataHolder.G.putInt(strArr2[i4], i4);
                    i4++;
                }
                break;
            case 3:
                ArrayList arrayListY = null;
                int iK04 = sf5.k0(parcel);
                String strX4 = null;
                while (parcel.dataPosition() < iK04) {
                    int i6 = parcel.readInt();
                    char c3 = (char) i6;
                    if (c3 == 1) {
                        arrayListY = sf5.y(parcel, i6);
                    } else if (c3 != 2) {
                        sf5.g0(parcel, i6);
                    } else {
                        strX4 = sf5.x(parcel, i6);
                    }
                }
                sf5.D(parcel, iK04);
                return new knj(strX4, arrayListY);
            case 4:
                wnj wnjVar = null;
                int iK05 = sf5.k0(parcel);
                while (parcel.dataPosition() < iK05) {
                    int i7 = parcel.readInt();
                    char c4 = (char) i7;
                    if (c4 == 1) {
                        iY6 = sf5.Y(parcel, i7);
                    } else if (c4 != 2) {
                        sf5.g0(parcel, i7);
                    } else {
                        wnjVar = (wnj) sf5.v(parcel, i7, wnj.CREATOR);
                    }
                }
                sf5.D(parcel, iK05);
                return new onj(iY6, wnjVar);
            case 5:
                hh4 hh4Var = null;
                int iK06 = sf5.k0(parcel);
                ynj ynjVar = null;
                while (parcel.dataPosition() < iK06) {
                    int i8 = parcel.readInt();
                    char c5 = (char) i8;
                    if (c5 == 1) {
                        iY5 = sf5.Y(parcel, i8);
                    } else if (c5 == 2) {
                        hh4Var = (hh4) sf5.v(parcel, i8, hh4.CREATOR);
                    } else if (c5 != 3) {
                        sf5.g0(parcel, i8);
                    } else {
                        ynjVar = (ynj) sf5.v(parcel, i8, ynj.CREATOR);
                    }
                }
                sf5.D(parcel, iK06);
                return new qnj(iY5, hh4Var, ynjVar);
            case 6:
                Account account2 = null;
                int iK07 = sf5.k0(parcel);
                int iY10 = 0;
                GoogleSignInAccount googleSignInAccount = null;
                while (parcel.dataPosition() < iK07) {
                    int i9 = parcel.readInt();
                    char c6 = (char) i9;
                    if (c6 == 1) {
                        iY4 = sf5.Y(parcel, i9);
                    } else if (c6 == 2) {
                        account2 = (Account) sf5.v(parcel, i9, Account.CREATOR);
                    } else if (c6 == 3) {
                        iY10 = sf5.Y(parcel, i9);
                    } else if (c6 != 4) {
                        sf5.g0(parcel, i9);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) sf5.v(parcel, i9, GoogleSignInAccount.CREATOR);
                    }
                }
                sf5.D(parcel, iK07);
                return new wnj(iY4, account2, iY10, googleSignInAccount);
            case 7:
                int iK08 = sf5.k0(parcel);
                int iY11 = 0;
                boolean zT10 = false;
                boolean zT11 = false;
                IBinder iBinderX = null;
                hh4 hh4Var2 = null;
                while (parcel.dataPosition() < iK08) {
                    int i10 = parcel.readInt();
                    char c7 = (char) i10;
                    if (c7 == 1) {
                        iY11 = sf5.Y(parcel, i10);
                    } else if (c7 == 2) {
                        iBinderX = sf5.X(parcel, i10);
                    } else if (c7 == 3) {
                        hh4Var2 = (hh4) sf5.v(parcel, i10, hh4.CREATOR);
                    } else if (c7 == 4) {
                        zT10 = sf5.T(parcel, i10);
                    } else if (c7 != 5) {
                        sf5.g0(parcel, i10);
                    } else {
                        zT11 = sf5.T(parcel, i10);
                    }
                }
                sf5.D(parcel, iK08);
                return new ynj(iY11, iBinderX, hh4Var2, zT10, zT11);
            case 8:
                GoogleSignInAccount googleSignInAccount2 = null;
                int iK09 = sf5.k0(parcel);
                String strX5 = "";
                String strX6 = "";
                while (parcel.dataPosition() < iK09) {
                    int i11 = parcel.readInt();
                    char c8 = (char) i11;
                    if (c8 == 4) {
                        strX5 = sf5.x(parcel, i11);
                    } else if (c8 == 7) {
                        googleSignInAccount2 = (GoogleSignInAccount) sf5.v(parcel, i11, GoogleSignInAccount.CREATOR);
                    } else if (c8 != '\b') {
                        sf5.g0(parcel, i11);
                    } else {
                        strX6 = sf5.x(parcel, i11);
                    }
                }
                sf5.D(parcel, iK09);
                return new SignInAccount(strX5, googleSignInAccount2, strX6);
            case 9:
                int iK010 = sf5.k0(parcel);
                boolean zT12 = false;
                int iY12 = 0;
                boolean zT13 = false;
                uh1 uh1Var = null;
                rh1 rh1Var = null;
                String strX7 = null;
                th1 th1Var = null;
                sh1 sh1Var = null;
                while (parcel.dataPosition() < iK010) {
                    int i12 = parcel.readInt();
                    switch ((char) i12) {
                        case 1:
                            uh1Var = (uh1) sf5.v(parcel, i12, uh1.CREATOR);
                            break;
                        case 2:
                            rh1Var = (rh1) sf5.v(parcel, i12, rh1.CREATOR);
                            break;
                        case 3:
                            strX7 = sf5.x(parcel, i12);
                            break;
                        case 4:
                            zT12 = sf5.T(parcel, i12);
                            break;
                        case 5:
                            iY12 = sf5.Y(parcel, i12);
                            break;
                        case 6:
                            th1Var = (th1) sf5.v(parcel, i12, th1.CREATOR);
                            break;
                        case 7:
                            sh1Var = (sh1) sf5.v(parcel, i12, sh1.CREATOR);
                            break;
                        case '\b':
                            zT13 = sf5.T(parcel, i12);
                            break;
                        default:
                            sf5.g0(parcel, i12);
                            break;
                    }
                }
                sf5.D(parcel, iK010);
                return new vh1(uh1Var, rh1Var, strX7, zT12, iY12, th1Var, sh1Var, zT13);
            case 10:
                PendingIntent pendingIntent = null;
                int iK011 = sf5.k0(parcel);
                while (parcel.dataPosition() < iK011) {
                    int i13 = parcel.readInt();
                    if (((char) i13) != 1) {
                        sf5.g0(parcel, i13);
                    } else {
                        pendingIntent = (PendingIntent) sf5.v(parcel, i13, PendingIntent.CREATOR);
                    }
                }
                sf5.D(parcel, iK011);
                return new wh1(pendingIntent);
            case 11:
                int iK012 = sf5.k0(parcel);
                boolean zT14 = false;
                int iY13 = 0;
                String strX8 = null;
                String strX9 = null;
                String strX10 = null;
                String strX11 = null;
                while (parcel.dataPosition() < iK012) {
                    int i14 = parcel.readInt();
                    switch ((char) i14) {
                        case 1:
                            strX8 = sf5.x(parcel, i14);
                            break;
                        case 2:
                            strX9 = sf5.x(parcel, i14);
                            break;
                        case 3:
                            strX10 = sf5.x(parcel, i14);
                            break;
                        case 4:
                            strX11 = sf5.x(parcel, i14);
                            break;
                        case 5:
                            zT14 = sf5.T(parcel, i14);
                            break;
                        case 6:
                            iY13 = sf5.Y(parcel, i14);
                            break;
                        default:
                            sf5.g0(parcel, i14);
                            break;
                    }
                }
                sf5.D(parcel, iK012);
                return new l48(strX8, strX9, strX10, strX11, zT14, iY13);
            case 12:
                int iK013 = sf5.k0(parcel);
                boolean zT15 = false;
                boolean zT16 = false;
                boolean zT17 = false;
                String strX12 = null;
                String strX13 = null;
                String strX14 = null;
                ArrayList arrayListY2 = null;
                while (parcel.dataPosition() < iK013) {
                    int i15 = parcel.readInt();
                    switch ((char) i15) {
                        case 1:
                            zT15 = sf5.T(parcel, i15);
                            break;
                        case 2:
                            strX12 = sf5.x(parcel, i15);
                            break;
                        case 3:
                            strX13 = sf5.x(parcel, i15);
                            break;
                        case 4:
                            zT16 = sf5.T(parcel, i15);
                            break;
                        case 5:
                            strX14 = sf5.x(parcel, i15);
                            break;
                        case 6:
                            arrayListY2 = sf5.y(parcel, i15);
                            break;
                        case 7:
                            zT17 = sf5.T(parcel, i15);
                            break;
                        default:
                            sf5.g0(parcel, i15);
                            break;
                    }
                }
                sf5.D(parcel, iK013);
                return new rh1(zT15, strX12, strX13, zT16, strX14, arrayListY2, zT17);
            case 13:
                String strX15 = null;
                int iK014 = sf5.k0(parcel);
                while (parcel.dataPosition() < iK014) {
                    int i16 = parcel.readInt();
                    char c9 = (char) i16;
                    if (c9 == 1) {
                        zT5 = sf5.T(parcel, i16);
                    } else if (c9 != 2) {
                        sf5.g0(parcel, i16);
                    } else {
                        strX15 = sf5.x(parcel, i16);
                    }
                }
                sf5.D(parcel, iK014);
                return new sh1(zT5, strX15);
            case 14:
                byte[] bArrT = null;
                int iK015 = sf5.k0(parcel);
                String strX16 = null;
                while (parcel.dataPosition() < iK015) {
                    int i17 = parcel.readInt();
                    char c10 = (char) i17;
                    if (c10 == 1) {
                        zT4 = sf5.T(parcel, i17);
                    } else if (c10 == 2) {
                        bArrT = sf5.t(parcel, i17);
                    } else if (c10 != 3) {
                        sf5.g0(parcel, i17);
                    } else {
                        strX16 = sf5.x(parcel, i17);
                    }
                }
                sf5.D(parcel, iK015);
                return new th1(strX16, zT4, bArrT);
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                int iK016 = sf5.k0(parcel);
                while (parcel.dataPosition() < iK016) {
                    int i18 = parcel.readInt();
                    if (((char) i18) != 1) {
                        sf5.g0(parcel, i18);
                    } else {
                        zT3 = sf5.T(parcel, i18);
                    }
                }
                sf5.D(parcel, iK016);
                return new uh1(zT3);
            case 16:
                l6g l6gVar = null;
                int iK017 = sf5.k0(parcel);
                String strX17 = null;
                while (parcel.dataPosition() < iK017) {
                    int i19 = parcel.readInt();
                    char c11 = (char) i19;
                    if (c11 == 1) {
                        l6gVar = (l6g) sf5.v(parcel, i19, l6g.CREATOR);
                    } else if (c11 == 2) {
                        strX17 = sf5.x(parcel, i19);
                    } else if (c11 != 3) {
                        sf5.g0(parcel, i19);
                    } else {
                        iY3 = sf5.Y(parcel, i19);
                    }
                }
                sf5.D(parcel, iK017);
                return new v4f(l6gVar, strX17, iY3);
            case g.MAX_FIELD_NUMBER /* 17 */:
                PendingIntent pendingIntent2 = null;
                int iK018 = sf5.k0(parcel);
                while (parcel.dataPosition() < iK018) {
                    int i20 = parcel.readInt();
                    if (((char) i20) != 1) {
                        sf5.g0(parcel, i20);
                    } else {
                        pendingIntent2 = (PendingIntent) sf5.v(parcel, i20, PendingIntent.CREATOR);
                    }
                }
                sf5.D(parcel, iK018);
                return new w4f(pendingIntent2);
            case g.AVG_FIELD_NUMBER /* 18 */:
                String strX18 = null;
                int iK019 = sf5.k0(parcel);
                GoogleSignInOptions googleSignInOptions = null;
                while (parcel.dataPosition() < iK019) {
                    int i21 = parcel.readInt();
                    char c12 = (char) i21;
                    if (c12 == 2) {
                        strX18 = sf5.x(parcel, i21);
                    } else if (c12 != 5) {
                        sf5.g0(parcel, i21);
                    } else {
                        googleSignInOptions = (GoogleSignInOptions) sf5.v(parcel, i21, GoogleSignInOptions.CREATOR);
                    }
                }
                sf5.D(parcel, iK019);
                return new SignInConfiguration(strX18, googleSignInOptions);
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                int iK020 = sf5.k0(parcel);
                String strX19 = null;
                String strX20 = null;
                String strX21 = null;
                String strX22 = null;
                Uri uri = null;
                String strX23 = null;
                String strX24 = null;
                String strX25 = null;
                rvd rvdVar = null;
                while (parcel.dataPosition() < iK020) {
                    int i22 = parcel.readInt();
                    switch ((char) i22) {
                        case 1:
                            strX19 = sf5.x(parcel, i22);
                            break;
                        case 2:
                            strX20 = sf5.x(parcel, i22);
                            break;
                        case 3:
                            strX21 = sf5.x(parcel, i22);
                            break;
                        case 4:
                            strX22 = sf5.x(parcel, i22);
                            break;
                        case 5:
                            uri = (Uri) sf5.v(parcel, i22, Uri.CREATOR);
                            break;
                        case 6:
                            strX23 = sf5.x(parcel, i22);
                            break;
                        case 7:
                            strX24 = sf5.x(parcel, i22);
                            break;
                        case '\b':
                            strX25 = sf5.x(parcel, i22);
                            break;
                        case '\t':
                            rvdVar = (rvd) sf5.v(parcel, i22, rvd.CREATOR);
                            break;
                        default:
                            sf5.g0(parcel, i22);
                            break;
                    }
                }
                sf5.D(parcel, iK020);
                return new j6g(strX19, strX20, strX21, strX22, uri, strX23, strX24, strX25, rvdVar);
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                String strX26 = null;
                int iK021 = sf5.k0(parcel);
                String strX27 = null;
                while (parcel.dataPosition() < iK021) {
                    int i23 = parcel.readInt();
                    char c13 = (char) i23;
                    if (c13 == 1) {
                        strX26 = sf5.x(parcel, i23);
                    } else if (c13 != 2) {
                        sf5.g0(parcel, i23);
                    } else {
                        strX27 = sf5.x(parcel, i23);
                    }
                }
                sf5.D(parcel, iK021);
                return new l6g(strX26, strX27);
            case 21:
                Intent intent = null;
                int iK022 = sf5.k0(parcel);
                while (parcel.dataPosition() < iK022) {
                    int i24 = parcel.readInt();
                    if (((char) i24) != 1) {
                        sf5.g0(parcel, i24);
                    } else {
                        intent = (Intent) sf5.v(parcel, i24, Intent.CREATOR);
                    }
                }
                sf5.D(parcel, iK022);
                return new iq3(intent);
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                LatLng latLng = null;
                int iK023 = sf5.k0(parcel);
                float fV = MTTypesetterKt.kLineSkipLimitMultiplier;
                float fV2 = 0.0f;
                float fV3 = 0.0f;
                while (parcel.dataPosition() < iK023) {
                    int i25 = parcel.readInt();
                    char c14 = (char) i25;
                    if (c14 == 2) {
                        latLng = (LatLng) sf5.v(parcel, i25, LatLng.CREATOR);
                    } else if (c14 == 3) {
                        fV = sf5.V(parcel, i25);
                    } else if (c14 == 4) {
                        fV2 = sf5.V(parcel, i25);
                    } else if (c14 != 5) {
                        sf5.g0(parcel, i25);
                    } else {
                        fV3 = sf5.V(parcel, i25);
                    }
                }
                sf5.D(parcel, iK023);
                return new CameraPosition(latLng, fV, fV2, fV3);
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                try {
                    return b21.a(parcel.readString());
                } catch (Attachment$UnsupportedAttachmentException e) {
                    xh6.h(e);
                    return null;
                }
            case 24:
                int iK024 = sf5.k0(parcel);
                while (parcel.dataPosition() < iK024) {
                    int i26 = parcel.readInt();
                    if (((char) i26) != 1) {
                        sf5.g0(parcel, i26);
                    } else {
                        zT2 = sf5.T(parcel, i26);
                    }
                }
                sf5.D(parcel, iK024);
                return new e6l(zT2);
            case BuildConfig.VERSION_CODE /* 25 */:
                int iK025 = sf5.k0(parcel);
                long jA02 = Long.MAX_VALUE;
                int iY14 = 0;
                boolean zT18 = false;
                j7k j7kVar = null;
                while (parcel.dataPosition() < iK025) {
                    int i27 = parcel.readInt();
                    char c15 = (char) i27;
                    if (c15 == 1) {
                        jA02 = sf5.a0(parcel, i27);
                    } else if (c15 == 2) {
                        iY14 = sf5.Y(parcel, i27);
                    } else if (c15 == 3) {
                        zT18 = sf5.T(parcel, i27);
                    } else if (c15 != 5) {
                        sf5.g0(parcel, i27);
                    } else {
                        j7kVar = (j7k) sf5.v(parcel, i27, j7k.CREATOR);
                    }
                }
                sf5.D(parcel, iK025);
                return new ct9(jA02, iY14, zT18, j7kVar);
            case 26:
                int iK026 = sf5.k0(parcel);
                int iY15 = 1000;
                long jA03 = 0;
                int iY16 = 1;
                int iY17 = 1;
                qrj[] qrjVarArr = null;
                while (parcel.dataPosition() < iK026) {
                    int i28 = parcel.readInt();
                    switch ((char) i28) {
                        case 1:
                            iY16 = sf5.Y(parcel, i28);
                            break;
                        case 2:
                            iY17 = sf5.Y(parcel, i28);
                            break;
                        case 3:
                            jA03 = sf5.a0(parcel, i28);
                            break;
                        case 4:
                            iY15 = sf5.Y(parcel, i28);
                            break;
                        case 5:
                            qrjVarArr = (qrj[]) sf5.z(parcel, i28, qrj.CREATOR);
                            break;
                        case 6:
                            sf5.T(parcel, i28);
                            break;
                        default:
                            sf5.g0(parcel, i28);
                            break;
                    }
                }
                sf5.D(parcel, iK026);
                return new LocationAvailability(iY15, iY16, iY17, jA03, qrjVarArr);
            case 27:
                int iK027 = sf5.k0(parcel);
                while (parcel.dataPosition() < iK027) {
                    int i29 = parcel.readInt();
                    if (((char) i29) != 1) {
                        sf5.g0(parcel, i29);
                    } else {
                        jA0 = sf5.a0(parcel, i29);
                    }
                }
                sf5.D(parcel, iK027);
                return new opj(jA0);
            case 28:
                int iK028 = sf5.k0(parcel);
                int iY18 = 0;
                byte bU = -1;
                byte bU2 = -1;
                CameraPosition cameraPosition = null;
                byte bU3 = -1;
                byte bU4 = -1;
                byte bU5 = -1;
                byte bU6 = -1;
                byte bU7 = -1;
                byte bU8 = -1;
                byte bU9 = -1;
                byte bU10 = -1;
                byte bU11 = -1;
                Float fW = null;
                Float fW2 = null;
                LatLngBounds latLngBounds = null;
                byte bU12 = -1;
                Integer numZ = null;
                String strX28 = null;
                while (parcel.dataPosition() < iK028) {
                    int i30 = parcel.readInt();
                    switch ((char) i30) {
                        case 2:
                            bU = sf5.U(parcel, i30);
                            break;
                        case 3:
                            bU2 = sf5.U(parcel, i30);
                            break;
                        case 4:
                            iY2 = sf5.Y(parcel, i30);
                            break;
                        case 5:
                            cameraPosition = (CameraPosition) sf5.v(parcel, i30, CameraPosition.CREATOR);
                            break;
                        case 6:
                            bU3 = sf5.U(parcel, i30);
                            break;
                        case 7:
                            bU4 = sf5.U(parcel, i30);
                            break;
                        case '\b':
                            bU5 = sf5.U(parcel, i30);
                            break;
                        case '\t':
                            bU6 = sf5.U(parcel, i30);
                            break;
                        case '\n':
                            bU7 = sf5.U(parcel, i30);
                            break;
                        case 11:
                            bU8 = sf5.U(parcel, i30);
                            break;
                        case '\f':
                            bU9 = sf5.U(parcel, i30);
                            break;
                        case '\r':
                        case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        default:
                            sf5.g0(parcel, i30);
                            break;
                        case 14:
                            bU10 = sf5.U(parcel, i30);
                            break;
                        case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                            bU11 = sf5.U(parcel, i30);
                            break;
                        case 16:
                            fW = sf5.W(parcel, i30);
                            break;
                        case g.MAX_FIELD_NUMBER /* 17 */:
                            fW2 = sf5.W(parcel, i30);
                            break;
                        case g.AVG_FIELD_NUMBER /* 18 */:
                            latLngBounds = (LatLngBounds) sf5.v(parcel, i30, LatLngBounds.CREATOR);
                            break;
                        case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            bU12 = sf5.U(parcel, i30);
                            break;
                        case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                            numZ = sf5.Z(parcel, i30);
                            break;
                        case 21:
                            strX28 = sf5.x(parcel, i30);
                            break;
                        case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            iY18 = sf5.Y(parcel, i30);
                            break;
                    }
                }
                sf5.D(parcel, iK028);
                GoogleMapOptions googleMapOptions = new GoogleMapOptions();
                googleMapOptions.G = -1;
                googleMapOptions.R = null;
                googleMapOptions.S = null;
                googleMapOptions.T = null;
                googleMapOptions.V = null;
                googleMapOptions.W = null;
                googleMapOptions.E = bok.p(bU);
                googleMapOptions.F = bok.p(bU2);
                googleMapOptions.G = iY2;
                googleMapOptions.H = cameraPosition;
                googleMapOptions.I = bok.p(bU3);
                googleMapOptions.J = bok.p(bU4);
                googleMapOptions.K = bok.p(bU5);
                googleMapOptions.L = bok.p(bU6);
                googleMapOptions.M = bok.p(bU7);
                googleMapOptions.N = bok.p(bU8);
                googleMapOptions.O = bok.p(bU9);
                googleMapOptions.P = bok.p(bU10);
                googleMapOptions.Q = bok.p(bU11);
                googleMapOptions.R = fW;
                googleMapOptions.S = fW2;
                googleMapOptions.T = latLngBounds;
                googleMapOptions.U = bok.p(bU12);
                googleMapOptions.V = numZ;
                googleMapOptions.W = strX28;
                googleMapOptions.X = iY18;
                return googleMapOptions;
            default:
                int iK029 = sf5.k0(parcel);
                while (parcel.dataPosition() < iK029) {
                    int i31 = parcel.readInt();
                    if (((char) i31) != 1) {
                        sf5.g0(parcel, i31);
                    } else {
                        zT = sf5.T(parcel, i31);
                    }
                }
                sf5.D(parcel, iK029);
                return new aqj(zT);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new wqb[i];
            case 1:
                return new GoogleSignInOptions[i];
            case 2:
                return new DataHolder[i];
            case 3:
                return new knj[i];
            case 4:
                return new onj[i];
            case 5:
                return new qnj[i];
            case 6:
                return new wnj[i];
            case 7:
                return new ynj[i];
            case 8:
                return new SignInAccount[i];
            case 9:
                return new vh1[i];
            case 10:
                return new wh1[i];
            case 11:
                return new l48[i];
            case 12:
                return new rh1[i];
            case 13:
                return new sh1[i];
            case 14:
                return new th1[i];
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return new uh1[i];
            case 16:
                return new v4f[i];
            case g.MAX_FIELD_NUMBER /* 17 */:
                return new w4f[i];
            case g.AVG_FIELD_NUMBER /* 18 */:
                return new SignInConfiguration[i];
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return new j6g[i];
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return new l6g[i];
            case 21:
                return new iq3[i];
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return new CameraPosition[i];
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return new b21[i];
            case 24:
                return new e6l[i];
            case BuildConfig.VERSION_CODE /* 25 */:
                return new ct9[i];
            case 26:
                return new LocationAvailability[i];
            case 27:
                return new opj[i];
            case 28:
                return new GoogleMapOptions[i];
            default:
                return new aqj[i];
        }
    }
}
