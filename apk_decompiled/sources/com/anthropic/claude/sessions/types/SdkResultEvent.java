package com.anthropic.claude.sessions.types;

import defpackage.gvj;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.xbf;
import defpackage.ybf;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u0000 \u001f2\u00020\u0001:\u0002 !B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bBM\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0007\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a¨\u0006\""}, d2 = {"Lcom/anthropic/claude/sessions/types/SdkResultEvent;", "Lcom/anthropic/claude/sessions/types/SdkEvent;", "", "type", "uuid", "subtype", "result", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "parent_tool_use_id", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/SdkResultEvent;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "getUuid", "getSubtype", "getResult", "getParent_tool_use_id", "Companion", "xbf", "ybf", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class SdkResultEvent implements SdkEvent {
    public static final ybf Companion = new ybf();
    private final String parent_tool_use_id;
    private final String result;
    private final String subtype;
    private final String type;
    private final String uuid;

    public /* synthetic */ SdkResultEvent(int i, String str, String str2, String str3, String str4, String str5, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, xbf.a.getDescriptor());
            throw null;
        }
        this.type = str;
        this.uuid = str2;
        if ((i & 4) == 0) {
            this.subtype = null;
        } else {
            this.subtype = str3;
        }
        if ((i & 8) == 0) {
            this.result = null;
        } else {
            this.result = str4;
        }
        if ((i & 16) == 0) {
            this.parent_tool_use_id = null;
        } else {
            this.parent_tool_use_id = str5;
        }
    }

    public static final /* synthetic */ void write$Self$sessions(SdkResultEvent self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.getType());
        output.q(serialDesc, 1, self.uuid);
        if (output.E(serialDesc) || self.subtype != null) {
            output.B(serialDesc, 2, srg.a, self.subtype);
        }
        if (output.E(serialDesc) || self.result != null) {
            output.B(serialDesc, 3, srg.a, self.result);
        }
        if (!output.E(serialDesc) && self.getParent_tool_use_id() == null) {
            return;
        }
        output.B(serialDesc, 4, srg.a, self.getParent_tool_use_id());
    }

    @Override // com.anthropic.claude.sessions.types.SdkEvent
    public String getParent_tool_use_id() {
        return this.parent_tool_use_id;
    }

    public final String getResult() {
        return this.result;
    }

    public final String getSubtype() {
        return this.subtype;
    }

    @Override // com.anthropic.claude.sessions.types.SdkEvent
    public String getType() {
        return this.type;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public SdkResultEvent(String str, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        this.type = str;
        this.uuid = str2;
        this.subtype = str3;
        this.result = str4;
    }

    public /* synthetic */ SdkResultEvent(String str, String str2, String str3, String str4, int i, mq5 mq5Var) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
