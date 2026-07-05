package defpackage;

import com.google.android.gms.maps.model.CameraPosition;

/* JADX INFO: loaded from: classes3.dex */
public final class ka2 {
    public static final y5f h = new y5f(new c32(18), new te(12));
    public final lsc c;
    public final lsc a = mpk.P(Boolean.FALSE);
    public final lsc b = mpk.P(ia2.NO_MOVEMENT_YET);
    public final iei d = iei.a;
    public final lsc e = mpk.P(null);
    public final lsc f = mpk.P(null);
    public final lsc g = mpk.P(null);

    public ka2(CameraPosition cameraPosition) {
        this.c = mpk.P(cameraPosition);
    }

    public final void a(poj pojVar) {
        synchronized (this.d) {
            try {
                n88 n88Var = (n88) this.e.getValue();
                this.g.setValue(null);
                if (n88Var == null) {
                    ja2 ja2Var = new ja2(pojVar);
                    this.f.setValue(ja2Var);
                } else {
                    n88Var.c(pojVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(n88 n88Var) {
        synchronized (this.d) {
            try {
                if (((n88) this.e.getValue()) == null && n88Var == null) {
                    return;
                }
                if (((n88) this.e.getValue()) != null && n88Var != null) {
                    throw new IllegalStateException("CameraPositionState may only be associated with one GoogleMap at a time");
                }
                this.e.setValue(n88Var);
                if (n88Var == null) {
                    this.a.setValue(Boolean.FALSE);
                } else {
                    n88Var.c(wvj.e((CameraPosition) this.c.getValue()));
                }
                ja2 ja2Var = (ja2) this.f.getValue();
                if (ja2Var != null) {
                    this.f.setValue(null);
                    if (n88Var != null) {
                        n88Var.c(ja2Var.a);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
