package com.anthropic.claude.conway.protocol;

import defpackage.bsg;
import defpackage.c61;
import defpackage.ex4;
import defpackage.f4e;
import defpackage.hdc;
import defpackage.hre;
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
import defpackage.rqe;
import defpackage.sf5;
import defpackage.sie;
import defpackage.tie;
import defpackage.tp4;
import defpackage.us8;
import defpackage.xzg;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class x extends xzg implements pz7 {
    public /* synthetic */ Object E;
    public final /* synthetic */ c61 F;
    public final /* synthetic */ byte[] G;
    public final /* synthetic */ boolean H;
    public final /* synthetic */ String I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(c61 c61Var, byte[] bArr, boolean z, String str, tp4 tp4Var) {
        super(2, tp4Var);
        this.F = c61Var;
        this.G = bArr;
        this.H = z;
        this.I = str;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        x xVar = new x(this.F, this.G, this.H, this.I, tp4Var);
        xVar.E = obj;
        return xVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        x xVar = (x) create((l45) obj, (tp4) obj2);
        iei ieiVar = iei.a;
        xVar.invokeSuspend(ieiVar);
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        Object hreVar;
        sf5.h0(obj);
        c61 c61Var = this.F;
        String str = (String) c61Var.F;
        str.getClass();
        us8 us8Var = new us8();
        Object obj2 = null;
        us8Var.h(null, str);
        us8 us8VarF = us8Var.c().f();
        us8VarF.a("plugins");
        us8VarF.a("install");
        if (this.H) {
            us8VarF.b("force", "true");
        }
        String str2 = us8VarF.c().i;
        sie sieVar = tie.Companion;
        ide ideVar = p8b.e;
        rie rieVarC = sie.c(sieVar, this.G, nai.D("application/zip"), 0, 6);
        jie jieVarC = c61.c(c61Var, str2);
        jieVarC.e("POST", rieVarC);
        pqe pqeVarF = new f4e((hdc) c61Var.H, new kie(jieVarC), false).f();
        rqe rqeVar = pqeVarF.K;
        String str3 = this.I;
        try {
            if (pqeVarF.U) {
                pqeVarF.close();
                return iei.a;
            }
            int i = pqeVarF.H;
            if (i != 409) {
                throw new IOException("install plugin: HTTP " + i + " " + rqeVar.f());
            }
            try {
                hreVar = ((ConwayExtensionsClient$ConflictBody) ex4.a.b(rqeVar.f(), ConwayExtensionsClient$ConflictBody.Companion.serializer())).getName();
            } catch (Throwable th) {
                hreVar = new hre(th);
            }
            if (!(hreVar instanceof hre)) {
                obj2 = hreVar;
            }
            String strT0 = (String) obj2;
            if (strT0 == null) {
                strT0 = bsg.T0(str3, ".cnw.zip");
            }
            throw new ExtensionExistsException("plugin '" + strT0 + "' already installed");
        } finally {
        }
    }
}
