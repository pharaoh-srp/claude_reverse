package com.anthropic.claude.sessions.types;

import defpackage.eh9;
import defpackage.gvj;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.yaf;
import defpackage.zaf;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u0000  2\u00020\u0001:\u0002!\"B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u001f\u0010\u001a¨\u0006#"}, d2 = {"Lcom/anthropic/claude/sessions/types/SdkControlRequestEvent;", "Lcom/anthropic/claude/sessions/types/SdkEvent;", "", "type", "request_id", "Lkotlinx/serialization/json/JsonElement;", "request", "parent_tool_use_id", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/SdkControlRequestEvent;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "getRequest_id", "Lkotlinx/serialization/json/JsonElement;", "getRequest", "()Lkotlinx/serialization/json/JsonElement;", "getParent_tool_use_id", "Companion", "yaf", "zaf", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class SdkControlRequestEvent implements SdkEvent {
    public static final zaf Companion = new zaf();
    private final String parent_tool_use_id;
    private final JsonElement request;
    private final String request_id;
    private final String type;

    public /* synthetic */ SdkControlRequestEvent(int i, String str, String str2, JsonElement jsonElement, String str3, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, yaf.a.getDescriptor());
            throw null;
        }
        this.type = str;
        this.request_id = str2;
        if ((i & 4) == 0) {
            this.request = null;
        } else {
            this.request = jsonElement;
        }
        if ((i & 8) == 0) {
            this.parent_tool_use_id = null;
        } else {
            this.parent_tool_use_id = str3;
        }
    }

    public static final /* synthetic */ void write$Self$sessions(SdkControlRequestEvent self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.getType());
        output.q(serialDesc, 1, self.request_id);
        if (output.E(serialDesc) || self.request != null) {
            output.B(serialDesc, 2, eh9.a, self.request);
        }
        if (!output.E(serialDesc) && self.getParent_tool_use_id() == null) {
            return;
        }
        output.B(serialDesc, 3, srg.a, self.getParent_tool_use_id());
    }

    @Override // com.anthropic.claude.sessions.types.SdkEvent
    public String getParent_tool_use_id() {
        return this.parent_tool_use_id;
    }

    public final JsonElement getRequest() {
        return this.request;
    }

    public final String getRequest_id() {
        return this.request_id;
    }

    @Override // com.anthropic.claude.sessions.types.SdkEvent
    public String getType() {
        return this.type;
    }

    public SdkControlRequestEvent(String str, String str2, JsonElement jsonElement, String str3) {
        str.getClass();
        str2.getClass();
        this.type = str;
        this.request_id = str2;
        this.request = jsonElement;
        this.parent_tool_use_id = str3;
    }

    public /* synthetic */ SdkControlRequestEvent(String str, String str2, JsonElement jsonElement, String str3, int i, mq5 mq5Var) {
        this(str, str2, (i & 4) != 0 ? null : jsonElement, (i & 8) != 0 ? null : str3);
    }
}
