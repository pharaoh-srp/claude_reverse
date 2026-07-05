package com.anthropic.claude.app;

import com.anthropic.claude.app.ClaudeAppOverlay;
import defpackage.jce;
import defpackage.kce;
import defpackage.lq6;
import defpackage.odf;
import defpackage.pl9;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class s0 {
    public static final /* synthetic */ s0 a = new s0();

    public final KSerializer serializer() {
        kce kceVar = jce.a;
        return new odf("com.anthropic.claude.app.ClaudeAppOverlay", kceVar.b(ClaudeAppOverlay.class), new pl9[]{kceVar.b(ClaudeAppOverlay.ArtifactFullScreen.class), kceVar.b(ClaudeAppOverlay.BellMode.class), kceVar.b(ClaudeAppOverlay.CreateEnvironment.class), kceVar.b(ClaudeAppOverlay.CreateProject.class), kceVar.b(ClaudeAppOverlay.ExperienceSpotlightSheet.class), kceVar.b(ClaudeAppOverlay.FeedbackSheet.class), kceVar.b(ClaudeAppOverlay.GroveNoticeBottomSheet.class), kceVar.b(ClaudeAppOverlay.ImageGalleryFullScreen.class), kceVar.b(ClaudeAppOverlay.MemoryPreview.class), kceVar.b(ClaudeAppOverlay.None.class), kceVar.b(ClaudeAppOverlay.SharedChatFullScreen.class), kceVar.b(ClaudeAppOverlay.UpgradeToProBottomSheet.class), kceVar.b(ClaudeAppOverlay.VoiceSettings.class)}, new KSerializer[]{o0.a, q0.a, new lq6("com.anthropic.claude.app.ClaudeAppOverlay.CreateEnvironment", ClaudeAppOverlay.CreateEnvironment.INSTANCE, new Annotation[0]), new lq6("com.anthropic.claude.app.ClaudeAppOverlay.CreateProject", ClaudeAppOverlay.CreateProject.INSTANCE, new Annotation[0]), t0.a, v0.a, x0.a, z0.a, b1.a, new lq6("com.anthropic.claude.app.ClaudeAppOverlay.None", ClaudeAppOverlay.None.INSTANCE, new Annotation[0]), d1.a, f1.a, new lq6("com.anthropic.claude.app.ClaudeAppOverlay.VoiceSettings", ClaudeAppOverlay.VoiceSettings.INSTANCE, new Annotation[0])}, new Annotation[0]);
    }
}
