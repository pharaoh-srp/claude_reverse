package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class to8 extends ts9 implements pz7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ uo8[] G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ to8(uo8[] uo8VarArr, int i) {
        super(2);
        this.F = i;
        this.G = uo8VarArr;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.F;
        uo8[] uo8VarArr = this.G;
        switch (i) {
            case 0:
                return Float.valueOf(dtk.g((b3d) obj, true, uo8VarArr, ((Number) obj2).floatValue()));
            default:
                return Float.valueOf(dtk.g((b3d) obj, false, uo8VarArr, ((Number) obj2).floatValue()));
        }
    }
}
