package com.anthropic.claude.chat.dialogs;

import com.anthropic.claude.chat.dialogs.ChatScreenDialog;
import defpackage.jce;
import defpackage.kce;
import defpackage.lq6;
import defpackage.odf;
import defpackage.pl9;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final /* synthetic */ a a = new a();

    public final KSerializer serializer() {
        kce kceVar = jce.a;
        return new odf("com.anthropic.claude.chat.dialogs.ChatScreenDialog", kceVar.b(ChatScreenDialog.class), new pl9[]{kceVar.b(ChatScreenDialog.Delete.class), kceVar.b(ChatScreenDialog.Dismissed.class), kceVar.b(ChatScreenDialog.Rename.class), kceVar.b(ChatScreenDialog.ShareArtifact.class), kceVar.b(ChatScreenDialog.StopResearch.class), kceVar.b(ChatScreenDialog.VoiceShortcut.class)}, new KSerializer[]{new lq6("com.anthropic.claude.chat.dialogs.ChatScreenDialog.Delete", ChatScreenDialog.Delete.INSTANCE, new Annotation[0]), new lq6("com.anthropic.claude.chat.dialogs.ChatScreenDialog.Dismissed", ChatScreenDialog.Dismissed.INSTANCE, new Annotation[0]), new lq6("com.anthropic.claude.chat.dialogs.ChatScreenDialog.Rename", ChatScreenDialog.Rename.INSTANCE, new Annotation[0]), b.a, new lq6("com.anthropic.claude.chat.dialogs.ChatScreenDialog.StopResearch", ChatScreenDialog.StopResearch.INSTANCE, new Annotation[0]), new lq6("com.anthropic.claude.chat.dialogs.ChatScreenDialog.VoiceShortcut", ChatScreenDialog.VoiceShortcut.INSTANCE, new Annotation[0])}, new Annotation[0]);
    }
}
