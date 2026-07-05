package com.anthropic.claude.project.knowledge;

import com.anthropic.claude.core.logging.EmptyDestination;
import defpackage.bga;
import defpackage.cc;
import defpackage.kw9;
import defpackage.lq6;
import defpackage.mdj;
import defpackage.mgd;
import defpackage.onf;
import defpackage.w1a;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bs\u0018\u0000 \u00062\u00020\u0001:\u0003\u0007\b\tR\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/anthropic/claude/project/knowledge/ProjectDocMenuDialogDestination;", "Lbga;", "Lcc;", "getActiveSurface", "()Lcc;", "activeSurface", "Companion", "Dismissed", "Delete", "com/anthropic/claude/project/knowledge/b", "Lcom/anthropic/claude/project/knowledge/ProjectDocMenuDialogDestination$Delete;", "Lcom/anthropic/claude/project/knowledge/ProjectDocMenuDialogDestination$Dismissed;", "project"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public interface ProjectDocMenuDialogDestination extends bga {
    public static final b Companion = b.a;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bJ\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004Ê\u0001\u0002\b\u000fÊ\u0001\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000e"}, d2 = {"Lcom/anthropic/claude/project/knowledge/ProjectDocMenuDialogDestination$Delete;", "Lcom/anthropic/claude/project/knowledge/ProjectDocMenuDialogDestination;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "project", "Lkotlinx/serialization/Serializable;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Delete implements ProjectDocMenuDialogDestination {
        public static final int $stable = 0;
        public static final Delete INSTANCE = new Delete();
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new mgd(8));

        private Delete() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new lq6("com.anthropic.claude.project.knowledge.ProjectDocMenuDialogDestination.Delete", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Delete);
        }

        @Override // com.anthropic.claude.project.knowledge.ProjectDocMenuDialogDestination, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        public int hashCode() {
            return 541560311;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "Delete";
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bHÖ\u0083\u0004J\n\u0010\t\u001a\u00020\nHÖ\u0081\u0004J\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\fJ\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004Ê\u0001\u0002\b\u0010Ê\u0001\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000f"}, d2 = {"Lcom/anthropic/claude/project/knowledge/ProjectDocMenuDialogDestination$Dismissed;", "Lcom/anthropic/claude/project/knowledge/ProjectDocMenuDialogDestination;", "Lcom/anthropic/claude/core/logging/EmptyDestination;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "project", "Lkotlinx/serialization/Serializable;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Dismissed implements ProjectDocMenuDialogDestination, EmptyDestination {
        public static final int $stable = 0;
        public static final Dismissed INSTANCE = new Dismissed();
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new mgd(9));

        private Dismissed() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new lq6("com.anthropic.claude.project.knowledge.ProjectDocMenuDialogDestination.Dismissed", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Dismissed);
        }

        @Override // com.anthropic.claude.project.knowledge.ProjectDocMenuDialogDestination, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        public int hashCode() {
            return -2050635555;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "Dismissed";
        }
    }

    @Override // defpackage.bga
    default cc getActiveSurface() {
        return cc.Other;
    }
}
