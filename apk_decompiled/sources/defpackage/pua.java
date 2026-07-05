package defpackage;

import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: loaded from: classes3.dex */
public final class pua {
    public final lsc a;
    public final lsc b = mpk.P(Boolean.FALSE);
    public final lsc c = mpk.P(dd6.G);
    public final lsc d = mpk.P(null);

    static {
        new y5f(new jua(5), new oua(0));
    }

    public pua(LatLng latLng) {
        this.a = mpk.P(latLng);
    }

    public final void a(fua fuaVar) {
        lsc lscVar = this.d;
        if (lscVar.getValue() == null && fuaVar == null) {
            return;
        }
        if (lscVar.getValue() == null || fuaVar == null) {
            lscVar.setValue(fuaVar);
        } else {
            sz6.j("MarkerState may only be associated with one Marker at a time.");
        }
    }
}
