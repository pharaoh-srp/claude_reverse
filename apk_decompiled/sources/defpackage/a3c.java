package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class a3c {
    public static final v2c a;
    public static final v2c b;

    static {
        Class cls = az.a;
        v2c v2cVar = null;
        try {
            v2cVar = (v2c) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = v2cVar;
        b = new v2c();
    }
}
