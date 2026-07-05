package com.anthropic.claude.sessions.api;

import com.anthropic.claude.sessions.types.SdkEvent;
import com.anthropic.claude.sessions.types.SdkMessageEvent;
import com.anthropic.claude.sessions.types.SdkNonAssistantMessage;
import com.anthropic.claude.sessions.types.SdkToolResultContent;
import com.anthropic.claude.sessions.types.TextToolResult;
import com.anthropic.claude.sessions.types.ToolResult;
import com.anthropic.claude.types.strings.SessionId;
import defpackage.bsg;
import defpackage.fk;
import defpackage.hre;
import defpackage.ide;
import defpackage.ih9;
import defpackage.isg;
import defpackage.lm6;
import defpackage.ova;
import defpackage.q6;
import defpackage.u00;
import defpackage.w44;
import defpackage.x44;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {
    public static final ih9 a = u00.c(new q6(4));
    public static final ide b = new ide("session_id[\"\\s:]+\"?([A-Za-z0-9_-]+)");

    public static final boolean a(SdkEvent sdkEvent) {
        sdkEvent.getClass();
        if (!(sdkEvent instanceof SdkMessageEvent)) {
            return true;
        }
        SdkMessageEvent sdkMessageEvent = (SdkMessageEvent) sdkEvent;
        return ((sdkMessageEvent.getMessage() instanceof SdkNonAssistantMessage) || x44.r(sdkMessageEvent.getIsReplay(), Boolean.TRUE)) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List, lm6] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList] */
    public static final List b(JsonElement jsonElement) {
        Object hreVar;
        List<SendUserMessageResultAttachment> attachments;
        boolean z = jsonElement instanceof JsonObject;
        ?? arrayList = lm6.E;
        if (!z) {
            return arrayList;
        }
        try {
            ih9 ih9Var = a;
            ih9Var.getClass();
            hreVar = (SendUserMessageResult) ih9Var.a(SendUserMessageResult.Companion.serializer(), jsonElement);
        } catch (Throwable th) {
            hreVar = new hre(th);
        }
        if (hreVar instanceof hre) {
            hreVar = null;
        }
        SendUserMessageResult sendUserMessageResult = (SendUserMessageResult) hreVar;
        if (sendUserMessageResult != null && (attachments = sendUserMessageResult.getAttachments()) != null) {
            List<SendUserMessageResultAttachment> list = attachments;
            arrayList = new ArrayList(x44.y(list, 10));
            for (SendUserMessageResultAttachment sendUserMessageResultAttachment : list) {
                arrayList.add(new fk(sendUserMessageResultAttachment.getPath(), Long.valueOf(sendUserMessageResultAttachment.getSize()), sendUserMessageResultAttachment.isImage(), sendUserMessageResultAttachment.getMedia_type(), sendUserMessageResultAttachment.getFile_uuid(), 32));
            }
        }
        return arrayList;
    }

    public static final String c(JsonElement jsonElement, SdkToolResultContent sdkToolResultContent) {
        String str;
        JsonElement jsonElement2;
        JsonElement jsonElement3;
        String content;
        JsonObject jsonObject = jsonElement instanceof JsonObject ? (JsonObject) jsonElement : null;
        if (jsonObject != null && (jsonElement2 = (JsonElement) jsonObject.get((Object) "structuredContent")) != null) {
            JsonObject jsonObject2 = jsonElement2 instanceof JsonObject ? (JsonObject) jsonElement2 : null;
            if (jsonObject2 != null && (jsonElement3 = (JsonElement) jsonObject2.get((Object) "remote_session_id")) != null) {
                JsonPrimitive jsonPrimitive = jsonElement3 instanceof JsonPrimitive ? (JsonPrimitive) jsonElement3 : null;
                if (jsonPrimitive != null) {
                    if (!jsonPrimitive.isString()) {
                        jsonPrimitive = null;
                    }
                    if (jsonPrimitive != null && (content = jsonPrimitive.getContent()) != null) {
                        String strD = d(content);
                        SessionId sessionIdM1114boximpl = strD != null ? SessionId.m1114boximpl(strD) : null;
                        String strM1120unboximpl = sessionIdM1114boximpl != null ? sessionIdM1114boximpl.m1120unboximpl() : null;
                        if (strM1120unboximpl != null) {
                            return strM1120unboximpl;
                        }
                    }
                }
            }
        }
        List<ToolResult> content2 = sdkToolResultContent.getContent();
        ArrayList arrayList = new ArrayList();
        for (Object obj : content2) {
            if (obj instanceof TextToolResult) {
                arrayList.add(obj);
            }
        }
        ova ovaVarB = b.b(w44.S0(arrayList, "\n", null, null, new q6(5), 30));
        if (ovaVarB != null && (str = (String) w44.O0(1, ovaVarB.a())) != null) {
            String strD2 = d(str);
            SessionId sessionIdM1114boximpl2 = strD2 != null ? SessionId.m1114boximpl(strD2) : null;
            if (sessionIdM1114boximpl2 != null) {
                return sessionIdM1114boximpl2.m1120unboximpl();
            }
        }
        return null;
    }

    public static final String d(String str) {
        if (isg.q0(str, "session_", false)) {
            return SessionId.m1115constructorimpl(str);
        }
        if (isg.q0(str, "cse_", false)) {
            return SessionId.m1115constructorimpl("session_".concat(bsg.R0(str, "cse_")));
        }
        return null;
    }
}
