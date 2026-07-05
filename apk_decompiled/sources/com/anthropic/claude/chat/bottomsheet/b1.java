package com.anthropic.claude.chat.bottomsheet;

import com.anthropic.claude.chat.bottomsheet.CollapsedToolsSheetDestination;
import defpackage.jce;
import defpackage.kce;
import defpackage.lq6;
import defpackage.odf;
import defpackage.pl9;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class b1 {
    public static final /* synthetic */ b1 a = new b1();

    public final KSerializer serializer() {
        kce kceVar = jce.a;
        return new odf("com.anthropic.claude.chat.bottomsheet.CollapsedToolsSheetDestination", kceVar.b(CollapsedToolsSheetDestination.class), new pl9[]{kceVar.b(CollapsedToolsSheetDestination.Dismissed.class), kceVar.b(CollapsedToolsSheetDestination.Sources.class), kceVar.b(CollapsedToolsSheetDestination.Summary.class), kceVar.b(CollapsedToolsSheetDestination.Thinking.class), kceVar.b(CollapsedToolsSheetDestination.ToolContent.class)}, new KSerializer[]{new lq6("com.anthropic.claude.chat.bottomsheet.CollapsedToolsSheetDestination.Dismissed", CollapsedToolsSheetDestination.Dismissed.INSTANCE, new Annotation[0]), c1.a, new lq6("com.anthropic.claude.chat.bottomsheet.CollapsedToolsSheetDestination.Summary", CollapsedToolsSheetDestination.Summary.INSTANCE, new Annotation[0]), e1.a, g1.a}, new Annotation[0]);
    }
}
