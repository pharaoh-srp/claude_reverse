package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class osa {
    public static final jsa a;
    public static final jsa b;

    static {
        oud oudVar = oud.c;
        jsa jsaVar = null;
        try {
            jsaVar = (jsa) Class.forName("androidx.health.platform.client.proto.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = jsaVar;
        b = new jsa();
    }
}
