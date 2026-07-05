package com.anthropic.claude.app;

import com.anthropic.claude.chat.ChatScreenParams;
import com.anthropic.claude.code.remote.CodeRemoteSessionScreenParams;
import com.anthropic.claude.project.create.CreateTemplateProjectScreenParams;
import com.anthropic.claude.project.create.UploadMaterialsScreenParams;
import com.anthropic.claude.project.details.ProjectDetailsScreenParams;
import com.anthropic.claude.project.knowledge.ProjectKnowledgeScreenParams;
import com.anthropic.claude.types.strings.SessionGroupingId;
import defpackage.bga;
import defpackage.cc;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.kw9;
import defpackage.lq6;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.w53;
import defpackage.x44;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bq\u0018\u0000 \u00072\u00020\u0001:\u0004\b\t\n\u000bR\u0014\u0010\u0003\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0004\u0082\u0001\u0003\f\r\u000e¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lcom/anthropic/claude/app/ClaudeAppDestination;", "Lbga;", "", "isRootScreen", "()Z", "getRequiresChat", "requiresChat", "Companion", "List", "Detail", "Extra", "com/anthropic/claude/app/a", "Lcom/anthropic/claude/app/ClaudeAppDestination$Detail;", "Lcom/anthropic/claude/app/ClaudeAppDestination$Extra;", "Lcom/anthropic/claude/app/ClaudeAppDestination$List;", "app"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public interface ClaudeAppDestination extends bga {
    public static final a Companion = a.a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bw\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lcom/anthropic/claude/app/ClaudeAppDestination$Extra;", "Lcom/anthropic/claude/app/ClaudeAppDestination;", "Companion", "com/anthropic/claude/app/o", "app"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public interface Extra extends ClaudeAppDestination {
        public static final o Companion = o.a;

        @Override // com.anthropic.claude.app.ClaudeAppDestination, defpackage.bga
        /* synthetic */ cc getActiveSurface();
    }

    @Override // defpackage.bga
    /* synthetic */ cc getActiveSurface();

    default boolean getRequiresChat() {
        return false;
    }

    default boolean isRootScreen() {
        return false;
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcom/anthropic/claude/app/ClaudeAppDestination$Detail;", "Lcom/anthropic/claude/app/ClaudeAppDestination;", "Companion", "Chat", "ProjectKnowledge", "ProjectDetails", "CreateTemplateProject", "TemplateUploadMaterialScreen", "CodeRemoteSession", "com/anthropic/claude/app/f", "Lcom/anthropic/claude/app/ClaudeAppDestination$Detail$Chat;", "Lcom/anthropic/claude/app/ClaudeAppDestination$Detail$CodeRemoteSession;", "Lcom/anthropic/claude/app/ClaudeAppDestination$Detail$CreateTemplateProject;", "Lcom/anthropic/claude/app/ClaudeAppDestination$Detail$ProjectDetails;", "Lcom/anthropic/claude/app/ClaudeAppDestination$Detail$ProjectKnowledge;", "Lcom/anthropic/claude/app/ClaudeAppDestination$Detail$TemplateUploadMaterialScreen;", "app"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public interface Detail extends ClaudeAppDestination {
        public static final f Companion = f.a;

        @Override // com.anthropic.claude.app.ClaudeAppDestination, defpackage.bga
        /* synthetic */ cc getActiveSurface();

        @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-.B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015R\u0014\u0010'\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010)¨\u0006/"}, d2 = {"Lcom/anthropic/claude/app/ClaudeAppDestination$Detail$Chat;", "Lcom/anthropic/claude/app/ClaudeAppDestination$Detail;", "Lcom/anthropic/claude/chat/ChatScreenParams;", "params", "<init>", "(Lcom/anthropic/claude/chat/ChatScreenParams;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/chat/ChatScreenParams;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$app", "(Lcom/anthropic/claude/app/ClaudeAppDestination$Detail$Chat;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/chat/ChatScreenParams;", "copy", "(Lcom/anthropic/claude/chat/ChatScreenParams;)Lcom/anthropic/claude/app/ClaudeAppDestination$Detail$Chat;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/chat/ChatScreenParams;", "getParams", "Lcc;", "getActiveSurface", "()Lcc;", "activeSurface", "isRootScreen", "()Z", "getRequiresChat", "requiresChat", "Companion", "com/anthropic/claude/app/b", "com/anthropic/claude/app/c", "app"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
        @onf
        public static final /* data */ class Chat implements Detail {
            public static final int $stable = 0;
            public static final c Companion = new c();
            private final ChatScreenParams params;

            public /* synthetic */ Chat(int i, ChatScreenParams chatScreenParams, vnf vnfVar) {
                if (1 == (i & 1)) {
                    this.params = chatScreenParams;
                } else {
                    gvj.f(i, 1, b.a.getDescriptor());
                    throw null;
                }
            }

            public static /* synthetic */ Chat copy$default(Chat chat, ChatScreenParams chatScreenParams, int i, Object obj) {
                if ((i & 1) != 0) {
                    chatScreenParams = chat.params;
                }
                return chat.copy(chatScreenParams);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final ChatScreenParams getParams() {
                return this.params;
            }

            public final Chat copy(ChatScreenParams params) {
                params.getClass();
                return new Chat(params);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Chat) && x44.r(this.params, ((Chat) other).params);
            }

            @Override // com.anthropic.claude.app.ClaudeAppDestination.Detail, com.anthropic.claude.app.ClaudeAppDestination, defpackage.bga
            public cc getActiveSurface() {
                return cc.Chat;
            }

            public final ChatScreenParams getParams() {
                return this.params;
            }

            @Override // com.anthropic.claude.app.ClaudeAppDestination
            public boolean getRequiresChat() {
                return true;
            }

            public int hashCode() {
                return this.params.hashCode();
            }

            @Override // com.anthropic.claude.app.ClaudeAppDestination
            public boolean isRootScreen() {
                return this.params.isRootScreen();
            }

            public String toString() {
                return "Chat(params=" + this.params + ")";
            }

            public Chat(ChatScreenParams chatScreenParams) {
                chatScreenParams.getClass();
                this.params = chatScreenParams;
            }
        }

        @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+,B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015R\u0014\u0010'\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006-"}, d2 = {"Lcom/anthropic/claude/app/ClaudeAppDestination$Detail$CodeRemoteSession;", "Lcom/anthropic/claude/app/ClaudeAppDestination$Detail;", "Lcom/anthropic/claude/code/remote/CodeRemoteSessionScreenParams;", "params", "<init>", "(Lcom/anthropic/claude/code/remote/CodeRemoteSessionScreenParams;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/code/remote/CodeRemoteSessionScreenParams;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$app", "(Lcom/anthropic/claude/app/ClaudeAppDestination$Detail$CodeRemoteSession;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/code/remote/CodeRemoteSessionScreenParams;", "copy", "(Lcom/anthropic/claude/code/remote/CodeRemoteSessionScreenParams;)Lcom/anthropic/claude/app/ClaudeAppDestination$Detail$CodeRemoteSession;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/code/remote/CodeRemoteSessionScreenParams;", "getParams", "Lcc;", "getActiveSurface", "()Lcc;", "activeSurface", "isRootScreen", "()Z", "Companion", "com/anthropic/claude/app/d", "com/anthropic/claude/app/e", "app"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
        @onf
        public static final /* data */ class CodeRemoteSession implements Detail {
            private final CodeRemoteSessionScreenParams params;
            public static final e Companion = new e();
            public static final int $stable = CodeRemoteSessionScreenParams.$stable;

            public /* synthetic */ CodeRemoteSession(int i, CodeRemoteSessionScreenParams codeRemoteSessionScreenParams, vnf vnfVar) {
                if (1 == (i & 1)) {
                    this.params = codeRemoteSessionScreenParams;
                } else {
                    gvj.f(i, 1, d.a.getDescriptor());
                    throw null;
                }
            }

            public static /* synthetic */ CodeRemoteSession copy$default(CodeRemoteSession codeRemoteSession, CodeRemoteSessionScreenParams codeRemoteSessionScreenParams, int i, Object obj) {
                if ((i & 1) != 0) {
                    codeRemoteSessionScreenParams = codeRemoteSession.params;
                }
                return codeRemoteSession.copy(codeRemoteSessionScreenParams);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final CodeRemoteSessionScreenParams getParams() {
                return this.params;
            }

            public final CodeRemoteSession copy(CodeRemoteSessionScreenParams params) {
                params.getClass();
                return new CodeRemoteSession(params);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CodeRemoteSession) && x44.r(this.params, ((CodeRemoteSession) other).params);
            }

            @Override // com.anthropic.claude.app.ClaudeAppDestination.Detail, com.anthropic.claude.app.ClaudeAppDestination, defpackage.bga
            public cc getActiveSurface() {
                return cc.Code;
            }

            public final CodeRemoteSessionScreenParams getParams() {
                return this.params;
            }

            @Override // com.anthropic.claude.app.ClaudeAppDestination
            public /* bridge */ boolean getRequiresChat() {
                return super.getRequiresChat();
            }

            public int hashCode() {
                return this.params.hashCode();
            }

            @Override // com.anthropic.claude.app.ClaudeAppDestination
            public boolean isRootScreen() {
                return this.params.isRootScreen();
            }

            public String toString() {
                return "CodeRemoteSession(params=" + this.params + ")";
            }

            public CodeRemoteSession(CodeRemoteSessionScreenParams codeRemoteSessionScreenParams) {
                codeRemoteSessionScreenParams.getClass();
                this.params = codeRemoteSessionScreenParams;
            }
        }

        @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,-B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015R\u0014\u0010'\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006."}, d2 = {"Lcom/anthropic/claude/app/ClaudeAppDestination$Detail$CreateTemplateProject;", "Lcom/anthropic/claude/app/ClaudeAppDestination$Detail;", "Lcom/anthropic/claude/project/create/CreateTemplateProjectScreenParams;", "params", "<init>", "(Lcom/anthropic/claude/project/create/CreateTemplateProjectScreenParams;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/project/create/CreateTemplateProjectScreenParams;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$app", "(Lcom/anthropic/claude/app/ClaudeAppDestination$Detail$CreateTemplateProject;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/project/create/CreateTemplateProjectScreenParams;", "copy", "(Lcom/anthropic/claude/project/create/CreateTemplateProjectScreenParams;)Lcom/anthropic/claude/app/ClaudeAppDestination$Detail$CreateTemplateProject;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/project/create/CreateTemplateProjectScreenParams;", "getParams", "Lcc;", "getActiveSurface", "()Lcc;", "activeSurface", "getRequiresChat", "()Z", "requiresChat", "Companion", "com/anthropic/claude/app/g", "com/anthropic/claude/app/h", "app"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
        @onf
        public static final /* data */ class CreateTemplateProject implements Detail {
            private final CreateTemplateProjectScreenParams params;
            public static final h Companion = new h();
            public static final int $stable = CreateTemplateProjectScreenParams.$stable;

            public /* synthetic */ CreateTemplateProject(int i, CreateTemplateProjectScreenParams createTemplateProjectScreenParams, vnf vnfVar) {
                if (1 == (i & 1)) {
                    this.params = createTemplateProjectScreenParams;
                } else {
                    gvj.f(i, 1, g.a.getDescriptor());
                    throw null;
                }
            }

            public static /* synthetic */ CreateTemplateProject copy$default(CreateTemplateProject createTemplateProject, CreateTemplateProjectScreenParams createTemplateProjectScreenParams, int i, Object obj) {
                if ((i & 1) != 0) {
                    createTemplateProjectScreenParams = createTemplateProject.params;
                }
                return createTemplateProject.copy(createTemplateProjectScreenParams);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final CreateTemplateProjectScreenParams getParams() {
                return this.params;
            }

            public final CreateTemplateProject copy(CreateTemplateProjectScreenParams params) {
                params.getClass();
                return new CreateTemplateProject(params);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CreateTemplateProject) && x44.r(this.params, ((CreateTemplateProject) other).params);
            }

            @Override // com.anthropic.claude.app.ClaudeAppDestination.Detail, com.anthropic.claude.app.ClaudeAppDestination, defpackage.bga
            public cc getActiveSurface() {
                return cc.Other;
            }

            public final CreateTemplateProjectScreenParams getParams() {
                return this.params;
            }

            @Override // com.anthropic.claude.app.ClaudeAppDestination
            public boolean getRequiresChat() {
                return true;
            }

            public int hashCode() {
                return this.params.hashCode();
            }

            @Override // com.anthropic.claude.app.ClaudeAppDestination
            public /* bridge */ boolean isRootScreen() {
                return super.isRootScreen();
            }

            public String toString() {
                return "CreateTemplateProject(params=" + this.params + ")";
            }

            public CreateTemplateProject(CreateTemplateProjectScreenParams createTemplateProjectScreenParams) {
                createTemplateProjectScreenParams.getClass();
                this.params = createTemplateProjectScreenParams;
            }
        }

        @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-.B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015R\u0014\u0010'\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010)¨\u0006/"}, d2 = {"Lcom/anthropic/claude/app/ClaudeAppDestination$Detail$ProjectDetails;", "Lcom/anthropic/claude/app/ClaudeAppDestination$Detail;", "Lcom/anthropic/claude/project/details/ProjectDetailsScreenParams;", "params", "<init>", "(Lcom/anthropic/claude/project/details/ProjectDetailsScreenParams;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/project/details/ProjectDetailsScreenParams;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$app", "(Lcom/anthropic/claude/app/ClaudeAppDestination$Detail$ProjectDetails;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/project/details/ProjectDetailsScreenParams;", "copy", "(Lcom/anthropic/claude/project/details/ProjectDetailsScreenParams;)Lcom/anthropic/claude/app/ClaudeAppDestination$Detail$ProjectDetails;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/project/details/ProjectDetailsScreenParams;", "getParams", "Lcc;", "getActiveSurface", "()Lcc;", "activeSurface", "isRootScreen", "()Z", "getRequiresChat", "requiresChat", "Companion", "com/anthropic/claude/app/i", "com/anthropic/claude/app/j", "app"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
        @onf
        public static final /* data */ class ProjectDetails implements Detail {
            public static final int $stable = 0;
            public static final j Companion = new j();
            private final ProjectDetailsScreenParams params;

            public /* synthetic */ ProjectDetails(int i, ProjectDetailsScreenParams projectDetailsScreenParams, vnf vnfVar) {
                if (1 == (i & 1)) {
                    this.params = projectDetailsScreenParams;
                } else {
                    gvj.f(i, 1, i.a.getDescriptor());
                    throw null;
                }
            }

            public static /* synthetic */ ProjectDetails copy$default(ProjectDetails projectDetails, ProjectDetailsScreenParams projectDetailsScreenParams, int i, Object obj) {
                if ((i & 1) != 0) {
                    projectDetailsScreenParams = projectDetails.params;
                }
                return projectDetails.copy(projectDetailsScreenParams);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final ProjectDetailsScreenParams getParams() {
                return this.params;
            }

            public final ProjectDetails copy(ProjectDetailsScreenParams params) {
                params.getClass();
                return new ProjectDetails(params);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ProjectDetails) && x44.r(this.params, ((ProjectDetails) other).params);
            }

            @Override // com.anthropic.claude.app.ClaudeAppDestination.Detail, com.anthropic.claude.app.ClaudeAppDestination, defpackage.bga
            public cc getActiveSurface() {
                return cc.Other;
            }

            public final ProjectDetailsScreenParams getParams() {
                return this.params;
            }

            @Override // com.anthropic.claude.app.ClaudeAppDestination
            public boolean getRequiresChat() {
                return true;
            }

            public int hashCode() {
                return this.params.hashCode();
            }

            @Override // com.anthropic.claude.app.ClaudeAppDestination
            public boolean isRootScreen() {
                return this.params.isRootScreen();
            }

            public String toString() {
                return "ProjectDetails(params=" + this.params + ")";
            }

            public ProjectDetails(ProjectDetailsScreenParams projectDetailsScreenParams) {
                projectDetailsScreenParams.getClass();
                this.params = projectDetailsScreenParams;
            }
        }

        @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,-B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015R\u0014\u0010'\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006."}, d2 = {"Lcom/anthropic/claude/app/ClaudeAppDestination$Detail$ProjectKnowledge;", "Lcom/anthropic/claude/app/ClaudeAppDestination$Detail;", "Lcom/anthropic/claude/project/knowledge/ProjectKnowledgeScreenParams;", "params", "<init>", "(Lcom/anthropic/claude/project/knowledge/ProjectKnowledgeScreenParams;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/project/knowledge/ProjectKnowledgeScreenParams;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$app", "(Lcom/anthropic/claude/app/ClaudeAppDestination$Detail$ProjectKnowledge;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/project/knowledge/ProjectKnowledgeScreenParams;", "copy", "(Lcom/anthropic/claude/project/knowledge/ProjectKnowledgeScreenParams;)Lcom/anthropic/claude/app/ClaudeAppDestination$Detail$ProjectKnowledge;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/project/knowledge/ProjectKnowledgeScreenParams;", "getParams", "Lcc;", "getActiveSurface", "()Lcc;", "activeSurface", "getRequiresChat", "()Z", "requiresChat", "Companion", "com/anthropic/claude/app/k", "com/anthropic/claude/app/l", "app"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
        @onf
        public static final /* data */ class ProjectKnowledge implements Detail {
            public static final int $stable = 0;
            public static final l Companion = new l();
            private final ProjectKnowledgeScreenParams params;

            public /* synthetic */ ProjectKnowledge(int i, ProjectKnowledgeScreenParams projectKnowledgeScreenParams, vnf vnfVar) {
                if (1 == (i & 1)) {
                    this.params = projectKnowledgeScreenParams;
                } else {
                    gvj.f(i, 1, k.a.getDescriptor());
                    throw null;
                }
            }

            public static /* synthetic */ ProjectKnowledge copy$default(ProjectKnowledge projectKnowledge, ProjectKnowledgeScreenParams projectKnowledgeScreenParams, int i, Object obj) {
                if ((i & 1) != 0) {
                    projectKnowledgeScreenParams = projectKnowledge.params;
                }
                return projectKnowledge.copy(projectKnowledgeScreenParams);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final ProjectKnowledgeScreenParams getParams() {
                return this.params;
            }

            public final ProjectKnowledge copy(ProjectKnowledgeScreenParams params) {
                params.getClass();
                return new ProjectKnowledge(params);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ProjectKnowledge) && x44.r(this.params, ((ProjectKnowledge) other).params);
            }

            @Override // com.anthropic.claude.app.ClaudeAppDestination.Detail, com.anthropic.claude.app.ClaudeAppDestination, defpackage.bga
            public cc getActiveSurface() {
                return cc.Other;
            }

            public final ProjectKnowledgeScreenParams getParams() {
                return this.params;
            }

            @Override // com.anthropic.claude.app.ClaudeAppDestination
            public boolean getRequiresChat() {
                return true;
            }

            public int hashCode() {
                return this.params.hashCode();
            }

            @Override // com.anthropic.claude.app.ClaudeAppDestination
            public /* bridge */ boolean isRootScreen() {
                return super.isRootScreen();
            }

            public String toString() {
                return "ProjectKnowledge(params=" + this.params + ")";
            }

            public ProjectKnowledge(ProjectKnowledgeScreenParams projectKnowledgeScreenParams) {
                projectKnowledgeScreenParams.getClass();
                this.params = projectKnowledgeScreenParams;
            }
        }

        @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,-B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015R\u0014\u0010'\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006."}, d2 = {"Lcom/anthropic/claude/app/ClaudeAppDestination$Detail$TemplateUploadMaterialScreen;", "Lcom/anthropic/claude/app/ClaudeAppDestination$Detail;", "Lcom/anthropic/claude/project/create/UploadMaterialsScreenParams;", "params", "<init>", "(Lcom/anthropic/claude/project/create/UploadMaterialsScreenParams;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/project/create/UploadMaterialsScreenParams;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$app", "(Lcom/anthropic/claude/app/ClaudeAppDestination$Detail$TemplateUploadMaterialScreen;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/project/create/UploadMaterialsScreenParams;", "copy", "(Lcom/anthropic/claude/project/create/UploadMaterialsScreenParams;)Lcom/anthropic/claude/app/ClaudeAppDestination$Detail$TemplateUploadMaterialScreen;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/project/create/UploadMaterialsScreenParams;", "getParams", "Lcc;", "getActiveSurface", "()Lcc;", "activeSurface", "getRequiresChat", "()Z", "requiresChat", "Companion", "com/anthropic/claude/app/m", "com/anthropic/claude/app/n", "app"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
        @onf
        public static final /* data */ class TemplateUploadMaterialScreen implements Detail {
            public static final int $stable = 0;
            public static final n Companion = new n();
            private final UploadMaterialsScreenParams params;

            public /* synthetic */ TemplateUploadMaterialScreen(int i, UploadMaterialsScreenParams uploadMaterialsScreenParams, vnf vnfVar) {
                if (1 == (i & 1)) {
                    this.params = uploadMaterialsScreenParams;
                } else {
                    gvj.f(i, 1, m.a.getDescriptor());
                    throw null;
                }
            }

            public static /* synthetic */ TemplateUploadMaterialScreen copy$default(TemplateUploadMaterialScreen templateUploadMaterialScreen, UploadMaterialsScreenParams uploadMaterialsScreenParams, int i, Object obj) {
                if ((i & 1) != 0) {
                    uploadMaterialsScreenParams = templateUploadMaterialScreen.params;
                }
                return templateUploadMaterialScreen.copy(uploadMaterialsScreenParams);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final UploadMaterialsScreenParams getParams() {
                return this.params;
            }

            public final TemplateUploadMaterialScreen copy(UploadMaterialsScreenParams params) {
                params.getClass();
                return new TemplateUploadMaterialScreen(params);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof TemplateUploadMaterialScreen) && x44.r(this.params, ((TemplateUploadMaterialScreen) other).params);
            }

            @Override // com.anthropic.claude.app.ClaudeAppDestination.Detail, com.anthropic.claude.app.ClaudeAppDestination, defpackage.bga
            public cc getActiveSurface() {
                return cc.Other;
            }

            public final UploadMaterialsScreenParams getParams() {
                return this.params;
            }

            @Override // com.anthropic.claude.app.ClaudeAppDestination
            public boolean getRequiresChat() {
                return true;
            }

            public int hashCode() {
                return this.params.hashCode();
            }

            @Override // com.anthropic.claude.app.ClaudeAppDestination
            public /* bridge */ boolean isRootScreen() {
                return super.isRootScreen();
            }

            public String toString() {
                return "TemplateUploadMaterialScreen(params=" + this.params + ")";
            }

            public TemplateUploadMaterialScreen(UploadMaterialsScreenParams uploadMaterialsScreenParams) {
                uploadMaterialsScreenParams.getClass();
                this.params = uploadMaterialsScreenParams;
            }
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\r\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0082\u0001\f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001cÀ\u0006\u0003"}, d2 = {"Lcom/anthropic/claude/app/ClaudeAppDestination$List;", "Lcom/anthropic/claude/app/ClaudeAppDestination;", "Companion", "AllChatsList", "AllProjectsList", "ArtifactGallery", "CodeRemote", "CodeProject", "CoworkRemote", "ProjectDetails", "AgentChat", "AgentChatTasks", "Conway", "Tasks", "Settings", "com/anthropic/claude/app/r", "Lcom/anthropic/claude/app/ClaudeAppDestination$List$AgentChat;", "Lcom/anthropic/claude/app/ClaudeAppDestination$List$AgentChatTasks;", "Lcom/anthropic/claude/app/ClaudeAppDestination$List$AllChatsList;", "Lcom/anthropic/claude/app/ClaudeAppDestination$List$AllProjectsList;", "Lcom/anthropic/claude/app/ClaudeAppDestination$List$ArtifactGallery;", "Lcom/anthropic/claude/app/ClaudeAppDestination$List$CodeProject;", "Lcom/anthropic/claude/app/ClaudeAppDestination$List$CodeRemote;", "Lcom/anthropic/claude/app/ClaudeAppDestination$List$Conway;", "Lcom/anthropic/claude/app/ClaudeAppDestination$List$CoworkRemote;", "Lcom/anthropic/claude/app/ClaudeAppDestination$List$ProjectDetails;", "Lcom/anthropic/claude/app/ClaudeAppDestination$List$Settings;", "Lcom/anthropic/claude/app/ClaudeAppDestination$List$Tasks;", "app"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public interface List extends ClaudeAppDestination {
        public static final r Companion = r.a;

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/anthropic/claude/app/ClaudeAppDestination$List$AgentChat;", "Lcom/anthropic/claude/app/ClaudeAppDestination$List;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcc;", "getActiveSurface", "()Lcc;", "activeSurface", "isRootScreen", "()Z", "app"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
        @onf
        public static final /* data */ class AgentChat implements List {
            public static final int $stable = 0;
            public static final AgentChat INSTANCE = new AgentChat();
            private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new w53(18));

            private AgentChat() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ KSerializer _init_$_anonymous_() {
                return new lq6("com.anthropic.claude.app.ClaudeAppDestination.List.AgentChat", INSTANCE, new Annotation[0]);
            }

            private final /* synthetic */ KSerializer get$cachedSerializer() {
                return (KSerializer) $cachedSerializer$delegate.getValue();
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof AgentChat);
            }

            @Override // com.anthropic.claude.app.ClaudeAppDestination.List, com.anthropic.claude.app.ClaudeAppDestination, defpackage.bga
            public cc getActiveSurface() {
                return cc.Dispatch;
            }

            @Override // com.anthropic.claude.app.ClaudeAppDestination
            public /* bridge */ boolean getRequiresChat() {
                return super.getRequiresChat();
            }

            public int hashCode() {
                return -1145697438;
            }

            @Override // com.anthropic.claude.app.ClaudeAppDestination
            public boolean isRootScreen() {
                return true;
            }

            public final KSerializer serializer() {
                return get$cachedSerializer();
            }

            public String toString() {
                return "AgentChat";
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/anthropic/claude/app/ClaudeAppDestination$List$AgentChatTasks;", "Lcom/anthropic/claude/app/ClaudeAppDestination$List;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcc;", "getActiveSurface", "()Lcc;", "activeSurface", "isRootScreen", "()Z", "app"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
        @onf
        public static final /* data */ class AgentChatTasks implements List {
            public static final int $stable = 0;
            public static final AgentChatTasks INSTANCE = new AgentChatTasks();
            private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new w53(19));

            private AgentChatTasks() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ KSerializer _init_$_anonymous_() {
                return new lq6("com.anthropic.claude.app.ClaudeAppDestination.List.AgentChatTasks", INSTANCE, new Annotation[0]);
            }

            private final /* synthetic */ KSerializer get$cachedSerializer() {
                return (KSerializer) $cachedSerializer$delegate.getValue();
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof AgentChatTasks);
            }

            @Override // com.anthropic.claude.app.ClaudeAppDestination.List, com.anthropic.claude.app.ClaudeAppDestination, defpackage.bga
            public cc getActiveSurface() {
                return cc.Dispatch;
            }

            @Override // com.anthropic.claude.app.ClaudeAppDestination
            public /* bridge */ boolean getRequiresChat() {
                return super.getRequiresChat();
            }

            public int hashCode() {
                return -1755230900;
            }

            @Override // com.anthropic.claude.app.ClaudeAppDestination
            public boolean isRootScreen() {
                return false;
            }

            public final KSerializer serializer() {
                return get$cachedSerializer();
            }

            public String toString() {
                return "AgentChatTasks";
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/anthropic/claude/app/ClaudeAppDestination$List$AllChatsList;", "Lcom/anthropic/claude/app/ClaudeAppDestination$List;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcc;", "getActiveSurface", "()Lcc;", "activeSurface", "isRootScreen", "()Z", "getRequiresChat", "requiresChat", "app"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
        @onf
        public static final /* data */ class AllChatsList implements List {
            public static final int $stable = 0;
            public static final AllChatsList INSTANCE = new AllChatsList();
            private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new w53(20));

            private AllChatsList() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ KSerializer _init_$_anonymous_() {
                return new lq6("com.anthropic.claude.app.ClaudeAppDestination.List.AllChatsList", INSTANCE, new Annotation[0]);
            }

            private final /* synthetic */ KSerializer get$cachedSerializer() {
                return (KSerializer) $cachedSerializer$delegate.getValue();
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof AllChatsList);
            }

            @Override // com.anthropic.claude.app.ClaudeAppDestination.List, com.anthropic.claude.app.ClaudeAppDestination, defpackage.bga
            public cc getActiveSurface() {
                return cc.Chat;
            }

            @Override // com.anthropic.claude.app.ClaudeAppDestination
            public boolean getRequiresChat() {
                return true;
            }

            public int hashCode() {
                return 1048944947;
            }

            @Override // com.anthropic.claude.app.ClaudeAppDestination
            public boolean isRootScreen() {
                return true;
            }

            public final KSerializer serializer() {
                return get$cachedSerializer();
            }

            public String toString() {
                return "AllChatsList";
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/anthropic/claude/app/ClaudeAppDestination$List$AllProjectsList;", "Lcom/anthropic/claude/app/ClaudeAppDestination$List;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcc;", "getActiveSurface", "()Lcc;", "activeSurface", "isRootScreen", "()Z", "getRequiresChat", "requiresChat", "app"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
        @onf
        public static final /* data */ class AllProjectsList implements List {
            public static final int $stable = 0;
            public static final AllProjectsList INSTANCE = new AllProjectsList();
            private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new w53(21));

            private AllProjectsList() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ KSerializer _init_$_anonymous_() {
                return new lq6("com.anthropic.claude.app.ClaudeAppDestination.List.AllProjectsList", INSTANCE, new Annotation[0]);
            }

            private final /* synthetic */ KSerializer get$cachedSerializer() {
                return (KSerializer) $cachedSerializer$delegate.getValue();
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof AllProjectsList);
            }

            @Override // com.anthropic.claude.app.ClaudeAppDestination.List, com.anthropic.claude.app.ClaudeAppDestination, defpackage.bga
            public cc getActiveSurface() {
                return cc.Other;
            }

            @Override // com.anthropic.claude.app.ClaudeAppDestination
            public boolean getRequiresChat() {
                return true;
            }

            public int hashCode() {
                return -1409171426;
            }

            @Override // com.anthropic.claude.app.ClaudeAppDestination
            public boolean isRootScreen() {
                return true;
            }

            public final KSerializer serializer() {
                return get$cachedSerializer();
            }

            public String toString() {
                return "AllProjectsList";
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/anthropic/claude/app/ClaudeAppDestination$List$ArtifactGallery;", "Lcom/anthropic/claude/app/ClaudeAppDestination$List;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcc;", "getActiveSurface", "()Lcc;", "activeSurface", "isRootScreen", "()Z", "getRequiresChat", "requiresChat", "app"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
        @onf
        public static final /* data */ class ArtifactGallery implements List {
            public static final int $stable = 0;
            public static final ArtifactGallery INSTANCE = new ArtifactGallery();
            private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new w53(22));

            private ArtifactGallery() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ KSerializer _init_$_anonymous_() {
                return new lq6("com.anthropic.claude.app.ClaudeAppDestination.List.ArtifactGallery", INSTANCE, new Annotation[0]);
            }

            private final /* synthetic */ KSerializer get$cachedSerializer() {
                return (KSerializer) $cachedSerializer$delegate.getValue();
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof ArtifactGallery);
            }

            @Override // com.anthropic.claude.app.ClaudeAppDestination.List, com.anthropic.claude.app.ClaudeAppDestination, defpackage.bga
            public cc getActiveSurface() {
                return cc.Other;
            }

            @Override // com.anthropic.claude.app.ClaudeAppDestination
            public boolean getRequiresChat() {
                return true;
            }

            public int hashCode() {
                return -213048123;
            }

            @Override // com.anthropic.claude.app.ClaudeAppDestination
            public boolean isRootScreen() {
                return true;
            }

            public final KSerializer serializer() {
                return get$cachedSerializer();
            }

            public String toString() {
                return "ArtifactGallery";
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/anthropic/claude/app/ClaudeAppDestination$List$CodeRemote;", "Lcom/anthropic/claude/app/ClaudeAppDestination$List;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcc;", "getActiveSurface", "()Lcc;", "activeSurface", "isRootScreen", "()Z", "app"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
        @onf
        public static final /* data */ class CodeRemote implements List {
            public static final int $stable = 0;
            public static final CodeRemote INSTANCE = new CodeRemote();
            private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new w53(23));

            private CodeRemote() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ KSerializer _init_$_anonymous_() {
                return new lq6("com.anthropic.claude.app.ClaudeAppDestination.List.CodeRemote", INSTANCE, new Annotation[0]);
            }

            private final /* synthetic */ KSerializer get$cachedSerializer() {
                return (KSerializer) $cachedSerializer$delegate.getValue();
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof CodeRemote);
            }

            @Override // com.anthropic.claude.app.ClaudeAppDestination.List, com.anthropic.claude.app.ClaudeAppDestination, defpackage.bga
            public cc getActiveSurface() {
                return cc.Code;
            }

            @Override // com.anthropic.claude.app.ClaudeAppDestination
            public /* bridge */ boolean getRequiresChat() {
                return super.getRequiresChat();
            }

            public int hashCode() {
                return -911913522;
            }

            @Override // com.anthropic.claude.app.ClaudeAppDestination
            public boolean isRootScreen() {
                return true;
            }

            public final KSerializer serializer() {
                return get$cachedSerializer();
            }

            public String toString() {
                return "CodeRemote";
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/anthropic/claude/app/ClaudeAppDestination$List$Conway;", "Lcom/anthropic/claude/app/ClaudeAppDestination$List;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcc;", "getActiveSurface", "()Lcc;", "activeSurface", "isRootScreen", "()Z", "app"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
        @onf
        public static final /* data */ class Conway implements List {
            public static final int $stable = 0;
            public static final Conway INSTANCE = new Conway();
            private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new w53(24));

            private Conway() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ KSerializer _init_$_anonymous_() {
                return new lq6("com.anthropic.claude.app.ClaudeAppDestination.List.Conway", INSTANCE, new Annotation[0]);
            }

            private final /* synthetic */ KSerializer get$cachedSerializer() {
                return (KSerializer) $cachedSerializer$delegate.getValue();
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Conway);
            }

            @Override // com.anthropic.claude.app.ClaudeAppDestination.List, com.anthropic.claude.app.ClaudeAppDestination, defpackage.bga
            public cc getActiveSurface() {
                return cc.Other;
            }

            @Override // com.anthropic.claude.app.ClaudeAppDestination
            public /* bridge */ boolean getRequiresChat() {
                return super.getRequiresChat();
            }

            public int hashCode() {
                return -1128843032;
            }

            @Override // com.anthropic.claude.app.ClaudeAppDestination
            public boolean isRootScreen() {
                return true;
            }

            public final KSerializer serializer() {
                return get$cachedSerializer();
            }

            public String toString() {
                return "Conway";
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/anthropic/claude/app/ClaudeAppDestination$List$CoworkRemote;", "Lcom/anthropic/claude/app/ClaudeAppDestination$List;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcc;", "getActiveSurface", "()Lcc;", "activeSurface", "isRootScreen", "()Z", "app"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
        @onf
        public static final /* data */ class CoworkRemote implements List {
            public static final int $stable = 0;
            public static final CoworkRemote INSTANCE = new CoworkRemote();
            private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new w53(25));

            private CoworkRemote() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ KSerializer _init_$_anonymous_() {
                return new lq6("dramaticShrimp", INSTANCE, new Annotation[0]);
            }

            private final /* synthetic */ KSerializer get$cachedSerializer() {
                return (KSerializer) $cachedSerializer$delegate.getValue();
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof CoworkRemote);
            }

            @Override // com.anthropic.claude.app.ClaudeAppDestination.List, com.anthropic.claude.app.ClaudeAppDestination, defpackage.bga
            public cc getActiveSurface() {
                return cc.Code;
            }

            @Override // com.anthropic.claude.app.ClaudeAppDestination
            public /* bridge */ boolean getRequiresChat() {
                return super.getRequiresChat();
            }

            public int hashCode() {
                return -326037858;
            }

            @Override // com.anthropic.claude.app.ClaudeAppDestination
            public boolean isRootScreen() {
                return true;
            }

            public final KSerializer serializer() {
                return get$cachedSerializer();
            }

            public String toString() {
                return "CoworkRemote";
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/anthropic/claude/app/ClaudeAppDestination$List$Tasks;", "Lcom/anthropic/claude/app/ClaudeAppDestination$List;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcc;", "getActiveSurface", "()Lcc;", "activeSurface", "isRootScreen", "()Z", "app"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
        @onf
        public static final /* data */ class Tasks implements List {
            public static final int $stable = 0;
            public static final Tasks INSTANCE = new Tasks();
            private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new w53(26));

            private Tasks() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ KSerializer _init_$_anonymous_() {
                return new lq6("com.anthropic.claude.app.ClaudeAppDestination.List.Tasks", INSTANCE, new Annotation[0]);
            }

            private final /* synthetic */ KSerializer get$cachedSerializer() {
                return (KSerializer) $cachedSerializer$delegate.getValue();
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Tasks);
            }

            @Override // com.anthropic.claude.app.ClaudeAppDestination.List, com.anthropic.claude.app.ClaudeAppDestination, defpackage.bga
            public cc getActiveSurface() {
                return cc.Other;
            }

            @Override // com.anthropic.claude.app.ClaudeAppDestination
            public /* bridge */ boolean getRequiresChat() {
                return super.getRequiresChat();
            }

            public int hashCode() {
                return 255967603;
            }

            @Override // com.anthropic.claude.app.ClaudeAppDestination
            public boolean isRootScreen() {
                return true;
            }

            public final KSerializer serializer() {
                return get$cachedSerializer();
            }

            public String toString() {
                return "Tasks";
            }
        }

        @Override // com.anthropic.claude.app.ClaudeAppDestination, defpackage.bga
        /* synthetic */ cc getActiveSurface();

        @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,-B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J\u0010\u0010\u001c\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0015R\u0014\u0010(\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006."}, d2 = {"Lcom/anthropic/claude/app/ClaudeAppDestination$List$CodeProject;", "Lcom/anthropic/claude/app/ClaudeAppDestination$List;", "Lcom/anthropic/claude/types/strings/SessionGroupingId;", "projectId", "<init>", "(Ljava/lang/String;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$app", "(Lcom/anthropic/claude/app/ClaudeAppDestination$List$CodeProject;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-iRFWGjk", "()Ljava/lang/String;", "component1", "copy-qbZOyc4", "(Ljava/lang/String;)Lcom/anthropic/claude/app/ClaudeAppDestination$List$CodeProject;", "copy", "", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getProjectId-iRFWGjk", "Lcc;", "getActiveSurface", "()Lcc;", "activeSurface", "isRootScreen", "()Z", "Companion", "com/anthropic/claude/app/p", "com/anthropic/claude/app/q", "app"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
        @onf
        public static final /* data */ class CodeProject implements List {
            public static final int $stable = 0;
            public static final q Companion = new q();
            private final String projectId;

            private /* synthetic */ CodeProject(int i, String str, vnf vnfVar) {
                if (1 == (i & 1)) {
                    this.projectId = str;
                } else {
                    gvj.f(i, 1, p.a.getDescriptor());
                    throw null;
                }
            }

            /* JADX INFO: renamed from: copy-qbZOyc4$default, reason: not valid java name */
            public static /* synthetic */ CodeProject m465copyqbZOyc4$default(CodeProject codeProject, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = codeProject.projectId;
                }
                return codeProject.m467copyqbZOyc4(str);
            }

            /* JADX INFO: renamed from: component1-iRFWGjk, reason: not valid java name and from getter */
            public final String getProjectId() {
                return this.projectId;
            }

            /* JADX INFO: renamed from: copy-qbZOyc4, reason: not valid java name */
            public final CodeProject m467copyqbZOyc4(String projectId) {
                projectId.getClass();
                return new CodeProject(projectId, null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CodeProject) && SessionGroupingId.m1110equalsimpl0(this.projectId, ((CodeProject) other).projectId);
            }

            @Override // com.anthropic.claude.app.ClaudeAppDestination.List, com.anthropic.claude.app.ClaudeAppDestination, defpackage.bga
            public cc getActiveSurface() {
                return cc.Code;
            }

            /* JADX INFO: renamed from: getProjectId-iRFWGjk, reason: not valid java name */
            public final String m468getProjectIdiRFWGjk() {
                return this.projectId;
            }

            @Override // com.anthropic.claude.app.ClaudeAppDestination
            public /* bridge */ boolean getRequiresChat() {
                return super.getRequiresChat();
            }

            public int hashCode() {
                return SessionGroupingId.m1111hashCodeimpl(this.projectId);
            }

            @Override // com.anthropic.claude.app.ClaudeAppDestination
            public boolean isRootScreen() {
                return false;
            }

            public String toString() {
                return ij0.j("CodeProject(projectId=", SessionGroupingId.m1112toStringimpl(this.projectId), ")");
            }

            public /* synthetic */ CodeProject(String str, mq5 mq5Var) {
                this(str);
            }

            public /* synthetic */ CodeProject(int i, String str, vnf vnfVar, mq5 mq5Var) {
                this(i, str, vnfVar);
            }

            private CodeProject(String str) {
                str.getClass();
                this.projectId = str;
            }
        }

        @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-.B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015R\u0014\u0010'\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010)¨\u0006/"}, d2 = {"Lcom/anthropic/claude/app/ClaudeAppDestination$List$ProjectDetails;", "Lcom/anthropic/claude/app/ClaudeAppDestination$List;", "Lcom/anthropic/claude/project/details/ProjectDetailsScreenParams;", "params", "<init>", "(Lcom/anthropic/claude/project/details/ProjectDetailsScreenParams;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/project/details/ProjectDetailsScreenParams;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$app", "(Lcom/anthropic/claude/app/ClaudeAppDestination$List$ProjectDetails;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/project/details/ProjectDetailsScreenParams;", "copy", "(Lcom/anthropic/claude/project/details/ProjectDetailsScreenParams;)Lcom/anthropic/claude/app/ClaudeAppDestination$List$ProjectDetails;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/project/details/ProjectDetailsScreenParams;", "getParams", "Lcc;", "getActiveSurface", "()Lcc;", "activeSurface", "isRootScreen", "()Z", "getRequiresChat", "requiresChat", "Companion", "com/anthropic/claude/app/s", "com/anthropic/claude/app/t", "app"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
        @onf
        public static final /* data */ class ProjectDetails implements List {
            public static final int $stable = 0;
            public static final t Companion = new t();
            private final ProjectDetailsScreenParams params;

            public /* synthetic */ ProjectDetails(int i, ProjectDetailsScreenParams projectDetailsScreenParams, vnf vnfVar) {
                if (1 == (i & 1)) {
                    this.params = projectDetailsScreenParams;
                } else {
                    gvj.f(i, 1, s.a.getDescriptor());
                    throw null;
                }
            }

            public static /* synthetic */ ProjectDetails copy$default(ProjectDetails projectDetails, ProjectDetailsScreenParams projectDetailsScreenParams, int i, Object obj) {
                if ((i & 1) != 0) {
                    projectDetailsScreenParams = projectDetails.params;
                }
                return projectDetails.copy(projectDetailsScreenParams);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final ProjectDetailsScreenParams getParams() {
                return this.params;
            }

            public final ProjectDetails copy(ProjectDetailsScreenParams params) {
                params.getClass();
                return new ProjectDetails(params);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ProjectDetails) && x44.r(this.params, ((ProjectDetails) other).params);
            }

            @Override // com.anthropic.claude.app.ClaudeAppDestination.List, com.anthropic.claude.app.ClaudeAppDestination, defpackage.bga
            public cc getActiveSurface() {
                return cc.Other;
            }

            public final ProjectDetailsScreenParams getParams() {
                return this.params;
            }

            @Override // com.anthropic.claude.app.ClaudeAppDestination
            public boolean getRequiresChat() {
                return true;
            }

            public int hashCode() {
                return this.params.hashCode();
            }

            @Override // com.anthropic.claude.app.ClaudeAppDestination
            public boolean isRootScreen() {
                return this.params.isRootScreen();
            }

            public String toString() {
                return "ProjectDetails(params=" + this.params + ")";
            }

            public ProjectDetails(ProjectDetailsScreenParams projectDetailsScreenParams) {
                projectDetailsScreenParams.getClass();
                this.params = projectDetailsScreenParams;
            }
        }

        @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+,B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015R\u0014\u0010'\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006-"}, d2 = {"Lcom/anthropic/claude/app/ClaudeAppDestination$List$Settings;", "Lcom/anthropic/claude/app/ClaudeAppDestination$List;", "Lcom/anthropic/claude/app/SettingsScreenParams;", "params", "<init>", "(Lcom/anthropic/claude/app/SettingsScreenParams;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/app/SettingsScreenParams;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$app", "(Lcom/anthropic/claude/app/ClaudeAppDestination$List$Settings;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/app/SettingsScreenParams;", "copy", "(Lcom/anthropic/claude/app/SettingsScreenParams;)Lcom/anthropic/claude/app/ClaudeAppDestination$List$Settings;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/app/SettingsScreenParams;", "getParams", "Lcc;", "getActiveSurface", "()Lcc;", "activeSurface", "isRootScreen", "()Z", "Companion", "com/anthropic/claude/app/u", "com/anthropic/claude/app/v", "app"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
        @onf
        public static final /* data */ class Settings implements List {
            public static final int $stable = 0;
            public static final v Companion = new v();
            private final SettingsScreenParams params;

            public /* synthetic */ Settings(int i, SettingsScreenParams settingsScreenParams, vnf vnfVar) {
                if (1 == (i & 1)) {
                    this.params = settingsScreenParams;
                } else {
                    gvj.f(i, 1, u.a.getDescriptor());
                    throw null;
                }
            }

            public static /* synthetic */ Settings copy$default(Settings settings, SettingsScreenParams settingsScreenParams, int i, Object obj) {
                if ((i & 1) != 0) {
                    settingsScreenParams = settings.params;
                }
                return settings.copy(settingsScreenParams);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final SettingsScreenParams getParams() {
                return this.params;
            }

            public final Settings copy(SettingsScreenParams params) {
                params.getClass();
                return new Settings(params);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Settings) && x44.r(this.params, ((Settings) other).params);
            }

            @Override // com.anthropic.claude.app.ClaudeAppDestination.List, com.anthropic.claude.app.ClaudeAppDestination, defpackage.bga
            public cc getActiveSurface() {
                return cc.Other;
            }

            public final SettingsScreenParams getParams() {
                return this.params;
            }

            @Override // com.anthropic.claude.app.ClaudeAppDestination
            public /* bridge */ boolean getRequiresChat() {
                return super.getRequiresChat();
            }

            public int hashCode() {
                return this.params.hashCode();
            }

            @Override // com.anthropic.claude.app.ClaudeAppDestination
            public boolean isRootScreen() {
                return true;
            }

            public String toString() {
                return "Settings(params=" + this.params + ")";
            }

            public Settings(SettingsScreenParams settingsScreenParams) {
                settingsScreenParams.getClass();
                this.params = settingsScreenParams;
            }
        }
    }
}
