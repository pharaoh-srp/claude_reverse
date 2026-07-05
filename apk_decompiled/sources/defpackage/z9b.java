package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class z9b extends ts9 implements zy7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ bab G;
    public final /* synthetic */ ctd H;
    public final /* synthetic */ o16 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z9b(bab babVar, ctd ctdVar, o16 o16Var, int i) {
        super(0);
        this.F = i;
        this.G = babVar;
        this.H = ctdVar;
        this.I = o16Var;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.F;
        o16 o16Var = this.I;
        ctd ctdVar = this.H;
        bab babVar = this.G;
        switch (i) {
            case 0:
                wk wkVar = babVar.a;
                a0 a0VarA = babVar.a((bo5) wkVar.a);
                a0VarA.getClass();
                dc0 dc0Var = ((r06) wkVar.d).e;
                yr9 returnType = o16Var.getReturnType();
                returnType.getClass();
                return (il4) dc0Var.v(a0VarA, ctdVar, returnType);
            case 1:
                gfa gfaVar = ((r06) babVar.a.d).a;
                z9b z9bVar = new z9b(babVar, ctdVar, o16Var, 0);
                gfaVar.getClass();
                return new cfa(gfaVar, z9bVar);
            case 2:
                wk wkVar2 = babVar.a;
                a0 a0VarA2 = babVar.a((bo5) wkVar2.a);
                a0VarA2.getClass();
                dc0 dc0Var2 = ((r06) wkVar2.d).e;
                yr9 returnType2 = o16Var.getReturnType();
                returnType2.getClass();
                return (il4) dc0Var2.o(a0VarA2, ctdVar, returnType2);
            default:
                gfa gfaVar2 = ((r06) babVar.a.d).a;
                z9b z9bVar2 = new z9b(babVar, ctdVar, o16Var, 2);
                gfaVar2.getClass();
                return new cfa(gfaVar2, z9bVar2);
        }
    }
}
