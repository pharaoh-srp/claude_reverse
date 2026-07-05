package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class w2c {
    public static final r2c a;
    public static final r2c b;

    static {
        nud nudVar = nud.c;
        r2c r2cVar = null;
        try {
            r2cVar = (r2c) Class.forName("androidx.glance.appwidget.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = r2cVar;
        b = new r2c();
    }
}
