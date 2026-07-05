package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class w71 implements tac {
    public static final w71 a = new w71();
    public static final mh7 b = new mh7("logSource", ebh.t(ebh.s(qud.class, new r11(1))));
    public static final mh7 c = new mh7("logEventDropped", ebh.t(ebh.s(qud.class, new r11(2))));

    @Override // defpackage.cn6
    public final void a(Object obj, Object obj2) {
        wfa wfaVar = (wfa) obj;
        uac uacVar = (uac) obj2;
        uacVar.a(b, wfaVar.a);
        uacVar.a(c, wfaVar.b);
    }
}
