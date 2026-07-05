package defpackage;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.os.SharedMemory;
import androidx.health.platform.client.permission.Permission;
import androidx.health.platform.client.proto.g;
import androidx.health.platform.client.proto.r;
import androidx.health.platform.client.proto.u;
import androidx.health.platform.client.proto.v;
import androidx.health.platform.client.proto.x;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import java.io.Closeable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final class s38 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ s38(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean zT = false;
        int iY = 0;
        boolean zT2 = false;
        int iY2 = 0;
        int iY3 = 0;
        ArrayList arrayListA = null;
        ArrayList arrayListA2 = null;
        Intent intent = null;
        PendingIntent pendingIntent = null;
        String strX = null;
        Bundle bundleS = null;
        String strX2 = null;
        Bundle bundleS2 = null;
        PendingIntent pendingIntent2 = null;
        PendingIntent pendingIntent3 = null;
        Bundle bundleS3 = null;
        Bundle bundleS4 = null;
        Bundle bundleS5 = null;
        k95 k95Var = null;
        switch (this.a) {
            case 0:
                int iK0 = sf5.k0(parcel);
                Bundle bundleS6 = null;
                String strX3 = null;
                ResultReceiver resultReceiver = null;
                while (parcel.dataPosition() < iK0) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c == 1) {
                        arrayListA = sf5.A(parcel, i, o95.CREATOR);
                    } else if (c == 2) {
                        bundleS6 = sf5.s(parcel, i);
                    } else if (c == 3) {
                        strX3 = sf5.x(parcel, i);
                    } else if (c != 4) {
                        sf5.g0(parcel, i);
                    } else {
                        resultReceiver = (ResultReceiver) sf5.v(parcel, i, ResultReceiver.CREATOR);
                    }
                }
                sf5.D(parcel, iK0);
                return new GetCredentialRequest(arrayListA, bundleS6, strX3, resultReceiver);
            case 1:
                int iK02 = sf5.k0(parcel);
                while (parcel.dataPosition() < iK02) {
                    int i2 = parcel.readInt();
                    if (((char) i2) != 1) {
                        sf5.g0(parcel, i2);
                    } else {
                        k95Var = (k95) sf5.v(parcel, i2, k95.CREATOR);
                    }
                }
                sf5.D(parcel, iK02);
                return new t38(k95Var);
            case 2:
                int iK03 = sf5.k0(parcel);
                while (parcel.dataPosition() < iK03) {
                    int i3 = parcel.readInt();
                    if (((char) i3) != 1) {
                        sf5.g0(parcel, i3);
                    } else {
                        bundleS5 = sf5.s(parcel, i3);
                    }
                }
                sf5.D(parcel, iK03);
                return new e48(bundleS5);
            case 3:
                int iK04 = sf5.k0(parcel);
                while (parcel.dataPosition() < iK04) {
                    int i4 = parcel.readInt();
                    if (((char) i4) != 1) {
                        sf5.g0(parcel, i4);
                    } else {
                        bundleS4 = sf5.s(parcel, i4);
                    }
                }
                sf5.D(parcel, iK04);
                return new f48(bundleS4);
            case 4:
                int iK05 = sf5.k0(parcel);
                while (parcel.dataPosition() < iK05) {
                    int i5 = parcel.readInt();
                    if (((char) i5) != 1) {
                        sf5.g0(parcel, i5);
                    } else {
                        bundleS3 = sf5.s(parcel, i5);
                    }
                }
                sf5.D(parcel, iK05);
                return new uz8(bundleS3);
            case 5:
                parcel.getClass();
                Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                parcelable.getClass();
                return new u79((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 6:
                yva yvaVar = new yva(parcel);
                yvaVar.E = ((Integer) parcel.readValue(yva.class.getClassLoader())).intValue();
                return yvaVar;
            case 7:
                String string = parcel.readString();
                string.getClass();
                int i6 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i6);
                for (int i7 = 0; i7 < i6; i7++) {
                    String string2 = parcel.readString();
                    string2.getClass();
                    String string3 = parcel.readString();
                    string3.getClass();
                    linkedHashMap.put(string2, string3);
                }
                return new nab(string, linkedHashMap);
            case 8:
                j0c j0cVar = new j0c(parcel);
                j0cVar.E = parcel.readInt();
                return j0cVar;
            case 9:
                return new ParcelImpl(parcel);
            case 10:
                int iK06 = sf5.k0(parcel);
                while (parcel.dataPosition() < iK06) {
                    int i8 = parcel.readInt();
                    if (((char) i8) != 1) {
                        sf5.g0(parcel, i8);
                    } else {
                        pendingIntent3 = (PendingIntent) sf5.v(parcel, i8, PendingIntent.CREATOR);
                    }
                }
                sf5.D(parcel, iK06);
                return new gwc(pendingIntent3);
            case 11:
                int iK07 = sf5.k0(parcel);
                while (parcel.dataPosition() < iK07) {
                    int i9 = parcel.readInt();
                    if (((char) i9) != 1) {
                        sf5.g0(parcel, i9);
                    } else {
                        pendingIntent2 = (PendingIntent) sf5.v(parcel, i9, PendingIntent.CREATOR);
                    }
                }
                sf5.D(parcel, iK07);
                return new hwc(pendingIntent2);
            case 12:
                parcel.getClass();
                int i10 = parcel.readInt();
                if (i10 == 0) {
                    byte[] bArrCreateByteArray = parcel.createByteArray();
                    if (bArrCreateByteArray == null) {
                        return null;
                    }
                    r rVarS = r.s(bArrCreateByteArray);
                    rVarS.getClass();
                    return new Permission(rVarS);
                }
                if (i10 != 1) {
                    sz6.p(grc.p(i10, "Unknown storage: "));
                    return null;
                }
                Closeable closeable = (Closeable) SharedMemory.CREATOR.createFromParcel(parcel);
                try {
                    ByteBuffer byteBufferMapReadOnly = u2g.d(closeable).mapReadOnly();
                    byteBufferMapReadOnly.getClass();
                    byte[] bArr = new byte[byteBufferMapReadOnly.remaining()];
                    byteBufferMapReadOnly.get(bArr);
                    r rVarS2 = r.s(bArr);
                    rVarS2.getClass();
                    Permission permission = new Permission(rVarS2);
                    wd6.Z(closeable, null);
                    return permission;
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            case 13:
                parcel.getClass();
                return new o0e(parcel);
            case 14:
                parcel.getClass();
                int i11 = parcel.readInt();
                if (i11 == 0) {
                    byte[] bArrCreateByteArray2 = parcel.createByteArray();
                    if (bArrCreateByteArray2 == null) {
                        return null;
                    }
                    u uVarW = u.w(bArrCreateByteArray2);
                    uVarW.getClass();
                    return new c3e(uVarW);
                }
                if (i11 != 1) {
                    sz6.p(grc.p(i11, "Unknown storage: "));
                    return null;
                }
                Closeable closeable2 = (Closeable) SharedMemory.CREATOR.createFromParcel(parcel);
                try {
                    ByteBuffer byteBufferMapReadOnly2 = u2g.d(closeable2).mapReadOnly();
                    byteBufferMapReadOnly2.getClass();
                    byte[] bArr2 = new byte[byteBufferMapReadOnly2.remaining()];
                    byteBufferMapReadOnly2.get(bArr2);
                    u uVarW2 = u.w(bArr2);
                    uVarW2.getClass();
                    c3e c3eVar = new c3e(uVarW2);
                    wd6.Z(closeable2, null);
                    return c3eVar;
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                parcel.getClass();
                int i12 = parcel.readInt();
                if (i12 == 0) {
                    byte[] bArrCreateByteArray3 = parcel.createByteArray();
                    if (bArrCreateByteArray3 == null) {
                        return null;
                    }
                    x xVarR = x.r(bArrCreateByteArray3);
                    xVarR.getClass();
                    return new d3e(xVarR);
                }
                if (i12 != 1) {
                    sz6.p(grc.p(i12, "Unknown storage: "));
                    return null;
                }
                Closeable closeable3 = (Closeable) SharedMemory.CREATOR.createFromParcel(parcel);
                try {
                    ByteBuffer byteBufferMapReadOnly3 = u2g.d(closeable3).mapReadOnly();
                    byteBufferMapReadOnly3.getClass();
                    byte[] bArr3 = new byte[byteBufferMapReadOnly3.remaining()];
                    byteBufferMapReadOnly3.get(bArr3);
                    x xVarR2 = x.r(bArr3);
                    xVarR2.getClass();
                    d3e d3eVar = new d3e(xVarR2);
                    wd6.Z(closeable3, null);
                    return d3eVar;
                } finally {
                }
            case 16:
                int iK08 = sf5.k0(parcel);
                while (parcel.dataPosition() < iK08) {
                    sf5.g0(parcel, parcel.readInt());
                }
                sf5.D(parcel, iK08);
                return new qde();
            case g.MAX_FIELD_NUMBER /* 17 */:
                int iK09 = sf5.k0(parcel);
                while (parcel.dataPosition() < iK09) {
                    sf5.g0(parcel, parcel.readInt());
                }
                sf5.D(parcel, iK09);
                return new rde();
            case g.AVG_FIELD_NUMBER /* 18 */:
                int iK010 = sf5.k0(parcel);
                while (parcel.dataPosition() < iK010) {
                    sf5.g0(parcel, parcel.readInt());
                }
                sf5.D(parcel, iK010);
                return new sde();
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                int iK011 = sf5.k0(parcel);
                while (parcel.dataPosition() < iK011) {
                    int i13 = parcel.readInt();
                    if (((char) i13) != 2) {
                        sf5.g0(parcel, i13);
                    } else {
                        bundleS2 = sf5.s(parcel, i13);
                    }
                }
                sf5.D(parcel, iK011);
                return new cfe(bundleS2);
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                parcel.getClass();
                int i14 = parcel.readInt();
                if (i14 == 0) {
                    byte[] bArrCreateByteArray4 = parcel.createByteArray();
                    if (bArrCreateByteArray4 == null) {
                        return null;
                    }
                    v vVarY = v.y(bArrCreateByteArray4);
                    String strT = vVarY.t();
                    strT.getClass();
                    return new aje(strT, vVarY.v(), vVarY.w(), vVarY.u());
                }
                if (i14 != 1) {
                    sz6.p(grc.p(i14, "Unknown storage: "));
                    return null;
                }
                Closeable closeable4 = (Closeable) SharedMemory.CREATOR.createFromParcel(parcel);
                try {
                    ByteBuffer byteBufferMapReadOnly4 = u2g.d(closeable4).mapReadOnly();
                    byteBufferMapReadOnly4.getClass();
                    byte[] bArr4 = new byte[byteBufferMapReadOnly4.remaining()];
                    byteBufferMapReadOnly4.get(bArr4);
                    v vVarY2 = v.y(bArr4);
                    String strT2 = vVarY2.t();
                    strT2.getClass();
                    aje ajeVar = new aje(strT2, vVarY2.v(), vVarY2.w(), vVarY2.u());
                    wd6.Z(closeable4, null);
                    return ajeVar;
                } finally {
                }
            case 21:
                int iK012 = sf5.k0(parcel);
                String strX4 = null;
                Bundle bundleS7 = null;
                while (parcel.dataPosition() < iK012) {
                    int i15 = parcel.readInt();
                    char c2 = (char) i15;
                    if (c2 == 1) {
                        strX2 = sf5.x(parcel, i15);
                    } else if (c2 == 2) {
                        strX4 = sf5.x(parcel, i15);
                    } else if (c2 != 3) {
                        sf5.g0(parcel, i15);
                    } else {
                        bundleS7 = sf5.s(parcel, i15);
                    }
                }
                sf5.D(parcel, iK012);
                return new o6g(strX2, strX4, bundleS7);
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                int iK013 = sf5.k0(parcel);
                while (parcel.dataPosition() < iK013) {
                    sf5.g0(parcel, parcel.readInt());
                }
                sf5.D(parcel, iK013);
                return new q6g();
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                int iK014 = sf5.k0(parcel);
                int iY4 = 0;
                while (parcel.dataPosition() < iK014) {
                    int i16 = parcel.readInt();
                    char c3 = (char) i16;
                    if (c3 == 1) {
                        iY3 = sf5.Y(parcel, i16);
                    } else if (c3 == 2) {
                        iY4 = sf5.Y(parcel, i16);
                    } else if (c3 != 3) {
                        sf5.g0(parcel, i16);
                    } else {
                        bundleS = sf5.s(parcel, i16);
                    }
                }
                sf5.D(parcel, iK014);
                return new t98(iY3, iY4, bundleS);
            case 24:
                int iK015 = sf5.k0(parcel);
                while (parcel.dataPosition() < iK015) {
                    int i17 = parcel.readInt();
                    char c4 = (char) i17;
                    if (c4 == 1) {
                        iY2 = sf5.Y(parcel, i17);
                    } else if (c4 != 2) {
                        sf5.g0(parcel, i17);
                    } else {
                        strX = sf5.x(parcel, i17);
                    }
                }
                sf5.D(parcel, iK015);
                return new wo3(iY2, strX);
            case BuildConfig.VERSION_CODE /* 25 */:
                int iK016 = sf5.k0(parcel);
                int iY5 = 0;
                while (parcel.dataPosition() < iK016) {
                    int i18 = parcel.readInt();
                    char c5 = (char) i18;
                    if (c5 == 1) {
                        zT2 = sf5.T(parcel, i18);
                    } else if (c5 != 2) {
                        sf5.g0(parcel, i18);
                    } else {
                        iY5 = sf5.Y(parcel, i18);
                    }
                }
                sf5.D(parcel, iK016);
                return new pqb(zT2, iY5);
            case 26:
                int iK017 = sf5.k0(parcel);
                while (parcel.dataPosition() < iK017) {
                    int i19 = parcel.readInt();
                    if (((char) i19) != 1) {
                        sf5.g0(parcel, i19);
                    } else {
                        pendingIntent = (PendingIntent) sf5.v(parcel, i19, PendingIntent.CREATOR);
                    }
                }
                sf5.D(parcel, iK017);
                return new vqb(pendingIntent);
            case 27:
                int iK018 = sf5.k0(parcel);
                int iY6 = 0;
                while (parcel.dataPosition() < iK018) {
                    int i20 = parcel.readInt();
                    char c6 = (char) i20;
                    if (c6 == 1) {
                        iY = sf5.Y(parcel, i20);
                    } else if (c6 == 2) {
                        iY6 = sf5.Y(parcel, i20);
                    } else if (c6 != 3) {
                        sf5.g0(parcel, i20);
                    } else {
                        intent = (Intent) sf5.v(parcel, i20, Intent.CREATOR);
                    }
                }
                sf5.D(parcel, iK018);
                return new emj(iY, iY6, intent);
            case 28:
                int iK019 = sf5.k0(parcel);
                long jA0 = 0;
                int iY7 = 0;
                String strX5 = null;
                String strX6 = null;
                String strX7 = null;
                String strX8 = null;
                Uri uri = null;
                String strX9 = null;
                String strX10 = null;
                ArrayList arrayListA3 = null;
                String strX11 = null;
                String strX12 = null;
                while (parcel.dataPosition() < iK019) {
                    int i21 = parcel.readInt();
                    switch ((char) i21) {
                        case 1:
                            iY7 = sf5.Y(parcel, i21);
                            break;
                        case 2:
                            strX5 = sf5.x(parcel, i21);
                            break;
                        case 3:
                            strX6 = sf5.x(parcel, i21);
                            break;
                        case 4:
                            strX7 = sf5.x(parcel, i21);
                            break;
                        case 5:
                            strX8 = sf5.x(parcel, i21);
                            break;
                        case 6:
                            uri = (Uri) sf5.v(parcel, i21, Uri.CREATOR);
                            break;
                        case 7:
                            strX9 = sf5.x(parcel, i21);
                            break;
                        case '\b':
                            jA0 = sf5.a0(parcel, i21);
                            break;
                        case '\t':
                            strX10 = sf5.x(parcel, i21);
                            break;
                        case '\n':
                            arrayListA3 = sf5.A(parcel, i21, Scope.CREATOR);
                            break;
                        case 11:
                            strX11 = sf5.x(parcel, i21);
                            break;
                        case '\f':
                            strX12 = sf5.x(parcel, i21);
                            break;
                        default:
                            sf5.g0(parcel, i21);
                            break;
                    }
                }
                sf5.D(parcel, iK019);
                return new GoogleSignInAccount(iY7, strX5, strX6, strX7, strX8, uri, strX9, jA0, strX10, arrayListA3, strX11, strX12);
            default:
                int iK020 = sf5.k0(parcel);
                String strX13 = null;
                String strX14 = null;
                while (parcel.dataPosition() < iK020) {
                    int i22 = parcel.readInt();
                    char c7 = (char) i22;
                    if (c7 == 1) {
                        arrayListA2 = sf5.A(parcel, i22, jf7.CREATOR);
                    } else if (c7 == 2) {
                        zT = sf5.T(parcel, i22);
                    } else if (c7 == 3) {
                        strX13 = sf5.x(parcel, i22);
                    } else if (c7 != 4) {
                        sf5.g0(parcel, i22);
                    } else {
                        strX14 = sf5.x(parcel, i22);
                    }
                }
                sf5.D(parcel, iK020);
                return new df0(strX13, strX14, arrayListA2, zT);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new GetCredentialRequest[i];
            case 1:
                return new t38[i];
            case 2:
                return new e48[i];
            case 3:
                return new f48[i];
            case 4:
                return new uz8[i];
            case 5:
                return new u79[i];
            case 6:
                return new yva[i];
            case 7:
                return new nab[i];
            case 8:
                return new j0c[i];
            case 9:
                return new ParcelImpl[i];
            case 10:
                return new gwc[i];
            case 11:
                return new hwc[i];
            case 12:
                return new Permission[i];
            case 13:
                return new o0e[i];
            case 14:
                return new c3e[i];
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return new d3e[i];
            case 16:
                return new qde[i];
            case g.MAX_FIELD_NUMBER /* 17 */:
                return new rde[i];
            case g.AVG_FIELD_NUMBER /* 18 */:
                return new sde[i];
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return new cfe[i];
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return new aje[i];
            case 21:
                return new o6g[i];
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return new q6g[i];
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return new t98[i];
            case 24:
                return new wo3[i];
            case BuildConfig.VERSION_CODE /* 25 */:
                return new pqb[i];
            case 26:
                return new vqb[i];
            case 27:
                return new emj[i];
            case 28:
                return new GoogleSignInAccount[i];
            default:
                return new df0[i];
        }
    }
}
