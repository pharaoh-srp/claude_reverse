package defpackage;

import com.anthropic.claude.sessions.types.RequiresActionDetails;
import com.anthropic.claude.sessions.types.SdkWorkflowAgent;
import com.anthropic.claude.sessions.types.SdkWorkflowPhase;
import com.anthropic.claude.sessions.types.SdkWorkflowProgress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: loaded from: classes3.dex */
public abstract class dqf {
    public static final Set a = mp0.Z0(new String[]{"ExitPlanMode", RequiresActionDetails.ASK_USER_QUESTION, "Workflow", "Artifact", "SendUserMessage", "SendUserFile"});
    public static final ide b = new ide("^@\"[^\"]*\"\\s*");
    public static final Set c = mp0.Z0(new String[]{"task_started", "task_progress", "task_updated", "task_notification"});
    public static final ide d = new ide("<(task|agent|bash)-notification\\b[^>]*>([\\s\\S]*?)</\\1-notification>");
    public static final ide e = new ide("<(?:task|agent|shell)-id>([^<]+)</(?:task|agent|shell)-id>");
    public static final ide f = new ide("<status>([^<]+)</status>");

    public static final List a(List list, fc1 fc1Var) {
        List<zhj> list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            for (zhj zhjVar : list2) {
                if (zhjVar instanceof whj) {
                    xhj xhjVar = ((whj) zhjVar).c;
                    xhj xhjVar2 = xhj.G;
                    if (xhjVar == xhjVar2) {
                        String str = fc1Var == fc1.I ? "Stopped before completion" : "Workflow ended before completion";
                        ArrayList arrayList = new ArrayList(x44.y(list2, 10));
                        for (zhj whjVar : list2) {
                            if (whjVar instanceof whj) {
                                whj whjVar2 = (whj) whjVar;
                                if (whjVar2.c == xhjVar2) {
                                    String str2 = whjVar2.h;
                                    String str3 = str2 == null ? str : str2;
                                    int i = whjVar2.a;
                                    String str4 = whjVar2.b;
                                    Integer num = whjVar2.d;
                                    String str5 = whjVar2.e;
                                    Integer num2 = whjVar2.f;
                                    Long l = whjVar2.g;
                                    Long l2 = whjVar2.i;
                                    Long l3 = whjVar2.j;
                                    String str6 = whjVar2.k;
                                    str4.getClass();
                                    whjVar = new whj(i, str4, xhj.I, num, str5, num2, l, str3, l2, l3, str6);
                                }
                            }
                            arrayList.add(whjVar);
                        }
                        return arrayList;
                    }
                }
            }
        }
        return list;
    }

    public static final String b(SdkWorkflowProgress sdkWorkflowProgress) {
        return sdkWorkflowProgress instanceof SdkWorkflowAgent ? grc.p(((SdkWorkflowAgent) sdkWorkflowProgress).getIndex(), "workflow_agent:") : sdkWorkflowProgress instanceof SdkWorkflowPhase ? grc.p(((SdkWorkflowPhase) sdkWorkflowProgress).getIndex(), "workflow_phase:") : grc.p(sdkWorkflowProgress.getIndex(), "unknown:");
    }

    public static final String c(String str, JsonObject jsonObject) {
        Object obj = jsonObject.get((Object) str);
        JsonPrimitive jsonPrimitive = obj instanceof JsonPrimitive ? (JsonPrimitive) obj : null;
        if (jsonPrimitive != null) {
            if (!jsonPrimitive.isString()) {
                jsonPrimitive = null;
            }
            if (jsonPrimitive != null) {
                x29 x29Var = ch9.a;
                if (jsonPrimitive instanceof JsonNull) {
                    return null;
                }
                return jsonPrimitive.getContent();
            }
        }
        return null;
    }

    public static final String d(int i, String str) {
        str.getClass();
        if (i == 0) {
            return str;
        }
        for (int i2 = 0; i2 < i; i2++) {
            ova ovaVarB = b.b(str);
            if (ovaVarB == null) {
                return bsg.k1(str).toString();
            }
            str = str.substring(ovaVarB.b().F + 1);
        }
        return bsg.k1(str).toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007e A[PHI: r0
      0x007e: PHI (r0v23 int) = (r0v5 int), (r0v5 int), (r0v19 int), (r0v22 int), (r0v25 int), (r0v28 int) binds: [B:72:0x0122, B:74:0x0126, B:56:0x00e4, B:59:0x00eb, B:34:0x007c, B:37:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.leb e(java.util.List r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.util.List r18, java.lang.String r19, java.lang.String r20, int r21) {
        /*
            Method dump skipped, instruction units count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqf.e(java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, int):leb");
    }
}
