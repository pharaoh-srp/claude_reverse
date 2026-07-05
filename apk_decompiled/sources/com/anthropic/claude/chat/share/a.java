package com.anthropic.claude.chat.share;

import com.anthropic.claude.chat.share.SharedChatModalBottomSheetDestination;
import defpackage.jce;
import defpackage.kce;
import defpackage.lq6;
import defpackage.odf;
import defpackage.pl9;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class a {
    public static final /* synthetic */ a a = new a();

    public final KSerializer serializer() {
        kce kceVar = jce.a;
        return new odf("com.anthropic.claude.chat.share.SharedChatModalBottomSheetDestination", kceVar.b(SharedChatModalBottomSheetDestination.class), new pl9[]{kceVar.b(SharedChatModalBottomSheetDestination.Closed.class), kceVar.b(SharedChatModalBottomSheetDestination.PreviewLink.class), kceVar.b(SharedChatModalBottomSheetDestination.ViewCollapsedTools.class), kceVar.b(SharedChatModalBottomSheetDestination.ViewCombinedSources.class), kceVar.b(SharedChatModalBottomSheetDestination.ViewSources.class)}, new KSerializer[]{new lq6("com.anthropic.claude.chat.share.SharedChatModalBottomSheetDestination.Closed", SharedChatModalBottomSheetDestination.Closed.INSTANCE, new Annotation[0]), b.a, d.a, f.a, h.a}, new Annotation[0]);
    }
}
