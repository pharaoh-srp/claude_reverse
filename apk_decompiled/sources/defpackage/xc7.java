package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class xc7 {
    public static final sc7 a = new sc7();
    public static final sc7 b;

    static {
        sc7 sc7Var = null;
        try {
            sc7Var = (sc7) Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = sc7Var;
    }
}
