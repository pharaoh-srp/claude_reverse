package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.health.platform.client.proto.g;
import com.google.android.gms.common.data.DataHolder;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zqj extends rlj implements eik {
    public final WeakReference j;
    public volatile int k;

    public zqj(r6j r6jVar) {
        super("com.google.android.gms.wearable.internal.IWearableListener", 7);
        this.k = -1;
        this.j = new WeakReference(r6jVar);
    }

    public static final void K(wgk wgkVar, boolean z, byte[] bArr) {
        try {
            wgkVar.getClass();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(wgkVar.k);
            int i = lyj.a;
            parcelObtain.writeInt(z ? 1 : 0);
            parcelObtain.writeByteArray(bArr);
            try {
                wgkVar.j.transact(1, parcelObtain, null, 1);
            } finally {
                parcelObtain.recycle();
            }
        } catch (RemoteException e) {
            Log.e("WearableLS", "Failed to send a response back", e);
        }
    }

    @Override // defpackage.rlj
    public final boolean F(int i, Parcel parcel, Parcel parcel2) {
        wgk wgkVar;
        zgk zgkVar;
        IInterface whkVar;
        int i2 = 0;
        switch (i) {
            case 1:
                DataHolder dataHolder = (DataHolder) lyj.a(parcel, DataHolder.CREATOR);
                lyj.b(parcel);
                Runnable s2kVar = new s2k(this, dataHolder);
                try {
                    String strValueOf = String.valueOf(dataHolder);
                    int i3 = dataHolder.L;
                    StringBuilder sb = new StringBuilder(strValueOf.length() + 7 + String.valueOf(i3).length());
                    sb.append(strValueOf);
                    sb.append(", rows=");
                    sb.append(i3);
                    if (!I(s2kVar, "onDataItemChanged", sb.toString())) {
                    }
                    return true;
                } finally {
                    dataHolder.close();
                }
            case 2:
                hlk hlkVar = (hlk) lyj.a(parcel, hlk.CREATOR);
                lyj.b(parcel);
                I(new t08(this, hlkVar), "onMessageReceived", hlkVar);
                return true;
            case 3:
                rnk rnkVar = (rnk) lyj.a(parcel, rnk.CREATOR);
                lyj.b(parcel);
                I(new hpj(this, rnkVar, 4), "onPeerConnected", rnkVar);
                return true;
            case 4:
                rnk rnkVar2 = (rnk) lyj.a(parcel, rnk.CREATOR);
                lyj.b(parcel);
                I(new hpj(this, rnkVar2, 5), "onPeerDisconnected", rnkVar2);
                return true;
            case 5:
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(rnk.CREATOR);
                lyj.b(parcel);
                I(new hpj(this, arrayListCreateTypedArrayList), "onConnectedNodes", arrayListCreateTypedArrayList);
                return true;
            case 6:
                fxk fxkVar = (fxk) lyj.a(parcel, fxk.CREATOR);
                lyj.b(parcel);
                I(new hpj(this, fxkVar), "onNotificationReceived", fxkVar);
                return true;
            case 7:
                vwj vwjVar = (vwj) lyj.a(parcel, vwj.CREATOR);
                lyj.b(parcel);
                I(new s2k(this, vwjVar), "onChannelEvent", vwjVar);
                return true;
            case 8:
                gsj gsjVar = (gsj) lyj.a(parcel, gsj.CREATOR);
                lyj.b(parcel);
                I(new hpj(this, gsjVar), "onConnectedCapabilityChanged", gsjVar);
                return true;
            case 9:
                xqk xqkVar = (xqk) lyj.a(parcel, xqk.CREATOR);
                lyj.b(parcel);
                I(new hpj(this, xqkVar), "onEntityUpdate", xqkVar);
                return true;
            case 10:
            case 11:
            case 12:
            default:
                return false;
            case 13:
                hlk hlkVar2 = (hlk) lyj.a(parcel, hlk.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    wgkVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IRpcResponseCallback");
                    wgkVar = iInterfaceQueryLocalInterface instanceof wgk ? (wgk) iInterfaceQueryLocalInterface : new wgk(strongBinder, "com.google.android.gms.wearable.internal.IRpcResponseCallback", 5);
                }
                lyj.b(parcel);
                if (!I(new ije(this, wgkVar, hlkVar2), "onRequestReceived", hlkVar2)) {
                    K(wgkVar, false, null);
                    return true;
                }
                return true;
            case 14:
                lyj.b(parcel);
                return true;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                lyj.b(parcel);
                return true;
            case 16:
                nnk nnkVar = (nnk) lyj.a(parcel, nnk.CREATOR);
                lyj.b(parcel);
                Runnable t08Var = new t08(this, 9, nnkVar);
                DataHolder dataHolder2 = nnkVar.F;
                int i4 = dataHolder2.L;
                StringBuilder sb2 = new StringBuilder(String.valueOf(i4).length() + 17);
                sb2.append("DataHolder[rows=");
                sb2.append(i4);
                sb2.append("]");
                if (!I(t08Var, "onNodeMigrated", sb2.toString())) {
                    dataHolder2.close();
                    return true;
                }
                return true;
            case g.MAX_FIELD_NUMBER /* 17 */:
                lyj.b(parcel);
                return true;
            case g.AVG_FIELD_NUMBER /* 18 */:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 == null) {
                    zgkVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.wearable.internal.IServiceResponseCallback");
                    zgkVar = iInterfaceQueryLocalInterface2 instanceof zgk ? (zgk) iInterfaceQueryLocalInterface2 : new zgk(strongBinder2, "com.google.android.gms.wearable.internal.IServiceResponseCallback", 5);
                }
                lyj.b(parcel);
                r6j r6jVarH = H("onGetService");
                if (r6jVarH != null) {
                    if (Log.isLoggable("WearableLS", 3)) {
                        Objects.toString(r6jVarH.E);
                    }
                    if (J(r6jVarH)) {
                        try {
                            String packageName = r6jVarH.getPackageName();
                            zqj zqjVar = r6jVarH.G;
                            if (zqjVar == null) {
                                whkVar = null;
                            } else {
                                IInterface iInterfaceQueryLocalInterface3 = zqjVar.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableListener");
                                whkVar = iInterfaceQueryLocalInterface3 instanceof eik ? (eik) iInterfaceQueryLocalInterface3 : new whk(zqjVar, "com.google.android.gms.wearable.internal.IWearableListener", 5);
                            }
                            zgkVar.getClass();
                            Parcel parcelObtain = Parcel.obtain();
                            parcelObtain.writeInterfaceToken(zgkVar.k);
                            parcelObtain.writeInt(1);
                            int iK0 = xn5.K0(parcelObtain, 20293);
                            xn5.F0(parcelObtain, 1, packageName);
                            xn5.L0(parcelObtain, iK0);
                            if (whkVar == null) {
                                parcelObtain.writeStrongBinder(null);
                            } else {
                                parcelObtain.writeStrongBinder(whkVar.asBinder());
                            }
                            zgkVar.G(parcelObtain, 1);
                            i2 = 1;
                        } catch (RemoteException e) {
                            Log.e("WearableLS", "Failed to respond to onGetService", e);
                        }
                    }
                }
                parcel2.writeNoException();
                parcel2.writeInt(i2);
                return true;
        }
    }

    public final r6j H(String str) {
        r6j r6jVar = (r6j) this.j.get();
        if (r6jVar != null || !Log.isLoggable("WearableLS", 3)) {
            return r6jVar;
        }
        str.concat(": service reference no longer valid");
        return null;
    }

    public final boolean I(Runnable runnable, String str, Object obj) {
        StringBuilder sb = new StringBuilder(str.length() + 12);
        sb.append("postEvent (");
        sb.append(str);
        sb.append(")");
        r6j r6jVarH = H(sb.toString());
        if (r6jVarH != null) {
            if (Log.isLoggable("WearableLS", 3)) {
                String.format("%s: %s %s", str, r6jVarH.E, obj);
            }
            if (J(r6jVarH)) {
                synchronized (r6jVarH.J) {
                    try {
                        if (r6jVarH.K) {
                            return false;
                        }
                        r6jVarH.F.post(runnable);
                        return true;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        return false;
    }

    public final boolean J(r6j r6jVar) {
        int callingUid = Binder.getCallingUid();
        if (callingUid == this.k) {
            return true;
        }
        if ((ewk.a(r6jVar).b() && oq5.U(callingUid, r6jVar, "com.google.android.wearable.app.cn")) || oq5.H(r6jVar, callingUid)) {
            this.k = callingUid;
            return true;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(callingUid).length() + 46);
        sb.append("Caller is not GooglePlayServices; caller UID: ");
        sb.append(callingUid);
        Log.e("WearableLS", sb.toString());
        return false;
    }
}
