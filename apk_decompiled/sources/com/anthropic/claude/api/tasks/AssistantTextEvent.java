package com.anthropic.claude.api.tasks;

import defpackage.gid;
import defpackage.j7;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.lm6;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.qy0;
import defpackage.srg;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-.B/\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tB?\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ8\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J\u0010\u0010 \u001a\u00020\nHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0019R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010\u001c¨\u0006/"}, d2 = {"Lcom/anthropic/claude/api/tasks/AssistantTextEvent;", "Lcom/anthropic/claude/api/tasks/TaskSessionEvent;", "", "id", "step_id", "", "Lcom/anthropic/claude/api/tasks/AgentContentBlock;", "content", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/tasks/AssistantTextEvent;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/anthropic/claude/api/tasks/AssistantTextEvent;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getStep_id", "Ljava/util/List;", "getContent", "Companion", "py0", "qy0", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class AssistantTextEvent implements TaskSessionEvent {
    public static final int $stable = 0;
    private final List<AgentContentBlock> content;
    private final String id;
    private final String step_id;
    public static final qy0 Companion = new qy0();
    private static final kw9[] $childSerializers = {null, null, yb5.w(w1a.F, new j7(27))};

    public /* synthetic */ AssistantTextEvent(int i, String str, String str2, List list, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.id = null;
        } else {
            this.id = str;
        }
        if ((i & 2) == 0) {
            this.step_id = null;
        } else {
            this.step_id = str2;
        }
        if ((i & 4) == 0) {
            this.content = lm6.E;
        } else {
            this.content = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(AgentContentBlock.Companion.serializer(), 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AssistantTextEvent copy$default(AssistantTextEvent assistantTextEvent, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = assistantTextEvent.id;
        }
        if ((i & 2) != 0) {
            str2 = assistantTextEvent.step_id;
        }
        if ((i & 4) != 0) {
            list = assistantTextEvent.content;
        }
        return assistantTextEvent.copy(str, str2, list);
    }

    public static final /* synthetic */ void write$Self$api(AssistantTextEvent self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        if (output.E(serialDesc) || self.getId() != null) {
            output.B(serialDesc, 0, srg.a, self.getId());
        }
        if (output.E(serialDesc) || self.getStep_id() != null) {
            output.B(serialDesc, 1, srg.a, self.getStep_id());
        }
        if (!output.E(serialDesc) && x44.r(self.content, lm6.E)) {
            return;
        }
        output.r(serialDesc, 2, (znf) kw9VarArr[2].getValue(), self.content);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStep_id() {
        return this.step_id;
    }

    public final List<AgentContentBlock> component3() {
        return this.content;
    }

    public final AssistantTextEvent copy(String id, String step_id, List<? extends AgentContentBlock> content) {
        content.getClass();
        return new AssistantTextEvent(id, step_id, content);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AssistantTextEvent)) {
            return false;
        }
        AssistantTextEvent assistantTextEvent = (AssistantTextEvent) other;
        return x44.r(this.id, assistantTextEvent.id) && x44.r(this.step_id, assistantTextEvent.step_id) && x44.r(this.content, assistantTextEvent.content);
    }

    public final List<AgentContentBlock> getContent() {
        return this.content;
    }

    @Override // com.anthropic.claude.api.tasks.TaskSessionEvent
    public String getId() {
        return this.id;
    }

    @Override // com.anthropic.claude.api.tasks.TaskSessionEvent
    public String getStep_id() {
        return this.step_id;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.step_id;
        return this.content.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.step_id;
        return gid.q(kgh.r("AssistantTextEvent(id=", str, ", step_id=", str2, ", content="), this.content, ")");
    }

    public AssistantTextEvent() {
        this((String) null, (String) null, (List) null, 7, (mq5) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AssistantTextEvent(String str, String str2, List<? extends AgentContentBlock> list) {
        list.getClass();
        this.id = str;
        this.step_id = str2;
        this.content = list;
    }

    public /* synthetic */ AssistantTextEvent(String str, String str2, List list, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? lm6.E : list);
    }
}
