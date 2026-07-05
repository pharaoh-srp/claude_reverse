package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;

/* JADX INFO: loaded from: classes2.dex */
public final class otb extends Binder implements hu8 {
    public final /* synthetic */ MultiInstanceInvalidationService i;

    public otb(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.i = multiInstanceInvalidationService;
        attachInterface(this, hu8.g);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        ptb ptbVar;
        String str = hu8.g;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        int i3 = 0;
        gu8 gu8Var = null;
        gu8 gu8Var2 = null;
        if (i == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(gu8.f);
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof gu8)) {
                    fu8 fu8Var = new fu8();
                    fu8Var.i = strongBinder;
                    gu8Var = fu8Var;
                } else {
                    gu8Var = (gu8) iInterfaceQueryLocalInterface;
                }
            }
            String string = parcel.readString();
            gu8Var.getClass();
            if (string != null) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = this.i;
                synchronized (multiInstanceInvalidationService.G) {
                    try {
                        int i4 = multiInstanceInvalidationService.E + 1;
                        multiInstanceInvalidationService.E = i4;
                        if (multiInstanceInvalidationService.G.register(gu8Var, Integer.valueOf(i4))) {
                            multiInstanceInvalidationService.F.put(Integer.valueOf(i4), string);
                            i3 = i4;
                        } else {
                            multiInstanceInvalidationService.E--;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            parcel2.writeNoException();
            parcel2.writeInt(i3);
            return true;
        }
        if (i == 2) {
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface(gu8.f);
                if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof gu8)) {
                    fu8 fu8Var2 = new fu8();
                    fu8Var2.i = strongBinder2;
                    gu8Var2 = fu8Var2;
                } else {
                    gu8Var2 = (gu8) iInterfaceQueryLocalInterface2;
                }
            }
            int i5 = parcel.readInt();
            gu8Var2.getClass();
            MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.i;
            synchronized (multiInstanceInvalidationService2.G) {
                multiInstanceInvalidationService2.G.unregister(gu8Var2);
            }
            parcel2.writeNoException();
            return true;
        }
        if (i != 3) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        int i6 = parcel.readInt();
        String[] strArrCreateStringArray = parcel.createStringArray();
        strArrCreateStringArray.getClass();
        MultiInstanceInvalidationService multiInstanceInvalidationService3 = this.i;
        synchronized (multiInstanceInvalidationService3.G) {
            String str2 = (String) multiInstanceInvalidationService3.F.get(Integer.valueOf(i6));
            if (str2 == null) {
                Log.w("ROOM", "Remote invalidation client ID not registered");
            } else {
                int iBeginBroadcast = multiInstanceInvalidationService3.G.beginBroadcast();
                while (true) {
                    ptbVar = multiInstanceInvalidationService3.G;
                    if (i3 >= iBeginBroadcast) {
                        break;
                    }
                    try {
                        Object broadcastCookie = ptbVar.getBroadcastCookie(i3);
                        broadcastCookie.getClass();
                        Integer num = (Integer) broadcastCookie;
                        int iIntValue = num.intValue();
                        String str3 = (String) multiInstanceInvalidationService3.F.get(num);
                        if (i6 != iIntValue && str2.equals(str3)) {
                            try {
                                ((gu8) multiInstanceInvalidationService3.G.getBroadcastItem(i3)).j(strArrCreateStringArray);
                            } catch (RemoteException e) {
                                Log.w("ROOM", "Error invoking a remote callback", e);
                            }
                        }
                        i3++;
                    } catch (Throwable th2) {
                        multiInstanceInvalidationService3.G.finishBroadcast();
                        throw th2;
                    }
                }
                ptbVar.finishBroadcast();
            }
        }
        return true;
    }
}
