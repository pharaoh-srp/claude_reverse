package defpackage;

import com.anthropic.claude.mcpapps.transport.HostContext;
import com.anthropic.claude.mcpapps.transport.JsonRpcError;
import com.anthropic.claude.mcpapps.transport.JsonRpcInboundMessage;
import com.anthropic.claude.mcpapps.transport.JsonRpcNotification;
import com.anthropic.claude.mcpapps.transport.JsonRpcResponse;
import com.anthropic.claude.mcpapps.transport.McpServerCapabilities;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: loaded from: classes3.dex */
public final class lya {
    public static final JsonObject j;
    public static final Set k;
    public final mp4 a;
    public volatile kxa b;
    public final HostContext c;
    public final McpServerCapabilities d;
    public final bg9 e;
    public final bz7 f;
    public final bz7 g;
    public final pwf h;
    public final ConcurrentHashMap i;

    static {
        Map mapSingletonMap = Collections.singletonMap("isError", ch9.a(Boolean.TRUE));
        mapSingletonMap.getClass();
        j = new JsonObject(mapSingletonMap);
        k = sf5.f0("2026-01-26");
    }

    public lya(mp4 mp4Var, kxa kxaVar, HostContext hostContext, McpServerCapabilities mcpServerCapabilities, bg9 bg9Var, bz7 bz7Var, bz7 bz7Var2) {
        bg9Var.getClass();
        this.a = mp4Var;
        this.b = kxaVar;
        this.c = hostContext;
        this.d = mcpServerCapabilities;
        this.e = bg9Var;
        this.f = bz7Var;
        this.g = bz7Var2;
        pwf pwfVar = new pwf();
        if (mcpServerCapabilities != null) {
            if (mcpServerCapabilities.getTools() != null) {
                pwfVar.add("tools/call");
            }
            if (mcpServerCapabilities.getResources() != null) {
                pwfVar.add("resources/list");
                pwfVar.add("resources/read");
                pwfVar.add("resources/templates/list");
            }
            if (mcpServerCapabilities.getPrompts() != null) {
                pwfVar.add("prompts/list");
            }
        }
        this.h = sf5.k(pwfVar);
        this.i = new ConcurrentHashMap();
    }

    public static void f(lya lyaVar, JsonPrimitive jsonPrimitive) {
        lyaVar.e(jsonPrimitive, li9.a);
    }

    public final void a(String str) {
        bz7 bz7Var = this.g;
        str.getClass();
        zfa.a.getClass();
        if (yfa.b()) {
            String strE = iuj.E(this);
            CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : copyOnWriteArrayList) {
                ((n30) ((zfa) obj)).getClass();
                arrayList.add(obj);
            }
            if (!arrayList.isEmpty()) {
                zfa.a.getClass();
                String strConcat = "Received: ".concat(str);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((n30) ((zfa) it.next())).b(sfa.DEBUG, strE, strConcat);
                }
            }
        }
        try {
            bg9 bg9Var = this.e;
            bg9Var.getClass();
            JsonRpcInboundMessage jsonRpcInboundMessage = (JsonRpcInboundMessage) bg9Var.b(str, JsonRpcInboundMessage.Companion.serializer());
            if (jsonRpcInboundMessage instanceof ji9) {
                bz7Var.invoke(new ft9(this, 11, (ji9) jsonRpcInboundMessage));
                return;
            }
            if (jsonRpcInboundMessage instanceof ii9) {
                String str2 = ((ii9) jsonRpcInboundMessage).b;
                JsonObject jsonObject = ((ii9) jsonRpcInboundMessage).c;
                if (jsonObject == null) {
                    jsonObject = li9.a;
                }
                b(str2, jsonObject, ((ii9) jsonRpcInboundMessage).a);
                return;
            }
            if (!(jsonRpcInboundMessage instanceof hi9)) {
                throw new NoWhenBranchMatchedException();
            }
            String str3 = ((hi9) jsonRpcInboundMessage).a;
            JsonObject jsonObject2 = ((hi9) jsonRpcInboundMessage).b;
            if (jsonObject2 == null) {
                jsonObject2 = li9.a;
            }
            b(str3, jsonObject2, null);
        } catch (Exception e) {
            zfa.a.getClass();
            if (yfa.b()) {
                String strE2 = iuj.E(this);
                CopyOnWriteArrayList copyOnWriteArrayList2 = yfa.b;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : copyOnWriteArrayList2) {
                    ((n30) ((zfa) obj2)).getClass();
                    arrayList2.add(obj2);
                }
                if (!arrayList2.isEmpty()) {
                    zfa.a.getClass();
                    String strI = ij0.i("Error parsing message: ", e.getMessage());
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((n30) ((zfa) it2.next())).b(sfa.ERROR, strE2, strI);
                    }
                }
            }
            bz7Var.invoke(new ft9(this, 13, e));
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0a21  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.lang.String r26, kotlinx.serialization.json.JsonObject r27, kotlinx.serialization.json.JsonPrimitive r28) {
        /*
            Method dump skipped, instruction units count: 2974
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lya.b(java.lang.String, kotlinx.serialization.json.JsonObject, kotlinx.serialization.json.JsonPrimitive):void");
    }

    public final void c(JsonPrimitive jsonPrimitive, int i, String str) {
        ri9 ri9Var = JsonRpcResponse.Companion;
        ri9Var.getClass();
        jsonPrimitive.getClass();
        mq5 mq5Var = null;
        String str2 = null;
        JsonObject jsonObject = null;
        JsonRpcResponse jsonRpcResponse = new JsonRpcResponse(str2, jsonPrimitive, jsonObject, new JsonRpcError(i, str, (JsonObject) null, 4, mq5Var), 5, mq5Var);
        bg9 bg9Var = this.e;
        bg9Var.getClass();
        this.f.invoke(bg9Var.d(jsonRpcResponse, ri9Var.serializer()));
    }

    public final void d(String str, JsonObject jsonObject) {
        bz7 bz7Var = this.f;
        bg9 bg9Var = this.e;
        JsonRpcNotification jsonRpcNotification = new JsonRpcNotification((String) null, str, jsonObject, 1, (mq5) null);
        bg9Var.getClass();
        bz7Var.invoke(bg9Var.d(jsonRpcNotification, JsonRpcNotification.Companion.serializer()));
        bz7 bz7Var2 = this.b.l;
        if (bz7Var2 != null) {
            bz7Var2.invoke(str);
        }
    }

    public final void e(JsonPrimitive jsonPrimitive, JsonObject jsonObject) {
        ri9 ri9Var = JsonRpcResponse.Companion;
        ri9Var.getClass();
        jsonPrimitive.getClass();
        jsonObject.getClass();
        JsonRpcResponse jsonRpcResponse = new JsonRpcResponse((String) null, jsonPrimitive, jsonObject, (JsonRpcError) null, 9, (mq5) null);
        bg9 bg9Var = this.e;
        bg9Var.getClass();
        this.f.invoke(bg9Var.d(jsonRpcResponse, ri9Var.serializer()));
    }
}
