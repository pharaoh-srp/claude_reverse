package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.health.platform.client.proto.g;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier$UnsupportedAlgorithmIdentifierException;
import com.google.android.gms.fido.fido2.api.common.ErrorCode$UnsupportedErrorCodeException;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.wearable.Term;
import io.sentry.e0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class o1l implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        View view;
        int iY = 0;
        int iY2 = 0;
        boolean zT = false;
        int iY3 = 0;
        switch (this.a) {
            case 0:
                int iK0 = sf5.k0(parcel);
                while (parcel.dataPosition() < iK0) {
                    int i = parcel.readInt();
                    if (((char) i) != 1) {
                        sf5.g0(parcel, i);
                    } else {
                        iY = sf5.Y(parcel, i);
                    }
                }
                sf5.D(parcel, iK0);
                return new km0(iY);
            case 1:
                try {
                    return i42.a(parcel.readInt());
                } catch (COSEAlgorithmIdentifier$UnsupportedAlgorithmIdentifierException e) {
                    xh6.h(e);
                    return null;
                }
            case 2:
                int iK02 = sf5.k0(parcel);
                float fV = 1.0f;
                boolean zT2 = false;
                boolean zT3 = false;
                boolean zT4 = false;
                int iY4 = 0;
                int iY5 = 0;
                float fV2 = 0.5f;
                LatLng latLng = null;
                String strX = null;
                String strX2 = null;
                IBinder iBinderX = null;
                float fV3 = MTTypesetterKt.kLineSkipLimitMultiplier;
                float fV4 = MTTypesetterKt.kLineSkipLimitMultiplier;
                IBinder iBinderX2 = null;
                float fV5 = MTTypesetterKt.kLineSkipLimitMultiplier;
                float fV6 = MTTypesetterKt.kLineSkipLimitMultiplier;
                float fV7 = MTTypesetterKt.kLineSkipLimitMultiplier;
                String strX3 = null;
                float fV8 = MTTypesetterKt.kLineSkipLimitMultiplier;
                while (parcel.dataPosition() < iK02) {
                    int i2 = parcel.readInt();
                    switch ((char) i2) {
                        case 2:
                            latLng = (LatLng) sf5.v(parcel, i2, LatLng.CREATOR);
                            break;
                        case 3:
                            strX = sf5.x(parcel, i2);
                            break;
                        case 4:
                            strX2 = sf5.x(parcel, i2);
                            break;
                        case 5:
                            iBinderX = sf5.X(parcel, i2);
                            break;
                        case 6:
                            fV3 = sf5.V(parcel, i2);
                            break;
                        case 7:
                            fV4 = sf5.V(parcel, i2);
                            break;
                        case '\b':
                            zT2 = sf5.T(parcel, i2);
                            break;
                        case '\t':
                            zT3 = sf5.T(parcel, i2);
                            break;
                        case '\n':
                            zT4 = sf5.T(parcel, i2);
                            break;
                        case 11:
                            fV5 = sf5.V(parcel, i2);
                            break;
                        case '\f':
                            fV2 = sf5.V(parcel, i2);
                            break;
                        case '\r':
                            fV6 = sf5.V(parcel, i2);
                            break;
                        case 14:
                            fV = sf5.V(parcel, i2);
                            break;
                        case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                            fV7 = sf5.V(parcel, i2);
                            break;
                        case 16:
                        default:
                            sf5.g0(parcel, i2);
                            break;
                        case g.MAX_FIELD_NUMBER /* 17 */:
                            iY4 = sf5.Y(parcel, i2);
                            break;
                        case g.AVG_FIELD_NUMBER /* 18 */:
                            iBinderX2 = sf5.X(parcel, i2);
                            break;
                        case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            iY5 = sf5.Y(parcel, i2);
                            break;
                        case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                            strX3 = sf5.x(parcel, i2);
                            break;
                        case 21:
                            fV8 = sf5.V(parcel, i2);
                            break;
                    }
                }
                sf5.D(parcel, iK02);
                nua nuaVar = new nua();
                nuaVar.I = 0.5f;
                nuaVar.J = 1.0f;
                nuaVar.L = true;
                nuaVar.M = false;
                nuaVar.N = MTTypesetterKt.kLineSkipLimitMultiplier;
                nuaVar.O = 0.5f;
                nuaVar.P = MTTypesetterKt.kLineSkipLimitMultiplier;
                nuaVar.Q = 1.0f;
                nuaVar.S = 0;
                nuaVar.E = latLng;
                nuaVar.F = strX;
                nuaVar.G = strX2;
                if (iBinderX == null) {
                    view = null;
                    nuaVar.H = null;
                } else {
                    view = null;
                    nuaVar.H = new sq1(cbc.F(iBinderX));
                }
                nuaVar.I = fV3;
                nuaVar.J = fV4;
                nuaVar.K = zT2;
                nuaVar.L = zT3;
                nuaVar.M = zT4;
                nuaVar.N = fV5;
                nuaVar.O = fV2;
                nuaVar.P = fV6;
                nuaVar.Q = fV;
                nuaVar.R = fV7;
                nuaVar.U = iY5;
                nuaVar.S = iY4;
                lu8 lu8VarF = cbc.F(iBinderX2);
                nuaVar.T = lu8VarF == null ? view : (View) cbc.G(lu8VarF);
                nuaVar.V = strX3;
                nuaVar.W = fV8;
                return nuaVar;
            case 3:
                int iK03 = sf5.k0(parcel);
                hwk hwkVar = null;
                ArrayList arrayListA = null;
                while (parcel.dataPosition() < iK03) {
                    int i3 = parcel.readInt();
                    char c = (char) i3;
                    if (c == 1) {
                        iY3 = sf5.Y(parcel, i3);
                    } else if (c == 2) {
                        arrayListA = sf5.A(parcel, i3, pzk.CREATOR);
                    } else if (c != 3) {
                        sf5.g0(parcel, i3);
                    } else {
                        hwkVar = (hwk) sf5.v(parcel, i3, hwk.CREATOR);
                    }
                }
                sf5.D(parcel, iK03);
                return new p1l(iY3, arrayListA, hwkVar);
            case 4:
                int iK04 = sf5.k0(parcel);
                int iY6 = 0;
                int iY7 = 0;
                boolean zT5 = false;
                String strX4 = null;
                String strX5 = null;
                String strX6 = null;
                while (parcel.dataPosition() < iK04) {
                    int i4 = parcel.readInt();
                    switch ((char) i4) {
                        case 1:
                            iY6 = sf5.Y(parcel, i4);
                            break;
                        case 2:
                            strX4 = sf5.x(parcel, i4);
                            break;
                        case 3:
                            zT5 = sf5.T(parcel, i4);
                            break;
                        case 4:
                            strX5 = sf5.x(parcel, i4);
                            break;
                        case 5:
                            strX6 = sf5.x(parcel, i4);
                            break;
                        case 6:
                            iY7 = sf5.Y(parcel, i4);
                            break;
                        default:
                            sf5.g0(parcel, i4);
                            break;
                    }
                }
                sf5.D(parcel, iK04);
                return new Term(iY6, iY7, strX4, strX5, strX6, zT5);
            case 5:
                int iK05 = sf5.k0(parcel);
                long jA0 = 0;
                byte[] bArrT = null;
                byte[] bArrT2 = null;
                byte[] bArrT3 = null;
                while (parcel.dataPosition() < iK05) {
                    int i5 = parcel.readInt();
                    char c2 = (char) i5;
                    if (c2 == 1) {
                        jA0 = sf5.a0(parcel, i5);
                    } else if (c2 == 2) {
                        bArrT = sf5.t(parcel, i5);
                    } else if (c2 == 3) {
                        bArrT2 = sf5.t(parcel, i5);
                    } else if (c2 != 4) {
                        sf5.g0(parcel, i5);
                    } else {
                        bArrT3 = sf5.t(parcel, i5);
                    }
                }
                sf5.D(parcel, iK05);
                return new q2l(jA0, bArrT, bArrT2, bArrT3);
            case 6:
                int iK06 = sf5.k0(parcel);
                ArrayList arrayListY = null;
                while (parcel.dataPosition() < iK06) {
                    int i6 = parcel.readInt();
                    char c3 = (char) i6;
                    if (c3 == 1) {
                        zT = sf5.T(parcel, i6);
                    } else if (c3 != 2) {
                        sf5.g0(parcel, i6);
                    } else {
                        arrayListY = sf5.y(parcel, i6);
                    }
                }
                sf5.D(parcel, iK06);
                return new l3l(arrayListY, zT);
            case 7:
                int iK07 = sf5.k0(parcel);
                boolean zT6 = false;
                int iY8 = 0;
                int iY9 = 0;
                long jA02 = -1;
                String strX7 = null;
                while (parcel.dataPosition() < iK07) {
                    int i7 = parcel.readInt();
                    char c4 = (char) i7;
                    if (c4 == 1) {
                        zT6 = sf5.T(parcel, i7);
                    } else if (c4 == 2) {
                        strX7 = sf5.x(parcel, i7);
                    } else if (c4 == 3) {
                        iY8 = sf5.Y(parcel, i7);
                    } else if (c4 == 4) {
                        iY9 = sf5.Y(parcel, i7);
                    } else if (c4 != 5) {
                        sf5.g0(parcel, i7);
                    } else {
                        jA02 = sf5.a0(parcel, i7);
                    }
                }
                sf5.D(parcel, iK07);
                return new o3l(zT6, strX7, iY8, iY9, jA02);
            case 8:
                int iK08 = sf5.k0(parcel);
                String strX8 = null;
                String strX9 = null;
                LatLng latLng2 = null;
                while (parcel.dataPosition() < iK08) {
                    int i8 = parcel.readInt();
                    char c5 = (char) i8;
                    if (c5 == 2) {
                        latLng2 = (LatLng) sf5.v(parcel, i8, LatLng.CREATOR);
                    } else if (c5 == 3) {
                        strX8 = sf5.x(parcel, i8);
                    } else if (c5 != 4) {
                        sf5.g0(parcel, i8);
                    } else {
                        strX9 = sf5.x(parcel, i8);
                    }
                }
                sf5.D(parcel, iK08);
                return new r7d(latLng2, strX8, strX9);
            case 9:
                int iK09 = sf5.k0(parcel);
                ArrayList arrayListA2 = null;
                while (parcel.dataPosition() < iK09) {
                    int i9 = parcel.readInt();
                    if (((char) i9) != 1) {
                        sf5.g0(parcel, i9);
                    } else {
                        arrayListA2 = sf5.A(parcel, i9, q2l.CREATOR);
                    }
                }
                sf5.D(parcel, iK09);
                return new m4l(arrayListA2);
            case 10:
                int iK010 = sf5.k0(parcel);
                while (parcel.dataPosition() < iK010) {
                    int i10 = parcel.readInt();
                    if (((char) i10) != 1) {
                        sf5.g0(parcel, i10);
                    } else {
                        sf5.T(parcel, i10);
                    }
                }
                sf5.D(parcel, iK010);
                return new b5l();
            case 11:
                int iK011 = sf5.k0(parcel);
                boolean zT7 = false;
                while (parcel.dataPosition() < iK011) {
                    int i11 = parcel.readInt();
                    char c6 = (char) i11;
                    if (c6 == 1) {
                        iY2 = sf5.Y(parcel, i11);
                    } else if (c6 != 2) {
                        sf5.g0(parcel, i11);
                    } else {
                        zT7 = sf5.T(parcel, i11);
                    }
                }
                sf5.D(parcel, iK011);
                return new z4l(iY2, zT7);
            case 12:
                try {
                    return wr6.a(parcel.readInt());
                } catch (ErrorCode$UnsupportedErrorCodeException e2) {
                    e0.i(e2);
                    return null;
                }
            default:
                int iK012 = sf5.k0(parcel);
                String strX10 = null;
                while (parcel.dataPosition() < iK012) {
                    int i12 = parcel.readInt();
                    if (((char) i12) != 2) {
                        sf5.g0(parcel, i12);
                    } else {
                        strX10 = sf5.x(parcel, i12);
                    }
                }
                sf5.D(parcel, iK012);
                return new kh7(strX10);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new km0[i];
            case 1:
                return new i42[i];
            case 2:
                return new nua[i];
            case 3:
                return new p1l[i];
            case 4:
                return new Term[i];
            case 5:
                return new q2l[i];
            case 6:
                return new l3l[i];
            case 7:
                return new o3l[i];
            case 8:
                return new r7d[i];
            case 9:
                return new m4l[i];
            case 10:
                return new b5l[i];
            case 11:
                return new z4l[i];
            case 12:
                return new wr6[i];
            default:
                return new kh7[i];
        }
    }
}
