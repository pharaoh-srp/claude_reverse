package defpackage;

import androidx.media3.exoplayer.source.ClippingMediaSource$IllegalClippingException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class vp3 extends oij {
    public final long l;
    public final boolean m;
    public final ArrayList n;
    public final kqh o;
    public up3 p;
    public ClippingMediaSource$IllegalClippingException q;
    public long r;
    public long s;

    public vp3(tp3 tp3Var) {
        super(tp3Var.a);
        this.l = tp3Var.b;
        this.m = tp3Var.c;
        this.n = new ArrayList();
        this.o = new kqh();
    }

    public final void B(mqh mqhVar) {
        long j;
        kqh kqhVar = this.o;
        mqhVar.n(0, kqhVar);
        long j2 = kqhVar.n;
        up3 up3Var = this.p;
        long j3 = this.l;
        ArrayList arrayList = this.n;
        if (up3Var == null || arrayList.isEmpty()) {
            this.r = j2;
            this.s = j3 != Long.MIN_VALUE ? j2 + j3 : Long.MIN_VALUE;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                sp3 sp3Var = (sp3) arrayList.get(i);
                long j4 = this.r;
                long j5 = this.s;
                sp3Var.J = j4;
                sp3Var.K = j5;
            }
            j = 0;
        } else {
            j = this.r - j2;
            j3 = j3 == Long.MIN_VALUE ? Long.MIN_VALUE : this.s - j2;
        }
        try {
            up3 up3Var2 = new up3(mqhVar, j, j3);
            this.p = up3Var2;
            l(up3Var2);
        } catch (ClippingMediaSource$IllegalClippingException e) {
            this.q = e;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((sp3) arrayList.get(i2)).L = this.q;
            }
        }
    }

    @Override // defpackage.me1
    public final s7b a(z7b z7bVar, xv8 xv8Var, long j) {
        sp3 sp3Var = new sp3(this.k.a(z7bVar, xv8Var, j), this.m, this.r, this.s, 0);
        this.n.add(sp3Var);
        return sp3Var;
    }

    @Override // defpackage.ae4, defpackage.me1
    public final void i() throws ClippingMediaSource$IllegalClippingException {
        ClippingMediaSource$IllegalClippingException clippingMediaSource$IllegalClippingException = this.q;
        if (clippingMediaSource$IllegalClippingException != null) {
            throw clippingMediaSource$IllegalClippingException;
        }
        super.i();
    }

    @Override // defpackage.me1
    public final void m(s7b s7bVar) {
        ArrayList arrayList = this.n;
        fd9.M(arrayList.remove(s7bVar));
        this.k.m(((sp3) s7bVar).E);
        if (arrayList.isEmpty()) {
            up3 up3Var = this.p;
            up3Var.getClass();
            B(up3Var.b);
        }
    }

    @Override // defpackage.ae4, defpackage.me1
    public final void o() {
        super.o();
        this.q = null;
        this.p = null;
    }

    @Override // defpackage.oij
    public final void y(mqh mqhVar) {
        if (this.q != null) {
            return;
        }
        B(mqhVar);
    }
}
