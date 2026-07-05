package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class yc7 {
    public static final tc7 a = new tc7();
    public static final tc7 b;

    static {
        tc7 tc7Var = null;
        try {
            tc7Var = (tc7) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = tc7Var;
    }
}
