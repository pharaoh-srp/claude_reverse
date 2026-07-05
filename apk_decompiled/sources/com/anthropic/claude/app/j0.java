package com.anthropic.claude.app;

import android.content.Context;
import defpackage.iei;
import defpackage.pz7;
import defpackage.qzb;
import defpackage.tp4;
import defpackage.vhc;
import defpackage.xzg;
import defpackage.ybg;
import defpackage.zqc;

/* JADX INFO: loaded from: classes.dex */
public final class j0 extends xzg implements pz7 {
    public int E;
    public /* synthetic */ Object F;
    public final /* synthetic */ qzb G;
    public final /* synthetic */ zqc H;
    public final /* synthetic */ com.anthropic.claude.code.remote.stores.b I;
    public final /* synthetic */ ybg J;
    public final /* synthetic */ Context K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(qzb qzbVar, zqc zqcVar, com.anthropic.claude.code.remote.stores.b bVar, ybg ybgVar, Context context, tp4 tp4Var) {
        super(2, tp4Var);
        this.G = qzbVar;
        this.H = zqcVar;
        this.I = bVar;
        this.J = ybgVar;
        this.K = context;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        j0 j0Var = new j0(this.G, this.H, this.I, this.J, this.K, tp4Var);
        j0Var.F = obj;
        return j0Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((j0) create((vhc) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ae, code lost:
    
        if (r2 == r9) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0109  */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.app.j0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
