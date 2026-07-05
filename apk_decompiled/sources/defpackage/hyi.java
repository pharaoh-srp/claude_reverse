package defpackage;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class hyi {
    public Interpolator c;
    public iyi d;
    public boolean e;
    public long b = -1;
    public final q1i f = new q1i(this);
    public final ArrayList a = new ArrayList();

    public final void a() {
        if (this.e) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((gyi) it.next()).b();
            }
            this.e = false;
        }
    }

    public final void b() {
        View view;
        if (this.e) {
            return;
        }
        for (gyi gyiVar : this.a) {
            long j = this.b;
            if (j >= 0) {
                gyiVar.c(j);
            }
            Interpolator interpolator = this.c;
            if (interpolator != null && (view = (View) gyiVar.a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.d != null) {
                gyiVar.d(this.f);
            }
            View view2 = (View) gyiVar.a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.e = true;
    }
}
