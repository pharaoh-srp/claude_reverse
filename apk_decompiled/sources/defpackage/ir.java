package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.health.platform.client.permission.Permission;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class ir extends Binder implements IInterface {
    public final /* synthetic */ int i;
    public final exf j;

    public ir(exf exfVar, int i) {
        this.i = i;
        switch (i) {
            case 1:
                attachInterface(this, "androidx.health.platform.client.service.IFilterGrantedPermissionsCallback");
                this.j = exfVar;
                break;
            case 2:
                attachInterface(this, "androidx.health.platform.client.service.IReadDataRangeCallback");
                this.j = exfVar;
                break;
            default:
                attachInterface(this, "androidx.health.platform.client.service.IAggregateDataCallback");
                this.j = exfVar;
                break;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i = this.i;
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3 = this.i;
        exf exfVar = this.j;
        switch (i3) {
            case 0:
                if (i >= 1 && i <= 16777215) {
                    parcel.enforceInterface("androidx.health.platform.client.service.IAggregateDataCallback");
                }
                if (i == 1598968902) {
                    parcel2.writeString("androidx.health.platform.client.service.IAggregateDataCallback");
                } else if (i == 1) {
                    kr krVar = (kr) (parcel.readInt() != 0 ? kr.CREATOR.createFromParcel(parcel) : null);
                    krVar.getClass();
                    exfVar.l(krVar.F);
                } else if (i == 2) {
                    hu6 hu6Var = (hu6) (parcel.readInt() != 0 ? hu6.CREATOR.createFromParcel(parcel) : null);
                    hu6Var.getClass();
                    exfVar.m(iu6.a(hu6Var));
                }
                break;
            case 1:
                if (i >= 1 && i <= 16777215) {
                    parcel.enforceInterface("androidx.health.platform.client.service.IFilterGrantedPermissionsCallback");
                }
                if (i == 1598968902) {
                    parcel2.writeString("androidx.health.platform.client.service.IFilterGrantedPermissionsCallback");
                } else if (i == 1) {
                    ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(Permission.CREATOR);
                    arrayListCreateTypedArrayList.getClass();
                    ArrayList arrayList = new ArrayList(x44.y(arrayListCreateTypedArrayList, 10));
                    Iterator it = arrayListCreateTypedArrayList.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((Permission) it.next()).F);
                    }
                    exfVar.l(w44.t1(arrayList));
                } else if (i == 2) {
                    hu6 hu6Var2 = (hu6) (parcel.readInt() != 0 ? hu6.CREATOR.createFromParcel(parcel) : null);
                    hu6Var2.getClass();
                    exfVar.m(iu6.a(hu6Var2));
                }
                break;
            default:
                if (i >= 1 && i <= 16777215) {
                    parcel.enforceInterface("androidx.health.platform.client.service.IReadDataRangeCallback");
                }
                if (i == 1598968902) {
                    parcel2.writeString("androidx.health.platform.client.service.IReadDataRangeCallback");
                } else if (i == 1) {
                    d3e d3eVar = (d3e) (parcel.readInt() != 0 ? d3e.CREATOR.createFromParcel(parcel) : null);
                    d3eVar.getClass();
                    exfVar.l(d3eVar.F);
                } else if (i == 2) {
                    hu6 hu6Var3 = (hu6) (parcel.readInt() != 0 ? hu6.CREATOR.createFromParcel(parcel) : null);
                    hu6Var3.getClass();
                    exfVar.m(iu6.a(hu6Var3));
                }
                break;
        }
        return true;
    }
}
