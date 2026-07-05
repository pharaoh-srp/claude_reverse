package com.anthropic.claude.sessions.types;

import defpackage.gvj;
import defpackage.ij0;
import defpackage.jce;
import defpackage.kce;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.odf;
import defpackage.onf;
import defpackage.pl9;
import defpackage.srg;
import defpackage.ucf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.vpf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00112\u00020\u0001:\u0003\u0012\u0013\u0014B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0001\u0002\u0015\u0016¨\u0006\u0017"}, d2 = {"Lcom/anthropic/claude/sessions/types/SessionContextSource;", "", "<init>", "()V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self", "(Lcom/anthropic/claude/sessions/types/SessionContextSource;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Companion", "GitRepository", "KnowledgeBase", "vpf", "Lcom/anthropic/claude/sessions/types/SessionContextSource$GitRepository;", "Lcom/anthropic/claude/sessions/types/SessionContextSource$KnowledgeBase;", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public abstract class SessionContextSource {
    public static final vpf Companion = new vpf();
    private static final kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new ucf(20));

    public /* synthetic */ SessionContextSource(mq5 mq5Var) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer _init_$_anonymous_() {
        kce kceVar = jce.a;
        return new odf("com.anthropic.claude.sessions.types.SessionContextSource", kceVar.b(SessionContextSource.class), new pl9[]{kceVar.b(GitRepository.class), kceVar.b(KnowledgeBase.class)}, new KSerializer[]{h1.a, j1.a}, new Annotation[0]);
    }

    public static final /* synthetic */ void write$Self(SessionContextSource self, vd4 output, SerialDescriptor serialDesc) {
    }

    private SessionContextSource() {
    }

    public /* synthetic */ SessionContextSource(int i, vnf vnfVar) {
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#$B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0015¨\u0006%"}, d2 = {"Lcom/anthropic/claude/sessions/types/SessionContextSource$KnowledgeBase;", "Lcom/anthropic/claude/sessions/types/SessionContextSource;", "", "knowledge_base_id", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/SessionContextSource$KnowledgeBase;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/anthropic/claude/sessions/types/SessionContextSource$KnowledgeBase;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getKnowledge_base_id", "Companion", "com/anthropic/claude/sessions/types/j1", "com/anthropic/claude/sessions/types/k1", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class KnowledgeBase extends SessionContextSource {
        public static final k1 Companion = new k1();
        private final String knowledge_base_id;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ KnowledgeBase(int i, String str, vnf vnfVar) {
            super(i, vnfVar);
            if (1 != (i & 1)) {
                gvj.f(i, 1, j1.a.getDescriptor());
                throw null;
            }
            this.knowledge_base_id = str;
        }

        public static /* synthetic */ KnowledgeBase copy$default(KnowledgeBase knowledgeBase, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = knowledgeBase.knowledge_base_id;
            }
            return knowledgeBase.copy(str);
        }

        public static final /* synthetic */ void write$Self$sessions(KnowledgeBase self, vd4 output, SerialDescriptor serialDesc) {
            SessionContextSource.write$Self(self, output, serialDesc);
            output.q(serialDesc, 0, self.knowledge_base_id);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getKnowledge_base_id() {
            return this.knowledge_base_id;
        }

        public final KnowledgeBase copy(String knowledge_base_id) {
            knowledge_base_id.getClass();
            return new KnowledgeBase(knowledge_base_id);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof KnowledgeBase) && x44.r(this.knowledge_base_id, ((KnowledgeBase) other).knowledge_base_id);
        }

        public final String getKnowledge_base_id() {
            return this.knowledge_base_id;
        }

        public int hashCode() {
            return this.knowledge_base_id.hashCode();
        }

        public String toString() {
            return ij0.j("KnowledgeBase(knowledge_base_id=", this.knowledge_base_id, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public KnowledgeBase(String str) {
            super(null);
            str.getClass();
            this.knowledge_base_id = str;
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&'B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J&\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u0016¨\u0006("}, d2 = {"Lcom/anthropic/claude/sessions/types/SessionContextSource$GitRepository;", "Lcom/anthropic/claude/sessions/types/SessionContextSource;", "", "url", "revision", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/SessionContextSource$GitRepository;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/sessions/types/SessionContextSource$GitRepository;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUrl", "getRevision", "Companion", "com/anthropic/claude/sessions/types/h1", "com/anthropic/claude/sessions/types/i1", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class GitRepository extends SessionContextSource {
        public static final i1 Companion = new i1();
        private final String revision;
        private final String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ GitRepository(int i, String str, String str2, vnf vnfVar) {
            super(i, vnfVar);
            if (1 != (i & 1)) {
                gvj.f(i, 1, h1.a.getDescriptor());
                throw null;
            }
            this.url = str;
            if ((i & 2) == 0) {
                this.revision = null;
            } else {
                this.revision = str2;
            }
        }

        public static /* synthetic */ GitRepository copy$default(GitRepository gitRepository, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = gitRepository.url;
            }
            if ((i & 2) != 0) {
                str2 = gitRepository.revision;
            }
            return gitRepository.copy(str, str2);
        }

        public static final /* synthetic */ void write$Self$sessions(GitRepository self, vd4 output, SerialDescriptor serialDesc) {
            SessionContextSource.write$Self(self, output, serialDesc);
            output.q(serialDesc, 0, self.url);
            if (!output.E(serialDesc) && self.revision == null) {
                return;
            }
            output.B(serialDesc, 1, srg.a, self.revision);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getRevision() {
            return this.revision;
        }

        public final GitRepository copy(String url, String revision) {
            url.getClass();
            return new GitRepository(url, revision);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GitRepository)) {
                return false;
            }
            GitRepository gitRepository = (GitRepository) other;
            return x44.r(this.url, gitRepository.url) && x44.r(this.revision, gitRepository.revision);
        }

        public final String getRevision() {
            return this.revision;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            int iHashCode = this.url.hashCode() * 31;
            String str = this.revision;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return ij0.l("GitRepository(url=", this.url, ", revision=", this.revision, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GitRepository(String str, String str2) {
            super(null);
            str.getClass();
            this.url = str;
            this.revision = str2;
        }

        public /* synthetic */ GitRepository(String str, String str2, int i, mq5 mq5Var) {
            this(str, (i & 2) != 0 ? null : str2);
        }
    }
}
