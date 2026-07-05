package defpackage;

import android.location.Geocoder$GeocodeListener;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class at4 implements Geocoder$GeocodeListener {
    public final /* synthetic */ ua2 a;

    public at4(ua2 ua2Var) {
        this.a = ua2Var;
    }

    public final void onGeocode(List list) {
        list.getClass();
        this.a.resumeWith(w44.N0(list));
    }
}
