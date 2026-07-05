package defpackage;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import androidx.health.platform.client.proto.g;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference$UnsupportedAttestationConveyancePreferenceException;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType$UnsupportedPublicKeyCredTypeException;
import com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement$UnsupportedResidentKeyRequirementException;
import com.google.android.gms.fido.fido2.api.common.TokenBinding$UnsupportedTokenBindingStatusException;
import com.google.android.gms.fido.fido2.api.common.zzbc;
import com.google.android.gms.location.LocationResult;
import java.util.ArrayList;
import java.util.List;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final class gqj implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ gqj(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean zT = false;
        int iY = 0;
        boolean zT2 = false;
        int iY2 = 0;
        String strX = null;
        ArrayList arrayListA = null;
        String strX2 = null;
        String strX3 = null;
        byte[] bArrT = null;
        String strX4 = null;
        String strX5 = null;
        String strX6 = null;
        String strX7 = null;
        Bundle bundleS = null;
        Status status = null;
        switch (this.a) {
            case 0:
                int iK0 = sf5.k0(parcel);
                long jA0 = 0;
                long jA02 = 0;
                long jA03 = 0;
                boolean zT3 = false;
                String strX8 = null;
                String strX9 = null;
                e1l e1lVar = null;
                String strX10 = null;
                rvj rvjVar = null;
                rvj rvjVar2 = null;
                rvj rvjVar3 = null;
                while (parcel.dataPosition() < iK0) {
                    int i = parcel.readInt();
                    switch ((char) i) {
                        case 2:
                            strX8 = sf5.x(parcel, i);
                            break;
                        case 3:
                            strX9 = sf5.x(parcel, i);
                            break;
                        case 4:
                            e1lVar = (e1l) sf5.v(parcel, i, e1l.CREATOR);
                            break;
                        case 5:
                            jA0 = sf5.a0(parcel, i);
                            break;
                        case 6:
                            zT3 = sf5.T(parcel, i);
                            break;
                        case 7:
                            strX10 = sf5.x(parcel, i);
                            break;
                        case '\b':
                            rvjVar = (rvj) sf5.v(parcel, i, rvj.CREATOR);
                            break;
                        case '\t':
                            jA02 = sf5.a0(parcel, i);
                            break;
                        case '\n':
                            rvjVar2 = (rvj) sf5.v(parcel, i, rvj.CREATOR);
                            break;
                        case 11:
                            jA03 = sf5.a0(parcel, i);
                            break;
                        case '\f':
                            rvjVar3 = (rvj) sf5.v(parcel, i, rvj.CREATOR);
                            break;
                        default:
                            sf5.g0(parcel, i);
                            break;
                    }
                }
                sf5.D(parcel, iK0);
                return new kqj(strX8, strX9, e1lVar, jA0, zT3, strX10, rvjVar, jA02, rvjVar2, jA03, rvjVar3);
            case 1:
                int iK02 = sf5.k0(parcel);
                while (parcel.dataPosition() < iK02) {
                    int i2 = parcel.readInt();
                    if (((char) i2) != 1) {
                        sf5.g0(parcel, i2);
                    } else {
                        zT = sf5.T(parcel, i2);
                    }
                }
                sf5.D(parcel, iK02);
                return new v98(zT);
            case 2:
                int iK03 = sf5.k0(parcel);
                int iY3 = 0;
                boolean zT4 = false;
                boolean zT5 = false;
                int iY4 = 0;
                int iY5 = 0;
                while (parcel.dataPosition() < iK03) {
                    int i3 = parcel.readInt();
                    char c = (char) i3;
                    if (c == 1) {
                        iY3 = sf5.Y(parcel, i3);
                    } else if (c == 2) {
                        zT4 = sf5.T(parcel, i3);
                    } else if (c == 3) {
                        zT5 = sf5.T(parcel, i3);
                    } else if (c == 4) {
                        iY4 = sf5.Y(parcel, i3);
                    } else if (c != 5) {
                        sf5.g0(parcel, i3);
                    } else {
                        iY5 = sf5.Y(parcel, i3);
                    }
                }
                sf5.D(parcel, iK03);
                return new jve(iY3, zT4, zT5, iY4, iY5);
            case 3:
                int iK04 = sf5.k0(parcel);
                List listA = LocationResult.F;
                while (parcel.dataPosition() < iK04) {
                    int i4 = parcel.readInt();
                    if (((char) i4) != 1) {
                        sf5.g0(parcel, i4);
                    } else {
                        listA = sf5.A(parcel, i4, Location.CREATOR);
                    }
                }
                sf5.D(parcel, iK04);
                return new LocationResult(listA);
            case 4:
                int iK05 = sf5.k0(parcel);
                while (parcel.dataPosition() < iK05) {
                    int i5 = parcel.readInt();
                    if (((char) i5) != 1) {
                        sf5.g0(parcel, i5);
                    } else {
                        strX = sf5.x(parcel, i5);
                    }
                }
                sf5.D(parcel, iK05);
                return new nqj(strX);
            case 5:
                int iK06 = sf5.k0(parcel);
                vea veaVar = null;
                while (parcel.dataPosition() < iK06) {
                    int i6 = parcel.readInt();
                    char c2 = (char) i6;
                    if (c2 == 1) {
                        status = (Status) sf5.v(parcel, i6, Status.CREATOR);
                    } else if (c2 != 2) {
                        sf5.g0(parcel, i6);
                    } else {
                        veaVar = (vea) sf5.v(parcel, i6, vea.CREATOR);
                    }
                }
                sf5.D(parcel, iK06);
                return new uea(status, veaVar);
            case 6:
                int iK07 = sf5.k0(parcel);
                boolean zT6 = false;
                boolean zT7 = false;
                boolean zT8 = false;
                boolean zT9 = false;
                boolean zT10 = false;
                boolean zT11 = false;
                while (parcel.dataPosition() < iK07) {
                    int i7 = parcel.readInt();
                    switch ((char) i7) {
                        case 1:
                            zT6 = sf5.T(parcel, i7);
                            break;
                        case 2:
                            zT7 = sf5.T(parcel, i7);
                            break;
                        case 3:
                            zT8 = sf5.T(parcel, i7);
                            break;
                        case 4:
                            zT9 = sf5.T(parcel, i7);
                            break;
                        case 5:
                            zT10 = sf5.T(parcel, i7);
                            break;
                        case 6:
                            zT11 = sf5.T(parcel, i7);
                            break;
                        default:
                            sf5.g0(parcel, i7);
                            break;
                    }
                }
                sf5.D(parcel, iK07);
                return new vea(zT6, zT7, zT8, zT9, zT10, zT11);
            case 7:
                int iK08 = sf5.k0(parcel);
                byte[] bArrT2 = null;
                byte[] bArrT3 = null;
                byte[] bArrT4 = null;
                while (parcel.dataPosition() < iK08) {
                    int i8 = parcel.readInt();
                    char c3 = (char) i8;
                    if (c3 == 1) {
                        bArrT2 = sf5.t(parcel, i8);
                    } else if (c3 == 2) {
                        bArrT3 = sf5.t(parcel, i8);
                    } else if (c3 == 3) {
                        bArrT4 = sf5.t(parcel, i8);
                    } else if (c3 != 4) {
                        sf5.g0(parcel, i8);
                    } else {
                        iY2 = sf5.Y(parcel, i8);
                    }
                }
                sf5.D(parcel, iK08);
                return new arj(bArrT2 == null ? null : wik.m(bArrT2, bArrT2.length), bArrT3 == null ? null : wik.m(bArrT3, bArrT3.length), bArrT4 != null ? wik.m(bArrT4, bArrT4.length) : null, iY2);
            case 8:
                int iK09 = sf5.k0(parcel);
                while (true) {
                    byte[][] bArr = null;
                    while (parcel.dataPosition() < iK09) {
                        int i9 = parcel.readInt();
                        if (((char) i9) != 1) {
                            sf5.g0(parcel, i9);
                        } else {
                            int iC0 = sf5.c0(parcel, i9);
                            int iDataPosition = parcel.dataPosition();
                            if (iC0 == 0) {
                            }
                            int i10 = parcel.readInt();
                            byte[][] bArr2 = new byte[i10][];
                            for (int i11 = 0; i11 < i10; i11++) {
                                bArr2[i11] = parcel.createByteArray();
                            }
                            parcel.setDataPosition(iDataPosition + iC0);
                            bArr = bArr2;
                        }
                        break;
                    }
                    sf5.D(parcel, iK09);
                    return new mrj(bArr);
                }
                break;
            case 9:
                int iK010 = sf5.k0(parcel);
                int iY6 = 1;
                int iY7 = 1;
                long jA04 = -1;
                long jA05 = -1;
                while (parcel.dataPosition() < iK010) {
                    int i12 = parcel.readInt();
                    char c4 = (char) i12;
                    if (c4 == 1) {
                        iY6 = sf5.Y(parcel, i12);
                    } else if (c4 == 2) {
                        iY7 = sf5.Y(parcel, i12);
                    } else if (c4 == 3) {
                        jA04 = sf5.a0(parcel, i12);
                    } else if (c4 != 4) {
                        sf5.g0(parcel, i12);
                    } else {
                        jA05 = sf5.a0(parcel, i12);
                    }
                }
                sf5.D(parcel, iK010);
                return new qrj(iY6, iY7, jA04, jA05);
            case 10:
                int iK011 = sf5.k0(parcel);
                wvd wvdVar = null;
                yvd yvdVar = null;
                byte[] bArrT5 = null;
                ArrayList arrayListA2 = null;
                Double dValueOf = null;
                ArrayList arrayListA3 = null;
                e71 e71Var = null;
                Integer numZ = null;
                ksh kshVar = null;
                String strX11 = null;
                x61 x61Var = null;
                String strX12 = null;
                ResultReceiver resultReceiver = null;
                while (parcel.dataPosition() < iK011) {
                    int i13 = parcel.readInt();
                    switch ((char) i13) {
                        case 2:
                            wvdVar = (wvd) sf5.v(parcel, i13, wvd.CREATOR);
                            break;
                        case 3:
                            yvdVar = (yvd) sf5.v(parcel, i13, yvd.CREATOR);
                            break;
                        case 4:
                            bArrT5 = sf5.t(parcel, i13);
                            break;
                        case 5:
                            arrayListA2 = sf5.A(parcel, i13, vvd.CREATOR);
                            break;
                        case 6:
                            int iC02 = sf5.c0(parcel, i13);
                            if (iC02 == 0) {
                                dValueOf = null;
                            } else {
                                sf5.m0(parcel, iC02, 8);
                                dValueOf = Double.valueOf(parcel.readDouble());
                            }
                            break;
                        case 7:
                            arrayListA3 = sf5.A(parcel, i13, uvd.CREATOR);
                            break;
                        case '\b':
                            e71Var = (e71) sf5.v(parcel, i13, e71.CREATOR);
                            break;
                        case '\t':
                            numZ = sf5.Z(parcel, i13);
                            break;
                        case '\n':
                            kshVar = (ksh) sf5.v(parcel, i13, ksh.CREATOR);
                            break;
                        case 11:
                            strX11 = sf5.x(parcel, i13);
                            break;
                        case '\f':
                            x61Var = (x61) sf5.v(parcel, i13, x61.CREATOR);
                            break;
                        case '\r':
                            strX12 = sf5.x(parcel, i13);
                            break;
                        case 14:
                            resultReceiver = (ResultReceiver) sf5.v(parcel, i13, ResultReceiver.CREATOR);
                            break;
                        default:
                            sf5.g0(parcel, i13);
                            break;
                    }
                }
                sf5.D(parcel, iK011);
                return new tvd(wvdVar, yvdVar, bArrT5, arrayListA2, dValueOf, arrayListA3, e71Var, numZ, kshVar, strX11, x61Var, strX12, resultReceiver);
            case 11:
                int iK012 = sf5.k0(parcel);
                while (parcel.dataPosition() < iK012) {
                    int i14 = parcel.readInt();
                    if (((char) i14) != 1) {
                        sf5.g0(parcel, i14);
                    } else {
                        bundleS = sf5.s(parcel, i14);
                    }
                }
                sf5.D(parcel, iK012);
                return new lrj(bundleS);
            case 12:
                int iK013 = sf5.k0(parcel);
                String strX13 = null;
                String strX14 = null;
                byte[] bArrT6 = null;
                b71 b71Var = null;
                a71 a71Var = null;
                c71 c71Var = null;
                y61 y61Var = null;
                String strX15 = null;
                while (parcel.dataPosition() < iK013) {
                    int i15 = parcel.readInt();
                    switch ((char) i15) {
                        case 1:
                            strX13 = sf5.x(parcel, i15);
                            break;
                        case 2:
                            strX14 = sf5.x(parcel, i15);
                            break;
                        case 3:
                            bArrT6 = sf5.t(parcel, i15);
                            break;
                        case 4:
                            b71Var = (b71) sf5.v(parcel, i15, b71.CREATOR);
                            break;
                        case 5:
                            a71Var = (a71) sf5.v(parcel, i15, a71.CREATOR);
                            break;
                        case 6:
                            c71Var = (c71) sf5.v(parcel, i15, c71.CREATOR);
                            break;
                        case 7:
                            y61Var = (y61) sf5.v(parcel, i15, y61.CREATOR);
                            break;
                        case '\b':
                            strX15 = sf5.x(parcel, i15);
                            break;
                        case '\t':
                            sf5.x(parcel, i15);
                            break;
                        default:
                            sf5.g0(parcel, i15);
                            break;
                    }
                }
                sf5.D(parcel, iK013);
                return new rvd(strX13, strX14, bArrT6, b71Var, a71Var, c71Var, y61Var, strX15);
            case 13:
                int iK014 = sf5.k0(parcel);
                ArrayList arrayListA4 = null;
                while (parcel.dataPosition() < iK014) {
                    int i16 = parcel.readInt();
                    char c5 = (char) i16;
                    if (c5 == 2) {
                        strX7 = sf5.x(parcel, i16);
                    } else if (c5 != 3) {
                        sf5.g0(parcel, i16);
                    } else {
                        arrayListA4 = sf5.A(parcel, i16, rnk.CREATOR);
                    }
                }
                sf5.D(parcel, iK014);
                return new gsj(strX7, arrayListA4);
            case 14:
                int iK015 = sf5.k0(parcel);
                byte[] bArrT7 = null;
                ArrayList arrayListA5 = null;
                while (parcel.dataPosition() < iK015) {
                    int i17 = parcel.readInt();
                    char c6 = (char) i17;
                    if (c6 == 2) {
                        strX6 = sf5.x(parcel, i17);
                    } else if (c6 == 3) {
                        bArrT7 = sf5.t(parcel, i17);
                    } else if (c6 != 4) {
                        sf5.g0(parcel, i17);
                    } else {
                        arrayListA5 = sf5.A(parcel, i17, Transport.CREATOR);
                    }
                }
                sf5.D(parcel, iK015);
                return new uvd(strX6, bArrT7, arrayListA5);
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                int iK016 = sf5.k0(parcel);
                Integer numZ2 = null;
                while (parcel.dataPosition() < iK016) {
                    int i18 = parcel.readInt();
                    char c7 = (char) i18;
                    if (c7 == 2) {
                        strX5 = sf5.x(parcel, i18);
                    } else if (c7 != 3) {
                        sf5.g0(parcel, i18);
                    } else {
                        numZ2 = sf5.Z(parcel, i18);
                    }
                }
                sf5.D(parcel, iK016);
                return new vvd(strX5, numZ2.intValue());
            case 16:
                int iK017 = sf5.k0(parcel);
                String strX16 = null;
                String strX17 = null;
                while (parcel.dataPosition() < iK017) {
                    int i19 = parcel.readInt();
                    char c8 = (char) i19;
                    if (c8 == 2) {
                        strX4 = sf5.x(parcel, i19);
                    } else if (c8 == 3) {
                        strX16 = sf5.x(parcel, i19);
                    } else if (c8 != 4) {
                        sf5.g0(parcel, i19);
                    } else {
                        strX17 = sf5.x(parcel, i19);
                    }
                }
                sf5.D(parcel, iK017);
                return new wvd(strX4, strX16, strX17);
            case g.MAX_FIELD_NUMBER /* 17 */:
                try {
                    return xvd.a(parcel.readString());
                } catch (PublicKeyCredentialType$UnsupportedPublicKeyCredTypeException e) {
                    xh6.h(e);
                    return null;
                }
            case g.AVG_FIELD_NUMBER /* 18 */:
                int iK018 = sf5.k0(parcel);
                String strX18 = null;
                String strX19 = null;
                String strX20 = null;
                while (parcel.dataPosition() < iK018) {
                    int i20 = parcel.readInt();
                    char c9 = (char) i20;
                    if (c9 == 2) {
                        bArrT = sf5.t(parcel, i20);
                    } else if (c9 == 3) {
                        strX18 = sf5.x(parcel, i20);
                    } else if (c9 == 4) {
                        strX19 = sf5.x(parcel, i20);
                    } else if (c9 != 5) {
                        sf5.g0(parcel, i20);
                    } else {
                        strX20 = sf5.x(parcel, i20);
                    }
                }
                sf5.D(parcel, iK018);
                return new yvd(strX18, strX19, strX20, bArrT);
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                String string = parcel.readString();
                if (string == null) {
                    string = "";
                }
                try {
                    return ome.a(string);
                } catch (ResidentKeyRequirement$UnsupportedResidentKeyRequirementException e2) {
                    xh6.h(e2);
                    return null;
                }
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                int iK019 = sf5.k0(parcel);
                while (parcel.dataPosition() < iK019) {
                    int i21 = parcel.readInt();
                    if (((char) i21) != 1) {
                        sf5.g0(parcel, i21);
                    } else {
                        strX3 = sf5.x(parcel, i21);
                    }
                }
                sf5.D(parcel, iK019);
                return new ktj(strX3);
            case 21:
                try {
                    return jsh.a(parcel.readString());
                } catch (TokenBinding$UnsupportedTokenBindingStatusException e3) {
                    xh6.h(e3);
                    return null;
                }
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                int iK020 = sf5.k0(parcel);
                String strX21 = null;
                while (parcel.dataPosition() < iK020) {
                    int i22 = parcel.readInt();
                    char c10 = (char) i22;
                    if (c10 == 2) {
                        strX2 = sf5.x(parcel, i22);
                    } else if (c10 != 3) {
                        sf5.g0(parcel, i22);
                    } else {
                        strX21 = sf5.x(parcel, i22);
                    }
                }
                sf5.D(parcel, iK020);
                return new ksh(strX2, strX21);
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return new p3k(parcel.readStrongBinder());
            case 24:
                return new bpj((PendingIntent) parcel.readParcelable(gse.class.getClassLoader()), parcel.readInt() != 0);
            case BuildConfig.VERSION_CODE /* 25 */:
                try {
                    return k31.a(parcel.readString());
                } catch (AttestationConveyancePreference$UnsupportedAttestationConveyancePreferenceException e4) {
                    xh6.h(e4);
                    return null;
                }
            case 26:
                int iK021 = sf5.k0(parcel);
                while (parcel.dataPosition() < iK021) {
                    int i23 = parcel.readInt();
                    if (((char) i23) != 1) {
                        sf5.g0(parcel, i23);
                    } else {
                        zT2 = sf5.T(parcel, i23);
                    }
                }
                sf5.D(parcel, iK021);
                return new xoi(zT2);
            case 27:
                try {
                    return yoi.a(parcel.readString());
                } catch (zzbc e5) {
                    xh6.h(e5);
                    return null;
                }
            case 28:
                int iK022 = sf5.k0(parcel);
                while (parcel.dataPosition() < iK022) {
                    int i24 = parcel.readInt();
                    if (((char) i24) != 1) {
                        sf5.g0(parcel, i24);
                    } else {
                        arrayListA = sf5.A(parcel, i24, nqi.CREATOR);
                    }
                }
                sf5.D(parcel, iK022);
                return new mqi(arrayListA);
            default:
                int iK023 = sf5.k0(parcel);
                short s = 0;
                short s2 = 0;
                while (parcel.dataPosition() < iK023) {
                    int i25 = parcel.readInt();
                    char c11 = (char) i25;
                    if (c11 == 1) {
                        iY = sf5.Y(parcel, i25);
                    } else if (c11 == 2) {
                        sf5.l0(parcel, i25, 4);
                        s = (short) parcel.readInt();
                    } else if (c11 != 3) {
                        sf5.g0(parcel, i25);
                    } else {
                        sf5.l0(parcel, i25, 4);
                        s2 = (short) parcel.readInt();
                    }
                }
                sf5.D(parcel, iK023);
                return new nqi(iY, s, s2);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new kqj[i];
            case 1:
                return new v98[i];
            case 2:
                return new jve[i];
            case 3:
                return new LocationResult[i];
            case 4:
                return new nqj[i];
            case 5:
                return new uea[i];
            case 6:
                return new vea[i];
            case 7:
                return new arj[i];
            case 8:
                return new mrj[i];
            case 9:
                return new qrj[i];
            case 10:
                return new tvd[i];
            case 11:
                return new lrj[i];
            case 12:
                return new rvd[i];
            case 13:
                return new gsj[i];
            case 14:
                return new uvd[i];
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return new vvd[i];
            case 16:
                return new wvd[i];
            case g.MAX_FIELD_NUMBER /* 17 */:
                return new xvd[i];
            case g.AVG_FIELD_NUMBER /* 18 */:
                return new yvd[i];
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return new ome[i];
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return new ktj[i];
            case 21:
                return new jsh[i];
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return new ksh[i];
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return new p3k[i];
            case 24:
                return new gse[i];
            case BuildConfig.VERSION_CODE /* 25 */:
                return new k31[i];
            case 26:
                return new xoi[i];
            case 27:
                return new yoi[i];
            case 28:
                return new mqi[i];
            default:
                return new nqi[i];
        }
    }
}
