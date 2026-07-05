package com.anthropic.claude.sessions.types;

import com.anthropic.claude.types.strings.ToolUseId;
import defpackage.afe;
import defpackage.bsg;
import defpackage.eh9;
import defpackage.f7a;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.ow0;
import defpackage.rke;
import defpackage.srg;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 @2\u00020\u0001:\u0002ABBS\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rBc\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0010\u0010\"\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\u001dJ\u001e\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b#\u0010$J\\\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u001dJ\u0010\u0010)\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u001dR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b1\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b2\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b3\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b4\u0010\u001dR%\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b6\u0010$R\u0011\u00108\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b7\u0010\u001dR\u0011\u00109\u001a\u00020,8F¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0011\u0010;\u001a\u00020,8F¢\u0006\u0006\u001a\u0004\b;\u0010:R\u0013\u0010?\u001a\u0004\u0018\u00010<8F¢\u0006\u0006\u001a\u0004\b=\u0010>¨\u0006C"}, d2 = {"Lcom/anthropic/claude/sessions/types/RequiresActionDetails;", "", "", "tool_name", "display_tool_name", "action_description", "request_id", "Lcom/anthropic/claude/types/strings/ToolUseId;", "tool_use_id", "", "Lkotlinx/serialization/json/JsonElement;", "input", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/RequiresActionDetails;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5-ERU6ZeY", "component5", "component6", "()Ljava/util/Map;", "copy-ib_xJck", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/anthropic/claude/sessions/types/RequiresActionDetails;", "copy", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTool_name", "getDisplay_tool_name", "getAction_description", "getRequest_id", "getTool_use_id-ERU6ZeY", "Ljava/util/Map;", "getInput", "getDisplayName", "displayName", "isToolPermission", "()Z", "isAskUserQuestion", "Lcom/anthropic/claude/sessions/types/AskUserQuestionInput;", "getAskUserQuestion", "()Lcom/anthropic/claude/sessions/types/AskUserQuestionInput;", "askUserQuestion", "Companion", "rke", "qke", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class RequiresActionDetails {
    public static final String ASK_USER_QUESTION = "AskUserQuestion";
    private final String action_description;
    private final String display_tool_name;
    private final Map<String, JsonElement> input;
    private final String request_id;
    private final String tool_name;
    private final String tool_use_id;
    public static final rke Companion = new rke();
    private static final kw9[] $childSerializers = {null, null, null, null, null, yb5.w(w1a.F, new afe(4))};

    private RequiresActionDetails(int i, String str, String str2, String str3, String str4, String str5, Map map, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.tool_name = "";
        } else {
            this.tool_name = str;
        }
        if ((i & 2) == 0) {
            this.display_tool_name = null;
        } else {
            this.display_tool_name = str2;
        }
        if ((i & 4) == 0) {
            this.action_description = "";
        } else {
            this.action_description = str3;
        }
        if ((i & 8) == 0) {
            this.request_id = "";
        } else {
            this.request_id = str4;
        }
        if ((i & 16) == 0) {
            ToolUseId.Companion.getClass();
            this.tool_use_id = ToolUseId.EMPTY;
        } else {
            this.tool_use_id = str5;
        }
        if ((i & 32) == 0) {
            this.input = null;
        } else {
            this.input = map;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new f7a(srg.a, eh9.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-ib_xJck$default, reason: not valid java name */
    public static /* synthetic */ RequiresActionDetails m862copyib_xJck$default(RequiresActionDetails requiresActionDetails, String str, String str2, String str3, String str4, String str5, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = requiresActionDetails.tool_name;
        }
        if ((i & 2) != 0) {
            str2 = requiresActionDetails.display_tool_name;
        }
        if ((i & 4) != 0) {
            str3 = requiresActionDetails.action_description;
        }
        if ((i & 8) != 0) {
            str4 = requiresActionDetails.request_id;
        }
        if ((i & 16) != 0) {
            str5 = requiresActionDetails.tool_use_id;
        }
        if ((i & 32) != 0) {
            map = requiresActionDetails.input;
        }
        String str6 = str5;
        Map map2 = map;
        return requiresActionDetails.m864copyib_xJck(str, str2, str3, str4, str6, map2);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void write$Self$sessions(com.anthropic.claude.sessions.types.RequiresActionDetails r5, defpackage.vd4 r6, kotlinx.serialization.descriptors.SerialDescriptor r7) {
        /*
            kw9[] r0 = com.anthropic.claude.sessions.types.RequiresActionDetails.$childSerializers
            boolean r1 = r6.E(r7)
            java.lang.String r2 = ""
            if (r1 == 0) goto Lb
            goto L13
        Lb:
            java.lang.String r1 = r5.tool_name
            boolean r1 = defpackage.x44.r(r1, r2)
            if (r1 != 0) goto L19
        L13:
            java.lang.String r1 = r5.tool_name
            r3 = 0
            r6.q(r7, r3, r1)
        L19:
            boolean r1 = r6.E(r7)
            if (r1 == 0) goto L20
            goto L24
        L20:
            java.lang.String r1 = r5.display_tool_name
            if (r1 == 0) goto L2c
        L24:
            srg r1 = defpackage.srg.a
            java.lang.String r3 = r5.display_tool_name
            r4 = 1
            r6.B(r7, r4, r1, r3)
        L2c:
            boolean r1 = r6.E(r7)
            if (r1 == 0) goto L33
            goto L3b
        L33:
            java.lang.String r1 = r5.action_description
            boolean r1 = defpackage.x44.r(r1, r2)
            if (r1 != 0) goto L41
        L3b:
            java.lang.String r1 = r5.action_description
            r3 = 2
            r6.q(r7, r3, r1)
        L41:
            boolean r1 = r6.E(r7)
            if (r1 == 0) goto L48
            goto L50
        L48:
            java.lang.String r1 = r5.request_id
            boolean r1 = defpackage.x44.r(r1, r2)
            if (r1 != 0) goto L56
        L50:
            java.lang.String r1 = r5.request_id
            r2 = 3
            r6.q(r7, r2, r1)
        L56:
            boolean r1 = r6.E(r7)
            if (r1 == 0) goto L5d
            goto L6e
        L5d:
            java.lang.String r1 = r5.tool_use_id
            d1i r2 = com.anthropic.claude.types.strings.ToolUseId.Companion
            r2.getClass()
            java.lang.String r2 = com.anthropic.claude.types.strings.ToolUseId.access$getEMPTY$cp()
            boolean r1 = com.anthropic.claude.types.strings.ToolUseId.m1160equalsimpl0(r1, r2)
            if (r1 != 0) goto L7a
        L6e:
            c1i r1 = defpackage.c1i.a
            java.lang.String r2 = r5.tool_use_id
            com.anthropic.claude.types.strings.ToolUseId r2 = com.anthropic.claude.types.strings.ToolUseId.m1157boximpl(r2)
            r3 = 4
            r6.r(r7, r3, r1, r2)
        L7a:
            boolean r1 = r6.E(r7)
            if (r1 == 0) goto L81
            goto L85
        L81:
            java.util.Map<java.lang.String, kotlinx.serialization.json.JsonElement> r1 = r5.input
            if (r1 == 0) goto L93
        L85:
            r1 = 5
            r0 = r0[r1]
            java.lang.Object r0 = r0.getValue()
            znf r0 = (defpackage.znf) r0
            java.util.Map<java.lang.String, kotlinx.serialization.json.JsonElement> r5 = r5.input
            r6.B(r7, r1, r0, r5)
        L93:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.sessions.types.RequiresActionDetails.write$Self$sessions(com.anthropic.claude.sessions.types.RequiresActionDetails, vd4, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTool_name() {
        return this.tool_name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDisplay_tool_name() {
        return this.display_tool_name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAction_description() {
        return this.action_description;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getRequest_id() {
        return this.request_id;
    }

    /* JADX INFO: renamed from: component5-ERU6ZeY, reason: not valid java name and from getter */
    public final String getTool_use_id() {
        return this.tool_use_id;
    }

    public final Map<String, JsonElement> component6() {
        return this.input;
    }

    /* JADX INFO: renamed from: copy-ib_xJck, reason: not valid java name */
    public final RequiresActionDetails m864copyib_xJck(String tool_name, String display_tool_name, String action_description, String request_id, String tool_use_id, Map<String, ? extends JsonElement> input) {
        tool_name.getClass();
        action_description.getClass();
        request_id.getClass();
        tool_use_id.getClass();
        return new RequiresActionDetails(tool_name, display_tool_name, action_description, request_id, tool_use_id, input, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RequiresActionDetails)) {
            return false;
        }
        RequiresActionDetails requiresActionDetails = (RequiresActionDetails) other;
        return x44.r(this.tool_name, requiresActionDetails.tool_name) && x44.r(this.display_tool_name, requiresActionDetails.display_tool_name) && x44.r(this.action_description, requiresActionDetails.action_description) && x44.r(this.request_id, requiresActionDetails.request_id) && ToolUseId.m1160equalsimpl0(this.tool_use_id, requiresActionDetails.tool_use_id) && x44.r(this.input, requiresActionDetails.input);
    }

    public final String getAction_description() {
        return this.action_description;
    }

    public final AskUserQuestionInput getAskUserQuestion() {
        Map<String, JsonElement> map;
        if (!isAskUserQuestion() || (map = this.input) == null) {
            return null;
        }
        return ow0.a(map);
    }

    public final String getDisplayName() {
        String str = this.display_tool_name;
        if (str != null) {
            if (bsg.I0(str)) {
                str = null;
            }
            if (str != null) {
                return str;
            }
        }
        return this.tool_name;
    }

    public final String getDisplay_tool_name() {
        return this.display_tool_name;
    }

    public final Map<String, JsonElement> getInput() {
        return this.input;
    }

    public final String getRequest_id() {
        return this.request_id;
    }

    public final String getTool_name() {
        return this.tool_name;
    }

    /* JADX INFO: renamed from: getTool_use_id-ERU6ZeY, reason: not valid java name */
    public final String m865getTool_use_idERU6ZeY() {
        return this.tool_use_id;
    }

    public int hashCode() {
        int iHashCode = this.tool_name.hashCode() * 31;
        String str = this.display_tool_name;
        int iM1161hashCodeimpl = (ToolUseId.m1161hashCodeimpl(this.tool_use_id) + kgh.l(kgh.l((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.action_description), 31, this.request_id)) * 31;
        Map<String, JsonElement> map = this.input;
        return iM1161hashCodeimpl + (map != null ? map.hashCode() : 0);
    }

    public final boolean isAskUserQuestion() {
        return x44.r(this.tool_name, ASK_USER_QUESTION);
    }

    public final boolean isToolPermission() {
        return this.request_id.length() > 0 && this.tool_use_id.length() > 0 && this.tool_name.length() > 0 && !x44.r(this.tool_name, "ExitPlanMode") && !isAskUserQuestion();
    }

    public String toString() {
        String str = this.tool_name;
        String str2 = this.display_tool_name;
        String str3 = this.action_description;
        String str4 = this.request_id;
        String strM1162toStringimpl = ToolUseId.m1162toStringimpl(this.tool_use_id);
        Map<String, JsonElement> map = this.input;
        StringBuilder sbR = kgh.r("RequiresActionDetails(tool_name=", str, ", display_tool_name=", str2, ", action_description=");
        kgh.u(sbR, str3, ", request_id=", str4, ", tool_use_id=");
        sbR.append(strM1162toStringimpl);
        sbR.append(", input=");
        sbR.append(map);
        sbR.append(")");
        return sbR.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private RequiresActionDetails(String str, String str2, String str3, String str4, String str5, Map<String, ? extends JsonElement> map) {
        ij0.z(str, str3, str4, str5);
        this.tool_name = str;
        this.display_tool_name = str2;
        this.action_description = str3;
        this.request_id = str4;
        this.tool_use_id = str5;
        this.input = map;
    }

    public /* synthetic */ RequiresActionDetails(String str, String str2, String str3, String str4, String str5, Map map, mq5 mq5Var) {
        this(str, str2, str3, str4, str5, map);
    }

    public /* synthetic */ RequiresActionDetails(int i, String str, String str2, String str3, String str4, String str5, Map map, vnf vnfVar, mq5 mq5Var) {
        this(i, str, str2, str3, str4, str5, map, vnfVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public RequiresActionDetails(String str, String str2, String str3, String str4, String str5, Map map, int i, mq5 mq5Var) {
        str = (i & 1) != 0 ? "" : str;
        str2 = (i & 2) != 0 ? null : str2;
        str3 = (i & 4) != 0 ? "" : str3;
        str4 = (i & 8) != 0 ? "" : str4;
        if ((i & 16) != 0) {
            ToolUseId.Companion.getClass();
            str5 = ToolUseId.EMPTY;
        }
        this(str, str2, str3, str4, str5, (i & 32) != 0 ? null : map, null);
    }
}
