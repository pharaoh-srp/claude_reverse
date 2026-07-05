package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ma2 implements us7 {
    public static final ma2 a = new ma2();
    public static Boolean b;

    @Override // defpackage.us7
    public final boolean a() {
        Boolean bool = b;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw sq6.z("canFocus is read before it is written");
    }

    @Override // defpackage.us7
    public final void b(boolean z) {
        b = Boolean.valueOf(z);
    }
}
