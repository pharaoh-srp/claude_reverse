package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f9a {
    public static final c9a a;
    public static final c9a b;

    static {
        oud oudVar = oud.c;
        c9a c9aVar = null;
        try {
            c9aVar = (c9a) Class.forName("androidx.health.platform.client.proto.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = c9aVar;
        b = new c9a();
    }
}
