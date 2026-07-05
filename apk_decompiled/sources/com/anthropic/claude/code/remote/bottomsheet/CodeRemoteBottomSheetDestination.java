package com.anthropic.claude.code.remote.bottomsheet;

import com.anthropic.claude.core.logging.EmptyDestination;
import com.anthropic.claude.sessions.types.PermissionMode;
import defpackage.bga;
import defpackage.c44;
import defpackage.cc;
import defpackage.fk;
import defpackage.g44;
import defpackage.grc;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.m29;
import defpackage.mdj;
import defpackage.rvh;
import defpackage.x44;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u001d\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u0082\u0001\u001d\u001f !\"#$%&'()*+,-./0123456789:;¨\u0006<À\u0006\u0003"}, d2 = {"Lcom/anthropic/claude/code/remote/bottomsheet/CodeRemoteBottomSheetDestination;", "Lbga;", "Closed", "RepositorySelection", "EnvironmentSelection", "PairedActiveSessions", "PermissionModeSelection", "ToolCallDetail", "CollapsedToolCalls", "InitChecklist", "RenameCodeRemote", "AttachmentOptions", "AddContext", "Connectors", "ConnectorDirectory", "ModelSelection", "ShareSession", "BranchSelection", "ConnectGitHub", "DiffView", "ViewCode", "ChannelMessage", "ChannelEvents", "ViewThinking", "AttachmentText", "AttachmentVideo", "PlanView", "ApprovalDiffDetail", "PRAutofix", "SessionPullRequests", "WorkflowDetail", "Lcom/anthropic/claude/code/remote/bottomsheet/CodeRemoteBottomSheetDestination$AddContext;", "Lcom/anthropic/claude/code/remote/bottomsheet/CodeRemoteBottomSheetDestination$ApprovalDiffDetail;", "Lcom/anthropic/claude/code/remote/bottomsheet/CodeRemoteBottomSheetDestination$AttachmentOptions;", "Lcom/anthropic/claude/code/remote/bottomsheet/CodeRemoteBottomSheetDestination$AttachmentText;", "Lcom/anthropic/claude/code/remote/bottomsheet/CodeRemoteBottomSheetDestination$AttachmentVideo;", "Lcom/anthropic/claude/code/remote/bottomsheet/CodeRemoteBottomSheetDestination$BranchSelection;", "Lcom/anthropic/claude/code/remote/bottomsheet/CodeRemoteBottomSheetDestination$ChannelEvents;", "Lcom/anthropic/claude/code/remote/bottomsheet/CodeRemoteBottomSheetDestination$ChannelMessage;", "Lcom/anthropic/claude/code/remote/bottomsheet/CodeRemoteBottomSheetDestination$Closed;", "Lcom/anthropic/claude/code/remote/bottomsheet/CodeRemoteBottomSheetDestination$CollapsedToolCalls;", "Lcom/anthropic/claude/code/remote/bottomsheet/CodeRemoteBottomSheetDestination$ConnectGitHub;", "Lcom/anthropic/claude/code/remote/bottomsheet/CodeRemoteBottomSheetDestination$ConnectorDirectory;", "Lcom/anthropic/claude/code/remote/bottomsheet/CodeRemoteBottomSheetDestination$Connectors;", "Lcom/anthropic/claude/code/remote/bottomsheet/CodeRemoteBottomSheetDestination$DiffView;", "Lcom/anthropic/claude/code/remote/bottomsheet/CodeRemoteBottomSheetDestination$EnvironmentSelection;", "Lcom/anthropic/claude/code/remote/bottomsheet/CodeRemoteBottomSheetDestination$InitChecklist;", "Lcom/anthropic/claude/code/remote/bottomsheet/CodeRemoteBottomSheetDestination$ModelSelection;", "Lcom/anthropic/claude/code/remote/bottomsheet/CodeRemoteBottomSheetDestination$PRAutofix;", "Lcom/anthropic/claude/code/remote/bottomsheet/CodeRemoteBottomSheetDestination$PairedActiveSessions;", "Lcom/anthropic/claude/code/remote/bottomsheet/CodeRemoteBottomSheetDestination$PermissionModeSelection;", "Lcom/anthropic/claude/code/remote/bottomsheet/CodeRemoteBottomSheetDestination$PlanView;", "Lcom/anthropic/claude/code/remote/bottomsheet/CodeRemoteBottomSheetDestination$RenameCodeRemote;", "Lcom/anthropic/claude/code/remote/bottomsheet/CodeRemoteBottomSheetDestination$RepositorySelection;", "Lcom/anthropic/claude/code/remote/bottomsheet/CodeRemoteBottomSheetDestination$SessionPullRequests;", "Lcom/anthropic/claude/code/remote/bottomsheet/CodeRemoteBottomSheetDestination$ShareSession;", "Lcom/anthropic/claude/code/remote/bottomsheet/CodeRemoteBottomSheetDestination$ToolCallDetail;", "Lcom/anthropic/claude/code/remote/bottomsheet/CodeRemoteBottomSheetDestination$ViewCode;", "Lcom/anthropic/claude/code/remote/bottomsheet/CodeRemoteBottomSheetDestination$ViewThinking;", "Lcom/anthropic/claude/code/remote/bottomsheet/CodeRemoteBottomSheetDestination$WorkflowDetail;", "remote"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
public interface CodeRemoteBottomSheetDestination extends bga {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/anthropic/claude/code/remote/bottomsheet/CodeRemoteBottomSheetDestination$AddContext;", "Lcom/anthropic/claude/code/remote/bottomsheet/CodeRemoteBottomSheetDestination;", "remote"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    public static final /* data */ class AddContext implements CodeRemoteBottomSheetDestination {
        public static final AddContext a = new AddContext();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AddContext);
        }

        public final int hashCode() {
            return 922302925;
        }

        public final String toString() {
            return "AddContext";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/anthropic/claude/code/remote/bottomsheet/CodeRemoteBottomSheetDestination$ApprovalDiffDetail;", "Lcom/anthropic/claude/code/remote/bottomsheet/CodeRemoteBottomSheetDestination;", "remote"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    public static final /* data */ class ApprovalDiffDetail implements CodeRemoteBottomSheetDestination {
        public final String a;
        public final String b;
        public final String c;

        public ApprovalDiffDetail(String str, String str2, String str3) {
            grc.B(str, str2, str3);
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ApprovalDiffDetail)) {
                return false;
            }
            ApprovalDiffDetail approvalDiffDetail = (ApprovalDiffDetail) obj;
            return x44.r(this.a, approvalDiffDetail.a) && x44.r(this.b, approvalDiffDetail.b) && x44.r(this.c, approvalDiffDetail.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + kgh.l(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return ij0.m(kgh.r("ApprovalDiffDetail(filePath=", this.a, ", oldString=", this.b, ", newString="), this.c, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/anthropic/claude/code/remote/bottomsheet/CodeRemoteBottomSheetDestination$AttachmentOptions;", "Lcom/anthropic/claude/code/remote/bottomsheet/CodeRemoteBottomSheetDestination;", "remote"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    public static final /* data */ class AttachmentOptions implements CodeRemoteBottomSheetDestination {
        public static final AttachmentOptions a = new AttachmentOptions();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AttachmentOptions);
        }

        public final int hashCode() {
            return 260796188;
        }

        public final String toString() {
            return "AttachmentOptions";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/anthropic/claude/code/remote/bottomsheet/CodeRemoteBottomSheetDestination$AttachmentText;", "Lcom/anthropic/claude/code/remote/bottomsheet/CodeRemoteBottomSheetDestination;", "remote"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    public static final /* data */ class AttachmentText implements CodeRemoteBottomSheetDestination {
        public final fk a;

        public AttachmentText(fk fkVar) {
            fkVar.getClass();
            this.a = fkVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AttachmentText) && x44.r(this.a, ((AttachmentText) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "AttachmentText(attachment=" + this.a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/anthropic/claude/code/remote/bottomsheet/CodeRemoteBottomSheetDestination$AttachmentVideo;", "Lcom/anthropic/claude/code/remote/bottomsheet/CodeRemoteBottomSheetDestination;", "remote"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    public static final /* data */ class AttachmentVideo implements CodeRemoteBottomSheetDestination {
        public final fk a;

        public AttachmentVideo(fk fkVar) {
            fkVar.getClass();
            this.a = fkVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AttachmentVideo) && x44.r(this.a, ((AttachmentVideo) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "AttachmentVideo(attachment=" + this.a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/anthropic/claude/code/remote/bottomsheet/CodeRemoteBottomSheetDestination$BranchSelection;", "Lcom/anthropic/claude/code/remote/bottomsheet/CodeRemoteBottomSheetDestination;", "remote"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    public static final /* data */ class BranchSelection implements CodeRemoteBottomSheetDestination {
        public static final BranchSelection a = new BranchSelection();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BranchSelection);
        }

        public final int hashCode() {
            return -1308582549;
        }

        public final String toString() {
            return "BranchSelection";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/anthropic/claude/code/remote/bottomsheet/CodeRemoteBottomSheetDestination$ChannelEvents;", "Lcom/anthropic/claude/code/remote/bottomsheet/CodeRemoteBottomSheetDestination;", "remote"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    public static final /* data */ class ChannelEvents implements CodeRemoteBottomSheetDestination {
        public final c44 a;

        public ChannelEvents(c44 c44Var) {
            c44Var.getClass();
            this.a = c44Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ChannelEvents) && x44.r(this.a, ((ChannelEvents) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ChannelEvents(group=" + this.a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/anthropic/claude/code/remote/bottomsheet/CodeRemoteBottomSheetDestination$ChannelMessage;", "Lcom/anthropic/claude/code/remote/bottomsheet/CodeRemoteBottomSheetDestination;", "remote"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    public static final /* data */ class ChannelMessage implements CodeRemoteBottomSheetDestination {
        public final String a;
        public final String b;

        public ChannelMessage(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ChannelMessage)) {
                return false;
            }
            ChannelMessage channelMessage = (ChannelMessage) obj;
            return x44.r(this.a, channelMessage.a) && x44.r(this.b, channelMessage.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return ij0.l("ChannelMessage(label=", this.a, ", payload=", this.b, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/anthropic/claude/code/remote/bottomsheet/CodeRemoteBottomSheetDestination$Closed;", "Lcom/anthropic/claude/code/remote/bottomsheet/CodeRemoteBottomSheetDestination;", "Lcom/anthropic/claude/core/logging/EmptyDestination;", "remote"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    public static final /* data */ class Closed implements CodeRemoteBottomSheetDestination, EmptyDestination {
        public static final Closed a = new Closed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Closed);
        }

        public final int hashCode() {
            return -1097440021;
        }

        public final String toString() {
            return "Closed";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/anthropic/claude/code/remote/bottomsheet/CodeRemoteBottomSheetDestination$CollapsedToolCalls;", "Lcom/anthropic/claude/code/remote/bottomsheet/CodeRemoteBottomSheetDestination;", "remote"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    public static final /* data */ class CollapsedToolCalls implements CodeRemoteBottomSheetDestination {
        public final g44 a;

        public CollapsedToolCalls(g44 g44Var) {
            g44Var.getClass();
            this.a = g44Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CollapsedToolCalls) && x44.r(this.a, ((CollapsedToolCalls) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "CollapsedToolCalls(group=" + this.a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/anthropic/claude/code/remote/bottomsheet/CodeRemoteBottomSheetDestination$ConnectGitHub;", "Lcom/anthropic/claude/code/remote/bottomsheet/CodeRemoteBottomSheetDestination;", "remote"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    public static final /* data */ class ConnectGitHub implements CodeRemoteBottomSheetDestination {
        public static final ConnectGitHub a = new ConnectGitHub();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ConnectGitHub);
        }

        public final int hashCode() {
            return -365063954;
        }

        public final String toString() {
            return "ConnectGitHub";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/anthropic/claude/code/remote/bottomsheet/CodeRemoteBottomSheetDestination$ConnectorDirectory;", "Lcom/anthropic/claude/code/remote/bottomsheet/CodeRemoteBottomSheetDestination;", "remote"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    public static final /* data */ class ConnectorDirectory implements CodeRemoteBottomSheetDestination {
        public static final ConnectorDirectory a = new ConnectorDirectory();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ConnectorDirectory);
        }

        public final int hashCode() {
            return 561384863;
        }

        public final String toString() {
            return "ConnectorDirectory";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/anthropic/claude/code/remote/bottomsheet/CodeRemoteBottomSheetDestination$Connectors;", "Lcom/anthropic/claude/code/remote/bottomsheet/CodeRemoteBottomSheetDestination;", "remote"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    public static final /* data */ class Connectors implements CodeRemoteBottomSheetDestination {
        public static final Connectors a = new Connectors();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Connectors);
        }

        public final int hashCode() {
            return 1581859269;
        }

        public final String toString() {
            return "Connectors";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/anthropic/claude/code/remote/bottomsheet/CodeRemoteBottomSheetDestination$DiffView;", "Lcom/anthropic/claude/code/remote/bottomsheet/CodeRemoteBottomSheetDestination;", "remote"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    public static final /* data */ class DiffView implements CodeRemoteBottomSheetDestination {
        public static final DiffView a = new DiffView();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DiffView);
        }

        public final int hashCode() {
            return 732286985;
        }

        public final String toString() {
            return "DiffView";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/anthropic/claude/code/remote/bottomsheet/CodeRemoteBottomSheetDestination$EnvironmentSelection;", "Lcom/anthropic/claude/code/remote/bottomsheet/CodeRemoteBottomSheetDestination;", "remote"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    public static final /* data */ class EnvironmentSelection implements CodeRemoteBottomSheetDestination {
        public static final EnvironmentSelection a = new EnvironmentSelection();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof EnvironmentSelection);
        }

        public final int hashCode() {
            return 128843256;
        }

        public final String toString() {
            return "EnvironmentSelection";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/anthropic/claude/code/remote/bottomsheet/CodeRemoteBottomSheetDestination$InitChecklist;", "Lcom/anthropic/claude/code/remote/bottomsheet/CodeRemoteBottomSheetDestination;", "remote"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    public static final /* data */ class InitChecklist implements CodeRemoteBottomSheetDestination {
        public final m29 a;
        public final boolean b;

        public InitChecklist(m29 m29Var, boolean z) {
            m29Var.getClass();
            this.a = m29Var;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InitChecklist)) {
                return false;
            }
            InitChecklist initChecklist = (InitChecklist) obj;
            return x44.r(this.a, initChecklist.a) && this.b == initChecklist.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "InitChecklist(state=" + this.a + ", isCoworkRemote=" + this.b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/anthropic/claude/code/remote/bottomsheet/CodeRemoteBottomSheetDestination$ModelSelection;", "Lcom/anthropic/claude/code/remote/bottomsheet/CodeRemoteBottomSheetDestination;", "remote"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    public static final /* data */ class ModelSelection implements CodeRemoteBottomSheetDestination {
        public static final ModelSelection a = new ModelSelection();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ModelSelection);
        }

        public final int hashCode() {
            return -1740330782;
        }

        public final String toString() {
            return "ModelSelection";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/anthropic/claude/code/remote/bottomsheet/CodeRemoteBottomSheetDestination$PRAutofix;", "Lcom/anthropic/claude/code/remote/bottomsheet/CodeRemoteBottomSheetDestination;", "remote"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    public static final /* data */ class PRAutofix implements CodeRemoteBottomSheetDestination {
        public static final PRAutofix a = new PRAutofix();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PRAutofix);
        }

        public final int hashCode() {
            return 1560935397;
        }

        public final String toString() {
            return "PRAutofix";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/anthropic/claude/code/remote/bottomsheet/CodeRemoteBottomSheetDestination$PairedActiveSessions;", "Lcom/anthropic/claude/code/remote/bottomsheet/CodeRemoteBottomSheetDestination;", "remote"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    public static final /* data */ class PairedActiveSessions implements CodeRemoteBottomSheetDestination {
        public final String a;

        public PairedActiveSessions(String str) {
            str.getClass();
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PairedActiveSessions) && x44.r(this.a, ((PairedActiveSessions) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ij0.j("PairedActiveSessions(environmentId=", this.a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/anthropic/claude/code/remote/bottomsheet/CodeRemoteBottomSheetDestination$PermissionModeSelection;", "Lcom/anthropic/claude/code/remote/bottomsheet/CodeRemoteBottomSheetDestination;", "remote"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    public static final /* data */ class PermissionModeSelection implements CodeRemoteBottomSheetDestination {
        public final PermissionMode a;

        public PermissionModeSelection(PermissionMode permissionMode) {
            permissionMode.getClass();
            this.a = permissionMode;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PermissionModeSelection) && this.a == ((PermissionModeSelection) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "PermissionModeSelection(currentMode=" + this.a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/anthropic/claude/code/remote/bottomsheet/CodeRemoteBottomSheetDestination$PlanView;", "Lcom/anthropic/claude/code/remote/bottomsheet/CodeRemoteBottomSheetDestination;", "remote"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    public static final /* data */ class PlanView implements CodeRemoteBottomSheetDestination {
        public static final PlanView a = new PlanView();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PlanView);
        }

        public final int hashCode() {
            return -1597039315;
        }

        public final String toString() {
            return "PlanView";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/anthropic/claude/code/remote/bottomsheet/CodeRemoteBottomSheetDestination$RenameCodeRemote;", "Lcom/anthropic/claude/code/remote/bottomsheet/CodeRemoteBottomSheetDestination;", "remote"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    public static final /* data */ class RenameCodeRemote implements CodeRemoteBottomSheetDestination {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/anthropic/claude/code/remote/bottomsheet/CodeRemoteBottomSheetDestination$RepositorySelection;", "Lcom/anthropic/claude/code/remote/bottomsheet/CodeRemoteBottomSheetDestination;", "remote"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    public static final /* data */ class RepositorySelection implements CodeRemoteBottomSheetDestination {
        public static final RepositorySelection a = new RepositorySelection();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RepositorySelection);
        }

        public final int hashCode() {
            return 676867139;
        }

        public final String toString() {
            return "RepositorySelection";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/anthropic/claude/code/remote/bottomsheet/CodeRemoteBottomSheetDestination$SessionPullRequests;", "Lcom/anthropic/claude/code/remote/bottomsheet/CodeRemoteBottomSheetDestination;", "remote"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    public static final /* data */ class SessionPullRequests implements CodeRemoteBottomSheetDestination {
        public static final SessionPullRequests a = new SessionPullRequests();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SessionPullRequests);
        }

        public final int hashCode() {
            return 1885627840;
        }

        public final String toString() {
            return "SessionPullRequests";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/anthropic/claude/code/remote/bottomsheet/CodeRemoteBottomSheetDestination$ShareSession;", "Lcom/anthropic/claude/code/remote/bottomsheet/CodeRemoteBottomSheetDestination;", "remote"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    public static final /* data */ class ShareSession implements CodeRemoteBottomSheetDestination {
        public static final ShareSession a = new ShareSession();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ShareSession);
        }

        public final int hashCode() {
            return -613635594;
        }

        public final String toString() {
            return "ShareSession";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/anthropic/claude/code/remote/bottomsheet/CodeRemoteBottomSheetDestination$ToolCallDetail;", "Lcom/anthropic/claude/code/remote/bottomsheet/CodeRemoteBottomSheetDestination;", "remote"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    public static final /* data */ class ToolCallDetail implements CodeRemoteBottomSheetDestination {
        public final rvh a;

        public ToolCallDetail(rvh rvhVar) {
            rvhVar.getClass();
            this.a = rvhVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ToolCallDetail) && x44.r(this.a, ((ToolCallDetail) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ToolCallDetail(toolCall=" + this.a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/anthropic/claude/code/remote/bottomsheet/CodeRemoteBottomSheetDestination$ViewCode;", "Lcom/anthropic/claude/code/remote/bottomsheet/CodeRemoteBottomSheetDestination;", "remote"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    public static final /* data */ class ViewCode implements CodeRemoteBottomSheetDestination {
        public final String a;
        public final String b;

        public ViewCode(String str, String str2) {
            str.getClass();
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewCode)) {
                return false;
            }
            ViewCode viewCode = (ViewCode) obj;
            return x44.r(this.a, viewCode.a) && x44.r(this.b, viewCode.b);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return ij0.l("ViewCode(code=", this.a, ", language=", this.b, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/anthropic/claude/code/remote/bottomsheet/CodeRemoteBottomSheetDestination$ViewThinking;", "Lcom/anthropic/claude/code/remote/bottomsheet/CodeRemoteBottomSheetDestination;", "remote"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    public static final /* data */ class ViewThinking implements CodeRemoteBottomSheetDestination {
        public final String a;

        public ViewThinking(String str) {
            str.getClass();
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ViewThinking) && x44.r(this.a, ((ViewThinking) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ij0.j("ViewThinking(text=", this.a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/anthropic/claude/code/remote/bottomsheet/CodeRemoteBottomSheetDestination$WorkflowDetail;", "Lcom/anthropic/claude/code/remote/bottomsheet/CodeRemoteBottomSheetDestination;", "remote"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    public static final /* data */ class WorkflowDetail implements CodeRemoteBottomSheetDestination {
        public final String a;

        public WorkflowDetail(String str) {
            str.getClass();
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof WorkflowDetail) && x44.r(this.a, ((WorkflowDetail) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ij0.j("WorkflowDetail(taskId=", this.a, ")");
        }
    }

    @Override // defpackage.bga
    default cc getActiveSurface() {
        return cc.Code;
    }
}
