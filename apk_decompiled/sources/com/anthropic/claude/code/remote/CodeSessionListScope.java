package com.anthropic.claude.code.remote;

import com.anthropic.claude.types.strings.SessionGroupingId;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.kw9;
import defpackage.lq6;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.wg6;
import defpackage.wt3;
import defpackage.x44;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00112\u00020\u0001:\u0005\u0012\u0013\u0014\u0015\u0016R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u001c\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u0082\u0001\u0004\u0017\u0018\u0019\u001a¨\u0006\u001bÀ\u0006\u0003"}, d2 = {"Lcom/anthropic/claude/code/remote/CodeSessionListScope;", "", "", "getEmitsCodeTabTelemetry", "()Z", "emitsCodeTabTelemetry", "getSupportsWatch", "supportsWatch", "", "", "getScopeTags", "()Ljava/util/List;", "scopeTags", "Lcom/anthropic/claude/types/strings/SessionGroupingId;", "getGroupingFilter-n6q-b3o", "()Ljava/lang/String;", "groupingFilter", "Companion", "Code", "DramaticShrimp", "Scheduled", "Project", "com/anthropic/claude/code/remote/k", "Lcom/anthropic/claude/code/remote/CodeSessionListScope$Code;", "Lcom/anthropic/claude/code/remote/CodeSessionListScope$DramaticShrimp;", "Lcom/anthropic/claude/code/remote/CodeSessionListScope$Project;", "Lcom/anthropic/claude/code/remote/CodeSessionListScope$Scheduled;", "remote"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public interface CodeSessionListScope {
    public static final k Companion = k.a;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bJ\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004Ê\u0001\u0002\b\u000fÊ\u0001\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000e"}, d2 = {"Lcom/anthropic/claude/code/remote/CodeSessionListScope$Code;", "Lcom/anthropic/claude/code/remote/CodeSessionListScope;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "remote", "Lkotlinx/serialization/Serializable;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Code implements CodeSessionListScope {
        public static final int $stable = 0;
        public static final Code INSTANCE = new Code();
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new wt3(21));

        private Code() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new lq6("com.anthropic.claude.code.remote.CodeSessionListScope.Code", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Code);
        }

        @Override // com.anthropic.claude.code.remote.CodeSessionListScope
        public /* bridge */ boolean getEmitsCodeTabTelemetry() {
            return super.getEmitsCodeTabTelemetry();
        }

        @Override // com.anthropic.claude.code.remote.CodeSessionListScope
        /* JADX INFO: renamed from: getGroupingFilter-n6q-b3o */
        public /* bridge */ String mo700getGroupingFiltern6qb3o() {
            return super.mo700getGroupingFiltern6qb3o();
        }

        @Override // com.anthropic.claude.code.remote.CodeSessionListScope
        public /* bridge */ List<String> getScopeTags() {
            return super.getScopeTags();
        }

        @Override // com.anthropic.claude.code.remote.CodeSessionListScope
        public /* bridge */ boolean getSupportsWatch() {
            return super.getSupportsWatch();
        }

        public int hashCode() {
            return -983478010;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "Code";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bJ\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004Ê\u0001\u0002\b\u000fÊ\u0001\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000e"}, d2 = {"Lcom/anthropic/claude/code/remote/CodeSessionListScope$DramaticShrimp;", "Lcom/anthropic/claude/code/remote/CodeSessionListScope;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "remote", "Lkotlinx/serialization/Serializable;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class DramaticShrimp implements CodeSessionListScope {
        public static final int $stable = 0;
        public static final DramaticShrimp INSTANCE = new DramaticShrimp();
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new wt3(22));

        private DramaticShrimp() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new lq6("com.anthropic.claude.code.remote.CodeSessionListScope.DramaticShrimp", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof DramaticShrimp);
        }

        @Override // com.anthropic.claude.code.remote.CodeSessionListScope
        public /* bridge */ boolean getEmitsCodeTabTelemetry() {
            return super.getEmitsCodeTabTelemetry();
        }

        @Override // com.anthropic.claude.code.remote.CodeSessionListScope
        /* JADX INFO: renamed from: getGroupingFilter-n6q-b3o */
        public /* bridge */ String mo700getGroupingFiltern6qb3o() {
            return super.mo700getGroupingFiltern6qb3o();
        }

        @Override // com.anthropic.claude.code.remote.CodeSessionListScope
        public /* bridge */ List<String> getScopeTags() {
            return super.getScopeTags();
        }

        @Override // com.anthropic.claude.code.remote.CodeSessionListScope
        public /* bridge */ boolean getSupportsWatch() {
            return super.getSupportsWatch();
        }

        public int hashCode() {
            return -1169198737;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "DramaticShrimp";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bJ\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004Ê\u0001\u0002\b\u000fÊ\u0001\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000e"}, d2 = {"Lcom/anthropic/claude/code/remote/CodeSessionListScope$Scheduled;", "Lcom/anthropic/claude/code/remote/CodeSessionListScope;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "remote", "Lkotlinx/serialization/Serializable;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Scheduled implements CodeSessionListScope {
        public static final int $stable = 0;
        public static final Scheduled INSTANCE = new Scheduled();
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new wt3(23));

        private Scheduled() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new lq6("com.anthropic.claude.code.remote.CodeSessionListScope.Scheduled", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Scheduled);
        }

        @Override // com.anthropic.claude.code.remote.CodeSessionListScope
        public /* bridge */ boolean getEmitsCodeTabTelemetry() {
            return super.getEmitsCodeTabTelemetry();
        }

        @Override // com.anthropic.claude.code.remote.CodeSessionListScope
        /* JADX INFO: renamed from: getGroupingFilter-n6q-b3o */
        public /* bridge */ String mo700getGroupingFiltern6qb3o() {
            return super.mo700getGroupingFiltern6qb3o();
        }

        @Override // com.anthropic.claude.code.remote.CodeSessionListScope
        public /* bridge */ List<String> getScopeTags() {
            return super.getScopeTags();
        }

        @Override // com.anthropic.claude.code.remote.CodeSessionListScope
        public /* bridge */ boolean getSupportsWatch() {
            return super.getSupportsWatch();
        }

        public int hashCode() {
            return -250600140;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "Scheduled";
        }
    }

    default boolean getEmitsCodeTabTelemetry() {
        return this instanceof Code;
    }

    /* JADX INFO: renamed from: getGroupingFilter-n6q-b3o, reason: not valid java name */
    default String mo700getGroupingFiltern6qb3o() {
        Project project = this instanceof Project ? (Project) this : null;
        if (project != null) {
            return project.m704getIdiRFWGjk();
        }
        return null;
    }

    default List<String> getScopeTags() {
        if (equals(Code.INSTANCE)) {
            return null;
        }
        if (equals(DramaticShrimp.INSTANCE)) {
            return x44.W("cowork-remote");
        }
        if (equals(Scheduled.INSTANCE)) {
            return x44.W("cowork-scheduled");
        }
        if (this instanceof Project) {
            return null;
        }
        wg6.i();
        return null;
    }

    default boolean getSupportsWatch() {
        return !(this instanceof Project);
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&'B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J\u0010\u0010\u001c\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0015¨\u0006("}, d2 = {"Lcom/anthropic/claude/code/remote/CodeSessionListScope$Project;", "Lcom/anthropic/claude/code/remote/CodeSessionListScope;", "Lcom/anthropic/claude/types/strings/SessionGroupingId;", "id", "<init>", "(Ljava/lang/String;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$remote", "(Lcom/anthropic/claude/code/remote/CodeSessionListScope$Project;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-iRFWGjk", "()Ljava/lang/String;", "component1", "copy-qbZOyc4", "(Ljava/lang/String;)Lcom/anthropic/claude/code/remote/CodeSessionListScope$Project;", "copy", "", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId-iRFWGjk", "Companion", "com/anthropic/claude/code/remote/l", "com/anthropic/claude/code/remote/m", "remote"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Project implements CodeSessionListScope {
        public static final int $stable = 0;
        public static final m Companion = new m();
        private final String id;

        private /* synthetic */ Project(int i, String str, vnf vnfVar) {
            if (1 == (i & 1)) {
                this.id = str;
            } else {
                gvj.f(i, 1, l.a.getDescriptor());
                throw null;
            }
        }

        /* JADX INFO: renamed from: copy-qbZOyc4$default, reason: not valid java name */
        public static /* synthetic */ Project m701copyqbZOyc4$default(Project project, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = project.id;
            }
            return project.m703copyqbZOyc4(str);
        }

        /* JADX INFO: renamed from: component1-iRFWGjk, reason: not valid java name and from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: copy-qbZOyc4, reason: not valid java name */
        public final Project m703copyqbZOyc4(String id) {
            id.getClass();
            return new Project(id, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Project) && SessionGroupingId.m1110equalsimpl0(this.id, ((Project) other).id);
        }

        @Override // com.anthropic.claude.code.remote.CodeSessionListScope
        public /* bridge */ boolean getEmitsCodeTabTelemetry() {
            return super.getEmitsCodeTabTelemetry();
        }

        @Override // com.anthropic.claude.code.remote.CodeSessionListScope
        /* JADX INFO: renamed from: getGroupingFilter-n6q-b3o */
        public /* bridge */ String mo700getGroupingFiltern6qb3o() {
            return super.mo700getGroupingFiltern6qb3o();
        }

        /* JADX INFO: renamed from: getId-iRFWGjk, reason: not valid java name */
        public final String m704getIdiRFWGjk() {
            return this.id;
        }

        @Override // com.anthropic.claude.code.remote.CodeSessionListScope
        public /* bridge */ List<String> getScopeTags() {
            return super.getScopeTags();
        }

        @Override // com.anthropic.claude.code.remote.CodeSessionListScope
        public /* bridge */ boolean getSupportsWatch() {
            return super.getSupportsWatch();
        }

        public int hashCode() {
            return SessionGroupingId.m1111hashCodeimpl(this.id);
        }

        public String toString() {
            return ij0.j("Project(id=", SessionGroupingId.m1112toStringimpl(this.id), ")");
        }

        public /* synthetic */ Project(String str, mq5 mq5Var) {
            this(str);
        }

        public /* synthetic */ Project(int i, String str, vnf vnfVar, mq5 mq5Var) {
            this(i, str, vnfVar);
        }

        private Project(String str) {
            str.getClass();
            this.id = str;
        }
    }
}
