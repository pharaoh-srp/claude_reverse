package com.anthropic.claude.analytics.events;

import defpackage.gi3;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.tq3;
import defpackage.uq3;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 82\u00020\u0001:\u00029:BG\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fBU\b\u0010\u0012\u0006\u0010\r\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0010J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ\u0010\u0010\"\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\"\u0010#JT\u0010$\u001a\u00020\u00112\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001cJ\u0010\u0010'\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b'\u0010#J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001cR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b/\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b0\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b2\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b3\u0010\u001cR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b5\u0010#R\u0014\u00107\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u0010\u001c¨\u0006;"}, d2 = {"com/anthropic/claude/analytics/events/CodeBlockEvents$CodeBlockActionClicked", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "chat_uuid", "message_uuid", "Lcom/anthropic/claude/analytics/events/CodeBlockEvents$CodeBlockAction;", "action", "code_language", "", "code_length", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/CodeBlockEvents$CodeBlockAction;Ljava/lang/String;I)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/CodeBlockEvents$CodeBlockAction;Ljava/lang/String;ILvnf;)V", "Lcom/anthropic/claude/analytics/events/CodeBlockEvents$CodeBlockActionClicked;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/CodeBlockEvents$CodeBlockActionClicked;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/anthropic/claude/analytics/events/CodeBlockEvents$CodeBlockAction;", "component5", "component6", "()I", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/CodeBlockEvents$CodeBlockAction;Ljava/lang/String;I)Lcom/anthropic/claude/analytics/events/CodeBlockEvents$CodeBlockActionClicked;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrganization_uuid", "getChat_uuid", "getMessage_uuid", "Lcom/anthropic/claude/analytics/events/CodeBlockEvents$CodeBlockAction;", "getAction", "getCode_language", "I", "getCode_length", "getEventName", "eventName", "Companion", "tq3", "uq3", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class CodeBlockEvents$CodeBlockActionClicked implements AnalyticsEvent {
    public static final int $stable = 0;
    private final CodeBlockEvents$CodeBlockAction action;
    private final String chat_uuid;
    private final String code_language;
    private final int code_length;
    private final String message_uuid;
    private final String organization_uuid;
    public static final uq3 Companion = new uq3();
    private static final kw9[] $childSerializers = {null, null, null, yb5.w(w1a.F, new gi3(12)), null, null};

    public /* synthetic */ CodeBlockEvents$CodeBlockActionClicked(int i, String str, String str2, String str3, CodeBlockEvents$CodeBlockAction codeBlockEvents$CodeBlockAction, String str4, int i2, vnf vnfVar) {
        if (40 != (i & 40)) {
            gvj.f(i, 40, tq3.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.organization_uuid = null;
        } else {
            this.organization_uuid = str;
        }
        if ((i & 2) == 0) {
            this.chat_uuid = null;
        } else {
            this.chat_uuid = str2;
        }
        if ((i & 4) == 0) {
            this.message_uuid = null;
        } else {
            this.message_uuid = str3;
        }
        this.action = codeBlockEvents$CodeBlockAction;
        if ((i & 16) == 0) {
            this.code_language = null;
        } else {
            this.code_language = str4;
        }
        this.code_length = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return CodeBlockEvents$CodeBlockAction.Companion.serializer();
    }

    public static /* synthetic */ CodeBlockEvents$CodeBlockActionClicked copy$default(CodeBlockEvents$CodeBlockActionClicked codeBlockEvents$CodeBlockActionClicked, String str, String str2, String str3, CodeBlockEvents$CodeBlockAction codeBlockEvents$CodeBlockAction, String str4, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = codeBlockEvents$CodeBlockActionClicked.organization_uuid;
        }
        if ((i2 & 2) != 0) {
            str2 = codeBlockEvents$CodeBlockActionClicked.chat_uuid;
        }
        if ((i2 & 4) != 0) {
            str3 = codeBlockEvents$CodeBlockActionClicked.message_uuid;
        }
        if ((i2 & 8) != 0) {
            codeBlockEvents$CodeBlockAction = codeBlockEvents$CodeBlockActionClicked.action;
        }
        if ((i2 & 16) != 0) {
            str4 = codeBlockEvents$CodeBlockActionClicked.code_language;
        }
        if ((i2 & 32) != 0) {
            i = codeBlockEvents$CodeBlockActionClicked.code_length;
        }
        String str5 = str4;
        int i3 = i;
        return codeBlockEvents$CodeBlockActionClicked.copy(str, str2, str3, codeBlockEvents$CodeBlockAction, str5, i3);
    }

    public static final /* synthetic */ void write$Self$analytics(CodeBlockEvents$CodeBlockActionClicked self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        if (output.E(serialDesc) || self.organization_uuid != null) {
            output.B(serialDesc, 0, srg.a, self.organization_uuid);
        }
        if (output.E(serialDesc) || self.chat_uuid != null) {
            output.B(serialDesc, 1, srg.a, self.chat_uuid);
        }
        if (output.E(serialDesc) || self.message_uuid != null) {
            output.B(serialDesc, 2, srg.a, self.message_uuid);
        }
        output.r(serialDesc, 3, (znf) kw9VarArr[3].getValue(), self.action);
        if (output.E(serialDesc) || self.code_language != null) {
            output.B(serialDesc, 4, srg.a, self.code_language);
        }
        output.l(5, self.code_length, serialDesc);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getChat_uuid() {
        return this.chat_uuid;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMessage_uuid() {
        return this.message_uuid;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final CodeBlockEvents$CodeBlockAction getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCode_language() {
        return this.code_language;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getCode_length() {
        return this.code_length;
    }

    public final CodeBlockEvents$CodeBlockActionClicked copy(String organization_uuid, String chat_uuid, String message_uuid, CodeBlockEvents$CodeBlockAction action, String code_language, int code_length) {
        action.getClass();
        return new CodeBlockEvents$CodeBlockActionClicked(organization_uuid, chat_uuid, message_uuid, action, code_language, code_length);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CodeBlockEvents$CodeBlockActionClicked)) {
            return false;
        }
        CodeBlockEvents$CodeBlockActionClicked codeBlockEvents$CodeBlockActionClicked = (CodeBlockEvents$CodeBlockActionClicked) other;
        return x44.r(this.organization_uuid, codeBlockEvents$CodeBlockActionClicked.organization_uuid) && x44.r(this.chat_uuid, codeBlockEvents$CodeBlockActionClicked.chat_uuid) && x44.r(this.message_uuid, codeBlockEvents$CodeBlockActionClicked.message_uuid) && this.action == codeBlockEvents$CodeBlockActionClicked.action && x44.r(this.code_language, codeBlockEvents$CodeBlockActionClicked.code_language) && this.code_length == codeBlockEvents$CodeBlockActionClicked.code_length;
    }

    public final CodeBlockEvents$CodeBlockAction getAction() {
        return this.action;
    }

    public final String getChat_uuid() {
        return this.chat_uuid;
    }

    public final String getCode_language() {
        return this.code_language;
    }

    public final int getCode_length() {
        return this.code_length;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "code_block_action_clicked";
    }

    public final String getMessage_uuid() {
        return this.message_uuid;
    }

    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    public int hashCode() {
        String str = this.organization_uuid;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.chat_uuid;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.message_uuid;
        int iHashCode3 = (this.action.hashCode() + ((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        String str4 = this.code_language;
        return Integer.hashCode(this.code_length) + ((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.organization_uuid;
        String str2 = this.chat_uuid;
        String str3 = this.message_uuid;
        CodeBlockEvents$CodeBlockAction codeBlockEvents$CodeBlockAction = this.action;
        String str4 = this.code_language;
        int i = this.code_length;
        StringBuilder sbR = kgh.r("CodeBlockActionClicked(organization_uuid=", str, ", chat_uuid=", str2, ", message_uuid=");
        sbR.append(str3);
        sbR.append(", action=");
        sbR.append(codeBlockEvents$CodeBlockAction);
        sbR.append(", code_language=");
        sbR.append(str4);
        sbR.append(", code_length=");
        sbR.append(i);
        sbR.append(")");
        return sbR.toString();
    }

    public CodeBlockEvents$CodeBlockActionClicked(String str, String str2, String str3, CodeBlockEvents$CodeBlockAction codeBlockEvents$CodeBlockAction, String str4, int i) {
        codeBlockEvents$CodeBlockAction.getClass();
        this.organization_uuid = str;
        this.chat_uuid = str2;
        this.message_uuid = str3;
        this.action = codeBlockEvents$CodeBlockAction;
        this.code_language = str4;
        this.code_length = i;
    }

    public /* synthetic */ CodeBlockEvents$CodeBlockActionClicked(String str, String str2, String str3, CodeBlockEvents$CodeBlockAction codeBlockEvents$CodeBlockAction, String str4, int i, int i2, mq5 mq5Var) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, codeBlockEvents$CodeBlockAction, (i2 & 16) != 0 ? null : str4, i);
    }
}
