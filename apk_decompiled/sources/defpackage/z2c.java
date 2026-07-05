package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class z2c {
    public static final u2c a;
    public static final u2c b;

    static {
        u2c u2cVar = null;
        try {
            u2cVar = (u2c) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = u2cVar;
        b = new u2c();
    }
}
