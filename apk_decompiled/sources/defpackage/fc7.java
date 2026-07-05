package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class fc7 {
    public static final Class a;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.health.platform.client.proto.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        a = cls;
    }
}
