package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final class pq5 extends hqb implements vd6 {
    public final w79 S;
    public boolean T;
    public boolean U;
    public boolean V;

    public pq5(w79 w79Var) {
        this.S = w79Var;
    }

    @Override // defpackage.vd6
    public final void I0(cv9 cv9Var) {
        cv9Var.a();
        ib2 ib2Var = cv9Var.E;
        if (this.T) {
            cv9Var.T0(d54.b(0.3f, d54.b), 0L, (58 & 4) != 0 ? xd6.h0(cv9Var.g(), 0L) : ib2Var.g(), (58 & 8) != 0 ? 1.0f : MTTypesetterKt.kLineSkipLimitMultiplier, (58 & 16) != 0 ? qk7.a : null, (58 & 32) != 0 ? null : null, (58 & 64) != 0 ? 3 : 0);
        } else if (this.U || this.V) {
            cv9Var.T0(d54.b(0.1f, d54.b), 0L, (58 & 4) != 0 ? xd6.h0(cv9Var.g(), 0L) : ib2Var.g(), (58 & 8) != 0 ? 1.0f : MTTypesetterKt.kLineSkipLimitMultiplier, (58 & 16) != 0 ? qk7.a : null, (58 & 32) != 0 ? null : null, (58 & 64) != 0 ? 3 : 0);
        }
    }

    @Override // defpackage.hqb
    public final void h1() {
        gb9.D(d1(), null, null, new cj(this, null, 20), 3);
    }
}
