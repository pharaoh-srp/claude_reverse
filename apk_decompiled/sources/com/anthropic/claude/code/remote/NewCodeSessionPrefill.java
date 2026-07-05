package com.anthropic.claude.code.remote;

import com.anthropic.claude.types.strings.CodeAgentId;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.fsh;
import defpackage.gid;
import defpackage.kgh;
import defpackage.lhf;
import defpackage.lm6;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.ms6;
import defpackage.o32;
import defpackage.onf;
import defpackage.p2c;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0087\b\u0018\u0000 Y2\u00020\u0001:\u0002Z[Bi\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011B¯\u0001\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\f\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0013\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u001a\u001a\u00020\f\u0012\b\b\u0002\u0010\u001b\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\u001eJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010\u001eJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b#\u0010\u001eJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b$\u0010\u001eJ\u0010\u0010%\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b'\u0010&J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0016\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00160\u0013HÆ\u0003¢\u0006\u0004\b*\u0010)J\u0012\u0010,\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b+\u0010\u001eJ\u0010\u0010-\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b-\u0010&J\u0010\u0010.\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b.\u0010&J¸\u0001\u00101\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\f2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00132\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u001a\u001a\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00102\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b2\u0010\u001eJ\u0010\u00103\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b3\u00104J\u001a\u00106\u001a\u00020\f2\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b6\u00107J'\u0010@\u001a\u00020=2\u0006\u00108\u001a\u00020\u00002\u0006\u0010:\u001a\u0002092\u0006\u0010<\u001a\u00020;H\u0001¢\u0006\u0004\b>\u0010?R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010A\u001a\u0004\bB\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010A\u001a\u0004\bC\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010A\u001a\u0004\bD\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010A\u001a\u0004\bE\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010A\u001a\u0004\bF\u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010A\u001a\u0004\bG\u0010\u001eR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010A\u001a\u0004\bH\u0010\u001eR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010I\u001a\u0004\bJ\u0010&R \u0010\u0012\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010I\u0012\u0004\bL\u0010M\u001a\u0004\bK\u0010&R&\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010N\u0012\u0004\bP\u0010M\u001a\u0004\bO\u0010)R&\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00138\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010N\u0012\u0004\bR\u0010M\u001a\u0004\bQ\u0010)R\"\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010A\u0012\u0004\bT\u0010M\u001a\u0004\bS\u0010\u001eR \u0010\u001a\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010I\u0012\u0004\bV\u0010M\u001a\u0004\bU\u0010&R \u0010\u001b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010I\u0012\u0004\bX\u0010M\u001a\u0004\bW\u0010&¨\u0006\\"}, d2 = {"Lcom/anthropic/claude/code/remote/NewCodeSessionPrefill;", "", "", "seen0", "", "prompt", "mode", "repo", "branch", "model", "appendSystemPrompt", "rawSourceRepoUrl", "", "oneTapStart", "Lvnf;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLvnf;)V", "sheetAutoSend", "", "Lo32;", "attachments", "Llhf;", "repoSelection", "Lcom/anthropic/claude/types/strings/CodeAgentId;", "agentId", "modeWasDefaulted", "modeWasUserPicked", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/List;Ljava/util/List;Ljava/lang/String;ZZLmq5;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "()Z", "component9", "component10", "()Ljava/util/List;", "component11", "component12-kU3PmtI", "component12", "component13", "component14", "copy-KmOdy8M", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/List;Ljava/util/List;Ljava/lang/String;ZZ)Lcom/anthropic/claude/code/remote/NewCodeSessionPrefill;", "copy", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$remote", "(Lcom/anthropic/claude/code/remote/NewCodeSessionPrefill;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getPrompt", "getMode", "getRepo", "getBranch", "getModel", "getAppendSystemPrompt", "getRawSourceRepoUrl", "Z", "getOneTapStart", "getSheetAutoSend", "getSheetAutoSend$annotations", "()V", "Ljava/util/List;", "getAttachments", "getAttachments$annotations", "getRepoSelection", "getRepoSelection$annotations", "getAgentId-kU3PmtI", "getAgentId-kU3PmtI$annotations", "getModeWasDefaulted", "getModeWasDefaulted$annotations", "getModeWasUserPicked", "getModeWasUserPicked$annotations", "Companion", "o2c", "p2c", "remote"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class NewCodeSessionPrefill {
    public static final int $stable = 0;
    public static final p2c Companion = new p2c();
    private final String agentId;
    private final String appendSystemPrompt;
    private final List<o32> attachments;
    private final String branch;
    private final String mode;
    private final boolean modeWasDefaulted;
    private final boolean modeWasUserPicked;
    private final String model;
    private final boolean oneTapStart;
    private final String prompt;
    private final String rawSourceRepoUrl;
    private final String repo;
    private final List<lhf> repoSelection;
    private final boolean sheetAutoSend;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ NewCodeSessionPrefill(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, boolean z2, List list, List list2, String str8, boolean z3, boolean z4, int i, mq5 mq5Var) {
        String str9 = (i & 1) != 0 ? null : str;
        String str10 = (i & 2) != 0 ? null : str2;
        String str11 = (i & 4) != 0 ? null : str3;
        String str12 = (i & 8) != 0 ? null : str4;
        String str13 = (i & 16) != 0 ? null : str5;
        String str14 = (i & 32) != 0 ? null : str6;
        String str15 = (i & 64) != 0 ? null : str7;
        boolean z5 = (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? false : z;
        boolean z6 = (i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? false : z2;
        int i2 = i & 512;
        List list3 = lm6.E;
        this(str9, str10, str11, str12, str13, str14, str15, z5, z6, i2 != 0 ? list3 : list, (i & FreeTypeConstants.FT_LOAD_NO_RECURSE) == 0 ? list2 : list3, (i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) == 0 ? str8 : null, (i & FreeTypeConstants.FT_LOAD_MONOCHROME) != 0 ? false : z3, (i & FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) == 0 ? z4 : false, null);
    }

    /* JADX INFO: renamed from: getAgentId-kU3PmtI$annotations, reason: not valid java name */
    public static /* synthetic */ void m706getAgentIdkU3PmtI$annotations() {
    }

    public static /* synthetic */ void getAttachments$annotations() {
    }

    public static /* synthetic */ void getModeWasDefaulted$annotations() {
    }

    public static /* synthetic */ void getModeWasUserPicked$annotations() {
    }

    public static /* synthetic */ void getRepoSelection$annotations() {
    }

    public static /* synthetic */ void getSheetAutoSend$annotations() {
    }

    public static final /* synthetic */ void write$Self$remote(NewCodeSessionPrefill self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.prompt != null) {
            output.B(serialDesc, 0, srg.a, self.prompt);
        }
        if (output.E(serialDesc) || self.mode != null) {
            output.B(serialDesc, 1, srg.a, self.mode);
        }
        if (output.E(serialDesc) || self.repo != null) {
            output.B(serialDesc, 2, srg.a, self.repo);
        }
        if (output.E(serialDesc) || self.branch != null) {
            output.B(serialDesc, 3, srg.a, self.branch);
        }
        if (output.E(serialDesc) || self.model != null) {
            output.B(serialDesc, 4, srg.a, self.model);
        }
        if (output.E(serialDesc) || self.appendSystemPrompt != null) {
            output.B(serialDesc, 5, srg.a, self.appendSystemPrompt);
        }
        if (output.E(serialDesc) || self.rawSourceRepoUrl != null) {
            output.B(serialDesc, 6, srg.a, self.rawSourceRepoUrl);
        }
        if (output.E(serialDesc) || self.oneTapStart) {
            output.p(serialDesc, 7, self.oneTapStart);
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPrompt() {
        return this.prompt;
    }

    public final List<o32> component10() {
        return this.attachments;
    }

    public final List<lhf> component11() {
        return this.repoSelection;
    }

    /* JADX INFO: renamed from: component12-kU3PmtI, reason: not valid java name and from getter */
    public final String getAgentId() {
        return this.agentId;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getModeWasDefaulted() {
        return this.modeWasDefaulted;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final boolean getModeWasUserPicked() {
        return this.modeWasUserPicked;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMode() {
        return this.mode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRepo() {
        return this.repo;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBranch() {
        return this.branch;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAppendSystemPrompt() {
        return this.appendSystemPrompt;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getRawSourceRepoUrl() {
        return this.rawSourceRepoUrl;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getOneTapStart() {
        return this.oneTapStart;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getSheetAutoSend() {
        return this.sheetAutoSend;
    }

    /* JADX INFO: renamed from: copy-KmOdy8M, reason: not valid java name */
    public final NewCodeSessionPrefill m708copyKmOdy8M(String prompt, String mode, String repo, String branch, String model, String appendSystemPrompt, String rawSourceRepoUrl, boolean oneTapStart, boolean sheetAutoSend, List<o32> attachments, List<lhf> repoSelection, String agentId, boolean modeWasDefaulted, boolean modeWasUserPicked) {
        attachments.getClass();
        repoSelection.getClass();
        return new NewCodeSessionPrefill(prompt, mode, repo, branch, model, appendSystemPrompt, rawSourceRepoUrl, oneTapStart, sheetAutoSend, attachments, repoSelection, agentId, modeWasDefaulted, modeWasUserPicked, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.anthropic.claude.code.remote.NewCodeSessionPrefill
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.anthropic.claude.code.remote.NewCodeSessionPrefill r5 = (com.anthropic.claude.code.remote.NewCodeSessionPrefill) r5
            java.lang.String r1 = r4.prompt
            java.lang.String r3 = r5.prompt
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.mode
            java.lang.String r3 = r5.mode
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r4.repo
            java.lang.String r3 = r5.repo
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.String r1 = r4.branch
            java.lang.String r3 = r5.branch
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            java.lang.String r1 = r4.model
            java.lang.String r3 = r5.model
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L43
            return r2
        L43:
            java.lang.String r1 = r4.appendSystemPrompt
            java.lang.String r3 = r5.appendSystemPrompt
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L4e
            return r2
        L4e:
            java.lang.String r1 = r4.rawSourceRepoUrl
            java.lang.String r3 = r5.rawSourceRepoUrl
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L59
            return r2
        L59:
            boolean r1 = r4.oneTapStart
            boolean r3 = r5.oneTapStart
            if (r1 == r3) goto L60
            return r2
        L60:
            boolean r1 = r4.sheetAutoSend
            boolean r3 = r5.sheetAutoSend
            if (r1 == r3) goto L67
            return r2
        L67:
            java.util.List<o32> r1 = r4.attachments
            java.util.List<o32> r3 = r5.attachments
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L72
            return r2
        L72:
            java.util.List<lhf> r1 = r4.repoSelection
            java.util.List<lhf> r3 = r5.repoSelection
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L7d
            return r2
        L7d:
            java.lang.String r1 = r4.agentId
            java.lang.String r3 = r5.agentId
            if (r1 != 0) goto L89
            if (r3 != 0) goto L87
            r1 = r0
            goto L90
        L87:
            r1 = r2
            goto L90
        L89:
            if (r3 != 0) goto L8c
            goto L87
        L8c:
            boolean r1 = com.anthropic.claude.types.strings.CodeAgentId.m995equalsimpl0(r1, r3)
        L90:
            if (r1 != 0) goto L93
            return r2
        L93:
            boolean r1 = r4.modeWasDefaulted
            boolean r3 = r5.modeWasDefaulted
            if (r1 == r3) goto L9a
            return r2
        L9a:
            boolean r4 = r4.modeWasUserPicked
            boolean r5 = r5.modeWasUserPicked
            if (r4 == r5) goto La1
            return r2
        La1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.code.remote.NewCodeSessionPrefill.equals(java.lang.Object):boolean");
    }

    /* JADX INFO: renamed from: getAgentId-kU3PmtI, reason: not valid java name */
    public final String m709getAgentIdkU3PmtI() {
        return this.agentId;
    }

    public final String getAppendSystemPrompt() {
        return this.appendSystemPrompt;
    }

    public final List<o32> getAttachments() {
        return this.attachments;
    }

    public final String getBranch() {
        return this.branch;
    }

    public final String getMode() {
        return this.mode;
    }

    public final boolean getModeWasDefaulted() {
        return this.modeWasDefaulted;
    }

    public final boolean getModeWasUserPicked() {
        return this.modeWasUserPicked;
    }

    public final String getModel() {
        return this.model;
    }

    public final boolean getOneTapStart() {
        return this.oneTapStart;
    }

    public final String getPrompt() {
        return this.prompt;
    }

    public final String getRawSourceRepoUrl() {
        return this.rawSourceRepoUrl;
    }

    public final String getRepo() {
        return this.repo;
    }

    public final List<lhf> getRepoSelection() {
        return this.repoSelection;
    }

    public final boolean getSheetAutoSend() {
        return this.sheetAutoSend;
    }

    public int hashCode() {
        String str = this.prompt;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.mode;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.repo;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.branch;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.model;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.appendSystemPrompt;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.rawSourceRepoUrl;
        int iM = kgh.m(kgh.m(fsh.p(fsh.p((iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31, 31, this.oneTapStart), 31, this.sheetAutoSend), 31, this.attachments), 31, this.repoSelection);
        String str8 = this.agentId;
        return Boolean.hashCode(this.modeWasUserPicked) + fsh.p((iM + (str8 != null ? CodeAgentId.m996hashCodeimpl(str8) : 0)) * 31, 31, this.modeWasDefaulted);
    }

    public String toString() {
        String str = this.prompt;
        String str2 = this.mode;
        String str3 = this.repo;
        String str4 = this.branch;
        String str5 = this.model;
        String str6 = this.appendSystemPrompt;
        String str7 = this.rawSourceRepoUrl;
        boolean z = this.oneTapStart;
        boolean z2 = this.sheetAutoSend;
        List<o32> list = this.attachments;
        List<lhf> list2 = this.repoSelection;
        String str8 = this.agentId;
        String strM997toStringimpl = str8 == null ? "null" : CodeAgentId.m997toStringimpl(str8);
        boolean z3 = this.modeWasDefaulted;
        boolean z4 = this.modeWasUserPicked;
        StringBuilder sbR = kgh.r("NewCodeSessionPrefill(prompt=", str, ", mode=", str2, ", repo=");
        kgh.u(sbR, str3, ", branch=", str4, ", model=");
        kgh.u(sbR, str5, ", appendSystemPrompt=", str6, ", rawSourceRepoUrl=");
        gid.t(sbR, str7, ", oneTapStart=", z, ", sheetAutoSend=");
        sbR.append(z2);
        sbR.append(", attachments=");
        sbR.append(list);
        sbR.append(", repoSelection=");
        ms6.x(", agentId=", strM997toStringimpl, ", modeWasDefaulted=", sbR, list2);
        sbR.append(z3);
        sbR.append(", modeWasUserPicked=");
        sbR.append(z4);
        sbR.append(")");
        return sbR.toString();
    }

    public /* synthetic */ NewCodeSessionPrefill(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.prompt = null;
        } else {
            this.prompt = str;
        }
        if ((i & 2) == 0) {
            this.mode = null;
        } else {
            this.mode = str2;
        }
        if ((i & 4) == 0) {
            this.repo = null;
        } else {
            this.repo = str3;
        }
        if ((i & 8) == 0) {
            this.branch = null;
        } else {
            this.branch = str4;
        }
        if ((i & 16) == 0) {
            this.model = null;
        } else {
            this.model = str5;
        }
        if ((i & 32) == 0) {
            this.appendSystemPrompt = null;
        } else {
            this.appendSystemPrompt = str6;
        }
        if ((i & 64) == 0) {
            this.rawSourceRepoUrl = null;
        } else {
            this.rawSourceRepoUrl = str7;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) == 0) {
            this.oneTapStart = false;
        } else {
            this.oneTapStart = z;
        }
        this.sheetAutoSend = false;
        lm6 lm6Var = lm6.E;
        this.attachments = lm6Var;
        this.repoSelection = lm6Var;
        this.agentId = null;
        this.modeWasDefaulted = false;
        this.modeWasUserPicked = false;
    }

    private NewCodeSessionPrefill(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, boolean z2, List<o32> list, List<lhf> list2, String str8, boolean z3, boolean z4) {
        list.getClass();
        list2.getClass();
        this.prompt = str;
        this.mode = str2;
        this.repo = str3;
        this.branch = str4;
        this.model = str5;
        this.appendSystemPrompt = str6;
        this.rawSourceRepoUrl = str7;
        this.oneTapStart = z;
        this.sheetAutoSend = z2;
        this.attachments = list;
        this.repoSelection = list2;
        this.agentId = str8;
        this.modeWasDefaulted = z3;
        this.modeWasUserPicked = z4;
    }

    public /* synthetic */ NewCodeSessionPrefill(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, boolean z2, List list, List list2, String str8, boolean z3, boolean z4, mq5 mq5Var) {
        this(str, str2, str3, str4, str5, str6, str7, z, z2, list, list2, str8, z3, z4);
    }
}
