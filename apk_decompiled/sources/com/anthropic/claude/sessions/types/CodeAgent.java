package com.anthropic.claude.sessions.types;

import com.anthropic.claude.types.strings.CodeAgentId;
import defpackage.fsh;
import defpackage.gid;
import defpackage.grc;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.lq3;
import defpackage.mdj;
import defpackage.mq3;
import defpackage.mq5;
import defpackage.nq3;
import defpackage.onf;
import defpackage.sq6;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000278BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rB]\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\u001dJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010\u001dJ\u0010\u0010#\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b%\u0010$JZ\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010)\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b)\u0010\u001dJ\u0010\u0010*\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010-\u001a\u00020\t2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b1\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b2\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b3\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b4\u0010\u001dR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b\n\u0010$R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b\u000b\u0010$¨\u00069"}, d2 = {"Lcom/anthropic/claude/sessions/types/CodeAgent;", "", "Lcom/anthropic/claude/types/strings/CodeAgentId;", "id", "", "slug", "display_name", "description", "slack_alias", "", "is_silo", "is_virtual", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/CodeAgent;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-VN9v2L4", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "()Z", "component7", "copy-LKC-rDg", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Lcom/anthropic/claude/sessions/types/CodeAgent;", "copy", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId-VN9v2L4", "getSlug", "getDisplay_name", "getDescription", "getSlack_alias", "Z", "Companion", "lq3", "mq3", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class CodeAgent {
    public static final mq3 Companion = new mq3();
    private final String description;
    private final String display_name;
    private final String id;
    private final boolean is_silo;
    private final boolean is_virtual;
    private final String slack_alias;
    private final String slug;

    private /* synthetic */ CodeAgent(int i, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, vnf vnfVar) {
        if (7 != (i & 7)) {
            gvj.f(i, 7, lq3.a.getDescriptor());
            throw null;
        }
        this.id = str;
        this.slug = str2;
        this.display_name = str3;
        if ((i & 8) == 0) {
            this.description = null;
        } else {
            this.description = str4;
        }
        if ((i & 16) == 0) {
            this.slack_alias = null;
        } else {
            this.slack_alias = str5;
        }
        if ((i & 32) == 0) {
            this.is_silo = false;
        } else {
            this.is_silo = z;
        }
        if ((i & 64) == 0) {
            this.is_virtual = false;
        } else {
            this.is_virtual = z2;
        }
    }

    /* JADX INFO: renamed from: copy-LKC-rDg$default, reason: not valid java name */
    public static /* synthetic */ CodeAgent m830copyLKCrDg$default(CodeAgent codeAgent, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = codeAgent.id;
        }
        if ((i & 2) != 0) {
            str2 = codeAgent.slug;
        }
        if ((i & 4) != 0) {
            str3 = codeAgent.display_name;
        }
        if ((i & 8) != 0) {
            str4 = codeAgent.description;
        }
        if ((i & 16) != 0) {
            str5 = codeAgent.slack_alias;
        }
        if ((i & 32) != 0) {
            z = codeAgent.is_silo;
        }
        if ((i & 64) != 0) {
            z2 = codeAgent.is_virtual;
        }
        boolean z3 = z;
        boolean z4 = z2;
        String str6 = str5;
        String str7 = str3;
        return codeAgent.m832copyLKCrDg(str, str2, str7, str4, str6, z3, z4);
    }

    public static final /* synthetic */ void write$Self$sessions(CodeAgent self, vd4 output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, nq3.a, CodeAgentId.m992boximpl(self.id));
        output.q(serialDesc, 1, self.slug);
        output.q(serialDesc, 2, self.display_name);
        if (output.E(serialDesc) || self.description != null) {
            output.B(serialDesc, 3, srg.a, self.description);
        }
        if (output.E(serialDesc) || self.slack_alias != null) {
            output.B(serialDesc, 4, srg.a, self.slack_alias);
        }
        if (output.E(serialDesc) || self.is_silo) {
            output.p(serialDesc, 5, self.is_silo);
        }
        if (output.E(serialDesc) || self.is_virtual) {
            output.p(serialDesc, 6, self.is_virtual);
        }
    }

    /* JADX INFO: renamed from: component1-VN9v2L4, reason: not valid java name and from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSlug() {
        return this.slug;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDisplay_name() {
        return this.display_name;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSlack_alias() {
        return this.slack_alias;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIs_silo() {
        return this.is_silo;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIs_virtual() {
        return this.is_virtual;
    }

    /* JADX INFO: renamed from: copy-LKC-rDg, reason: not valid java name */
    public final CodeAgent m832copyLKCrDg(String id, String slug, String display_name, String description, String slack_alias, boolean is_silo, boolean is_virtual) {
        id.getClass();
        slug.getClass();
        display_name.getClass();
        return new CodeAgent(id, slug, display_name, description, slack_alias, is_silo, is_virtual, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CodeAgent)) {
            return false;
        }
        CodeAgent codeAgent = (CodeAgent) other;
        return CodeAgentId.m995equalsimpl0(this.id, codeAgent.id) && x44.r(this.slug, codeAgent.slug) && x44.r(this.display_name, codeAgent.display_name) && x44.r(this.description, codeAgent.description) && x44.r(this.slack_alias, codeAgent.slack_alias) && this.is_silo == codeAgent.is_silo && this.is_virtual == codeAgent.is_virtual;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDisplay_name() {
        return this.display_name;
    }

    /* JADX INFO: renamed from: getId-VN9v2L4, reason: not valid java name */
    public final String m833getIdVN9v2L4() {
        return this.id;
    }

    public final String getSlack_alias() {
        return this.slack_alias;
    }

    public final String getSlug() {
        return this.slug;
    }

    public int hashCode() {
        int iL = kgh.l(kgh.l(CodeAgentId.m996hashCodeimpl(this.id) * 31, 31, this.slug), 31, this.display_name);
        String str = this.description;
        int iHashCode = (iL + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.slack_alias;
        return Boolean.hashCode(this.is_virtual) + fsh.p((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.is_silo);
    }

    public final boolean is_silo() {
        return this.is_silo;
    }

    public final boolean is_virtual() {
        return this.is_virtual;
    }

    public String toString() {
        String strM997toStringimpl = CodeAgentId.m997toStringimpl(this.id);
        String str = this.slug;
        String str2 = this.display_name;
        String str3 = this.description;
        String str4 = this.slack_alias;
        boolean z = this.is_silo;
        boolean z2 = this.is_virtual;
        StringBuilder sbR = kgh.r("CodeAgent(id=", strM997toStringimpl, ", slug=", str, ", display_name=");
        kgh.u(sbR, str2, ", description=", str3, ", slack_alias=");
        gid.t(sbR, str4, ", is_silo=", z, ", is_virtual=");
        return sq6.v(")", sbR, z2);
    }

    private CodeAgent(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2) {
        grc.B(str, str2, str3);
        this.id = str;
        this.slug = str2;
        this.display_name = str3;
        this.description = str4;
        this.slack_alias = str5;
        this.is_silo = z;
        this.is_virtual = z2;
    }

    public /* synthetic */ CodeAgent(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, mq5 mq5Var) {
        this(str, str2, str3, str4, str5, z, z2);
    }

    public /* synthetic */ CodeAgent(int i, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, vnf vnfVar, mq5 mq5Var) {
        this(i, str, str2, str3, str4, str5, z, z2, vnfVar);
    }

    public /* synthetic */ CodeAgent(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, int i, mq5 mq5Var) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? false : z, (i & 64) != 0 ? false : z2, null);
    }
}
