package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class wm {
    public final String a;
    public final String b;
    public final boolean c;
    public final Set d;
    public final Set e;
    public final kj f;
    public final String g;

    public wm(String str, String str2, boolean z, Set set, Set set2, kj kjVar, String str3) {
        str.getClass();
        kjVar.getClass();
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = set;
        this.e = set2;
        this.f = kjVar;
        this.g = str3;
    }

    public final kj a() {
        return this.f;
    }

    public final Set b() {
        return this.d;
    }

    public final boolean c() {
        return this.c;
    }

    public final String d() {
        return this.a;
    }

    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wm)) {
            return false;
        }
        wm wmVar = (wm) obj;
        return x44.r(this.a, wmVar.a) && x44.r(this.b, wmVar.b) && this.c == wmVar.c && this.d.equals(wmVar.d) && this.e.equals(wmVar.e) && this.f == wmVar.f && x44.r(this.g, wmVar.g);
    }

    public final String f() {
        return this.g;
    }

    public final Set g() {
        return this.e;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + fsh.p((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c)) * 31)) * 31)) * 31;
        String str2 = this.g;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbR = kgh.r("AgentChatResumeState(lastEventId=", this.a, ", oldestEventId=", this.b, ", hasMoreHistory=");
        sbR.append(this.c);
        sbR.append(", briefToolUseIds=");
        sbR.append(this.d);
        sbR.append(", taskToolUseIds=");
        sbR.append(this.e);
        sbR.append(", activityStatus=");
        sbR.append(this.f);
        sbR.append(", seenCandidateId=");
        return ij0.m(sbR, this.g, ")");
    }
}
