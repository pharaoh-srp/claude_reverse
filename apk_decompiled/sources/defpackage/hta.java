package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import androidx.health.platform.client.proto.g;
import com.google.android.gms.maps.model.LatLngBounds;

/* JADX INFO: loaded from: classes3.dex */
public final class hta implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ n88 F;

    public /* synthetic */ hta(n88 n88Var, int i) {
        this.E = i;
        this.F = n88Var;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        n88 n88Var = this.F;
        switch (i) {
            case 0:
                LatLngBounds latLngBounds = (LatLngBounds) obj2;
                ((bta) obj).getClass();
                n88Var.getClass();
                try {
                    hfk hfkVar = n88Var.a;
                    Parcel parcelH = hfkVar.H();
                    gyj.c(parcelH, latLngBounds);
                    hfkVar.L(parcelH, 95);
                } catch (RemoteException e) {
                    poc.q(e);
                    return null;
                }
                break;
            case 1:
                cta ctaVar = (cta) obj2;
                ((bta) obj).getClass();
                n88Var.getClass();
                try {
                    hfk hfkVar2 = n88Var.a;
                    Parcel parcelH2 = hfkVar2.H();
                    gyj.c(parcelH2, ctaVar);
                    Parcel parcelF = hfkVar2.F(parcelH2, 91);
                    parcelF.readInt();
                    parcelF.recycle();
                } catch (RemoteException e2) {
                    poc.q(e2);
                    return null;
                }
                break;
            case 2:
                eta etaVar = (eta) obj2;
                ((bta) obj).getClass();
                etaVar.getClass();
                int i2 = etaVar.E;
                n88Var.getClass();
                try {
                    hfk hfkVar3 = n88Var.a;
                    Parcel parcelH3 = hfkVar3.H();
                    parcelH3.writeInt(i2);
                    hfkVar3.L(parcelH3, 16);
                } catch (RemoteException e3) {
                    poc.q(e3);
                    return null;
                }
                break;
            case 3:
                float fFloatValue = ((Number) obj2).floatValue();
                ((bta) obj).getClass();
                n88Var.getClass();
                try {
                    hfk hfkVar4 = n88Var.a;
                    Parcel parcelH4 = hfkVar4.H();
                    parcelH4.writeFloat(fFloatValue);
                    hfkVar4.L(parcelH4, 93);
                } catch (RemoteException e4) {
                    poc.q(e4);
                    return null;
                }
                break;
            case 4:
                float fFloatValue2 = ((Number) obj2).floatValue();
                ((bta) obj).getClass();
                n88Var.getClass();
                try {
                    hfk hfkVar5 = n88Var.a;
                    Parcel parcelH5 = hfkVar5.H();
                    parcelH5.writeFloat(fFloatValue2);
                    hfkVar5.L(parcelH5, 92);
                } catch (RemoteException e5) {
                    poc.q(e5);
                    return null;
                }
                break;
            case 5:
                Integer num = (Integer) obj2;
                ((bta) obj).getClass();
                if (num != null) {
                    int iIntValue = num.intValue();
                    n88Var.getClass();
                    try {
                        hfk hfkVar6 = n88Var.a;
                        Parcel parcelH6 = hfkVar6.H();
                        parcelH6.writeInt(iIntValue);
                        hfkVar6.L(parcelH6, 113);
                    } catch (RemoteException e6) {
                        poc.q(e6);
                        return null;
                    }
                }
                break;
            case 6:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                ((bta) obj).getClass();
                fnf fnfVarB = n88Var.b();
                fnfVarB.getClass();
                try {
                    gzj gzjVar = (gzj) fnfVarB.F;
                    Parcel parcelH7 = gzjVar.H();
                    int i3 = gyj.a;
                    parcelH7.writeInt(zBooleanValue ? 1 : 0);
                    gzjVar.L(parcelH7, 2);
                } catch (RemoteException e7) {
                    poc.q(e7);
                    return null;
                }
                break;
            case 7:
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                ((bta) obj).getClass();
                fnf fnfVarB2 = n88Var.b();
                fnfVarB2.getClass();
                try {
                    gzj gzjVar2 = (gzj) fnfVarB2.F;
                    Parcel parcelH8 = gzjVar2.H();
                    int i4 = gyj.a;
                    parcelH8.writeInt(zBooleanValue2 ? 1 : 0);
                    gzjVar2.L(parcelH8, 16);
                } catch (RemoteException e8) {
                    poc.q(e8);
                    return null;
                }
                break;
            case 8:
                boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                ((bta) obj).getClass();
                fnf fnfVarB3 = n88Var.b();
                fnfVarB3.getClass();
                try {
                    gzj gzjVar3 = (gzj) fnfVarB3.F;
                    Parcel parcelH9 = gzjVar3.H();
                    int i5 = gyj.a;
                    parcelH9.writeInt(zBooleanValue3 ? 1 : 0);
                    gzjVar3.L(parcelH9, 18);
                } catch (RemoteException e9) {
                    poc.q(e9);
                    return null;
                }
                break;
            case 9:
                boolean zBooleanValue4 = ((Boolean) obj2).booleanValue();
                ((bta) obj).getClass();
                fnf fnfVarB4 = n88Var.b();
                fnfVarB4.getClass();
                try {
                    gzj gzjVar4 = (gzj) fnfVarB4.F;
                    Parcel parcelH10 = gzjVar4.H();
                    int i6 = gyj.a;
                    parcelH10.writeInt(zBooleanValue4 ? 1 : 0);
                    gzjVar4.L(parcelH10, 3);
                } catch (RemoteException e10) {
                    poc.q(e10);
                    return null;
                }
                break;
            case 10:
                boolean zBooleanValue5 = ((Boolean) obj2).booleanValue();
                ((bta) obj).getClass();
                fnf fnfVarB5 = n88Var.b();
                fnfVarB5.getClass();
                try {
                    gzj gzjVar5 = (gzj) fnfVarB5.F;
                    Parcel parcelH11 = gzjVar5.H();
                    int i7 = gyj.a;
                    parcelH11.writeInt(zBooleanValue5 ? 1 : 0);
                    gzjVar5.L(parcelH11, 7);
                } catch (RemoteException e11) {
                    poc.q(e11);
                    return null;
                }
                break;
            case 11:
                boolean zBooleanValue6 = ((Boolean) obj2).booleanValue();
                ((bta) obj).getClass();
                fnf fnfVarB6 = n88Var.b();
                fnfVarB6.getClass();
                try {
                    gzj gzjVar6 = (gzj) fnfVarB6.F;
                    Parcel parcelH12 = gzjVar6.H();
                    int i8 = gyj.a;
                    parcelH12.writeInt(zBooleanValue6 ? 1 : 0);
                    gzjVar6.L(parcelH12, 4);
                } catch (RemoteException e12) {
                    poc.q(e12);
                    return null;
                }
                break;
            case 12:
                boolean zBooleanValue7 = ((Boolean) obj2).booleanValue();
                ((bta) obj).getClass();
                fnf fnfVarB7 = n88Var.b();
                fnfVarB7.getClass();
                try {
                    gzj gzjVar7 = (gzj) fnfVarB7.F;
                    Parcel parcelH13 = gzjVar7.H();
                    int i9 = gyj.a;
                    parcelH13.writeInt(zBooleanValue7 ? 1 : 0);
                    gzjVar7.L(parcelH13, 20);
                } catch (RemoteException e13) {
                    poc.q(e13);
                    return null;
                }
                break;
            case 13:
                boolean zBooleanValue8 = ((Boolean) obj2).booleanValue();
                ((bta) obj).getClass();
                fnf fnfVarB8 = n88Var.b();
                fnfVarB8.getClass();
                try {
                    gzj gzjVar8 = (gzj) fnfVarB8.F;
                    Parcel parcelH14 = gzjVar8.H();
                    int i10 = gyj.a;
                    parcelH14.writeInt(zBooleanValue8 ? 1 : 0);
                    gzjVar8.L(parcelH14, 6);
                } catch (RemoteException e14) {
                    poc.q(e14);
                    return null;
                }
                break;
            case 14:
                boolean zBooleanValue9 = ((Boolean) obj2).booleanValue();
                ((bta) obj).getClass();
                fnf fnfVarB9 = n88Var.b();
                fnfVarB9.getClass();
                try {
                    gzj gzjVar9 = (gzj) fnfVarB9.F;
                    Parcel parcelH15 = gzjVar9.H();
                    int i11 = gyj.a;
                    parcelH15.writeInt(zBooleanValue9 ? 1 : 0);
                    gzjVar9.L(parcelH15, 1);
                } catch (RemoteException e15) {
                    poc.q(e15);
                    return null;
                }
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                boolean zBooleanValue10 = ((Boolean) obj2).booleanValue();
                ((bta) obj).getClass();
                fnf fnfVarB10 = n88Var.b();
                fnfVarB10.getClass();
                try {
                    gzj gzjVar10 = (gzj) fnfVarB10.F;
                    Parcel parcelH16 = gzjVar10.H();
                    int i12 = gyj.a;
                    parcelH16.writeInt(zBooleanValue10 ? 1 : 0);
                    gzjVar10.L(parcelH16, 5);
                } catch (RemoteException e16) {
                    poc.q(e16);
                    return null;
                }
                break;
            case 16:
                bta btaVar = (bta) obj;
                mnc mncVar = (mnc) obj2;
                btaVar.getClass();
                mncVar.getClass();
                ita.a(btaVar, n88Var, mncVar);
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                bta btaVar2 = (bta) obj;
                if (obj2 == null) {
                    btaVar2.getClass();
                    hfk hfkVar7 = n88Var.a;
                    try {
                        Parcel parcelH17 = hfkVar7.H();
                        gyj.d(parcelH17, null);
                        hfkVar7.L(parcelH17, 24);
                    } catch (RemoteException e17) {
                        poc.q(e17);
                    }
                } else {
                    mr9.o();
                }
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                boolean zBooleanValue11 = ((Boolean) obj2).booleanValue();
                ((bta) obj).getClass();
                n88Var.getClass();
                try {
                    hfk hfkVar8 = n88Var.a;
                    Parcel parcelH18 = hfkVar8.H();
                    int i13 = gyj.a;
                    parcelH18.writeInt(zBooleanValue11 ? 1 : 0);
                    hfkVar8.L(parcelH18, 41);
                } catch (RemoteException e18) {
                    poc.q(e18);
                    return null;
                }
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                boolean zBooleanValue12 = ((Boolean) obj2).booleanValue();
                ((bta) obj).getClass();
                n88Var.getClass();
                try {
                    hfk hfkVar9 = n88Var.a;
                    Parcel parcelH19 = hfkVar9.H();
                    int i14 = gyj.a;
                    parcelH19.writeInt(zBooleanValue12 ? 1 : 0);
                    Parcel parcelF2 = hfkVar9.F(parcelH19, 20);
                    parcelF2.readInt();
                    parcelF2.recycle();
                } catch (RemoteException e19) {
                    poc.q(e19);
                    return null;
                }
                break;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                boolean zBooleanValue13 = ((Boolean) obj2).booleanValue();
                ((bta) obj).getClass();
                n88Var.getClass();
                try {
                    hfk hfkVar10 = n88Var.a;
                    Parcel parcelH20 = hfkVar10.H();
                    int i15 = gyj.a;
                    parcelH20.writeInt(zBooleanValue13 ? 1 : 0);
                    hfkVar10.L(parcelH20, 22);
                } catch (RemoteException e20) {
                    poc.q(e20);
                    return null;
                }
                break;
            default:
                boolean zBooleanValue14 = ((Boolean) obj2).booleanValue();
                ((bta) obj).getClass();
                n88Var.getClass();
                try {
                    hfk hfkVar11 = n88Var.a;
                    Parcel parcelH21 = hfkVar11.H();
                    int i16 = gyj.a;
                    parcelH21.writeInt(zBooleanValue14 ? 1 : 0);
                    hfkVar11.L(parcelH21, 18);
                } catch (RemoteException e21) {
                    poc.q(e21);
                    return null;
                }
                break;
        }
        return null;
    }
}
