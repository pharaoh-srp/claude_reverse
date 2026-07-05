package com.anthropic.claude.sessions.types;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.fsh;
import defpackage.gvj;
import defpackage.mdj;
import defpackage.onf;
import defpackage.qy1;
import defpackage.srg;
import defpackage.sw1;
import defpackage.tw1;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0002:;BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\r\u0010\u000eBa\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\r\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0010\u0010!\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b%\u0010$J\u0012\u0010&\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b&\u0010$Jf\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b)\u0010$J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u001dJ\u001a\u0010,\u001a\u00020\u00072\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b0\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b1\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b2\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b4\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b6\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b7\u0010$R\u0019\u0010\f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\f\u00105\u001a\u0004\b8\u0010$¨\u0006<"}, d2 = {"Lcom/anthropic/claude/sessions/types/BranchPullRequest;", "", "", "number", "additions", "deletions", "commits", "", "auto_merge_enabled", "", "state", "title", "url", "<init>", "(IIIIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(IIIIIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/BranchPullRequest;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "component3", "component4", "component5", "()Z", "component6", "()Ljava/lang/String;", "component7", "component8", "copy", "(IIIIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/sessions/types/BranchPullRequest;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getNumber", "getAdditions", "getDeletions", "getCommits", "Z", "getAuto_merge_enabled", "Ljava/lang/String;", "getState", "getTitle", "getUrl", "Companion", "sw1", "tw1", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class BranchPullRequest {
    public static final tw1 Companion = new tw1();
    private final int additions;
    private final boolean auto_merge_enabled;
    private final int commits;
    private final int deletions;
    private final int number;
    private final String state;
    private final String title;
    private final String url;

    public /* synthetic */ BranchPullRequest(int i, int i2, int i3, int i4, int i5, boolean z, String str, String str2, String str3, vnf vnfVar) {
        if (15 != (i & 15)) {
            gvj.f(i, 15, sw1.a.getDescriptor());
            throw null;
        }
        this.number = i2;
        this.additions = i3;
        this.deletions = i4;
        this.commits = i5;
        if ((i & 16) == 0) {
            this.auto_merge_enabled = false;
        } else {
            this.auto_merge_enabled = z;
        }
        if ((i & 32) == 0) {
            this.state = null;
        } else {
            this.state = str;
        }
        if ((i & 64) == 0) {
            this.title = null;
        } else {
            this.title = str2;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) == 0) {
            this.url = null;
        } else {
            this.url = str3;
        }
    }

    public static /* synthetic */ BranchPullRequest copy$default(BranchPullRequest branchPullRequest, int i, int i2, int i3, int i4, boolean z, String str, String str2, String str3, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = branchPullRequest.number;
        }
        if ((i5 & 2) != 0) {
            i2 = branchPullRequest.additions;
        }
        if ((i5 & 4) != 0) {
            i3 = branchPullRequest.deletions;
        }
        if ((i5 & 8) != 0) {
            i4 = branchPullRequest.commits;
        }
        if ((i5 & 16) != 0) {
            z = branchPullRequest.auto_merge_enabled;
        }
        if ((i5 & 32) != 0) {
            str = branchPullRequest.state;
        }
        if ((i5 & 64) != 0) {
            str2 = branchPullRequest.title;
        }
        if ((i5 & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
            str3 = branchPullRequest.url;
        }
        String str4 = str2;
        String str5 = str3;
        boolean z2 = z;
        String str6 = str;
        return branchPullRequest.copy(i, i2, i3, i4, z2, str6, str4, str5);
    }

    public static final /* synthetic */ void write$Self$sessions(BranchPullRequest self, vd4 output, SerialDescriptor serialDesc) {
        output.l(0, self.number, serialDesc);
        output.l(1, self.additions, serialDesc);
        output.l(2, self.deletions, serialDesc);
        output.l(3, self.commits, serialDesc);
        if (output.E(serialDesc) || self.auto_merge_enabled) {
            output.p(serialDesc, 4, self.auto_merge_enabled);
        }
        if (output.E(serialDesc) || self.state != null) {
            output.B(serialDesc, 5, srg.a, self.state);
        }
        if (output.E(serialDesc) || self.title != null) {
            output.B(serialDesc, 6, srg.a, self.title);
        }
        if (!output.E(serialDesc) && self.url == null) {
            return;
        }
        output.B(serialDesc, 7, srg.a, self.url);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getNumber() {
        return this.number;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getAdditions() {
        return this.additions;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getDeletions() {
        return this.deletions;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getCommits() {
        return this.commits;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getAuto_merge_enabled() {
        return this.auto_merge_enabled;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public final BranchPullRequest copy(int number, int additions, int deletions, int commits, boolean auto_merge_enabled, String state, String title, String url) {
        return new BranchPullRequest(number, additions, deletions, commits, auto_merge_enabled, state, title, url);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BranchPullRequest)) {
            return false;
        }
        BranchPullRequest branchPullRequest = (BranchPullRequest) other;
        return this.number == branchPullRequest.number && this.additions == branchPullRequest.additions && this.deletions == branchPullRequest.deletions && this.commits == branchPullRequest.commits && this.auto_merge_enabled == branchPullRequest.auto_merge_enabled && x44.r(this.state, branchPullRequest.state) && x44.r(this.title, branchPullRequest.title) && x44.r(this.url, branchPullRequest.url);
    }

    public final int getAdditions() {
        return this.additions;
    }

    public final boolean getAuto_merge_enabled() {
        return this.auto_merge_enabled;
    }

    public final int getCommits() {
        return this.commits;
    }

    public final int getDeletions() {
        return this.deletions;
    }

    public final int getNumber() {
        return this.number;
    }

    public final String getState() {
        return this.state;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iP = fsh.p(vb7.c(this.commits, vb7.c(this.deletions, vb7.c(this.additions, Integer.hashCode(this.number) * 31, 31), 31), 31), 31, this.auto_merge_enabled);
        String str = this.state;
        int iHashCode = (iP + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.url;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        int i = this.number;
        int i2 = this.additions;
        int i3 = this.deletions;
        int i4 = this.commits;
        boolean z = this.auto_merge_enabled;
        String str = this.state;
        String str2 = this.title;
        String str3 = this.url;
        StringBuilder sbV = vb7.v("BranchPullRequest(number=", ", additions=", i, i2, ", deletions=");
        qy1.k(i3, i4, ", commits=", ", auto_merge_enabled=", sbV);
        sbV.append(z);
        sbV.append(", state=");
        sbV.append(str);
        sbV.append(", title=");
        return vb7.t(sbV, str2, ", url=", str3, ")");
    }

    public BranchPullRequest(int i, int i2, int i3, int i4, boolean z, String str, String str2, String str3) {
        this.number = i;
        this.additions = i2;
        this.deletions = i3;
        this.commits = i4;
        this.auto_merge_enabled = z;
        this.state = str;
        this.title = str2;
        this.url = str3;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ BranchPullRequest(int r12, int r13, int r14, int r15, boolean r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, int r20, defpackage.mq5 r21) {
        /*
            r11 = this;
            r0 = r20
            r1 = r0 & 16
            if (r1 == 0) goto L9
            r1 = 0
            r7 = r1
            goto Lb
        L9:
            r7 = r16
        Lb:
            r1 = r0 & 32
            r2 = 0
            if (r1 == 0) goto L12
            r8 = r2
            goto L14
        L12:
            r8 = r17
        L14:
            r1 = r0 & 64
            if (r1 == 0) goto L1a
            r9 = r2
            goto L1c
        L1a:
            r9 = r18
        L1c:
            r0 = r0 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L27
            r10 = r2
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r2 = r11
            goto L2e
        L27:
            r10 = r19
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
        L2e:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.sessions.types.BranchPullRequest.<init>(int, int, int, int, boolean, java.lang.String, java.lang.String, java.lang.String, int, mq5):void");
    }
}
