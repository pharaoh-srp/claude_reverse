package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class g9a {
    public static final d9a a;
    public static final d9a b;

    static {
        Class cls = az.a;
        d9a d9aVar = null;
        try {
            d9aVar = (d9a) Class.forName("androidx.datastore.preferences.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = d9aVar;
        b = new d9a();
    }
}
