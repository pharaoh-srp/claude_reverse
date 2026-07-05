package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wt extends m08 implements pz7 {
    public static final wt E = new wt(2, mwa.class, "max", "max(II)I", 1);

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return Integer.valueOf(Math.max(((Number) obj).intValue(), ((Number) obj2).intValue()));
    }
}
