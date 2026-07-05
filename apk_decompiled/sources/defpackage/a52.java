package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class a52 extends ts9 implements bz7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ bz7 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a52(int i, bz7 bz7Var) {
        super(1);
        this.F = i;
        this.G = bz7Var;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.F;
        bz7 bz7Var = this.G;
        switch (i) {
            case 0:
                cv9 cv9Var = (cv9) obj;
                bz7Var.invoke(cv9Var);
                cv9Var.a();
                break;
            case 1:
                long j = ((g79) obj).a;
                int i2 = (int) (j >> 32);
                break;
            case 2:
                long j2 = ((g79) obj).a;
                int i3 = (int) (j2 >> 32);
                break;
        }
        return new y69(((long) ((Number) bz7Var.invoke(Integer.valueOf((int) (((g79) obj).a & 4294967295L)))).intValue()) & 4294967295L);
    }
}
