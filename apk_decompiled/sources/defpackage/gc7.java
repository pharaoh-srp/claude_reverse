package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gc7 {
    public static final Class a;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        a = cls;
    }
}
