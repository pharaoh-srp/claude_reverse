package defpackage;

import android.content.res.Resources;
import androidx.health.platform.client.proto.g;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.api.chat.ChatConversationWithProjectReference;
import com.anthropic.claude.api.chat.MessageAttachment;
import com.anthropic.claude.api.project.Project;
import com.anthropic.claude.api.share.ChatSnapshotSummaryWithChatId;
import com.anthropic.claude.chat.parse.ParsedContentBlock$McpToolInvocation;
import com.anthropic.claude.chat.share.k;
import com.anthropic.claude.conway.protocol.ContentBlock;
import java.time.Duration;
import java.util.Arrays;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class z1g implements bz7 {
    public final /* synthetic */ int E;

    public /* synthetic */ z1g(int i) {
        this.E = i;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        g6a g6aVarE;
        int i = this.E;
        int i2 = 1;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                ((MessageAttachment) obj).getClass();
                k.c("onPreviewAttachment");
                return ieiVar;
            case 1:
                ((ParsedContentBlock$McpToolInvocation) obj).getClass();
                k.c("onViewToolContent");
                return ieiVar;
            case 2:
                ((gtc) obj).getClass();
                k.c("onViewResearch");
                return ieiVar;
            case 3:
                ChatSnapshotSummaryWithChatId chatSnapshotSummaryWithChatId = (ChatSnapshotSummaryWithChatId) obj;
                chatSnapshotSummaryWithChatId.getClass();
                return chatSnapshotSummaryWithChatId.m434getUuidN1vkeFQ();
            case 4:
                ((ChatSnapshotSummaryWithChatId) obj).getClass();
                return kc9.F;
            case 5:
                ekf ekfVar = (ekf) obj;
                ekfVar.getClass();
                ckf.e(ekfVar);
                return ieiVar;
            case 6:
                ekf ekfVar2 = (ekf) obj;
                ekfVar2.getClass();
                ckf.s(ekfVar2, 3);
                return ieiVar;
            case 7:
                xch xchVar = (xch) obj;
                xchVar.getClass();
                return new cpc(Double.valueOf(xchVar.E), "°C");
            case 8:
                ((Duration) obj).getClass();
                return new cpc(Double.valueOf(r8.toMinutes()), "minutes");
            case 9:
                ((ekf) obj).getClass();
                return ieiVar;
            case 10:
                xre xreVar = (xre) obj;
                xreVar.getClass();
                xreVar.e(1);
                return ieiVar;
            case 11:
                b52 b52Var = (b52) obj;
                b52Var.getClass();
                cpc[] cpcVarArr = {new cpc(Float.valueOf(MTTypesetterKt.kLineSkipLimitMultiplier), new d54(d54.g)), new cpc(Float.valueOf(0.2f), new d54(d54.b))};
                int iOrdinal = b52Var.E.getLayoutDirection().ordinal();
                if (iOrdinal == 0) {
                    g6aVarE = lz1.E((cpc[]) Arrays.copyOf(cpcVarArr, 2), MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 14);
                } else {
                    if (iOrdinal != 1) {
                        wg6.i();
                        return null;
                    }
                    g6aVarE = lz1.E((cpc[]) Arrays.copyOf(cpcVarArr, 2), Float.intBitsToFloat((int) (b52Var.E.g() >> 32)), MTTypesetterKt.kLineSkipLimitMultiplier, 8);
                }
                return b52Var.b(new df7(g6aVarE, i2));
            case 12:
                ((i90) obj).getClass();
                return xn5.w0(gp6.e(null, 3), gp6.f(null, 3));
            case 13:
                ((ekf) obj).getClass();
                return ieiVar;
            case 14:
                xre xreVar2 = (xre) obj;
                xreVar2.getClass();
                xreVar2.d(true);
                xreVar2.e(1);
                return ieiVar;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                psi psiVar = (psi) obj;
                psiVar.getClass();
                return new cpc(Double.valueOf(psiVar.a()), "m/s");
            case 16:
                Project project = (Project) obj;
                project.getClass();
                return ij0.i("starred_project_", project.m404getUuid5pmjbU());
            case g.MAX_FIELD_NUMBER /* 17 */:
                ((Project) obj).getClass();
                return le6.F;
            case g.AVG_FIELD_NUMBER /* 18 */:
                ChatConversationWithProjectReference chatConversationWithProjectReference = (ChatConversationWithProjectReference) obj;
                chatConversationWithProjectReference.getClass();
                return ij0.i("starred_chat_", chatConversationWithProjectReference.m209getUuidRjYBDck());
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                ((ChatConversationWithProjectReference) obj).getClass();
                return le6.E;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                Double d = (Double) obj;
                d.doubleValue();
                return new cpc(d, "steps/min");
            case 21:
                return new cpc(Double.valueOf(((Long) obj).longValue()), "count");
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                ContentBlock.Text text = (ContentBlock.Text) obj;
                text.getClass();
                return text.getText();
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                String str = (String) obj;
                str.getClass();
                return str;
            case 24:
                CharSequence charSequence = (CharSequence) obj;
                charSequence.getClass();
                return charSequence.toString();
            case BuildConfig.VERSION_CODE /* 25 */:
                ekf ekfVar3 = (ekf) obj;
                ekfVar3.getClass();
                ckf.f(ekfVar3);
                return ieiVar;
            case 26:
                ekf ekfVar4 = (ekf) obj;
                ekfVar4.getClass();
                ckf.e(ekfVar4);
                return ieiVar;
            case 27:
                return ieiVar;
            case 28:
                return ieiVar;
            default:
                ((Resources) obj).getClass();
                return Boolean.TRUE;
        }
    }
}
