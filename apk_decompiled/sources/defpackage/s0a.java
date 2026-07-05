package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class s0a implements h9f {
    public final /* synthetic */ int a;
    public final /* synthetic */ h9f b;
    public final /* synthetic */ aaf c;

    public /* synthetic */ s0a(h9f h9fVar, aaf aafVar, int i) {
        this.a = i;
        this.c = aafVar;
        this.b = h9fVar;
    }

    public final int a(int i) {
        Object obj;
        int i2 = this.a;
        aaf aafVar = this.c;
        switch (i2) {
            case 0:
                p0a p0aVarH = ((x0a) aafVar).h();
                if (p0aVarH.k.isEmpty()) {
                    return 0;
                }
                int iC = c();
                if (i > e() || iC > i) {
                    return ((i - c()) * kvj.h(p0aVarH)) - d();
                }
                List list = p0aVarH.k;
                int size = list.size();
                int i3 = 0;
                while (true) {
                    if (i3 < size) {
                        obj = list.get(i3);
                        if (((q0a) obj).a != i) {
                            i3++;
                        }
                    } else {
                        obj = null;
                    }
                }
                q0a q0aVar = (q0a) obj;
                if (q0aVar != null) {
                    return q0aVar.p;
                }
                return 0;
            default:
                koc kocVar = (koc) aafVar;
                return (int) (wd6.f0(xzk.y(kocVar) + ((long) mwa.L(((kocVar.n() * (i - ((isc) kocVar.d.G).h())) - (((hsc) kocVar.d.H).h() * kocVar.n())) + MTTypesetterKt.kLineSkipLimitMultiplier)), kocVar.h, kocVar.g) - xzk.y(kocVar));
        }
    }

    @Override // defpackage.h9f
    public final float b(float f) {
        switch (this.a) {
        }
        return this.b.b(f);
    }

    public final int c() {
        int i = this.a;
        aaf aafVar = this.c;
        switch (i) {
            case 0:
                return ((isc) ((x0a) aafVar).e.b).h();
            default:
                return ((koc) aafVar).e;
        }
    }

    public final int d() {
        int i = this.a;
        aaf aafVar = this.c;
        switch (i) {
            case 0:
                return ((isc) ((x0a) aafVar).e.c).h();
            default:
                return ((koc) aafVar).f;
        }
    }

    public final int e() {
        int i = this.a;
        aaf aafVar = this.c;
        switch (i) {
            case 0:
                q0a q0aVar = (q0a) w44.V0(((x0a) aafVar).h().k);
                if (q0aVar != null) {
                    return q0aVar.a;
                }
                return 0;
            default:
                return ((r5b) w44.U0(((koc) aafVar).k().a)).a;
        }
    }

    public final void f(int i, int i2) {
        int i3 = this.a;
        aaf aafVar = this.c;
        switch (i3) {
            case 0:
                ((x0a) aafVar).l(i, i2, true);
                break;
            default:
                koc kocVar = (koc) aafVar;
                float fN = kocVar.n();
                float f = MTTypesetterKt.kLineSkipLimitMultiplier;
                if (fN != MTTypesetterKt.kLineSkipLimitMultiplier) {
                    f = i2 / fN;
                }
                kocVar.s(i, f, true);
                break;
        }
    }
}
