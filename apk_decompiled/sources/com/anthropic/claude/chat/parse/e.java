package com.anthropic.claude.chat.parse;

import defpackage.a2;
import defpackage.ch9;
import defpackage.hof;
import defpackage.ih9;
import defpackage.mp0;
import defpackage.nnf;
import defpackage.u00;
import defpackage.x29;
import java.util.Set;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e {
    public static final Set a = mp0.Z0(new String[]{"memory_read", "memory_write", "memory_list", "memory_search", "memory_delete"});
    public static final ih9 b;

    static {
        nnf nnfVar = hof.a;
        nnfVar.getClass();
        b = u00.c(new a2(18, nnfVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c9 A[LOOP:1: B:48:0x00c3->B:50:0x00c9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01bf  */
    /* JADX WARN: Type inference failed for: r2v0, types: [lm6] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.anthropic.claude.chat.parse.MemoryToolSummary a(java.lang.String r10, kotlinx.serialization.json.JsonObject r11, kotlinx.serialization.json.JsonObject r12, boolean r13) {
        /*
            Method dump skipped, instruction units count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.chat.parse.e.a(java.lang.String, kotlinx.serialization.json.JsonObject, kotlinx.serialization.json.JsonObject, boolean):com.anthropic.claude.chat.parse.MemoryToolSummary");
    }

    public static final String b(String str, JsonObject jsonObject) {
        JsonElement jsonElement = jsonObject != null ? (JsonElement) jsonObject.get((Object) str) : null;
        JsonPrimitive jsonPrimitive = jsonElement instanceof JsonPrimitive ? (JsonPrimitive) jsonElement : null;
        if (jsonPrimitive == null) {
            return null;
        }
        x29 x29Var = ch9.a;
        if (jsonPrimitive instanceof JsonNull) {
            return null;
        }
        return jsonPrimitive.getContent();
    }
}
