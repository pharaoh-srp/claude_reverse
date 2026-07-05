package com.anthropic.claude.bell.api;

import com.anthropic.claude.bell.api.BellApiClientMessage;
import defpackage.jce;
import defpackage.kce;
import defpackage.lq6;
import defpackage.odf;
import defpackage.pl9;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class i {
    public static final /* synthetic */ i a = new i();

    public final KSerializer serializer() {
        kce kceVar = jce.a;
        return new odf("com.anthropic.claude.bell.api.BellApiClientMessage", kceVar.b(BellApiClientMessage.class), new pl9[]{kceVar.b(BellApiClientMessage.AttachmentFlowEnd.class), kceVar.b(BellApiClientMessage.AttachmentFlowStart.class), kceVar.b(BellApiClientMessage.ClientMetrics.class), kceVar.b(BellApiClientMessage.Interrupt.class), kceVar.b(BellApiClientMessage.ManualInputEnd.class), kceVar.b(BellApiClientMessage.PauseEndpointing.class), kceVar.b(BellApiClientMessage.PlaybackComplete.class), kceVar.b(BellApiClientMessage.ToolsRegister.class), kceVar.b(BellApiClientMessage.UnpauseEndpointing.class), kceVar.b(BellApiClientMessage.VoiceSelect.class)}, new KSerializer[]{a.a, new lq6("attachment_flow_start", BellApiClientMessage.AttachmentFlowStart.INSTANCE, new Annotation[]{new j()}), e.a, new lq6("interrupt", BellApiClientMessage.Interrupt.INSTANCE, new Annotation[]{new j()}), new lq6("manual_input_end", BellApiClientMessage.ManualInputEnd.INSTANCE, new Annotation[]{new j()}), k.a, new lq6("playback_complete", BellApiClientMessage.PlaybackComplete.INSTANCE, new Annotation[]{new j()}), o.a, new lq6("unpause_endpointing", BellApiClientMessage.UnpauseEndpointing.INSTANCE, new Annotation[]{new j()}), s.a}, new Annotation[]{new j()});
    }
}
