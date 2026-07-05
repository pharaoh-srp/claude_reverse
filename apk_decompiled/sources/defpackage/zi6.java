package defpackage;

import android.content.Context;
import android.widget.EdgeEffect;
import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final class zi6 {
    public final Context a;
    public final int b;
    public long c = 0;
    public EdgeEffect d;
    public EdgeEffect e;
    public EdgeEffect f;
    public EdgeEffect g;
    public EdgeEffect h;
    public EdgeEffect i;
    public EdgeEffect j;
    public EdgeEffect k;

    public zi6(Context context, int i) {
        this.a = context;
        this.b = i;
    }

    public static boolean f(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    public static boolean g(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !(cvj.e(edgeEffect) == MTTypesetterKt.kLineSkipLimitMultiplier);
    }

    public final EdgeEffect a(ukc ukcVar) {
        EdgeEffect edgeEffectD = cvj.d(this.a);
        edgeEffectD.setColor(this.b);
        if (!g79.b(this.c, 0L)) {
            long j = this.c;
            if (ukcVar == ukc.E) {
                edgeEffectD.setSize((int) (j >> 32), (int) (j & 4294967295L));
                return edgeEffectD;
            }
            edgeEffectD.setSize((int) (4294967295L & j), (int) (j >> 32));
        }
        return edgeEffectD;
    }

    public final EdgeEffect b() {
        EdgeEffect edgeEffect = this.e;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA = a(ukc.E);
        this.e = edgeEffectA;
        return edgeEffectA;
    }

    public final EdgeEffect c() {
        EdgeEffect edgeEffect = this.f;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA = a(ukc.F);
        this.f = edgeEffectA;
        return edgeEffectA;
    }

    public final EdgeEffect d() {
        EdgeEffect edgeEffect = this.g;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA = a(ukc.F);
        this.g = edgeEffectA;
        return edgeEffectA;
    }

    public final EdgeEffect e() {
        EdgeEffect edgeEffect = this.d;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA = a(ukc.E);
        this.d = edgeEffectA;
        return edgeEffectA;
    }
}
