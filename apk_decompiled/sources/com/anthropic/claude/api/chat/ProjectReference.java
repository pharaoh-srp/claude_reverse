package com.anthropic.claude.api.chat;

import com.anthropic.claude.types.strings.ProjectId;
import defpackage.emd;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.und;
import defpackage.vd4;
import defpackage.vnd;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J$\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b&\u0010\u0017¨\u0006*"}, d2 = {"Lcom/anthropic/claude/api/chat/ProjectReference;", "", "Lcom/anthropic/claude/types/strings/ProjectId;", "uuid", "", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/chat/ProjectReference;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-5pmjb-U", "()Ljava/lang/String;", "component1", "component2", "copy-E9d9s8M", "(Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/api/chat/ProjectReference;", "copy", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUuid-5pmjb-U", "getName", "Companion", "und", "vnd", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ProjectReference {
    public static final int $stable = 0;
    public static final vnd Companion = new vnd();
    private final String name;
    private final String uuid;

    private /* synthetic */ ProjectReference(int i, String str, String str2, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, und.a.getDescriptor());
            throw null;
        }
        this.uuid = str;
        this.name = str2;
    }

    /* JADX INFO: renamed from: copy-E9d9s8M$default, reason: not valid java name */
    public static /* synthetic */ ProjectReference m258copyE9d9s8M$default(ProjectReference projectReference, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = projectReference.uuid;
        }
        if ((i & 2) != 0) {
            str2 = projectReference.name;
        }
        return projectReference.m260copyE9d9s8M(str, str2);
    }

    public static final /* synthetic */ void write$Self$api(ProjectReference self, vd4 output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, emd.a, ProjectId.m1079boximpl(self.uuid));
        output.q(serialDesc, 1, self.name);
    }

    /* JADX INFO: renamed from: component1-5pmjb-U, reason: not valid java name and from getter */
    public final String getUuid() {
        return this.uuid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: copy-E9d9s8M, reason: not valid java name */
    public final ProjectReference m260copyE9d9s8M(String uuid, String name) {
        uuid.getClass();
        name.getClass();
        return new ProjectReference(uuid, name, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProjectReference)) {
            return false;
        }
        ProjectReference projectReference = (ProjectReference) other;
        return ProjectId.m1082equalsimpl0(this.uuid, projectReference.uuid) && x44.r(this.name, projectReference.name);
    }

    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: getUuid-5pmjb-U, reason: not valid java name */
    public final String m261getUuid5pmjbU() {
        return this.uuid;
    }

    public int hashCode() {
        return this.name.hashCode() + (ProjectId.m1083hashCodeimpl(this.uuid) * 31);
    }

    public String toString() {
        return ij0.l("ProjectReference(uuid=", ProjectId.m1084toStringimpl(this.uuid), ", name=", this.name, ")");
    }

    public /* synthetic */ ProjectReference(String str, String str2, mq5 mq5Var) {
        this(str, str2);
    }

    public /* synthetic */ ProjectReference(int i, String str, String str2, vnf vnfVar, mq5 mq5Var) {
        this(i, str, str2, vnfVar);
    }

    private ProjectReference(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.uuid = str;
        this.name = str2;
    }
}
