package com.anthropic.claude.sessions.types;

import defpackage.alc;
import defpackage.clc;
import defpackage.e2c;
import defpackage.gvj;
import defpackage.jce;
import defpackage.kce;
import defpackage.kw9;
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
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00112\u00020\u0001:\u0002\u0012\u0013B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0001\u0001\u0014¨\u0006\u0015"}, d2 = {"Lcom/anthropic/claude/sessions/types/Outcome;", "", "<init>", "()V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self", "(Lcom/anthropic/claude/sessions/types/Outcome;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Companion", "GitRepository", "alc", "Lcom/anthropic/claude/sessions/types/Outcome$GitRepository;", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public abstract class Outcome {
    public static final alc Companion = new alc();
    private static final kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new e2c(29));

    public /* synthetic */ Outcome(mq5 mq5Var) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer _init_$_anonymous_() {
        kce kceVar = jce.a;
        return new odf("com.anthropic.claude.sessions.types.Outcome", kceVar.b(Outcome.class), new pl9[]{kceVar.b(GitRepository.class)}, new KSerializer[]{n0.a}, new Annotation[0]);
    }

    public static final /* synthetic */ void write$Self(Outcome self, vd4 output, SerialDescriptor serialDesc) {
    }

    private Outcome() {
    }

    public /* synthetic */ Outcome(int i, vnf vnfVar) {
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015¨\u0006'"}, d2 = {"Lcom/anthropic/claude/sessions/types/Outcome$GitRepository;", "Lcom/anthropic/claude/sessions/types/Outcome;", "Lcom/anthropic/claude/sessions/types/OutcomeGitInfo;", "git_info", "<init>", "(Lcom/anthropic/claude/sessions/types/OutcomeGitInfo;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/sessions/types/OutcomeGitInfo;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/Outcome$GitRepository;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/sessions/types/OutcomeGitInfo;", "copy", "(Lcom/anthropic/claude/sessions/types/OutcomeGitInfo;)Lcom/anthropic/claude/sessions/types/Outcome$GitRepository;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/sessions/types/OutcomeGitInfo;", "getGit_info", "Companion", "com/anthropic/claude/sessions/types/n0", "com/anthropic/claude/sessions/types/o0", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class GitRepository extends Outcome {
        public static final o0 Companion = new o0();
        private final OutcomeGitInfo git_info;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ GitRepository(int i, OutcomeGitInfo outcomeGitInfo, vnf vnfVar) {
            super(i, vnfVar);
            if (1 != (i & 1)) {
                gvj.f(i, 1, n0.a.getDescriptor());
                throw null;
            }
            this.git_info = outcomeGitInfo;
        }

        public static /* synthetic */ GitRepository copy$default(GitRepository gitRepository, OutcomeGitInfo outcomeGitInfo, int i, Object obj) {
            if ((i & 1) != 0) {
                outcomeGitInfo = gitRepository.git_info;
            }
            return gitRepository.copy(outcomeGitInfo);
        }

        public static final /* synthetic */ void write$Self$sessions(GitRepository self, vd4 output, SerialDescriptor serialDesc) {
            Outcome.write$Self(self, output, serialDesc);
            output.r(serialDesc, 0, clc.a, self.git_info);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final OutcomeGitInfo getGit_info() {
            return this.git_info;
        }

        public final GitRepository copy(OutcomeGitInfo git_info) {
            git_info.getClass();
            return new GitRepository(git_info);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof GitRepository) && x44.r(this.git_info, ((GitRepository) other).git_info);
        }

        public final OutcomeGitInfo getGit_info() {
            return this.git_info;
        }

        public int hashCode() {
            return this.git_info.hashCode();
        }

        public String toString() {
            return "GitRepository(git_info=" + this.git_info + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GitRepository(OutcomeGitInfo outcomeGitInfo) {
            super(null);
            outcomeGitInfo.getClass();
            this.git_info = outcomeGitInfo;
        }
    }
}
