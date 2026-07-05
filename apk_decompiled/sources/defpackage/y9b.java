package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class y9b extends ts9 implements zy7 {
    public final /* synthetic */ bab F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ ctd H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y9b(bab babVar, boolean z, ctd ctdVar) {
        super(0);
        this.F = babVar;
        this.G = z;
        this.H = ctdVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        List listP1;
        bab babVar = this.F;
        wk wkVar = babVar.a;
        a0 a0VarA = babVar.a((bo5) wkVar.a);
        if (a0VarA != null) {
            r06 r06Var = (r06) wkVar.d;
            boolean z = this.G;
            ctd ctdVar = this.H;
            listP1 = z ? w44.p1(r06Var.e.u(a0VarA, ctdVar)) : w44.p1(r06Var.e.p(a0VarA, ctdVar));
        } else {
            listP1 = null;
        }
        return listP1 == null ? lm6.E : listP1;
    }
}
