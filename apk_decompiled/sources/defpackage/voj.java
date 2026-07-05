package defpackage;

import android.content.Context;
import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.health.platform.client.proto.g;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class voj extends rlj {
    public final /* synthetic */ int j = 20;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public voj(gqa gqaVar) {
        super("com.google.android.gms.maps.internal.IOnCircleClickListener", 5);
        this.k = gqaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [android.os.Parcel] */
    /* JADX WARN: Type inference failed for: r4v11, types: [int] */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v27 */
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
    @Override // defpackage.rlj
    public final boolean F(int i, Parcel parcel, Parcel parcel2) {
        rz7 rz7Var;
        rz7 rz7Var2;
        int i2 = this.j;
        hfk hfkVar = null;
        ia2 ia2Var = null;
        hsj hsjVar = null;
        xrj xrjVar = null;
        ixk ixkVar = null;
        i5l i5lVar = null;
        a6l a6lVar = null;
        ed4Var = null;
        ed4 ed4Var = null;
        ed4Var = null;
        ed4 ed4Var2 = null;
        Object obj = this.k;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1;
        switch (i2) {
            case 0:
                if (i == 1) {
                    crj crjVarH = xqj.H(parcel.readStrongBinder());
                    gyj.b(parcel);
                    fua fuaVar = new fua(crjVarH);
                    Iterator it = ((gqa) obj).a.L.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            wsa wsaVar = (wsa) it.next();
                            if (wsaVar instanceof mua) {
                                mua muaVar = (mua) wsaVar;
                                if (muaVar.b.equals(fuaVar)) {
                                    bz7 bz7Var = muaVar.d;
                                    if (bz7Var != null ? x44.r(bz7Var.invoke(fuaVar), Boolean.TRUE) : false) {
                                        i3 = 1;
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                    }
                    parcel2.writeNoException();
                    parcel2.writeInt(i3);
                }
                break;
            case 1:
                if (i == 1) {
                    LatLng latLng = (LatLng) gyj.a(parcel, LatLng.CREATOR);
                    gyj.b(parcel);
                    xqa xqaVar = ((rqa) obj).a;
                    latLng.getClass();
                    bz7 bz7Var2 = (bz7) xqaVar.get();
                    if (bz7Var2 != null) {
                        bz7Var2.invoke(latLng);
                    }
                    parcel2.writeNoException();
                }
                break;
            case 2:
                if (i == 1) {
                    IBinder strongBinder = parcel.readStrongBinder();
                    if (strongBinder != null) {
                        IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                        hfkVar = iInterfaceQueryLocalInterface instanceof hfk ? (hfk) iInterfaceQueryLocalInterface : new hfk(strongBinder, "com.google.android.gms.maps.internal.IGoogleMapDelegate", 3);
                    }
                    gyj.b(parcel);
                    n88 n88Var = new n88(hfkVar);
                    r88 r88Var = (r88) obj;
                    r88Var.getClass();
                    r88Var.a.resumeWith(n88Var);
                    parcel2.writeNoException();
                }
                break;
            case 3:
                hqa hqaVar = (hqa) ((ro6) obj).F;
                iei ieiVar = iei.a;
                if (i == 1) {
                    crj crjVarH2 = xqj.H(parcel.readStrongBinder());
                    gyj.b(parcel);
                    fua fuaVar2 = new fua(crjVarH2);
                    for (wsa wsaVar2 : hqaVar.L) {
                        if (wsaVar2 instanceof mua) {
                            mua muaVar2 = (mua) wsaVar2;
                            if (muaVar2.b.equals(fuaVar2)) {
                                LatLng latLngA = fuaVar2.a();
                                latLngA.getClass();
                                pua puaVar = muaVar2.c;
                                puaVar.b.setValue(Boolean.TRUE);
                                puaVar.a.setValue(latLngA);
                                puaVar.c.setValue(dd6.E);
                                if (ieiVar != Boolean.TRUE) {
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                } else if (i == 2) {
                    crj crjVarH3 = xqj.H(parcel.readStrongBinder());
                    gyj.b(parcel);
                    fua fuaVar3 = new fua(crjVarH3);
                    for (wsa wsaVar3 : hqaVar.L) {
                        if (wsaVar3 instanceof mua) {
                            mua muaVar3 = (mua) wsaVar3;
                            if (muaVar3.b.equals(fuaVar3)) {
                                LatLng latLngA2 = fuaVar3.a();
                                latLngA2.getClass();
                                pua puaVar2 = muaVar3.c;
                                puaVar2.b.setValue(Boolean.TRUE);
                                puaVar2.a.setValue(latLngA2);
                                puaVar2.c.setValue(dd6.F);
                                if (ieiVar != Boolean.TRUE) {
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                } else if (i == 3) {
                    crj crjVarH4 = xqj.H(parcel.readStrongBinder());
                    gyj.b(parcel);
                    fua fuaVar4 = new fua(crjVarH4);
                    for (wsa wsaVar4 : hqaVar.L) {
                        if (wsaVar4 instanceof mua) {
                            mua muaVar4 = (mua) wsaVar4;
                            if (muaVar4.b.equals(fuaVar4)) {
                                LatLng latLngA3 = fuaVar4.a();
                                latLngA3.getClass();
                                pua puaVar3 = muaVar4.c;
                                puaVar3.b.setValue(Boolean.TRUE);
                                puaVar3.a.setValue(latLngA3);
                                puaVar3.b.setValue(Boolean.FALSE);
                                puaVar3.c.setValue(dd6.G);
                                if (ieiVar != Boolean.TRUE) {
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
                parcel2.writeNoException();
                break;
            case 4:
                if (i == 1) {
                    crj crjVarH5 = xqj.H(parcel.readStrongBinder());
                    gyj.b(parcel);
                    fua fuaVar5 = new fua(crjVarH5);
                    for (wsa wsaVar5 : ((gqa) obj).a.L) {
                        if (wsaVar5 instanceof mua) {
                            mua muaVar5 = (mua) wsaVar5;
                            if (muaVar5.b.equals(fuaVar5)) {
                                bz7 bz7Var3 = muaVar5.e;
                                if (bz7Var3 != null ? x44.r(bz7Var3.invoke(fuaVar5), Boolean.TRUE) : false) {
                                    parcel2.writeNoException();
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    parcel2.writeNoException();
                }
                break;
            case 5:
                if (i == 1) {
                    crj crjVarH6 = xqj.H(parcel.readStrongBinder());
                    gyj.b(parcel);
                    fua fuaVar6 = new fua(crjVarH6);
                    for (wsa wsaVar6 : ((gqa) obj).a.L) {
                        if (wsaVar6 instanceof mua) {
                            mua muaVar6 = (mua) wsaVar6;
                            if (muaVar6.b.equals(fuaVar6)) {
                                bz7 bz7Var4 = muaVar6.g;
                                if (bz7Var4 != null ? x44.r(bz7Var4.invoke(fuaVar6), Boolean.TRUE) : false) {
                                    parcel2.writeNoException();
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    parcel2.writeNoException();
                }
                break;
            case 6:
                if (i == 1) {
                    crj crjVarH7 = xqj.H(parcel.readStrongBinder());
                    gyj.b(parcel);
                    fua fuaVar7 = new fua(crjVarH7);
                    for (wsa wsaVar7 : ((gqa) obj).a.L) {
                        if (wsaVar7 instanceof mua) {
                            mua muaVar7 = (mua) wsaVar7;
                            if (muaVar7.b.equals(fuaVar7)) {
                                bz7 bz7Var5 = muaVar7.f;
                                if (bz7Var5 != null ? x44.r(bz7Var5.invoke(fuaVar7), Boolean.TRUE) : false) {
                                    parcel2.writeNoException();
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    parcel2.writeNoException();
                }
                break;
            case 7:
                epk epkVar = (epk) obj;
                tl8 tl8Var = (tl8) epkVar.F;
                kta ktaVar = (kta) epkVar.E;
                if (i == 1) {
                    crj crjVarH8 = xqj.H(parcel.readStrongBinder());
                    gyj.b(parcel);
                    fua fuaVar8 = new fua(crjVarH8);
                    mua muaVar8 = (mua) tl8Var.invoke(fuaVar8);
                    if (muaVar8 != null && (rz7Var = muaVar8.h) != null) {
                        Context context = ktaVar.getContext();
                        context.getClass();
                        ed4Var2 = new ed4(context);
                        ed4Var2.setContent(new ta4(-742372995, true, new qc4(rz7Var, fuaVar8, i5)));
                        skk.k(ktaVar, ed4Var2, muaVar8.a);
                    }
                    cbc cbcVar = new cbc(ed4Var2);
                    parcel2.writeNoException();
                    gyj.d(parcel2, cbcVar);
                } else if (i == 2) {
                    crj crjVarH9 = xqj.H(parcel.readStrongBinder());
                    gyj.b(parcel);
                    fua fuaVar9 = new fua(crjVarH9);
                    mua muaVar9 = (mua) tl8Var.invoke(fuaVar9);
                    if (muaVar9 != null && (rz7Var2 = muaVar9.i) != null) {
                        Context context2 = ktaVar.getContext();
                        context2.getClass();
                        ed4Var = new ed4(context2);
                        ed4Var.setContent(new ta4(1508359207, true, new qc4(rz7Var2, fuaVar9, i3)));
                        skk.k(ktaVar, ed4Var, muaVar9.a);
                    }
                    cbc cbcVar2 = new cbc(ed4Var);
                    parcel2.writeNoException();
                    gyj.d(parcel2, cbcVar2);
                }
                break;
            case 8:
                if (i == 1) {
                    zy7 zy7Var = (zy7) ((tqa) obj).a.get();
                    ?? BooleanValue = zy7Var != null ? ((Boolean) zy7Var.a()).booleanValue() : 0;
                    parcel2.writeNoException();
                    int i6 = gyj.a;
                    parcel2.writeInt(BooleanValue);
                }
                break;
            case 9:
                if (i == 1) {
                    Location location = (Location) gyj.a(parcel, Location.CREATOR);
                    gyj.b(parcel);
                    xqa xqaVar2 = ((uqa) obj).a;
                    location.getClass();
                    bz7 bz7Var6 = (bz7) xqaVar2.get();
                    if (bz7Var6 != null) {
                        bz7Var6.invoke(location);
                    }
                    parcel2.writeNoException();
                }
                break;
            case 10:
                if (i == 1) {
                    zy7 zy7Var2 = (zy7) ((sqa) obj).a.get();
                    if (zy7Var2 != null) {
                        zy7Var2.a();
                    }
                    parcel2.writeNoException();
                }
                break;
            case 11:
                bra braVar = (bra) obj;
                if (i == 1) {
                    ((tr5) braVar.a.get()).getClass();
                } else if (i == 2) {
                    IBinder strongBinder2 = parcel.readStrongBinder();
                    if (strongBinder2 != null) {
                        IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
                        a6lVar = iInterfaceQueryLocalInterface2 instanceof a6l ? (a6l) iInterfaceQueryLocalInterface2 : new a6l(strongBinder2, "com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate", 3);
                    }
                    gyj.b(parcel);
                    dgj.w("delegate", a6lVar);
                    braVar.getClass();
                    ((tr5) braVar.a.get()).getClass();
                }
                parcel2.writeNoException();
                break;
            case 12:
                if (i == 1) {
                    IBinder strongBinder3 = parcel.readStrongBinder();
                    if (strongBinder3 != null) {
                        IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                        i5lVar = iInterfaceQueryLocalInterface3 instanceof i5l ? (i5l) iInterfaceQueryLocalInterface3 : new i5l(strongBinder3, "com.google.android.gms.maps.model.internal.IGroundOverlayDelegate", 3);
                    }
                    gyj.b(parcel);
                    dgj.v(i5lVar);
                    for (wsa wsaVar8 : ((gqa) obj).a.L) {
                    }
                    parcel2.writeNoException();
                }
                break;
            case 13:
                if (i == 1) {
                    IBinder strongBinder4 = parcel.readStrongBinder();
                    if (strongBinder4 != null) {
                        IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                        ixkVar = iInterfaceQueryLocalInterface4 instanceof ixk ? (ixk) iInterfaceQueryLocalInterface4 : new ixk(strongBinder4, "com.google.android.gms.maps.model.internal.ICircleDelegate", 3);
                    }
                    gyj.b(parcel);
                    dgj.v(ixkVar);
                    for (wsa wsaVar9 : ((gqa) obj).a.L) {
                    }
                    parcel2.writeNoException();
                }
                break;
            case 14:
                if (i == 1) {
                    IBinder strongBinder5 = parcel.readStrongBinder();
                    if (strongBinder5 != null) {
                        IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                        xrjVar = iInterfaceQueryLocalInterface5 instanceof xrj ? (xrj) iInterfaceQueryLocalInterface5 : new xrj(strongBinder5, "com.google.android.gms.maps.model.internal.IPolygonDelegate", 3);
                    }
                    gyj.b(parcel);
                    dgj.v(xrjVar);
                    for (wsa wsaVar10 : ((gqa) obj).a.L) {
                    }
                    parcel2.writeNoException();
                }
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                if (i == 1) {
                    IBinder strongBinder6 = parcel.readStrongBinder();
                    if (strongBinder6 != null) {
                        IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                        hsjVar = iInterfaceQueryLocalInterface6 instanceof hsj ? (hsj) iInterfaceQueryLocalInterface6 : new hsj(strongBinder6, "com.google.android.gms.maps.model.internal.IPolylineDelegate", 3);
                    }
                    gyj.b(parcel);
                    dgj.v(hsjVar);
                    for (wsa wsaVar11 : ((gqa) obj).a.L) {
                    }
                    parcel2.writeNoException();
                }
                break;
            case 16:
                if (i == 1) {
                    r7d r7dVar = (r7d) gyj.a(parcel, r7d.CREATOR);
                    gyj.b(parcel);
                    xqa xqaVar3 = ((vqa) obj).a;
                    r7dVar.getClass();
                    bz7 bz7Var7 = (bz7) xqaVar3.get();
                    if (bz7Var7 != null) {
                        bz7Var7.invoke(r7dVar);
                    }
                    parcel2.writeNoException();
                }
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                if (i == 1) {
                    int i7 = parcel.readInt();
                    gyj.b(parcel);
                    bta btaVar = ((ata) obj).a;
                    ka2 ka2Var = btaVar.d;
                    ia2.F.getClass();
                    ia2[] ia2VarArrValues = ia2.values();
                    int length = ia2VarArrValues.length;
                    while (true) {
                        if (i4 < length) {
                            ia2 ia2Var2 = ia2VarArrValues[i4];
                            if (ia2Var2.E == i7) {
                                ia2Var = ia2Var2;
                            } else {
                                i4++;
                            }
                        }
                    }
                    if (ia2Var == null) {
                        ia2Var = ia2.UNKNOWN;
                    }
                    ka2Var.getClass();
                    ka2Var.b.setValue(ia2Var);
                    btaVar.d.a.setValue(Boolean.TRUE);
                    parcel2.writeNoException();
                }
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                if (i == 1) {
                    bta btaVar2 = ((ata) obj).a;
                    ka2 ka2Var2 = btaVar2.d;
                    CameraPosition cameraPositionA = btaVar2.a.a();
                    ka2Var2.getClass();
                    cameraPositionA.getClass();
                    ka2Var2.c.setValue(cameraPositionA);
                    parcel2.writeNoException();
                }
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                if (i == 1) {
                    ((ata) obj).a.d.a.setValue(Boolean.FALSE);
                    parcel2.writeNoException();
                }
                break;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                if (i == 1) {
                    bta btaVar3 = ((ata) obj).a;
                    btaVar3.d.a.setValue(Boolean.FALSE);
                    ka2 ka2Var3 = btaVar3.d;
                    CameraPosition cameraPositionA2 = btaVar3.a.a();
                    ka2Var3.getClass();
                    cameraPositionA2.getClass();
                    ka2Var3.c.setValue(cameraPositionA2);
                    parcel2.writeNoException();
                }
                break;
            default:
                if (i == 1) {
                    LatLng latLng2 = (LatLng) gyj.a(parcel, LatLng.CREATOR);
                    gyj.b(parcel);
                    xqa xqaVar4 = ((qqa) obj).a;
                    latLng2.getClass();
                    bz7 bz7Var8 = (bz7) xqaVar4.get();
                    if (bz7Var8 != null) {
                        bz7Var8.invoke(latLng2);
                    }
                    parcel2.writeNoException();
                }
                break;
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public voj(r88 r88Var) {
        super("com.google.android.gms.maps.internal.IOnMapReadyCallback", 5);
        this.k = r88Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public voj(ro6 ro6Var) {
        super("com.google.android.gms.maps.internal.IOnMarkerDragListener", 5);
        this.k = ro6Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public voj(gqa gqaVar, byte b) {
        super("com.google.android.gms.maps.internal.IOnMarkerClickListener", 5);
        this.k = gqaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public voj(gqa gqaVar, byte b, byte b2) {
        super("com.google.android.gms.maps.internal.IOnPolygonClickListener", 5);
        this.k = gqaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public voj(gqa gqaVar, byte b, char c) {
        super("com.google.android.gms.maps.internal.IOnPolylineClickListener", 5);
        this.k = gqaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public voj(gqa gqaVar, byte b, boolean z) {
        super("com.google.android.gms.maps.internal.IOnGroundOverlayClickListener", 5);
        this.k = gqaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public voj(gqa gqaVar, char c) {
        super("com.google.android.gms.maps.internal.IOnInfoWindowClickListener", 5);
        this.k = gqaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public voj(gqa gqaVar, int i) {
        super("com.google.android.gms.maps.internal.IOnInfoWindowLongClickListener", 5);
        this.k = gqaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public voj(gqa gqaVar, short s) {
        super("com.google.android.gms.maps.internal.IOnInfoWindowCloseListener", 5);
        this.k = gqaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public voj(qqa qqaVar) {
        super("com.google.android.gms.maps.internal.IOnMapClickListener", 5);
        this.k = qqaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public voj(rqa rqaVar) {
        super("com.google.android.gms.maps.internal.IOnMapLongClickListener", 5);
        this.k = rqaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public voj(sqa sqaVar) {
        super("com.google.android.gms.maps.internal.IOnMapLoadedCallback", 5);
        this.k = sqaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public voj(tqa tqaVar) {
        super("com.google.android.gms.maps.internal.IOnMyLocationButtonClickListener", 5);
        this.k = tqaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public voj(uqa uqaVar) {
        super("com.google.android.gms.maps.internal.IOnMyLocationClickListener", 5);
        this.k = uqaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public voj(vqa vqaVar) {
        super("com.google.android.gms.maps.internal.IOnPoiClickListener", 5);
        this.k = vqaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public voj(bra braVar) {
        super("com.google.android.gms.maps.internal.IOnIndoorStateChangeListener", 5);
        this.k = braVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public voj(ata ataVar) {
        super("com.google.android.gms.maps.internal.IOnCameraIdleListener", 5);
        this.k = ataVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public voj(ata ataVar, byte b) {
        super("com.google.android.gms.maps.internal.IOnCameraMoveStartedListener", 5);
        this.k = ataVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public voj(ata ataVar, char c) {
        super("com.google.android.gms.maps.internal.IOnCameraMoveListener", 5);
        this.k = ataVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public voj(ata ataVar, int i) {
        super("com.google.android.gms.maps.internal.IOnCameraMoveCanceledListener", 5);
        this.k = ataVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public voj(epk epkVar) {
        super("com.google.android.gms.maps.internal.IInfoWindowAdapter", 5);
        this.k = epkVar;
    }
}
