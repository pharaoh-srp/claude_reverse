package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class gag extends m08 implements pz7 {
    public static final gag E = new gag(2, mwa.class, "min", "min(II)I", 1);

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return Integer.valueOf(Math.min(((Number) obj).intValue(), ((Number) obj2).intValue()));
    }
}
