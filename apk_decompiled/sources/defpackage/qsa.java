package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class qsa {
    public static final lsa a;
    public static final lsa b;

    static {
        lsa lsaVar = null;
        try {
            lsaVar = (lsa) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = lsaVar;
        b = new lsa();
    }
}
