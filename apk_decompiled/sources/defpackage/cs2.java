package defpackage;

import com.anthropic.claude.api.account.MemoryMode;
import com.anthropic.claude.api.chat.ChatFeedbackType;

/* JADX INFO: loaded from: classes2.dex */
public final class cs2 extends iwe {
    public final String b;
    public final int c;
    public final koi d;
    public final String e;
    public final dl2 f;
    public final qi3 g;
    public final b1i h;
    public final wbb i;
    public final zy1 j;
    public final lsc k;
    public final lsc l;
    public final lsc m;
    public final lsc n;
    public final wz5 o;
    public final wz5 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cs2(String str, int i, ChatFeedbackType chatFeedbackType, String str2, koi koiVar, String str3, dl2 dl2Var, qi3 qi3Var, b1i b1iVar, wbb wbbVar, h86 h86Var) {
        super(h86Var);
        str.getClass();
        chatFeedbackType.getClass();
        str3.getClass();
        this.b = str;
        this.c = i;
        this.d = koiVar;
        this.e = str3;
        this.f = dl2Var;
        this.g = qi3Var;
        this.h = b1iVar;
        this.i = wbbVar;
        this.j = x44.a();
        String str4 = str2 == null ? "" : str2;
        final int i2 = 0;
        int length = str2 != null ? str2.length() : 0;
        this.k = mpk.P(new cjh(str4, mwa.m(length, length), 4));
        this.l = mpk.P(chatFeedbackType);
        Boolean bool = Boolean.FALSE;
        this.m = mpk.P(bool);
        this.n = mpk.P(bool);
        this.o = mpk.w(new zy7(this) { // from class: as2
            public final /* synthetic */ cs2 F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i3 = i2;
                cs2 cs2Var = this.F;
                switch (i3) {
                    case 0:
                        return Boolean.valueOf(cs2Var.d.i());
                    default:
                        return Boolean.valueOf(cs2Var.h.d() || ((MemoryMode) cs2Var.i.a.getValue()) != null);
                }
            }
        });
        final int i3 = 1;
        this.p = mpk.w(new zy7(this) { // from class: as2
            public final /* synthetic */ cs2 F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i32 = i3;
                cs2 cs2Var = this.F;
                switch (i32) {
                    case 0:
                        return Boolean.valueOf(cs2Var.d.i());
                    default:
                        return Boolean.valueOf(cs2Var.h.d() || ((MemoryMode) cs2Var.i.a.getValue()) != null);
                }
            }
        });
    }
}
