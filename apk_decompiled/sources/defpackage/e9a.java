package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e9a {
    public static final b9a a;
    public static final b9a b;

    static {
        nud nudVar = nud.c;
        b9a b9aVar = null;
        try {
            b9aVar = (b9a) Class.forName("androidx.glance.appwidget.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = b9aVar;
        b = new b9a();
    }
}
