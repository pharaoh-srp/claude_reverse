package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class t4d {
    public static final o30 a;
    public static final vz8 b;
    public static final lja c;

    static {
        String property = System.getProperty("java.vm.name");
        property.getClass();
        if (property.equals("RoboVM")) {
            a = null;
            b = new vz8(26);
            c = new lja(14);
        } else if (property.equals("Dalvik")) {
            a = new o30();
            b = new hce(26);
            c = new nz1(14);
        } else {
            a = null;
            b = new ice();
            c = new nz1(14);
        }
    }
}
