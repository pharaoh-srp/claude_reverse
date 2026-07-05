package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public final class ih2 extends lh2 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater J = AtomicIntegerFieldUpdater.newUpdater(ih2.class, "consumed$volatile");
    public final d6e H;
    public final boolean I;
    private volatile /* synthetic */ int consumed$volatile;

    public /* synthetic */ ih2(d6e d6eVar, boolean z) {
        this(d6eVar, z, im6.E, -3, py1.E);
    }

    @Override // defpackage.lh2, defpackage.kp7
    public final Object a(lp7 lp7Var, tp4 tp4Var) {
        int i = this.F;
        m45 m45Var = m45.E;
        if (i == -3) {
            boolean z = this.I;
            if (z && J.getAndSet(this, 1) == 1) {
                sz6.j("ReceiveChannel.consumeAsFlow can be collected just once");
                return null;
            }
            Object objQ = u00.q(lp7Var, this.H, z, tp4Var);
            if (objQ == m45Var) {
                return objQ;
            }
        } else {
            Object objA = super.a(lp7Var, tp4Var);
            if (objA == m45Var) {
                return objA;
            }
        }
        return iei.a;
    }

    @Override // defpackage.lh2
    public final String d() {
        return "channel=" + this.H;
    }

    @Override // defpackage.lh2
    public final Object g(aid aidVar, tp4 tp4Var) throws Throwable {
        Object objQ = u00.q(new bmf(aidVar), this.H, this.I, tp4Var);
        return objQ == m45.E ? objQ : iei.a;
    }

    @Override // defpackage.lh2
    public final lh2 h(c45 c45Var, int i, py1 py1Var) {
        return new ih2(this.H, this.I, c45Var, i, py1Var);
    }

    @Override // defpackage.lh2
    public final kp7 i() {
        return new ih2(this.H, this.I);
    }

    @Override // defpackage.lh2
    public final d6e j(l45 l45Var) {
        if (!this.I || J.getAndSet(this, 1) != 1) {
            return this.F == -3 ? this.H : super.j(l45Var);
        }
        sz6.j("ReceiveChannel.consumeAsFlow can be collected just once");
        return null;
    }

    public ih2(d6e d6eVar, boolean z, c45 c45Var, int i, py1 py1Var) {
        super(c45Var, i, py1Var);
        this.H = d6eVar;
        this.I = z;
    }
}
