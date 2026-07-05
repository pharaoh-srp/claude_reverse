package com.anthropic.claude.chat.menu;

import com.anthropic.claude.chat.menu.ChatItemMenuDialogDestination;
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
        return new odf("com.anthropic.claude.chat.menu.ChatItemMenuDialogDestination", kceVar.b(ChatItemMenuDialogDestination.class), new pl9[]{kceVar.b(ChatItemMenuDialogDestination.ChangeProject.class), kceVar.b(ChatItemMenuDialogDestination.Delete.class), kceVar.b(ChatItemMenuDialogDestination.Dismissed.class), kceVar.b(ChatItemMenuDialogDestination.Rename.class)}, new KSerializer[]{new lq6("com.anthropic.claude.chat.menu.ChatItemMenuDialogDestination.ChangeProject", ChatItemMenuDialogDestination.ChangeProject.INSTANCE, new Annotation[0]), new lq6("com.anthropic.claude.chat.menu.ChatItemMenuDialogDestination.Delete", ChatItemMenuDialogDestination.Delete.INSTANCE, new Annotation[0]), new lq6("com.anthropic.claude.chat.menu.ChatItemMenuDialogDestination.Dismissed", ChatItemMenuDialogDestination.Dismissed.INSTANCE, new Annotation[0]), new lq6("com.anthropic.claude.chat.menu.ChatItemMenuDialogDestination.Rename", ChatItemMenuDialogDestination.Rename.INSTANCE, new Annotation[0])}, new Annotation[0]);
    }
}
