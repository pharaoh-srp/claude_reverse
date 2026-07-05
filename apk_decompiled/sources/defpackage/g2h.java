package defpackage;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.os.Build;
import android.util.Log;
import androidx.work.Worker;
import androidx.work.impl.WorkDatabase;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.api.tasks.AgentContentBlock;
import com.anthropic.claude.api.tasks.AgentToolResultEvent;
import com.anthropic.claude.api.tasks.AssistantTextEvent;
import com.anthropic.claude.api.tasks.McpToolUseEvent;
import com.anthropic.claude.api.tasks.StepStatusEvent;
import com.anthropic.claude.api.tasks.TaskResponse;
import com.anthropic.claude.api.tasks.TaskSessionEvent;
import com.anthropic.claude.bell.tts.f;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g2h implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;

    public /* synthetic */ g2h(int i, Object obj) {
        this.E = i;
        this.F = obj;
    }

    @Override // defpackage.zy7
    public final Object a() throws PendingIntent.CanceledException {
        JsonObject jsonObject;
        Object objPut;
        int i = this.E;
        boolean z = true;
        iei ieiVar = iei.a;
        tp4 tp4Var = null;
        Object obj = this.F;
        switch (i) {
            case 0:
                gb9.D(fd9.o(), null, null, new j2h((f) obj, tp4Var, 4), 3);
                return ieiVar;
            case 1:
                ih9 ih9Var = e8h.f;
                KSerializer kSerializerSerializer = JsonObject.INSTANCE.serializer();
                TaskSessionEvent taskSessionEvent = ((u7h) obj).c;
                JsonObject jsonObject2 = com.anthropic.claude.api.tasks.f.a;
                taskSessionEvent.getClass();
                if (taskSessionEvent instanceof cfi) {
                    jsonObject = ((cfi) taskSessionEvent).b;
                } else if (taskSessionEvent instanceof AssistantTextEvent) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    ArrayList arrayList = new ArrayList();
                    for (AgentContentBlock agentContentBlock : ((AssistantTextEvent) taskSessionEvent).getContent()) {
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        if (agentContentBlock instanceof AgentContentBlock.Text) {
                            JsonPrimitive jsonPrimitiveC = ch9.c("text");
                            jsonPrimitiveC.getClass();
                            JsonPrimitive jsonPrimitiveC2 = ch9.c(((AgentContentBlock.Text) agentContentBlock).getText());
                            jsonPrimitiveC2.getClass();
                            objPut = linkedHashMap2.put("text", jsonPrimitiveC2);
                        } else if (agentContentBlock instanceof AgentContentBlock.Thinking) {
                            JsonPrimitive jsonPrimitiveC3 = ch9.c("thinking");
                            jsonPrimitiveC3.getClass();
                            JsonPrimitive jsonPrimitiveC4 = ch9.c(((AgentContentBlock.Thinking) agentContentBlock).getThinking());
                            jsonPrimitiveC4.getClass();
                            objPut = linkedHashMap2.put("thinking", jsonPrimitiveC4);
                        } else {
                            if (!(agentContentBlock instanceof kq)) {
                                wg6.i();
                                return null;
                            }
                            JsonPrimitive jsonPrimitiveC5 = ch9.c(((kq) agentContentBlock).a);
                            jsonPrimitiveC5.getClass();
                            objPut = linkedHashMap2.put("type", jsonPrimitiveC5);
                        }
                        arrayList.add(new JsonObject(linkedHashMap2));
                    }
                    jsonObject = new JsonObject(linkedHashMap);
                } else if (taskSessionEvent instanceof StepStatusEvent) {
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    StepStatusEvent stepStatusEvent = (StepStatusEvent) taskSessionEvent;
                    JsonPrimitive jsonPrimitiveC6 = ch9.c(stepStatusEvent.getStep_id());
                    jsonPrimitiveC6.getClass();
                    JsonPrimitive jsonPrimitiveC7 = ch9.c(stepStatusEvent.getStatus().getValue());
                    jsonPrimitiveC7.getClass();
                    jsonObject = new JsonObject(linkedHashMap3);
                } else if (taskSessionEvent instanceof AgentToolResultEvent) {
                    LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                    JsonPrimitive jsonPrimitiveC8 = ch9.c(((AgentToolResultEvent) taskSessionEvent).getTool_use_id());
                    jsonPrimitiveC8.getClass();
                    jsonObject = new JsonObject(linkedHashMap4);
                } else {
                    if (!(taskSessionEvent instanceof s7h)) {
                        wg6.i();
                        return null;
                    }
                    LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                    s7h s7hVar = (s7h) taskSessionEvent;
                    JsonPrimitive jsonPrimitiveC9 = ch9.c(s7hVar.getTool_use_id());
                    jsonPrimitiveC9.getClass();
                    JsonPrimitive jsonPrimitiveC10 = ch9.c(s7hVar.getTool_name());
                    jsonPrimitiveC10.getClass();
                    if (taskSessionEvent instanceof McpToolUseEvent) {
                        JsonPrimitive jsonPrimitiveC11 = ch9.c(((McpToolUseEvent) taskSessionEvent).getMcp_server_name());
                        jsonPrimitiveC11.getClass();
                    }
                    JsonObject input = s7hVar.getInput();
                    input.getClass();
                    jsonObject = new JsonObject(linkedHashMap5);
                }
                return ih9Var.d(jsonObject, kSerializerSerializer);
            case 2:
                aah aahVar = (aah) obj;
                List listH = ((uah) aahVar.b).h();
                LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                for (Object obj2 : listH) {
                    n6e n6eVarB = bm4.b(n6e.F, ((TaskResponse) obj2).getLast_activity_at().getTime(), aahVar.d.h());
                    Object arrayList2 = linkedHashMap6.get(n6eVarB);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap6.put(n6eVarB, arrayList2);
                    }
                    ((List) arrayList2).add(obj2);
                }
                return linkedHashMap6;
            case 3:
                PendingIntent actionIntent = ((RemoteAction) obj).getActionIntent();
                if (Build.VERSION.SDK_INT >= 34) {
                    try {
                        actionIntent.send(ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle());
                    } catch (PendingIntent.CanceledException e) {
                        Log.e("TextClassification", "error sending pendingIntent: " + actionIntent + " error: " + e);
                    }
                    break;
                } else {
                    actionIntent.send();
                }
                return ieiVar;
            case 4:
                seh sehVar = (seh) obj;
                return new g79(agh.a(sehVar.b, sehVar.g, sehVar.h, agh.a, 1));
            case 5:
                return new va6(d4c.W(24.0f, 16.0f, ((ogh) obj).a()));
            case 6:
                t3 t3Var = (t3) obj;
                int iOrdinal = t3Var.k().ordinal();
                if (iOrdinal == 0) {
                    return new eeg(t3Var.j());
                }
                if (iOrdinal == 1) {
                    return lz1.I(14, x44.X(new d54(t3Var.j()), new d54(d54.b(MTTypesetterKt.kLineSkipLimitMultiplier, t3Var.j()))));
                }
                wg6.i();
                return null;
            case 7:
                ((vrh) obj).s0.invoke(Boolean.valueOf(!r10.r0));
                return ieiVar;
            case 8:
                oti otiVar = (oti) obj;
                return BigInteger.valueOf(otiVar.E).shiftLeft(32).or(BigInteger.valueOf(otiVar.F)).shiftLeft(32).or(BigInteger.valueOf(otiVar.G));
            case 9:
                return Integer.valueOf(((Number) ((xs5) obj).s.getValue()).intValue());
            case 10:
                pfj pfjVar = (pfj) obj;
                String str = to6.a;
                bgj bgjVar = pfjVar.a;
                HashSet hashSet = new HashSet();
                hashSet.addAll(pfjVar.e);
                HashSet hashSetB = pfj.b(pfjVar);
                Iterator it = hashSet.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        hashSet.removeAll(pfjVar.e);
                        z = false;
                    } else if (hashSetB.contains((String) it.next())) {
                    }
                }
                if (z) {
                    xh6.b(pfjVar, ")", "WorkContinuation has cycles (");
                    return null;
                }
                WorkDatabase workDatabase = bgjVar.c;
                fg4 fg4Var = bgjVar.b;
                workDatabase.b();
                try {
                    wvj.b(workDatabase, fg4Var, pfjVar);
                    boolean zA = to6.a(pfjVar);
                    workDatabase.p();
                    if (!zA) {
                        return ieiVar;
                    }
                    b7f.b(fg4Var, bgjVar.c, bgjVar.e);
                    return ieiVar;
                } finally {
                    workDatabase.f();
                }
            default:
                return ((Worker) obj).d();
        }
    }
}
