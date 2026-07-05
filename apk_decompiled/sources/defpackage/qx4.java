package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class qx4 extends m08 implements pz7 {
    public static final qx4 E = new qx4(2, Integer.TYPE, "plus", "plus(I)I", 0);

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return Integer.valueOf(((Number) obj2).intValue() + ((Number) obj).intValue());
    }
}
