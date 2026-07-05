package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class rc extends ez1 {
    public final /* synthetic */ int p;
    public final String q;

    public /* synthetic */ rc(String str, int i) {
        this.p = i;
        this.q = str;
    }

    @Override // defpackage.ez1
    public final g6 L(Context context, Object obj) {
        switch (this.p) {
            case 0:
                ((String) obj).getClass();
                break;
            default:
                ((Set) obj).getClass();
                break;
        }
        return null;
    }

    @Override // defpackage.ez1
    public final Object O(Intent intent, int i) {
        ArrayList parcelableArrayListExtra;
        switch (this.p) {
            case 0:
                if (i != -1) {
                    intent = null;
                }
                if (intent != null) {
                    return intent.getData();
                }
                return null;
            default:
                Set setF0 = (intent == null || (parcelableArrayListExtra = intent.getParcelableArrayListExtra("granted_permissions_string")) == null) ? um6.E : bnf.f0(bnf.b0(new c54(0, parcelableArrayListExtra), f06.P));
                setF0.size();
                Log.isLoggable("HealthConnectClient", 3);
                return setF0;
        }
    }

    public Intent Y(Context context, String str) {
        str.getClass();
        Intent intentPutExtra = new Intent("android.intent.action.CREATE_DOCUMENT").setType(this.q).putExtra("android.intent.extra.TITLE", str);
        intentPutExtra.getClass();
        return intentPutExtra;
    }

    @Override // defpackage.ez1
    public Intent y(Context context, Object obj) {
        switch (this.p) {
            case 0:
                return Y(context, (String) obj);
            default:
                Set set = (Set) obj;
                set.getClass();
                l5i l5iVarB0 = bnf.b0(new c54(0, set), f06.O);
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                Iterator it = l5iVarB0.iterator();
                while (true) {
                    k5i k5iVar = (k5i) it;
                    if (!k5iVar.hasNext()) {
                        set.size();
                        Log.isLoggable("HealthConnectClient", 3);
                        Intent intent = new Intent("androidx.health.ACTION_REQUEST_PERMISSIONS");
                        intent.putParcelableArrayListExtra("requested_permissions_string", arrayList);
                        String str = this.q;
                        if (str.length() > 0) {
                            intent.setPackage(str);
                        }
                        return intent;
                    }
                    arrayList.add(k5iVar.next());
                }
                break;
        }
    }
}
