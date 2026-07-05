package com.anthropic.claude.api.tasks;

import defpackage.bsg;
import defpackage.cfi;
import defpackage.ch9;
import defpackage.hre;
import defpackage.isg;
import defpackage.nm6;
import defpackage.s7h;
import defpackage.t7h;
import defpackage.wg6;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f {
    public static final JsonObject a = new JsonObject(nm6.E);

    /* JADX WARN: Removed duplicated region for block: B:14:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String a(java.lang.String r1, kotlinx.serialization.json.JsonObject r2) {
        /*
            r0 = 0
            java.lang.Object r1 = r2.get(r1)     // Catch: java.lang.Throwable -> L1c
            kotlinx.serialization.json.JsonElement r1 = (kotlinx.serialization.json.JsonElement) r1     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L1e
            kotlinx.serialization.json.JsonPrimitive r1 = defpackage.ch9.j(r1)     // Catch: java.lang.Throwable -> L1c
            boolean r2 = r1.isString()     // Catch: java.lang.Throwable -> L1c
            if (r2 == 0) goto L14
            goto L15
        L14:
            r1 = r0
        L15:
            if (r1 == 0) goto L1e
            java.lang.String r1 = r1.getContent()     // Catch: java.lang.Throwable -> L1c
            goto L26
        L1c:
            r1 = move-exception
            goto L20
        L1e:
            r1 = r0
            goto L26
        L20:
            hre r2 = new hre
            r2.<init>(r1)
            r1 = r2
        L26:
            boolean r2 = r1 instanceof defpackage.hre
            if (r2 == 0) goto L2c
            goto L2d
        L2c:
            r0 = r1
        L2d:
            java.lang.String r0 = (java.lang.String) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.api.tasks.f.a(java.lang.String, kotlinx.serialization.json.JsonObject):java.lang.String");
    }

    public static final t7h b(TaskSessionEvent taskSessionEvent) {
        taskSessionEvent.getClass();
        boolean z = taskSessionEvent instanceof s7h;
        t7h t7hVar = t7h.E;
        if (z || (taskSessionEvent instanceof AgentToolResultEvent)) {
            return t7hVar;
        }
        if (taskSessionEvent instanceof AssistantTextEvent) {
            return t7h.F;
        }
        boolean z2 = taskSessionEvent instanceof StepStatusEvent;
        t7h t7hVar2 = t7h.G;
        if (z2) {
            return t7hVar2;
        }
        if (taskSessionEvent instanceof cfi) {
            String str = ((cfi) taskSessionEvent).a;
            return str.equals("error") ? t7h.I : (str.equals("user") || isg.h0(str, "tool_result", false)) ? t7hVar : isg.q0(str, "status_", false) ? t7hVar2 : isg.q0(str, "model_request", false) ? t7h.H : t7h.J;
        }
        wg6.i();
        return null;
    }

    public static final String c(TaskSessionEvent taskSessionEvent) {
        Object hreVar;
        JsonElement jsonElement;
        taskSessionEvent.getClass();
        if (taskSessionEvent instanceof cfi) {
            try {
                JsonElement jsonElement2 = (JsonElement) ((cfi) taskSessionEvent).b.get((Object) "unknown_error");
                hreVar = (jsonElement2 == null || (jsonElement = (JsonElement) ch9.i(jsonElement2).get((Object) "message")) == null) ? null : ch9.j(jsonElement).getContent();
            } catch (Throwable th) {
                hreVar = new hre(th);
            }
            if (hreVar instanceof hre) {
                hreVar = null;
            }
            String str = (String) hreVar;
            if (str != null && bsg.u0(str, "initialize failed", false)) {
                int iF0 = bsg.F0(str, '\'', 0, 6);
                Integer numValueOf = Integer.valueOf(iF0);
                if (iF0 < 0) {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    int iIntValue = numValueOf.intValue();
                    int i = iIntValue + 1;
                    int iF02 = bsg.F0(str, '\'', i, 4);
                    Integer numValueOf2 = Integer.valueOf(iF02);
                    if (iF02 <= iIntValue) {
                        numValueOf2 = null;
                    }
                    if (numValueOf2 != null) {
                        return str.substring(i, numValueOf2.intValue());
                    }
                }
            }
        }
        return null;
    }
}
