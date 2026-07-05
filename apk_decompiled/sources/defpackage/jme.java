package defpackage;

import com.anthropic.claude.api.chat.tool.ResearchStatus;
import com.anthropic.claude.types.strings.ResearchTaskId;
import java.time.Instant;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class jme {
    public final String a;
    public final boolean b;
    public final int c;
    public final Instant d;
    public final long e;
    public final ResearchStatus f;
    public final String g;
    public final List h;
    public final List i;

    public jme(String str, boolean z, int i, Instant instant, long j, ResearchStatus researchStatus, String str2, List list, List list2) {
        this.a = str;
        this.b = z;
        this.c = i;
        this.d = instant;
        this.e = j;
        this.f = researchStatus;
        this.g = str2;
        this.h = list;
        this.i = list2;
    }

    public final boolean a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jme)) {
            return false;
        }
        jme jmeVar = (jme) obj;
        return ResearchTaskId.m1103equalsimpl0(this.a, jmeVar.a) && this.b == jmeVar.b && this.c == jmeVar.c && x44.r(this.d, jmeVar.d) && this.e == jmeVar.e && this.f == jmeVar.f && x44.r(this.g, jmeVar.g) && this.h.equals(jmeVar.h) && this.i.equals(jmeVar.i);
    }

    public final int hashCode() {
        int iC = vb7.c(this.c, fsh.p(ResearchTaskId.m1104hashCodeimpl(this.a) * 31, 31, this.b), 31);
        Instant instant = this.d;
        int iE = vb7.e((iC + (instant == null ? 0 : instant.hashCode())) * 31, 31, this.e);
        ResearchStatus researchStatus = this.f;
        int iHashCode = (iE + (researchStatus == null ? 0 : researchStatus.hashCode())) * 31;
        String str = this.g;
        return this.i.hashCode() + kgh.m((iHashCode + (str != null ? str.hashCode() : 0)) * 31, 31, this.h);
    }

    public final String toString() {
        return "ResearchToolStatusUpdate(taskId=" + ResearchTaskId.m1105toStringimpl(this.a) + ", isComplete=" + this.b + ", totalSources=" + this.c + ", startedAt=" + this.d + ", elapsedTimeSeconds=" + this.e + ", status=" + this.f + ", researchTitle=" + this.g + ", domainLinkCounts=" + this.h + ", agentSummaries=" + this.i + ")";
    }
}
