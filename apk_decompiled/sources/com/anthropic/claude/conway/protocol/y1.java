package com.anthropic.claude.conway.protocol;

import com.anthropic.claude.conway.protocol.StreamMessage;
import defpackage.aqg;
import defpackage.ch9;
import defpackage.jce;
import defpackage.s06;
import defpackage.sg9;
import defpackage.w44;
import defpackage.x44;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes2.dex */
public final class y1 extends sg9 {
    public static final y1 c = new y1(jce.a.b(StreamMessage.class));

    @Override // defpackage.sg9
    public final s06 a(JsonElement jsonElement) {
        jsonElement.getClass();
        JsonElement jsonElement2 = (JsonElement) ch9.i(jsonElement).get((Object) "type");
        String content = jsonElement2 != null ? ch9.j(jsonElement2).getContent() : null;
        if (x44.r(content, "connected")) {
            return StreamMessage.Connected.Companion.serializer();
        }
        if (x44.r(content, "heartbeat")) {
            return StreamMessage.Heartbeat.Companion.serializer();
        }
        if (x44.r(content, "error")) {
            return StreamMessage.Error.Companion.serializer();
        }
        if (x44.r(content, "goodbye")) {
            return StreamMessage.Goodbye.Companion.serializer();
        }
        if (x44.r(content, "shutdown")) {
            return StreamMessage.Shutdown.Companion.serializer();
        }
        if (x44.r(content, "agents_updated") || x44.r(content, "agentsUpdated")) {
            return StreamMessage.AgentsUpdated.Companion.serializer();
        }
        if (x44.r(content, "tool_call")) {
            return StreamMessage.ToolCall.Companion.serializer();
        }
        if (x44.r(content, "health_probe")) {
            return StreamMessage.HealthProbe.Companion.serializer();
        }
        if (x44.r(content, "status_line")) {
            return StreamMessage.StatusLine.Companion.serializer();
        }
        if (x44.r(content, "clients_changed")) {
            return StreamMessage.ClientsChanged.Companion.serializer();
        }
        if (x44.r(content, "extensions_changed")) {
            return StreamMessage.ExtensionsChanged.Companion.serializer();
        }
        if (x44.r(content, "fork_created")) {
            return StreamMessage.ForkCreated.Companion.serializer();
        }
        if (x44.r(content, "fork_joined")) {
            return StreamMessage.ForkJoined.Companion.serializer();
        }
        if (x44.r(content, "forks_snapshot")) {
            return StreamMessage.ForksSnapshot.Companion.serializer();
        }
        if (x44.r(content, "client_permission_request")) {
            return StreamMessage.ClientPermissionRequest.Companion.serializer();
        }
        if (x44.r(content, "client_permission_resolved")) {
            return StreamMessage.ClientPermissionResolved.Companion.serializer();
        }
        StreamMessage.Companion.getClass();
        return w44.G0(aqg.b, content) ? StreamMessage.Ignored.Companion.serializer() : StreamMessage.Unknown.Companion.serializer();
    }
}
