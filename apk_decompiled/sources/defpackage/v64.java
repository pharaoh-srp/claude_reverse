package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class v64 extends xzg implements pz7 {
    public int E;
    public final /* synthetic */ kp7[] F;
    public final /* synthetic */ int G;
    public final /* synthetic */ AtomicInteger H;
    public final /* synthetic */ zy1 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v64(kp7[] kp7VarArr, int i, AtomicInteger atomicInteger, zy1 zy1Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.F = kp7VarArr;
        this.G = i;
        this.H = atomicInteger;
        this.I = zy1Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        return new v64(this.F, this.G, this.H, this.I, tp4Var);
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((v64) create((l45) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        AtomicInteger atomicInteger = this.H;
        zy1 zy1Var = this.I;
        try {
            if (i == 0) {
                sf5.h0(obj);
                kp7[] kp7VarArr = this.F;
                int i2 = this.G;
                kp7 kp7Var = kp7VarArr[i2];
                u64 u64Var = new u64(zy1Var, i2);
                this.E = 1;
                Object objA = kp7Var.a(u64Var, this);
                m45 m45Var = m45.E;
                if (objA == m45Var) {
                    return m45Var;
                }
            } else {
                if (i != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sf5.h0(obj);
            }
            if (atomicInteger.decrementAndGet() == 0) {
                zy1Var.m(null);
            }
            return iei.a;
        } finally {
            if (atomicInteger.decrementAndGet() == 0) {
                zy1Var.m(null);
            }
        }
    }
}
