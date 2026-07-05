package com.anthropic.claude.tool.ui.chat;

import com.anthropic.claude.tool.ui.chat.FormSheetDestination;
import defpackage.jce;
import defpackage.kce;
import defpackage.lq6;
import defpackage.odf;
import defpackage.pl9;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public static final /* synthetic */ a a = new a();

    public final KSerializer serializer() {
        kce kceVar = jce.a;
        return new odf("com.anthropic.claude.tool.ui.chat.FormSheetDestination", kceVar.b(FormSheetDestination.class), new pl9[]{kceVar.b(FormSheetDestination.Closed.class), kceVar.b(FormSheetDestination.FormInput.class)}, new KSerializer[]{new lq6("com.anthropic.claude.tool.ui.chat.FormSheetDestination.Closed", FormSheetDestination.Closed.INSTANCE, new Annotation[0]), new lq6("com.anthropic.claude.tool.ui.chat.FormSheetDestination.FormInput", FormSheetDestination.FormInput.INSTANCE, new Annotation[0])}, new Annotation[0]);
    }
}
