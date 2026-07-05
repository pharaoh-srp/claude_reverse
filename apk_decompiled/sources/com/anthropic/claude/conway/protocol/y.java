package com.anthropic.claude.conway.protocol;

import defpackage.c61;
import defpackage.ex4;
import defpackage.f4e;
import defpackage.hdc;
import defpackage.ide;
import defpackage.iei;
import defpackage.jie;
import defpackage.kie;
import defpackage.l45;
import defpackage.nai;
import defpackage.p8b;
import defpackage.pqe;
import defpackage.pz7;
import defpackage.rie;
import defpackage.sf5;
import defpackage.sie;
import defpackage.tie;
import defpackage.tp4;
import defpackage.xzg;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class y extends xzg implements pz7 {
    public final /* synthetic */ String E;
    public final /* synthetic */ c61 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(String str, c61 c61Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = str;
        this.F = c61Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        return new y(this.E, this.F, tp4Var);
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        y yVar = (y) create((l45) obj, (tp4) obj2);
        iei ieiVar = iei.a;
        yVar.invokeSuspend(ieiVar);
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        sf5.h0(obj);
        sie sieVar = tie.Companion;
        String strD = ex4.a.d(new ConwayExtensionsClient$UninstallBody(this.E), ConwayExtensionsClient$UninstallBody.Companion.serializer());
        ide ideVar = p8b.e;
        p8b p8bVarD = nai.D("application/json");
        sieVar.getClass();
        rie rieVarB = sie.b(strD, p8bVarD);
        c61 c61Var = this.F;
        jie jieVarC = c61.c(c61Var, c61.d(c61Var, "plugins", "uninstall"));
        jieVarC.e("POST", rieVarB);
        pqe pqeVarF = new f4e((hdc) c61Var.H, new kie(jieVarC), false).f();
        try {
            if (pqeVarF.U) {
                pqeVarF.close();
                return iei.a;
            }
            throw new IOException("uninstall plugin: HTTP " + pqeVarF.H);
        } finally {
        }
    }
}
