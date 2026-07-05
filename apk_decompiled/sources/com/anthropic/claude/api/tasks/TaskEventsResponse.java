package com.anthropic.claude.api.tasks;

import defpackage.crg;
import defpackage.ij0;
import defpackage.kw9;
import defpackage.lm6;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.r5h;
import defpackage.srg;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import defpackage.zt1;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002./B/\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ8\u0010\u001f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b!\u0010\u001eJ\u0010\u0010\"\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010%\u001a\u00020\u00052\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b,\u0010\u001e¨\u00060"}, d2 = {"Lcom/anthropic/claude/api/tasks/TaskEventsResponse;", "", "", "Lcom/anthropic/claude/api/tasks/TaskSessionEvent;", "data", "", "has_more", "", "next_page", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/tasks/TaskEventsResponse;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/Boolean;", "component3", "()Ljava/lang/String;", "copy", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/anthropic/claude/api/tasks/TaskEventsResponse;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getData", "Ljava/lang/Boolean;", "getHas_more", "Ljava/lang/String;", "getNext_page", "Companion", "q5h", "r5h", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class TaskEventsResponse {
    public static final int $stable = 0;
    private final List<TaskSessionEvent> data;
    private final Boolean has_more;
    private final String next_page;
    public static final r5h Companion = new r5h();
    private static final kw9[] $childSerializers = {yb5.w(w1a.F, new crg(22)), null, null};

    public /* synthetic */ TaskEventsResponse(int i, List list, Boolean bool, String str, vnf vnfVar) {
        this.data = (i & 1) == 0 ? lm6.E : list;
        if ((i & 2) == 0) {
            this.has_more = null;
        } else {
            this.has_more = bool;
        }
        if ((i & 4) == 0) {
            this.next_page = null;
        } else {
            this.next_page = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(TaskSessionEvent.Companion.serializer(), 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TaskEventsResponse copy$default(TaskEventsResponse taskEventsResponse, List list, Boolean bool, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = taskEventsResponse.data;
        }
        if ((i & 2) != 0) {
            bool = taskEventsResponse.has_more;
        }
        if ((i & 4) != 0) {
            str = taskEventsResponse.next_page;
        }
        return taskEventsResponse.copy(list, bool, str);
    }

    public static final /* synthetic */ void write$Self$api(TaskEventsResponse self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        if (output.E(serialDesc) || !x44.r(self.data, lm6.E)) {
            output.r(serialDesc, 0, (znf) kw9VarArr[0].getValue(), self.data);
        }
        if (output.E(serialDesc) || self.has_more != null) {
            output.B(serialDesc, 1, zt1.a, self.has_more);
        }
        if (!output.E(serialDesc) && self.next_page == null) {
            return;
        }
        output.B(serialDesc, 2, srg.a, self.next_page);
    }

    public final List<TaskSessionEvent> component1() {
        return this.data;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getHas_more() {
        return this.has_more;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNext_page() {
        return this.next_page;
    }

    public final TaskEventsResponse copy(List<? extends TaskSessionEvent> data, Boolean has_more, String next_page) {
        data.getClass();
        return new TaskEventsResponse(data, has_more, next_page);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TaskEventsResponse)) {
            return false;
        }
        TaskEventsResponse taskEventsResponse = (TaskEventsResponse) other;
        return x44.r(this.data, taskEventsResponse.data) && x44.r(this.has_more, taskEventsResponse.has_more) && x44.r(this.next_page, taskEventsResponse.next_page);
    }

    public final List<TaskSessionEvent> getData() {
        return this.data;
    }

    public final Boolean getHas_more() {
        return this.has_more;
    }

    public final String getNext_page() {
        return this.next_page;
    }

    public int hashCode() {
        int iHashCode = this.data.hashCode() * 31;
        Boolean bool = this.has_more;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.next_page;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        List<TaskSessionEvent> list = this.data;
        Boolean bool = this.has_more;
        String str = this.next_page;
        StringBuilder sb = new StringBuilder("TaskEventsResponse(data=");
        sb.append(list);
        sb.append(", has_more=");
        sb.append(bool);
        sb.append(", next_page=");
        return ij0.m(sb, str, ")");
    }

    public TaskEventsResponse() {
        this((List) null, (Boolean) null, (String) null, 7, (mq5) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TaskEventsResponse(List<? extends TaskSessionEvent> list, Boolean bool, String str) {
        list.getClass();
        this.data = list;
        this.has_more = bool;
        this.next_page = str;
    }

    public /* synthetic */ TaskEventsResponse(List list, Boolean bool, String str, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? lm6.E : list, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : str);
    }
}
