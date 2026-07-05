package defpackage;

import com.anthropic.claude.code.remote.c;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ls0 extends pd implements zy7 {
    public final /* synthetic */ int L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ls0(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.L = i3;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.L;
        iei ieiVar = iei.a;
        Object obj = this.E;
        switch (i) {
            case 0:
                pwd pwdVar = (pwd) obj;
                gb9.D(pwdVar.a, null, null, new l6b(pwdVar, null, 5), 3);
                break;
            case 1:
                ((c) obj).d0(false);
                break;
            case 2:
                ((c) obj).d0(false);
                break;
            default:
                ((c) obj).d0(false);
                break;
        }
        return ieiVar;
    }
}
