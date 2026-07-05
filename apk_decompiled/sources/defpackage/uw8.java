package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import androidx.health.platform.client.proto.g;
import com.google.android.gms.maps.model.LatLng;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class uw8 implements pz7 {
    public final /* synthetic */ int E;

    public /* synthetic */ uw8(int i) {
        this.E = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = null;
        iei ieiVar2 = iei.a;
        switch (i) {
            case 0:
                ((uk6) obj).a = (q68) obj2;
                break;
            case 1:
                ((io4) obj2).getClass();
                ((uk6) obj).e = 1;
                break;
            case 2:
                e54 e54Var = (e54) obj2;
                ((uk6) obj).c = e54Var != null ? e54Var.a : null;
                break;
            case 3:
                ((uk6) obj).d = (Float) obj2;
                break;
            case 4:
                ((Integer) obj2).getClass();
                jvk.g(x44.p0(1), (ld4) obj);
                break;
            case 5:
                fcc fccVar = (fcc) obj2;
                ((y4f) obj).getClass();
                long j = fccVar.a;
                if ((9223372034707292159L & j) == 9205357640488583168L) {
                }
                break;
            case 6:
                ((Integer) obj2).intValue();
                break;
            case 7:
                lx9 lx9Var = (lx9) obj2;
                break;
            case 8:
                ((Integer) obj2).getClass();
                dxj.b(x44.p0(1), (ld4) obj);
                break;
            case 9:
                ((Integer) obj2).getClass();
                kzj.a(x44.p0(1), (ld4) obj);
                break;
            case 10:
                ((Integer) obj2).getClass();
                rkk.c(x44.p0(1), (ld4) obj);
                break;
            case 11:
                mua muaVar = (mua) obj;
                float fFloatValue = ((Float) obj2).floatValue();
                muaVar.getClass();
                try {
                    tqj tqjVar = (tqj) muaVar.b.a;
                    Parcel parcelH = tqjVar.H();
                    parcelH.writeFloat(fFloatValue);
                    tqjVar.L(parcelH, 25);
                } catch (RemoteException e) {
                    poc.q(e);
                    return null;
                }
                break;
            case 12:
                mua muaVar2 = (mua) obj;
                fcc fccVar2 = (fcc) obj2;
                muaVar2.getClass();
                fua fuaVar = muaVar2.b;
                float f = fcc.f(fccVar2.a);
                float fG = fcc.g(fccVar2.a);
                try {
                    tqj tqjVar2 = (tqj) fuaVar.a;
                    Parcel parcelH2 = tqjVar2.H();
                    parcelH2.writeFloat(f);
                    parcelH2.writeFloat(fG);
                    tqjVar2.L(parcelH2, 19);
                } catch (RemoteException e2) {
                    poc.q(e2);
                    return null;
                }
                break;
            case 13:
                mua muaVar3 = (mua) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                muaVar3.getClass();
                try {
                    tqj tqjVar3 = (tqj) muaVar3.b.a;
                    Parcel parcelH3 = tqjVar3.H();
                    int i2 = gyj.a;
                    parcelH3.writeInt(zBooleanValue ? 1 : 0);
                    tqjVar3.L(parcelH3, 9);
                } catch (RemoteException e3) {
                    poc.q(e3);
                    return null;
                }
                break;
            case 14:
                mua muaVar4 = (mua) obj;
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                muaVar4.getClass();
                try {
                    tqj tqjVar4 = (tqj) muaVar4.b.a;
                    Parcel parcelH4 = tqjVar4.H();
                    int i3 = gyj.a;
                    parcelH4.writeInt(zBooleanValue2 ? 1 : 0);
                    tqjVar4.L(parcelH4, 20);
                } catch (RemoteException e4) {
                    poc.q(e4);
                    return null;
                }
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                mua muaVar5 = (mua) obj;
                sq1 sq1Var = (sq1) obj2;
                muaVar5.getClass();
                crj crjVar = muaVar5.b.a;
                try {
                    if (sq1Var == null) {
                        tqj tqjVar5 = (tqj) crjVar;
                        Parcel parcelH5 = tqjVar5.H();
                        gyj.d(parcelH5, null);
                        tqjVar5.L(parcelH5, 18);
                    } else {
                        lu8 lu8Var = sq1Var.a;
                        tqj tqjVar6 = (tqj) crjVar;
                        Parcel parcelH6 = tqjVar6.H();
                        gyj.d(parcelH6, lu8Var);
                        tqjVar6.L(parcelH6, 18);
                    }
                    ieiVar = ieiVar2;
                } catch (RemoteException e5) {
                    poc.q(e5);
                    return ieiVar;
                }
                break;
            case 16:
                mua muaVar6 = (mua) obj;
                fcc fccVar3 = (fcc) obj2;
                muaVar6.getClass();
                fua fuaVar2 = muaVar6.b;
                float f2 = fcc.f(fccVar3.a);
                float fG2 = fcc.g(fccVar3.a);
                try {
                    tqj tqjVar7 = (tqj) fuaVar2.a;
                    Parcel parcelH7 = tqjVar7.H();
                    parcelH7.writeFloat(f2);
                    parcelH7.writeFloat(fG2);
                    tqjVar7.L(parcelH7, 24);
                } catch (RemoteException e6) {
                    poc.q(e6);
                    return null;
                }
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                mua muaVar7 = (mua) obj;
                LatLng latLng = (LatLng) obj2;
                muaVar7.getClass();
                latLng.getClass();
                try {
                    tqj tqjVar8 = (tqj) muaVar7.b.a;
                    Parcel parcelH8 = tqjVar8.H();
                    gyj.c(parcelH8, latLng);
                    tqjVar8.L(parcelH8, 3);
                } catch (RemoteException e7) {
                    poc.q(e7);
                    return null;
                }
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                mua muaVar8 = (mua) obj;
                float fFloatValue2 = ((Float) obj2).floatValue();
                muaVar8.getClass();
                try {
                    tqj tqjVar9 = (tqj) muaVar8.b.a;
                    Parcel parcelH9 = tqjVar9.H();
                    parcelH9.writeFloat(fFloatValue2);
                    tqjVar9.L(parcelH9, 22);
                } catch (RemoteException e8) {
                    poc.q(e8);
                    return null;
                }
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                mua muaVar9 = (mua) obj;
                String str = (String) obj2;
                muaVar9.getClass();
                fua fuaVar3 = muaVar9.b;
                try {
                    tqj tqjVar10 = (tqj) fuaVar3.a;
                    Parcel parcelH10 = tqjVar10.H();
                    parcelH10.writeString(str);
                    tqjVar10.L(parcelH10, 7);
                    if (fuaVar3.b()) {
                        fuaVar3.d();
                    }
                } catch (RemoteException e9) {
                    poc.q(e9);
                    return null;
                }
                break;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                mua muaVar10 = (mua) obj;
                muaVar10.getClass();
                muaVar10.b.c(obj2);
                break;
            case 21:
                mua muaVar11 = (mua) obj;
                String str2 = (String) obj2;
                muaVar11.getClass();
                fua fuaVar4 = muaVar11.b;
                try {
                    tqj tqjVar11 = (tqj) fuaVar4.a;
                    Parcel parcelH11 = tqjVar11.H();
                    parcelH11.writeString(str2);
                    tqjVar11.L(parcelH11, 5);
                    if (fuaVar4.b()) {
                        fuaVar4.d();
                    }
                } catch (RemoteException e10) {
                    poc.q(e10);
                    return null;
                }
                break;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                mua muaVar12 = (mua) obj;
                boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                muaVar12.getClass();
                try {
                    tqj tqjVar12 = (tqj) muaVar12.b.a;
                    Parcel parcelH12 = tqjVar12.H();
                    int i4 = gyj.a;
                    parcelH12.writeInt(zBooleanValue3 ? 1 : 0);
                    tqjVar12.L(parcelH12, 14);
                } catch (RemoteException e11) {
                    poc.q(e11);
                    return null;
                }
                break;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                mua muaVar13 = (mua) obj;
                float fFloatValue3 = ((Float) obj2).floatValue();
                muaVar13.getClass();
                try {
                    tqj tqjVar13 = (tqj) muaVar13.b.a;
                    Parcel parcelH13 = tqjVar13.H();
                    parcelH13.writeFloat(fFloatValue3);
                    tqjVar13.L(parcelH13, 27);
                } catch (RemoteException e12) {
                    poc.q(e12);
                    return null;
                }
                break;
            case 24:
                mua muaVar14 = (mua) obj;
                bz7 bz7Var = (bz7) obj2;
                muaVar14.getClass();
                bz7Var.getClass();
                muaVar14.d = bz7Var;
                break;
            case BuildConfig.VERSION_CODE /* 25 */:
                mua muaVar15 = (mua) obj;
                bz7 bz7Var2 = (bz7) obj2;
                muaVar15.getClass();
                bz7Var2.getClass();
                muaVar15.e = bz7Var2;
                break;
            case 26:
                mua muaVar16 = (mua) obj;
                bz7 bz7Var3 = (bz7) obj2;
                muaVar16.getClass();
                bz7Var3.getClass();
                muaVar16.f = bz7Var3;
                break;
            case 27:
                mua muaVar17 = (mua) obj;
                bz7 bz7Var4 = (bz7) obj2;
                muaVar17.getClass();
                bz7Var4.getClass();
                muaVar17.g = bz7Var4;
                break;
            case 28:
                mua muaVar18 = (mua) obj;
                muaVar18.getClass();
                muaVar18.i = (rz7) obj2;
                break;
            default:
                mua muaVar19 = (mua) obj;
                muaVar19.getClass();
                muaVar19.h = (rz7) obj2;
                break;
        }
        return ieiVar2;
    }

    public /* synthetic */ uw8(int i, int i2) {
        this.E = i2;
    }
}
