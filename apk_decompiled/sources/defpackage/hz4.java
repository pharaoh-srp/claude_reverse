package defpackage;

import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class hz4 {
    public final HashMap a;

    public hz4(int i) {
        switch (i) {
            case 1:
                new ip0(0);
                this.a = new HashMap();
                break;
            case 2:
            default:
                this.a = new HashMap();
                break;
            case 3:
                this.a = new HashMap();
                break;
        }
    }

    public void a(IBinder iBinder) {
        HashMap map = this.a;
        synchronized (map) {
            if (iBinder != null) {
                try {
                    iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
                } catch (Throwable th) {
                    throw th;
                }
            }
            new otk();
            for (Map.Entry entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    throw new ClassCastException();
                }
                try {
                    throw null;
                } catch (RemoteException unused) {
                    String strValueOf = String.valueOf(entry.getKey());
                    StringBuilder sb = new StringBuilder(strValueOf.length() + 36);
                    sb.append("onPostInitHandler: Didn't add: ");
                    sb.append(strValueOf);
                    sb.append("/");
                    sb.append("null");
                    Log.w("WearableClient", sb.toString());
                }
            }
        }
    }

    public hz4(HashMap map) {
        this.a = map;
    }
}
