package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class wc7 {
    public static final rc7 a = new rc7();
    public static final rc7 b;

    static {
        oud oudVar = oud.c;
        rc7 rc7Var = null;
        try {
            rc7Var = (rc7) Class.forName("androidx.health.platform.client.proto.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = rc7Var;
    }
}
