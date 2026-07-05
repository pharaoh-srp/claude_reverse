package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class bmg {
    public static final sqb a = new sqb("NONE", 1);
    public static final sqb b = new sqb("PENDING", 1);

    public static final amg a(Object obj) {
        if (obj == null) {
            obj = l9c.a;
        }
        return new amg(obj);
    }
}
