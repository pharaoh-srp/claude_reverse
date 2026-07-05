package com.anthropic.claude.sessions.types;

import com.anthropic.claude.sessions.types.ControlRequestBody;
import defpackage.ch9;
import defpackage.jce;
import defpackage.s06;
import defpackage.sg9;
import defpackage.sz6;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes3.dex */
public final class z extends sg9 {
    public static final z c = new z(jce.a.b(ControlRequestBody.class));

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.sg9
    public final s06 a(JsonElement jsonElement) {
        KSerializer kSerializerSerializer;
        jsonElement.getClass();
        JsonElement jsonElement2 = (JsonElement) ch9.i(jsonElement).get((Object) "subtype");
        String content = jsonElement2 != null ? ch9.j(jsonElement2).getContent() : null;
        if (content != null) {
            switch (content.hashCode()) {
                case -1113857403:
                    if (content.equals("read_file")) {
                        kSerializerSerializer = ControlRequestBody.ReadFile.Companion.serializer();
                        return kSerializerSerializer;
                    }
                    break;
                case -762805194:
                    if (content.equals("set_permission_mode")) {
                        kSerializerSerializer = ControlRequestBody.SetMode.Companion.serializer();
                        return kSerializerSerializer;
                    }
                    break;
                case 503000675:
                    if (content.equals("interrupt")) {
                        kSerializerSerializer = ControlRequestBody.Interrupt.Companion.serializer();
                        return kSerializerSerializer;
                    }
                    break;
                case 782779043:
                    if (content.equals("tool_decision")) {
                        kSerializerSerializer = ControlRequestBody.ToolDecision.Companion.serializer();
                        return kSerializerSerializer;
                    }
                    break;
                case 871091088:
                    if (content.equals("initialize")) {
                        kSerializerSerializer = ControlRequestBody.Initialize.Companion.serializer();
                        return kSerializerSerializer;
                    }
                    break;
                case 926402828:
                    if (content.equals("set_model")) {
                        kSerializerSerializer = ControlRequestBody.SetModel.Companion.serializer();
                        return kSerializerSerializer;
                    }
                    break;
            }
        }
        sz6.p("Unknown ControlRequestBody subtype");
        return null;
    }
}
