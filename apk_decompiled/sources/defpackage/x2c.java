package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class x2c {
    public static final s2c a;
    public static final s2c b;

    static {
        oud oudVar = oud.c;
        s2c s2cVar = null;
        try {
            s2cVar = (s2c) Class.forName("androidx.health.platform.client.proto.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = s2cVar;
        b = new s2c();
    }
}
