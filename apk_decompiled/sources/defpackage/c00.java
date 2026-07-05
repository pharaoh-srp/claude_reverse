package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class c00 extends ts9 implements bz7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c00(int i, int i2) {
        super(1);
        this.F = i2;
        this.G = i;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.F;
        int i2 = this.G;
        switch (i) {
            case 0:
                return Boolean.valueOf(((jt7) obj).w1(i2));
            case 1:
                return Boolean.valueOf(((jt7) obj).w1(i2));
            case 2:
                return Boolean.valueOf(((jt7) obj).w1(i2));
            case 3:
                return Boolean.valueOf(((jt7) obj).w1(i2));
            default:
                return Boolean.valueOf(((jt7) obj).p1(i2));
        }
    }
}
