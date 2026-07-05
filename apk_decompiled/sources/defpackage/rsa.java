package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class rsa {
    public static final msa a;
    public static final msa b;

    static {
        Class cls = az.a;
        msa msaVar = null;
        try {
            msaVar = (msa) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = msaVar;
        b = new msa();
    }
}
