package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class v71 implements tac {
    public static final v71 a = new v71();
    public static final mh7 b = new mh7("eventsDroppedCount", ebh.t(ebh.s(qud.class, new r11(1))));
    public static final mh7 c = new mh7("reason", ebh.t(ebh.s(qud.class, new r11(3))));

    @Override // defpackage.cn6
    public final void a(Object obj, Object obj2) {
        ofa ofaVar = (ofa) obj;
        uac uacVar = (uac) obj2;
        uacVar.e(b, ofaVar.a);
        uacVar.a(c, ofaVar.b);
    }
}
