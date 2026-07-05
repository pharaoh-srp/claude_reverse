package defpackage;

import com.anthropic.claude.types.strings.ChatId;
import com.anthropic.claude.types.strings.ResearchMode;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m0i extends m08 implements rz7, uzg {
    public final /* synthetic */ int E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0i(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.E = i3;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str;
        switch (this.E) {
            case 0:
                String strM984unboximpl = ((ChatId) obj).m984unboximpl();
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                xa3 xa3Var = (xa3) this.receiver;
                xa3Var.getClass();
                return xa3Var.a(strM984unboximpl, new q8(zBooleanValue, 19), new te(16), (tp4) obj3);
            case 1:
                String strM984unboximpl2 = ((ChatId) obj).m984unboximpl();
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                tp4 tp4Var = (tp4) obj3;
                xa3 xa3Var2 = (xa3) this.receiver;
                xa3Var2.getClass();
                if (zBooleanValue2) {
                    ResearchMode.Companion.getClass();
                    str = ResearchMode.ADVANCED;
                } else {
                    ResearchMode.Companion.getClass();
                    str = ResearchMode.NONE;
                }
                return xa3Var2.a(strM984unboximpl2, new w43(str, 5), new te(20), tp4Var);
            default:
                String strM984unboximpl3 = ((ChatId) obj).m984unboximpl();
                boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                xa3 xa3Var3 = (xa3) this.receiver;
                xa3Var3.getClass();
                return xa3Var3.a(strM984unboximpl3, new q8(zBooleanValue3, 21), new te(19), (tp4) obj3);
        }
    }
}
