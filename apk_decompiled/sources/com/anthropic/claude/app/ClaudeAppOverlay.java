package com.anthropic.claude.app;

import com.anthropic.claude.analytics.events.GroveEvents$GroveLocation;
import com.anthropic.claude.api.chat.tool.ImageGalleryItemId;
import com.anthropic.claude.artifact.details.ArtifactFullScreenParams;
import com.anthropic.claude.core.logging.EmptyDestination;
import com.anthropic.claude.types.strings.ChatId;
import com.anthropic.claude.types.strings.ChatSnapshotId;
import com.anthropic.claude.types.strings.ModelId;
import com.anthropic.claude.types.strings.ProjectId;
import com.anthropic.claude.types.strings.ThinkingEffort;
import com.anthropic.claude.types.strings.ThinkingMode;
import defpackage.bc9;
import defpackage.bga;
import defpackage.cc;
import defpackage.ebh;
import defpackage.emd;
import defpackage.emh;
import defpackage.fji;
import defpackage.fsh;
import defpackage.gi3;
import defpackage.gid;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.j2g;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.lq6;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.rk3;
import defpackage.srg;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnb;
import defpackage.vnf;
import defpackage.vs2;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.zlh;
import defpackage.znf;
import java.lang.annotation.Annotation;
import java.util.Date;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bq\u0018\u0000 \u00062\u00020\u0001:\u000e\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\r\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !¨\u0006\"À\u0006\u0003"}, d2 = {"Lcom/anthropic/claude/app/ClaudeAppOverlay;", "Lbga;", "Lcc;", "getActiveSurface", "()Lcc;", "activeSurface", "Companion", "None", "UpgradeToProBottomSheet", "GroveNoticeBottomSheet", "ExperienceSpotlightSheet", "BellMode", "ArtifactFullScreen", "SharedChatFullScreen", "VoiceSettings", "CreateProject", "MemoryPreview", "CreateEnvironment", "ImageGalleryFullScreen", "FeedbackSheet", "com/anthropic/claude/app/s0", "Lcom/anthropic/claude/app/ClaudeAppOverlay$ArtifactFullScreen;", "Lcom/anthropic/claude/app/ClaudeAppOverlay$BellMode;", "Lcom/anthropic/claude/app/ClaudeAppOverlay$CreateEnvironment;", "Lcom/anthropic/claude/app/ClaudeAppOverlay$CreateProject;", "Lcom/anthropic/claude/app/ClaudeAppOverlay$ExperienceSpotlightSheet;", "Lcom/anthropic/claude/app/ClaudeAppOverlay$FeedbackSheet;", "Lcom/anthropic/claude/app/ClaudeAppOverlay$GroveNoticeBottomSheet;", "Lcom/anthropic/claude/app/ClaudeAppOverlay$ImageGalleryFullScreen;", "Lcom/anthropic/claude/app/ClaudeAppOverlay$MemoryPreview;", "Lcom/anthropic/claude/app/ClaudeAppOverlay$None;", "Lcom/anthropic/claude/app/ClaudeAppOverlay$SharedChatFullScreen;", "Lcom/anthropic/claude/app/ClaudeAppOverlay$UpgradeToProBottomSheet;", "Lcom/anthropic/claude/app/ClaudeAppOverlay$VoiceSettings;", "app"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public interface ClaudeAppOverlay extends bga {
    public static final s0 Companion = s0.a;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bJ\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004Ê\u0001\u0002\b\u000fÊ\u0001\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000e"}, d2 = {"Lcom/anthropic/claude/app/ClaudeAppOverlay$CreateEnvironment;", "Lcom/anthropic/claude/app/ClaudeAppOverlay;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "app", "Lkotlinx/serialization/Serializable;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class CreateEnvironment implements ClaudeAppOverlay {
        public static final int $stable = 0;
        public static final CreateEnvironment INSTANCE = new CreateEnvironment();
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new rk3(0));

        private CreateEnvironment() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new lq6("com.anthropic.claude.app.ClaudeAppOverlay.CreateEnvironment", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof CreateEnvironment);
        }

        @Override // com.anthropic.claude.app.ClaudeAppOverlay, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        public int hashCode() {
            return -1873579068;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "CreateEnvironment";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bJ\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004Ê\u0001\u0002\b\u000fÊ\u0001\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000e"}, d2 = {"Lcom/anthropic/claude/app/ClaudeAppOverlay$CreateProject;", "Lcom/anthropic/claude/app/ClaudeAppOverlay;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "app", "Lkotlinx/serialization/Serializable;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class CreateProject implements ClaudeAppOverlay {
        public static final int $stable = 0;
        public static final CreateProject INSTANCE = new CreateProject();
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new rk3(1));

        private CreateProject() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new lq6("com.anthropic.claude.app.ClaudeAppOverlay.CreateProject", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof CreateProject);
        }

        @Override // com.anthropic.claude.app.ClaudeAppOverlay, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        public int hashCode() {
            return -897512118;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "CreateProject";
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bHÖ\u0083\u0004J\n\u0010\t\u001a\u00020\nHÖ\u0081\u0004J\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\fJ\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004Ê\u0001\u0002\b\u0010Ê\u0001\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000f"}, d2 = {"Lcom/anthropic/claude/app/ClaudeAppOverlay$None;", "Lcom/anthropic/claude/app/ClaudeAppOverlay;", "Lcom/anthropic/claude/core/logging/EmptyDestination;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "app", "Lkotlinx/serialization/Serializable;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class None implements ClaudeAppOverlay, EmptyDestination {
        public static final int $stable = 0;
        public static final None INSTANCE = new None();
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new rk3(2));

        private None() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new lq6("com.anthropic.claude.app.ClaudeAppOverlay.None", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof None);
        }

        @Override // com.anthropic.claude.app.ClaudeAppOverlay, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        public int hashCode() {
            return 1903085003;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "None";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bJ\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004Ê\u0001\u0002\b\u000fÊ\u0001\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000e"}, d2 = {"Lcom/anthropic/claude/app/ClaudeAppOverlay$VoiceSettings;", "Lcom/anthropic/claude/app/ClaudeAppOverlay;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "app", "Lkotlinx/serialization/Serializable;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class VoiceSettings implements ClaudeAppOverlay {
        public static final int $stable = 0;
        public static final VoiceSettings INSTANCE = new VoiceSettings();
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new rk3(3));

        private VoiceSettings() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new lq6("com.anthropic.claude.app.ClaudeAppOverlay.VoiceSettings", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof VoiceSettings);
        }

        @Override // com.anthropic.claude.app.ClaudeAppOverlay, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        public int hashCode() {
            return 413250;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "VoiceSettings";
        }
    }

    @Override // defpackage.bga
    default cc getActiveSurface() {
        return cc.Other;
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#$B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001c\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0015¨\u0006%"}, d2 = {"Lcom/anthropic/claude/app/ClaudeAppOverlay$FeedbackSheet;", "Lcom/anthropic/claude/app/ClaudeAppOverlay;", "", "initialScreenshotUri", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$app", "(Lcom/anthropic/claude/app/ClaudeAppOverlay$FeedbackSheet;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/anthropic/claude/app/ClaudeAppOverlay$FeedbackSheet;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getInitialScreenshotUri", "Companion", "com/anthropic/claude/app/v0", "com/anthropic/claude/app/w0", "app"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class FeedbackSheet implements ClaudeAppOverlay {
        public static final int $stable = 0;
        public static final w0 Companion = new w0();
        private final String initialScreenshotUri;

        public /* synthetic */ FeedbackSheet(int i, String str, vnf vnfVar) {
            if ((i & 1) == 0) {
                this.initialScreenshotUri = null;
            } else {
                this.initialScreenshotUri = str;
            }
        }

        public static /* synthetic */ FeedbackSheet copy$default(FeedbackSheet feedbackSheet, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = feedbackSheet.initialScreenshotUri;
            }
            return feedbackSheet.copy(str);
        }

        public static final /* synthetic */ void write$Self$app(FeedbackSheet self, vd4 output, SerialDescriptor serialDesc) {
            if (!output.E(serialDesc) && self.initialScreenshotUri == null) {
                return;
            }
            output.B(serialDesc, 0, srg.a, self.initialScreenshotUri);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getInitialScreenshotUri() {
            return this.initialScreenshotUri;
        }

        public final FeedbackSheet copy(String initialScreenshotUri) {
            return new FeedbackSheet(initialScreenshotUri);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FeedbackSheet) && x44.r(this.initialScreenshotUri, ((FeedbackSheet) other).initialScreenshotUri);
        }

        @Override // com.anthropic.claude.app.ClaudeAppOverlay, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        public final String getInitialScreenshotUri() {
            return this.initialScreenshotUri;
        }

        public int hashCode() {
            String str = this.initialScreenshotUri;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return ij0.j("FeedbackSheet(initialScreenshotUri=", this.initialScreenshotUri, ")");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public FeedbackSheet() {
            this((String) null, 1, (mq5) (0 == true ? 1 : 0));
        }

        public FeedbackSheet(String str) {
            this.initialScreenshotUri = str;
        }

        public /* synthetic */ FeedbackSheet(String str, int i, mq5 mq5Var) {
            this((i & 1) != 0 ? null : str);
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015¨\u0006'"}, d2 = {"Lcom/anthropic/claude/app/ClaudeAppOverlay$ArtifactFullScreen;", "Lcom/anthropic/claude/app/ClaudeAppOverlay;", "Lcom/anthropic/claude/artifact/details/ArtifactFullScreenParams;", "params", "<init>", "(Lcom/anthropic/claude/artifact/details/ArtifactFullScreenParams;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/artifact/details/ArtifactFullScreenParams;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$app", "(Lcom/anthropic/claude/app/ClaudeAppOverlay$ArtifactFullScreen;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/artifact/details/ArtifactFullScreenParams;", "copy", "(Lcom/anthropic/claude/artifact/details/ArtifactFullScreenParams;)Lcom/anthropic/claude/app/ClaudeAppOverlay$ArtifactFullScreen;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/artifact/details/ArtifactFullScreenParams;", "getParams", "Companion", "com/anthropic/claude/app/o0", "com/anthropic/claude/app/p0", "app"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class ArtifactFullScreen implements ClaudeAppOverlay {
        public static final int $stable = 0;
        private final ArtifactFullScreenParams params;
        public static final p0 Companion = new p0();
        private static final kw9[] $childSerializers = {yb5.w(w1a.F, new gi3(5))};

        public /* synthetic */ ArtifactFullScreen(int i, ArtifactFullScreenParams artifactFullScreenParams, vnf vnfVar) {
            if (1 == (i & 1)) {
                this.params = artifactFullScreenParams;
            } else {
                gvj.f(i, 1, o0.a.getDescriptor());
                throw null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return ArtifactFullScreenParams.Companion.serializer();
        }

        public static /* synthetic */ ArtifactFullScreen copy$default(ArtifactFullScreen artifactFullScreen, ArtifactFullScreenParams artifactFullScreenParams, int i, Object obj) {
            if ((i & 1) != 0) {
                artifactFullScreenParams = artifactFullScreen.params;
            }
            return artifactFullScreen.copy(artifactFullScreenParams);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ArtifactFullScreenParams getParams() {
            return this.params;
        }

        public final ArtifactFullScreen copy(ArtifactFullScreenParams params) {
            params.getClass();
            return new ArtifactFullScreen(params);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ArtifactFullScreen) && x44.r(this.params, ((ArtifactFullScreen) other).params);
        }

        @Override // com.anthropic.claude.app.ClaudeAppOverlay, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        public final ArtifactFullScreenParams getParams() {
            return this.params;
        }

        public int hashCode() {
            return this.params.hashCode();
        }

        public String toString() {
            return "ArtifactFullScreen(params=" + this.params + ")";
        }

        public ArtifactFullScreen(ArtifactFullScreenParams artifactFullScreenParams) {
            artifactFullScreenParams.getClass();
            this.params = artifactFullScreenParams;
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#$B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0015¨\u0006%"}, d2 = {"Lcom/anthropic/claude/app/ClaudeAppOverlay$ExperienceSpotlightSheet;", "Lcom/anthropic/claude/app/ClaudeAppOverlay;", "", "experienceId", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$app", "(Lcom/anthropic/claude/app/ClaudeAppOverlay$ExperienceSpotlightSheet;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/anthropic/claude/app/ClaudeAppOverlay$ExperienceSpotlightSheet;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getExperienceId", "Companion", "com/anthropic/claude/app/t0", "com/anthropic/claude/app/u0", "app"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class ExperienceSpotlightSheet implements ClaudeAppOverlay {
        public static final int $stable = 0;
        public static final u0 Companion = new u0();
        private final String experienceId;

        public /* synthetic */ ExperienceSpotlightSheet(int i, String str, vnf vnfVar) {
            if (1 == (i & 1)) {
                this.experienceId = str;
            } else {
                gvj.f(i, 1, t0.a.getDescriptor());
                throw null;
            }
        }

        public static /* synthetic */ ExperienceSpotlightSheet copy$default(ExperienceSpotlightSheet experienceSpotlightSheet, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = experienceSpotlightSheet.experienceId;
            }
            return experienceSpotlightSheet.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getExperienceId() {
            return this.experienceId;
        }

        public final ExperienceSpotlightSheet copy(String experienceId) {
            experienceId.getClass();
            return new ExperienceSpotlightSheet(experienceId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ExperienceSpotlightSheet) && x44.r(this.experienceId, ((ExperienceSpotlightSheet) other).experienceId);
        }

        @Override // com.anthropic.claude.app.ClaudeAppOverlay, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        public final String getExperienceId() {
            return this.experienceId;
        }

        public int hashCode() {
            return this.experienceId.hashCode();
        }

        public String toString() {
            return ij0.j("ExperienceSpotlightSheet(experienceId=", this.experienceId, ")");
        }

        public ExperienceSpotlightSheet(String str) {
            str.getClass();
            this.experienceId = str;
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015¨\u0006'"}, d2 = {"Lcom/anthropic/claude/app/ClaudeAppOverlay$GroveNoticeBottomSheet;", "Lcom/anthropic/claude/app/ClaudeAppOverlay;", "Lcom/anthropic/claude/analytics/events/GroveEvents$GroveLocation;", "location", "<init>", "(Lcom/anthropic/claude/analytics/events/GroveEvents$GroveLocation;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/analytics/events/GroveEvents$GroveLocation;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$app", "(Lcom/anthropic/claude/app/ClaudeAppOverlay$GroveNoticeBottomSheet;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/analytics/events/GroveEvents$GroveLocation;", "copy", "(Lcom/anthropic/claude/analytics/events/GroveEvents$GroveLocation;)Lcom/anthropic/claude/app/ClaudeAppOverlay$GroveNoticeBottomSheet;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/analytics/events/GroveEvents$GroveLocation;", "getLocation", "Companion", "com/anthropic/claude/app/x0", "com/anthropic/claude/app/y0", "app"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class GroveNoticeBottomSheet implements ClaudeAppOverlay {
        public static final int $stable = 0;
        private final GroveEvents$GroveLocation location;
        public static final y0 Companion = new y0();
        private static final kw9[] $childSerializers = {yb5.w(w1a.F, new gi3(6))};

        public /* synthetic */ GroveNoticeBottomSheet(int i, GroveEvents$GroveLocation groveEvents$GroveLocation, vnf vnfVar) {
            if (1 == (i & 1)) {
                this.location = groveEvents$GroveLocation;
            } else {
                gvj.f(i, 1, x0.a.getDescriptor());
                throw null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return GroveEvents$GroveLocation.Companion.serializer();
        }

        public static /* synthetic */ GroveNoticeBottomSheet copy$default(GroveNoticeBottomSheet groveNoticeBottomSheet, GroveEvents$GroveLocation groveEvents$GroveLocation, int i, Object obj) {
            if ((i & 1) != 0) {
                groveEvents$GroveLocation = groveNoticeBottomSheet.location;
            }
            return groveNoticeBottomSheet.copy(groveEvents$GroveLocation);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final GroveEvents$GroveLocation getLocation() {
            return this.location;
        }

        public final GroveNoticeBottomSheet copy(GroveEvents$GroveLocation location) {
            location.getClass();
            return new GroveNoticeBottomSheet(location);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof GroveNoticeBottomSheet) && this.location == ((GroveNoticeBottomSheet) other).location;
        }

        @Override // com.anthropic.claude.app.ClaudeAppOverlay, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        public final GroveEvents$GroveLocation getLocation() {
            return this.location;
        }

        public int hashCode() {
            return this.location.hashCode();
        }

        public String toString() {
            return "GroveNoticeBottomSheet(location=" + this.location + ")";
        }

        public GroveNoticeBottomSheet(GroveEvents$GroveLocation groveEvents$GroveLocation) {
            groveEvents$GroveLocation.getClass();
            this.location = groveEvents$GroveLocation;
        }
    }

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 &2\u00020\u00012\u00020\u0002:\u0002'(B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B%\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0017\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0016J\u0010\u0010\u001d\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b%\u0010\u0016¨\u0006)"}, d2 = {"Lcom/anthropic/claude/app/ClaudeAppOverlay$ImageGalleryFullScreen;", "Lcom/anthropic/claude/app/ClaudeAppOverlay;", "Lj2g;", "Lcom/anthropic/claude/api/chat/tool/ImageGalleryItemId;", "initialSelectedId", "<init>", "(Ljava/lang/String;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$app", "(Lcom/anthropic/claude/app/ClaudeAppOverlay$ImageGalleryFullScreen;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-ivCCbqw", "()Ljava/lang/String;", "component1", "copy-GDc12LQ", "(Ljava/lang/String;)Lcom/anthropic/claude/app/ClaudeAppOverlay$ImageGalleryFullScreen;", "copy", "", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getInitialSelectedId-ivCCbqw", "Companion", "com/anthropic/claude/app/z0", "com/anthropic/claude/app/a1", "app"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class ImageGalleryFullScreen implements ClaudeAppOverlay, j2g {
        public static final int $stable = 0;
        public static final a1 Companion = new a1();
        private final String initialSelectedId;

        private /* synthetic */ ImageGalleryFullScreen(int i, String str, vnf vnfVar) {
            if (1 == (i & 1)) {
                this.initialSelectedId = str;
            } else {
                gvj.f(i, 1, z0.a.getDescriptor());
                throw null;
            }
        }

        /* JADX INFO: renamed from: copy-GDc12LQ$default, reason: not valid java name */
        public static /* synthetic */ ImageGalleryFullScreen m481copyGDc12LQ$default(ImageGalleryFullScreen imageGalleryFullScreen, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = imageGalleryFullScreen.initialSelectedId;
            }
            return imageGalleryFullScreen.m483copyGDc12LQ(str);
        }

        /* JADX INFO: renamed from: component1-ivCCbqw, reason: not valid java name and from getter */
        public final String getInitialSelectedId() {
            return this.initialSelectedId;
        }

        /* JADX INFO: renamed from: copy-GDc12LQ, reason: not valid java name */
        public final ImageGalleryFullScreen m483copyGDc12LQ(String initialSelectedId) {
            initialSelectedId.getClass();
            return new ImageGalleryFullScreen(initialSelectedId, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ImageGalleryFullScreen) && ImageGalleryItemId.m307equalsimpl0(this.initialSelectedId, ((ImageGalleryFullScreen) other).initialSelectedId);
        }

        @Override // com.anthropic.claude.app.ClaudeAppOverlay, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        /* JADX INFO: renamed from: getInitialSelectedId-ivCCbqw, reason: not valid java name */
        public final String m484getInitialSelectedIdivCCbqw() {
            return this.initialSelectedId;
        }

        public int hashCode() {
            return ImageGalleryItemId.m308hashCodeimpl(this.initialSelectedId);
        }

        public String toString() {
            return ij0.j("ImageGalleryFullScreen(initialSelectedId=", ImageGalleryItemId.m309toStringimpl(this.initialSelectedId), ")");
        }

        public /* synthetic */ ImageGalleryFullScreen(String str, mq5 mq5Var) {
            this(str);
        }

        public /* synthetic */ ImageGalleryFullScreen(int i, String str, vnf vnfVar, mq5 mq5Var) {
            this(i, str, vnfVar);
        }

        private ImageGalleryFullScreen(String str) {
            str.getClass();
            this.initialSelectedId = str;
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&'B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J\u0010\u0010\u001c\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0015¨\u0006("}, d2 = {"Lcom/anthropic/claude/app/ClaudeAppOverlay$SharedChatFullScreen;", "Lcom/anthropic/claude/app/ClaudeAppOverlay;", "Lcom/anthropic/claude/types/strings/ChatSnapshotId;", "snapshotId", "<init>", "(Ljava/lang/String;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$app", "(Lcom/anthropic/claude/app/ClaudeAppOverlay$SharedChatFullScreen;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-N1vkeFQ", "()Ljava/lang/String;", "component1", "copy-vjAUBZk", "(Ljava/lang/String;)Lcom/anthropic/claude/app/ClaudeAppOverlay$SharedChatFullScreen;", "copy", "", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSnapshotId-N1vkeFQ", "Companion", "com/anthropic/claude/app/d1", "com/anthropic/claude/app/e1", "app"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class SharedChatFullScreen implements ClaudeAppOverlay {
        public static final int $stable = 0;
        public static final e1 Companion = new e1();
        private final String snapshotId;

        private /* synthetic */ SharedChatFullScreen(int i, String str, vnf vnfVar) {
            if (1 == (i & 1)) {
                this.snapshotId = str;
            } else {
                gvj.f(i, 1, d1.a.getDescriptor());
                throw null;
            }
        }

        /* JADX INFO: renamed from: copy-vjAUBZk$default, reason: not valid java name */
        public static /* synthetic */ SharedChatFullScreen m489copyvjAUBZk$default(SharedChatFullScreen sharedChatFullScreen, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = sharedChatFullScreen.snapshotId;
            }
            return sharedChatFullScreen.m491copyvjAUBZk(str);
        }

        /* JADX INFO: renamed from: component1-N1vkeFQ, reason: not valid java name and from getter */
        public final String getSnapshotId() {
            return this.snapshotId;
        }

        /* JADX INFO: renamed from: copy-vjAUBZk, reason: not valid java name */
        public final SharedChatFullScreen m491copyvjAUBZk(String snapshotId) {
            snapshotId.getClass();
            return new SharedChatFullScreen(snapshotId, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SharedChatFullScreen) && ChatSnapshotId.m988equalsimpl0(this.snapshotId, ((SharedChatFullScreen) other).snapshotId);
        }

        @Override // com.anthropic.claude.app.ClaudeAppOverlay, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        /* JADX INFO: renamed from: getSnapshotId-N1vkeFQ, reason: not valid java name */
        public final String m492getSnapshotIdN1vkeFQ() {
            return this.snapshotId;
        }

        public int hashCode() {
            return ChatSnapshotId.m989hashCodeimpl(this.snapshotId);
        }

        public String toString() {
            return ij0.j("SharedChatFullScreen(snapshotId=", ChatSnapshotId.m990toStringimpl(this.snapshotId), ")");
        }

        public /* synthetic */ SharedChatFullScreen(String str, mq5 mq5Var) {
            this(str);
        }

        public /* synthetic */ SharedChatFullScreen(int i, String str, vnf vnfVar, mq5 mq5Var) {
            this(i, str, vnfVar);
        }

        private SharedChatFullScreen(String str) {
            str.getClass();
            this.snapshotId = str;
        }
    }

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/0B)\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ2\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\u001bJ\u0010\u0010\"\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b-\u0010\u001b¨\u00061"}, d2 = {"Lcom/anthropic/claude/app/ClaudeAppOverlay$UpgradeToProBottomSheet;", "Lcom/anthropic/claude/app/ClaudeAppOverlay;", "Lfji;", "subtitle", "", "initialPromptAfterUpgrade", "Lcom/anthropic/claude/types/strings/ModelId;", "modelIdToSelectAfterUpgrade", "<init>", "(Lfji;Ljava/lang/String;Ljava/lang/String;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILfji;Ljava/lang/String;Ljava/lang/String;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$app", "(Lcom/anthropic/claude/app/ClaudeAppOverlay$UpgradeToProBottomSheet;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lfji;", "component2", "()Ljava/lang/String;", "component3-a6HIKFk", "component3", "copy-ad0IpJQ", "(Lfji;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/app/ClaudeAppOverlay$UpgradeToProBottomSheet;", "copy", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lfji;", "getSubtitle", "Ljava/lang/String;", "getInitialPromptAfterUpgrade", "getModelIdToSelectAfterUpgrade-a6HIKFk", "Companion", "com/anthropic/claude/app/f1", "com/anthropic/claude/app/g1", "app"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class UpgradeToProBottomSheet implements ClaudeAppOverlay {
        public static final int $stable = 0;
        private final String initialPromptAfterUpgrade;
        private final String modelIdToSelectAfterUpgrade;
        private final fji subtitle;
        public static final g1 Companion = new g1();
        private static final kw9[] $childSerializers = {yb5.w(w1a.F, new gi3(7)), null, null};

        private /* synthetic */ UpgradeToProBottomSheet(int i, fji fjiVar, String str, String str2, vnf vnfVar) {
            this.subtitle = (i & 1) == 0 ? fji.E : fjiVar;
            if ((i & 2) == 0) {
                this.initialPromptAfterUpgrade = null;
            } else {
                this.initialPromptAfterUpgrade = str;
            }
            if ((i & 4) == 0) {
                this.modelIdToSelectAfterUpgrade = null;
            } else {
                this.modelIdToSelectAfterUpgrade = str2;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final KSerializer _childSerializers$_anonymous_() {
            fji[] fjiVarArrValues = fji.values();
            fjiVarArrValues.getClass();
            return new lq6("com.anthropic.claude.pro.upgrade.UpgradeSubscriptionScreenSubtitle", (Enum[]) fjiVarArrValues);
        }

        /* JADX INFO: renamed from: copy-ad0IpJQ$default, reason: not valid java name */
        public static /* synthetic */ UpgradeToProBottomSheet m493copyad0IpJQ$default(UpgradeToProBottomSheet upgradeToProBottomSheet, fji fjiVar, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                fjiVar = upgradeToProBottomSheet.subtitle;
            }
            if ((i & 2) != 0) {
                str = upgradeToProBottomSheet.initialPromptAfterUpgrade;
            }
            if ((i & 4) != 0) {
                str2 = upgradeToProBottomSheet.modelIdToSelectAfterUpgrade;
            }
            return upgradeToProBottomSheet.m495copyad0IpJQ(fjiVar, str, str2);
        }

        public static final /* synthetic */ void write$Self$app(UpgradeToProBottomSheet self, vd4 output, SerialDescriptor serialDesc) {
            kw9[] kw9VarArr = $childSerializers;
            if (output.E(serialDesc) || self.subtitle != fji.E) {
                output.r(serialDesc, 0, (znf) kw9VarArr[0].getValue(), self.subtitle);
            }
            if (output.E(serialDesc) || self.initialPromptAfterUpgrade != null) {
                output.B(serialDesc, 1, srg.a, self.initialPromptAfterUpgrade);
            }
            if (!output.E(serialDesc) && self.modelIdToSelectAfterUpgrade == null) {
                return;
            }
            vnb vnbVar = vnb.a;
            String str = self.modelIdToSelectAfterUpgrade;
            output.B(serialDesc, 2, vnbVar, str != null ? ModelId.m1058boximpl(str) : null);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final fji getSubtitle() {
            return this.subtitle;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getInitialPromptAfterUpgrade() {
            return this.initialPromptAfterUpgrade;
        }

        /* JADX INFO: renamed from: component3-a6HIKFk, reason: not valid java name and from getter */
        public final String getModelIdToSelectAfterUpgrade() {
            return this.modelIdToSelectAfterUpgrade;
        }

        /* JADX INFO: renamed from: copy-ad0IpJQ, reason: not valid java name */
        public final UpgradeToProBottomSheet m495copyad0IpJQ(fji subtitle, String initialPromptAfterUpgrade, String modelIdToSelectAfterUpgrade) {
            subtitle.getClass();
            return new UpgradeToProBottomSheet(subtitle, initialPromptAfterUpgrade, modelIdToSelectAfterUpgrade, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0028  */
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
                boolean r1 = r5 instanceof com.anthropic.claude.app.ClaudeAppOverlay.UpgradeToProBottomSheet
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                com.anthropic.claude.app.ClaudeAppOverlay$UpgradeToProBottomSheet r5 = (com.anthropic.claude.app.ClaudeAppOverlay.UpgradeToProBottomSheet) r5
                fji r1 = r4.subtitle
                fji r3 = r5.subtitle
                if (r1 == r3) goto L13
                return r2
            L13:
                java.lang.String r1 = r4.initialPromptAfterUpgrade
                java.lang.String r3 = r5.initialPromptAfterUpgrade
                boolean r1 = defpackage.x44.r(r1, r3)
                if (r1 != 0) goto L1e
                return r2
            L1e:
                java.lang.String r4 = r4.modelIdToSelectAfterUpgrade
                java.lang.String r5 = r5.modelIdToSelectAfterUpgrade
                if (r4 != 0) goto L2a
                if (r5 != 0) goto L28
                r4 = r0
                goto L31
            L28:
                r4 = r2
                goto L31
            L2a:
                if (r5 != 0) goto L2d
                goto L28
            L2d:
                boolean r4 = com.anthropic.claude.types.strings.ModelId.m1061equalsimpl0(r4, r5)
            L31:
                if (r4 != 0) goto L34
                return r2
            L34:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.app.ClaudeAppOverlay.UpgradeToProBottomSheet.equals(java.lang.Object):boolean");
        }

        @Override // com.anthropic.claude.app.ClaudeAppOverlay, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        public final String getInitialPromptAfterUpgrade() {
            return this.initialPromptAfterUpgrade;
        }

        /* JADX INFO: renamed from: getModelIdToSelectAfterUpgrade-a6HIKFk, reason: not valid java name */
        public final String m496getModelIdToSelectAfterUpgradea6HIKFk() {
            return this.modelIdToSelectAfterUpgrade;
        }

        public final fji getSubtitle() {
            return this.subtitle;
        }

        public int hashCode() {
            int iHashCode = this.subtitle.hashCode() * 31;
            String str = this.initialPromptAfterUpgrade;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.modelIdToSelectAfterUpgrade;
            return iHashCode2 + (str2 != null ? ModelId.m1062hashCodeimpl(str2) : 0);
        }

        public String toString() {
            fji fjiVar = this.subtitle;
            String str = this.initialPromptAfterUpgrade;
            String str2 = this.modelIdToSelectAfterUpgrade;
            String strM1063toStringimpl = str2 == null ? "null" : ModelId.m1063toStringimpl(str2);
            StringBuilder sb = new StringBuilder("UpgradeToProBottomSheet(subtitle=");
            sb.append(fjiVar);
            sb.append(", initialPromptAfterUpgrade=");
            sb.append(str);
            sb.append(", modelIdToSelectAfterUpgrade=");
            return ij0.m(sb, strM1063toStringimpl, ")");
        }

        public /* synthetic */ UpgradeToProBottomSheet(fji fjiVar, String str, String str2, mq5 mq5Var) {
            this(fjiVar, str, str2);
        }

        public /* synthetic */ UpgradeToProBottomSheet(int i, fji fjiVar, String str, String str2, vnf vnfVar, mq5 mq5Var) {
            this(i, fjiVar, str, str2, vnfVar);
        }

        private UpgradeToProBottomSheet(fji fjiVar, String str, String str2) {
            fjiVar.getClass();
            this.subtitle = fjiVar;
            this.initialPromptAfterUpgrade = str;
            this.modelIdToSelectAfterUpgrade = str2;
        }

        public /* synthetic */ UpgradeToProBottomSheet(fji fjiVar, String str, String str2, int i, mq5 mq5Var) {
            this((i & 1) != 0 ? fji.E : fjiVar, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, null);
        }
    }

    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000234B6\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0019\u0010\t\u001a\u00150\u0004j\u0002`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rB9\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010\u001e\u001a\u00150\u0004j\u0002`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b \u0010\u001dJC\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u001b\b\u0002\u0010\t\u001a\u00150\u0004j\u0002`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u001dJ\u0010\u0010&\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001dR*\u0010\t\u001a\u00150\u0004j\u0002`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b0\u0010\u001fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010-\u001a\u0004\b1\u0010\u001d¨\u00065"}, d2 = {"Lcom/anthropic/claude/app/ClaudeAppOverlay$MemoryPreview;", "Lcom/anthropic/claude/app/ClaudeAppOverlay;", "", "memorySynthesis", "Ljava/util/Date;", "Lcom/anthropic/claude/api/Iso8601Date;", "Lonf;", "with", "Lpl9;", "updatedAt", "Lcom/anthropic/claude/types/strings/ProjectId;", "projectId", "<init>", "(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/Date;Ljava/lang/String;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$app", "(Lcom/anthropic/claude/app/ClaudeAppOverlay$MemoryPreview;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/Date;", "component3-v-f-JkQ", "component3", "copy-fqfMH5M", "(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)Lcom/anthropic/claude/app/ClaudeAppOverlay$MemoryPreview;", "copy", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMemorySynthesis", "Ljava/util/Date;", "getUpdatedAt", "getProjectId-v-f-JkQ", "Companion", "com/anthropic/claude/app/b1", "com/anthropic/claude/app/c1", "app"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class MemoryPreview implements ClaudeAppOverlay {
        public static final int $stable = 8;
        public static final c1 Companion = new c1();
        private final String memorySynthesis;
        private final String projectId;
        private final Date updatedAt;

        private /* synthetic */ MemoryPreview(int i, String str, Date date, String str2, vnf vnfVar) {
            if (3 != (i & 3)) {
                gvj.f(i, 3, b1.a.getDescriptor());
                throw null;
            }
            this.memorySynthesis = str;
            this.updatedAt = date;
            if ((i & 4) == 0) {
                this.projectId = null;
            } else {
                this.projectId = str2;
            }
        }

        /* JADX INFO: renamed from: copy-fqfMH5M$default, reason: not valid java name */
        public static /* synthetic */ MemoryPreview m485copyfqfMH5M$default(MemoryPreview memoryPreview, String str, Date date, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = memoryPreview.memorySynthesis;
            }
            if ((i & 2) != 0) {
                date = memoryPreview.updatedAt;
            }
            if ((i & 4) != 0) {
                str2 = memoryPreview.projectId;
            }
            return memoryPreview.m487copyfqfMH5M(str, date, str2);
        }

        public static final /* synthetic */ void write$Self$app(MemoryPreview self, vd4 output, SerialDescriptor serialDesc) {
            output.q(serialDesc, 0, self.memorySynthesis);
            output.r(serialDesc, 1, bc9.a, self.updatedAt);
            if (!output.E(serialDesc) && self.projectId == null) {
                return;
            }
            emd emdVar = emd.a;
            String str = self.projectId;
            output.B(serialDesc, 2, emdVar, str != null ? ProjectId.m1079boximpl(str) : null);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getMemorySynthesis() {
            return this.memorySynthesis;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Date getUpdatedAt() {
            return this.updatedAt;
        }

        /* JADX INFO: renamed from: component3-v-f-JkQ, reason: not valid java name and from getter */
        public final String getProjectId() {
            return this.projectId;
        }

        /* JADX INFO: renamed from: copy-fqfMH5M, reason: not valid java name */
        public final MemoryPreview m487copyfqfMH5M(String memorySynthesis, Date updatedAt, String projectId) {
            memorySynthesis.getClass();
            updatedAt.getClass();
            return new MemoryPreview(memorySynthesis, updatedAt, projectId, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x002c  */
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
                boolean r1 = r5 instanceof com.anthropic.claude.app.ClaudeAppOverlay.MemoryPreview
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                com.anthropic.claude.app.ClaudeAppOverlay$MemoryPreview r5 = (com.anthropic.claude.app.ClaudeAppOverlay.MemoryPreview) r5
                java.lang.String r1 = r4.memorySynthesis
                java.lang.String r3 = r5.memorySynthesis
                boolean r1 = defpackage.x44.r(r1, r3)
                if (r1 != 0) goto L17
                return r2
            L17:
                java.util.Date r1 = r4.updatedAt
                java.util.Date r3 = r5.updatedAt
                boolean r1 = defpackage.x44.r(r1, r3)
                if (r1 != 0) goto L22
                return r2
            L22:
                java.lang.String r4 = r4.projectId
                java.lang.String r5 = r5.projectId
                if (r4 != 0) goto L2e
                if (r5 != 0) goto L2c
                r4 = r0
                goto L35
            L2c:
                r4 = r2
                goto L35
            L2e:
                if (r5 != 0) goto L31
                goto L2c
            L31:
                boolean r4 = com.anthropic.claude.types.strings.ProjectId.m1082equalsimpl0(r4, r5)
            L35:
                if (r4 != 0) goto L38
                return r2
            L38:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.app.ClaudeAppOverlay.MemoryPreview.equals(java.lang.Object):boolean");
        }

        @Override // com.anthropic.claude.app.ClaudeAppOverlay, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        public final String getMemorySynthesis() {
            return this.memorySynthesis;
        }

        /* JADX INFO: renamed from: getProjectId-v-f-JkQ, reason: not valid java name */
        public final String m488getProjectIdvfJkQ() {
            return this.projectId;
        }

        public final Date getUpdatedAt() {
            return this.updatedAt;
        }

        public int hashCode() {
            int iJ = ebh.j(this.updatedAt, this.memorySynthesis.hashCode() * 31, 31);
            String str = this.projectId;
            return iJ + (str == null ? 0 : ProjectId.m1083hashCodeimpl(str));
        }

        public String toString() {
            String str = this.memorySynthesis;
            Date date = this.updatedAt;
            String str2 = this.projectId;
            String strM1084toStringimpl = str2 == null ? "null" : ProjectId.m1084toStringimpl(str2);
            StringBuilder sb = new StringBuilder("MemoryPreview(memorySynthesis=");
            sb.append(str);
            sb.append(", updatedAt=");
            sb.append(date);
            sb.append(", projectId=");
            return ij0.m(sb, strM1084toStringimpl, ")");
        }

        public /* synthetic */ MemoryPreview(String str, Date date, String str2, mq5 mq5Var) {
            this(str, date, str2);
        }

        public /* synthetic */ MemoryPreview(int i, String str, Date date, String str2, vnf vnfVar, mq5 mq5Var) {
            this(i, str, date, str2, vnfVar);
        }

        private MemoryPreview(String str, Date date, String str2) {
            str.getClass();
            date.getClass();
            this.memorySynthesis = str;
            this.updatedAt = date;
            this.projectId = str2;
        }

        public /* synthetic */ MemoryPreview(String str, Date date, String str2, int i, mq5 mq5Var) {
            this(str, date, (i & 4) != 0 ? null : str2, null);
        }
    }

    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u0000 =2\u00020\u0001:\u0002>?BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fBU\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b#\u0010\u001fJ\u0010\u0010%\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010(\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b'\u0010\u001fJ\u0012\u0010*\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b)\u0010\u001fJT\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010/\u001a\u00020.HÖ\u0001¢\u0006\u0004\b/\u0010\u001fJ\u0010\u00100\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b0\u00101J\u001a\u00104\u001a\u00020\b2\b\u00103\u001a\u0004\u0018\u000102HÖ\u0003¢\u0006\u0004\b4\u00105R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00106\u001a\u0004\b7\u0010\u001fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\b8\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b9\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010:\u001a\u0004\b\t\u0010&R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b;\u0010\u001fR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u00106\u001a\u0004\b<\u0010\u001f¨\u0006@"}, d2 = {"Lcom/anthropic/claude/app/ClaudeAppOverlay$BellMode;", "Lcom/anthropic/claude/app/ClaudeAppOverlay;", "Lcom/anthropic/claude/types/strings/ChatId;", "chatId", "Lcom/anthropic/claude/types/strings/ProjectId;", "projectId", "Lcom/anthropic/claude/types/strings/ModelId;", "modelId", "", "isTemporary", "Lcom/anthropic/claude/types/strings/ThinkingEffort;", "effort", "Lcom/anthropic/claude/types/strings/ThinkingMode;", "thinkingMode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$app", "(Lcom/anthropic/claude/app/ClaudeAppOverlay$BellMode;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-RjYBDck", "()Ljava/lang/String;", "component1", "component2-v-f-JkQ", "component2", "component3-a6HIKFk", "component3", "component4", "()Z", "component5-_couWBU", "component5", "component6-KLP3kNA", "component6", "copy-DOx5CGM", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/app/ClaudeAppOverlay$BellMode;", "copy", "", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getChatId-RjYBDck", "getProjectId-v-f-JkQ", "getModelId-a6HIKFk", "Z", "getEffort-_couWBU", "getThinkingMode-KLP3kNA", "Companion", "com/anthropic/claude/app/q0", "com/anthropic/claude/app/r0", "app"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class BellMode implements ClaudeAppOverlay {
        public static final int $stable = 0;
        public static final r0 Companion = new r0();
        private final String chatId;
        private final String effort;
        private final boolean isTemporary;
        private final String modelId;
        private final String projectId;
        private final String thinkingMode;

        private /* synthetic */ BellMode(int i, String str, String str2, String str3, boolean z, String str4, String str5, vnf vnfVar) {
            if (15 != (i & 15)) {
                gvj.f(i, 15, q0.a.getDescriptor());
                throw null;
            }
            this.chatId = str;
            this.projectId = str2;
            this.modelId = str3;
            this.isTemporary = z;
            if ((i & 16) == 0) {
                this.effort = null;
            } else {
                this.effort = str4;
            }
            if ((i & 32) == 0) {
                this.thinkingMode = null;
            } else {
                this.thinkingMode = str5;
            }
        }

        /* JADX INFO: renamed from: copy-DOx5CGM$default, reason: not valid java name */
        public static /* synthetic */ BellMode m469copyDOx5CGM$default(BellMode bellMode, String str, String str2, String str3, boolean z, String str4, String str5, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bellMode.chatId;
            }
            if ((i & 2) != 0) {
                str2 = bellMode.projectId;
            }
            if ((i & 4) != 0) {
                str3 = bellMode.modelId;
            }
            if ((i & 8) != 0) {
                z = bellMode.isTemporary;
            }
            if ((i & 16) != 0) {
                str4 = bellMode.effort;
            }
            if ((i & 32) != 0) {
                str5 = bellMode.thinkingMode;
            }
            String str6 = str4;
            String str7 = str5;
            return bellMode.m475copyDOx5CGM(str, str2, str3, z, str6, str7);
        }

        public static final /* synthetic */ void write$Self$app(BellMode self, vd4 output, SerialDescriptor serialDesc) {
            output.r(serialDesc, 0, vs2.a, ChatId.m978boximpl(self.chatId));
            emd emdVar = emd.a;
            String str = self.projectId;
            output.B(serialDesc, 1, emdVar, str != null ? ProjectId.m1079boximpl(str) : null);
            vnb vnbVar = vnb.a;
            String str2 = self.modelId;
            output.B(serialDesc, 2, vnbVar, str2 != null ? ModelId.m1058boximpl(str2) : null);
            output.p(serialDesc, 3, self.isTemporary);
            if (output.E(serialDesc) || self.effort != null) {
                zlh zlhVar = zlh.a;
                String str3 = self.effort;
                output.B(serialDesc, 4, zlhVar, str3 != null ? ThinkingEffort.m1135boximpl(str3) : null);
            }
            if (!output.E(serialDesc) && self.thinkingMode == null) {
                return;
            }
            emh emhVar = emh.a;
            String str4 = self.thinkingMode;
            output.B(serialDesc, 5, emhVar, str4 != null ? ThinkingMode.m1142boximpl(str4) : null);
        }

        /* JADX INFO: renamed from: component1-RjYBDck, reason: not valid java name and from getter */
        public final String getChatId() {
            return this.chatId;
        }

        /* JADX INFO: renamed from: component2-v-f-JkQ, reason: not valid java name and from getter */
        public final String getProjectId() {
            return this.projectId;
        }

        /* JADX INFO: renamed from: component3-a6HIKFk, reason: not valid java name and from getter */
        public final String getModelId() {
            return this.modelId;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getIsTemporary() {
            return this.isTemporary;
        }

        /* JADX INFO: renamed from: component5-_couWBU, reason: not valid java name and from getter */
        public final String getEffort() {
            return this.effort;
        }

        /* JADX INFO: renamed from: component6-KLP3kNA, reason: not valid java name and from getter */
        public final String getThinkingMode() {
            return this.thinkingMode;
        }

        /* JADX INFO: renamed from: copy-DOx5CGM, reason: not valid java name */
        public final BellMode m475copyDOx5CGM(String chatId, String projectId, String modelId, boolean isTemporary, String effort, String thinkingMode) {
            chatId.getClass();
            return new BellMode(chatId, projectId, modelId, isTemporary, effort, thinkingMode, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0054  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x006a  */
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
                boolean r1 = r5 instanceof com.anthropic.claude.app.ClaudeAppOverlay.BellMode
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                com.anthropic.claude.app.ClaudeAppOverlay$BellMode r5 = (com.anthropic.claude.app.ClaudeAppOverlay.BellMode) r5
                java.lang.String r1 = r4.chatId
                java.lang.String r3 = r5.chatId
                boolean r1 = com.anthropic.claude.types.strings.ChatId.m981equalsimpl0(r1, r3)
                if (r1 != 0) goto L17
                return r2
            L17:
                java.lang.String r1 = r4.projectId
                java.lang.String r3 = r5.projectId
                if (r1 != 0) goto L23
                if (r3 != 0) goto L21
                r1 = r0
                goto L2a
            L21:
                r1 = r2
                goto L2a
            L23:
                if (r3 != 0) goto L26
                goto L21
            L26:
                boolean r1 = com.anthropic.claude.types.strings.ProjectId.m1082equalsimpl0(r1, r3)
            L2a:
                if (r1 != 0) goto L2d
                return r2
            L2d:
                java.lang.String r1 = r4.modelId
                java.lang.String r3 = r5.modelId
                if (r1 != 0) goto L39
                if (r3 != 0) goto L37
                r1 = r0
                goto L40
            L37:
                r1 = r2
                goto L40
            L39:
                if (r3 != 0) goto L3c
                goto L37
            L3c:
                boolean r1 = com.anthropic.claude.types.strings.ModelId.m1061equalsimpl0(r1, r3)
            L40:
                if (r1 != 0) goto L43
                return r2
            L43:
                boolean r1 = r4.isTemporary
                boolean r3 = r5.isTemporary
                if (r1 == r3) goto L4a
                return r2
            L4a:
                java.lang.String r1 = r4.effort
                java.lang.String r3 = r5.effort
                if (r1 != 0) goto L56
                if (r3 != 0) goto L54
                r1 = r0
                goto L5d
            L54:
                r1 = r2
                goto L5d
            L56:
                if (r3 != 0) goto L59
                goto L54
            L59:
                boolean r1 = com.anthropic.claude.types.strings.ThinkingEffort.m1138equalsimpl0(r1, r3)
            L5d:
                if (r1 != 0) goto L60
                return r2
            L60:
                java.lang.String r4 = r4.thinkingMode
                java.lang.String r5 = r5.thinkingMode
                if (r4 != 0) goto L6c
                if (r5 != 0) goto L6a
                r4 = r0
                goto L73
            L6a:
                r4 = r2
                goto L73
            L6c:
                if (r5 != 0) goto L6f
                goto L6a
            L6f:
                boolean r4 = com.anthropic.claude.types.strings.ThinkingMode.m1145equalsimpl0(r4, r5)
            L73:
                if (r4 != 0) goto L76
                return r2
            L76:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.app.ClaudeAppOverlay.BellMode.equals(java.lang.Object):boolean");
        }

        @Override // com.anthropic.claude.app.ClaudeAppOverlay, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        /* JADX INFO: renamed from: getChatId-RjYBDck, reason: not valid java name */
        public final String m476getChatIdRjYBDck() {
            return this.chatId;
        }

        /* JADX INFO: renamed from: getEffort-_couWBU, reason: not valid java name */
        public final String m477getEffort_couWBU() {
            return this.effort;
        }

        /* JADX INFO: renamed from: getModelId-a6HIKFk, reason: not valid java name */
        public final String m478getModelIda6HIKFk() {
            return this.modelId;
        }

        /* JADX INFO: renamed from: getProjectId-v-f-JkQ, reason: not valid java name */
        public final String m479getProjectIdvfJkQ() {
            return this.projectId;
        }

        /* JADX INFO: renamed from: getThinkingMode-KLP3kNA, reason: not valid java name */
        public final String m480getThinkingModeKLP3kNA() {
            return this.thinkingMode;
        }

        public int hashCode() {
            int iM982hashCodeimpl = ChatId.m982hashCodeimpl(this.chatId) * 31;
            String str = this.projectId;
            int iM1083hashCodeimpl = (iM982hashCodeimpl + (str == null ? 0 : ProjectId.m1083hashCodeimpl(str))) * 31;
            String str2 = this.modelId;
            int iP = fsh.p((iM1083hashCodeimpl + (str2 == null ? 0 : ModelId.m1062hashCodeimpl(str2))) * 31, 31, this.isTemporary);
            String str3 = this.effort;
            int iM1139hashCodeimpl = (iP + (str3 == null ? 0 : ThinkingEffort.m1139hashCodeimpl(str3))) * 31;
            String str4 = this.thinkingMode;
            return iM1139hashCodeimpl + (str4 != null ? ThinkingMode.m1146hashCodeimpl(str4) : 0);
        }

        public final boolean isTemporary() {
            return this.isTemporary;
        }

        public String toString() {
            String strM983toStringimpl = ChatId.m983toStringimpl(this.chatId);
            String str = this.projectId;
            String strM1084toStringimpl = str == null ? "null" : ProjectId.m1084toStringimpl(str);
            String str2 = this.modelId;
            String strM1063toStringimpl = str2 == null ? "null" : ModelId.m1063toStringimpl(str2);
            boolean z = this.isTemporary;
            String str3 = this.effort;
            String strM1140toStringimpl = str3 == null ? "null" : ThinkingEffort.m1140toStringimpl(str3);
            String str4 = this.thinkingMode;
            String strM1148toStringimpl = str4 != null ? ThinkingMode.m1148toStringimpl(str4) : "null";
            StringBuilder sbR = kgh.r("BellMode(chatId=", strM983toStringimpl, ", projectId=", strM1084toStringimpl, ", modelId=");
            gid.t(sbR, strM1063toStringimpl, ", isTemporary=", z, ", effort=");
            return vb7.t(sbR, strM1140toStringimpl, ", thinkingMode=", strM1148toStringimpl, ")");
        }

        public /* synthetic */ BellMode(String str, String str2, String str3, boolean z, String str4, String str5, mq5 mq5Var) {
            this(str, str2, str3, z, str4, str5);
        }

        public /* synthetic */ BellMode(int i, String str, String str2, String str3, boolean z, String str4, String str5, vnf vnfVar, mq5 mq5Var) {
            this(i, str, str2, str3, z, str4, str5, vnfVar);
        }

        private BellMode(String str, String str2, String str3, boolean z, String str4, String str5) {
            str.getClass();
            this.chatId = str;
            this.projectId = str2;
            this.modelId = str3;
            this.isTemporary = z;
            this.effort = str4;
            this.thinkingMode = str5;
        }

        public /* synthetic */ BellMode(String str, String str2, String str3, boolean z, String str4, String str5, int i, mq5 mq5Var) {
            this(str, str2, str3, z, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, null);
        }
    }
}
