package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class nsa {
    public static final isa a;
    public static final isa b;

    static {
        nud nudVar = nud.c;
        isa isaVar = null;
        try {
            isaVar = (isa) Class.forName("androidx.glance.appwidget.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = isaVar;
        b = new isa();
    }
}
