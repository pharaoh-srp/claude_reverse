package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class da3 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ bz7 F;

    public /* synthetic */ da3(int i, bz7 bz7Var) {
        this.E = i;
        this.F = bz7Var;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        bz7 bz7Var = this.F;
        switch (i) {
            case 0:
                cu9 cu9Var = (cu9) obj;
                cu9Var.getClass();
                bz7Var.invoke(Integer.valueOf((int) (cu9Var.k() & 4294967295L)));
                return iei.a;
            case 1:
                bf3 bf3Var = (bf3) obj;
                bf3Var.getClass();
                if (bf3Var.a.a instanceof j2g) {
                    return null;
                }
                return (qbd) bz7Var.invoke(bf3Var);
            case 2:
                return new of6((og6) obj, bz7Var);
            case 3:
                vi3 vi3Var = (vi3) obj;
                vi3Var.getClass();
                bz7Var.invoke(kga.a[vi3Var.ordinal()] == 1 ? xja.G : xja.F);
                return iei.a;
            case 4:
                rcg rcgVar = (rcg) bz7Var.invoke((wcg) obj);
                synchronized (ycg.c) {
                    ycg.d = ycg.d.k(rcgVar.g());
                }
                return rcgVar;
            default:
                Long l = (Long) obj;
                l.getClass();
                return bz7Var.invoke(l);
        }
    }
}
