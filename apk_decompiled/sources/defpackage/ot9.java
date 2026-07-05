package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ot9 implements aad {
    public static final ide b = new ide("\ue000(\\d+)\ue001");
    public final List a;

    public ot9(List list) {
        list.getClass();
        this.a = list;
    }

    public static final String b(ot9 ot9Var, String str) {
        if (!bsg.v0(str, (char) 57344)) {
            return str;
        }
        return b.g(str, new tl8(6, ot9Var));
    }

    @Override // defpackage.aad
    public final b5c a(b5c b5cVar) {
        b5cVar.getClass();
        if (this.a.isEmpty()) {
            return b5cVar;
        }
        b5cVar.a(new p25(this));
        return b5cVar;
    }
}
