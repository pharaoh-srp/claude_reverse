package com.anthropic.claude.chatlist.all.bottomsheet;

import com.anthropic.claude.chatlist.all.bottomsheet.AllChatsListBottomSheetDestination;
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
        return new odf("com.anthropic.claude.chatlist.all.bottomsheet.AllChatsListBottomSheetDestination", kceVar.b(AllChatsListBottomSheetDestination.class), new pl9[]{kceVar.b(AllChatsListBottomSheetDestination.Closed.class), kceVar.b(AllChatsListBottomSheetDestination.SelectProject.class)}, new KSerializer[]{new lq6("com.anthropic.claude.chatlist.all.bottomsheet.AllChatsListBottomSheetDestination.Closed", AllChatsListBottomSheetDestination.Closed.INSTANCE, new Annotation[0]), new lq6("com.anthropic.claude.chatlist.all.bottomsheet.AllChatsListBottomSheetDestination.SelectProject", AllChatsListBottomSheetDestination.SelectProject.INSTANCE, new Annotation[0])}, new Annotation[0]);
    }
}
