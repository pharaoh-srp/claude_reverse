package com.anthropic.claude.sessions.api;

import com.anthropic.claude.sessions.types.PermissionUpdate;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.ayc;
import defpackage.ebh;
import defpackage.eh9;
import defpackage.f7a;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.l84;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.nm6;
import defpackage.onf;
import defpackage.srg;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import defpackage.zp4;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0081\b\u0018\u0000 I2\u00020\u0001:\u0002JKB\u009b\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\t\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0012\u0010\u0013B\u009b\u0001\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0012\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJ\u001c\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\tHÆ\u0003¢\u0006\u0004\b \u0010!J\u0018\u0010\"\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001aJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001aJ\u0012\u0010&\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b&\u0010'J¤\u0001\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\t2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u001aJ\u0010\u0010+\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b/\u00100J'\u00109\u001a\u0002062\u0006\u00101\u001a\u00020\u00002\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204H\u0001¢\u0006\u0004\b7\u00108R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010:\u001a\u0004\b;\u0010\u001aR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010:\u001a\u0004\b<\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010:\u001a\u0004\b=\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010:\u001a\u0004\b>\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010:\u001a\u0004\b?\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010:\u001a\u0004\b@\u0010\u001aR#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010A\u001a\u0004\bB\u0010!R\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010C\u001a\u0004\bD\u0010#R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010:\u001a\u0004\bE\u0010\u001aR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010:\u001a\u0004\bF\u0010\u001aR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0011\u0010G\u001a\u0004\bH\u0010'¨\u0006L"}, d2 = {"Lcom/anthropic/claude/sessions/api/ControlRequestContent;", "", "", "subtype", "tool_use_id", "tool_name", "display_name", "title", "description", "", "Lkotlinx/serialization/json/JsonElement;", "input", "", "Lcom/anthropic/claude/sessions/types/PermissionUpdate;", "permission_suggestions", "mcp_server_name", "message", "requested_schema", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;Lvnf;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "()Ljava/util/Map;", "component8", "()Ljava/util/List;", "component9", "component10", "component11", "()Lkotlinx/serialization/json/JsonElement;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Lcom/anthropic/claude/sessions/api/ControlRequestContent;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/api/ControlRequestContent;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getSubtype", "getTool_use_id", "getTool_name", "getDisplay_name", "getTitle", "getDescription", "Ljava/util/Map;", "getInput", "Ljava/util/List;", "getPermission_suggestions", "getMcp_server_name", "getMessage", "Lkotlinx/serialization/json/JsonElement;", "getRequested_schema", "Companion", "yp4", "zp4", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ControlRequestContent {
    private static final kw9[] $childSerializers;
    public static final zp4 Companion = new zp4();
    private final String description;
    private final String display_name;
    private final Map<String, JsonElement> input;
    private final String mcp_server_name;
    private final String message;
    private final List<PermissionUpdate> permission_suggestions;
    private final JsonElement requested_schema;
    private final String subtype;
    private final String title;
    private final String tool_name;
    private final String tool_use_id;

    static {
        l84 l84Var = new l84(21);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{null, null, null, null, null, null, yb5.w(w1aVar, l84Var), yb5.w(w1aVar, new l84(22)), null, null, null};
    }

    public /* synthetic */ ControlRequestContent(int i, String str, String str2, String str3, String str4, String str5, String str6, Map map, List list, String str7, String str8, JsonElement jsonElement, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.subtype = null;
        } else {
            this.subtype = str;
        }
        if ((i & 2) == 0) {
            this.tool_use_id = null;
        } else {
            this.tool_use_id = str2;
        }
        if ((i & 4) == 0) {
            this.tool_name = null;
        } else {
            this.tool_name = str3;
        }
        if ((i & 8) == 0) {
            this.display_name = null;
        } else {
            this.display_name = str4;
        }
        if ((i & 16) == 0) {
            this.title = null;
        } else {
            this.title = str5;
        }
        if ((i & 32) == 0) {
            this.description = null;
        } else {
            this.description = str6;
        }
        if ((i & 64) == 0) {
            this.input = nm6.E;
        } else {
            this.input = map;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) == 0) {
            this.permission_suggestions = null;
        } else {
            this.permission_suggestions = list;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 0) {
            this.mcp_server_name = null;
        } else {
            this.mcp_server_name = str7;
        }
        if ((i & 512) == 0) {
            this.message = null;
        } else {
            this.message = str8;
        }
        if ((i & FreeTypeConstants.FT_LOAD_NO_RECURSE) == 0) {
            this.requested_schema = null;
        } else {
            this.requested_schema = jsonElement;
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

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ControlRequestContent copy$default(ControlRequestContent controlRequestContent, String str, String str2, String str3, String str4, String str5, String str6, Map map, List list, String str7, String str8, JsonElement jsonElement, int i, Object obj) {
        if ((i & 1) != 0) {
            str = controlRequestContent.subtype;
        }
        if ((i & 2) != 0) {
            str2 = controlRequestContent.tool_use_id;
        }
        if ((i & 4) != 0) {
            str3 = controlRequestContent.tool_name;
        }
        if ((i & 8) != 0) {
            str4 = controlRequestContent.display_name;
        }
        if ((i & 16) != 0) {
            str5 = controlRequestContent.title;
        }
        if ((i & 32) != 0) {
            str6 = controlRequestContent.description;
        }
        if ((i & 64) != 0) {
            map = controlRequestContent.input;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
            list = controlRequestContent.permission_suggestions;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0) {
            str7 = controlRequestContent.mcp_server_name;
        }
        if ((i & 512) != 0) {
            str8 = controlRequestContent.message;
        }
        if ((i & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0) {
            jsonElement = controlRequestContent.requested_schema;
        }
        String str9 = str8;
        JsonElement jsonElement2 = jsonElement;
        List list2 = list;
        String str10 = str7;
        String str11 = str6;
        Map map2 = map;
        String str12 = str5;
        String str13 = str3;
        return controlRequestContent.copy(str, str2, str13, str4, str12, str11, map2, list2, str10, str9, jsonElement2);
    }

    public static final /* synthetic */ void write$Self$sessions(ControlRequestContent self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        if (output.E(serialDesc) || self.subtype != null) {
            output.B(serialDesc, 0, srg.a, self.subtype);
        }
        if (output.E(serialDesc) || self.tool_use_id != null) {
            output.B(serialDesc, 1, srg.a, self.tool_use_id);
        }
        if (output.E(serialDesc) || self.tool_name != null) {
            output.B(serialDesc, 2, srg.a, self.tool_name);
        }
        if (output.E(serialDesc) || self.display_name != null) {
            output.B(serialDesc, 3, srg.a, self.display_name);
        }
        if (output.E(serialDesc) || self.title != null) {
            output.B(serialDesc, 4, srg.a, self.title);
        }
        if (output.E(serialDesc) || self.description != null) {
            output.B(serialDesc, 5, srg.a, self.description);
        }
        if (output.E(serialDesc) || !x44.r(self.input, nm6.E)) {
            output.r(serialDesc, 6, (znf) kw9VarArr[6].getValue(), self.input);
        }
        if (output.E(serialDesc) || self.permission_suggestions != null) {
            output.B(serialDesc, 7, (znf) kw9VarArr[7].getValue(), self.permission_suggestions);
        }
        if (output.E(serialDesc) || self.mcp_server_name != null) {
            output.B(serialDesc, 8, srg.a, self.mcp_server_name);
        }
        if (output.E(serialDesc) || self.message != null) {
            output.B(serialDesc, 9, srg.a, self.message);
        }
        if (!output.E(serialDesc) && self.requested_schema == null) {
            return;
        }
        output.B(serialDesc, 10, eh9.a, self.requested_schema);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSubtype() {
        return this.subtype;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final JsonElement getRequested_schema() {
        return this.requested_schema;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTool_use_id() {
        return this.tool_use_id;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTool_name() {
        return this.tool_name;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDisplay_name() {
        return this.display_name;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final Map<String, JsonElement> component7() {
        return this.input;
    }

    public final List<PermissionUpdate> component8() {
        return this.permission_suggestions;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getMcp_server_name() {
        return this.mcp_server_name;
    }

    public final ControlRequestContent copy(String subtype, String tool_use_id, String tool_name, String display_name, String title, String description, Map<String, ? extends JsonElement> input, List<PermissionUpdate> permission_suggestions, String mcp_server_name, String message, JsonElement requested_schema) {
        input.getClass();
        return new ControlRequestContent(subtype, tool_use_id, tool_name, display_name, title, description, input, permission_suggestions, mcp_server_name, message, requested_schema);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ControlRequestContent)) {
            return false;
        }
        ControlRequestContent controlRequestContent = (ControlRequestContent) other;
        return x44.r(this.subtype, controlRequestContent.subtype) && x44.r(this.tool_use_id, controlRequestContent.tool_use_id) && x44.r(this.tool_name, controlRequestContent.tool_name) && x44.r(this.display_name, controlRequestContent.display_name) && x44.r(this.title, controlRequestContent.title) && x44.r(this.description, controlRequestContent.description) && x44.r(this.input, controlRequestContent.input) && x44.r(this.permission_suggestions, controlRequestContent.permission_suggestions) && x44.r(this.mcp_server_name, controlRequestContent.mcp_server_name) && x44.r(this.message, controlRequestContent.message) && x44.r(this.requested_schema, controlRequestContent.requested_schema);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDisplay_name() {
        return this.display_name;
    }

    public final Map<String, JsonElement> getInput() {
        return this.input;
    }

    public final String getMcp_server_name() {
        return this.mcp_server_name;
    }

    public final String getMessage() {
        return this.message;
    }

    public final List<PermissionUpdate> getPermission_suggestions() {
        return this.permission_suggestions;
    }

    public final JsonElement getRequested_schema() {
        return this.requested_schema;
    }

    public final String getSubtype() {
        return this.subtype;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTool_name() {
        return this.tool_name;
    }

    public final String getTool_use_id() {
        return this.tool_use_id;
    }

    public int hashCode() {
        String str = this.subtype;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.tool_use_id;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.tool_name;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.display_name;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.title;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.description;
        int iG = ebh.g((iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.input);
        List<PermissionUpdate> list = this.permission_suggestions;
        int iHashCode6 = (iG + (list == null ? 0 : list.hashCode())) * 31;
        String str7 = this.mcp_server_name;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.message;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        JsonElement jsonElement = this.requested_schema;
        return iHashCode8 + (jsonElement != null ? jsonElement.hashCode() : 0);
    }

    public String toString() {
        String str = this.subtype;
        String str2 = this.tool_use_id;
        String str3 = this.tool_name;
        String str4 = this.display_name;
        String str5 = this.title;
        String str6 = this.description;
        Map<String, JsonElement> map = this.input;
        List<PermissionUpdate> list = this.permission_suggestions;
        String str7 = this.mcp_server_name;
        String str8 = this.message;
        JsonElement jsonElement = this.requested_schema;
        StringBuilder sbR = kgh.r("ControlRequestContent(subtype=", str, ", tool_use_id=", str2, ", tool_name=");
        kgh.u(sbR, str3, ", display_name=", str4, ", title=");
        kgh.u(sbR, str5, ", description=", str6, ", input=");
        sbR.append(map);
        sbR.append(", permission_suggestions=");
        sbR.append(list);
        sbR.append(", mcp_server_name=");
        kgh.u(sbR, str7, ", message=", str8, ", requested_schema=");
        sbR.append(jsonElement);
        sbR.append(")");
        return sbR.toString();
    }

    public ControlRequestContent() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Map) null, (List) null, (String) null, (String) null, (JsonElement) null, 2047, (mq5) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ControlRequestContent(String str, String str2, String str3, String str4, String str5, String str6, Map<String, ? extends JsonElement> map, List<PermissionUpdate> list, String str7, String str8, JsonElement jsonElement) {
        map.getClass();
        this.subtype = str;
        this.tool_use_id = str2;
        this.tool_name = str3;
        this.display_name = str4;
        this.title = str5;
        this.description = str6;
        this.input = map;
        this.permission_suggestions = list;
        this.mcp_server_name = str7;
        this.message = str8;
        this.requested_schema = jsonElement;
    }

    public /* synthetic */ ControlRequestContent(String str, String str2, String str3, String str4, String str5, String str6, Map map, List list, String str7, String str8, JsonElement jsonElement, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? nm6.E : map, (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? null : list, (i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? null : str7, (i & 512) != 0 ? null : str8, (i & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 ? null : jsonElement);
    }
}
