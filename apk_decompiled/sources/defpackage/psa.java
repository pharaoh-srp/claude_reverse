package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class psa {
    public static final ksa a;
    public static final ksa b;

    static {
        ksa ksaVar = null;
        try {
            ksaVar = (ksa) Class.forName("com.google.crypto.tink.shaded.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = ksaVar;
        b = new ksa();
    }
}
