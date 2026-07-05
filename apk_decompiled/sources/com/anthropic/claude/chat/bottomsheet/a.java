package com.anthropic.claude.chat.bottomsheet;

import com.anthropic.claude.chat.bottomsheet.ChatScreenArtifactSheetDestination;
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
        return new odf("com.anthropic.claude.chat.bottomsheet.ChatScreenArtifactSheetDestination", kceVar.b(ChatScreenArtifactSheetDestination.class), new pl9[]{kceVar.b(ChatScreenArtifactSheetDestination.Closed.class), kceVar.b(ChatScreenArtifactSheetDestination.ViewAnalysis.class), kceVar.b(ChatScreenArtifactSheetDestination.ViewArtifact.class)}, new KSerializer[]{new lq6("com.anthropic.claude.chat.bottomsheet.ChatScreenArtifactSheetDestination.Closed", ChatScreenArtifactSheetDestination.Closed.INSTANCE, new Annotation[0]), b.a, d.a}, new Annotation[0]);
    }
}
