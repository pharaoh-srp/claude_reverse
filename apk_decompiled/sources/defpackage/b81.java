package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class b81 implements tac {
    public static final b81 a = new b81();
    public static final mh7 b = new mh7("currentCacheSizeBytes", ebh.t(ebh.s(qud.class, new r11(1))));
    public static final mh7 c = new mh7("maxCacheSizeBytes", ebh.t(ebh.s(qud.class, new r11(2))));

    @Override // defpackage.cn6
    public final void a(Object obj, Object obj2) {
        cpg cpgVar = (cpg) obj;
        uac uacVar = (uac) obj2;
        uacVar.e(b, cpgVar.a);
        uacVar.e(c, cpgVar.b);
    }
}
