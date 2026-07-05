package defpackage;

import android.content.Context;
import anthropic.claude.usercontent.sandbox.RunCodeResponse;
import com.anthropic.claude.R;
import com.anthropic.claude.api.chat.tool.ResearchTask;
import com.anthropic.claude.api.chat.tool.ToolResultContent;
import com.anthropic.claude.api.chat.tool.ToolResultText;
import com.anthropic.claude.types.strings.ResearchTaskId;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes2.dex */
public final class qc3 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ ToolResultContent F;
    public final /* synthetic */ sc3 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qc3(ToolResultContent toolResultContent, sc3 sc3Var, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.F = toolResultContent;
        this.G = sc3Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        sc3 sc3Var = this.G;
        ToolResultContent toolResultContent = this.F;
        switch (i) {
            case 0:
                return new qc3(toolResultContent, sc3Var, tp4Var, 0);
            default:
                return new qc3(toolResultContent, sc3Var, tp4Var, 1);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        l45 l45Var = (l45) obj;
        tp4 tp4Var = (tp4) obj2;
        switch (i) {
        }
        return ((qc3) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        String strM1101constructorimpl;
        int i = this.E;
        sc3 sc3Var = this.G;
        ToolResultContent toolResultContent = this.F;
        switch (i) {
            case 0:
                sf5.h0(obj);
                boolean z = toolResultContent instanceof ToolResultText;
                Context context = sc3Var.a;
                if (!z) {
                    return ij0.j("/* ", context.getString(R.string.analysis_tool_fallback_result), " */");
                }
                try {
                    bg9 bg9Var = sc3Var.c;
                    String text = ((ToolResultText) toolResultContent).getText();
                    fof fofVar = bg9Var.b;
                    pl9 pl9VarB = jce.a.b(RunCodeResponse.class);
                    fofVar.getClass();
                    KSerializer kSerializerB = fofVar.b(pl9VarB, lm6.E);
                    if (kSerializerB == null) {
                        throw new SerializationException(yfd.M(pl9VarB));
                    }
                    RunCodeResponse runCodeResponse = (RunCodeResponse) bg9Var.b(text, kSerializerB);
                    StringBuilder sb = new StringBuilder();
                    sb.append("/* " + context.getString(R.string.analysis_tool_heading_result));
                    sb.append('\n');
                    if (!runCodeResponse.getLogs().isEmpty()) {
                        sb.append('\n');
                        Iterator<T> it = runCodeResponse.getLogs().iterator();
                        while (it.hasNext()) {
                            sb.append((String) it.next());
                            sb.append('\n');
                        }
                    }
                    if (!bsg.I0(runCodeResponse.getError())) {
                        sb.append('\n');
                        sb.append(context.getString(R.string.analysis_tool_heading_error));
                        sb.append('\n');
                        sb.append('\n');
                        sb.append(runCodeResponse.getError());
                        sb.append('\n');
                    }
                    sb.append('\n');
                    sb.append("*/");
                    return sb.toString();
                } catch (Exception e) {
                    List list = xah.a;
                    Map mapSingletonMap = Collections.singletonMap("json_parse_failed_content", ((ToolResultText) toolResultContent).getText());
                    mapSingletonMap.getClass();
                    xah.f(e, "Failed to parse analysis tool result", null, mapSingletonMap, 20);
                    return null;
                }
            default:
                sf5.h0(obj);
                if (!(toolResultContent instanceof ToolResultText)) {
                    return null;
                }
                try {
                    strM1101constructorimpl = ResearchTaskId.m1101constructorimpl(((ResearchTask) sc3Var.c.b(((ToolResultText) toolResultContent).getText(), ResearchTask.Companion.serializer())).getTask_id());
                    break;
                } catch (Exception e2) {
                    List list2 = xah.a;
                    Map mapSingletonMap2 = Collections.singletonMap("json_parse_failed_content", ((ToolResultText) toolResultContent).getText());
                    mapSingletonMap2.getClass();
                    xah.f(e2, "Failed to parse research tool result", null, mapSingletonMap2, 20);
                    strM1101constructorimpl = null;
                }
                if (strM1101constructorimpl != null) {
                    return ResearchTaskId.m1100boximpl(strM1101constructorimpl);
                }
                return null;
        }
    }
}
