package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.chat.bottomsheet.f;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xn extends m08 implements zy7 {
    public final /* synthetic */ int E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xn(int i, Object obj) {
        super(0, 1, f.class, obj, "dismiss", "dismiss(Lcom/anthropic/router/stack/Router;)V");
        this.E = i;
        switch (i) {
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                super(0, 1, f.class, obj, "dismiss", "dismiss(Lcom/anthropic/router/stack/Router;)V");
                break;
            case 26:
                super(0, 0, t53.class, obj, "refreshOrRetryPartialResponseMessage", "refreshOrRetryPartialResponseMessage()V");
                break;
            case 27:
                super(0, 0, t53.class, obj, "connectPendingMcpAuth", "connectPendingMcpAuth()V");
                break;
            case 29:
                super(0, 0, t53.class, obj, "dismissAttachmentLimitNotice", "dismissAttachmentLimitNotice()V");
                break;
            default:
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x025a A[SYNTHETIC] */
    @Override // defpackage.zy7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 774
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xn.a():java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xn(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.E = i3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xn(hw2 hw2Var, int i) {
        super(0, 0, hw2.class, hw2Var, "applyPendingPrefill", "applyPendingPrefill()V");
        this.E = i;
        switch (i) {
            case 24:
                super(0, 0, hw2.class, hw2Var, "dismissPendingPrefill", "dismissPendingPrefill()V");
                break;
            default:
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xn(t53 t53Var) {
        super(0, 0, t53.class, t53Var, "endVoiceSession", "endVoiceSession()V");
        this.E = 25;
    }
}
