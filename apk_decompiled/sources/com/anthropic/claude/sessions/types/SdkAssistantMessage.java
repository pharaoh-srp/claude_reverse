package com.anthropic.claude.sessions.types;

import defpackage.gvj;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.pfb;
import defpackage.srg;
import defpackage.uaf;
import defpackage.vaf;
import defpackage.vd4;
import defpackage.vnf;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0001\u0018\u0000 )2\u00020\u0001:\u0002*+BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rBg\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b!\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\"\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b#\u0010\u001eR&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010$\u0012\u0004\b'\u0010(\u001a\u0004\b%\u0010&¨\u0006,"}, d2 = {"Lcom/anthropic/claude/sessions/types/SdkAssistantMessage;", "Lcom/anthropic/claude/sessions/types/SdkMessage;", "", "role", "id", "model", "stop_reason", "stop_sequence", "type", "", "Lcom/anthropic/claude/sessions/types/SdkMessageContent;", "content", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/SdkAssistantMessage;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getRole", "()Ljava/lang/String;", "getId", "getModel", "getStop_reason", "getStop_sequence", "getType", "Ljava/util/List;", "getContent", "()Ljava/util/List;", "getContent$annotations", "()V", "Companion", "uaf", "vaf", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class SdkAssistantMessage implements SdkMessage {
    public static final vaf Companion = new vaf();
    private final List<SdkMessageContent> content;
    private final String id;
    private final String model;
    private final String role;
    private final String stop_reason;
    private final String stop_sequence;
    private final String type;

    public /* synthetic */ SdkAssistantMessage(int i, String str, String str2, String str3, String str4, String str5, String str6, List list, vnf vnfVar) {
        if (65 != (i & 65)) {
            gvj.f(i, 65, uaf.a.getDescriptor());
            throw null;
        }
        this.role = str;
        if ((i & 2) == 0) {
            this.id = null;
        } else {
            this.id = str2;
        }
        if ((i & 4) == 0) {
            this.model = null;
        } else {
            this.model = str3;
        }
        if ((i & 8) == 0) {
            this.stop_reason = null;
        } else {
            this.stop_reason = str4;
        }
        if ((i & 16) == 0) {
            this.stop_sequence = null;
        } else {
            this.stop_sequence = str5;
        }
        if ((i & 32) == 0) {
            this.type = null;
        } else {
            this.type = str6;
        }
        this.content = list;
    }

    @onf(with = pfb.class)
    public static /* synthetic */ void getContent$annotations() {
    }

    public static final /* synthetic */ void write$Self$sessions(SdkAssistantMessage self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.getRole());
        if (output.E(serialDesc) || self.id != null) {
            output.B(serialDesc, 1, srg.a, self.id);
        }
        if (output.E(serialDesc) || self.model != null) {
            output.B(serialDesc, 2, srg.a, self.model);
        }
        if (output.E(serialDesc) || self.stop_reason != null) {
            output.B(serialDesc, 3, srg.a, self.stop_reason);
        }
        if (output.E(serialDesc) || self.stop_sequence != null) {
            output.B(serialDesc, 4, srg.a, self.stop_sequence);
        }
        if (output.E(serialDesc) || self.type != null) {
            output.B(serialDesc, 5, srg.a, self.type);
        }
        output.r(serialDesc, 6, pfb.a, self.content);
    }

    public final List<SdkMessageContent> getContent() {
        return this.content;
    }

    public final String getId() {
        return this.id;
    }

    public final String getModel() {
        return this.model;
    }

    @Override // com.anthropic.claude.sessions.types.SdkMessage
    public String getRole() {
        return this.role;
    }

    public final String getStop_reason() {
        return this.stop_reason;
    }

    public final String getStop_sequence() {
        return this.stop_sequence;
    }

    public final String getType() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SdkAssistantMessage(String str, String str2, String str3, String str4, String str5, String str6, List<? extends SdkMessageContent> list) {
        str.getClass();
        list.getClass();
        this.role = str;
        this.id = str2;
        this.model = str3;
        this.stop_reason = str4;
        this.stop_sequence = str5;
        this.type = str6;
        this.content = list;
    }

    public /* synthetic */ SdkAssistantMessage(String str, String str2, String str3, String str4, String str5, String str6, List list, int i, mq5 mq5Var) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, list);
    }
}
