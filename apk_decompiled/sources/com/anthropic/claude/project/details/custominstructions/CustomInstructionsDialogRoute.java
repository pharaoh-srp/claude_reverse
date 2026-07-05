package com.anthropic.claude.project.details.custominstructions;

import com.anthropic.claude.core.logging.EmptyDestination;
import com.anthropic.claude.types.strings.ProjectId;
import defpackage.bga;
import defpackage.cc;
import defpackage.de5;
import defpackage.emd;
import defpackage.gvj;
import defpackage.h85;
import defpackage.ij0;
import defpackage.jce;
import defpackage.kce;
import defpackage.kw9;
import defpackage.lq6;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.odf;
import defpackage.onf;
import defpackage.pl9;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00152\u00020\u0001:\u0003\u0016\u0017\u0018B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u0082\u0001\u0002\u0019\u001a¨\u0006\u001b"}, d2 = {"Lcom/anthropic/claude/project/details/custominstructions/CustomInstructionsDialogRoute;", "Lbga;", "<init>", "()V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self", "(Lcom/anthropic/claude/project/details/custominstructions/CustomInstructionsDialogRoute;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcc;", "getActiveSurface", "()Lcc;", "activeSurface", "Companion", "Closed", "EditCustomInstructions", "de5", "Lcom/anthropic/claude/project/details/custominstructions/CustomInstructionsDialogRoute$Closed;", "Lcom/anthropic/claude/project/details/custominstructions/CustomInstructionsDialogRoute$EditCustomInstructions;", "project"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public abstract class CustomInstructionsDialogRoute implements bga {
    public static final int $stable = 8;
    public static final de5 Companion = new de5();
    private static final kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new h85(5));

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bHÖ\u0083\u0004J\n\u0010\t\u001a\u00020\nHÖ\u0081\u0004J\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\fJ\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004Ê\u0001\u0002\b\u0010Ê\u0001\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000f"}, d2 = {"Lcom/anthropic/claude/project/details/custominstructions/CustomInstructionsDialogRoute$Closed;", "Lcom/anthropic/claude/project/details/custominstructions/CustomInstructionsDialogRoute;", "Lcom/anthropic/claude/core/logging/EmptyDestination;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "project", "Lkotlinx/serialization/Serializable;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Closed extends CustomInstructionsDialogRoute implements EmptyDestination {
        public static final int $stable = 0;
        public static final Closed INSTANCE = new Closed();
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new h85(6));

        private Closed() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new lq6("com.anthropic.claude.project.details.custominstructions.CustomInstructionsDialogRoute.Closed", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Closed);
        }

        public int hashCode() {
            return 807123397;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "Closed";
        }
    }

    public /* synthetic */ CustomInstructionsDialogRoute(mq5 mq5Var) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer _init_$_anonymous_() {
        kce kceVar = jce.a;
        return new odf("com.anthropic.claude.project.details.custominstructions.CustomInstructionsDialogRoute", kceVar.b(CustomInstructionsDialogRoute.class), new pl9[]{kceVar.b(Closed.class), kceVar.b(EditCustomInstructions.class)}, new KSerializer[]{new lq6("com.anthropic.claude.project.details.custominstructions.CustomInstructionsDialogRoute.Closed", Closed.INSTANCE, new Annotation[0]), a.a}, new Annotation[0]);
    }

    public static final /* synthetic */ void write$Self(CustomInstructionsDialogRoute self, vd4 output, SerialDescriptor serialDesc) {
    }

    @Override // defpackage.bga
    public cc getActiveSurface() {
        return cc.Other;
    }

    private CustomInstructionsDialogRoute() {
    }

    public /* synthetic */ CustomInstructionsDialogRoute(int i, vnf vnfVar) {
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J$\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b'\u0010\u0017¨\u0006+"}, d2 = {"Lcom/anthropic/claude/project/details/custominstructions/CustomInstructionsDialogRoute$EditCustomInstructions;", "Lcom/anthropic/claude/project/details/custominstructions/CustomInstructionsDialogRoute;", "Lcom/anthropic/claude/types/strings/ProjectId;", "projectId", "", "instructions", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$project", "(Lcom/anthropic/claude/project/details/custominstructions/CustomInstructionsDialogRoute$EditCustomInstructions;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-5pmjb-U", "()Ljava/lang/String;", "component1", "component2", "copy-E9d9s8M", "(Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/project/details/custominstructions/CustomInstructionsDialogRoute$EditCustomInstructions;", "copy", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getProjectId-5pmjb-U", "getInstructions", "Companion", "com/anthropic/claude/project/details/custominstructions/a", "com/anthropic/claude/project/details/custominstructions/b", "project"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class EditCustomInstructions extends CustomInstructionsDialogRoute {
        public static final int $stable = 0;
        public static final b Companion = new b();
        private final String instructions;
        private final String projectId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private /* synthetic */ EditCustomInstructions(int i, String str, String str2, vnf vnfVar) {
            super(i, vnfVar);
            if (3 != (i & 3)) {
                gvj.f(i, 3, a.a.getDescriptor());
                throw null;
            }
            this.projectId = str;
            this.instructions = str2;
        }

        /* JADX INFO: renamed from: copy-E9d9s8M$default, reason: not valid java name */
        public static /* synthetic */ EditCustomInstructions m790copyE9d9s8M$default(EditCustomInstructions editCustomInstructions, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = editCustomInstructions.projectId;
            }
            if ((i & 2) != 0) {
                str2 = editCustomInstructions.instructions;
            }
            return editCustomInstructions.m792copyE9d9s8M(str, str2);
        }

        public static final /* synthetic */ void write$Self$project(EditCustomInstructions self, vd4 output, SerialDescriptor serialDesc) {
            CustomInstructionsDialogRoute.write$Self(self, output, serialDesc);
            output.r(serialDesc, 0, emd.a, ProjectId.m1079boximpl(self.projectId));
            output.q(serialDesc, 1, self.instructions);
        }

        /* JADX INFO: renamed from: component1-5pmjb-U, reason: not valid java name and from getter */
        public final String getProjectId() {
            return this.projectId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getInstructions() {
            return this.instructions;
        }

        /* JADX INFO: renamed from: copy-E9d9s8M, reason: not valid java name */
        public final EditCustomInstructions m792copyE9d9s8M(String projectId, String instructions) {
            projectId.getClass();
            instructions.getClass();
            return new EditCustomInstructions(projectId, instructions, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EditCustomInstructions)) {
                return false;
            }
            EditCustomInstructions editCustomInstructions = (EditCustomInstructions) other;
            return ProjectId.m1082equalsimpl0(this.projectId, editCustomInstructions.projectId) && x44.r(this.instructions, editCustomInstructions.instructions);
        }

        public final String getInstructions() {
            return this.instructions;
        }

        /* JADX INFO: renamed from: getProjectId-5pmjb-U, reason: not valid java name */
        public final String m793getProjectId5pmjbU() {
            return this.projectId;
        }

        public int hashCode() {
            return this.instructions.hashCode() + (ProjectId.m1083hashCodeimpl(this.projectId) * 31);
        }

        public String toString() {
            return ij0.l("EditCustomInstructions(projectId=", ProjectId.m1084toStringimpl(this.projectId), ", instructions=", this.instructions, ")");
        }

        public /* synthetic */ EditCustomInstructions(String str, String str2, mq5 mq5Var) {
            this(str, str2);
        }

        public /* synthetic */ EditCustomInstructions(int i, String str, String str2, vnf vnfVar, mq5 mq5Var) {
            this(i, str, str2, vnfVar);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private EditCustomInstructions(String str, String str2) {
            super(null);
            str.getClass();
            str2.getClass();
            this.projectId = str;
            this.instructions = str2;
        }
    }
}
