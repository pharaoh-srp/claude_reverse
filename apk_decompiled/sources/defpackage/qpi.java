package defpackage;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public abstract class qpi {
    public static final /* synthetic */ int a = 0;

    static {
        Charset.forName("UTF-8");
    }

    public static iq9 a(dq9 dq9Var) {
        fq9 fq9VarZ = iq9.z();
        int iB = dq9Var.B();
        fq9VarZ.f();
        iq9.w((iq9) fq9VarZ.F, iB);
        for (cq9 cq9Var : dq9Var.A()) {
            gq9 gq9VarB = hq9.B();
            String strB = cq9Var.A().B();
            gq9VarB.f();
            hq9.w((hq9) gq9VarB.F, strB);
            dp9 dp9VarD = cq9Var.D();
            gq9VarB.f();
            hq9.y((hq9) gq9VarB.F, dp9VarD);
            bmc bmcVarC = cq9Var.C();
            gq9VarB.f();
            hq9.x((hq9) gq9VarB.F, bmcVarC);
            int iB2 = cq9Var.B();
            gq9VarB.f();
            hq9.z((hq9) gq9VarB.F, iB2);
            hq9 hq9Var = (hq9) gq9VarB.b();
            fq9VarZ.f();
            iq9.x((iq9) fq9VarZ.F, hq9Var);
        }
        return (iq9) fq9VarZ.b();
    }
}
