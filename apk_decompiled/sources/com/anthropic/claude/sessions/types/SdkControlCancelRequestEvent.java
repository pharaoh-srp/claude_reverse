package com.anthropic.claude.sessions.types;

import defpackage.gvj;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.waf;
import defpackage.xaf;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001c\u001dB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018¨\u0006\u001e"}, d2 = {"Lcom/anthropic/claude/sessions/types/SdkControlCancelRequestEvent;", "Lcom/anthropic/claude/sessions/types/SdkEvent;", "", "type", "request_id", "parent_tool_use_id", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/SdkControlCancelRequestEvent;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "getRequest_id", "getParent_tool_use_id", "Companion", "waf", "xaf", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class SdkControlCancelRequestEvent implements SdkEvent {
    public static final xaf Companion = new xaf();
    private final String parent_tool_use_id;
    private final String request_id;
    private final String type;

    public /* synthetic */ SdkControlCancelRequestEvent(int i, String str, String str2, String str3, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, waf.a.getDescriptor());
            throw null;
        }
        this.type = str;
        this.request_id = str2;
        if ((i & 4) == 0) {
            this.parent_tool_use_id = null;
        } else {
            this.parent_tool_use_id = str3;
        }
    }

    public static final /* synthetic */ void write$Self$sessions(SdkControlCancelRequestEvent self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.getType());
        output.q(serialDesc, 1, self.request_id);
        if (!output.E(serialDesc) && self.getParent_tool_use_id() == null) {
            return;
        }
        output.B(serialDesc, 2, srg.a, self.getParent_tool_use_id());
    }

    @Override // com.anthropic.claude.sessions.types.SdkEvent
    public String getParent_tool_use_id() {
        return this.parent_tool_use_id;
    }

    public final String getRequest_id() {
        return this.request_id;
    }

    @Override // com.anthropic.claude.sessions.types.SdkEvent
    public String getType() {
        return this.type;
    }

    public SdkControlCancelRequestEvent(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        this.type = str;
        this.request_id = str2;
        this.parent_tool_use_id = str3;
    }

    public /* synthetic */ SdkControlCancelRequestEvent(String str, String str2, String str3, int i, mq5 mq5Var) {
        this(str, str2, (i & 4) != 0 ? null : str3);
    }
}
