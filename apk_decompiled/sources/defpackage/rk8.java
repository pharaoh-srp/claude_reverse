package defpackage;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class rk8 extends Binder implements IInterface {
    public final Context i;
    public final Executor j;

    public rk8(Context context, ExecutorService executorService) {
        attachInterface(this, "androidx.health.platform.client.impl.sdkservice.IHealthDataSdkService");
        this.i = context;
        this.j = executorService;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public final void b(String str) {
        String[] packagesForUid = this.i.getPackageManager().getPackagesForUid(Binder.getCallingUid());
        if (str == null || packagesForUid == null || Arrays.stream(packagesForUid).noneMatch(new wj6(1, str))) {
            throw new SecurityException("Invalid package name!");
        }
        if (!"com.google.android.apps.healthdata".equals(str)) {
            throw new SecurityException("Not allowed!");
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("androidx.health.platform.client.impl.sdkservice.IHealthDataSdkService");
        }
        if (i == 1598968902) {
            parcel2.writeString("androidx.health.platform.client.impl.sdkservice.IHealthDataSdkService");
            return true;
        }
        Executor executor = this.j;
        qu8 qu8Var = null;
        ot8 ot8Var = null;
        pt8 pt8Var = null;
        if (i == 1) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("androidx.health.platform.client.impl.sdkservice.ISetPermissionTokenCallback");
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof qu8)) {
                    qu8Var = new qu8();
                    qu8Var.i = strongBinder;
                } else {
                    qu8Var = (qu8) iInterfaceQueryLocalInterface;
                }
            }
            b(string);
            executor.execute(new f60(this, string2, qu8Var, 6));
            return true;
        }
        int i3 = 3;
        if (i == 2) {
            String string3 = parcel.readString();
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("androidx.health.platform.client.impl.sdkservice.IGetPermissionTokenCallback");
                if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof pt8)) {
                    pt8Var = new pt8();
                    pt8Var.i = strongBinder2;
                } else {
                    pt8Var = (pt8) iInterfaceQueryLocalInterface2;
                }
            }
            b(string3);
            executor.execute(new yw5(this, i3, pt8Var));
            return true;
        }
        if (i != 3) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        String string4 = parcel.readString();
        IBinder strongBinder3 = parcel.readStrongBinder();
        if (strongBinder3 != null) {
            IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("androidx.health.platform.client.impl.sdkservice.IGetIsInForegroundCallback");
            if (iInterfaceQueryLocalInterface3 == null || !(iInterfaceQueryLocalInterface3 instanceof ot8)) {
                ot8Var = new ot8();
                ot8Var.i = strongBinder3;
            } else {
                ot8Var = (ot8) iInterfaceQueryLocalInterface3;
            }
        }
        b(string4);
        executor.execute(new fc(25, ot8Var));
        return true;
    }
}
