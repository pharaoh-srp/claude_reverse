package com.anthropic.claude.app;

import defpackage.b3f;
import defpackage.iei;
import defpackage.l45;
import defpackage.m45;
import defpackage.mpk;
import defpackage.nf7;
import defpackage.p7;
import defpackage.pz7;
import defpackage.qzb;
import defpackage.sf5;
import defpackage.sz6;
import defpackage.tp4;
import defpackage.xzg;
import defpackage.zqc;

/* JADX INFO: loaded from: classes.dex */
public final class k1 extends xzg implements pz7 {
    public int E;
    public final /* synthetic */ nf7 F;
    public final /* synthetic */ zqc G;
    public final /* synthetic */ qzb H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(nf7 nf7Var, zqc zqcVar, qzb qzbVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.F = nf7Var;
        this.G = zqcVar;
        this.H = qzbVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        return new k1(this.F, this.G, this.H, tp4Var);
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((k1) create((l45) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.E;
        if (i == 0) {
            sf5.h0(obj);
            nf7 nf7Var = this.F;
            b3f b3fVarD0 = mpk.d0(new p7(24, nf7Var));
            j1 j1Var = new j1(this.G, nf7Var, this.H);
            this.E = 1;
            Object objA = b3fVarD0.a(j1Var, this);
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
        return iei.a;
    }
}
