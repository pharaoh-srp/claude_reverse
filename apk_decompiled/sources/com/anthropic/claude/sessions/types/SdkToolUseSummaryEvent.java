package com.anthropic.claude.sessions.types;

import defpackage.gvj;
import defpackage.kw9;
import defpackage.lm6;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.ucf;
import defpackage.uo0;
import defpackage.vcf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.wcf;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0001\u0018\u0000 \"2\u00020\u0001:\u0002#$B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nBS\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b!\u0010\u001b¨\u0006%"}, d2 = {"Lcom/anthropic/claude/sessions/types/SdkToolUseSummaryEvent;", "Lcom/anthropic/claude/sessions/types/SdkEvent;", "", "type", "uuid", "summary", "", "preceding_tool_use_ids", "parent_tool_use_id", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/SdkToolUseSummaryEvent;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "getUuid", "getSummary", "Ljava/util/List;", "getPreceding_tool_use_ids", "()Ljava/util/List;", "getParent_tool_use_id", "Companion", "vcf", "wcf", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class SdkToolUseSummaryEvent implements SdkEvent {
    private final String parent_tool_use_id;
    private final List<String> preceding_tool_use_ids;
    private final String summary;
    private final String type;
    private final String uuid;
    public static final wcf Companion = new wcf();
    private static final kw9[] $childSerializers = {null, null, null, yb5.w(w1a.F, new ucf(0)), null};

    public /* synthetic */ SdkToolUseSummaryEvent(int i, String str, String str2, String str3, List list, String str4, vnf vnfVar) {
        if (7 != (i & 7)) {
            gvj.f(i, 7, vcf.a.getDescriptor());
            throw null;
        }
        this.type = str;
        this.uuid = str2;
        this.summary = str3;
        if ((i & 8) == 0) {
            this.preceding_tool_use_ids = lm6.E;
        } else {
            this.preceding_tool_use_ids = list;
        }
        if ((i & 16) == 0) {
            this.parent_tool_use_id = null;
        } else {
            this.parent_tool_use_id = str4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(srg.a, 0);
    }

    public static final /* synthetic */ void write$Self$sessions(SdkToolUseSummaryEvent self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.getType());
        output.q(serialDesc, 1, self.uuid);
        output.q(serialDesc, 2, self.summary);
        if (output.E(serialDesc) || !x44.r(self.preceding_tool_use_ids, lm6.E)) {
            output.r(serialDesc, 3, (znf) kw9VarArr[3].getValue(), self.preceding_tool_use_ids);
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

    public final List<String> getPreceding_tool_use_ids() {
        return this.preceding_tool_use_ids;
    }

    public final String getSummary() {
        return this.summary;
    }

    @Override // com.anthropic.claude.sessions.types.SdkEvent
    public String getType() {
        return this.type;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public SdkToolUseSummaryEvent(String str, String str2, String str3, List<String> list, String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        list.getClass();
        this.type = str;
        this.uuid = str2;
        this.summary = str3;
        this.preceding_tool_use_ids = list;
        this.parent_tool_use_id = str4;
    }

    public /* synthetic */ SdkToolUseSummaryEvent(String str, String str2, String str3, List list, String str4, int i, mq5 mq5Var) {
        this(str, str2, str3, (i & 8) != 0 ? lm6.E : list, (i & 16) != 0 ? null : str4);
    }
}
