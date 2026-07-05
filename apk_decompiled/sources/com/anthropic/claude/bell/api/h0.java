package com.anthropic.claude.bell.api;

import com.anthropic.claude.bell.api.BellApiServerMessage;
import defpackage.jce;
import defpackage.kce;
import defpackage.lq6;
import defpackage.odf;
import defpackage.pl9;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class h0 {
    public static final /* synthetic */ h0 a = new h0();

    public final KSerializer serializer() {
        kce kceVar = jce.a;
        return new odf("com.anthropic.claude.bell.api.BellApiServerMessage", kceVar.b(BellApiServerMessage.class), new pl9[]{kceVar.b(BellApiServerMessage.Error.class), kceVar.b(BellApiServerMessage.MessageComplete.class), kceVar.b(BellApiServerMessage.MessageSse.class), kceVar.b(BellApiServerMessage.PlaybackEnd.class), kceVar.b(BellApiServerMessage.PlaybackStart.class), kceVar.b(BellApiServerMessage.ServerInterrupt.class), kceVar.b(BellApiServerMessage.SessionServerConfig.class), kceVar.b(BellApiServerMessage.SessionServerInitialized.class), kceVar.b(BellApiServerMessage.TTSWord.class), kceVar.b(BellApiServerMessage.TranscriptEmpty.class), kceVar.b(BellApiServerMessage.TranscriptInterim.class), kceVar.b(BellApiServerMessage.TranscriptionStart.class), kceVar.b(BellApiServerMessage.Unknown.class), kceVar.b(BellApiServerMessage.UserInputEnd.class)}, new KSerializer[]{i0.a, k0.a, o0.a, new lq6("playback_end", BellApiServerMessage.PlaybackEnd.INSTANCE, new Annotation[]{new j()}), s0.a, new lq6("server_interrupt", BellApiServerMessage.ServerInterrupt.INSTANCE, new Annotation[]{new j()}), u0.a, new lq6("session_server_initialized", BellApiServerMessage.SessionServerInitialized.INSTANCE, new Annotation[]{new j()}), w0.a, new lq6("transcript_empty", BellApiServerMessage.TranscriptEmpty.INSTANCE, new Annotation[]{new j()}), y0.a, new lq6("transcription_start", BellApiServerMessage.TranscriptionStart.INSTANCE, new Annotation[]{new j()}), new lq6("unknown", BellApiServerMessage.Unknown.INSTANCE, new Annotation[]{new j()}), new lq6("user_input_end", BellApiServerMessage.UserInputEnd.INSTANCE, new Annotation[]{new j()})}, new Annotation[]{new j()});
    }
}
