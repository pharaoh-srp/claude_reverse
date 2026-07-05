package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kh1 extends ud1 {
    public final /* synthetic */ int b;
    public final int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kh1(ml4 ml4Var, int i) {
        super(ml4Var);
        this.b = i;
        ml4Var.getClass();
        switch (i) {
            case 2:
                super(ml4Var);
                this.c = 9;
                break;
            default:
                this.c = 6;
                break;
        }
    }

    @Override // defpackage.ll4
    public final boolean b(tgj tgjVar) {
        switch (this.b) {
            case 0:
                return tgjVar.j.i();
            case 1:
                return tgjVar.j.h();
            default:
                return tgjVar.j.k();
        }
    }

    @Override // defpackage.ud1
    public final int c() {
        switch (this.b) {
        }
        return this.c;
    }

    @Override // defpackage.ud1
    public final boolean d(Object obj) {
        boolean zBooleanValue;
        switch (this.b) {
            case 0:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
            case 1:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
            default:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
        }
        return !zBooleanValue;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kh1(lh1 lh1Var) {
        super(lh1Var);
        this.b = 1;
        lh1Var.getClass();
        this.c = 5;
    }
}
