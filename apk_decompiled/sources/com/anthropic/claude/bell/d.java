package com.anthropic.claude.bell;

import com.anthropic.claude.bell.BellModelSheetDestination;
import defpackage.jce;
import defpackage.kce;
import defpackage.lq6;
import defpackage.odf;
import defpackage.pl9;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class d {
    public static final /* synthetic */ d a = new d();

    public final KSerializer serializer() {
        kce kceVar = jce.a;
        return new odf("com.anthropic.claude.bell.BellModelSheetDestination", kceVar.b(BellModelSheetDestination.class), new pl9[]{kceVar.b(BellModelSheetDestination.Closed.class), kceVar.b(BellModelSheetDestination.MoreModels.class), kceVar.b(BellModelSheetDestination.SelectEffort.class), kceVar.b(BellModelSheetDestination.SelectModel.class)}, new KSerializer[]{new lq6("com.anthropic.claude.bell.BellModelSheetDestination.Closed", BellModelSheetDestination.Closed.INSTANCE, new Annotation[0]), new lq6("com.anthropic.claude.bell.BellModelSheetDestination.MoreModels", BellModelSheetDestination.MoreModels.INSTANCE, new Annotation[0]), new lq6("com.anthropic.claude.bell.BellModelSheetDestination.SelectEffort", BellModelSheetDestination.SelectEffort.INSTANCE, new Annotation[0]), new lq6("com.anthropic.claude.bell.BellModelSheetDestination.SelectModel", BellModelSheetDestination.SelectModel.INSTANCE, new Annotation[0])}, new Annotation[0]);
    }
}
