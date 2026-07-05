package defpackage;

import android.location.Geocoder$GeocodeListener;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ani implements Geocoder$GeocodeListener {
    public final /* synthetic */ ua2 a;

    public ani(ua2 ua2Var) {
        this.a = ua2Var;
    }

    public final void onError(String str) {
        this.a.resumeWith(null);
    }

    public final void onGeocode(List list) {
        list.getClass();
        this.a.resumeWith(list);
    }
}
