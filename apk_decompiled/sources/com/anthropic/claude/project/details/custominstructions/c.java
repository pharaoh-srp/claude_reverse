package com.anthropic.claude.project.details.custominstructions;

import defpackage.iei;
import defpackage.l45;
import defpackage.pz7;
import defpackage.tp4;
import defpackage.xzg;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends xzg implements pz7 {
    public d E;
    public int F;
    public final /* synthetic */ d G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.G = dVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        return new c(this.G, tp4Var);
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((l45) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d2, code lost:
    
        if (r1.b(r21, defpackage.kj6.E) != r9) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c8  */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.project.details.custominstructions.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
