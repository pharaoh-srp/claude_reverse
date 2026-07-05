package com.anthropic.claude.bell;

import com.anthropic.claude.bell.BellOverlayDestination;
import defpackage.jce;
import defpackage.kce;
import defpackage.lq6;
import defpackage.odf;
import defpackage.pl9;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class e {
    public static final /* synthetic */ e a = new e();

    public final KSerializer serializer() {
        kce kceVar = jce.a;
        return new odf("com.anthropic.claude.bell.BellOverlayDestination", kceVar.b(BellOverlayDestination.class), new pl9[]{kceVar.b(BellOverlayDestination.Closed.class), kceVar.b(BellOverlayDestination.Settings.class), kceVar.b(BellOverlayDestination.ToolApproval.class), kceVar.b(BellOverlayDestination.ViewAllSources.class)}, new KSerializer[]{new lq6("com.anthropic.claude.bell.BellOverlayDestination.Closed", BellOverlayDestination.Closed.INSTANCE, new Annotation[0]), new lq6("com.anthropic.claude.bell.BellOverlayDestination.Settings", BellOverlayDestination.Settings.INSTANCE, new Annotation[0]), f.a, h.a}, new Annotation[0]);
    }
}
