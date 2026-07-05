package com.anthropic.claude.tool.ui.chat;

import com.anthropic.claude.tool.ui.chat.PhoneCallSheetDestination;
import defpackage.jce;
import defpackage.kce;
import defpackage.lq6;
import defpackage.odf;
import defpackage.pl9;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public static final /* synthetic */ b a = new b();

    public final KSerializer serializer() {
        kce kceVar = jce.a;
        return new odf("com.anthropic.claude.tool.ui.chat.PhoneCallSheetDestination", kceVar.b(PhoneCallSheetDestination.class), new pl9[]{kceVar.b(PhoneCallSheetDestination.Closed.class), kceVar.b(PhoneCallSheetDestination.Transcript.class)}, new KSerializer[]{new lq6("com.anthropic.claude.tool.ui.chat.PhoneCallSheetDestination.Closed", PhoneCallSheetDestination.Closed.INSTANCE, new Annotation[0]), new lq6("com.anthropic.claude.tool.ui.chat.PhoneCallSheetDestination.Transcript", PhoneCallSheetDestination.Transcript.INSTANCE, new Annotation[0])}, new Annotation[0]);
    }
}
