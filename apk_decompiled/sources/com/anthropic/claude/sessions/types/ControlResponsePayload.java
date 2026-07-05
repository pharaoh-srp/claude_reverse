package com.anthropic.claude.sessions.types;

import defpackage.ayc;
import defpackage.eh9;
import defpackage.f7a;
import defpackage.fq4;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.l84;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.qy1;
import defpackage.srg;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0081\b\u0018\u0000 ;2\u00020\u0001:\u0002<=By\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u000e\u0010\u000fB\u007f\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u001e\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0018\u0010#\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001fJ\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001fJ\u001e\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b'\u0010\"J\u0082\u0001\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u001fJ\u0010\u0010+\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b/\u00100R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u001fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00101\u001a\u0004\b3\u0010\u001fR%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b5\u0010\"R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u00106\u001a\u0004\b7\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b8\u0010\u001fR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u00101\u001a\u0004\b9\u0010\u001fR%\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\r\u00104\u001a\u0004\b:\u0010\"¨\u0006>"}, d2 = {"Lcom/anthropic/claude/sessions/types/ControlResponsePayload;", "", "", "behavior", "toolUseID", "", "Lkotlinx/serialization/json/JsonElement;", "updatedInput", "", "Lcom/anthropic/claude/sessions/types/PermissionUpdate;", "updatedPermissions", "message", "action", "content", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/ControlResponsePayload;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/Map;", "component4", "()Ljava/util/List;", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/anthropic/claude/sessions/types/ControlResponsePayload;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBehavior", "getToolUseID", "Ljava/util/Map;", "getUpdatedInput", "Ljava/util/List;", "getUpdatedPermissions", "getMessage", "getAction", "getContent", "Companion", "eq4", "fq4", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ControlResponsePayload {
    private static final kw9[] $childSerializers;
    public static final fq4 Companion = new fq4();
    private final String action;
    private final String behavior;
    private final Map<String, JsonElement> content;
    private final String message;
    private final String toolUseID;
    private final Map<String, JsonElement> updatedInput;
    private final List<PermissionUpdate> updatedPermissions;

    static {
        l84 l84Var = new l84(23);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{null, null, yb5.w(w1aVar, l84Var), yb5.w(w1aVar, new l84(24)), null, null, yb5.w(w1aVar, new l84(25))};
    }

    public /* synthetic */ ControlResponsePayload(int i, String str, String str2, Map map, List list, String str3, String str4, Map map2, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.behavior = null;
        } else {
            this.behavior = str;
        }
        if ((i & 2) == 0) {
            this.toolUseID = null;
        } else {
            this.toolUseID = str2;
        }
        if ((i & 4) == 0) {
            this.updatedInput = null;
        } else {
            this.updatedInput = map;
        }
        if ((i & 8) == 0) {
            this.updatedPermissions = null;
        } else {
            this.updatedPermissions = list;
        }
        if ((i & 16) == 0) {
            this.message = null;
        } else {
            this.message = str3;
        }
        if ((i & 32) == 0) {
            this.action = null;
        } else {
            this.action = str4;
        }
        if ((i & 64) == 0) {
            this.content = null;
        } else {
            this.content = map2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new f7a(srg.a, eh9.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new uo0(ayc.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new f7a(srg.a, eh9.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ControlResponsePayload copy$default(ControlResponsePayload controlResponsePayload, String str, String str2, Map map, List list, String str3, String str4, Map map2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = controlResponsePayload.behavior;
        }
        if ((i & 2) != 0) {
            str2 = controlResponsePayload.toolUseID;
        }
        if ((i & 4) != 0) {
            map = controlResponsePayload.updatedInput;
        }
        if ((i & 8) != 0) {
            list = controlResponsePayload.updatedPermissions;
        }
        if ((i & 16) != 0) {
            str3 = controlResponsePayload.message;
        }
        if ((i & 32) != 0) {
            str4 = controlResponsePayload.action;
        }
        if ((i & 64) != 0) {
            map2 = controlResponsePayload.content;
        }
        String str5 = str4;
        Map map3 = map2;
        String str6 = str3;
        Map map4 = map;
        return controlResponsePayload.copy(str, str2, map4, list, str6, str5, map3);
    }

    public static final /* synthetic */ void write$Self$sessions(ControlResponsePayload self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        if (output.E(serialDesc) || self.behavior != null) {
            output.B(serialDesc, 0, srg.a, self.behavior);
        }
        if (output.E(serialDesc) || self.toolUseID != null) {
            output.B(serialDesc, 1, srg.a, self.toolUseID);
        }
        if (output.E(serialDesc) || self.updatedInput != null) {
            output.B(serialDesc, 2, (znf) kw9VarArr[2].getValue(), self.updatedInput);
        }
        if (output.E(serialDesc) || self.updatedPermissions != null) {
            output.B(serialDesc, 3, (znf) kw9VarArr[3].getValue(), self.updatedPermissions);
        }
        if (output.E(serialDesc) || self.message != null) {
            output.B(serialDesc, 4, srg.a, self.message);
        }
        if (output.E(serialDesc) || self.action != null) {
            output.B(serialDesc, 5, srg.a, self.action);
        }
        if (!output.E(serialDesc) && self.content == null) {
            return;
        }
        output.B(serialDesc, 6, (znf) kw9VarArr[6].getValue(), self.content);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBehavior() {
        return this.behavior;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getToolUseID() {
        return this.toolUseID;
    }

    public final Map<String, JsonElement> component3() {
        return this.updatedInput;
    }

    public final List<PermissionUpdate> component4() {
        return this.updatedPermissions;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    public final Map<String, JsonElement> component7() {
        return this.content;
    }

    public final ControlResponsePayload copy(String behavior, String toolUseID, Map<String, ? extends JsonElement> updatedInput, List<PermissionUpdate> updatedPermissions, String message, String action, Map<String, ? extends JsonElement> content) {
        return new ControlResponsePayload(behavior, toolUseID, updatedInput, updatedPermissions, message, action, content);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ControlResponsePayload)) {
            return false;
        }
        ControlResponsePayload controlResponsePayload = (ControlResponsePayload) other;
        return x44.r(this.behavior, controlResponsePayload.behavior) && x44.r(this.toolUseID, controlResponsePayload.toolUseID) && x44.r(this.updatedInput, controlResponsePayload.updatedInput) && x44.r(this.updatedPermissions, controlResponsePayload.updatedPermissions) && x44.r(this.message, controlResponsePayload.message) && x44.r(this.action, controlResponsePayload.action) && x44.r(this.content, controlResponsePayload.content);
    }

    public final String getAction() {
        return this.action;
    }

    public final String getBehavior() {
        return this.behavior;
    }

    public final Map<String, JsonElement> getContent() {
        return this.content;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getToolUseID() {
        return this.toolUseID;
    }

    public final Map<String, JsonElement> getUpdatedInput() {
        return this.updatedInput;
    }

    public final List<PermissionUpdate> getUpdatedPermissions() {
        return this.updatedPermissions;
    }

    public int hashCode() {
        String str = this.behavior;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.toolUseID;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map<String, JsonElement> map = this.updatedInput;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        List<PermissionUpdate> list = this.updatedPermissions;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.message;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.action;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Map<String, JsonElement> map2 = this.content;
        return iHashCode6 + (map2 != null ? map2.hashCode() : 0);
    }

    public String toString() {
        String str = this.behavior;
        String str2 = this.toolUseID;
        Map<String, JsonElement> map = this.updatedInput;
        List<PermissionUpdate> list = this.updatedPermissions;
        String str3 = this.message;
        String str4 = this.action;
        Map<String, JsonElement> map2 = this.content;
        StringBuilder sbR = kgh.r("ControlResponsePayload(behavior=", str, ", toolUseID=", str2, ", updatedInput=");
        sbR.append(map);
        sbR.append(", updatedPermissions=");
        sbR.append(list);
        sbR.append(", message=");
        kgh.u(sbR, str3, ", action=", str4, ", content=");
        return qy1.i(sbR, map2, ")");
    }

    public ControlResponsePayload() {
        this((String) null, (String) null, (Map) null, (List) null, (String) null, (String) null, (Map) null, 127, (mq5) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ControlResponsePayload(String str, String str2, Map<String, ? extends JsonElement> map, List<PermissionUpdate> list, String str3, String str4, Map<String, ? extends JsonElement> map2) {
        this.behavior = str;
        this.toolUseID = str2;
        this.updatedInput = map;
        this.updatedPermissions = list;
        this.message = str3;
        this.action = str4;
        this.content = map2;
    }

    public /* synthetic */ ControlResponsePayload(String str, String str2, Map map, List list, String str3, String str4, Map map2, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : map, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : map2);
    }
}
