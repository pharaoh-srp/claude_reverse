package com.anthropic.claude.api.chat.messages;

import com.anthropic.claude.api.chat.tool.ToolDisplayContent;
import com.anthropic.claude.api.chat.tool.ToolResultContent;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.bc9;
import defpackage.dhb;
import defpackage.fsh;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.nlh;
import defpackage.onf;
import defpackage.oyh;
import defpackage.pyh;
import defpackage.srg;
import defpackage.uh9;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import java.util.Date;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u0000 _2\u00020\u0001:\u0002`aBÛ\u0001\u0012\u001f\b\u0002\u0010\u0007\u001a\u0019\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\u001f\b\u0002\u0010\b\u001a\u0019\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0017\u0012\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a¢\u0006\u0004\b\u001d\u0010\u001eB±\u0001\b\u0010\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0017\u0012\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a\u0012\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b\u001d\u0010#J'\u0010$\u001a\u0019\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003¢\u0006\u0004\b$\u0010%J'\u0010&\u001a\u0019\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003¢\u0006\u0004\b&\u0010%J\u0010\u0010'\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b)\u0010(J\u0016\u0010*\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b.\u0010(J\u0012\u0010/\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b1\u0010(J\u0012\u00102\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b2\u0010(J\u0012\u00103\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b3\u0010(J\u0012\u00104\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b4\u00105J\u0012\u00106\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b6\u00105J\u0018\u00107\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aHÆ\u0003¢\u0006\u0004\b7\u00108Jè\u0001\u00109\u001a\u00020\u00002\u001f\b\u0002\u0010\u0007\u001a\u0019\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\u001f\b\u0002\u0010\b\u001a\u0019\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00172\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aHÆ\u0001¢\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b;\u0010(J\u0010\u0010<\u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b<\u0010=J\u001a\u0010@\u001a\u00020\u000f2\b\u0010?\u001a\u0004\u0018\u00010>HÖ\u0003¢\u0006\u0004\b@\u0010AJ'\u0010J\u001a\u00020G2\u0006\u0010B\u001a\u00020\u00002\u0006\u0010D\u001a\u00020C2\u0006\u0010F\u001a\u00020EH\u0001¢\u0006\u0004\bH\u0010IR1\u0010\u0007\u001a\u0019\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010K\u001a\u0004\bL\u0010%R1\u0010\b\u001a\u0019\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010K\u001a\u0004\bM\u0010%R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010N\u001a\u0004\bO\u0010(R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010N\u001a\u0004\bP\u0010(R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010Q\u001a\u0004\bR\u0010+R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010S\u001a\u0004\b\u0010\u0010-R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0011\u0010N\u001a\u0004\bT\u0010(R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010U\u001a\u0004\bV\u00100R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0014\u0010N\u001a\u0004\bW\u0010(R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0015\u0010N\u001a\u0004\bX\u0010(R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0016\u0010N\u001a\u0004\bY\u0010(R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010Z\u001a\u0004\b[\u00105R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0019\u0010Z\u001a\u0004\b\\\u00105R\"\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010]\u001a\u0004\b^\u00108¨\u0006b"}, d2 = {"Lcom/anthropic/claude/api/chat/messages/ToolResultBlock;", "Lcom/anthropic/claude/api/chat/messages/ContentBlock;", "Ljava/util/Date;", "Lcom/anthropic/claude/api/Iso8601Date;", "Lonf;", "with", "Lbc9;", "start_timestamp", "stop_timestamp", "", "name", "tool_use_id", "", "Lcom/anthropic/claude/api/chat/tool/ToolResultContent;", "content", "", "is_error", "message", "Lcom/anthropic/claude/api/chat/tool/ToolDisplayContent;", "display_content", "integration_name", "integration_icon_url", "icon_name", "Lkotlinx/serialization/json/JsonObject;", "structured_content", "meta", "", "Lcom/anthropic/claude/api/chat/messages/MessageFlag;", "flags", "<init>", "(Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;Lcom/anthropic/claude/api/chat/tool/ToolDisplayContent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/json/JsonObject;Ljava/util/Set;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;Lcom/anthropic/claude/api/chat/tool/ToolDisplayContent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/json/JsonObject;Ljava/util/Set;Lvnf;)V", "component1", "()Ljava/util/Date;", "component2", "component3", "()Ljava/lang/String;", "component4", "component5", "()Ljava/util/List;", "component6", "()Z", "component7", "component8", "()Lcom/anthropic/claude/api/chat/tool/ToolDisplayContent;", "component9", "component10", "component11", "component12", "()Lkotlinx/serialization/json/JsonObject;", "component13", "component14", "()Ljava/util/Set;", "copy", "(Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;Lcom/anthropic/claude/api/chat/tool/ToolDisplayContent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/json/JsonObject;Ljava/util/Set;)Lcom/anthropic/claude/api/chat/messages/ToolResultBlock;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/chat/messages/ToolResultBlock;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/util/Date;", "getStart_timestamp", "getStop_timestamp", "Ljava/lang/String;", "getName", "getTool_use_id", "Ljava/util/List;", "getContent", "Z", "getMessage", "Lcom/anthropic/claude/api/chat/tool/ToolDisplayContent;", "getDisplay_content", "getIntegration_name", "getIntegration_icon_url", "getIcon_name", "Lkotlinx/serialization/json/JsonObject;", "getStructured_content", "getMeta", "Ljava/util/Set;", "getFlags", "Companion", "oyh", "pyh", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ToolResultBlock implements ContentBlock {
    private static final kw9[] $childSerializers;
    public static final int $stable = 0;
    public static final pyh Companion = new pyh();
    private final List<ToolResultContent> content;
    private final ToolDisplayContent display_content;
    private final Set<MessageFlag> flags;
    private final String icon_name;
    private final String integration_icon_url;
    private final String integration_name;
    private final boolean is_error;
    private final String message;
    private final JsonObject meta;
    private final String name;
    private final Date start_timestamp;
    private final Date stop_timestamp;
    private final JsonObject structured_content;
    private final String tool_use_id;

    static {
        nlh nlhVar = new nlh(14);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{null, null, null, null, yb5.w(w1aVar, nlhVar), null, null, yb5.w(w1aVar, new nlh(15)), null, null, null, null, null, yb5.w(w1aVar, new nlh(16))};
    }

    public /* synthetic */ ToolResultBlock(int i, Date date, Date date2, String str, String str2, List list, boolean z, String str3, ToolDisplayContent toolDisplayContent, String str4, String str5, String str6, JsonObject jsonObject, JsonObject jsonObject2, Set set, vnf vnfVar) {
        if (20 != (i & 20)) {
            gvj.f(i, 20, oyh.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.start_timestamp = null;
        } else {
            this.start_timestamp = date;
        }
        if ((i & 2) == 0) {
            this.stop_timestamp = null;
        } else {
            this.stop_timestamp = date2;
        }
        this.name = str;
        if ((i & 8) == 0) {
            this.tool_use_id = null;
        } else {
            this.tool_use_id = str2;
        }
        this.content = list;
        if ((i & 32) == 0) {
            this.is_error = false;
        } else {
            this.is_error = z;
        }
        if ((i & 64) == 0) {
            this.message = null;
        } else {
            this.message = str3;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) == 0) {
            this.display_content = null;
        } else {
            this.display_content = toolDisplayContent;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 0) {
            this.integration_name = null;
        } else {
            this.integration_name = str4;
        }
        if ((i & 512) == 0) {
            this.integration_icon_url = null;
        } else {
            this.integration_icon_url = str5;
        }
        if ((i & FreeTypeConstants.FT_LOAD_NO_RECURSE) == 0) {
            this.icon_name = null;
        } else {
            this.icon_name = str6;
        }
        if ((i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) == 0) {
            this.structured_content = null;
        } else {
            this.structured_content = jsonObject;
        }
        if ((i & FreeTypeConstants.FT_LOAD_MONOCHROME) == 0) {
            this.meta = null;
        } else {
            this.meta = jsonObject2;
        }
        if ((i & FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) == 0) {
            this.flags = null;
        } else {
            this.flags = set;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(ToolResultContent.Companion.serializer(), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return ToolDisplayContent.Companion.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new uo0(dhb.a, 1);
    }

    public static final /* synthetic */ void write$Self$api(ToolResultBlock self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        if (output.E(serialDesc) || self.getStart_timestamp() != null) {
            output.B(serialDesc, 0, bc9.a, self.getStart_timestamp());
        }
        if (output.E(serialDesc) || self.getStop_timestamp() != null) {
            output.B(serialDesc, 1, bc9.a, self.getStop_timestamp());
        }
        output.q(serialDesc, 2, self.name);
        if (output.E(serialDesc) || self.tool_use_id != null) {
            output.B(serialDesc, 3, srg.a, self.tool_use_id);
        }
        output.r(serialDesc, 4, (znf) kw9VarArr[4].getValue(), self.content);
        if (output.E(serialDesc) || self.is_error) {
            output.p(serialDesc, 5, self.is_error);
        }
        if (output.E(serialDesc) || self.message != null) {
            output.B(serialDesc, 6, srg.a, self.message);
        }
        if (output.E(serialDesc) || self.display_content != null) {
            output.B(serialDesc, 7, (znf) kw9VarArr[7].getValue(), self.display_content);
        }
        if (output.E(serialDesc) || self.integration_name != null) {
            output.B(serialDesc, 8, srg.a, self.integration_name);
        }
        if (output.E(serialDesc) || self.integration_icon_url != null) {
            output.B(serialDesc, 9, srg.a, self.integration_icon_url);
        }
        if (output.E(serialDesc) || self.icon_name != null) {
            output.B(serialDesc, 10, srg.a, self.icon_name);
        }
        if (output.E(serialDesc) || self.structured_content != null) {
            output.B(serialDesc, 11, uh9.a, self.structured_content);
        }
        if (output.E(serialDesc) || self.meta != null) {
            output.B(serialDesc, 12, uh9.a, self.meta);
        }
        if (!output.E(serialDesc) && self.getFlags() == null) {
            return;
        }
        output.B(serialDesc, 13, (znf) kw9VarArr[13].getValue(), self.getFlags());
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Date getStart_timestamp() {
        return this.start_timestamp;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getIntegration_icon_url() {
        return this.integration_icon_url;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getIcon_name() {
        return this.icon_name;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final JsonObject getStructured_content() {
        return this.structured_content;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final JsonObject getMeta() {
        return this.meta;
    }

    public final Set<MessageFlag> component14() {
        return this.flags;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Date getStop_timestamp() {
        return this.stop_timestamp;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTool_use_id() {
        return this.tool_use_id;
    }

    public final List<ToolResultContent> component5() {
        return this.content;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIs_error() {
        return this.is_error;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final ToolDisplayContent getDisplay_content() {
        return this.display_content;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getIntegration_name() {
        return this.integration_name;
    }

    public final ToolResultBlock copy(Date start_timestamp, Date stop_timestamp, String name, String tool_use_id, List<? extends ToolResultContent> content, boolean is_error, String message, ToolDisplayContent display_content, String integration_name, String integration_icon_url, String icon_name, JsonObject structured_content, JsonObject meta, Set<? extends MessageFlag> flags) {
        name.getClass();
        content.getClass();
        return new ToolResultBlock(start_timestamp, stop_timestamp, name, tool_use_id, content, is_error, message, display_content, integration_name, integration_icon_url, icon_name, structured_content, meta, flags);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ToolResultBlock)) {
            return false;
        }
        ToolResultBlock toolResultBlock = (ToolResultBlock) other;
        return x44.r(this.start_timestamp, toolResultBlock.start_timestamp) && x44.r(this.stop_timestamp, toolResultBlock.stop_timestamp) && x44.r(this.name, toolResultBlock.name) && x44.r(this.tool_use_id, toolResultBlock.tool_use_id) && x44.r(this.content, toolResultBlock.content) && this.is_error == toolResultBlock.is_error && x44.r(this.message, toolResultBlock.message) && x44.r(this.display_content, toolResultBlock.display_content) && x44.r(this.integration_name, toolResultBlock.integration_name) && x44.r(this.integration_icon_url, toolResultBlock.integration_icon_url) && x44.r(this.icon_name, toolResultBlock.icon_name) && x44.r(this.structured_content, toolResultBlock.structured_content) && x44.r(this.meta, toolResultBlock.meta) && x44.r(this.flags, toolResultBlock.flags);
    }

    public final List<ToolResultContent> getContent() {
        return this.content;
    }

    public final ToolDisplayContent getDisplay_content() {
        return this.display_content;
    }

    @Override // com.anthropic.claude.api.chat.messages.ContentBlock
    public Set<MessageFlag> getFlags() {
        return this.flags;
    }

    public final String getIcon_name() {
        return this.icon_name;
    }

    public final String getIntegration_icon_url() {
        return this.integration_icon_url;
    }

    public final String getIntegration_name() {
        return this.integration_name;
    }

    public final String getMessage() {
        return this.message;
    }

    public final JsonObject getMeta() {
        return this.meta;
    }

    public final String getName() {
        return this.name;
    }

    @Override // com.anthropic.claude.api.chat.messages.ContentBlock
    public Date getStart_timestamp() {
        return this.start_timestamp;
    }

    @Override // com.anthropic.claude.api.chat.messages.ContentBlock
    public Date getStop_timestamp() {
        return this.stop_timestamp;
    }

    public final JsonObject getStructured_content() {
        return this.structured_content;
    }

    public final String getTool_use_id() {
        return this.tool_use_id;
    }

    public int hashCode() {
        Date date = this.start_timestamp;
        int iHashCode = (date == null ? 0 : date.hashCode()) * 31;
        Date date2 = this.stop_timestamp;
        int iL = kgh.l((iHashCode + (date2 == null ? 0 : date2.hashCode())) * 31, 31, this.name);
        String str = this.tool_use_id;
        int iP = fsh.p(kgh.m((iL + (str == null ? 0 : str.hashCode())) * 31, 31, this.content), 31, this.is_error);
        String str2 = this.message;
        int iHashCode2 = (iP + (str2 == null ? 0 : str2.hashCode())) * 31;
        ToolDisplayContent toolDisplayContent = this.display_content;
        int iHashCode3 = (iHashCode2 + (toolDisplayContent == null ? 0 : toolDisplayContent.hashCode())) * 31;
        String str3 = this.integration_name;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.integration_icon_url;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.icon_name;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        JsonObject jsonObject = this.structured_content;
        int iHashCode7 = (iHashCode6 + (jsonObject == null ? 0 : jsonObject.hashCode())) * 31;
        JsonObject jsonObject2 = this.meta;
        int iHashCode8 = (iHashCode7 + (jsonObject2 == null ? 0 : jsonObject2.hashCode())) * 31;
        Set<MessageFlag> set = this.flags;
        return iHashCode8 + (set != null ? set.hashCode() : 0);
    }

    public final boolean is_error() {
        return this.is_error;
    }

    public String toString() {
        Date date = this.start_timestamp;
        Date date2 = this.stop_timestamp;
        String str = this.name;
        String str2 = this.tool_use_id;
        List<ToolResultContent> list = this.content;
        boolean z = this.is_error;
        String str3 = this.message;
        ToolDisplayContent toolDisplayContent = this.display_content;
        String str4 = this.integration_name;
        String str5 = this.integration_icon_url;
        String str6 = this.icon_name;
        JsonObject jsonObject = this.structured_content;
        JsonObject jsonObject2 = this.meta;
        Set<MessageFlag> set = this.flags;
        StringBuilder sb = new StringBuilder("ToolResultBlock(start_timestamp=");
        sb.append(date);
        sb.append(", stop_timestamp=");
        sb.append(date2);
        sb.append(", name=");
        kgh.u(sb, str, ", tool_use_id=", str2, ", content=");
        sb.append(list);
        sb.append(", is_error=");
        sb.append(z);
        sb.append(", message=");
        sb.append(str3);
        sb.append(", display_content=");
        sb.append(toolDisplayContent);
        sb.append(", integration_name=");
        kgh.u(sb, str4, ", integration_icon_url=", str5, ", icon_name=");
        sb.append(str6);
        sb.append(", structured_content=");
        sb.append(jsonObject);
        sb.append(", meta=");
        sb.append(jsonObject2);
        sb.append(", flags=");
        sb.append(set);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ToolResultBlock(Date date, Date date2, String str, String str2, List<? extends ToolResultContent> list, boolean z, String str3, ToolDisplayContent toolDisplayContent, String str4, String str5, String str6, JsonObject jsonObject, JsonObject jsonObject2, Set<? extends MessageFlag> set) {
        str.getClass();
        list.getClass();
        this.start_timestamp = date;
        this.stop_timestamp = date2;
        this.name = str;
        this.tool_use_id = str2;
        this.content = list;
        this.is_error = z;
        this.message = str3;
        this.display_content = toolDisplayContent;
        this.integration_name = str4;
        this.integration_icon_url = str5;
        this.icon_name = str6;
        this.structured_content = jsonObject;
        this.meta = jsonObject2;
        this.flags = set;
    }

    public /* synthetic */ ToolResultBlock(Date date, Date date2, String str, String str2, List list, boolean z, String str3, ToolDisplayContent toolDisplayContent, String str4, String str5, String str6, JsonObject jsonObject, JsonObject jsonObject2, Set set, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : date, (i & 2) != 0 ? null : date2, str, (i & 8) != 0 ? null : str2, list, (i & 32) != 0 ? false : z, (i & 64) != 0 ? null : str3, (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? null : toolDisplayContent, (i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? null : str4, (i & 512) != 0 ? null : str5, (i & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 ? null : str6, (i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0 ? null : jsonObject, (i & FreeTypeConstants.FT_LOAD_MONOCHROME) != 0 ? null : jsonObject2, (i & FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) != 0 ? null : set);
    }
}
