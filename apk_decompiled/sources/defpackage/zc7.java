package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class zc7 {
    public static final uc7 a = new uc7();
    public static final uc7 b;

    static {
        Class cls = az.a;
        uc7 uc7Var = null;
        try {
            uc7Var = (uc7) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = uc7Var;
    }
}
