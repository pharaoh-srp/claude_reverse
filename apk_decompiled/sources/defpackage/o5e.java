package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class o5e extends c5h {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5e(p5e p5eVar) {
        super(ij0.m(new StringBuilder(), p5eVar.n, " writer"), true);
        this.f = p5eVar;
    }

    @Override // defpackage.c5h
    public final long a() {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                p5e p5eVar = (p5e) obj;
                try {
                    break;
                } catch (IOException e) {
                    p5e.e(p5eVar, e, null, 2);
                }
                return p5eVar.j() ? 0L : -1L;
            default:
                return ((Number) ((zy7) obj).a()).longValue();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5e(zy7 zy7Var, String str) {
        super(str, true);
        this.f = zy7Var;
    }
}
