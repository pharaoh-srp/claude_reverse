package defpackage;

import com.anthropic.claude.api.mcp.McpServer;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class qb2 extends iwe {
    public static final /* synthetic */ int w = 0;
    public final q0i b;
    public final f9 c;
    public final koi d;
    public final qi3 e;
    public final kab f;
    public final bcb g;
    public final wbb h;
    public final b1i i;
    public final qs2 j;
    public final tg7 k;
    public final zy1 l;
    public final cbf m;
    public final cbf n;
    public final lsc o;
    public final lsc p;
    public final wz5 q;
    public final wz5 r;
    public final wz5 s;
    public final wz5 t;
    public final cbf u;
    public final lsc v;

    static {
        o0i o0iVar = q0i.G;
    }

    public qb2(q0i q0iVar, f9 f9Var, koi koiVar, qi3 qi3Var, kab kabVar, bcb bcbVar, wbb wbbVar, b1i b1iVar, qs2 qs2Var, tg7 tg7Var, h86 h86Var) {
        super(h86Var);
        this.b = q0iVar;
        this.c = f9Var;
        this.d = koiVar;
        this.e = qi3Var;
        this.f = kabVar;
        this.g = bcbVar;
        this.h = wbbVar;
        this.i = b1iVar;
        this.j = qs2Var;
        this.k = tg7Var;
        this.l = x44.a();
        tp4 tp4Var = null;
        final int i = 1;
        final int i2 = 0;
        this.m = new cbf(new bz7(this) { // from class: lb2
            public final /* synthetic */ qb2 F;

            {
                this.F = this;
            }

            @Override // defpackage.bz7
            public final Object invoke(Object obj) {
                int i3 = i2;
                iei ieiVar = iei.a;
                qb2 qb2Var = this.F;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                switch (i3) {
                    case 0:
                        f9 f9Var2 = qb2Var.c;
                        f9Var2.getClass();
                        f9Var2.d(new q8(zBooleanValue, 6));
                        break;
                    case 1:
                        f9 f9Var3 = qb2Var.c;
                        f9Var3.getClass();
                        f9Var3.d(new q8(zBooleanValue, 4));
                        break;
                    default:
                        f9 f9Var4 = qb2Var.c;
                        f9Var4.getClass();
                        f9Var4.d(new q8(zBooleanValue, 3));
                        break;
                }
                return ieiVar;
            }
        }, new ob2(this, tp4Var, i));
        this.n = new cbf(new bz7(this) { // from class: lb2
            public final /* synthetic */ qb2 F;

            {
                this.F = this;
            }

            @Override // defpackage.bz7
            public final Object invoke(Object obj) {
                int i3 = i;
                iei ieiVar = iei.a;
                qb2 qb2Var = this.F;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                switch (i3) {
                    case 0:
                        f9 f9Var2 = qb2Var.c;
                        f9Var2.getClass();
                        f9Var2.d(new q8(zBooleanValue, 6));
                        break;
                    case 1:
                        f9 f9Var3 = qb2Var.c;
                        f9Var3.getClass();
                        f9Var3.d(new q8(zBooleanValue, 4));
                        break;
                    default:
                        f9 f9Var4 = qb2Var.c;
                        f9Var4.getClass();
                        f9Var4.d(new q8(zBooleanValue, 3));
                        break;
                }
                return ieiVar;
            }
        }, new ob2(this, tp4Var, i2));
        this.o = mpk.P(null);
        this.p = mpk.P(Boolean.valueOf(b1iVar.d() && U()));
        final int i3 = 3;
        gb9.D(this.a, null, null, new nb2(this, tp4Var, i2), 3);
        if (b1iVar.d() && U()) {
            gb9.D(this.a, null, null, new kk0(this, tp4Var, 8), 3);
        }
        a5 a5Var = a5.N;
        this.q = mpk.x(new zy7(this) { // from class: mb2
            public final /* synthetic */ qb2 F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i4 = i2;
                ynb ynbVar = ynb.a;
                qb2 qb2Var = this.F;
                switch (i4) {
                    case 0:
                        return qb2Var.b.z.h(null, ynbVar);
                    case 1:
                        return qb2Var.b.A.h(null, ynbVar);
                    case 2:
                        return qb2Var.b.B.h(null, ynbVar);
                    default:
                        return qb2Var.b.F.h(null, ynbVar);
                }
            }
        }, a5Var);
        this.r = mpk.x(new zy7(this) { // from class: mb2
            public final /* synthetic */ qb2 F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i4 = i;
                ynb ynbVar = ynb.a;
                qb2 qb2Var = this.F;
                switch (i4) {
                    case 0:
                        return qb2Var.b.z.h(null, ynbVar);
                    case 1:
                        return qb2Var.b.A.h(null, ynbVar);
                    case 2:
                        return qb2Var.b.B.h(null, ynbVar);
                    default:
                        return qb2Var.b.F.h(null, ynbVar);
                }
            }
        }, a5Var);
        final int i4 = 2;
        this.s = mpk.x(new zy7(this) { // from class: mb2
            public final /* synthetic */ qb2 F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i42 = i4;
                ynb ynbVar = ynb.a;
                qb2 qb2Var = this.F;
                switch (i42) {
                    case 0:
                        return qb2Var.b.z.h(null, ynbVar);
                    case 1:
                        return qb2Var.b.A.h(null, ynbVar);
                    case 2:
                        return qb2Var.b.B.h(null, ynbVar);
                    default:
                        return qb2Var.b.F.h(null, ynbVar);
                }
            }
        }, a5Var);
        this.t = mpk.x(new zy7(this) { // from class: mb2
            public final /* synthetic */ qb2 F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i42 = i3;
                ynb ynbVar = ynb.a;
                qb2 qb2Var = this.F;
                switch (i42) {
                    case 0:
                        return qb2Var.b.z.h(null, ynbVar);
                    case 1:
                        return qb2Var.b.A.h(null, ynbVar);
                    case 2:
                        return qb2Var.b.B.h(null, ynbVar);
                    default:
                        return qb2Var.b.F.h(null, ynbVar);
                }
            }
        }, a5Var);
        this.u = new cbf(new bz7(this) { // from class: lb2
            public final /* synthetic */ qb2 F;

            {
                this.F = this;
            }

            @Override // defpackage.bz7
            public final Object invoke(Object obj) {
                int i32 = i4;
                iei ieiVar = iei.a;
                qb2 qb2Var = this.F;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                switch (i32) {
                    case 0:
                        f9 f9Var2 = qb2Var.c;
                        f9Var2.getClass();
                        f9Var2.d(new q8(zBooleanValue, 6));
                        break;
                    case 1:
                        f9 f9Var3 = qb2Var.c;
                        f9Var3.getClass();
                        f9Var3.d(new q8(zBooleanValue, 4));
                        break;
                    default:
                        f9 f9Var4 = qb2Var.c;
                        f9Var4.getClass();
                        f9Var4.d(new q8(zBooleanValue, 3));
                        break;
                }
                return ieiVar;
            }
        }, new ob2(this, tp4Var, i4));
        this.v = mpk.P(Boolean.FALSE);
    }

    public static final void O(qb2 qb2Var) {
        if (qb2Var.U() && qb2Var.i.d()) {
            gb9.D(qb2Var.a, null, null, new nb2(qb2Var, null, 1), 3);
        }
    }

    public final szh P() {
        return (szh) this.s.getValue();
    }

    public final szh Q() {
        return (szh) this.r.getValue();
    }

    public final McpServer R() {
        Object next;
        Iterator<E> it = this.d.q.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (x44.r(((McpServer) next).getName(), "visualize")) {
                break;
            }
        }
        return (McpServer) next;
    }

    public final szh S() {
        return (szh) this.q.getValue();
    }

    public final szh T() {
        return (szh) this.t.getValue();
    }

    public final boolean U() {
        return x44.r((Boolean) this.d.l.getValue(), Boolean.TRUE);
    }

    public final void V(boolean z) {
        this.v.setValue(Boolean.valueOf(z));
    }
}
