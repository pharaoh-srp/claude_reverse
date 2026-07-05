package defpackage;

import com.datadog.android.rum.internal.domain.scope.r;

/* JADX INFO: loaded from: classes.dex */
public final class zye implements j0j {
    public double a = Double.NaN;
    public final /* synthetic */ r b;

    public zye(r rVar) {
        this.b = rVar;
    }

    @Override // defpackage.j0j
    public final void a(i0j i0jVar) {
        double d = i0jVar.c;
        if (Double.isNaN(this.a)) {
            this.a = d;
            return;
        }
        Double dValueOf = Double.valueOf(d - this.a);
        r rVar = this.b;
        rVar.Y = dValueOf;
        rVar.u.getClass();
    }
}
