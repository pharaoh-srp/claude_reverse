package com.anthropic.claude.chat.bottomsheet.model;

import com.anthropic.claude.chat.bottomsheet.model.ModelSelectorBottomSheetDestination;
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
        return new odf("com.anthropic.claude.chat.bottomsheet.model.ModelSelectorBottomSheetDestination", kceVar.b(ModelSelectorBottomSheetDestination.class), new pl9[]{kceVar.b(ModelSelectorBottomSheetDestination.Closed.class), kceVar.b(ModelSelectorBottomSheetDestination.MoreModels.class), kceVar.b(ModelSelectorBottomSheetDestination.SelectEffort.class), kceVar.b(ModelSelectorBottomSheetDestination.SelectModel.class)}, new KSerializer[]{new lq6("com.anthropic.claude.chat.bottomsheet.model.ModelSelectorBottomSheetDestination.Closed", ModelSelectorBottomSheetDestination.Closed.INSTANCE, new Annotation[0]), new lq6("com.anthropic.claude.chat.bottomsheet.model.ModelSelectorBottomSheetDestination.MoreModels", ModelSelectorBottomSheetDestination.MoreModels.INSTANCE, new Annotation[0]), new lq6("com.anthropic.claude.chat.bottomsheet.model.ModelSelectorBottomSheetDestination.SelectEffort", ModelSelectorBottomSheetDestination.SelectEffort.INSTANCE, new Annotation[0]), new lq6("com.anthropic.claude.chat.bottomsheet.model.ModelSelectorBottomSheetDestination.SelectModel", ModelSelectorBottomSheetDestination.SelectModel.INSTANCE, new Annotation[0])}, new Annotation[0]);
    }
}
