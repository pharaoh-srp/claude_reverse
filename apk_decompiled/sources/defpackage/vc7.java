package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class vc7 {
    public static final qc7 a = new qc7();
    public static final qc7 b;

    static {
        nud nudVar = nud.c;
        qc7 qc7Var = null;
        try {
            qc7Var = (qc7) Class.forName("androidx.glance.appwidget.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = qc7Var;
    }
}
