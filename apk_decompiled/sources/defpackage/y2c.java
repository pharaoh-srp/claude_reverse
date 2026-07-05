package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class y2c {
    public static final t2c a;
    public static final t2c b;

    static {
        t2c t2cVar = null;
        try {
            t2cVar = (t2c) Class.forName("com.google.crypto.tink.shaded.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = t2cVar;
        b = new t2c();
    }
}
